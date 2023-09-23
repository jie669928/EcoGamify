package com.example.ecogamify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.Exception
class HomeCategoryActivity : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_category)

        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        // Select the "Home" menu item by default
        bottomNav.selectedItemId = R.id.home
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.search -> {
                    loadFragment(SearchFragment())
                    true
                }
                R.id.education -> {
                    loadFragment(EducationFragment())
                    true
                }
                R.id.home -> {
                    // Create an Intent to launch the HomeCategoryActivity
                    val intent = Intent(this, HomeCategoryActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.community ->{
                    loadFragment(CommunityFragment())
                    true
                }
                R.id.account ->{
                    loadFragment(AccountFragment())
                    true
                }

                else -> false
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.constraintLayoutContainer,fragment)
        transaction.commit()
    }

}
