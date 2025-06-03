package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import okhttp3.Headers;
import okhttp3.internal.NamedRunnable;
import xc.c;
import xc.f;
import xc.w;
import xc.y;
import xc.z;

/* loaded from: classes.dex */
public final class Http2Stream {

    /* renamed from: a, reason: collision with root package name */
    public long f12609a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f12610b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12611c;

    /* renamed from: d, reason: collision with root package name */
    public final Http2Connection f12612d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f12613e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final FramingSource f12614g;

    /* renamed from: h, reason: collision with root package name */
    public final FramingSink f12615h;

    /* renamed from: i, reason: collision with root package name */
    public final StreamTimeout f12616i;

    /* renamed from: j, reason: collision with root package name */
    public final StreamTimeout f12617j;

    /* renamed from: k, reason: collision with root package name */
    public ErrorCode f12618k;

    public final class FramingSink implements w {

        /* renamed from: a, reason: collision with root package name */
        public final f f12619a = new f();

        /* renamed from: b, reason: collision with root package name */
        public boolean f12620b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12621c;

        public FramingSink() {
        }

        @Override // xc.w
        public final z c() {
            return Http2Stream.this.f12617j;
        }

        @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (Http2Stream.this) {
                if (this.f12620b) {
                    return;
                }
                Http2Stream http2Stream = Http2Stream.this;
                if (!http2Stream.f12615h.f12621c) {
                    if (this.f12619a.f17252b > 0) {
                        while (this.f12619a.f17252b > 0) {
                            f(true);
                        }
                    } else {
                        http2Stream.f12612d.c0(http2Stream.f12611c, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.f12620b = true;
                }
                Http2Stream.this.f12612d.flush();
                Http2Stream.this.a();
            }
        }

        public final void f(boolean z10) {
            Http2Stream http2Stream;
            long min;
            Http2Stream http2Stream2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.f12617j.h();
                while (true) {
                    try {
                        http2Stream = Http2Stream.this;
                        if (http2Stream.f12610b > 0 || this.f12621c || this.f12620b || http2Stream.f12618k != null) {
                            break;
                        } else {
                            http2Stream.g();
                        }
                    } finally {
                    }
                }
                http2Stream.f12617j.l();
                Http2Stream.this.b();
                min = Math.min(Http2Stream.this.f12610b, this.f12619a.f17252b);
                http2Stream2 = Http2Stream.this;
                http2Stream2.f12610b -= min;
            }
            http2Stream2.f12617j.h();
            try {
                Http2Stream http2Stream3 = Http2Stream.this;
                http2Stream3.f12612d.c0(http2Stream3.f12611c, z10 && min == this.f12619a.f17252b, this.f12619a, min);
            } finally {
            }
        }

        @Override // xc.w, java.io.Flushable
        public final void flush() {
            synchronized (Http2Stream.this) {
                Http2Stream.this.b();
            }
            while (this.f12619a.f17252b > 0) {
                f(false);
                Http2Stream.this.f12612d.flush();
            }
        }

        @Override // xc.w
        public final void g0(f fVar, long j10) {
            this.f12619a.g0(fVar, j10);
            while (this.f12619a.f17252b >= 16384) {
                f(false);
            }
        }
    }

    public final class FramingSource implements y {

        /* renamed from: a, reason: collision with root package name */
        public final f f12623a = new f();

        /* renamed from: b, reason: collision with root package name */
        public final f f12624b = new f();

        /* renamed from: c, reason: collision with root package name */
        public final long f12625c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12626d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12627e;

        public FramingSource(long j10) {
            this.f12625c = j10;
        }

        @Override // xc.y
        public final z c() {
            return Http2Stream.this.f12616i;
        }

        @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j10;
            synchronized (Http2Stream.this) {
                this.f12626d = true;
                f fVar = this.f12624b;
                j10 = fVar.f17252b;
                fVar.f();
                if (!Http2Stream.this.f12613e.isEmpty()) {
                    Http2Stream.this.getClass();
                }
                Http2Stream.this.notifyAll();
            }
            if (j10 > 0) {
                Http2Stream.this.f12612d.b0(j10);
            }
            Http2Stream.this.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
        
            r11 = -1;
         */
        @Override // xc.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long e0(xc.f r11, long r12) {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto La9
            L6:
                r2 = 0
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r3)
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> La6
                okhttp3.internal.http2.Http2Stream$StreamTimeout r4 = r4.f12616i     // Catch: java.lang.Throwable -> La6
                r4.h()     // Catch: java.lang.Throwable -> La6
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.ErrorCode r5 = r4.f12618k     // Catch: java.lang.Throwable -> L9d
                if (r5 == 0) goto L18
                r2 = r5
            L18:
                boolean r5 = r10.f12626d     // Catch: java.lang.Throwable -> L9d
                if (r5 != 0) goto L95
                java.util.ArrayDeque r4 = r4.f12613e     // Catch: java.lang.Throwable -> L9d
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L9d
                if (r4 != 0) goto L29
                okhttp3.internal.http2.Http2Stream r4 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9d
                r4.getClass()     // Catch: java.lang.Throwable -> L9d
            L29:
                xc.f r4 = r10.f12624b     // Catch: java.lang.Throwable -> L9d
                long r5 = r4.f17252b     // Catch: java.lang.Throwable -> L9d
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                r8 = -1
                if (r7 <= 0) goto L63
                long r12 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L9d
                long r11 = r4.e0(r11, r12)     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9d
                long r4 = r13.f12609a     // Catch: java.lang.Throwable -> L9d
                long r4 = r4 + r11
                r13.f12609a = r4     // Catch: java.lang.Throwable -> L9d
                if (r2 != 0) goto L78
                okhttp3.internal.http2.Http2Connection r13 = r13.f12612d     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Settings r13 = r13.f12558z     // Catch: java.lang.Throwable -> L9d
                int r13 = r13.a()     // Catch: java.lang.Throwable -> L9d
                int r13 = r13 / 2
                long r6 = (long) r13     // Catch: java.lang.Throwable -> L9d
                int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r13 < 0) goto L78
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Http2Connection r4 = r13.f12612d     // Catch: java.lang.Throwable -> L9d
                int r5 = r13.f12611c     // Catch: java.lang.Throwable -> L9d
                long r6 = r13.f12609a     // Catch: java.lang.Throwable -> L9d
                r4.i0(r5, r6)     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9d
                r13.f12609a = r0     // Catch: java.lang.Throwable -> L9d
                goto L78
            L63:
                boolean r4 = r10.f12627e     // Catch: java.lang.Throwable -> L9d
                if (r4 != 0) goto L77
                if (r2 != 0) goto L77
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> L9d
                r2.g()     // Catch: java.lang.Throwable -> L9d
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> La6
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r2.f12616i     // Catch: java.lang.Throwable -> La6
                r2.l()     // Catch: java.lang.Throwable -> La6
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La6
                goto L6
            L77:
                r11 = r8
            L78:
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> La6
                okhttp3.internal.http2.Http2Stream$StreamTimeout r13 = r13.f12616i     // Catch: java.lang.Throwable -> La6
                r13.l()     // Catch: java.lang.Throwable -> La6
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La6
                int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r13 == 0) goto L8c
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r13 = r13.f12612d
                r13.b0(r11)
                return r11
            L8c:
                if (r2 != 0) goto L8f
                return r8
            L8f:
                okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException
                r11.<init>(r2)
                throw r11
            L95:
                java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L9d
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L9d
                throw r11     // Catch: java.lang.Throwable -> L9d
            L9d:
                r11 = move-exception
                okhttp3.internal.http2.Http2Stream r12 = okhttp3.internal.http2.Http2Stream.this     // Catch: java.lang.Throwable -> La6
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.f12616i     // Catch: java.lang.Throwable -> La6
                r12.l()     // Catch: java.lang.Throwable -> La6
                throw r11     // Catch: java.lang.Throwable -> La6
            La6:
                r11 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La6
                throw r11
            La9:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r12 = a0.j.i(r0, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.e0(xc.f, long):long");
        }
    }

    public class StreamTimeout extends c {
        public StreamTimeout() {
        }

        @Override // xc.c
        public final IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // xc.c
        public final void k() {
            Http2Stream http2Stream = Http2Stream.this;
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (http2Stream.d(errorCode)) {
                http2Stream.f12612d.h0(http2Stream.f12611c, errorCode);
            }
            final Http2Connection http2Connection = Http2Stream.this.f12612d;
            synchronized (http2Connection) {
                long j10 = http2Connection.f12554v;
                long j11 = http2Connection.f12553u;
                if (j10 < j11) {
                    return;
                }
                http2Connection.f12553u = j11 + 1;
                http2Connection.f12555w = System.nanoTime() + 1000000000;
                try {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = http2Connection.f12549p;
                    final Object[] objArr = {http2Connection.f12546d};
                    scheduledThreadPoolExecutor.execute(new NamedRunnable(objArr) { // from class: okhttp3.internal.http2.Http2Connection.3
                        public AnonymousClass3(final Object... objArr2) {
                            super("OkHttp %s ping", objArr2);
                        }

                        @Override // okhttp3.internal.NamedRunnable
                        public final void k() {
                            Http2Connection http2Connection2 = Http2Connection.this;
                            http2Connection2.getClass();
                            try {
                                http2Connection2.C.e(2, 0, false);
                            } catch (IOException unused) {
                                http2Connection2.g();
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        public final void l() {
            if (i()) {
                throw j(null);
            }
        }
    }

    public Http2Stream(int i10, Http2Connection http2Connection, boolean z10, boolean z11, Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12613e = arrayDeque;
        this.f12616i = new StreamTimeout();
        this.f12617j = new StreamTimeout();
        this.f12618k = null;
        if (http2Connection == null) {
            throw new NullPointerException("connection == null");
        }
        this.f12611c = i10;
        this.f12612d = http2Connection;
        this.f12610b = http2Connection.A.a();
        FramingSource framingSource = new FramingSource(http2Connection.f12558z.a());
        this.f12614g = framingSource;
        FramingSink framingSink = new FramingSink();
        this.f12615h = framingSink;
        framingSource.f12627e = z11;
        framingSink.f12621c = z10;
        if (headers != null) {
            arrayDeque.add(headers);
        }
        if (e() && headers != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!e() && headers == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void a() {
        boolean z10;
        boolean f;
        synchronized (this) {
            FramingSource framingSource = this.f12614g;
            if (!framingSource.f12627e && framingSource.f12626d) {
                FramingSink framingSink = this.f12615h;
                if (framingSink.f12621c || framingSink.f12620b) {
                    z10 = true;
                    f = f();
                }
            }
            z10 = false;
            f = f();
        }
        if (z10) {
            c(ErrorCode.CANCEL);
        } else {
            if (f) {
                return;
            }
            this.f12612d.I(this.f12611c);
        }
    }

    public final void b() {
        FramingSink framingSink = this.f12615h;
        if (framingSink.f12620b) {
            throw new IOException("stream closed");
        }
        if (framingSink.f12621c) {
            throw new IOException("stream finished");
        }
        if (this.f12618k != null) {
            throw new StreamResetException(this.f12618k);
        }
    }

    public final void c(ErrorCode errorCode) {
        if (d(errorCode)) {
            Http2Connection http2Connection = this.f12612d;
            http2Connection.C.I(this.f12611c, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f12618k != null) {
                return false;
            }
            if (this.f12614g.f12627e && this.f12615h.f12621c) {
                return false;
            }
            this.f12618k = errorCode;
            notifyAll();
            this.f12612d.I(this.f12611c);
            return true;
        }
    }

    public final boolean e() {
        return this.f12612d.f12543a == ((this.f12611c & 1) == 1);
    }

    public final synchronized boolean f() {
        if (this.f12618k != null) {
            return false;
        }
        FramingSource framingSource = this.f12614g;
        if (framingSource.f12627e || framingSource.f12626d) {
            FramingSink framingSink = this.f12615h;
            if (framingSink.f12621c || framingSink.f12620b) {
                if (this.f) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
