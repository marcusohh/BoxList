package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvboxlist;
    ArrayList<BoxItem> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvboxlist = findViewById(R.id.listViewbox);

        alBoxList = new ArrayList<>();

        BoxItem box1 = new BoxItem(true,false,false);
        BoxItem box2 = new BoxItem(false,true,false);
        BoxItem box3 = new BoxItem(false,false,true );
        alBoxList.add(box1);
        alBoxList.add(box2);
        alBoxList.add(box3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBoxList);

        lvboxlist.setAdapter(caBox);
    }
}
