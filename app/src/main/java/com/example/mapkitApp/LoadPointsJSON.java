package com.example.mapkitApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mapkitApp.model.mapPoint;
import com.example.yandexmapapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class LoadPointsJSON extends AppCompatActivity {

    TextView textView;
    Button button;
    ArrayList<mapPoint> points = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.results);
        button = findViewById(R.id.buttonFetch);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchData();
            }
        });
    }
    public void fetchData() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject("mapPointsJSON");
            JSONArray mapPoints = jsonObject.getJSONArray("points");
            for(int i = 0; i != mapPoints.length(); i++){
                parseData(points, mapPoints.getJSONObject(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void parseData(ArrayList<mapPoint> points, JSONObject jsonObject) throws JSONException {
        mapPoint point = new mapPoint(jsonObject.getString("coordinates"),
                jsonObject.getString("name"), jsonObject.getString("address"),
                jsonObject.getString("rating"), jsonObject.getString("hours"));
        points.add(point);
    }
}

