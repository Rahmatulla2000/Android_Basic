package com.example.ataptor;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
GridView gridView;
int [] img_array={R.drawable.a,R.drawable.aa,R.drawable.aaa,R.drawable.aaaa,
        R.drawable.aaaaa,R.drawable.aaaaaa,R.drawable.aaaaaaa,R.drawable.aaaaaaaaa,
        R.drawable.aaaaaaaaaaaaaaa,R.drawable.aaaaaaaaaaaaaaaaaaaa};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gridView=findViewById(R.id.gridview);

        MyAdaptor myAdaptor=new MyAdaptor(getApplicationContext(),img_array);
        gridView.setAdapter(myAdaptor);
    }
}