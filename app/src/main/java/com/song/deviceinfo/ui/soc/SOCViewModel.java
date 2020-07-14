package com.song.deviceinfo.ui.soc;

import com.song.deviceinfo.info.SOCInfo;
import com.song.deviceinfo.ui.base.NormalViewModel;

import java.util.List;

import androidx.core.util.Pair;

/**
 * Created by chensongsong on 2020/6/8.
 */
public class SOCViewModel extends NormalViewModel {

    public List<Pair<String, String>> getSOCInfo() {
        return SOCInfo.getSOCInfo();
    }
}
