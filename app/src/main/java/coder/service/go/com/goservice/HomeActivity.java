package coder.service.go.com.goservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void kategoriA(View view) {
        Intent i = new Intent(HomeActivity.this, ProviderListActivity.class);
        startActivity(i);
    }
}
