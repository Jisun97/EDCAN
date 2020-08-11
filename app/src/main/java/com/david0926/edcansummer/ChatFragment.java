package com.david0926.edcansummer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.david0926.edcansummer.databinding.FragmentChatBinding;
import com.david0926.edcansummer.databinding.FragmentMemoBinding;

public class ChatFragment extends Fragment {

    public static ChatFragment newInstance(){
        return new ChatFragment();
    }

    private Context mContext;
    private FragmentChatBinding binding;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container, false);


        return binding.getRoot();
    }
}
