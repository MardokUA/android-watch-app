package com.igorganapolsky.vibratingwatchapp.util;

import android.support.v7.util.DiffUtil;
import com.igorganapolsky.vibratingwatchapp.domain.model.TimerModel;

import java.util.List;

public class TimerDiffCallback extends DiffUtil.Callback {

    private List<TimerModel> oldModelList;
    private List<TimerModel> newModelList;

    public TimerDiffCallback(List<TimerModel> oldModelList, List<TimerModel> newModelList) {
        this.oldModelList = oldModelList;
        this.newModelList = newModelList;
    }

    @Override
    public int getOldListSize() {
        return oldModelList.size();
    }

    @Override
    public int getNewListSize() {
        return newModelList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldModelList.get(oldItemPosition).getId() == newModelList.get(newItemPosition).getId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldModelList.get(oldItemPosition).getState() == newModelList.get(newItemPosition).getState() &&
            oldModelList.get(oldItemPosition).getBuzz() == newModelList.get(newItemPosition).getBuzz() &&
            oldModelList.get(oldItemPosition).getHoursLeft() == newModelList.get(newItemPosition).getHoursLeft() &&
            oldModelList.get(oldItemPosition).getHoursTotal() == newModelList.get(newItemPosition).getHoursTotal() &&
            oldModelList.get(oldItemPosition).getMinutesLeft() == newModelList.get(newItemPosition).getMinutesLeft() &&
            oldModelList.get(oldItemPosition).getMinutesTotal() == newModelList.get(newItemPosition).getMinutesTotal() &&
            oldModelList.get(oldItemPosition).getSecondsLeft() == newModelList.get(newItemPosition).getSecondsLeft() &&
            oldModelList.get(oldItemPosition).getSecondsTotal() == newModelList.get(newItemPosition).getSecondsTotal() &&
            oldModelList.get(oldItemPosition).getRepeat() == newModelList.get(newItemPosition).getRepeat();
    }
}
