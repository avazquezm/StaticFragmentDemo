package iam48096227.escoladeltreball.org.staticfragmentdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{


    private EditText editText;
    private Button button;
    private BlankFragment blankFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etMainActivity);
        button = (Button) findViewById(R.id.btnMainActivity);
        blankFragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        setup();


    }

    private void setup() {
        button.setOnClickListener(v -> sendMessage(editText.getText().toString()));
    }

    private void sendMessage(String msg) {
        //lo envia al fragment
        blankFragment.sendMessage(msg);
    }


    @Override
    public void onFragmentInteraction(String msg) {
        //lo recibe del fragment
        editText.setText(msg);

    }
}
