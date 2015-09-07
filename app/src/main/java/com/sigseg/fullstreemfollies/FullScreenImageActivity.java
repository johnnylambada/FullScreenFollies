
package com.sigseg.fullstreemfollies;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FullScreenImageActivity extends AppCompatActivity {

    private ImageView backdrop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        // karaokyo's approach
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP) {
            // Set to full screen layout. The system notification bar overlays the top of the app
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        // Tan Tran's approach #1
//        getWindow().getDecorView().setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//        getWindow().setStatusBarColor(Color.TRANSPARENT);

        // Tan Tran's approach #2
//        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        getWindow().setStatusBarColor(Color.TRANSPARENT);

        Glide.with(this)
                .load("http://i.huffpost.com/gen/2229248/images/o-PARALLEL-UNIVERSES-facebook.jpg")
                .centerCrop()
                .into((ImageView)findViewById(R.id.backdrop));
    }

}
