package com.qiangyu.test.commoncalendarview;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.qiangyu.test.commoncalendarview.view.CalendarPopupWindow;

public class MainActivity extends AppCompatActivity {

    private CalendarPopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleView(View view) {
        Intent intent = new Intent(this,SimpleCalendarActivity.class);
        startActivity(intent);

    }

    public void showPinkCalendar(View view){
        if (popupWindow==null){
            popupWindow=new CalendarPopupWindow(this);
            // 要加这行 不然颜色会跟深层子项用的颜色相撞
            popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        if (popupWindow.isShowing()){
            popupWindow.dismiss();
            return;
        }
        popupWindow.showAsDropDown(view);
    }
}
