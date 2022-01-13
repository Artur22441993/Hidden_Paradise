package com.giflsd.dsadsad.hiddenparadise.wew;

import android.app.Application;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.giflsd.dsadsad.hiddenparadise.MMMMM;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;

public class Ap extends Application {

    public static String kkkksdsk;
    public static String ppoiuy = "";
    public static String qqwqew;
    public static String jfjdj;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(MMMMM.decooo("Njc4Nzk5YzYtNDY1Ny00ZTgwLWE5MWQtOTVhNzY1YWY1NmQz"));
        dfd();
        kkkksdsk = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        dsd();


    }

    private void dfd(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    qqwqew = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void dsd(){

        AppsFlyerLib.getInstance().init(MMMMM.decooo("cW80R0x1alJqWnMzcmpQZG5OS0hRYQ=="), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                ppoiuy = map.get(MMMMM.decooo("YWZfc3RhdHVz")).toString();
                if (ppoiuy.equals(MMMMM.decooo("Tm9uLW9yZ2FuaWM="))){
                    String lok =map.get(MMMMM.decooo("Y2FtcGFpZ24=")).toString();
                    jfjdj = MMMMM.p(lok,getPackageName(), qqwqew, kkkksdsk);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);
    }
}
