package com.numerica98.laboratorio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBoton_action;
    private TextView mText;
    private EditText mUser, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBoton_action = findViewById(R.id.boton_click);
        mText = findViewById(R.id.texto);
        mUser = findViewById(R.id.editText_username);
        mPassword = findViewById(R.id.editText_password);

        mBoton_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText(mUser.getText());
            }
        });

    }
}
