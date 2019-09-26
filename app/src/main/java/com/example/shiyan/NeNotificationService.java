package com.example.shiyan;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

/**
 * 作者:ZZR
 * 时间:2019/9/10 0010
 */
@SuppressLint("OverrideAbstract")
@TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
public class NeNotificationService extends NotificationListenerService {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
       public void onNotificationPosted(StatusBarNotification sbn) {
               Notification notification = sbn.getNotification();
                 if (notification == null) {
                       return;
                   }
                 Bundle extras = notification.extras;
               if (extras != null) {
                       //包名
                      String pkg = sbn.getPackageName();
                        // 获取通知标题
                         String title = extras.getString(Notification.EXTRA_TITLE, "");
                       // 获取通知内容
                       String content = extras.getString(Notification.EXTRA_TEXT, "");
                      Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
                         //处理
//                      processOnReceive(pkg, title, content);
                  }
             }
}
