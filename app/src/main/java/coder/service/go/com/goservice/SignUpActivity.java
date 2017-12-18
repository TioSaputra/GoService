package coder.service.go.com.goservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.nio.CharBuffer;

import coder.service.go.com.goservice.model.User;

public class SignUpActivity extends AppCompatActivity {

    EditText nametxt;
    EditText emailtxt;
    EditText passwordtxt;
    Button sign_upbtn;

    User user;

    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Getting all View
        nametxt = (EditText) findViewById(R.id.firstname);
        emailtxt = (EditText) findViewById(R.id.email);
        passwordtxt = (EditText) findViewById(R.id.password);
        sign_upbtn = (Button) findViewById(R.id.sign_up);

        // Initialize Firebase
        myRef = FirebaseDatabase.getInstance().getReference();


        sign_upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nametxt.getText().toString();
                String email = emailtxt.getText().toString();
                String password = passwordtxt.getText().toString();

                // Bagusnya di generate
                String id= "003";
                user = new User(name, email);
                try {
                    myRef.child("users").child(id).setValue(user);
                    Intent y = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(y);
                }catch (Exception e){
                    System.out.println("Cek :" + e);
                }

            }
        });
    }
    private void writeNewUser(String userId, String name, String email) {


    }

    private String generateId(String satu, String dua){
        String hasil = "";
        satu = satu.substring(1,3);
        dua = dua.substring(2, 5);
        hasil = satu + dua;
        return hasil;
    }
}
