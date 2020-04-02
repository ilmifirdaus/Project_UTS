package id.ac.polinema.dapurku.ui.makanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.adapter.Adapter;
import id.ac.polinema.dapurku.model.DataResep;

public class MakananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_makanan);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<DataResep> teams = new ArrayList<>();
        teams.add(new DataResep("Ayam Panggang", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Ayam_goreng_in_Jakarta.JPG/272px-Ayam_goreng_in_Jakarta.JPG"));
//        teams.add(new DataResep("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));

        Adapter adapter = new Adapter(teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);

    }

}