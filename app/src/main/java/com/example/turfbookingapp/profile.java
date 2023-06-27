package com.example.turfbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetContentView(R.layout.profile);

        RecyclerView TurfRV = findViewById(R.id.RVTurf);

        // Here, we have created new array list and added data to it
        ArrayList<TurfModel> courseModelArrayList = new ArrayList<TurfModel>();
        courseModelArrayList.add(new TurfModel("V Square Turf ","Mogappair East","9424246534", R.drawable.hattrick_chhani, 4.5F, "RS 1100/Hour"));
        courseModelArrayList.add(new TurfModel("Soccer Nation Football Turf ", "Madipakkam", "9424465356",R.drawable.turf_sevasi, 4.5F, "RS 1200/Hour"));
        courseModelArrayList.add(new TurfModel("Ss Sports Turf ", "Maraimalai Nagar","9264246534", R.drawable.eclipse_sports_alkapuri, 4.8f, "RS 1000/Hour"));
        courseModelArrayList.add(new TurfModel("Game On ", "Egmore", "9224256534",R.drawable.delta_gorwa, 4.6F, "RS 900/Hour"));
        courseModelArrayList.add(new TurfModel("Rush", "Royapuram","9824346534",R.drawable.huddle_arena_vasna, 4.9f, "RS 1150/Hour"));
        courseModelArrayList.add(new TurfModel("HotFut SPR City ", "Perambur", "9994246534",R.drawable.gameplex_arena_subhanpura, 4.4f, "RS 950/Hour"));
        courseModelArrayList.add(new TurfModel("MMC Football grounds ", "Park Town","9447896534", R.drawable.super_sports_park_gorwa, 4.4f, "RS 1250/Hour"));

        // we are initializing our adapter class and passing our arraylist to it.
        TurfAdapter courseAdapter = new TurfAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        TurfRV.setLayoutManager(linearLayoutManager);
        TurfRV.setAdapter(courseAdapter);

    }

    private void SetContentView(int activity_main2) {
    }
}