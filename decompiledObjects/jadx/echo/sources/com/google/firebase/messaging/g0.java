package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.C0660k;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.C1958a;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f11762i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a, reason: collision with root package name */
    public final Context f11763a;

    /* renamed from: b, reason: collision with root package name */
    public final K f11764b;

    /* renamed from: c, reason: collision with root package name */
    public final F f11765c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f11766d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f11768f;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f11770h;

    /* renamed from: e, reason: collision with root package name */
    public final Map f11767e = new C1958a();

    /* renamed from: g, reason: collision with root package name */
    public boolean f11769g = false;

    public g0(FirebaseMessaging firebaseMessaging, K k7, e0 e0Var, F f7, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11766d = firebaseMessaging;
        this.f11764b = k7;
        this.f11770h = e0Var;
        this.f11765c = f7;
        this.f11763a = context;
        this.f11768f = scheduledExecutorService;
    }

    public static void c(AbstractC0659j abstractC0659j) {
        try {
            V2.m.b(abstractC0659j, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e8);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e9) {
            e = e9;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static AbstractC0659j f(final FirebaseMessaging firebaseMessaging, final K k7, final F f7, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return V2.m.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                g0 j7;
                j7 = g0.j(context, scheduledExecutorService, firebaseMessaging, k7, f7);
                return j7;
            }
        });
    }

    public static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static /* synthetic */ g0 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, K k7, F f7) {
        return new g0(firebaseMessaging, k7, e0.b(context, scheduledExecutorService), f7, context, scheduledExecutorService);
    }

    public final void b(d0 d0Var, C0660k c0660k) {
        ArrayDeque arrayDeque;
        synchronized (this.f11767e) {
            try {
                String e7 = d0Var.e();
                if (this.f11767e.containsKey(e7)) {
                    arrayDeque = (ArrayDeque) this.f11767e.get(e7);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f11767e.put(e7, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c0660k);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) {
        c(this.f11765c.l(this.f11766d.n(), str));
    }

    public final void e(String str) {
        c(this.f11765c.m(this.f11766d.n(), str));
    }

    public boolean g() {
        return this.f11770h.c() != null;
    }

    public synchronized boolean i() {
        return this.f11769g;
    }

    public final void k(d0 d0Var) {
        synchronized (this.f11767e) {
            try {
                String e7 = d0Var.e();
                if (this.f11767e.containsKey(e7)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f11767e.get(e7);
                    C0660k c0660k = (C0660k) arrayDeque.poll();
                    if (c0660k != null) {
                        c0660k.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f11767e.remove(e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:12:0x0033, B:14:0x0039, B:15:0x004f, B:19:0x0053, B:21:0x0060, B:22:0x0079, B:24:0x0086, B:25:0x0015, B:28:0x0022), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(com.google.firebase.messaging.d0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r7 = move-exception
            goto La0
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L79
            if (r2 == r5) goto L53
            boolean r2 = h()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
        L4f:
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> L1f
            goto L9f
        L53:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.e(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = h()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            goto L4f
        L79:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r2 = h()     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L9f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r2.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r2.append(r7)     // Catch: java.io.IOException -> L1f
            r2.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> L1f
            goto L4f
        L9f:
            return r5
        La0:
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc6
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lb9
            goto Lc6
        Lb9:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc5
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
        Lc1:
            android.util.Log.e(r0, r7)
            return r1
        Lc5:
            throw r7
        Lc6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.l(com.google.firebase.messaging.d0):boolean");
    }

    public void m(Runnable runnable, long j7) {
        this.f11768f.schedule(runnable, j7, TimeUnit.SECONDS);
    }

    public AbstractC0659j n(d0 d0Var) {
        this.f11770h.a(d0Var);
        C0660k c0660k = new C0660k();
        b(d0Var, c0660k);
        return c0660k.a();
    }

    public synchronized void o(boolean z7) {
        this.f11769g = z7;
    }

    public final void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    public void q() {
        if (g()) {
            p();
        }
    }

    public AbstractC0659j r(String str) {
        AbstractC0659j n7 = n(d0.f(str));
        q();
        return n7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.e0 r0 = r2.f11770h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.d0 r0 = r0.c()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = h()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r0 = 1
            return r0
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.l(r0)
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            com.google.firebase.messaging.e0 r1 = r2.f11770h
            r1.e(r0)
            r2.k(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.g0.s():boolean");
    }

    public void t(long j7) {
        m(new h0(this, this.f11763a, this.f11764b, Math.min(Math.max(30L, 2 * j7), f11762i)), j7);
        o(true);
    }

    public AbstractC0659j u(String str) {
        AbstractC0659j n7 = n(d0.g(str));
        q();
        return n7;
    }
}
