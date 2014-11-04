package ch.zkb.zukunftstag;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class StartActivity extends ActionBarActivity {

    TextView txtSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        txtSample = (TextView) findViewById(R.id.txtSample);
    }

    public void buttonClick(View view) {
        String text = txtSample.getText().toString();
        if (!text.matches("")) {
            Toast.makeText(this, txtSample.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
