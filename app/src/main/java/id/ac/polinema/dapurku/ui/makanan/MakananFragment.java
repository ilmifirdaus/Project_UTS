package id.ac.polinema.dapurku.ui.makanan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.adapter.Adapter;
import id.ac.polinema.dapurku.model.DataResep;

public class MakananFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<DataResep> teams = new ArrayList<>();
        teams.add(new DataResep("Ayam Panggang", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Ayam_goreng_in_Jakarta.JPG/272px-Ayam_goreng_in_Jakarta.JPG"));
        teams.add(new DataResep("Man. City", "https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png"));

        final RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rv_teams);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        final Adapter adapter = new Adapter(teams);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.smoothScrollToPosition(recyclerView.getBottom());
        recyclerView.setAdapter(adapter);
    }
}