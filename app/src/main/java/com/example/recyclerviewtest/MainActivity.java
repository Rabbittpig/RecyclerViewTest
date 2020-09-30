package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for(int i =0;i<2;i++){
            Fruit apple = new Fruit(getRandomLengthName("Apple"),R.drawable.appele);
//            Fruit apple = new Fruit("Apple",R.drawable.appele);
            fruitList.add(apple);
//            Fruit banana = new Fruit("Banana",R.drawable.banana);
            Fruit banana = new Fruit(getRandomLengthName("Apple"),R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("Apple"),R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("Apple"),R.drawable.xigua);;
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("Apple"),R.drawable.pear);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("Apple"),R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("Apple"),R.drawable.boluo);
            fruitList.add(pineapple);
            Fruit cherry = new Fruit(getRandomLengthName("Apple"),R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLengthName("Apple"),R.drawable.manglo);
            fruitList.add(mango);
            Fruit caomei = new Fruit(getRandomLengthName("Apple"),R.drawable.caomei);
            fruitList.add(caomei);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}