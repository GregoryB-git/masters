package B0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import g0.AbstractC1297a;
import g0.F;
import g0.M;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final c f631d = h(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f632e = h(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f633f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f634g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f635a;

    /* renamed from: b, reason: collision with root package name */
    public d f636b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f637c;

    public interface b {
        void o(e eVar, long j7, long j8);

        c r(e eVar, long j7, long j8, IOException iOException, int i7);

        void t(e eVar, long j7, long j8, boolean z7);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f638a;

        /* renamed from: b, reason: collision with root package name */
        public final long f639b;

        public c(int i7, long j7) {
            this.f638a = i7;
            this.f639b = j7;
        }

        public boolean c() {
            int i7 = this.f638a;
            return i7 == 0 || i7 == 1;
        }
    }

    public final class d extends Handler implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final int f640o;

        /* renamed from: p, reason: collision with root package name */
        public final e f641p;

        /* renamed from: q, reason: collision with root package name */
        public final long f642q;

        /* renamed from: r, reason: collision with root package name */
        public b f643r;

        /* renamed from: s, reason: collision with root package name */
        public IOException f644s;

        /* renamed from: t, reason: collision with root package name */
        public int f645t;

        /* renamed from: u, reason: collision with root package name */
        public Thread f646u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f647v;

        /* renamed from: w, reason: collision with root package name */
        public volatile boolean f648w;

        public d(Looper looper, e eVar, b bVar, int i7, long j7) {
            super(looper);
            this.f641p = eVar;
            this.f643r = bVar;
            this.f640o = i7;
            this.f642q = j7;
        }

        public void a(boolean z7) {
            this.f648w = z7;
            this.f644s = null;
            if (hasMessages(1)) {
                this.f647v = true;
                removeMessages(1);
                if (!z7) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f647v = true;
                        this.f641p.c();
                        Thread thread = this.f646u;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z7) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC1297a.e(this.f643r)).t(this.f641p, elapsedRealtime, elapsedRealtime - this.f642q, true);
                this.f643r = null;
            }
        }

        public final void b() {
            this.f644s = null;
            n.this.f635a.execute((Runnable) AbstractC1297a.e(n.this.f636b));
        }

        public final void c() {
            n.this.f636b = null;
        }

        public final long d() {
            return Math.min((this.f645t - 1) * 1000, 5000);
        }

        public void e(int i7) {
            IOException iOException = this.f644s;
            if (iOException != null && this.f645t > i7) {
                throw iOException;
            }
        }

        public void f(long j7) {
            AbstractC1297a.f(n.this.f636b == null);
            n.this.f636b = this;
            if (j7 > 0) {
                sendEmptyMessageDelayed(1, j7);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f648w) {
                return;
            }
            int i7 = message.what;
            if (i7 == 1) {
                b();
                return;
            }
            if (i7 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = elapsedRealtime - this.f642q;
            b bVar = (b) AbstractC1297a.e(this.f643r);
            if (this.f647v) {
                bVar.t(this.f641p, elapsedRealtime, j7, false);
                return;
            }
            int i8 = message.what;
            if (i8 == 2) {
                try {
                    bVar.o(this.f641p, elapsedRealtime, j7);
                    return;
                } catch (RuntimeException e7) {
                    g0.o.d("LoadTask", "Unexpected exception handling load completed", e7);
                    n.this.f637c = new h(e7);
                    return;
                }
            }
            if (i8 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f644s = iOException;
            int i9 = this.f645t + 1;
            this.f645t = i9;
            c r7 = bVar.r(this.f641p, elapsedRealtime, j7, iOException, i9);
            if (r7.f638a == 3) {
                n.this.f637c = this.f644s;
            } else if (r7.f638a != 2) {
                if (r7.f638a == 1) {
                    this.f645t = 1;
                }
                f(r7.f639b != -9223372036854775807L ? r7.f639b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object hVar;
            Message obtainMessage;
            boolean z7;
            try {
                synchronized (this) {
                    z7 = !this.f647v;
                    this.f646u = Thread.currentThread();
                }
                if (z7) {
                    F.a("load:" + this.f641p.getClass().getSimpleName());
                    try {
                        this.f641p.b();
                        F.b();
                    } catch (Throwable th) {
                        F.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f646u = null;
                    Thread.interrupted();
                }
                if (this.f648w) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e7) {
                if (this.f648w) {
                    return;
                }
                obtainMessage = obtainMessage(3, e7);
                obtainMessage.sendToTarget();
            } catch (Exception e8) {
                if (this.f648w) {
                    return;
                }
                g0.o.d("LoadTask", "Unexpected exception loading stream", e8);
                hVar = new h(e8);
                obtainMessage = obtainMessage(3, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e9) {
                if (this.f648w) {
                    return;
                }
                g0.o.d("LoadTask", "OutOfMemory error loading stream", e9);
                hVar = new h(e9);
                obtainMessage = obtainMessage(3, hVar);
                obtainMessage.sendToTarget();
            } catch (Error e10) {
                if (!this.f648w) {
                    g0.o.d("LoadTask", "Unexpected error loading stream", e10);
                    obtainMessage(4, e10).sendToTarget();
                }
                throw e10;
            }
        }
    }

    public interface e {
        void b();

        void c();
    }

    public interface f {
        void k();
    }

    public static final class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final f f650o;

        public g(f fVar) {
            this.f650o = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f650o.k();
        }
    }

    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected "
                r0.append(r1)
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = r4.getMessage()
                if (r1 == 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L33
            L31:
                java.lang.String r1 = ""
            L33:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B0.n.h.<init>(java.lang.Throwable):void");
        }
    }

    static {
        long j7 = -9223372036854775807L;
        f633f = new c(2, j7);
        f634g = new c(3, j7);
    }

    public n(String str) {
        this.f635a = M.K0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z7, long j7) {
        return new c(z7 ? 1 : 0, j7);
    }

    @Override // B0.o
    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC1297a.h(this.f636b)).a(false);
    }

    public void g() {
        this.f637c = null;
    }

    public boolean i() {
        return this.f637c != null;
    }

    public boolean j() {
        return this.f636b != null;
    }

    public void k(int i7) {
        IOException iOException = this.f637c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f636b;
        if (dVar != null) {
            if (i7 == Integer.MIN_VALUE) {
                i7 = dVar.f640o;
            }
            dVar.e(i7);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f636b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f635a.execute(new g(fVar));
        }
        this.f635a.shutdown();
    }

    public long n(e eVar, b bVar, int i7) {
        Looper looper = (Looper) AbstractC1297a.h(Looper.myLooper());
        this.f637c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i7, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
