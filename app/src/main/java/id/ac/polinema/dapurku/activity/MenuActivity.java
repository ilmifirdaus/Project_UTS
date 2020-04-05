package id.ac.polinema.dapurku.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.adapter.MenuAdapter;
import id.ac.polinema.dapurku.model.ModelResep;

public class MenuActivity extends AppCompatActivity {

    public MenuAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<ModelResep> dataModelArrayList = new ArrayList<ModelResep>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        inputData("Hari 1", "Hari_1.html");
        inputData("Hari 2", "Hari_2.html");
        inputData("Hari 3", "Hari_3.html");
        inputData("Hari 4", "Hari_4.html");
        inputData("Hari 5", "Hari_5.html");
        inputData("Hari 6", "Hari_6.html");
        inputData("Hari 7", "Hari_7.html");
        inputData("Hari 8", "Hari_8.html");
        inputData("Hari 9", "Hari_9.html");
        inputData("Hari 10", "Hari_10.html");
        inputData("Hari 11", "Hari_11.html");
        inputData("Hari 12", "Hari_12.html");
        inputData("Hari 13", "Hari_13.html");
        inputData("Hari 14", "Hari_14.html");
        inputData("Hari 15", "Hari_15.html");
        inputData("Hari 16", "Hari_16.html");
        inputData("Hari 17", "Hari_17.html");
        inputData("Hari 18", "Hari_18.html");
        inputData("Hari 19", "Hari_19.html");
        inputData("Hari 20", "Hari_20.html");
        inputData("Hari 21", "Hari_21.html");
        inputData("Hari 22", "Hari_22.html");
        inputData("Hari 23", "Hari_23.html");
        inputData("Hari 24", "Hari_24.html");
        inputData("Hari 25", "Hari_25.html");
        inputData("Hari 26", "Hari_26.html");
        inputData("Hari 27", "Hari_27.html");
        inputData("Hari 28", "Hari_28.html");
        inputData("Hari 29", "Hari_29.html");
        inputData("Hari 30", "Hari_30.html");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 3);;
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new MenuAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

    }

    //fungsi input
    public void inputData(String judul,String konten){
        ModelResep dataModel = new ModelResep();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }
}
