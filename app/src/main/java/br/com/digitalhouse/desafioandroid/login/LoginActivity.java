package br.com.digitalhouse.desafioandroid.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.desafioandroid.R;
import br.com.digitalhouse.desafioandroid.listacardapio.view.ListaCardapioActivity;
import br.com.digitalhouse.desafioandroid.listarestaurantes.view.ListaRestaurantesActivity;
import br.com.digitalhouse.desafioandroid.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    btnLogin = findViewById(R.id.btnLogin);
    btnRegister = findViewById(R.id.btnRegister);

    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this, ListaRestaurantesActivity.class);
            startActivity(intent);
        }
    });

    btnRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    });

    }


}
