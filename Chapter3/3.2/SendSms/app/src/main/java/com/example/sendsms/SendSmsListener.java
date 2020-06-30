package com.example.sendsms;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SendSmsListener implements View.OnLongClickListener {

    private Activity activity;
    private EditText address;
    private EditText content;
    public SendSmsListener(Activity activity, EditText address, EditText content){
        this.activity = activity;
        this.address = address;
        this.content = content;
    }
    @Override
    public boolean onLongClick(View v) {
        String addressStr = address.getText().toString();
        String contentStr = content.getText().toString();
        SmsManager smsManager = SmsManager.getDefault();
        PendingIntent sentIntent = PendingIntent.getBroadcast(activity, 0, new Intent(), 0);
        smsManager.sendTextMessage(addressStr, null, contentStr, sentIntent, null);
        Toast.makeText(activity, "短信发送完成", Toast.LENGTH_LONG).show();
        return false;
    }
}
