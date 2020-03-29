package id.ac.polinema.dapurku.ui.minuman;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import id.ac.polinema.dapurku.R;

public class MinumanFragment extends Fragment {

    private MinumanViewModel MinumanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MinumanViewModel =
                ViewModelProviders.of(this).get(MinumanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_minuman, container, false);
        final TextView textView = root.findViewById(R.id.text_minuman);
        MinumanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
