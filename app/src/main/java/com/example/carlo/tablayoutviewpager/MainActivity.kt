package com.example.carlo.tablayoutviewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.carlo.tablayoutviewpager.Fragments.GamesFragment
import com.example.carlo.tablayoutviewpager.Fragments.MovieFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar_main.*

class MainActivity : AppCompatActivity() {

    // setting up pager adapter
    var pagerAdapter : CustomPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        pagerAdapter = CustomPagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(GamesFragment(),"Games")
        pagerAdapter!!.addFragments(MovieFragment(), "Movies")

        // Adding pager adapter to view pager
        customViewPager.adapter = pagerAdapter

        // Setting up view pager with tablayout
        customTabLayout.setupWithViewPager(customViewPager)



    }
}
