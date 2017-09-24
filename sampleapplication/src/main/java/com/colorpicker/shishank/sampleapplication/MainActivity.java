package com.colorpicker.shishank.sampleapplication;

import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.colorpicker.shishank.colorpicker.ColorPicker;
import com.colorpicker.shishank.colorpicker.ColorPicker.ColorSelectedListener;

public class MainActivity extends AppCompatActivity implements ColorSelectedListener {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColorPicker colorPicker = (ColorPicker) findViewById(R.id.baseColorPicker);
        imageView = (ImageView) findViewById(R.id.iv_color);

        colorPicker.setGradientView(R.drawable.circular_color_picker);
        colorPicker.setColorSelectedListener(this);
    }

    @Override
    public void onColorSelected(@ColorInt int color, boolean isTapUp) {
        imageView.setBackgroundColor(color);
        if (isTapUp) {
            Toast.makeText(this, "On Tap Up called", Toast.LENGTH_SHORT).show();
        }
    }
}