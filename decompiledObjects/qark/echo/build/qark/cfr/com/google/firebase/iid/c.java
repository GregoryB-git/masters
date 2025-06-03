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
 *  java.util.concurrent.ExecutorService
 */
package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p4.k;
import p4.s;
import s3.e;

public class c
implements Runnable {
    public final long o;
    public final PowerManager.WakeLock p;
    public final FirebaseInstanceId q;
    public ExecutorService r = p4.b.b();

    public c(FirebaseInstanceId firebaseInstanceId, long l8) {
        this.q = firebaseInstanceId;
        this.o = l8;
        firebaseInstanceId = ((PowerManager)this.b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.p = firebaseInstanceId;
        firebaseInstanceId.setReferenceCounted(false);
    }

    public Context b() {
        return this.q.h().m();
    }

    public boolean c() {
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
    public boolean d() {
        String string2;
        block7 : {
            b.a a8 = this.q.p();
            if (!this.q.F(a8)) {
                return true;
            }
            try {
                if (this.q.d() == null) {
                    Log.e((String)"FirebaseInstanceId", (String)"Token retrieval failed: null");
                    return false;
                }
                if (!Log.isLoggable((String)"FirebaseInstanceId", (int)3)) return true;
                Log.d((String)"FirebaseInstanceId", (String)"Token successfully retrieved");
                return true;
            }
            catch (SecurityException securityException) {}
            string2 = "Token retrieval failed with SecurityException. Will retry token retrieval";
            break block7;
            catch (IOException iOException) {}
            if (k.g(iOException.getMessage())) {
                string2 = iOException.getMessage();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)string2).length() + 52);
                stringBuilder.append("Token retrieval failed: ");
                stringBuilder.append(string2);
                stringBuilder.append(". Will retry token retrieval");
                string2 = stringBuilder.toString();
            } else {
                if (iOException.getMessage() != null) throw iOException;
                string2 = "Token retrieval failed without exception message. Will retry token retrieval";
            }
        }
        Log.w((String)"FirebaseInstanceId", (String)string2);
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        block13 : {
            block14 : {
                block12 : {
                    block11 : {
                        block10 : {
                            if (s.a().c(this.b())) {
                                this.p.acquire();
                            }
                            this.q.C(true);
                            if (this.q.s()) break block10;
                            this.q.C(false);
                            if (s.a().c(this.b()) == false) return;
                            break block14;
                        }
                        if (!s.a().b(this.b()) || this.c()) break block11;
                        new a(this).a();
                        if (s.a().c(this.b()) == false) return;
                        break block14;
                    }
                    try {
                        if (this.d()) {
                            this.q.C(false);
                            break block12;
                        }
                        this.q.E(this.o);
                    }
                    catch (Throwable var1_1) {
                        break block13;
                    }
                    catch (IOException var1_2) {}
                }
                if (s.a().c(this.b()) == false) return;
            }
lbl24: // 2 sources:
            do {
                this.p.release();
                return;
                break;
            } while (true);
            {
                var1_3 = var1_2.getMessage();
                var2_4 = new StringBuilder(String.valueOf((Object)var1_3).length() + 93);
                var2_4.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                var2_4.append(var1_3);
                var2_4.append(". Won't retry the operation.");
                Log.e((String)"FirebaseInstanceId", (String)var2_4.toString());
                this.q.C(false);
            }
            if (s.a().c(this.b()) == false) return;
            ** while (true)
        }
        if (!s.a().c(this.b())) {
            throw var1_1;
        }
        this.p.release();
        throw var1_1;
    }

    public static class a
    extends BroadcastReceiver {
        public c a;

        public a(c c8) {
            this.a = c8;
        }

        public void a() {
            if (FirebaseInstanceId.r()) {
                Log.d((String)"FirebaseInstanceId", (String)"Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.a.b().registerReceiver((BroadcastReceiver)this, intentFilter);
        }

        public void onReceive(Context object, Intent intent) {
            object = this.a;
            if (object == null) {
                return;
            }
            if (!object.c()) {
                return;
            }
            if (FirebaseInstanceId.r()) {
                Log.d((String)"FirebaseInstanceId", (String)"Connectivity changed. Starting background sync.");
            }
            this.a.q.g(this.a, 0L);
            this.a.b().unregisterReceiver((BroadcastReceiver)this);
            this.a = null;
        }
    }

}

