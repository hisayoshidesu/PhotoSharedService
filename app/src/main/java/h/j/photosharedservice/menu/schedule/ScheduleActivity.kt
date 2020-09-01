package h.j.photosharedservice.menu.schedule

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class ScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getSupportActionBar(): ActionBar? {
        return super.getSupportActionBar()
    }

    override fun checkUriPermission(uri: Uri?, pid: Int, uid: Int, modeFlags: Int): Int {
        return super.checkUriPermission(uri, pid, uid, modeFlags)
    }

    override fun moveTaskToBack(nonRoot: Boolean): Boolean {
        return super.moveTaskToBack(nonRoot)
    }

    

    
}

