package h.j.photosharedservice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import h.j.photosharedservice.menu.home.HomeFragment
import h.j.photosharedservice.menu.like.LikeFragment
import h.j.photosharedservice.menu.other.OtherFragment
import h.j.photosharedservice.menu.schedule.ScheduleFragment
import kotlinx.android.synthetic.main.main.*

class NavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //navigationの表示と画面遷移
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

//        var fragmentManaer = supportFragmentManager
//        var fragmentTransaction = fragmentManaer.beginTransaction()
//        //backStackの設定 main画面からFragmentから画面をレイアウトする
//        fragmentTransaction.addToBackStack(null)
//        //fragmentTransactionにパラメータとして設定する
//        fragmentTransaction.add(R.id.container, NavigationItemsFragmet()).commit()

    }

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