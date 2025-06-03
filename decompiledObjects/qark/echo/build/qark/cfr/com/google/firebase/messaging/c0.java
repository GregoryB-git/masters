/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.F;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Y;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c0
implements Runnable {
    public final long o;
    public final PowerManager.WakeLock p;
    public final FirebaseMessaging q;
    public ExecutorService r = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), (ThreadFactory)new F2.a("firebase-iid-executor"));

    public c0(FirebaseMessaging firebaseMessaging, long l8) {
        this.q = firebaseMessaging;
        this.o = l8;
        firebaseMessaging = ((PowerManager)this.b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.p = firebaseMessaging;
        firebaseMessaging.setReferenceCounted(false);
    }

    public static boolean c() {
        if (!(Log.isLoggable((String)"FirebaseMessaging", (int)3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable((String)"FirebaseMessaging", (int)3))) {
            return false;
        }
        return true;
    }

    public Context b() {
        return this.q.q();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager)this.b().getSystemService("connectivity");
        connectivityManager = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (connectivityManager != null && connectivityManager.isConnected()) {
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean e() {
        String string2;
        block6 : {
            try {
                if (this.q.n() == null) {
                    Log.e((String)"FirebaseMessaging", (String)"Token retrieval failed: null");
                    return false;
                }
                if (!Log.isLoggable((String)"FirebaseMessaging", (int)3)) return true;
                Log.d((String)"FirebaseMessaging", (String)"Token successfully retrieved");
                return true;
            }
            catch (SecurityException securityException) {}
            string2 = "Token retrieval failed with SecurityException. Will retry token retrieval";
            break block6;
            catch (IOException iOException) {}
            if (F.h(iOException.getMessage())) {
                string2 = new StringBuilder();
                string2.append("Token retrieval failed: ");
                string2.append(iOException.getMessage());
                string2.append(". Will retry token retrieval");
                string2 = string2.toString();
            } else {
                if (iOException.getMessage() != null) throw iOException;
                string2 = "Token retrieval failed without exception message. Will retry token retrieval";
            }
        }
        Log.w((String)"FirebaseMessaging", (String)string2);
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Throwable throwable2;
        block18 : {
            block19 : {
                block20 : {
                    IOException iOException2;
                    block17 : {
                        block16 : {
                            block15 : {
                                if (Y.b().e(this.b())) {
                                    this.p.acquire();
                                }
                                this.q.O(true);
                                if (this.q.z()) break block15;
                                this.q.O(false);
                                if (Y.b().e(this.b())) {
                                    this.p.release();
                                }
                                return;
                            }
                            if (!Y.b().d(this.b()) || this.d()) break block16;
                            new a(this).a();
                            if (Y.b().e(this.b())) {
                                this.p.release();
                            }
                            return;
                        }
                        try {
                            if (this.e()) {
                                this.q.O(false);
                                break block17;
                            }
                            this.q.S(this.o);
                        }
                        catch (Throwable throwable2) {
                            break block18;
                        }
                        catch (IOException iOException2) {}
                    }
                    if (!Y.b().e(this.b())) break block19;
                    break block20;
                    {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                        stringBuilder.append(iOException2.getMessage());
                        stringBuilder.append(". Won't retry the operation.");
                        Log.e((String)"FirebaseMessaging", (String)stringBuilder.toString());
                        this.q.O(false);
                    }
                    if (!Y.b().e(this.b())) break block19;
                }
                this.p.release();
                return;
            }
            return;
        }
        if (Y.b().e(this.b())) {
            this.p.release();
        }
        throw throwable2;
    }

    public static class a
    extends BroadcastReceiver {
        public c0 a;

        public a(c0 c02) {
            this.a = c02;
        }

        public void a() {
            if (c0.c()) {
                Log.d((String)"FirebaseMessaging", (String)"Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.a.b().registerReceiver((BroadcastReceiver)this, intentFilter);
        }

        public void onReceive(Context object, Intent intent) {
            object = this.a;
            if (object == null) {
                return;
            }
            if (!object.d()) {
                return;
            }
            if (c0.c()) {
                Log.d((String)"FirebaseMessaging", (String)"Connectivity changed. Starting background sync.");
            }
            this.a.q.p(this.a, 0L);
            this.a.b().unregisterReceiver((BroadcastReceiver)this);
            this.a = null;
        }
    }

}

