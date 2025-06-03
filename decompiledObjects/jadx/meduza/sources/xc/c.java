package xc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class c extends z {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f17240h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f17241i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f17242j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f17243k;

    /* renamed from: l, reason: collision with root package name */
    public static c f17244l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17245e;
    public c f;

    /* renamed from: g, reason: collision with root package name */
    public long f17246g;

    public static final class a {
        public static c a() {
            c cVar = c.f17244l;
            ec.i.b(cVar);
            c cVar2 = cVar.f;
            long nanoTime = System.nanoTime();
            if (cVar2 == null) {
                c.f17241i.await(c.f17242j, TimeUnit.MILLISECONDS);
                c cVar3 = c.f17244l;
                ec.i.b(cVar3);
                if (cVar3.f != null || System.nanoTime() - nanoTime < c.f17243k) {
                    return null;
                }
                return c.f17244l;
            }
            long j10 = cVar2.f17246g - nanoTime;
            if (j10 > 0) {
                c.f17241i.await(j10, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f17244l;
            ec.i.b(cVar4);
            cVar4.f = cVar2.f;
            cVar2.f = null;
            return cVar2;
        }
    }

    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            c a10;
            while (true) {
                try {
                    reentrantLock = c.f17240h;
                    reentrantLock.lock();
                    try {
                        a10 = a.a();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (a10 == c.f17244l) {
                    c.f17244l = null;
                    return;
                }
                rb.h hVar = rb.h.f13851a;
                reentrantLock.unlock();
                if (a10 != null) {
                    a10.k();
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f17240h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        ec.i.d(newCondition, "lock.newCondition()");
        f17241i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f17242j = millis;
        f17243k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:8:0x0012, B:10:0x0018, B:12:0x001e, B:13:0x002d, B:16:0x0035, B:17:0x0041, B:18:0x0049, B:19:0x004e, B:21:0x0055, B:26:0x005f, B:28:0x0067, B:29:0x006c, B:35:0x0045, B:36:0x0072, B:37:0x0077, B:38:0x0078, B:39:0x0083), top: B:7:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r9 = this;
            long r0 = r9.f17300c
            boolean r2 = r9.f17298a
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r4 = xc.c.f17240h
            r4.lock()
            boolean r5 = r9.f17245e     // Catch: java.lang.Throwable -> L84
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L78
            r9.f17245e = r6     // Catch: java.lang.Throwable -> L84
            xc.c r5 = xc.c.f17244l     // Catch: java.lang.Throwable -> L84
            if (r5 != 0) goto L2d
            xc.c r5 = new xc.c     // Catch: java.lang.Throwable -> L84
            r5.<init>()     // Catch: java.lang.Throwable -> L84
            xc.c.f17244l = r5     // Catch: java.lang.Throwable -> L84
            xc.c$b r5 = new xc.c$b     // Catch: java.lang.Throwable -> L84
            r5.<init>()     // Catch: java.lang.Throwable -> L84
            r5.start()     // Catch: java.lang.Throwable -> L84
        L2d:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L3f
            if (r2 == 0) goto L3f
            long r2 = r9.c()     // Catch: java.lang.Throwable -> L84
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L84
            goto L41
        L3f:
            if (r3 == 0) goto L43
        L41:
            long r0 = r0 + r5
            goto L49
        L43:
            if (r2 == 0) goto L72
            long r0 = r9.c()     // Catch: java.lang.Throwable -> L84
        L49:
            r9.f17246g = r0     // Catch: java.lang.Throwable -> L84
            long r0 = r0 - r5
            xc.c r2 = xc.c.f17244l     // Catch: java.lang.Throwable -> L84
        L4e:
            ec.i.b(r2)     // Catch: java.lang.Throwable -> L84
            xc.c r3 = r2.f     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L5f
            long r7 = r3.f17246g     // Catch: java.lang.Throwable -> L84
            long r7 = r7 - r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            goto L5f
        L5d:
            r2 = r3
            goto L4e
        L5f:
            r9.f = r3     // Catch: java.lang.Throwable -> L84
            r2.f = r9     // Catch: java.lang.Throwable -> L84
            xc.c r0 = xc.c.f17244l     // Catch: java.lang.Throwable -> L84
            if (r2 != r0) goto L6c
            java.util.concurrent.locks.Condition r0 = xc.c.f17241i     // Catch: java.lang.Throwable -> L84
            r0.signal()     // Catch: java.lang.Throwable -> L84
        L6c:
            rb.h r0 = rb.h.f13851a     // Catch: java.lang.Throwable -> L84
            r4.unlock()
            return
        L72:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L78:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.c.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        r1.f = r4.f;
        r4.f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = xc.c.f17240h
            r0.lock()
            boolean r1 = r4.f17245e     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 != 0) goto Lb
            goto L20
        Lb:
            r4.f17245e = r2     // Catch: java.lang.Throwable -> L24
            xc.c r1 = xc.c.f17244l     // Catch: java.lang.Throwable -> L24
        Lf:
            if (r1 == 0) goto L1f
            xc.c r3 = r1.f     // Catch: java.lang.Throwable -> L24
            if (r3 != r4) goto L1d
            xc.c r3 = r4.f     // Catch: java.lang.Throwable -> L24
            r1.f = r3     // Catch: java.lang.Throwable -> L24
            r1 = 0
            r4.f = r1     // Catch: java.lang.Throwable -> L24
            goto L20
        L1d:
            r1 = r3
            goto Lf
        L1f:
            r2 = 1
        L20:
            r0.unlock()
            return r2
        L24:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.c.i():boolean");
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
