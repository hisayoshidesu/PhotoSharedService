package h.j.photosharedservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment", "onViewCreated")
        setContentView(R.layout.activity_main)

        var fragmentManaer = supportFragmentManager
        var fragmentTransaction = fragmentManaer.beginTransaction()
        //backStackの設定 main画面からFragmentから画面をレイアウトする
        fragmentTransaction.addToBackStack(null)
        //fragmentTransactionにパラメータとして設定する
        fragmentTransaction.add(R.id.container, NavigationItemsFragmet()).commit()
    }
}
