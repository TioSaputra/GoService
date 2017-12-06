package coder.service.go.com.goservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProviderDetailActivity extends AppCompatActivity {

    de.hdodenhof.circleimageview.CircleImageView Circle;
    TextView tv1;
    TextView tv2;
    String[]Listnama={"Service Kulkas","Service TV","Service Kipas","Service Mesin Cuci",
            "Service Playstation","Service Kipas Angin","Service Rice Coocker",
            "Service AC","Service Sound System"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_detail);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Listnama);
        ListView listview = (ListView) findViewById(R.id.Listview);
        listview.setAdapter(adapter);

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
