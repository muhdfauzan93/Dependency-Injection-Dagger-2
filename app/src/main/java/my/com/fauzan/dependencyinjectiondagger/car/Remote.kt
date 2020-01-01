package my.com.fauzan.dependencyinjectiondagger.car

import android.util.Log
import my.com.fauzan.dependencyinjectiondagger.car.Car
import javax.inject.Inject

class Remote @Inject constructor(){
    fun setListener(car: Car){
        Log.d("Remote", "Remote connected")
    }
}