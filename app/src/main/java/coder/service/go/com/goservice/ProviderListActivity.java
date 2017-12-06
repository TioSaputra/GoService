package coder.service.go.com.goservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProviderListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    Intent i;
    String title;
    int image []={R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,
            R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar,R.drawable.avatar};

    String nama[]={"Tio Saputra","Ragil Satrio","Muhammad Aziz","Sandy Hantoro",
            "Anonym","Anonym","Anonym","Anonym","Anonym","Anonym"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_list);

        ListView listview=(ListView)findViewById(R.id.Listview);
        Customadapter customadapter=new Customadapter();
        listview.setAdapter(customadapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                i = new Intent(this, ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title", "Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Tio Saputra");
                i.putExtra("cp", "CP: +62 895-3969-14045");
                startActivity(i);
                break;

            case 1:
                i = new Intent(this, ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title", "Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Ragil Satrio");
                i.putExtra("cp", "CP: +62 896-0260-8573");
                startActivity(i);
                break;

            case 2:
                i = new Intent(this, ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title", "Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Muhammad Aziz");
                i.putExtra("cp", "CP: +62 819-9706-6615");
                startActivity(i);
                break;

            case 3:
                i = new Intent(this, ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title", "Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Sandy Hantoro");
                i.putExtra("cp", "CP: +62 812-7866-8889");
                startActivity(i);
                break;

            case 4:
                i = new Intent(this,ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title","Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Anonym");
                i.putExtra("cp", "CP: +62 812-xxx-xxx");
                startActivity(i);
                break;

            case 5:
                i = new Intent(this,ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title","Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Anonym");
                i.putExtra("cp", "CP: +62 812-xxx-xxx");
                startActivity(i);
                break;

            case 6:
                i = new Intent(this,ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title","Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Anonym");
                i.putExtra("cp", "CP: +62 812-xxx-xxx");
                startActivity(i);
                break;

            case 7:
                i = new Intent(this,ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title","Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Anonym");
                i.putExtra("cp", "CP: +62 812-xxx-xxx");
                startActivity(i);
                break;

            case 8:
                i = new Intent(this,ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title","Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Anonym");
                i.putExtra("cp", "CP: +62 812-xxx-xxx");
                startActivity(i);
                break;

            case 9:
                i = new Intent(this,ProviderDetailActivity.class);
                title = "Profile";
                i.putExtra("title","Profile");
                i.putExtra("gambar", R.drawable.avatar);
                i.putExtra("nama", "Anonym");
                i.putExtra("cp", "CP: +62 812-xxx-xxx");
                startActivity(i);
                break;
        }
    }



    class Customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view =getLayoutInflater().inflate(R.layout.customlayout,null);
            de.hdodenhof.circleimageview.CircleImageView imageView=(de.hdodenhof.circleimageview.CircleImageView)view.findViewById(R.id.imgv);
            TextView names=(TextView)view.findViewById(R.id.tv1);
            imageView.setImageResource(image[i]);
            names.setText(nama[i]);
//          detailss.setText(detail[i]);

            return view;
        }
    }

}