![](https://raw.githubusercontent.com/frogobox/.github/main/docs/image/banner-frogo-build-src.png?raw=true)

## About This Project
[![](https://jitpack.io/v/frogobox/frogo-build-src.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-build-src)
[![Scan with Detekt](https://github.com/frogobox/frogo-build-src/actions/workflows/detekt-analysis.yml/badge.svg)](https://github.com/frogobox/frogo-build-src/actions/workflows/detekt-analysis.yml)
[![pages-build-deployment](https://github.com/frogobox/frogo-build-src/actions/workflows/pages/pages-build-deployment/badge.svg)](https://github.com/frogobox/frogo-build-src/actions/workflows/pages/pages-build-deployment)

- Library for contant data buildSrc
- Library for calling contant variable for build.gradle.kts
- Develop using IntelliJ IDEA
- The requirement must already be using buildSrc
- License [Click Here](https://raw.githubusercontent.com/frogobox/frogo-build-src/master/LICENSE)
- Privacy Policy [Click Here](https://raw.githubusercontent.com/frogobox/frogo-build-src/master/PRIVACY-POLICY.md)

Repository for testing build from jitpack.io
- Red : Failed
- Green : Success / Pass

## Version Release
This Is Latest Release

    $version_release = 1.2.3

What's New??

[![FrogoRecyclerView](https://jitpack.io/v/amirisback/frogo-recycler-view.svg?style=flat-square)](https://jitpack.io/#amirisback/frogo-recycler-view)
[![FrogoAdmob](https://jitpack.io/v/amirisback/frogo-admob.svg?style=flat-square)](https://jitpack.io/#amirisback/frogo-admob)
[![FrogoSDK](https://jitpack.io/v/frogobox/frogo-sdk.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-sdk)
[![FrogoUI](https://jitpack.io/v/frogobox/frogo-ui.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-ui)
[![FrogoConsumeApi](https://jitpack.io/v/frogobox/frogo-consume-api.svg?style=flat-square)](https://jitpack.io/#frogobox/frogo-consume-api)

```kotlin
const val recyclerViewVersion = "4.1.3" // https://github.com/amirisback/frogo-recycler-view
const val admobVersion = "4.3.6" // https://github.com/amirisback/frogo-admob
const val uiVersion = "1.0.0" // https://github.com/frogobox/frogo-ui
const val sdkVersion = "1.0.3" // https://github.com/frogobox/frogo-sdk
const val consumeApiVersion = "2.2.2" // https://github.com/frogobox/frogo-consume-api

const val logVersion = "2.0.9" // https://github.com/amirisback/frogo-log [DEPRECATED]
const val notificationVersion = "1.1.1" // https://github.com/amirisback/frogo-notification [DEPRECATED]
const val animationVersion = "0.0.1-beta05" // https://github.com/frogobox/frogo-animation [DEPRECATED]
const val loadingIndicatorViewVersion = "0.0.1-beta01" // https://github.com/frogobox/frogo-loading-indicator-view [DEPRECATED]
```

## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle.kts : BuildSrc)

```kotlin
repositories {
    ...
    maven("https://jitpack.io")
}
```

### Step 2. Add the dependency (build.gradle.kts : BuildSrc)

```kotlin
dependencies {
    // library frogo-build-src
    implementation("com.github.frogobox:frogo-build-src:1.2.3")
}
```

### Step 3. Usage (Add on your dependencies build.gradle.kts)

#### Version planted

```kotlin
dependencies {
    // List All Frogo Library
    implementation(Frogo.sdk)
    implementation(Frogo.ui)
    implementation(Frogo.consumeApi)
    implementation(Frogo.recyclerView)
    implementation(Frogo.admob)
    implementation(Frogo.log)
    implementation(Frogo.notification)
    implementation(Frogo.animation)
    implementation(Frogo.loadingIndicatorView)
}
```

#### Custom Version
```kotlin
dependencies {
    // List All Frogo Library
    implementation(Frogo.sdk(""))
    implementation(Frogo.ui(""))
    implementation(Frogo.consumeApi(""))
    implementation(Frogo.recyclerView(""))
    implementation(Frogo.admob(""))
    implementation(Frogo.log(""))
    implementation(Frogo.notification(""))
    implementation(Frogo.animation(""))
    implementation(Frogo.loadingIndicatorView(""))
}
```

### Screen Shoot (Step 2. build.gradle.kts buildSrc)
![](docs/image/ss_step_2.png?raw=true)

### Screen Shoot (Step 3. build.gradle.kts app)
![](docs/image/ss_step_3.png?raw=true)

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account