package h.j.photosharedservice.menu.home

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import h.j.photosharedservice.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        fragmentManager.popBackStack()
        fragmentTransaction.add(R.id.container_nav_home, HomeFragment()).commit()

    }
}