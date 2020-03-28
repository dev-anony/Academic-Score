package com.ssec.academiscore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigation)

        fillFragment(FragmentHome())
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home-> {
                    fillFragment(FragmentHome())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_result-> {
                    fillFragment(FragmentResult())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_contact-> {
                    fillFragment(FragmentContact())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    private fun fillFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
