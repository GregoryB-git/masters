// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import java.util.ArrayDeque;
import V2.k;
import android.os.Build$VERSION;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.io.IOException;
import V2.m;
import V2.j;
import t.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.Map;
import android.content.Context;

public class g0
{
    public static final long i;
    public final Context a;
    public final K b;
    public final F c;
    public final FirebaseMessaging d;
    public final Map e;
    public final ScheduledExecutorService f;
    public boolean g;
    public final e0 h;
    
    static {
        i = TimeUnit.HOURS.toSeconds(8L);
    }
    
    public g0(final FirebaseMessaging d, final K b, final e0 h, final F c, final Context a, final ScheduledExecutorService f) {
        this.e = new a();
        this.g = false;
        this.d = d;
        this.b = b;
        this.h = h;
        this.c = c;
        this.a = a;
        this.f = f;
    }
    
    public static void c(final j j) {
        try {
            m.b(j, 30L, TimeUnit.SECONDS);
        }
        catch (TimeoutException ex) {
            throw new IOException("SERVICE_NOT_AVAILABLE", ex);
        }
        catch (InterruptedException ex) {
            throw new IOException("SERVICE_NOT_AVAILABLE", ex);
        }
        catch (ExecutionException cause2) {
            final Throwable cause = cause2.getCause();
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            throw new IOException(cause2);
        }
    }
    
    public static j f(final FirebaseMessaging firebaseMessaging, final K k, final F f, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return m.c(scheduledExecutorService, new f0(context, scheduledExecutorService, firebaseMessaging, k, f));
    }
    
    public static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
    
    public final void b(final d0 d0, final k e) {
        final Map e2 = this.e;
        // monitorenter(e2)
        while (true) {
            try {
                final String e3 = d0.e();
                ArrayDeque<k> arrayDeque;
                if (this.e.containsKey(e3)) {
                    arrayDeque = this.e.get(e3);
                }
                else {
                    arrayDeque = new ArrayDeque<k>();
                    this.e.put(e3, arrayDeque);
                }
                arrayDeque.add(e);
                // monitorexit(e2)
                return;
                // monitorexit(e2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void d(final String s) {
        c(this.c.l(this.d.n(), s));
    }
    
    public final void e(final String s) {
        c(this.c.m(this.d.n(), s));
    }
    
    public boolean g() {
        return this.h.c() != null;
    }
    
    public boolean i() {
        synchronized (this) {
            return this.g;
        }
    }
    
    public final void k(final d0 d0) {
        final Map e = this.e;
        // monitorenter(e)
        while (true) {
            try {
                final String e2 = d0.e();
                if (!this.e.containsKey(e2)) {
                    // monitorexit(e)
                    return;
                }
                final ArrayDeque<k> arrayDeque = this.e.get(e2);
                final k k = arrayDeque.poll();
                if (k != null) {
                    k.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.e.remove(e2);
                }
                // monitorexit(e)
                return;
                // monitorexit(e)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean l(final d0 obj) {
        while (true) {
            try {
                final String b = obj.b();
                final int hashCode = b.hashCode();
                int n = 0;
                Label_0061: {
                    if (hashCode != 83) {
                        if (hashCode == 85) {
                            if (b.equals("U")) {
                                n = 1;
                                break Label_0061;
                            }
                        }
                    }
                    else if (b.equals("S")) {
                        n = 0;
                        break Label_0061;
                    }
                    n = -1;
                }
                String s;
                if (n != 0) {
                    if (n != 1) {
                        if (!h()) {
                            return true;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown topic operation");
                        sb.append(obj);
                        sb.append(".");
                        s = sb.toString();
                    }
                    else {
                        this.e(obj.c());
                        if (!h()) {
                            return true;
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsubscribe from topic: ");
                        sb2.append(obj.c());
                        sb2.append(" succeeded.");
                        s = sb2.toString();
                    }
                }
                else {
                    this.d(obj.c());
                    if (!h()) {
                        return true;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Subscribe to topic: ");
                    sb3.append(obj.c());
                    sb3.append(" succeeded.");
                    s = sb3.toString();
                }
                Log.d("FirebaseMessaging", s);
                return true;
                // iftrue(Label_0290:, ex.getMessage() != null)
                while (true) {
                    while (true) {
                        String string = null;
                        Log.e("FirebaseMessaging", string);
                        return false;
                        Block_13: {
                            break Block_13;
                            final IOException ex;
                            Label_0290: {
                                throw ex;
                            }
                            Label_0293:
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Topic operation failed: ");
                            sb4.append(ex.getMessage());
                            sb4.append(". Will retry Topic operation.");
                            string = sb4.toString();
                            continue;
                        }
                        string = "Topic operation failed without exception message. Will retry Topic operation.";
                        continue;
                    }
                    continue;
                }
            }
            // iftrue(Label_0293:, "SERVICE_NOT_AVAILABLE".equals((Object)ex.getMessage()) || "INTERNAL_SERVER_ERROR".equals((Object)ex.getMessage()))
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public void m(final Runnable runnable, final long n) {
        this.f.schedule(runnable, n, TimeUnit.SECONDS);
    }
    
    public j n(final d0 d0) {
        this.h.a(d0);
        final k k = new k();
        this.b(d0, k);
        return k.a();
    }
    
    public void o(final boolean g) {
        synchronized (this) {
            this.g = g;
        }
    }
    
    public final void p() {
        if (!this.i()) {
            this.t(0L);
        }
    }
    
    public void q() {
        if (this.g()) {
            this.p();
        }
    }
    
    public j r(final String s) {
        final j n = this.n(d0.f(s));
        this.q();
        return n;
    }
    
    public boolean s() {
    Label_0065_Outer:
        while (true) {
            // monitorenter(this)
            while (true) {
                try {
                    final d0 c = this.h.c();
                    if (c == null) {
                        if (h()) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        // monitorexit(this)
                        return true;
                    }
                    // monitorexit(this)
                    if (!this.l(c)) {
                        return false;
                    }
                    this.h.e(c);
                    this.k(c);
                    continue Label_0065_Outer;
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public void t(final long n) {
        this.m(new h0(this, this.a, this.b, Math.min(Math.max(30L, 2L * n), g0.i)), n);
        this.o(true);
    }
    
    public j u(final String s) {
        final j n = this.n(d0.g(s));
        this.q();
        return n;
    }
}
