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

    const val recyclerViewVersion = "4.3.4" // https://github.com/amirisback/frogo-recycler-view
    const val admobVersion = "5.1.9" // https://github.com/amirisback/frogo-admob
    const val uiVersion = "1.1.3" // https://github.com/frogobox/frogo-ui
    const val sdkVersion = "2.1.5" // https://github.com/frogobox/frogo-sdk
    const val consumeApiVersion = "2.4.4" // https://github.com/frogobox/frogo-consume-api

    const val logVersion = "2.0.9" // https://github.com/amirisback/frogo-log [DEPRECATED]
    const val notificationVersion = "1.1.1" // https://github.com/amirisback/frogo-notification [DEPRECATED]
    const val animationVersion = "0.0.1-beta05" // https://github.com/frogobox/frogo-animation [DEPRECATED]
    const val loadingIndicatorViewVersion = "0.0.1-beta01" // https://github.com/frogobox/frogo-loading-indicator-view [DEPRECATED]

    // -----------------------------------------------------------------------------------------------------------------

    const val recyclerView = "com.github.amirisback:frogo-recycler-view:$recyclerViewVersion"
    fun recyclerView(version: String): String {
        return "com.github.amirisback:frogo-recycler-view:$version"
    }

    const val admob = "com.github.amirisback:frogo-admob:$admobVersion"
    fun admob(version: String): String {
        return "com.github.amirisback:frogo-admob:$version"
    }

    const val log = "com.github.amirisback:frogo-log:$logVersion"
    fun log(version: String): String {
        return "com.github.amirisback:frogo-log:$version"
    }

    const val notification = "com.github.amirisback:frogo-notification:$notificationVersion"
    fun notification(version: String): String {
        return "com.github.amirisback:frogo-notification:$version"
    }

    // -----------------------------------------------------------------------------------------------------------------

    const val sdk = "com.github.frogobox:frogo-sdk:$sdkVersion"
    fun sdk(version: String): String {
        return "com.github.frogobox:frogo-sdk:$version"
    }

    const val sdkCore = "com.github.frogobox.frogo-sdk:frogocoresdk:$sdkVersion"
    fun sdkCore(version: String): String {
        return "com.github.frogobox.frogo-sdk:frogocoresdk:$version"
    }

    const val sdkLog = "com.github.frogobox.frogo-sdk:frogolog:$sdkVersion"
    fun sdkLog(version: String): String {
        return "com.github.frogobox.frogo-sdk:frogolog:$version"
    }

    const val ui = "com.github.frogobox:frogo-ui:$uiVersion"
    fun ui(version: String): String {
        return "com.github.frogobox:frogo-ui:$version"
    }

    const val uiCore = "com.github.frogobox.frogo-ui:frogocoreui:$uiVersion"
    fun uiCore(version: String): String {
        return "com.github.frogobox.frogo-ui:frogocoreui:$version"
    }

    const val consumeApi = "com.github.frogobox:frogo-consume-api:$consumeApiVersion"
    fun consumeApi(version: String): String {
        return "com.github.frogobox:frogo-consume-api:$version"
    }

    const val consumeApiCore = "com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:$consumeApiVersion"
    fun consumeApiCore(version: String): String {
        return "com.github.frogobox.frogo-consume-api:frogocoreconsumeapi:$version"
    }

    const val animation = "com.github.frogobox:frogo-animation:$animationVersion"
    fun animation(version: String): String {
        return "com.github.frogobox:frogo-animation:$version"
    }

    const val loadingIndicatorView = "com.github.frogobox:frogo-loading-indicator-view:$loadingIndicatorViewVersion"
    fun loadingIndicatorView(version: String) : String {
        return "com.github.frogobox:frogo-loading-indicator-view:$version"
    }
    // -----------------------------------------------------------------------------------------------------------------

}
