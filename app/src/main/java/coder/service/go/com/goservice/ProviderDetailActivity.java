package coder.service.go.com.goservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

public class ProviderDetailActivity extends AppCompatActivity {

    de.hdodenhof.circleimageview.CircleImageView Circle;
    CheckBox check1,check2,check3;
    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// untuk toolbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);// untuk toolbar

        String txtTitle = getIntent().getStringExtra("title");//manggil nama label
        this.setTitle(txtTitle);//manggil nama label
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        Intent i = this.getIntent();
        tv1.setText(getIntent().getExtras().getString("nama"));
        tv2.setText(getIntent().getExtras().getString("cp"));
        Circle = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.imgv);
        int image_link = i.getIntExtra("gambar", 0);
        Circle.setImageResource(image_link);
    }

    @Override// untuk pemanggilan back button
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
