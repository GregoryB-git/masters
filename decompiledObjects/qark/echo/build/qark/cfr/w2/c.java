/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package w2;

import L2.a;
import V2.b;
import V2.i;
import V2.j;
import V2.k;
import V2.m;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w2.A;
import w2.B;
import w2.C;
import w2.D;
import w2.e;
import w2.g;
import w2.h;
import w2.w;
import w2.x;
import w2.y;
import w2.z;

public class c {
    public static int h;
    public static PendingIntent i;
    public static final Executor j;
    public static final Pattern k;
    public final t.h a = new t.h();
    public final Context b;
    public final x c;
    public final ScheduledExecutorService d;
    public Messenger e;
    public Messenger f;
    public h g;

    static {
        j = D.o;
        k = Pattern.compile((String)"\\|ID\\|([^|]+)\\|:?+(.*)");
    }

    public c(Context context) {
        this.b = context;
        this.c = new x(context);
        this.e = new Messenger((Handler)new e(this, Looper.getMainLooper()));
        context = new ScheduledThreadPoolExecutor(1);
        context.setKeepAliveTime(60L, TimeUnit.SECONDS);
        context.allowCoreThreadTimeOut(true);
        this.d = context;
    }

    public static /* synthetic */ j b(Bundle bundle) {
        if (c.j(bundle)) {
            return m.e(null);
        }
        return m.e((Object)bundle);
    }

    public static String g() {
        synchronized (c.class) {
            int n8 = h;
            h = n8 + 1;
            String string2 = Integer.toString((int)n8);
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(Context context, Intent intent) {
        synchronized (c.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = a.a(context, 0, intent2, a.a);
                }
                intent.putExtra("app", (Parcelable)i);
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    public static boolean j(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    public j a(Bundle bundle) {
        if (this.c.a() < 12000000) {
            if (this.c.b() != 0) {
                return this.f(bundle).h(j, new y(this, bundle));
            }
            return m.d((Exception)new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return w.b(this.b).d(1, bundle).g(j, z.a);
    }

    public final /* synthetic */ j c(Bundle bundle, j j8) {
        if (!j8.n()) {
            return j8;
        }
        if (!c.j((Bundle)j8.j())) {
            return j8;
        }
        return this.f(bundle).p(j, B.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void e(String string2, ScheduledFuture scheduledFuture, j object) {
        object = this.a;
        synchronized (object) {
            this.a.remove(string2);
        }
        scheduledFuture.cancel(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j f(Bundle object) {
        String string2;
        k k8;
        block12 : {
            string2 = c.g();
            k8 = new k();
            Object object2 = this.a;
            synchronized (object2) {
                this.a.put(string2, k8);
            }
            Intent intent = new Intent();
            intent.setPackage("com.google.android.gms");
            object2 = this.c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER";
            intent.setAction((String)object2);
            intent.putExtras((Bundle)object);
            c.h(this.b, intent);
            object = new StringBuilder(String.valueOf((Object)string2).length() + 5);
            object.append("|ID|");
            object.append(string2);
            object.append("|");
            intent.putExtra("kid", object.toString());
            if (Log.isLoggable((String)"Rpc", (int)3)) {
                object = String.valueOf((Object)intent.getExtras());
                object2 = new StringBuilder(object.length() + 8);
                object2.append("Sending ");
                object2.append((String)object);
                Log.d((String)"Rpc", (String)object2.toString());
            }
            intent.putExtra("google.messenger", (Parcelable)this.e);
            if (this.f != null || this.g != null) {
                object = Message.obtain();
                object.obj = intent;
                try {
                    object2 = this.f;
                    if (object2 != null) {
                        object2.send((Message)object);
                    } else {
                        this.g.b((Message)object);
                    }
                    break block12;
                }
                catch (RemoteException remoteException) {}
                if (Log.isLoggable((String)"Rpc", (int)3)) {
                    Log.d((String)"Rpc", (String)"Messenger failed, fallback to startService");
                }
            }
            if (this.c.b() == 2) {
                this.b.sendBroadcast(intent);
            } else {
                this.b.startService(intent);
            }
        }
        object = this.d.schedule((Runnable)new C(k8), 30L, TimeUnit.SECONDS);
        k8.a().c(j, new A(this, string2, (ScheduledFuture)object));
        return k8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(String string2, Bundle bundle) {
        t.h h8 = this.a;
        synchronized (h8) {
            try {
                k k8 = (k)this.a.remove(string2);
                if (k8 != null) {
                    k8.c((Object)bundle);
                    return;
                }
                string2 = (string2 = String.valueOf((Object)string2)).length() != 0 ? "Missing callback for ".concat(string2) : new String("Missing callback for ");
                Log.w((String)"Rpc", (String)string2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

