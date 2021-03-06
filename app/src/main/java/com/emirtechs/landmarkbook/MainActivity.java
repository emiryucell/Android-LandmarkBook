package com.emirtechs.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.emirtechs.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);
        Landmark colloseum = new Landmark("Colloseum", "Italy", R.drawable.colleseum);
        Landmark londonBridge = new Landmark("London Bridge", "UK", R.drawable.londonbridge);
        Landmark machu = new Landmark("Machu Picchu", "Peru", R.drawable.machu);
        Landmark mahal = new Landmark("Taj Mahal", "Indian", R.drawable.mahal);
        Landmark petra = new Landmark("Petra", "Jordan", R.drawable.petra);
        Landmark pyramid = new Landmark("Great Pyramid", "Egypt", R.drawable.pyramid);
        Landmark ben = new Landmark("Big Ben", "UK", R.drawable.ben);


        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colloseum);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(machu);
        landmarkArrayList.add(mahal);
        landmarkArrayList.add(petra);
        landmarkArrayList.add(pyramid);
        landmarkArrayList.add(ben);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}