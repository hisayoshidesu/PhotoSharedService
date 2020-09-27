package h.j.photosharedservice.menu.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import h.j.photosharedservice.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootview : View  = inflater.inflate(R.layout.home, container, false)
        return  rootview
//        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageView2 = view.findViewById<ImageView>(R.id.imageView2)
        imageView2.setImageResource(R.drawable.sample_image)
    }
}