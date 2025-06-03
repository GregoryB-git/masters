// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.messaging;

import android.os.BaseBundle;
import android.os.IBinder;
import O5.f;
import android.os.Handler;
import v5.j;
import java.util.Iterator;
import android.util.Log;
import android.os.Bundle;
import com.google.firebase.messaging.T;
import java.util.Objects;
import android.content.Context;
import java.util.concurrent.CountDownLatch;
import android.content.Intent;
import java.util.Collections;
import java.util.LinkedList;
import O5.e;
import java.util.List;

public class FlutterFirebaseMessagingBackgroundService extends a
{
    public static final List x;
    public static O5.e y;
    
    static {
        x = Collections.synchronizedList(new LinkedList<Object>());
    }
    
    public static void k(final Context context, final Intent intent) {
        final Bundle extras = intent.getExtras();
        Objects.requireNonNull(extras);
        final int s = ((T)((BaseBundle)extras).get("notification")).S();
        boolean b = true;
        if (s != 1) {
            b = false;
        }
        a.d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, b);
    }
    
    public static void m() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        final List x = FlutterFirebaseMessagingBackgroundService.x;
        // monitorenter(x)
        while (true) {
            try {
                final Iterator<Intent> iterator = x.iterator();
                while (iterator.hasNext()) {
                    FlutterFirebaseMessagingBackgroundService.y.d(iterator.next(), null);
                }
                FlutterFirebaseMessagingBackgroundService.x.clear();
                // monitorexit(x)
                return;
                // monitorexit(x)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void n(final long n) {
        O5.e.m(n);
    }
    
    public static void o(final long n) {
        O5.e.n(n);
    }
    
    public static void p(final long n, final j j) {
        if (FlutterFirebaseMessagingBackgroundService.y != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        (FlutterFirebaseMessagingBackgroundService.y = new O5.e()).p(n, j);
    }
    
    @Override
    public void g(final Intent intent) {
        if (!FlutterFirebaseMessagingBackgroundService.y.h()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        Object x = FlutterFirebaseMessagingBackgroundService.x;
        // monitorenter(x)
        while (true) {
            try {
                if (FlutterFirebaseMessagingBackgroundService.y.i()) {
                    Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                    ((List<Intent>)x).add(intent);
                    // monitorexit(x)
                    return;
                }
                // monitorexit(x)
                x = new CountDownLatch(1);
                new Handler(((Context)this).getMainLooper()).post((Runnable)new O5.f(intent, (CountDownLatch)x));
                try {
                    ((CountDownLatch)x).await();
                    return;
                }
                catch (InterruptedException ex) {
                    Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", (Throwable)ex);
                    return;
                }
                // monitorexit(x)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        if (FlutterFirebaseMessagingBackgroundService.y == null) {
            FlutterFirebaseMessagingBackgroundService.y = new O5.e();
        }
        FlutterFirebaseMessagingBackgroundService.y.o();
    }
}
