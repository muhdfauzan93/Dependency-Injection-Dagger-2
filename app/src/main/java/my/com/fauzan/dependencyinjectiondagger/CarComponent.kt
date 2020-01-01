package my.com.fauzan.dependencyinjectiondagger

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}