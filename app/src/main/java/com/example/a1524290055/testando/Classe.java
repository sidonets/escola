package com.example.a1524290055.testando;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by 1524290055 on 18/08/2017.
 */

public class Classe extends RecyclerView.Adapter {

    private Context context;

    private Classe (Context context){this.context = context;}
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
