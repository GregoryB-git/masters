// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import java.io.IOException;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.content.Context;
import android.os.Build$VERSION;
import android.util.Log;
import android.os.PowerManager;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import F2.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import android.os.PowerManager$WakeLock;

public class c0 implements Runnable
{
    public final long o;
    public final PowerManager$WakeLock p;
    public final FirebaseMessaging q;
    public ExecutorService r;
    
    public c0(final FirebaseMessaging q, final long o) {
        this.r = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new F2.a("firebase-iid-executor"));
        this.q = q;
        this.o = o;
        (this.p = ((PowerManager)this.b().getSystemService("power")).newWakeLock(1, "fiid-sync")).setReferenceCounted(false);
    }
    
    public static /* synthetic */ FirebaseMessaging a(final c0 c0) {
        return c0.q;
    }
    
    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
    
    public Context b() {
        return this.q.q();
    }
    
    public boolean d() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        if (connectivityManager != null) {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        else {
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    public boolean e() {
        while (true) {
            try {
                if (this.q.n() == null) {
                    Log.e("FirebaseMessaging", "Token retrieval failed: null");
                    return false;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Token successfully retrieved");
                }
                return true;
                // iftrue(Label_0113:, ex.getMessage() != null)
                // iftrue(Label_0100:, !F.h(ex.getMessage()))
            Label_0042:
                while (true) {
                    Block_6: {
                        break Block_6;
                        final IOException ex;
                        String string;
                        while (true) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Token retrieval failed: ");
                            sb.append(ex.getMessage());
                            sb.append(". Will retry token retrieval");
                            string = sb.toString();
                            break Label_0042;
                            continue;
                        }
                        Label_0113: {
                            throw ex;
                        }
                        Log.w("FirebaseMessaging", string);
                        return false;
                    }
                    String string = "Token retrieval failed without exception message. Will retry token retrieval";
                    continue Label_0042;
                }
            }
            catch (SecurityException ex3) {}
            catch (IOException ex2) {}
            final IOException ex2;
            final IOException ex = ex2;
            continue;
        }
    }
    
    @Override
    public void run() {
        Label_0020: {
            if (!Y.b().e(this.b())) {
                break Label_0020;
            }
            this.p.acquire();
            try {
                Label_0075: {
                    try {
                        this.q.O(true);
                        if (!this.q.z()) {
                            this.q.O(false);
                            if (Y.b().e(this.b())) {
                                this.p.release();
                            }
                            return;
                        }
                        break Label_0075;
                    }
                    finally {
                        if (Y.b().e(this.b())) {
                            this.p.release();
                        }
                        Label_0242: {
                            return;
                        }
                        // iftrue(Label_0127:, !Y.b().d(this.b()) || this.d())
                        // iftrue(Label_0242:, !Y.b().e(this.b()))
                        // iftrue(Label_0126:, !Y.b().e(this.b()))
                        // iftrue(Label_0242:, !Y.b().e(this.b()))
                        // iftrue(Label_0145:, !this.e())
                        Block_12: {
                            while (true) {
                                this.p.release();
                                return;
                                Block_9: {
                                    break Block_9;
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                                    final IOException ex;
                                    sb.append(ex.getMessage());
                                    sb.append(". Won't retry the operation.");
                                    Log.e("FirebaseMessaging", sb.toString());
                                    this.q.O(false);
                                    break Block_12;
                                }
                                new a(this).a();
                                continue;
                            }
                            while (true) {
                                break Block_12;
                                Label_0127:
                                Block_11: {
                                    break Block_11;
                                    Label_0145:
                                    this.q.S(this.o);
                                    continue;
                                }
                                this.q.O(false);
                                continue;
                            }
                            Label_0126:
                            return;
                        }
                        this.p.release();
                    }
                }
            }
            catch (IOException ex2) {}
        }
    }
    
    public static class a extends BroadcastReceiver
    {
        public c0 a;
        
        public a(final c0 a) {
            this.a = a;
        }
        
        public void a() {
            if (c0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.b().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public void onReceive(final Context context, final Intent intent) {
            final c0 a = this.a;
            if (a == null) {
                return;
            }
            if (!a.d()) {
                return;
            }
            if (c0.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            c0.a(this.a).p(this.a, 0L);
            this.a.b().unregisterReceiver((BroadcastReceiver)this);
            this.a = null;
        }
    }
}
