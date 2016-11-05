package scut.carson_ho.demo_service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Carson_Ho on 16/11/5.
 */
public class MyService extends Service {

    private MyBinder mBinder = new MyBinder();

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("执行了onCreat()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("执行了onStartCommand()");
        return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("执行了onDestory()");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("执行了onBind()");
        //返回实例
        return mBinder;
    }


    @Override
    public boolean onUnbind(Intent intent) {
        System.out.println("执行了onUnbind()");
        return super.onUnbind(intent);
    }

    //新建一个子类继承自Binder类
    class MyBinder extends Binder {

        public void service_connect_Activity() {
            System.out.println("Service关联了Activity,并在Activity执行了Service的方法");

        }
    }
}
