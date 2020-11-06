package com.local.part_3.viewpager

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.local.part_3.R
import kotlinx.android.synthetic.main.activity_motion_layout_with_view_pager.*
import kotlinx.android.synthetic.main.view_pager_header.view.*


class MotionLayoutWithViewPager : AppCompatActivity(), ViewPager.OnPageChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // activity fullscreen mode
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

//        // hide action bar
//        supportActionBar?.hide()

        setContentView(R.layout.activity_motion_layout_with_view_pager)

        //setting up adapter
        val adapter = ViewPagerAdapter(supportFragmentManager)

        // adding fragments
        adapter.addFrag(FirstFragment(), "First")
        adapter.addFrag(FirstFragment(), "Second")
        adapter.addFrag(FirstFragment(), "Third")
        adapter.addFrag(FirstFragment(), "Fourth")

        // setting-up adapter
        viewpager.adapter = adapter

        // setting-up current page
        viewpager.currentItem = 0

        viewpager.addOnPageChangeListener(this)

        header.animation_view.progress = 0.00F

        tabs.setupWithViewPager(viewpager)
    }

    override fun onPageScrollStateChanged(state: Int) {}

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        val numPages = 4
        header.animation_view.progress = (position + positionOffset) / (numPages - 1)
    }

    override fun onPageSelected(position: Int) {}
}

