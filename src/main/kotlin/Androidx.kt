/*
 * Created by faisalamir on 07/03/22
 * frogo-build-src
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.
 * All rights reserved
 *
 */

object Androidx {
    const val coreKtxVersion = "1.7.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    const val appCompatVersion = "1.4.1"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    
    const val constraintlayoutVersion = "2.1.3"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintlayoutVersion"

    // -----------------------------------------------------------------------------------------------------------------

    // androidTestImplementation

    const val runnerVersion = "1.3.0"
    const val runner = "androidx.test:runner:$runnerVersion"

    const val junitVersion = "1.1.3"
    const val junit = "androidx.test.ext:junit:$junitVersion"

    const val espressoCoreVersion = "3.4.0"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
    
    object Room {
        const val version = "2.4.1"
        const val runtime ="androidx.room:room-runtime:$version"
        const val ktx ="androidx.room:room-ktx:$version"
        const val rxJava2 ="androidx.room:room-rxjava2:$version"
        const val guava ="androidx.room:room-guava:$version"

        // Annotation processor
        const val compiler = "androidx.room:room-compiler:$version"
    }
    
    object LifeCycle {
        const val version = "2.5.0-alpha03"
        const val archVersion = "2.1.0"

        // ViewModel
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel:$version"
        // LiveData
        const val livedata = "androidx.lifecycle:lifecycle-livedata:$version"
        // Lifecycles only (without ViewModel or LiveData)
        const val runtime = "androidx.lifecycle:lifecycle-runtime:$version"

        // Saved state module for ViewModel
        const val viewmodelSavedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"

        // Annotation processor
        const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
        // alternately - if using Java8, use the following instead of lifecycle-compiler
        const val compilerJava8 = "androidx.lifecycle:lifecycle-common-java8:$version"

        // optional - helpers for implementing LifecycleOwner in a Service
        const val service = "androidx.lifecycle:lifecycle-service:$version"

        // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
        const val process = "androidx.lifecycle:lifecycle-process:$version"

        // optional - ReactiveStreams support for LiveData
        const val reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams:$version"

        // optional - Test helpers for LiveData
        const val coreTesting = "androidx.arch.core:core-testing:$archVersion"

    }

}