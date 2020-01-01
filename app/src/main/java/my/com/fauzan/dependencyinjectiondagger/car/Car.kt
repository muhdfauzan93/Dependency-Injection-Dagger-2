package my.com.fauzan.dependencyinjectiondagger.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        engine.start()
        Log.d("Cars", "Driving....")
    }
}