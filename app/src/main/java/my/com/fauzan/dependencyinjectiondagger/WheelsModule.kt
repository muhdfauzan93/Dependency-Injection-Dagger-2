package my.com.fauzan.dependencyinjectiondagger

import dagger.Module
import dagger.Provides

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
        fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
    }
}