/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.IllegalThreadStateException
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.google.firebase.iid;

import V2.g;
import V2.i;
import V2.j;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.iid.a;
import com.google.firebase.iid.b;
import com.google.firebase.iid.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.d;
import p4.f;
import p4.h;
import p4.k;
import p4.l;
import p4.n;
import q4.a;
import s3.e;
import s3.m;

@Deprecated
public class FirebaseInstanceId {
    public static final long i = TimeUnit.HOURS.toSeconds(8L);
    public static b j;
    public static final Pattern k;
    public static ScheduledExecutorService l;
    public final Executor a;
    public final e b;
    public final n c;
    public final k d;
    public final a e;
    public final s4.i f;
    public boolean g = false;
    public final List h = new ArrayList();

    static {
        k = Pattern.compile((String)"\\AA[\\w-]{38}\\z");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public FirebaseInstanceId(e e8, n n8, Executor executor, Executor executor2, r4.b b8, r4.b b9, s4.i i8) {
        if (n.c(e8) == null) throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        // MONITORENTER : com.google.firebase.iid.FirebaseInstanceId.class
        if (j == null) {
            j = new b(e8.m());
        }
        // MONITOREXIT : com.google.firebase.iid.FirebaseInstanceId.class
        this.b = e8;
        this.c = n8;
        this.d = new k(e8, n8, b8, b9, i8);
        this.a = executor2;
        this.e = new a(executor);
        this.f = i8;
    }

    public FirebaseInstanceId(e e8, r4.b b8, r4.b b9, s4.i i8) {
        this(e8, new n(e8.m()), (Executor)p4.b.b(), (Executor)p4.b.b(), b8, b9, i8);
    }

    public static String A(String string2) {
        if (!(string2.isEmpty() || string2.equalsIgnoreCase("fcm") || string2.equalsIgnoreCase("gcm"))) {
            return string2;
        }
        return "*";
    }

    public static Object c(j j8) {
        A2.n.j(j8, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        j8.c(d.o, new p4.e(countDownLatch));
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return FirebaseInstanceId.l(j8);
    }

    public static void e(e e8) {
        A2.n.f(e8.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        A2.n.f(e8.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        A2.n.f(e8.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        A2.n.b(FirebaseInstanceId.u(e8.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        A2.n.b(FirebaseInstanceId.t(e8.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    @NonNull
    public static FirebaseInstanceId getInstance(@NonNull e object) {
        FirebaseInstanceId.e((e)object);
        object = (FirebaseInstanceId)object.k(FirebaseInstanceId.class);
        A2.n.j(object, "Firebase Instance ID component is not present");
        return object;
    }

    public static Object l(j j8) {
        if (j8.n()) {
            return j8.j();
        }
        if (!j8.l()) {
            if (j8.m()) {
                throw new IllegalStateException((Throwable)j8.i());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        throw new CancellationException("Task is already canceled");
    }

    public static boolean r() {
        boolean bl = Log.isLoggable((String)"FirebaseInstanceId", (int)3);
        boolean bl2 = true;
        if (!bl) {
            if (Build.VERSION.SDK_INT == 23) {
                if (Log.isLoggable((String)"FirebaseInstanceId", (int)3)) {
                    return true;
                }
                return false;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean t(String string2) {
        return k.matcher((CharSequence)string2).matches();
    }

    public static boolean u(String string2) {
        return string2.contains((CharSequence)":");
    }

    public static final /* synthetic */ void v(CountDownLatch countDownLatch, j j8) {
        countDownLatch.countDown();
    }

    public void B() {
        synchronized (this) {
            j.d();
            return;
        }
    }

    public void C(boolean bl) {
        synchronized (this) {
            this.g = bl;
            return;
        }
    }

    public void D() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (!this.g) {
                        this.E(0L);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void E(long l8) {
        synchronized (this) {
            this.g(new c(this, Math.min((long)Math.max((long)30L, (long)(l8 + l8)), (long)i)), l8);
            this.g = true;
            return;
        }
    }

    public boolean F(b.a a8) {
        if (a8 != null && !a8.c(this.c.a())) {
            return false;
        }
        return true;
    }

    public void a(a.a a8) {
        this.h.add((Object)a8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object b(j object) {
        try {
            return V2.m.b((j)object, 30000L, TimeUnit.MILLISECONDS);
        }
        catch (ExecutionException executionException2) {}
        Throwable throwable = executionException2.getCause();
        if (throwable instanceof IOException) {
            if (!"INSTANCE_ID_RESET".equals((Object)throwable.getMessage())) throw (IOException)throwable;
            this.B();
            throw (IOException)throwable;
        }
        if (!(throwable instanceof RuntimeException)) throw new IOException((Throwable)executionException2);
        throw (RuntimeException)throwable;
        catch (InterruptedException | TimeoutException interruptedException) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public String d() {
        return this.o(n.c(this.b), "*");
    }

    public void f(String string2, String string3) {
        FirebaseInstanceId.e(this.b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            string3 = FirebaseInstanceId.A(string3);
            String string4 = this.i();
            this.b(this.d.b(string4, string2, string3));
            j.e(this.m(), string2, string3);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(Runnable runnable, long l8) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (l == null) {
                    l = new ScheduledThreadPoolExecutor(1, (ThreadFactory)new F2.a("FirebaseInstanceId"));
                }
                l.schedule(runnable, l8, TimeUnit.SECONDS);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public e h() {
        return this.b;
    }

    public String i() {
        try {
            j.j(this.b.s());
            String string2 = (String)FirebaseInstanceId.c(this.f.a());
            return string2;
        }
        catch (InterruptedException interruptedException) {
            throw new IllegalStateException((Throwable)interruptedException);
        }
    }

    public j j() {
        FirebaseInstanceId.e(this.b);
        return this.k(n.c(this.b), "*");
    }

    public final j k(String string2, String string3) {
        string3 = FirebaseInstanceId.A(string3);
        return V2.m.e(null).h(this.a, new p4.c(this, string2, string3));
    }

    public final String m() {
        if ("[DEFAULT]".equals((Object)this.b.q())) {
            return "";
        }
        return this.b.s();
    }

    public String n() {
        FirebaseInstanceId.e(this.b);
        b.a a8 = this.p();
        if (this.F(a8)) {
            this.D();
        }
        return b.a.b(a8);
    }

    public String o(String string2, String string3) {
        FirebaseInstanceId.e(this.b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((l)this.b(this.k(string2, string3))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public b.a p() {
        return this.q(n.c(this.b), "*");
    }

    public b.a q(String string2, String string3) {
        return j.g(this.m(), string2, string3);
    }

    public boolean s() {
        return this.c.g();
    }

    public final /* synthetic */ j w(String string2, String string3, String string4, String string5) {
        j.i(this.m(), string2, string3, string5, this.c.a());
        return V2.m.e(new p4.m(string4, string5));
    }

    public final /* synthetic */ void x(b.a a8, l object) {
        object = object.a();
        if (a8 == null || !object.equals((Object)a8.a)) {
            a8 = this.h.iterator();
            while (a8.hasNext()) {
                ((a.a)a8.next()).a((String)object);
            }
        }
    }

    public final /* synthetic */ j y(String string2, String string3, String string4, b.a a8) {
        return this.d.e(string2, string3, string4).p(this.a, new p4.g(this, string3, string4, string2)).e(h.o, new p4.i(this, a8));
    }

    public final /* synthetic */ j z(String string2, String string3, j object) {
        object = this.i();
        b.a a8 = this.q(string2, string3);
        if (!this.F(a8)) {
            return V2.m.e(new p4.m((String)object, a8.a));
        }
        return this.e.a(string2, string3, new f(this, (String)object, string2, string3, a8));
    }
}

