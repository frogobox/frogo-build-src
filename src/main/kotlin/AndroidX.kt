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

object AndroidX {
    private const val coreKtxVersion = "1.6.0"
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"

    private const val appCompatVersion = "1.3.0"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"

    private const val lifecycleVmKtxVersion = "2.4.0-alpha02"
    const val lifecycleVmKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVmKtxVersion"
}

object AndroidXTest {
    private const val version = "1.3.0"
    const val runner = "androidx.test:runner:$version"
}