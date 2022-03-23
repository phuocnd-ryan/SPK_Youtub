/**
 * To define dependencies
 */
object Deps {

    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }

    val junit by lazy { "junit:junit:${Versions.jUnit}" }
}

object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}" }
    val navigationSafeArg by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1:${Versions.safeArgsGradlePlugin}" }
}

object KotlinDeps {
    val kotlinStdLib by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}" }
    val kotlinReflection by lazy { "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}" }
    val androidKtx by lazy { "androidx.core:core-ktx:1.7.0" }
}

object SupportDeps {
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val vector_drawable by lazy { "com.android.support:support-vector-drawable:${Versions.support_lib}" }
    val constraint_layout by lazy {
        "com.android.support.constraint:constraint-layout:${Versions.constraint_version}"
    }
}

object OtherDeps {
    val timber by lazy { "com.jakewharton.timber:timber:4.6.1" }
    val beautyLogger by lazy { "com.github.ihsanbal:LoggingInterceptor:2.0.5" }
    val glide by lazy { "com.github.bumptech.glide:glide:${Versions.glide_version}" }
    val glide_processer by lazy { "com.github.bumptech.glide:compiler:${Versions.glide_version}" }
    val multidex by lazy { "com.android.support:multidex:1.0.3" }
}

object DaggerDeps {
    val main by lazy { "com.google.dagger:dagger-android:${Versions.dagger_version}" }
    val support by lazy {
        "com.google.dagger:dagger-android-support:${Versions.dagger_version}"
    }// if you use the support libraries
    val compiler by lazy { "com.google.dagger:dagger-compiler:${Versions.dagger_version}" }
    val processer by lazy { "com.google.dagger:dagger-android-processor:${Versions.dagger_version}" }
}

object TestDeps {
    val junit by lazy { "junit:junit:${Versions.junit_version}" }
    val runner by lazy { "com.android.support.test:runner:${Versions.runner_version}" }
    val espresso_core by lazy {
        "com.android.support.test.espresso:espresso-core:${Versions.espresso_core_version}"
    }
    val test_live_data by lazy { "android.arch.core:core-testing:${Versions.life_cycle_version}" }
    val test_room by lazy { "android.arch.persistence.room:testing:${Versions.room_version}" }
}

object RetrofitDeps {
    val main by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp_version}" }
    val oki by lazy { "com.squareup.okio:okio:${Versions.oki_version}" }
    val logging by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp_version}" }
    val mockWebServer by lazy { "com.squareup.okhttp3:mockwebserver:${Versions.okhttp_version}" }
    val gson by lazy { "com.google.code.gson:gson:2.6.2" }
    val gson_converter by lazy { "com.squareup.retrofit2:converter-gson:2.0.1" }
}

object RxDeps {
    val main by lazy { "io.reactivex.rxjava2:rxjava:2.1.10" }
    val android by lazy { "io.reactivex.rxjava2:rxandroid:2.0.2" }
    val retrofit by lazy { "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit_version}" }
}

object ArchComponents {
    // ViewModel and LiveData
    val life_cycle_ext by lazy { "android.arch.lifecycle:extensions:${Versions.life_cycle_version}" }
    val life_cycle_compiler by lazy { "android.arch.lifecycle:compiler:${Versions.life_cycle_version}" }

    // alternatively, just ViewModel
    val view_model by lazy { "android.arch.lifecycle:viewmodel:${Versions.life_cycle_version}" }

    // alternatively, just LiveData
    val live_data by lazy { "android.arch.lifecycle:livedata:${Versions.life_cycle_version}" }

    val room by lazy { "android.arch.persistence.room:runtime:${Versions.room_version}" }
    val room_compiler by lazy { "android.arch.persistence.room:compiler:${Versions.room_version}" }

    val paging by lazy { "android.arch.paging:runtime:${Versions.paging_version}" }

}