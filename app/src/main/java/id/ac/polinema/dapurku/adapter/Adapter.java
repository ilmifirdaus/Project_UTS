package id.ac.polinema.dapurku.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.dapurku.R;
import id.ac.polinema.dapurku.model.DataResep;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private Context context;
    private List<DataResep> items;

    public Adapter(List<DataResep> items){
            this.context=context;
            this.items=items;
            }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
            View view= LayoutInflater.from(context)
            .inflate(R.layout.item_grid,parent,false);
            return new Adapter.ViewHolder(view);
            }

        @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder,int position){
            DataResep item=items.get(position);
            Picasso.get().load(item.getImage()).into(holder.logoImage);
            holder.nameText.setText(item.getJudul());
            }

    @Override
    public int getItemCount(){
            return(items!=null)?items.size():0;
            }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
