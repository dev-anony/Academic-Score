package com.ssec.academicscore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId){
            R.id.my_profile-> {
                val i = Intent(this,StudentActivity::class.java)
                this.startActivity(i)
            }
            R.id.settings-> {
                val i = Intent(this,SettingsActivity::class.java)
                this.startActivity(i)
            }
            R.id.logout-> {
                FirebaseAuth.getInstance().signOut()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
