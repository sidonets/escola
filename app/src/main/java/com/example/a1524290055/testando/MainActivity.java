package com.example.a1524290055.testando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mostraMensagem(View parametro){
        Toast.makeText(this, "TESTE DE TEXTO NO TOAST", Toast.LENGTH_LONG).show();
    }
}
