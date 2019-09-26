package com.example.time;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airsaid.pickerviewlibrary.TimePickerView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TimePickerView mTimePickerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] items3 = new String[]{"111", "222", "333", "444"};//创建item
                AlertDialog alertDialog3 = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("选择您喜欢的老湿")
                        .setIcon(R.mipmap.ic_launcher)
                        .setItems(items3, new DialogInterface.OnClickListener() {//添加列表
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (items3[i].equals("111")){
                                    Toast.makeText(MainActivity.this, items3[i], Toast.LENGTH_SHORT).show();
                                }else if (items3[i].equals("222")){
                                    Toast.makeText(MainActivity.this, items3[i], Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .create();
                alertDialog3.show();

            }
        });
    }
}
