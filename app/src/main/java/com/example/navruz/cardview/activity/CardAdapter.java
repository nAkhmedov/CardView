package com.example.navruz.cardview.activity;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navruz.cardview.R;
import com.example.navruz.cardview.entity.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Navruz on 16.12.2015.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<Item> itemList = new ArrayList<>();
    
    public CardAdapter() {

        Item nature = new Item();
        nature.setName("Akhemedov Navruzbek");
        nature.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam.");
        nature.setnThubNail(R.drawable.urgench);
        itemList.add(nature);

        nature = new Item();
        nature.setName("Khiva");
        nature.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua.");
        nature.setnThubNail(R.drawable.khiva);
        itemList.add(nature);

        nature = new Item();
        nature.setName("Samarkand");
        nature.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis.");
        nature.setnThubNail(R.drawable.samarkand);
        itemList.add(nature);

        nature = new Item();
        nature.setName("Toshkent");
        nature.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam.");
        nature.setnThubNail(R.drawable.tosh);
        itemList.add(nature);


        nature = new Item();
        nature.setName("Qoshko`pir");
        nature.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt" +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.");
        nature.setnThubNail(R.drawable.urgench);
        itemList.add(nature);
    }
    
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.thumbnail.setImageResource(item.getnThubNail());
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView thumbnail;
        public TextView name;
        public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
            name = (TextView) itemView.findViewById(R.id.description);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }
}
