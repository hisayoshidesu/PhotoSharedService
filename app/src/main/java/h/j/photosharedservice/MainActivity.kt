package h.j.photosharedservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import h.j.photosharedservice.menu.home.HomeActivity
import h.j.photosharedservice.menu.home.HomeFragment
import h.j.photosharedservice.menu.like.LikeFragment
import h.j.photosharedservice.menu.other.OtherFragment
import h.j.photosharedservice.menu.schedule.ScheduleActivity
import h.j.photosharedservice.menu.schedule.ScheduleFragment
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.main.*

//?はnullpointerを防ぐ役割があるそう

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment", "onViewCreated")
        setContentView(R.layout.activity_main)
        
        val fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        fragmentManager.popBackStack()
        fragmentTransaction.add(R.id.container_nav_home, HomeFragment()).commit()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
    /**
     *
     * replaceで切り替えると、表示ごとにFragmentの状態が初期化されてしまうため、
     * 各アイテムの状態を保つことができません。replaceは内部的にremove、addを行っているためです。
    */


    val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                val fragmentManager = supportFragmentManager
                var fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.addToBackStack(null)
                fragmentManager.popBackStack()
                fragmentTransaction.add(R.id.container_nav_home, HomeFragment()).commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_schedule -> {
                var fragmentManager = supportFragmentManager
                var fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.addToBackStack(null)
                fragmentManager.popBackStack()
                fragmentTransaction.add(R.id.container_nav_schedule, LikeFragment()).commit()

                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_favorite -> {
                var fragmentManager = supportFragmentManager
                var fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.addToBackStack(null)
                fragmentManager.popBackStack()
                fragmentTransaction.add(R.id.container_favorite, ScheduleFragment()).commit()

                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_other -> {
                var fragmentManager = supportFragmentManager
                var fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.addToBackStack(null)
                fragmentManager.popBackStack()
                fragmentTransaction.add(R.id.container_other, OtherFragment()).commit()

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
