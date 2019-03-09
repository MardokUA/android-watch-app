package com.igorganapolsky.vibratingwatchapp.ui.timersettings;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SwipeRestrictViewPager extends ViewPager {

    private boolean isSwipeAvailable = false;

    public SwipeRestrictViewPager(@NonNull Context context) {
        super(context);
    }

    public SwipeRestrictViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return isSwipeAvailable && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return isSwipeAvailable && super.onInterceptTouchEvent(event);
    }

    public void setIsSwipeAvailable(boolean isSwipeAvailable) {
        this.isSwipeAvailable = isSwipeAvailable;
    }
}
