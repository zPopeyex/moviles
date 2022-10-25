package com.leonardo.tabsgragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FragmentRead();
            case 1:
                return  new FragmentWrite();
            case 2:
                return new FragmentListen();
            case 3:
                return new FragmentMap();
            default:
                return new FragmentRead();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
