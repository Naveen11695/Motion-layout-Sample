package com.local.part_3.collapsible_toolbar

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.local.part_3.R

class MotionLayoutWithCoordinatorLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity fullscreen mode
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // hide action bar
        supportActionBar?.hide()

        setContentView(R.layout.activity_motion_layout_with_coordinator_layout)
    }
}