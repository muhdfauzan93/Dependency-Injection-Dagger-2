package my.com.fauzan.dependencyinjectiondagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor (engine: Engine, wheels: Wheels){

    fun drive(){
        Log.d("Cars", "Driving....")
    }
}