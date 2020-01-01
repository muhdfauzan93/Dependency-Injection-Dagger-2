package my.com.fauzan.dependencyinjectiondagger.dagger

import dagger.Binds
import dagger.Module
import my.com.fauzan.dependencyinjectiondagger.car.Engine
import my.com.fauzan.dependencyinjectiondagger.car.PetrolEngine

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine


}