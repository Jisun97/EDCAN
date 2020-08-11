package com.david0926.edcansummer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.david0926.edcansummer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.bottomMain.setOnNavigationItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.action_1:
                    switchFragment(MemoFragment.newInstance());
                    break;
                case R.id.action_2:
                    switchFragment(ChatFragment.newInstance());
                    break;
                case R.id.action_3:
                    switchFragment(MoreFragment.newInstance());
                    break;
            }

            return true;
        });

        switchFragment(MemoFragment.newInstance());
    }

    private void switchFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_main, fragment);
        transaction.commit();
    }
}