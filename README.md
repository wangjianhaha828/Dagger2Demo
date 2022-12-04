# Dagger2Demo
## 添加依赖
### app-build.gradle
    plugins {
        id 'com.android.application'
        id 'org.jetbrains.kotlin.android'
        //添加这两行
        id 'kotlin-kapt'
        id 'kotlin-android'
    }
    //添加依赖
    dependencies {
        implementation 'com.google.dagger:dagger-android:2.x'
        implementation 'com.google.dagger:dagger-android-support:2.x' // if you use the support libraries
        annotationProcessor 'com.google.dagger:dagger-android-processor:2.x'
        annotationProcessor 'com.google.dagger:dagger-compiler:2.x'
    }
