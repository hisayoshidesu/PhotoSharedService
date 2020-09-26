package h.j.photosharedservice.menu.home

import android.content.Context
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import h.j.photosharedservice.R
import kotlinx.android.synthetic.main.home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        fragmentManager.popBackStack()
        fragmentTransaction.add(R.id.container_nav_home, HomeFragment()).commit()
//        val imageView2 = findViewById<ImageView>(R.id.imageView2)
//        imageView2.setImageResource(R.drawable.sample_image)


    }

//    fun picture() {
//        val imageView2 = findViewById<ImageView>(R.id.imageView2)
//        imageView2.setImageResource(R.drawable.sample_image)
////        return imageView2
//    }


}