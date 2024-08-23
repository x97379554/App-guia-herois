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
        superHeroList.add(new Model_infoH("Superman", "O último filho de Krypton, com força sobre-humana, velocidade e visão de calor.",
                "https://i.pinimg.com/564x/d1/91/1b/d1911b32feadc94c6ab42774e62f2c3e.jpg"));
        superHeroList.add(new Model_infoH("Batman", "O Cavaleiro das Trevas, um detetive habilidoso e mestre em artes marciais."
                ,"https://i.pinimg.com/564x/dd/4d/94/dd4d9411ad45e852664428b87ea288aa.jpg"));
        superHeroList.add(new Model_infoH("Mulher-Maravilha", "Princesa amazona com habilidades divinas, incluindo força, velocidade e imortalidade."
                ,"https://i.pinimg.com/564x/7b/3c/9f/7b3c9f0ba8671c59f82e371970e0f996.jpg"));
        superHeroList.add(new Model_infoH("Lanterna Verde", "Portador do anel de poder, capaz de criar construções com sua mente."
                ,"https://i.pinimg.com/564x/20/60/ee/2060ee99c35a599ae4af2ee56c4f1121.jpg"));
        superHeroList.add(new Model_infoH("Flash", "O homem mais rápido do mundo, com velocidade sobre-humana e habilidade de atravessar dimensões."
                ,"https://i.pinimg.com/564x/28/03/f0/2803f035e129342cf6403d6e77b097ea.jpg"));
        superHeroList.add(new Model_infoH("Aquaman", "Rei de Atlântida, com força, resistência e controle sobre criaturas marinhas."
                ,"https://i.pinimg.com/564x/04/63/11/046311b2499d59a35484ff9afd8ccb33.jpg"));
        superHeroList.add(new Model_infoH("Caçador de Marte", "J’onn J’onzz, com habilidades telepáticas e capacidade de mudar de forma."
                ,"https://i.pinimg.com/564x/89/47/8c/89478c4436ab4c5443d06d85d96d5191.jpg"));
        superHeroList.add(new Model_infoH("Mulher-Gavião", "Shayera Hol, com asas, habilidades de voo e conexão com o místico Nth Metal."
                ,"https://i.pinimg.com/564x/b7/68/c7/b768c777b186a5e6e06d08fd5d45458d.jpg"));


        setupRecyclerView();
    }
    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recycler_h);
        adapterH = new AdapterH(superHeroList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterH);
    }
}