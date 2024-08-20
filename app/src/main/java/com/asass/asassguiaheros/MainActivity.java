package com.asass.asassguiaheros;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //
    private RecyclerView recyclerView;
    private AdapterH adapterH;
    private List<Model_infoH> superHeroList = new ArrayList<>();


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
        list_H();
    }
    private void  list_H(){
        superHeroList.add(new Model_infoH("Superman", "Super Força",
                "https://i.pinimg.com/564x/da/97/38/da9738cd3b41a93dc34bf2177af82ce3.jpg"));

        superHeroList.add(new Model_infoH("Superman", "Super Força",
                "https://i.pinimg.com/564x/da/97/38/da9738cd3b41a93dc34bf2177af82ce3.jpg"));

        superHeroList.add(new Model_infoH("Superman", "Super Força",
                "https://i.pinimg.com/564x/da/97/38/da9738cd3b41a93dc34bf2177af82ce3.jpg"));


        setupRecyclerView();
    }
    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recycler_h);
        adapterH = new AdapterH(superHeroList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterH);
    }
}