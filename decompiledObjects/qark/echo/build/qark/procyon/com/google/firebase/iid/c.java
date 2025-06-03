// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.iid;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import p4.s;
import java.io.IOException;
import p4.k;
import android.util.Log;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.content.Context;
import android.os.PowerManager;
import p4.b;
import java.util.concurrent.ExecutorService;
import android.os.PowerManager$WakeLock;

public class c implements Runnable
{
    public final long o;
    public final PowerManager$WakeLock p;
    public final FirebaseInstanceId q;
    public ExecutorService r;
    
    public c(final FirebaseInstanceId q, final long o) {
        this.r = b.b();
        this.q = q;
        this.o = o;
        (this.p = ((PowerManager)this.b().getSystemService("power")).newWakeLock(1, "fiid-sync")).setReferenceCounted(false);
    }
    
    public static /* synthetic */ FirebaseInstanceId a(final c c) {
        return c.q;
    }
    
    public Context b() {
        return this.q.h().m();
    }
    
    public boolean c() {
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
    
    public boolean d() {
        if (!this.q.F(this.q.p())) {
            return true;
        }
        while (true) {
            try {
                if (this.q.d() == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Token successfully retrieved");
                }
                return true;
                Label_0146: {
                    throw;
                }
                // iftrue(Label_0146:, ex.getMessage() != null)
                while (true) {
                Label_0063_Outer:
                    while (true) {
                        String string = "Token retrieval failed without exception message. Will retry token retrieval";
                        while (true) {
                            Log.w("FirebaseInstanceId", string);
                            return false;
                            final IOException ex;
                            final String message = ex.getMessage();
                            final StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                            sb.append("Token retrieval failed: ");
                            sb.append(message);
                            sb.append(". Will retry token retrieval");
                            string = sb.toString();
                            continue;
                        }
                        Label_0133:
                        continue Label_0063_Outer;
                    }
                    continue;
                }
            }
            // iftrue(Label_0133:, !k.g(ex.getMessage()))
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
            if (!s.a().c(this.b())) {
                break Label_0020;
            }
            this.p.acquire();
            try {
                final IOException ex;
                String message;
                StringBuilder sb;
                Block_11_Outer:Label_0152_Outer:
                while (true) {
                    Label_0075: {
                        try {
                            this.q.C(true);
                            if (!this.q.s()) {
                                this.q.C(false);
                                if (s.a().c(this.b())) {
                                    this.p.release();
                                }
                                return;
                            }
                            break Label_0075;
                        }
                        finally {
                            if (s.a().c(this.b())) {
                                this.p.release();
                            }
                            Label_0122: {
                                return;
                            }
                            Label_0245:
                            return;
                            Label_0123:
                            // iftrue(Label_0141:, !this.d())
                            // iftrue(Label_0245:, !s.a().c(this.b()))
                            // iftrue(Label_0245:, !s.a().c(this.b()))
                            // iftrue(Label_0123:, !s.a().b(this.b()) || this.c())
                            // iftrue(Label_0122:, !s.a().c(this.b()))
                            Block_9: {
                                while (true) {
                                    while (true) {
                                        Block_10: {
                                            break Block_10;
                                            message = ex.getMessage();
                                            sb = new StringBuilder(String.valueOf(message).length() + 93);
                                            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                                            sb.append(message);
                                            sb.append(". Won't retry the operation.");
                                            Log.e("FirebaseInstanceId", sb.toString());
                                            this.q.C(false);
                                            continue Block_11_Outer;
                                        }
                                        this.q.C(false);
                                        continue Label_0152_Outer;
                                    }
                                    new a(this).a();
                                    break Block_9;
                                    Label_0141:
                                    this.q.E(this.o);
                                    continue;
                                }
                                continue Block_11_Outer;
                            }
                        }
                    }
                    break;
                }
            }
            catch (IOException ex2) {}
        }
    }
    
    public static class a extends BroadcastReceiver
    {
        public c a;
        
        public a(final c a) {
            this.a = a;
        }
        
        public void a() {
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.a.b().registerReceiver((BroadcastReceiver)this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        
        public void onReceive(final Context context, final Intent intent) {
            final c a = this.a;
            if (a == null) {
                return;
            }
            if (!a.c()) {
                return;
            }
            if (FirebaseInstanceId.r()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            c.a(this.a).g(this.a, 0L);
            this.a.b().unregisterReceiver((BroadcastReceiver)this);
            this.a = null;
        }
    }
}
