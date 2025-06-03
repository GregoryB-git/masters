package t5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d0 implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f14467d = new b(0, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final b f14468e = new b(2, -9223372036854775807L);
    public static final b f = new b(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f14469a;

    /* renamed from: b, reason: collision with root package name */
    public c<? extends d> f14470b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f14471c;

    public interface a<T extends d> {
        void k(T t, long j10, long j11, boolean z10);

        void p(T t, long j10, long j11);

        b u(T t, long j10, long j11, IOException iOException, int i10);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14472a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14473b;

        public b(int i10, long j10) {
            this.f14472a = i10;
            this.f14473b = j10;
        }

        public final boolean a() {
            int i10 = this.f14472a;
            return i10 == 0 || i10 == 1;
        }
    }

    public final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f14474a;

        /* renamed from: b, reason: collision with root package name */
        public final T f14475b;

        /* renamed from: c, reason: collision with root package name */
        public final long f14476c;

        /* renamed from: d, reason: collision with root package name */
        public a<T> f14477d;

        /* renamed from: e, reason: collision with root package name */
        public IOException f14478e;
        public int f;

        /* renamed from: o, reason: collision with root package name */
        public Thread f14479o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f14480p;

        /* renamed from: q, reason: collision with root package name */
        public volatile boolean f14481q;

        public c(Looper looper, T t, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f14475b = t;
            this.f14477d = aVar;
            this.f14474a = i10;
            this.f14476c = j10;
        }

        public final void a(boolean z10) {
            this.f14481q = z10;
            this.f14478e = null;
            if (hasMessages(0)) {
                this.f14480p = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14480p = true;
                    this.f14475b.b();
                    Thread thread = this.f14479o;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                d0.this.f14470b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f14477d;
                aVar.getClass();
                aVar.k(this.f14475b, elapsedRealtime, elapsedRealtime - this.f14476c, true);
                this.f14477d = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(long j10) {
            x6.b.H(d0.this.f14470b == null);
            d0 d0Var = d0.this;
            d0Var.f14470b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                this.f14478e = null;
                d0Var.f14469a.execute(this);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f14481q) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f14478e = null;
                d0 d0Var = d0.this;
                ExecutorService executorService = d0Var.f14469a;
                c<? extends d> cVar = d0Var.f14470b;
                cVar.getClass();
                executorService.execute(cVar);
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            d0.this.f14470b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f14476c;
            a<T> aVar = this.f14477d;
            aVar.getClass();
            if (this.f14480p) {
                aVar.k(this.f14475b, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    aVar.p(this.f14475b, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    v5.m.d("LoadTask", "Unexpected exception handling load completed", e10);
                    d0.this.f14471c = new g(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f14478e = iOException;
            int i12 = this.f + 1;
            this.f = i12;
            b u10 = aVar.u(this.f14475b, elapsedRealtime, j10, iOException, i12);
            int i13 = u10.f14472a;
            if (i13 == 3) {
                d0.this.f14471c = this.f14478e;
            } else if (i13 != 2) {
                if (i13 == 1) {
                    this.f = 1;
                }
                long j11 = u10.f14473b;
                if (j11 == -9223372036854775807L) {
                    j11 = Math.min((this.f - 1) * 1000, 5000);
                }
                b(j11);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f14480p;
                    this.f14479o = Thread.currentThread();
                }
                if (z10) {
                    p2.m0.i("load:" + this.f14475b.getClass().getSimpleName());
                    try {
                        this.f14475b.a();
                        p2.m0.B();
                    } catch (Throwable th) {
                        p2.m0.B();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f14479o = null;
                    Thread.interrupted();
                }
                if (this.f14481q) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f14481q) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Exception e11) {
                if (this.f14481q) {
                    return;
                }
                v5.m.d("LoadTask", "Unexpected exception loading stream", e11);
                gVar = new g(e11);
                obtainMessage = obtainMessage(2, gVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f14481q) {
                    return;
                }
                v5.m.d("LoadTask", "OutOfMemory error loading stream", e12);
                gVar = new g(e12);
                obtainMessage = obtainMessage(2, gVar);
                obtainMessage.sendToTarget();
            } catch (Error e13) {
                if (!this.f14481q) {
                    v5.m.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void f();
    }

    public static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final e f14483a;

        public f(e eVar) {
            this.f14483a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14483a.f();
        }
    }

    public static final class g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public g(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected "
                java.lang.StringBuilder r0 = defpackage.f.l(r0)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.d0.g.<init>(java.lang.Throwable):void");
        }
    }

    public d0(String str) {
        String d10 = defpackage.g.d("ExoPlayer:Loader:", str);
        int i10 = v5.e0.f15881a;
        this.f14469a = Executors.newSingleThreadExecutor(new t0.a(d10, 1));
    }

    @Override // t5.e0
    public final void a() {
        IOException iOException = this.f14471c;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.f14470b;
        if (cVar != null) {
            int i10 = cVar.f14474a;
            IOException iOException2 = cVar.f14478e;
            if (iOException2 != null && cVar.f > i10) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        c<? extends d> cVar = this.f14470b;
        x6.b.K(cVar);
        cVar.a(false);
    }

    public final boolean c() {
        return this.f14471c != null;
    }

    public final boolean d() {
        return this.f14470b != null;
    }

    public final void e(e eVar) {
        c<? extends d> cVar = this.f14470b;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f14469a.execute(new f(eVar));
        }
        this.f14469a.shutdown();
    }

    public final <T extends d> long f(T t, a<T> aVar, int i10) {
        Looper myLooper = Looper.myLooper();
        x6.b.K(myLooper);
        this.f14471c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, t, aVar, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
