package com.example.androidpart4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.Holder> {

    ArrayList<String> names;
// عملت كونستركتور عشان يعرف يبعت الداتا او عدد الداتا الموجودة دي في الاري
    public NamesAdapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }
//       هي fun هعمل جواها  setText لحاجه وفي حالتنا هنا انا معايا اسامي مش اسم بس
    @Override
    public void onBindViewHolder(@NonNull  Holder holder, int position) {
        String name=names.get(position);// i++
        //set text
        holder.textViewName.setText(name);
    }
        // بتعرف ال size of array
    // adapter هيشتغل علي قد عدد الداتا اللي في الاري
    @Override
    public int getItemCount() {
        return names.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        // بعرف داخل كلاس holder (textview )عشان هاخد منة objects علي قد عدد الداتا اللي عندي
        TextView textViewName;
        public Holder(@NonNull  View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.item_name_tv_name);

        }


}
}

