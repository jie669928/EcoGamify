package com.example.ecogamify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class PlantNativeActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_native)

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
//                    // Create an Intent to launch the HomeCategoryActivity
//                    val intent = Intent(this, HomeCategoryActivity::class.java)
//                    startActivity(intent)
                    loadFragment(HomeFragment())
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
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}