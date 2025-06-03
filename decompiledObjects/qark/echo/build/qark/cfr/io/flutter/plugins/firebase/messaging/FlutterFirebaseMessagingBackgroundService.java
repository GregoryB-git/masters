/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.util.Log
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Objects
 *  java.util.concurrent.CountDownLatch
 */
package io.flutter.plugins.firebase.messaging;

import O5.e;
import O5.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.messaging.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import v5.j;

public class FlutterFirebaseMessagingBackgroundService
extends a {
    public static final List x = Collections.synchronizedList((List)new LinkedList());
    public static e y;

    public static /* synthetic */ void j(Intent intent, CountDownLatch countDownLatch) {
        y.d(intent, countDownLatch);
    }

    public static void k(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        Objects.requireNonNull((Object)bundle);
        int n8 = ((T)bundle.get("notification")).S();
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, bl);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void m() {
        Log.i((String)"FLTFireMsgService", (String)"FlutterFirebaseMessagingBackgroundService started!");
        List list = x;
        synchronized (list) {
            try {
                Iterator iterator = list.iterator();
                do {
                    if (!iterator.hasNext()) {
                        x.clear();
                        return;
                    }
                    Intent intent = (Intent)iterator.next();
                    y.d(intent, null);
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void n(long l8) {
        e.m(l8);
    }

    public static void o(long l8) {
        e.n(l8);
    }

    public static void p(long l8, j j8) {
        e e8;
        if (y != null) {
            Log.w((String)"FLTFireMsgService", (String)"Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        y = e8 = new e();
        e8.p(l8, j8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void g(Intent intent) {
        if (!y.h()) {
            Log.w((String)"FLTFireMsgService", (String)"A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List list = x;
        // MONITORENTER : list
        if (y.i()) {
            Log.i((String)"FLTFireMsgService", (String)"Service has not yet started, messages will be queued.");
            list.add((Object)intent);
            // MONITOREXIT : list
            return;
        }
        // MONITOREXIT : list
        list = new CountDownLatch(1);
        new Handler(this.getMainLooper()).post((Runnable)new f(intent, (CountDownLatch)list));
        try {
            list.await();
            return;
        }
        catch (InterruptedException interruptedException) {
            Log.i((String)"FLTFireMsgService", (String)"Exception waiting to execute Dart callback", (Throwable)interruptedException);
            return;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (y == null) {
            y = new e();
        }
        y.o();
    }
}

