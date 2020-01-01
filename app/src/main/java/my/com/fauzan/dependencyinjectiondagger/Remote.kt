package my.com.fauzan.dependencyinjectiondagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    fun setListener(car: Car){
        Log.d("Remote", "Remote connected")
    }
}