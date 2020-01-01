package my.com.fauzan.dependencyinjectiondagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor():
    Engine {
    override fun start() {
        Log.d("Diesel", "Diesel engine started")
    }
}