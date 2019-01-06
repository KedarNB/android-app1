package com.app.kedar.myapp1.function;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class FirstService extends Service {

    private static String TAG = "kd3002.firstservice";

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        // TODO Auto-generated method stub
        super.onStart(intent, startId);
        Log.d(TAG, "FirstService started");
        Toast.makeText(this,"This is Starting of Service",Toast.LENGTH_SHORT);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Toast.makeText(this,"This is middle of Service",Toast.LENGTH_SHORT);

        this.stopSelf();
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d(TAG, "FirstService destroyed");
        Toast.makeText(this,"This is Destroying of Service",Toast.LENGTH_SHORT);

    }
}
