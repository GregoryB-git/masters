// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.iid;

import p4.f;
import p4.h;
import p4.g;
import java.util.Iterator;
import p4.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.os.Looper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import V2.m;
import android.os.Build$VERSION;
import android.util.Log;
import java.util.concurrent.CancellationException;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import p4.d;
import java.util.concurrent.CountDownLatch;
import V2.j;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.List;
import s4.i;
import p4.k;
import p4.n;
import s3.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

@Deprecated
public class FirebaseInstanceId
{
    public static final long i;
    public static b j;
    public static final Pattern k;
    public static ScheduledExecutorService l;
    public final Executor a;
    public final e b;
    public final n c;
    public final k d;
    public final a e;
    public final i f;
    public boolean g;
    public final List h;
    
    static {
        i = TimeUnit.HOURS.toSeconds(8L);
        k = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    public FirebaseInstanceId(final e b, final n c, final Executor executor, final Executor a, final r4.b b2, final r4.b b3, final i f) {
        this.g = false;
        this.h = new ArrayList();
        while (true) {
            if (n.c(b) != null) {
                // monitorenter(FirebaseInstanceId.class)
                while (true) {
                    try {
                        if (FirebaseInstanceId.j == null) {
                            FirebaseInstanceId.j = new b(b.m());
                        }
                        // monitorexit(FirebaseInstanceId.class)
                        this.b = b;
                        this.c = c;
                        this.d = new k(b, c, b2, b3, f);
                        this.a = a;
                        this.e = new a(executor);
                        this.f = f;
                        return;
                        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
                    }
                    // monitorexit(FirebaseInstanceId.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public FirebaseInstanceId(final e e, final r4.b b, final r4.b b2, final i i) {
        this(e, new n(e.m()), p4.b.b(), p4.b.b(), b, b2, i);
    }
    
    public static String A(final String s) {
        if (!s.isEmpty() && !s.equalsIgnoreCase("fcm") && !s.equalsIgnoreCase("gcm")) {
            return s;
        }
        return "*";
    }
    
    public static Object c(final j j) {
        A2.n.j(j, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        j.c(d.o, new p4.e(countDownLatch));
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return l(j);
    }
    
    public static void e(final e e) {
        A2.n.f(e.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        A2.n.f(e.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        A2.n.f(e.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        A2.n.b(u(e.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        A2.n.b(t(e.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    @Keep
    @NonNull
    public static FirebaseInstanceId getInstance(@NonNull final e e) {
        e(e);
        final FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId)e.k(FirebaseInstanceId.class);
        A2.n.j(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }
    
    public static Object l(final j j) {
        if (j.n()) {
            return j.j();
        }
        if (j.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (j.m()) {
            throw new IllegalStateException(j.i());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }
    
    public static boolean r() {
        final boolean loggable = Log.isLoggable("FirebaseInstanceId", 3);
        boolean b = true;
        if (!loggable) {
            if (Build$VERSION.SDK_INT == 23) {
                return Log.isLoggable("FirebaseInstanceId", 3);
            }
            b = false;
        }
        return b;
    }
    
    public static boolean t(final String input) {
        return FirebaseInstanceId.k.matcher(input).matches();
    }
    
    public static boolean u(final String s) {
        return s.contains(":");
    }
    
    public void B() {
        synchronized (this) {
            FirebaseInstanceId.j.d();
        }
    }
    
    public void C(final boolean g) {
        synchronized (this) {
            this.g = g;
        }
    }
    
    public void D() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0024: {
            try {
                if (!this.g) {
                    this.E(0L);
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0024;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public void E(final long n) {
        synchronized (this) {
            this.g(new c(this, Math.min(Math.max(30L, n + n), FirebaseInstanceId.i)), n);
            this.g = true;
        }
    }
    
    public boolean F(final b.a a) {
        return a == null || a.c(this.c.a());
    }
    
    public void a(final q4.a.a a) {
        this.h.add(a);
    }
    
    public final Object b(final j j) {
        while (true) {
            while (true) {
                try {
                    return m.b(j, 30000L, TimeUnit.MILLISECONDS);
                }
                catch (ExecutionException cause2) {
                    final Throwable cause = cause2.getCause();
                    if (cause instanceof IOException) {
                        if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                            this.B();
                        }
                        throw (IOException)cause;
                    }
                    if (cause instanceof RuntimeException) {
                        throw (RuntimeException)cause;
                    }
                    throw new IOException(cause2);
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                catch (InterruptedException ex) {}
                catch (TimeoutException ex2) {}
                continue;
            }
        }
    }
    
    public String d() {
        return this.o(n.c(this.b), "*");
    }
    
    public void f(final String s, String a) {
        e(this.b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            a = A(a);
            this.b(this.d.b(this.i(), s, a));
            FirebaseInstanceId.j.e(this.m(), s, a);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }
    
    public void g(final Runnable runnable, final long n) {
        // monitorenter(FirebaseInstanceId.class)
        while (true) {
            try {
                if (FirebaseInstanceId.l == null) {
                    FirebaseInstanceId.l = new ScheduledThreadPoolExecutor(1, new F2.a("FirebaseInstanceId"));
                }
                FirebaseInstanceId.l.schedule(runnable, n, TimeUnit.SECONDS);
                // monitorexit(FirebaseInstanceId.class)
                return;
                // monitorexit(FirebaseInstanceId.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public e h() {
        return this.b;
    }
    
    public String i() {
        try {
            FirebaseInstanceId.j.j(this.b.s());
            return (String)c(this.f.a());
        }
        catch (InterruptedException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public j j() {
        e(this.b);
        return this.k(n.c(this.b), "*");
    }
    
    public final j k(final String s, String a) {
        a = A(a);
        return m.e(null).h(this.a, new p4.c(this, s, a));
    }
    
    public final String m() {
        if ("[DEFAULT]".equals(this.b.q())) {
            return "";
        }
        return this.b.s();
    }
    
    public String n() {
        e(this.b);
        final b.a p = this.p();
        if (this.F(p)) {
            this.D();
        }
        return com.google.firebase.iid.b.a.b(p);
    }
    
    public String o(final String s, final String s2) {
        e(this.b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((l)this.b(this.k(s, s2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }
    
    public b.a p() {
        return this.q(n.c(this.b), "*");
    }
    
    public b.a q(final String s, final String s2) {
        return FirebaseInstanceId.j.g(this.m(), s, s2);
    }
    
    public boolean s() {
        return this.c.g();
    }
}
