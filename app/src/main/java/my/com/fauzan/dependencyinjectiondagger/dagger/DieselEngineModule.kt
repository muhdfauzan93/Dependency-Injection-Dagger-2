package my.com.fauzan.dependencyinjectiondagger.dagger

import dagger.Binds
import dagger.Module
import my.com.fauzan.dependencyinjectiondagger.car.Engine
import my.com.fauzan.dependencyinjectiondagger.car.DieselEngine

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine


}