package com.david0926.edcansummer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.david0926.edcansummer.databinding.RowMemoBinding;

import java.util.ArrayList;
import java.util.List;

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.MemoHolder> {

    private List<MemoModel> list = new ArrayList<>();
    private OnItemClickListener onItemClickListener;
    private OnItemLongClickListener onItemLongClickListener;

    public interface OnItemClickListener{
        void onItemClick(View view, MemoModel item);
    }

    public interface OnItemLongClickListener{
        boolean onItemLongClick(View view, MemoModel item);
    }

    void setItem(List<MemoModel> list){
        this.list = list;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener){
        this.onItemLongClickListener = onItemLongClickListener;
    }

    @NonNull
    @Override
    public MemoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MemoHolder(RowMemoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MemoHolder holder, int position) {
        MemoModel model = list.get(position);
        holder.bind(model, onItemClickListener, onItemLongClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class MemoHolder extends RecyclerView.ViewHolder {

        private RowMemoBinding binding;

        public MemoHolder(RowMemoBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(MemoModel model, OnItemClickListener clickListener, OnItemLongClickListener longClickListener) {
            binding.setMemo(model);
            itemView.setOnClickListener(view -> clickListener.onItemClick(view, model));
            itemView.setOnLongClickListener(view -> longClickListener.onItemLongClick(view, model));
        }
    }

}