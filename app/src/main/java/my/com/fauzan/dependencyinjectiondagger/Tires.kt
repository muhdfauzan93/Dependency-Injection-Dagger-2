package my.com.fauzan.dependencyinjectiondagger

import android.util.Log

class Tires {
    fun inflate() {
        Log.d("Tires", "Tires inflated")
    }
}
// we don't own this class so we can't generate it with @Inject