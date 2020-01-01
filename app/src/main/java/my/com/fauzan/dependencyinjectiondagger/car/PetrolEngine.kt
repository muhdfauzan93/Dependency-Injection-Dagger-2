package my.com.fauzan.dependencyinjectiondagger.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor():
    Engine {
    override fun start() {
        Log.d("Engine", "Petrol engine started")
    }
}