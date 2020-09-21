package h.j.photosharedservice.camera

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.camera2.*
import android.hardware.camera2.CaptureRequest.*
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Surface
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.util.*
import java.util.jar.Manifest

/**
 * 画像を押下後にカメラを起動し画像を差し替える
 *
 */
class Camera : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    /*
    *
    * */
    fun openCamera() {
        var manager: CameraManager = getSystemService(Context.CAMERA_SERVICE) as CameraManager

//        try {
//            var camerId: String = manager.getCameraIdList()[0]
//            val permission = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//
//            if (permission != PackageManager.PERMISSION_GRANTED) {
//                requestCameraPermission()
//                return
//            }
//            manager.openCamera(camerId, stateCallback, null)
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
    }

//    private fun requestCameraPermission() {
//        requestPermissions(arrayOf(Manifest.permission.CAMERA), 200)
//    }



}