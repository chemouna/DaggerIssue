package com.example.daggerissue

import com.example.daggerissue.public.Example
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(
    modules = [AModule::class]
)
interface ComponentA {

    fun inject(container: Container)

    fun example(): Example

}

@Module
object AModule {

    @Provides
    fun provideExample(): Example = Example()

}