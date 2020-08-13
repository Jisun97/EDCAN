package com.david0926.edcansummer;

import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class BindingOptions {

    @BindingAdapter("memoItem")
    public static void bindMemoItem(RecyclerView recyclerView, ObservableArrayList<MemoModel> items){
        MemoAdapter adapter = (MemoAdapter) recyclerView.getAdapter();
        if(adapter!=null) adapter.setItem(items);
    }

}
