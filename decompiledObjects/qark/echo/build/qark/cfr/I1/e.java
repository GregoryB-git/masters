/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 *  java.lang.Boolean
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.List
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 */
package I1;

import G1.g;
import I1.d;
import O1.P;
import O1.k;
import W5.m;
import Z1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class e {
    public static final e a = new e();
    public static final String b = e.class.getSimpleName();
    public static Boolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean b() {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            Context context;
            if (c == null) {
                context = B.l();
                boolean bl = a.a(context) != null;
                c = bl;
            }
            if ((context = c) != null) return context.booleanValue();
            return false;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, e.class);
        return false;
    }

    public static final c c(String object, List list) {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "applicationId");
            Intrinsics.checkNotNullParameter((Object)list, "appEvents");
            object = a.d(a.q, (String)object, list);
            return object;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, e.class);
            return null;
        }
    }

    public static final c e(String object) {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "applicationId");
            object = a.d(a.p, (String)object, m.f());
            return object;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, e.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent a(Context context) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                boolean bl;
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && k.a(context, "com.facebook.katana")) {
                    return intent;
                }
                intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent, 0) != null && (bl = k.a(context, "com.facebook.wakizashi"))) {
                    return intent;
                }
            }
            return null;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final c d(a var1_1, String var2_4, List var3_5) {
        block16 : {
            if (T1.a.d(this)) {
                return null;
            }
            var5_8 = c.p;
            g.b();
            var7_9 = B.l();
            var8_10 = this.a(var7_9);
            var6_11 = var5_8;
            if (var8_10 == null) return var6_11;
            var6_11 = new b();
            var4_12 = var7_9.bindService(var8_10, (ServiceConnection)var6_11, 1);
            if (var4_12 == false) return c.q;
            {
                catch (Throwable var1_2) {}
            }
            var8_10 = var6_11.a();
            if (var8_10 == null) break block16;
            var5_8 = a.a.n((IBinder)var8_10);
            if ((var1_1 = d.a((a)var1_1, (String)var2_4, var3_5)) != null) {
                var5_8.O((Bundle)var1_1);
                var2_4 = P.a;
                P.j0(e.b, Intrinsics.i("Successfully sent events to the remote service: ", var1_1));
            }
            var5_8 = c.o;
        }
        var7_9.unbindService((ServiceConnection)var6_11);
        var1_1 = P.a;
        P.j0(e.b, "Unbound from the remote service");
        return var5_8;
        {
            T1.a.b(var1_2, this);
            return null;
lbl32: // 2 sources:
            var1_1 = c.q;
            var2_4 = P.a;
            var2_4 = e.b;
            P.i0((String)var2_4, (Exception)var3_6);
            {
                var7_9.unbindService((ServiceConnection)var6_11);
lbl37: // 2 sources:
                do {
                    P.j0((String)var2_4, "Unbound from the remote service");
                    return var1_1;
                    break;
                } while (true);
            }
lbl40: // 1 sources:
            do {
                try {
                    var1_1 = c.q;
                    var2_4 = P.a;
                    var2_4 = e.b;
                    P.i0((String)var2_4, (Exception)var3_7);
                }
                catch (Throwable var1_3) {}
                var7_9.unbindService((ServiceConnection)var6_11);
                ** continue;
                var7_9.unbindService((ServiceConnection)var6_11);
                var2_4 = P.a;
                P.j0(e.b, "Unbound from the remote service");
                throw var1_3;
                break;
            } while (true);
        }
        catch (RemoteException var3_6) {
            ** GOTO lbl32
        }
        catch (InterruptedException var3_7) {
            ** continue;
        }
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a p = new a("MOBILE_APP_INSTALL");
        public static final /* enum */ a q = new a("CUSTOM_APP_EVENTS");
        public static final /* synthetic */ a[] r;
        public final String o;

        static {
            r = a.c();
        }

        public a(String string3) {
            this.o = string3;
        }

        public static final /* synthetic */ a[] c() {
            return new a[]{p, q};
        }

        public static a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            a[] arra = r;
            return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }

        public String toString() {
            return this.o;
        }
    }

    public static final class b
    implements ServiceConnection {
        public final CountDownLatch a = new CountDownLatch(1);
        public IBinder b;

        public final IBinder a() {
            this.a.await(5L, TimeUnit.SECONDS);
            return this.b;
        }

        public void onNullBinding(ComponentName componentName) {
            Intrinsics.checkNotNullParameter((Object)componentName, "name");
            this.a.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Intrinsics.checkNotNullParameter((Object)componentName, "name");
            Intrinsics.checkNotNullParameter((Object)iBinder, "serviceBinder");
            this.b = iBinder;
            this.a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.checkNotNullParameter((Object)componentName, "name");
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o = new c();
        public static final /* enum */ c p = new c();
        public static final /* enum */ c q = new c();
        public static final /* synthetic */ c[] r;

        static {
            r = c.c();
        }

        public static final /* synthetic */ c[] c() {
            return new c[]{o, p, q};
        }

        public static c valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            c[] arrc = r;
            return (c[])Arrays.copyOf((Object[])arrc, (int)arrc.length);
        }
    }

}

