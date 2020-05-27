package com.song.deviceinfo.ui.thermal;

import com.song.deviceinfo.ui.base.BaseAdapter;
import com.song.deviceinfo.ui.base.BaseViewModel;
import com.song.deviceinfo.ui.base.NormalAdapter;
import com.song.deviceinfo.ui.base.NormalFragment;

import androidx.core.util.Pair;
import androidx.lifecycle.ViewModelProviders;

public class ThermalFragment extends NormalFragment<Pair<String, String>> {

    @Override
    protected BaseAdapter crateAdapter() {
        return new NormalAdapter(getContext());
    }

    @Override
    protected BaseViewModel crateViewModel() {
        return ViewModelProviders.of(this).get(ThermalViewModel.class);
    }

}
