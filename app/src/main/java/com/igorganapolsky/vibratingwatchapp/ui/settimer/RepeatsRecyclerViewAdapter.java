package com.igorganapolsky.vibratingwatchapp.ui.settimer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.igorganapolsky.vibratingwatchapp.R;

import java.util.Locale;

public class RepeatsRecyclerViewAdapter extends RecyclerView.Adapter<RepeatsRecyclerViewAdapter.RepeatsRecyclerViewHolder> {
    private String[] repeats = {"1", "2", "3", "4", "5"};

    public RepeatsRecyclerViewAdapter() {
        setHasStableIds(true);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public RepeatsRecyclerViewAdapter.RepeatsRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.set_timer_repeats_item, viewGroup, false);

        return new RepeatsRecyclerViewAdapter.RepeatsRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RepeatsRecyclerViewAdapter.RepeatsRecyclerViewHolder repeatsRecyclerViewHolder, int index) {
        repeatsRecyclerViewHolder.setLabel(repeats[index]);
    }

    @Override
    public int getItemCount() {
        return repeats.length;
    }

    static class RepeatsRecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView tvLabel;

        RepeatsRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            tvLabel = itemView.findViewById(R.id.label);
        }

        void setLabel(String label) {
            tvLabel.setText(label);
        }
    }
}

