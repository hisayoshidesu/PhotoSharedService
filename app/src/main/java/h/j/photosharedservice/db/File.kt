package h.j.photosharedservice.db

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import h.j.photosharedservice.R
import kotlinx.android.synthetic.main.navigation_nav_header_main.*
import java.io.BufferedReader

/**
 * 内部ストレージに保存
 * https://developer.android.com/training/data-storage/files/internal?hl=ja
 */

class File : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        内部ストレージのパス取得
//        var internal = applicationContext.filesDir
//        var cacher = applicationContext.filesDir

        // Save file
        buttonSave.setOnClickListener(View.OnClickListener {

            // get string contents of EditText
            val contents = editText.text.toString()

            if (!contents.isEmpty()) {
                saveFile(fileName, contents)
                textView.text =  getString(R.string.saved)
            } else {
                textView.text = getString(R.string.no_text)
            }
        })

        // Read file
        buttonRead.setOnClickListener(View.OnClickListener {
            val str = readFiles(fileName)
            if (str != null) {
                textView.text = str
            } else {
                textView.text = getString(R.string.read_error)
            }
        })
    }

    private fun saveFile(file: String, str: String) {

        applicationContext.openFileOutput(file, Context.MODE_PRIVATE).use {
            it.write(str.toByteArray())
        }

        //File(applicationContext.filesDir, file).writer().use {
        //    it.write(str)
        //}
    }

    private fun readFiles(file: String): String? {

        // to check whether file exists or not
        val readFile = File(applicationContext.filesDir, file)

        if(!readFile.exists()){
            Log.d("debug","No file exists")
            return null
        }
        else{
            return readFile.bufferedReader().use(BufferedReader::readText)
        }
    }

//    override fun onStart() {
//        super.onStart()
//    }

}