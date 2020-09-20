package h.j.photosharedservice.db

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * 内部ストレージに保存
 * https://developer.android.com/training/data-storage/files/internal?hl=ja
 */

class File : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        内部ストレージのパス取得
        var internal = applicationContext.filesDir
        var cache = applicationContext.filesDir

    }

    override fun onStart() {
        super.onStart()
    }

}