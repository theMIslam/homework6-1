package com.example.homework6_1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.homework6_1.Key.Companion.DATA_KEY
import com.example.homework6_1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        setData()
    }

    private fun setData() {
        binding.etText.setText(intent.getStringExtra(DATA_KEY))
    }


    private fun initClickers() {
        binding.btnBack.setOnClickListener {
            setResult(
                RESULT_OK,Intent().putExtra(
                    DATA_KEY,binding.etText.text.toString()
                )
            )
            finish()
        }
    }

}