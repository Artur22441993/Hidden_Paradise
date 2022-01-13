package com.giflsd.dsadsad.hiddenparadise;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

import com.giflsd.dsadsad.hiddenparadise.wew.HP;
import com.onesignal.OneSignal;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;

public class MMMMM extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ImageView imageView;
    private Handler handler = new Handler();
    private Display display;
    private int width;
    private int height;
    private int size;
    private int x1;
    private int x0;
    private int x2;
    private int c =0;
    public static String dsds;
    public static String sub6;
    public static String sub7;
    public static String sub2;
    public static String sub3;
    public static String sub4;
    public static String sub5;

    private List<ImageView> imageViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constrainLayout);
        display = getWindowManager().getDefaultDisplay();
        width = display.getWidth();
        height = display.getHeight();

        size = width/5;

        imageViewList = new ArrayList<ImageView>();

        handler.post(runnableEmergence);
        handler.post(runnableMove);
        handler.post(runnableSpin);



    }

    private Runnable runnableEmergence = new Runnable() {
        @Override
        public void run() {

             x1 = width/2;
             x0 = x1/2;
             x2 = x1+x0;

            imageView = new ImageView(MMMMM.this);
            imageView.setImageResource(R.drawable.ic_slots_1);


            ConstraintLayout.LayoutParams imageViewLayoutParams =
                    new ConstraintLayout.LayoutParams(size,size);

                    imageView.setLayoutParams(imageViewLayoutParams);
                    constraintLayout.addView(imageView);
                    imageViewList.add(imageView);

                    Random random = new Random();
                    int r = random.nextInt(3);
                    switch (r){
                        case 0:
                            imageView.setY(-size);
                            imageView.setX(x0-size/2);
                            break;
                        case 1:
                            imageView.setY(-size);
                            imageView.setX(x1-size/2);
                            break;
                        case 2:
                            imageView.setY(-size);
                            imageView.setX(x2-size/2);
                            break;

                    }

            handler.postDelayed(this::run,500);
        }
    };


    private Runnable runnableMove = new Runnable() {
        @Override
        public void run() {
            for (int i =0; i < imageViewList.size(); i++){
                ImageView imageView = imageViewList.get(i);
                imageView.setY(imageView.getY() + 10);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        imageViewList.remove(imageView);
                        constraintLayout.removeView(imageView);
                        c++;
                        getSupportActionBar().setTitle(""+c);;
                    }
                });
            }

            handler.postDelayed(this::run,10);
        }

    };

    private Runnable runnableSpin = new Runnable() {
        @Override
        public void run() {

            for (int i =0; i < imageViewList.size(); i++){
                ImageView imageView = imageViewList.get(i);
                int r = (int) imageView.getRotation();
                imageView.setRotation(r+5);


            }


            handler.postDelayed(this::run,10);
        }
    };

    public static int d(HP hp){
        int dsoe = Settings.Secure.getInt(hp.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return dsoe;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String decooo(String dsd ){
        Base64.Decoder dec = Base64.getDecoder();
        String dsdd = new String(dec.decode(dsd));
        return dsdd;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String p(String dsda, String kkds, String lll, String jdsd){



        String[] jdsdy = dsda.split("::");
        try {
            dsds = jdsdy[0];
        }catch (Exception e){
            dsds = "";
        }
        try {
            sub6 = jdsdy[1];
        }catch (Exception e){
            sub6 = "";
        }

        try {
            sub7 = jdsdy[2];
        }catch (Exception e){
            sub7 = "";

        }

        try {
            sub2 = jdsdy[3];
        }catch (Exception e){
            sub2 = "";
        }

        try {
            sub3 = jdsdy[4];
        }catch (Exception e){
            sub3 = "";
        }


        try {
            sub4 = jdsdy[5];
        }catch (Exception e){
            sub4 = "";
        }

        try {
            sub5 = jdsdy[6];
        }catch (Exception e){
            sub5 = "";
        }

        OneSignal.sendTag(MMMMM.decooo("c3ViX2FwcA=="),sub6);

        String kkkk = "?bundle=" + kkds + "&ad_id=" + lll + "&apps_id=" + jdsd +
                "&sub6=" + sub6 +
                "&sub7=" + sub7 +
                "&sub2=" + sub2 +
                "&sub3=" + sub3 +
                "&sub4=" + sub4 +
                "&sub5=" + sub5;

        return  dsds + kkkk;
    }
}