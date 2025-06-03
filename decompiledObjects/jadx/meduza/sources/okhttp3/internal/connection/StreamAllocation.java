package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.HttpCodec;

/* loaded from: classes.dex */
public final class StreamAllocation {

    /* renamed from: a, reason: collision with root package name */
    public final Address f12437a;

    /* renamed from: b, reason: collision with root package name */
    public RouteSelector.Selection f12438b;

    /* renamed from: c, reason: collision with root package name */
    public Route f12439c;

    /* renamed from: d, reason: collision with root package name */
    public final ConnectionPool f12440d;

    /* renamed from: e, reason: collision with root package name */
    public final Call f12441e;
    public final EventListener f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12442g;

    /* renamed from: h, reason: collision with root package name */
    public final RouteSelector f12443h;

    /* renamed from: i, reason: collision with root package name */
    public int f12444i;

    /* renamed from: j, reason: collision with root package name */
    public RealConnection f12445j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12446k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12447l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12448m;

    /* renamed from: n, reason: collision with root package name */
    public HttpCodec f12449n;

    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f12450a;

        public StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.f12450a = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.f12440d = connectionPool;
        this.f12437a = address;
        this.f12441e = call;
        this.f = eventListener;
        this.f12443h = new RouteSelector(address, Internal.f12370a.j(connectionPool), call, eventListener);
        this.f12442g = obj;
    }

    public final void a(RealConnection realConnection, boolean z10) {
        if (this.f12445j != null) {
            throw new IllegalStateException();
        }
        this.f12445j = realConnection;
        this.f12446k = z10;
        realConnection.f12423n.add(new StreamAllocationReference(this, this.f12442g));
    }

    public final synchronized RealConnection b() {
        return this.f12445j;
    }

    public final Socket c(boolean z10, boolean z11, boolean z12) {
        Socket socket;
        if (z12) {
            this.f12449n = null;
        }
        if (z11) {
            this.f12447l = true;
        }
        RealConnection realConnection = this.f12445j;
        if (realConnection == null) {
            return null;
        }
        if (z10) {
            realConnection.f12420k = true;
        }
        if (this.f12449n != null) {
            return null;
        }
        if (!this.f12447l && !realConnection.f12420k) {
            return null;
        }
        int size = realConnection.f12423n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Reference) realConnection.f12423n.get(i10)).get() == this) {
                realConnection.f12423n.remove(i10);
                if (this.f12445j.f12423n.isEmpty()) {
                    this.f12445j.f12424o = System.nanoTime();
                    if (Internal.f12370a.e(this.f12440d, this.f12445j)) {
                        socket = this.f12445j.f12415e;
                        this.f12445j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f12445j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if ((r0.f12436b < r0.f12435a.size()) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RealConnection d(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.d(boolean, int, int, int, int):okhttp3.internal.connection.RealConnection");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[LOOP:0: B:1:0x0000->B:39:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.RealConnection e(int r13, int r14, int r15, int r16, boolean r17, boolean r18) {
        /*
            r12 = this;
        L0:
            r1 = r12
            r2 = r17
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            okhttp3.internal.connection.RealConnection r1 = r1.d(r2, r3, r4, r5, r6)
            r2 = r12
            okhttp3.ConnectionPool r3 = r2.f12440d
            monitor-enter(r3)
            int r0 = r1.f12421l     // Catch: java.lang.Throwable -> L21
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L24
            okhttp3.internal.http2.Http2Connection r0 = r1.f12417h     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1c
            r0 = r4
            goto L1d
        L1c:
            r0 = r5
        L1d:
            if (r0 != 0) goto L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            return r1
        L21:
            r0 = move-exception
            goto L92
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            java.net.Socket r0 = r1.f12415e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L89
            java.net.Socket r0 = r1.f12415e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L89
            java.net.Socket r0 = r1.f12415e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L3e
            goto L89
        L3e:
            okhttp3.internal.http2.Http2Connection r3 = r1.f12417h
            if (r3 == 0) goto L61
            long r6 = java.lang.System.nanoTime()
            monitor-enter(r3)
            boolean r0 = r3.f12548o     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L4c
            goto L5a
        L4c:
            long r8 = r3.f12554v     // Catch: java.lang.Throwable -> L5e
            long r10 = r3.f12553u     // Catch: java.lang.Throwable -> L5e
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L5c
            long r8 = r3.f12555w     // Catch: java.lang.Throwable -> L5e
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L5c
        L5a:
            monitor-exit(r3)
            goto L89
        L5c:
            monitor-exit(r3)
            goto L8a
        L5e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L61:
            if (r18 == 0) goto L8a
            java.net.Socket r0 = r1.f12415e     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            int r3 = r0.getSoTimeout()     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            java.net.Socket r0 = r1.f12415e     // Catch: java.lang.Throwable -> L82
            r0.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L82
            xc.s r0 = r1.f12418i     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.v()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7c
            java.net.Socket r0 = r1.f12415e     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            r0.setSoTimeout(r3)     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            goto L89
        L7c:
            java.net.Socket r0 = r1.f12415e     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            r0.setSoTimeout(r3)     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            goto L8a
        L82:
            r0 = move-exception
            java.net.Socket r6 = r1.f12415e     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            r6.setSoTimeout(r3)     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
            throw r0     // Catch: java.io.IOException -> L89 java.net.SocketTimeoutException -> L8a
        L89:
            r4 = r5
        L8a:
            if (r4 != 0) goto L91
            r12.f()
            goto L0
        L91:
            return r1
        L92:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.e(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final void f() {
        RealConnection realConnection;
        Socket c10;
        synchronized (this.f12440d) {
            realConnection = this.f12445j;
            c10 = c(true, false, false);
            if (this.f12445j != null) {
                realConnection = null;
            }
        }
        Util.f(c10);
        if (realConnection != null) {
            this.f.getClass();
        }
    }

    public final void g() {
        RealConnection realConnection;
        Socket c10;
        synchronized (this.f12440d) {
            realConnection = this.f12445j;
            c10 = c(false, true, false);
            if (this.f12445j != null) {
                realConnection = null;
            }
        }
        Util.f(c10);
        if (realConnection != null) {
            Internal.f12370a.k(this.f12441e, null);
            this.f.getClass();
            this.f.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0012, B:11:0x003f, B:13:0x0046, B:15:0x0050, B:19:0x0056, B:28:0x001a, B:31:0x001f, B:33:0x0023, B:37:0x002c, B:39:0x0030, B:41:0x0034, B:44:0x003a), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.io.IOException r7) {
        /*
            r6 = this;
            okhttp3.ConnectionPool r0 = r6.f12440d
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L43
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch: java.lang.Throwable -> L43
            okhttp3.internal.http2.ErrorCode r7 = r7.f12645a     // Catch: java.lang.Throwable -> L43
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L43
            if (r7 != r1) goto L1a
            int r7 = r6.f12444i     // Catch: java.lang.Throwable -> L43
            int r7 = r7 + r3
            r6.f12444i = r7     // Catch: java.lang.Throwable -> L43
            if (r7 <= r3) goto L45
            goto L3f
        L1a:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch: java.lang.Throwable -> L43
            if (r7 == r1) goto L45
            goto L3f
        L1f:
            okhttp3.internal.connection.RealConnection r1 = r6.f12445j     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L45
            okhttp3.internal.http2.Http2Connection r5 = r1.f12417h     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L29
            r5 = r3
            goto L2a
        L29:
            r5 = r4
        L2a:
            if (r5 == 0) goto L30
            boolean r5 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L45
        L30:
            int r1 = r1.f12421l     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L41
            okhttp3.Route r1 = r6.f12439c     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3f
            if (r7 == 0) goto L3f
            okhttp3.internal.connection.RouteSelector r5 = r6.f12443h     // Catch: java.lang.Throwable -> L43
            r5.a(r1, r7)     // Catch: java.lang.Throwable -> L43
        L3f:
            r6.f12439c = r2     // Catch: java.lang.Throwable -> L43
        L41:
            r7 = r3
            goto L46
        L43:
            r7 = move-exception
            goto L62
        L45:
            r7 = r4
        L46:
            okhttp3.internal.connection.RealConnection r1 = r6.f12445j     // Catch: java.lang.Throwable -> L43
            java.net.Socket r7 = r6.c(r7, r4, r3)     // Catch: java.lang.Throwable -> L43
            okhttp3.internal.connection.RealConnection r3 = r6.f12445j     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L56
            boolean r3 = r6.f12446k     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L55
            goto L56
        L55:
            r2 = r1
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            okhttp3.internal.Util.f(r7)
            if (r2 == 0) goto L61
            okhttp3.EventListener r7 = r6.f
            r7.getClass()
        L61:
            return
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.h(java.io.IOException):void");
    }

    public final void i(boolean z10, HttpCodec httpCodec, IOException iOException) {
        RealConnection realConnection;
        Socket c10;
        boolean z11;
        this.f.getClass();
        synchronized (this.f12440d) {
            if (httpCodec != null) {
                if (httpCodec == this.f12449n) {
                    if (!z10) {
                        this.f12445j.f12421l++;
                    }
                    realConnection = this.f12445j;
                    c10 = c(z10, false, true);
                    if (this.f12445j != null) {
                        realConnection = null;
                    }
                    z11 = this.f12447l;
                }
            }
            throw new IllegalStateException("expected " + this.f12449n + " but was " + httpCodec);
        }
        Util.f(c10);
        if (realConnection != null) {
            this.f.getClass();
        }
        if (iOException != null) {
            Internal.f12370a.k(this.f12441e, iOException);
        } else if (!z11) {
            return;
        } else {
            Internal.f12370a.k(this.f12441e, null);
        }
        this.f.getClass();
    }

    public final String toString() {
        RealConnection b10 = b();
        return b10 != null ? b10.toString() : this.f12437a.toString();
    }
}
