package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;
import xc.f;
import xc.g;
import xc.h;
import xc.i;

/* loaded from: classes.dex */
public final class Http2Connection implements Closeable {
    public static final ThreadPoolExecutor F = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.v("OkHttp Http2Connection", true));
    public final Settings A;
    public final Socket B;
    public final Http2Writer C;
    public final ReaderRunnable D;
    public final LinkedHashSet E;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12543a;

    /* renamed from: b, reason: collision with root package name */
    public final Listener f12544b;

    /* renamed from: d, reason: collision with root package name */
    public final String f12546d;

    /* renamed from: e, reason: collision with root package name */
    public int f12547e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12548o;

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f12549p;

    /* renamed from: q, reason: collision with root package name */
    public final ThreadPoolExecutor f12550q;

    /* renamed from: r, reason: collision with root package name */
    public final PushObserver f12551r;

    /* renamed from: y, reason: collision with root package name */
    public long f12557y;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12545c = new LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public long f12552s = 0;
    public long t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f12553u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f12554v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f12555w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f12556x = 0;

    /* renamed from: z, reason: collision with root package name */
    public Settings f12558z = new Settings();

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Socket f12578a;

        /* renamed from: b, reason: collision with root package name */
        public String f12579b;

        /* renamed from: c, reason: collision with root package name */
        public h f12580c;

        /* renamed from: d, reason: collision with root package name */
        public g f12581d;

        /* renamed from: e, reason: collision with root package name */
        public Listener f12582e = Listener.f12586a;
        public PushObserver f = PushObserver.f12642a;

        /* renamed from: g, reason: collision with root package name */
        public boolean f12583g = true;

        /* renamed from: h, reason: collision with root package name */
        public int f12584h;
    }

    public final class IntervalPingRunnable extends NamedRunnable {
        public IntervalPingRunnable() {
            super("OkHttp %s ping", Http2Connection.this.f12546d);
        }

        @Override // okhttp3.internal.NamedRunnable
        public final void k() {
            Http2Connection http2Connection;
            boolean z10;
            synchronized (Http2Connection.this) {
                http2Connection = Http2Connection.this;
                long j10 = http2Connection.t;
                long j11 = http2Connection.f12552s;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    http2Connection.f12552s = j11 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                http2Connection.g();
                return;
            }
            try {
                http2Connection.C.e(1, 0, false);
            } catch (IOException unused) {
                http2Connection.g();
            }
        }
    }

    public static abstract class Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Listener f12586a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection.Listener.1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public final void b(Http2Stream http2Stream) {
                http2Stream.c(ErrorCode.REFUSED_STREAM);
            }
        };

        public void a(Http2Connection http2Connection) {
        }

        public abstract void b(Http2Stream http2Stream);
    }

    public final class PingRunnable extends NamedRunnable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12587b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12588c;

        /* renamed from: d, reason: collision with root package name */
        public final int f12589d;

        public PingRunnable(int i10, int i11) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.f12546d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f12587b = true;
            this.f12588c = i10;
            this.f12589d = i11;
        }

        @Override // okhttp3.internal.NamedRunnable
        public final void k() {
            Http2Connection http2Connection = Http2Connection.this;
            boolean z10 = this.f12587b;
            int i10 = this.f12588c;
            int i11 = this.f12589d;
            http2Connection.getClass();
            try {
                http2Connection.C.e(i10, i11, z10);
            } catch (IOException unused) {
                http2Connection.g();
            }
        }
    }

    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {

        /* renamed from: b, reason: collision with root package name */
        public final Http2Reader f12591b;

        public ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.f12546d);
            this.f12591b = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void a() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void b(int i10, int i11, h hVar, boolean z10) {
            boolean f;
            boolean z11;
            boolean z12;
            long j10;
            Http2Connection.this.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                f fVar = new f();
                long j11 = i11;
                hVar.u0(j11);
                hVar.e0(fVar, j11);
                if (fVar.f17252b == j11) {
                    http2Connection.H(new NamedRunnable(new Object[]{http2Connection.f12546d, Integer.valueOf(i10)}, i10, fVar, i11, z10) { // from class: okhttp3.internal.http2.Http2Connection.6

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f12572b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f f12573c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ int f12574d;

                        @Override // okhttp3.internal.NamedRunnable
                        public final void k() {
                            try {
                                PushObserver pushObserver = Http2Connection.this.f12551r;
                                f fVar2 = this.f12573c;
                                int i12 = this.f12574d;
                                ((PushObserver.AnonymousClass1) pushObserver).getClass();
                                fVar2.skip(i12);
                                Http2Connection.this.C.I(this.f12572b, ErrorCode.CANCEL);
                                synchronized (Http2Connection.this) {
                                    Http2Connection.this.E.remove(Integer.valueOf(this.f12572b));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                }
                throw new IOException(fVar.f17252b + " != " + i11);
            }
            Http2Stream C = Http2Connection.this.C(i10);
            if (C == null) {
                Http2Connection.this.h0(i10, ErrorCode.PROTOCOL_ERROR);
                long j12 = i11;
                Http2Connection.this.b0(j12);
                hVar.skip(j12);
                return;
            }
            Http2Stream.FramingSource framingSource = C.f12614g;
            long j13 = i11;
            while (true) {
                if (j13 <= 0) {
                    framingSource.getClass();
                    break;
                }
                synchronized (Http2Stream.this) {
                    z11 = framingSource.f12627e;
                    z12 = framingSource.f12624b.f17252b + j13 > framingSource.f12625c;
                }
                if (z12) {
                    hVar.skip(j13);
                    Http2Stream http2Stream = Http2Stream.this;
                    ErrorCode errorCode = ErrorCode.FLOW_CONTROL_ERROR;
                    if (http2Stream.d(errorCode)) {
                        http2Stream.f12612d.h0(http2Stream.f12611c, errorCode);
                    }
                } else {
                    if (z11) {
                        hVar.skip(j13);
                        break;
                    }
                    long e02 = hVar.e0(framingSource.f12623a, j13);
                    if (e02 == -1) {
                        throw new EOFException();
                    }
                    j13 -= e02;
                    synchronized (Http2Stream.this) {
                        if (framingSource.f12626d) {
                            f fVar2 = framingSource.f12623a;
                            j10 = fVar2.f17252b;
                            fVar2.f();
                        } else {
                            f fVar3 = framingSource.f12624b;
                            boolean z13 = fVar3.f17252b == 0;
                            fVar3.A0(framingSource.f12623a);
                            if (z13) {
                                Http2Stream.this.notifyAll();
                            }
                            j10 = 0;
                        }
                    }
                    if (j10 > 0) {
                        Http2Stream.this.f12612d.b0(j10);
                    }
                }
            }
            if (z10) {
                synchronized (C) {
                    C.f12614g.f12627e = true;
                    f = C.f();
                    C.notifyAll();
                }
                if (f) {
                    return;
                }
                C.f12612d.I(C.f12611c);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void c() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void d(int i10, long j10) {
            Http2Connection http2Connection = Http2Connection.this;
            if (i10 == 0) {
                synchronized (http2Connection) {
                    Http2Connection http2Connection2 = Http2Connection.this;
                    http2Connection2.f12557y += j10;
                    http2Connection2.notifyAll();
                }
                return;
            }
            Http2Stream C = http2Connection.C(i10);
            if (C != null) {
                synchronized (C) {
                    C.f12610b += j10;
                    if (j10 > 0) {
                        C.notifyAll();
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void e(int i10, int i11, boolean z10) {
            if (!z10) {
                try {
                    Http2Connection http2Connection = Http2Connection.this;
                    http2Connection.f12549p.execute(http2Connection.new PingRunnable(i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (Http2Connection.this) {
                try {
                    if (i10 == 1) {
                        Http2Connection.this.t++;
                    } else if (i10 == 2) {
                        Http2Connection.this.f12554v++;
                    } else if (i10 == 3) {
                        Http2Connection http2Connection2 = Http2Connection.this;
                        http2Connection2.getClass();
                        http2Connection2.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void f(final Settings settings) {
            try {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.f12549p.execute(new NamedRunnable(new Object[]{http2Connection.f12546d}) { // from class: okhttp3.internal.http2.Http2Connection.ReaderRunnable.2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ boolean f12595b = false;

                    @Override // okhttp3.internal.NamedRunnable
                    public final void k() {
                        Http2Stream[] http2StreamArr;
                        long j10;
                        final ReaderRunnable readerRunnable = ReaderRunnable.this;
                        boolean z10 = this.f12595b;
                        Settings settings2 = settings;
                        synchronized (Http2Connection.this.C) {
                            synchronized (Http2Connection.this) {
                                try {
                                    int a10 = Http2Connection.this.A.a();
                                    if (z10) {
                                        Settings settings3 = Http2Connection.this.A;
                                        settings3.f12643a = 0;
                                        Arrays.fill(settings3.f12644b, 0);
                                    }
                                    Settings settings4 = Http2Connection.this.A;
                                    settings4.getClass();
                                    int i10 = 0;
                                    while (true) {
                                        boolean z11 = true;
                                        if (i10 >= 10) {
                                            break;
                                        }
                                        if (((1 << i10) & settings2.f12643a) == 0) {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            settings4.b(i10, settings2.f12644b[i10]);
                                        }
                                        i10++;
                                    }
                                    int a11 = Http2Connection.this.A.a();
                                    http2StreamArr = null;
                                    if (a11 == -1 || a11 == a10) {
                                        j10 = 0;
                                    } else {
                                        j10 = a11 - a10;
                                        if (!Http2Connection.this.f12545c.isEmpty()) {
                                            http2StreamArr = (Http2Stream[]) Http2Connection.this.f12545c.values().toArray(new Http2Stream[Http2Connection.this.f12545c.size()]);
                                        }
                                    }
                                } finally {
                                }
                            }
                            try {
                                Http2Connection http2Connection2 = Http2Connection.this;
                                http2Connection2.C.f(http2Connection2.A);
                            } catch (IOException unused) {
                                Http2Connection.this.g();
                            }
                        }
                        if (http2StreamArr != null) {
                            for (Http2Stream http2Stream : http2StreamArr) {
                                synchronized (http2Stream) {
                                    http2Stream.f12610b += j10;
                                    if (j10 > 0) {
                                        http2Stream.notifyAll();
                                    }
                                }
                            }
                        }
                        Http2Connection.F.execute(new NamedRunnable(Http2Connection.this.f12546d) { // from class: okhttp3.internal.http2.Http2Connection.ReaderRunnable.3
                            @Override // okhttp3.internal.NamedRunnable
                            public final void k() {
                                Http2Connection http2Connection3 = Http2Connection.this;
                                http2Connection3.f12544b.a(http2Connection3);
                            }
                        });
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void g(int i10, ErrorCode errorCode) {
            Http2Connection.this.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.H(new NamedRunnable(new Object[]{http2Connection.f12546d, Integer.valueOf(i10)}, i10, errorCode) { // from class: okhttp3.internal.http2.Http2Connection.7

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f12576b;

                    @Override // okhttp3.internal.NamedRunnable
                    public final void k() {
                        Http2Connection.this.f12551r.getClass();
                        synchronized (Http2Connection.this) {
                            Http2Connection.this.E.remove(Integer.valueOf(this.f12576b));
                        }
                    }
                });
                return;
            }
            Http2Stream I = Http2Connection.this.I(i10);
            if (I != null) {
                synchronized (I) {
                    if (I.f12618k == null) {
                        I.f12618k = errorCode;
                        I.notifyAll();
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void h(final int i10, final ArrayList arrayList) {
            final Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.E.contains(Integer.valueOf(i10))) {
                    http2Connection.h0(i10, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.E.add(Integer.valueOf(i10));
                try {
                    http2Connection.H(new NamedRunnable(new Object[]{http2Connection.f12546d, Integer.valueOf(i10)}) { // from class: okhttp3.internal.http2.Http2Connection.4
                        @Override // okhttp3.internal.NamedRunnable
                        public final void k() {
                            ((PushObserver.AnonymousClass1) Http2Connection.this.f12551r).getClass();
                            try {
                                Http2Connection.this.C.I(i10, ErrorCode.CANCEL);
                                synchronized (Http2Connection.this) {
                                    Http2Connection.this.E.remove(Integer.valueOf(i10));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void i(int i10, i iVar) {
            Http2Stream[] http2StreamArr;
            iVar.i();
            synchronized (Http2Connection.this) {
                http2StreamArr = (Http2Stream[]) Http2Connection.this.f12545c.values().toArray(new Http2Stream[Http2Connection.this.f12545c.size()]);
                Http2Connection.this.f12548o = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.f12611c > i10 && http2Stream.e()) {
                    ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                    synchronized (http2Stream) {
                        if (http2Stream.f12618k == null) {
                            http2Stream.f12618k = errorCode;
                            http2Stream.notifyAll();
                        }
                    }
                    Http2Connection.this.I(http2Stream.f12611c);
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public final void j(int i10, ArrayList arrayList, boolean z10) {
            boolean f;
            boolean f10;
            Http2Connection.this.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                try {
                    http2Connection.H(new NamedRunnable(new Object[]{http2Connection.f12546d, Integer.valueOf(i10)}, i10, arrayList, z10) { // from class: okhttp3.internal.http2.Http2Connection.5

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f12569b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ List f12570c;

                        @Override // okhttp3.internal.NamedRunnable
                        public final void k() {
                            ((PushObserver.AnonymousClass1) Http2Connection.this.f12551r).getClass();
                            try {
                                Http2Connection.this.C.I(this.f12569b, ErrorCode.CANCEL);
                                synchronized (Http2Connection.this) {
                                    Http2Connection.this.E.remove(Integer.valueOf(this.f12569b));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (Http2Connection.this) {
                try {
                    Http2Stream C = Http2Connection.this.C(i10);
                    if (C == null) {
                        Http2Connection http2Connection2 = Http2Connection.this;
                        if (http2Connection2.f12548o) {
                            return;
                        }
                        if (i10 <= http2Connection2.f12547e) {
                            return;
                        }
                        if (i10 % 2 == http2Connection2.f % 2) {
                            return;
                        }
                        final Http2Stream http2Stream = new Http2Stream(i10, Http2Connection.this, false, z10, Util.w(arrayList));
                        Http2Connection http2Connection3 = Http2Connection.this;
                        http2Connection3.f12547e = i10;
                        http2Connection3.f12545c.put(Integer.valueOf(i10), http2Stream);
                        Http2Connection.F.execute(new NamedRunnable(new Object[]{Http2Connection.this.f12546d, Integer.valueOf(i10)}) { // from class: okhttp3.internal.http2.Http2Connection.ReaderRunnable.1
                            @Override // okhttp3.internal.NamedRunnable
                            public final void k() {
                                try {
                                    Http2Connection.this.f12544b.b(http2Stream);
                                } catch (IOException e10) {
                                    Platform platform = Platform.f12669a;
                                    StringBuilder l10 = defpackage.f.l("Http2Connection.Listener failure for ");
                                    l10.append(Http2Connection.this.f12546d);
                                    platform.l(4, l10.toString(), e10);
                                    try {
                                        http2Stream.c(ErrorCode.PROTOCOL_ERROR);
                                    } catch (IOException unused2) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                    synchronized (C) {
                        C.f = true;
                        C.f12613e.add(Util.w(arrayList));
                        f = C.f();
                        C.notifyAll();
                    }
                    if (!f) {
                        C.f12612d.I(C.f12611c);
                    }
                    if (z10) {
                        synchronized (C) {
                            C.f12614g.f12627e = true;
                            f10 = C.f();
                            C.notifyAll();
                        }
                        if (f10) {
                            return;
                        }
                        C.f12612d.I(C.f12611c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.NamedRunnable
        public final void k() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.f12591b.C(this);
                    while (this.f12591b.g(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                } catch (IOException unused) {
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    try {
                        Http2Connection.this.f(errorCode, errorCode2);
                    } catch (IOException unused2) {
                    }
                    Util.e(this.f12591b);
                    throw th;
                }
                try {
                    try {
                        Http2Connection.this.f(errorCode, ErrorCode.CANCEL);
                    } catch (Throwable th2) {
                        th = th2;
                        Http2Connection.this.f(errorCode, errorCode2);
                        Util.e(this.f12591b);
                        throw th;
                    }
                } catch (IOException unused3) {
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection.this.f(errorCode3, errorCode3);
                    Util.e(this.f12591b);
                }
            } catch (IOException unused4) {
            }
            Util.e(this.f12591b);
        }
    }

    public Http2Connection(Builder builder) {
        Settings settings = new Settings();
        this.A = settings;
        this.E = new LinkedHashSet();
        this.f12551r = builder.f;
        boolean z10 = builder.f12583g;
        this.f12543a = z10;
        this.f12544b = builder.f12582e;
        int i10 = z10 ? 1 : 2;
        this.f = i10;
        if (z10) {
            this.f = i10 + 2;
        }
        if (z10) {
            this.f12558z.b(7, 16777216);
        }
        String str = builder.f12579b;
        this.f12546d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.v(Util.l("OkHttp %s Writer", str), false));
        this.f12549p = scheduledThreadPoolExecutor;
        if (builder.f12584h != 0) {
            IntervalPingRunnable intervalPingRunnable = new IntervalPingRunnable();
            long j10 = builder.f12584h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(intervalPingRunnable, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f12550q = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.v(Util.l("OkHttp %s Push Observer", str), true));
        settings.b(7, 65535);
        settings.b(5, 16384);
        this.f12557y = settings.a();
        this.B = builder.f12578a;
        this.C = new Http2Writer(builder.f12581d, z10);
        this.D = new ReaderRunnable(new Http2Reader(builder.f12580c, z10));
    }

    public final synchronized Http2Stream C(int i10) {
        return (Http2Stream) this.f12545c.get(Integer.valueOf(i10));
    }

    public final synchronized void H(NamedRunnable namedRunnable) {
        if (!this.f12548o) {
            this.f12550q.execute(namedRunnable);
        }
    }

    public final synchronized Http2Stream I(int i10) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f12545c.remove(Integer.valueOf(i10));
        notifyAll();
        return http2Stream;
    }

    public final void M(ErrorCode errorCode) {
        synchronized (this.C) {
            synchronized (this) {
                if (this.f12548o) {
                    return;
                }
                this.f12548o = true;
                this.C.C(this.f12547e, errorCode, Util.f12372a);
            }
        }
    }

    public final void Q() {
        Http2Writer http2Writer = this.C;
        synchronized (http2Writer) {
            if (http2Writer.f12634e) {
                throw new IOException("closed");
            }
            if (http2Writer.f12631b) {
                Logger logger = Http2Writer.f12629o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.l(">> CONNECTION %s", Http2.f12530a.l()));
                }
                http2Writer.f12630a.write(Http2.f12530a.s());
                http2Writer.f12630a.flush();
            }
        }
        Http2Writer http2Writer2 = this.C;
        Settings settings = this.f12558z;
        synchronized (http2Writer2) {
            if (http2Writer2.f12634e) {
                throw new IOException("closed");
            }
            http2Writer2.g(0, Integer.bitCount(settings.f12643a) * 6, (byte) 4, (byte) 0);
            int i10 = 0;
            while (i10 < 10) {
                if (((1 << i10) & settings.f12643a) != 0) {
                    http2Writer2.f12630a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    http2Writer2.f12630a.writeInt(settings.f12644b[i10]);
                }
                i10++;
            }
            http2Writer2.f12630a.flush();
        }
        if (this.f12558z.a() != 65535) {
            this.C.d(0, r0 - 65535);
        }
        new Thread(this.D).start();
    }

    public final synchronized void b0(long j10) {
        long j11 = this.f12556x + j10;
        this.f12556x = j11;
        if (j11 >= this.f12558z.a() / 2) {
            i0(0, this.f12556x);
            this.f12556x = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.C.f12633d);
        r6 = r2;
        r8.f12557y -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0(int r9, boolean r10, xc.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.C
            r12.u(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.f12557y     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.LinkedHashMap r2 = r8.f12545c     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L54
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L54
            okhttp3.internal.http2.Http2Writer r4 = r8.C     // Catch: java.lang.Throwable -> L54
            int r4 = r4.f12633d     // Catch: java.lang.Throwable -> L54
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.f12557y     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.f12557y = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.C
            if (r10 == 0) goto L4f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = r3
        L50:
            r4.u(r5, r9, r11, r2)
            goto Ld
        L54:
            r9 = move-exception
            goto L63
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L54
            r9.interrupt()     // Catch: java.lang.Throwable -> L54
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.c0(int, boolean, xc.f, long):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void f(ErrorCode errorCode, ErrorCode errorCode2) {
        Http2Stream[] http2StreamArr = null;
        try {
            M(errorCode);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            if (!this.f12545c.isEmpty()) {
                http2StreamArr = (Http2Stream[]) this.f12545c.values().toArray(new Http2Stream[this.f12545c.size()]);
                this.f12545c.clear();
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(errorCode2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.C.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.B.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f12549p.shutdown();
        this.f12550q.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void flush() {
        Http2Writer http2Writer = this.C;
        synchronized (http2Writer) {
            if (http2Writer.f12634e) {
                throw new IOException("closed");
            }
            http2Writer.f12630a.flush();
        }
    }

    public final void g() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            f(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    public final void h0(final int i10, final ErrorCode errorCode) {
        try {
            this.f12549p.execute(new NamedRunnable(new Object[]{this.f12546d, Integer.valueOf(i10)}) { // from class: okhttp3.internal.http2.Http2Connection.1
                @Override // okhttp3.internal.NamedRunnable
                public final void k() {
                    try {
                        Http2Connection http2Connection = Http2Connection.this;
                        http2Connection.C.I(i10, errorCode);
                    } catch (IOException unused) {
                        Http2Connection http2Connection2 = Http2Connection.this;
                        ThreadPoolExecutor threadPoolExecutor = Http2Connection.F;
                        http2Connection2.g();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void i0(final int i10, final long j10) {
        try {
            this.f12549p.execute(new NamedRunnable(new Object[]{this.f12546d, Integer.valueOf(i10)}) { // from class: okhttp3.internal.http2.Http2Connection.2
                @Override // okhttp3.internal.NamedRunnable
                public final void k() {
                    try {
                        Http2Connection.this.C.d(i10, j10);
                    } catch (IOException unused) {
                        Http2Connection http2Connection = Http2Connection.this;
                        ThreadPoolExecutor threadPoolExecutor = Http2Connection.F;
                        http2Connection.g();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }
}
