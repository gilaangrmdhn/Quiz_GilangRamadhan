package com.f5511934.quiz_gilangramadhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.f5511934.quiz_gilangramadhan.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_main);

        //datagilang
        binding.imgPhoto1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.gilang));
        binding.txtName1.setText("Gilang Ramadhan");
        binding.txtDescription1.setText("Halo, Perkenalkan nama saya Gilang Ramadhan stambuk F55119134");
        // Data
        binding.imgPhoto2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.medic));
        binding.txtName2.setText("Logo Medic");
        binding.txtDescription2.setText("Halo, ini merupakan logo medic");
    }
}