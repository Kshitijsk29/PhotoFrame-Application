package com.nextin.photoframeapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nextin.photoframeapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var count = 0
     private val binding :ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cricketerFolders = arrayOf(
            R.drawable.yuvi,
            R.drawable.bumrah,
            R.drawable.siraj1,
            R.drawable.smriti,
            R.drawable.virat,
            R.drawable.dhoni,
            R.drawable.kl_rahul,
            R.drawable.rohit_sharma,
        )
        binding.btnNext.setOnClickListener {
            count++
            binding.imageView.setImageResource(cricketerFolders[count])
        }
        binding.btnPrevious.setOnClickListener {
            val index = (cricketerFolders.size+count-1)%cricketerFolders.size
            binding.imageView.setImageResource(cricketerFolders[index])
        }
   }
}