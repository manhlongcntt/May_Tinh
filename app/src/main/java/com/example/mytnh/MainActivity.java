package com.example.mytnh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_Cộng;
    private Button btn_Trừ;
    private Button btn_Nhân;
    private Button btn_Chia;
    private EditText edKêtQuả;
    private String Text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
//        btn_0 = (Button) findViewById(R.id.but_0);
//        btn_1 = (Button) findViewById(R.id.but_1);
//        btn_2 = (Button) findViewById(R.id.but_2);
//        btn_3 = (Button) findViewById(R.id.but_3);
//        btn_4 = (Button) findViewById(R.id.but_4);
//        btn_5 = (Button) findViewById(R.id.but_5);
//        btn_6 = (Button) findViewById(R.id.but_6);
//        btn_7 = (Button) findViewById(R.id.but_7);
//        btn_8 = (Button) findViewById(R.id.but_8);
//        btn_9 = (Button) findViewById(R.id.but_9);
//        btn_Cộng = (Button) findViewById(R.id.but_Cộng);
//        btn_Trừ = (Button) findViewById(R.id.but_tru);
//        btn_Nhân = (Button) findViewById(R.id.but_nhan);
//        btn_Chia = (Button) findViewById(R.id.but_Chia);
//        edKêtQuả = (EditText) findViewById(R.id.edt_input);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_Cộng.setOnClickListener(this);
        btn_Trừ.setOnClickListener(this);
        btn_Nhân.setOnClickListener(this);
        btn_Chia.setOnClickListener(this);

    }
    public void initWidget(){
        btn_0 = (Button) findViewById(R.id.but_0);
        btn_1 = (Button) findViewById(R.id.but_1);
        btn_2 = (Button) findViewById(R.id.but_2);
        btn_3 = (Button) findViewById(R.id.but_3);
        btn_4 = (Button) findViewById(R.id.but_4);
        btn_5 = (Button) findViewById(R.id.but_5);
        btn_6 = (Button) findViewById(R.id.but_6);
        btn_7 = (Button) findViewById(R.id.but_7);
        btn_8 = (Button) findViewById(R.id.but_8);
        btn_9 = (Button) findViewById(R.id.but_9);
        btn_Cộng = (Button) findViewById(R.id.but_Cộng);
        btn_Trừ = (Button) findViewById(R.id.but_tru);
        btn_Nhân = (Button) findViewById(R.id.but_nhan);
        btn_Chia = (Button) findViewById(R.id.but_Chia);
        edKêtQuả = (EditText) findViewById(R.id.edt_input);
    }
    public void setEventClickViews(){
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_Cộng.setOnClickListener(this);
        btn_Trừ.setOnClickListener(this);
        btn_Nhân.setOnClickListener(this);
        btn_Chia.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.but_0:
                Text = Text + "0";
                break;
            case R.id.but_1:
                Text = Text + "1";
                break;
            case R.id.but_2:
                Text = Text + "2";
                break;
            case R.id.but_3:
                Text = Text + "3";
                break;
            case R.id.but_4:
                Text = Text + "4";
                break;
            case R.id.but_5:
                Text = Text + "5";
                break;
            case R.id.but_6:
                Text = Text + "6";
                break;
            case R.id.but_7:
                Text = Text + "7";
                break;
            case R.id.but_8:
                Text = Text + "8";
                break;
            case R.id.but_9:
                Text = Text + "9";
                break;
            case R.id.but_Chia:
                Text = Text + ":";
                break;
            case R.id.but_Cộng:
                Text = Text + "+";
                break;
            case R.id.but_tru:
                Text = Text + "-";
                break;
            case R.id.but_nhan:
                Text = Text + "*";
                break;

            default:
                break;

        }
        edKêtQuả.setText(Text);
    }
}
