package com.naldana.activitysexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import  com.naldana.activitysexample.databinding.ActivityScoreBinding

import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    private val viewModel: MainViewModel by viewModels()



    // Views


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_score)

        binding.lifecycleOwner = this
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.vav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

    }
}





