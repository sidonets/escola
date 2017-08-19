package com.example.a1524290055.testando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void chamarTelaCadastro(View parametro){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
    public void efetuarLogin(View parametro){
        Toast.makeText(this, "Login", Toast.LENGTH_LONG).show();
    }
}
