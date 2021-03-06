package my.com.fauzan.dependencyinjectiondagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.com.fauzan.dependencyinjectiondagger.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        // carComponent.inject(this)
        car.drive()
    }
}
