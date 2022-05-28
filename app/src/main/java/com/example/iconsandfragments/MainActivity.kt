package com.example.iconsandfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iconsandfragments.fragments.FavouritesFragment
import com.example.iconsandfragments.fragments.HomeFragment
import com.example.iconsandfragments.fragments.SettingsFragment
import com.example.iconsandfragments.fragments.adapters.ViewPagerAdapter
import com.example.iconsandfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "")
        adapter.addFragment(FavouritesFragment(), "")
        adapter.addFragment(SettingsFragment(), "")
        binding.viewPager.adapter = adapter
        //setting up the view page to the id tabs
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_favorite_24)
        binding.tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_settings_24)

    }
}