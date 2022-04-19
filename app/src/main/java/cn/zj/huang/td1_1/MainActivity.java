package cn.zj.huang.td1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText emailTextfield = (EditText)findViewById(R.id.editTextTextEmailAddress);
        EditText passwordTextfield = (EditText)findViewById(R.id.editTextTextPassword);
        String value = "Vos identifiants de connexion sont:\nEmail: "+ emailTextfield.getText().toString()+
                "\nPassword: "+ passwordTextfield.getText().toString();
        new AlertDialog.Builder(this)
                .setTitle("Demande de connexion")
                .setMessage(value)
                .show();
    }
}