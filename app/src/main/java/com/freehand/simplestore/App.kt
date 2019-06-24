package com.freehand.simplestore


import com.freehand.dynamicfunction.DynamicFunctionService
import com.freehand.fetcher.FetcherConfig
import com.freehand.fetcher.FetcherErrorCallback
import com.freehand.logger.LogcatLog
import com.freehand.logger.Logger
import com.freehand.realmprovider.RealmApplication
import com.freehand.realmprovider.RealmProvider
import com.freehand.realmprovider.RealmUtility

class App : RealmApplication() {
    override fun onCreate() {
        super.onCreate()
        RealmUtility.realmProvider = RealmProvider(this, "SampleDB")
        FetcherConfig.addErrorHandle(object : FetcherErrorCallback {
            override fun onError(throwable: Throwable) {
                Logger.log().e("minh1", throwable)
            }

            override fun onError(errorCode: Int, message: String) {
                Logger.log().d("minh", message)
            }
        })

        DynamicFunctionService.enableLog(true)
        if (BuildConfig.DEBUG) {
            Logger.setDefaultLog(LogcatLog())
        }

    }
}