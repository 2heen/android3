package com.example.recievebroadcast3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import java.lang.Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecieveBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Pattern pattern = Pattern.compile("(a|a)*$");
        String temp = intent.getStringExtra("variable");
        Toast.makeText(context, "input temp is: " + temp, Toast.LENGTH_LONG).show();
        Matcher matcher = pattern.matcher(temp);
        boolean matchFound = matcher.find();
        Toast.makeText(context, "regex is: " + matchFound, Toast.LENGTH_LONG).show();
        Toast.makeText(context, "input is: " + intent.getStringExtra("variable"), Toast.LENGTH_LONG).show();



    }

}
