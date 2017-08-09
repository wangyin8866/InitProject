package com.wyman.wangyin.myapplication.ui.more;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wyman.wangyin.myapplication.R;

/**
 * Created by wangyin on 2017/8/9.
 */

public class FindFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_more_main,container,false);
        return view;
    }
}
