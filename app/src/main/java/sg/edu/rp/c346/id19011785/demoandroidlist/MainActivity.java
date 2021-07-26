package sg.edu.rp.c346.id19011785.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView header;
    ListView listV;
    ArrayList<AndroidVersion> al;
    //ArrayAdapter<AndroidVersion> aa;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        header = findViewById(R.id.header);
        listV = findViewById(R.id.listV);
        al = new ArrayList<AndroidVersion>();
        //AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        //al.add(item1);
        al.add(new AndroidVersion("Pie", "9.0"));
        al.add(new AndroidVersion("Oreo","8.0"));
        al.add(new AndroidVersion("Nougat", "7.0"));

        //aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, al);
        adapter = new CustomAdapter(MainActivity.this, R.layout.row, al);
        //listV.setAdapter(aa);
        listV.setAdapter(adapter);

    }
}