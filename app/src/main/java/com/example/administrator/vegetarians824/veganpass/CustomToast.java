package com.example.administrator.vegetarians824.veganpass;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.vegetarians824.R;


/**
 * Created by Administrator on 2017-05-19.
 */
public class CustomToast {
    private static TextView mTextView=null;
    private static Toast toastStart=null;
    public static void showToast(Context context, String message) {
        //加载Toast布局

        View toastRoot = LayoutInflater.from(context).inflate(R.layout.toast, null);
        //初始化布局控件
        mTextView = (TextView) toastRoot.findViewById(R.id.message);
        //为控件设置属性
        mTextView.setText(message);

        //Toast的初始化
        if(toastStart!=null){
            toastStart.cancel();
        }
        toastStart = new Toast(context);
        //获取屏幕高度
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        toastStart.setGravity(Gravity.CENTER, 0, 0);
        toastStart.setDuration(Toast.LENGTH_SHORT);
        toastStart.setView(toastRoot);
        toastStart.show();

    }

    public static void cancel(){
        if(toastStart!=null) {
            toastStart.cancel();
        }
    }

}