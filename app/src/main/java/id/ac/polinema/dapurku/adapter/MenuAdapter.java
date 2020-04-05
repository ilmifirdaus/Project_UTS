package id.ac.polinema.dapurku.adapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.activity.DetailActivity;
import id.ac.polinema.dapurku.model.ModelResep;

public class MenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<ModelResep> dataModelArrayList;
    private Activity activity;

    public MenuAdapter(Activity activity, ArrayList<ModelResep> dataModelArrayList) {
        this.activity = activity;
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_item, parent, false);
        viewHolder = new ItemHolder(v);
        return viewHolder;
    }

    public static class ItemHolder extends RecyclerView.ViewHolder {

        public TextView txtJudul;

        public ItemHolder(View view) {
            super(view);
            txtJudul = view.findViewById(R.id.txtJudul);
        }
    }
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {

        if (getItem(position).getViewType() == 1) {
            ItemHolder holder = (ItemHolder) viewHolder;
            holder.txtJudul.setText(getItem(position).getJudul());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {
                    Intent intent = new Intent(activity, DetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("dataModel", getItem(position));
                    intent.putExtras(bundle);
                    activity.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemViewType(int position) {
        return dataModelArrayList.get(position).getViewType();
    }

    public ModelResep getItem(int position) {
        return dataModelArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }
}