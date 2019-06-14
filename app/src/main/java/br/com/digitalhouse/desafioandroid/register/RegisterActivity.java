package br.com.digitalhouse.desafioandroid.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.desafioandroid.R;
import br.com.digitalhouse.desafioandroid.listarestaurantes.view.ListaRestaurantesActivity;

public class RegisterActivity extends AppCompatActivity {
    private Button btnRegister1;
    private TextInputLayout textInputLayoutName;
    private TextInputLayout textInputLayoutEmail1;
    private TextInputLayout textInputLayoutPassword1;
    private TextInputLayout textInputLayoutRepeatPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, ListaRestaurantesActivity.class);
                startActivity(intent);
            }
        });
    }


    private void initViews(){
        btnRegister1 = findViewById(R.id.btnRegister1);
        textInputLayoutName = findViewById(R.id.textInputLayoutName);
        textInputLayoutEmail1 = findViewById(R.id.textInputLayoutEmail1);
        textInputLayoutPassword1 = findViewById(R.id.textInputLayoutPassword1);
        textInputLayoutRepeatPassword = findViewById(R.id.textInputLayoutRepeatPassword);
    }

    private void validateAndGoToMain(){
        String name = textInputLayoutName.getEditText().getText().toString();
        String email = textInputLayoutEmail1.getEditText().getText().toString();
        String password = textInputLayoutPassword1.getEditText().getText().toString();
        String repeatPassword = textInputLayoutRepeatPassword.getEditText().getText().toString();

        if(name.isEmpty()){
            textInputLayoutName.setError("Nome não pode ser vazio!");
            return;
        }

        if(email.isEmpty()){
            textInputLayoutEmail1.setError("Email não pode ser vazio!");
            return;
        }

        if(password.isEmpty()){
            textInputLayoutPassword1.setError("Senha não pode ser vazia!");
            return;
        }

        if(repeatPassword.isEmpty() || repeatPassword != password){
            textInputLayoutRepeatPassword.setError("Senha diferente da senha digitada!");
            return;
        }

        if(name != null && email != null && password != null && repeatPassword != null){
            Intent intent = new Intent(RegisterActivity.this,ListaRestaurantesActivity.class);
            startActivity(intent);
        }else{
            Snackbar.make(textInputLayoutName, "Informações digitadas inválidas", Snackbar.LENGTH_SHORT);
        }
    }
}
