package com.example.ecogamify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ecogamify.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this, HomeCategoryActivity::class.java))
        }
        binding.tvHaventAccount.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}