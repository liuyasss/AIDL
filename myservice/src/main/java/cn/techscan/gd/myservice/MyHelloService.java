package cn.techscan.gd.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by cloverss on 2017/4/10.
 */

public class MyHelloService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    private ICloverInterface.Stub iBinder = new ICloverInterface.Stub() {
        @Override
        public String helloWord() throws RemoteException {
            return "Hello World";
        }
    };
}
