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

object Frogo {

    const val recyclerViewVersion = "4.0.5"
    const val admobVersion = "4.1.9"
    const val logVersion = "2.0.9"
    const val notificationVersion = "1.1.1"

    const val sdkVersion = "0.0.1-beta08"
    const val uiVersion = "0.0.1-beta04"
    const val consumeApiVersion = "2.0.1"

    // -----------------------------------------------------------------------------------------------------------------

    const val recyclerView = "com.github.amirisback:frogo-recycler-view:$recyclerViewVersion"
    fun recyclerView(version: String) : String {
        return "com.github.amirisback:frogo-recycler-view:$version"
    }

    const val admob = "com.github.amirisback:frogo-admob:$admobVersion"
    fun admob(version: String) : String {
        return "com.github.amirisback:frogo-admob:$version"
    }

    const val log = "com.github.amirisback:frogo-log:$logVersion"
    fun log(version: String) : String {
        return "com.github.amirisback:frogo-log:$version"
    }

    const val notification = "com.github.amirisback:frogo-notification:$notificationVersion"
    fun notification(version: String) : String {
        return "com.github.amirisback:frogo-notification:$version"
    }

    // -----------------------------------------------------------------------------------------------------------------

    const val sdk = "com.github.frogobox:frogo-sdk:$sdkVersion"
    fun sdk(version: String) : String {
        return "com.github.frogobox:frogo-sdk:$version"
    }

    const val sdkCore = "com.github.frogobox.frogo-sdk:frogocoresdk:$sdkVersion"
    fun sdkCore(version: String) : String {
        return "com.github.frogobox.frogo-sdk:frogocoresdk:$version"
    }

    const val ui = "com.github.frogobox:frogo-ui:$uiVersion"
    fun ui(version: String) : String {
        return "com.github.frogobox:frogo-ui:$version"
    }

    const val uiCore = "com.github.frogobox.frogo-ui:frogocoreui:$uiVersion"
    fun uiCore(version: String) : String {
        return "com.github.frogobox.frogo-ui:frogocoreui:$version"
    }

    const val consumeApi = "com.github.frogobox:frogo-consume-api:$consumeApiVersion"
    fun consumeApi(version: String) : String {
        return "com.github.frogobox:frogo-consume-api:$version"
    }

    const val consumeApiCore = "com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:$consumeApiVersion"
    fun consumeApiCore(version: String) : String {
        return "com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:$version"
    }

    // -----------------------------------------------------------------------------------------------------------------

}