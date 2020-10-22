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
import h.j.photosharedservice.menu.schedule.ScheduleFragment
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.main.*

//?はnullpointerを防ぐ役割があるそう

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment", "onViewCreated")
        setContentView(R.layout.activity_main)
        
//        val fragmentManager = supportFragmentManager
//        var fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.addToBackStack(null)
//        fragmentManager.popBackStack()
//        fragmentTransaction.add(R.id.container_nav_home, HomeFragment()).commit()


//        val navigationactivity =  NavigationActivity()
//        navigationactivity.mOnNavigationItemSelectedListener

//        var fragmentManaer = supportFragmentManager
//        var fragmentTransaction = fragmentManaer.beginTransaction()
//        //backStackの設定 main画面からFragmentから画面をレイアウトする
//        fragmentTransaction.addToBackStack(null)
//        //fragmentTransactionにパラメータとして設定する
//        fragmentTransaction.add(R.id.container, NavigationItemsFragmet()).commit()
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {

                val intent = Intent(applicationContext, HomeActivity::class.java)
                startActivity(intent)


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
                fragmentTransaction.replace(R.id.container_favorite, ScheduleFragment()).commit()

                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_other -> {
                var fragmentManager = supportFragmentManager
                var fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.addToBackStack(null)
                fragmentManager.popBackStack()
                fragmentTransaction.replace(R.id.container_other, OtherFragment()).commit()

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
