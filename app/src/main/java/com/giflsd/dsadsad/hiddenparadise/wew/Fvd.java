package com.giflsd.dsadsad.hiddenparadise.wew;

import android.net.Uri;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.giflsd.dsadsad.hiddenparadise.MMMMM;

public class Fvd {

    public static String jjjjj = null;
    public static String ieiiei;

    public static void fvd(String ff,HP hp){

        FacebookSdk.setApplicationId(ff);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(hp.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(hp.getApplication());
        AppLinkData.fetchDeferredAppLinkData(hp.getApplicationContext(),
                new AppLinkData.CompletionHandler() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                        if (appLinkData == null) {
                            appLinkData = AppLinkData.createFromActivity(hp);
                        }
                        if (appLinkData != null) {
                            Uri url = appLinkData.getTargetUri();
                            jjjjj = url.getQuery();
                            ieiiei = MMMMM.p(jjjjj,hp.getPackageName(), Ap.qqwqew,Ap.kkkksdsk);

                        }else {

                        }
                    }

                }
        );

    }
}
