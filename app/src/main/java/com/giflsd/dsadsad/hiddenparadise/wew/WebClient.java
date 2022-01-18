package com.giflsd.dsadsad.hiddenparadise.wew;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.giflsd.dsadsad.hiddenparadise.MMMMM;

public class WebClient extends WebViewClient {

    HP hp;

    public WebClient(HP hp) {
        this.hp = hp;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains("404")){
            hp.startActivity(new Intent(hp.getApplicationContext(), MMMMM.class));
            hp.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        hp.getSharedPreferences(hp.getPackageName(), hp.MODE_PRIVATE).edit().putString(MMMMM.decooo("c2F2ZWRVcmw="),url).apply();
    }
}
