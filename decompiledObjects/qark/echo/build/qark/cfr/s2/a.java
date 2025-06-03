/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package s2;

import A2.n;
import J2.e;
import J2.f;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import s2.b;
import s2.c;
import x2.k;
import x2.l;

public class a {
    public x2.a a;
    public f b;
    public boolean c;
    public final Object d = new Object();
    public c e;
    public final Context f;
    public final long g;

    public a(Context context, long l8, boolean bl, boolean bl2) {
        n.i((Object)context);
        Context context2 = context;
        if (bl) {
            Context context3 = context.getApplicationContext();
            context2 = context;
            if (context3 != null) {
                context2 = context3;
            }
        }
        this.f = context2;
        this.c = false;
        this.g = l8;
    }

    public static a a(Context object) {
        a a8;
        object = new a((Context)object, -1L, true, false);
        try {
            long l8 = SystemClock.elapsedRealtime();
            object.d(false);
            a8 = object.f(-1);
            object.e(a8, true, 0.0f, SystemClock.elapsedRealtime() - l8, "", null);
        }
        catch (Throwable throwable) {
            try {
                object.e(null, true, 0.0f, -1L, "", throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                object.c();
                throw throwable2;
            }
        }
        object.c();
        return a8;
    }

    public static void b(boolean bl) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c() {
        block7 : {
            n.h("Calling this from your main thread can lead to deadlock");
            // MONITORENTER : this
            if (this.f == null) ** GOTO lbl23
            var1_1 = this.a;
            if (var1_1 != null) break block7;
            return;
            {
                catch (Throwable var1_3) {
                    throw var1_3;
                }
            }
        }
        try {
            if (this.c) {
                D2.b.b().c(this.f, this.a);
            }
            ** GOTO lbl18
        }
        catch (Throwable var1_2) {
            Log.i((String)"AdvertisingIdClient", (String)"AdvertisingIdClient unbindService failed.", (Throwable)var1_2);
lbl18: // 2 sources:
            this.c = false;
            this.b = null;
            this.a = null;
            // MONITOREXIT : this
            return;
lbl23: // 1 sources:
            // MONITOREXIT : this
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d(boolean bl) {
        n.h("Calling this from your main thread can lead to deadlock");
        // MONITORENTER : this
        if (this.c) {
            this.c();
        }
        Object object = this.f;
        try {
            object.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new l(9);
        }
        int n8 = k.f().h((Context)object, 12451000);
        if (n8 != 0) {
            if (n8 != 2) throw new IOException("Google Play services not available");
        }
        x2.a a8 = new x2.a();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        boolean bl2 = D2.b.b().a((Context)object, intent, a8, 1);
        if (!bl2) throw new IOException("Connection failure");
        {
            catch (Throwable throwable) {
                throw new IOException(throwable);
            }
        }
        this.a = a8;
        object = e.n(a8.a(10000L, TimeUnit.MILLISECONDS));
        this.b = object;
        this.c = true;
        if (bl) {
            this.g();
        }
        // MONITOREXIT : this
        return;
        catch (Throwable throwable) {
            throw new IOException(throwable);
        }
        catch (InterruptedException interruptedException) {
            throw new IOException("Interrupted exception");
        }
    }

    public final boolean e(a object, boolean bl, float f8, long l8, String string2, Throwable throwable) {
        if (Math.random() <= 0.0) {
            HashMap hashMap = new HashMap();
            string2 = "1";
            hashMap.put((Object)"app_context", (Object)"1");
            if (object != null) {
                if (!object.b()) {
                    string2 = "0";
                }
                hashMap.put((Object)"limit_ad_tracking", (Object)string2);
                object = object.a();
                if (object != null) {
                    hashMap.put((Object)"ad_id_size", (Object)Integer.toString((int)object.length()));
                }
            }
            if (throwable != null) {
                hashMap.put((Object)"error", (Object)throwable.getClass().getName());
            }
            hashMap.put((Object)"tag", (Object)"AdvertisingIdClient");
            hashMap.put((Object)"time_spent", (Object)Long.toString((long)l8));
            new b(this, (Map)hashMap).start();
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final a f(int var1_1) {
        block14 : {
            n.h("Calling this from your main thread can lead to deadlock");
            // MONITORENTER : this
            if (this.c) ** GOTO lbl26
            var2_2 = this.d;
            // MONITORENTER : var2_2
            {
                catch (Throwable var2_5) {
                    throw var2_5;
                }
            }
            var3_6 = this.e;
            if (var3_6 == null || !var3_6.r) break block14;
            // MONITOREXIT : var2_2
            try {
                this.d(false);
                if (this.c == false) throw new IOException("AdvertisingIdClient cannot reconnect.");
                ** GOTO lbl26
            }
            catch (Exception var2_3) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", (Throwable)var2_3);
            }
        }
        try {
            throw new IOException("AdvertisingIdClient is not connected.");
        }
        catch (Throwable var3_7) {}
        throw var3_7;
lbl26: // 2 sources:
        n.i(this.a);
        n.i(this.b);
        try {
            var2_2 = new a(this.b.c(), this.b.a0(true));
            // MONITOREXIT : this
        }
        catch (RemoteException var2_4) {
            Log.i((String)"AdvertisingIdClient", (String)"GMS remote exception ", (Throwable)var2_4);
            throw new IOException("Remote exception");
        }
        this.g();
        return var2_2;
    }

    public final void finalize() {
        this.c();
        super.finalize();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void g() {
        long l8;
        block7 : {
            Object object = this.d;
            // MONITORENTER : object
            c c8 = this.e;
            if (c8 != null) {
                c8.q.countDown();
                this.e.join();
            }
            break block7;
            catch (InterruptedException interruptedException) {}
        }
        if ((l8 = this.g) > 0L) {
            this.e = new c(this, l8);
        }
        // MONITOREXIT : object
    }

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String string2, boolean bl) {
            this.a = string2;
            this.b = bl;
        }

        public String a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public String toString() {
            String string2 = this.a;
            boolean bl = this.b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)string2).length() + 7);
            stringBuilder.append("{");
            stringBuilder.append(string2);
            stringBuilder.append("}");
            stringBuilder.append(bl);
            return stringBuilder.toString();
        }
    }

}

