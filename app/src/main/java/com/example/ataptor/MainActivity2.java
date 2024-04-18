package com.example.ataptor;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;

    int [] img_arry={R.drawable.a,R.drawable.aa,R.drawable.aaa,R.drawable.aaaa,
            R.drawable.aaaaa,R.drawable.aaaaaa,R.drawable.aaaaaaa,R.drawable.aaaaaaaaa,
            R.drawable.aaaaaaaaaaaaaaa,R.drawable.aaaaaaaaaaaaaaaaaaaa};
    String [] name={"one a","two a","three a","four a","five a","six a","eight a","eihgt + a","ten + a"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView=findViewById(R.id.listview2);

        Adaptor_List_View adaptorListView=new Adaptor_List_View(getApplicationContext(),img_arry,name);
        listView.setAdapter(adaptorListView);

    }
}