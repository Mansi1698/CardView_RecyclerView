package com.example.mansi.cardview_recyclerview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private List<person> contactList;
   private Context context;
    public ProductAdapter(Context context,List<person> contactList) {
        this.context=context;
        this.contactList = contactList;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_layout, null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return holder;    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        person person =contactList.get(position);
        holder.t1.setText(person.getName());
        holder.t2.setText(person.getContact());
        holder.img.setImageDrawable(context.getResources().getDrawable(person.getImage()));



    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView img;
        public ProductViewHolder(View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.textViewName);
            t2= itemView.findViewById(R.id.textViewVersion);
            img= itemView.findViewById(R.id.imageView);
        }
    }
}
