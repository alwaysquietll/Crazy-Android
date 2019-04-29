package com.jack.notificationtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    String id = "channel_001";
    String name = "name";
    Button btn;
    static final int NOTIFICATION_ID =  0x123;
    NotificationManager nm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        String id = "my_channel_01";
        String name="我是渠道名字";
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        btn = (Button) findViewById(R.id.send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification notification = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    NotificationChannel mChannel = new NotificationChannel(id, name, NotificationManager.IMPORTANCE_LOW);
                    Toast.makeText(this, mChannel.toString(), Toast.LENGTH_SHORT).show();
                    Log.i(TAG, mChannel.toString());
                    nm.createNotificationChannel(mChannel);
                    notification = new Notification.Builder(this)
                            .setChannelId(id)
                            .setContentTitle("5 new messages")
                            .setContentText("hahaha")
                            .setSmallIcon(R.mipmap.ic_launcher).build();
                } else {
                    NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                            .setContentTitle("5 new messages")
                            .setContentText("hahaha")
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setOngoing(true);
                    //.setChannel(id);//无效
                    notification = notificationBuilder.build();
                }
                nm.notify(111123, notification);
            }
        });

    }
//    public void send(View source)
//    {
//        System.out.println(111);
//        Intent intent = new Intent(MainActivity.this, OtherActivity.class);
//        PendingIntent pi = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
//        Notification notify = new Notification.Builder(this)
//                // 设置打开该通知，该通知自动消失
//                .setAutoCancel(true)
//                // 设置显示在状态栏的通知提示信息
//                .setTicker("有新消息")
//                // 设置通知的图标
//                .setSmallIcon(R.drawable.notify)
//                // 设置通知内容的标题
//                .setContentTitle("一条新通知")
//                // 设置通知内容
//                .setContentText("恭喜你，您加薪了，工资增加20%!")
//                // 设置使用系统默认的声音、默认LED灯
//                // .setDefaults(Notification.DEFAULT_SOUND
//                // |Notification.DEFAULT_LIGHTS)
//                // 设置通知的自定义声音
//                //.setSound(Uri.parse("android.resource://org.crazyit.ui/"
//                //        + R.raw.msg))
//                .setWhen(System.currentTimeMillis())
//                // 设改通知将要启动程序的Intent
//                .setContentIntent(pi)  // ①
//                .build();
//        // 发送通知
//        Notification notification = null;
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            NotificationChannel mChannel = new NotificationChannel(id, name, NotificationManager.IMPORTANCE_LOW);
//            Toast.makeText(this, mChannel.toString(), Toast.LENGTH_SHORT).show();
//            Log.i(TAG, mChannel.toString());
//            nm.createNotificationChannel(mChannel);
//            notification = new Notification.Builder(this)
//                    .setChannelId(id)
//                    .setContentTitle("5 new messages")
//                    .setContentText("hahaha")
//                    .setSmallIcon(R.mipmap.ic_launcher).build();
//        } else {
//            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
//                    .setContentTitle("5 new messages")
//                    .setContentText("hahaha")
//                    .setSmallIcon(R.mipmap.ic_launcher)
//                    .setOngoing(true);
//                    //.setChannel(id);//无效
//            notification = notificationBuilder.build();
//        }
//        nm.notify(NOTIFICATION_ID, notify);
//    }
//    public void del(View v)
//    {
//        nm.cancel(NOTIFICATION_ID);
//        System.out.println(222);
//    }
}
