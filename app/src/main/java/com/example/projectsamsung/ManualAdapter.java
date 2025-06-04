package com.example.projectsamsung;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ManualAdapter extends FragmentStateAdapter {
    public ManualAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return(ManualFragment.newInstance(position));
    }

    @Override
    public int getItemCount() {
        return 3;
    }
} 
