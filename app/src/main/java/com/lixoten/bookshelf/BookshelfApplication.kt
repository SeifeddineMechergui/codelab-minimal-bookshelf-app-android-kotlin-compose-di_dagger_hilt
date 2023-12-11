package com.lixoten.bookshelf

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BookshelfApplication: Application()
//{
//    /** AppContainer instance used by the rest of classes to obtain dependencies */
//    lateinit var container: AppContainer
//    override fun onCreate() {
//        super.onCreate()
//        container = DefaultAppContainer()
//    }
//}