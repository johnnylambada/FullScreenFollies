
package com.sigseg.fullstreemfollies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FullScreenImageActivity extends AppCompatActivity {

    private ImageView backdrop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        Glide.with(this)
                .load("http://i.huffpost.com/gen/2229248/images/o-PARALLEL-UNIVERSES-facebook.jpg")
                .centerCrop()
                .into((ImageView)findViewById(R.id.backdrop));
    }

}
