package my.com.fauzan.dependencyinjectiondagger.dagger

import dagger.Component
import my.com.fauzan.dependencyinjectiondagger.MainActivity
import my.com.fauzan.dependencyinjectiondagger.car.Car

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
// @Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}