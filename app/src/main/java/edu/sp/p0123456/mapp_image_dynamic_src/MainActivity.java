package edu.sp.p0123456.mapp_image_dynamic_src;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    // for toggle purpose
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the imageview to change src later
        iv = (ImageView) findViewById(R.id.myiv);
    }

    public void changeImg(View view) {

        if(i==0) {
            // change image src
            iv.setImageResource(R.drawable.daaa);
            i = 1;
        }
        else{
            // change image src
            iv.setImageResource(R.drawable.sp2);
            i = 0;
        }
    }
}
