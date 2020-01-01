package my.com.fauzan.dependencyinjectiondagger.dagger

import dagger.Module
import dagger.Provides
import my.com.fauzan.dependencyinjectiondagger.car.Rims
import my.com.fauzan.dependencyinjectiondagger.car.Tires
import my.com.fauzan.dependencyinjectiondagger.car.Wheels

@Module
class WheelsModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun provideRims() = Rims()

        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            val tire = Tires()
            tire.inflate()
            return tire
        }

        @JvmStatic
        @Provides
        fun provideWheels(rims: Rims, tires: Tires) =
            Wheels(rims, tires)
    }
}