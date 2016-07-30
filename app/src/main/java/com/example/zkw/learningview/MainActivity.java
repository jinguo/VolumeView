package com.example.zkw.learningview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.zkw.learningview.widget.VolumeView;

/**
 * Created by zkw on 2016/7/26.
 */
public class MainActivity extends AppCompatActivity implements VolumeView.MoveInterface {
    private Button btnMode;
    private TextView tvValue;
    private VolumeView moveView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvValue = (TextView) findViewById(R.id.tv_value);
        moveView = (VolumeView) findViewById(R.id.move_view);
        moveView.setMoveInterface(this);

    }

    @Override
    public void getCurrentDegrees(int degress) {
        tvValue.setText("当前音量：" + degress);
    }
}