package com.example.ecogamify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ecogamify.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        binding.btnRegister.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.tvAlreadyHaveAccount.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}