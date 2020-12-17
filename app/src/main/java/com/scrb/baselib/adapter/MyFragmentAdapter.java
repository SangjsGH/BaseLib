package com.scrb.baselib.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装fragment适配器
 */
public class MyFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    private FragmentManager fm;

    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fm = fm;
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    public void setFragments(List<Fragment> fragments) {
        List<Fragment> alist = new ArrayList<>();
        alist.addAll(fragments);
        if (fragmentList != null) {
            FragmentTransaction ft = fm.beginTransaction();
            for (Fragment f : fragmentList) {
                ft.remove(f);
            }
            ft.commit();
            ft = null;
            fm.executePendingTransactions();
        }
        fragmentList.clear();
        fragmentList.addAll(alist);
        notifyDataSetChanged();
    }
}
