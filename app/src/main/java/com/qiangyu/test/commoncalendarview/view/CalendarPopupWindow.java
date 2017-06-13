package com.qiangyu.test.commoncalendarview.view;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.qiangyu.test.commoncalendarview.utils.DateUtils;

/**
 * Created by linJF on 2017/6/13.
 */

public class CalendarPopupWindow extends PopupWindow {
    private Context context;

    public CalendarPopupWindow(Context context) {
        super(context);
        this.context=context;
        init();
    }

    private void init() {
        CommonCalendarView content=new CommonCalendarView(context);
        setContentView(content);
        content.setMinDate(DateUtils.stringtoDate("1937-01-01","yyyy-MM-dd"));
        content.setMaxDate(DateUtils.stringtoDate("2100-01-22","yyyy-MM-dd"));
        content.init(null);
        setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
    }


}
