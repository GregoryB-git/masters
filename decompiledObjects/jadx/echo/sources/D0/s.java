package D0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import g0.AbstractC1297a;
import g0.M;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final i f1189a = new i();

    /* renamed from: b, reason: collision with root package name */
    public final b f1190b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1191c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1192d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f1193e;

    /* renamed from: f, reason: collision with root package name */
    public float f1194f;

    /* renamed from: g, reason: collision with root package name */
    public float f1195g;

    /* renamed from: h, reason: collision with root package name */
    public float f1196h;

    /* renamed from: i, reason: collision with root package name */
    public float f1197i;

    /* renamed from: j, reason: collision with root package name */
    public int f1198j;

    /* renamed from: k, reason: collision with root package name */
    public long f1199k;

    /* renamed from: l, reason: collision with root package name */
    public long f1200l;

    /* renamed from: m, reason: collision with root package name */
    public long f1201m;

    /* renamed from: n, reason: collision with root package name */
    public long f1202n;

    /* renamed from: o, reason: collision with root package name */
    public long f1203o;

    /* renamed from: p, reason: collision with root package name */
    public long f1204p;

    /* renamed from: q, reason: collision with root package name */
    public long f1205q;

    public static final class a {
        public static void a(Surface surface, float f7) {
            try {
                surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e7) {
                g0.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
            }
        }
    }

    public static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: t, reason: collision with root package name */
        public static final c f1208t = new c();

        /* renamed from: o, reason: collision with root package name */
        public volatile long f1209o = -9223372036854775807L;

        /* renamed from: p, reason: collision with root package name */
        public final Handler f1210p;

        /* renamed from: q, reason: collision with root package name */
        public final HandlerThread f1211q;

        /* renamed from: r, reason: collision with root package name */
        public Choreographer f1212r;

        /* renamed from: s, reason: collision with root package name */
        public int f1213s;

        public c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f1211q = handlerThread;
            handlerThread.start();
            Handler z7 = M.z(handlerThread.getLooper(), this);
            this.f1210p = z7;
            z7.sendEmptyMessage(1);
        }

        public static c d() {
            return f1208t;
        }

        public void a() {
            this.f1210p.sendEmptyMessage(2);
        }

        public final void b() {
            Choreographer choreographer = this.f1212r;
            if (choreographer != null) {
                int i7 = this.f1213s + 1;
                this.f1213s = i7;
                if (i7 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public final void c() {
            try {
                this.f1212r = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                g0.o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            this.f1209o = j7;
            ((Choreographer) AbstractC1297a.e(this.f1212r)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f1210p.sendEmptyMessage(3);
        }

        public final void f() {
            Choreographer choreographer = this.f1212r;
            if (choreographer != null) {
                int i7 = this.f1213s - 1;
                this.f1213s = i7;
                if (i7 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f1209o = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 1) {
                c();
                return true;
            }
            if (i7 == 2) {
                b();
                return true;
            }
            if (i7 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public s(Context context) {
        b f7 = f(context);
        this.f1190b = f7;
        this.f1191c = f7 != null ? c.d() : null;
        this.f1199k = -9223372036854775807L;
        this.f1200l = -9223372036854775807L;
        this.f1194f = -1.0f;
        this.f1197i = 1.0f;
        this.f1198j = 0;
    }

    public static boolean c(long j7, long j8) {
        return Math.abs(j7 - j8) <= 20000000;
    }

    public static long e(long j7, long j8, long j9) {
        long j10;
        long j11 = j8 + (((j7 - j8) / j9) * j9);
        if (j7 <= j11) {
            j10 = j11 - j9;
        } else {
            j11 = j9 + j11;
            j10 = j11;
        }
        return j11 - j7 < j7 - j10 ? j11 : j10;
    }

    public long b(long j7) {
        long j8;
        c cVar;
        if (this.f1204p != -1 && this.f1189a.e()) {
            long a7 = this.f1205q + ((long) ((this.f1189a.a() * (this.f1201m - this.f1204p)) / this.f1197i));
            if (c(j7, a7)) {
                j8 = a7;
                this.f1202n = this.f1201m;
                this.f1203o = j8;
                cVar = this.f1191c;
                if (cVar != null || this.f1199k == -9223372036854775807L) {
                    return j8;
                }
                long j9 = cVar.f1209o;
                return j9 == -9223372036854775807L ? j8 : e(j8, j9, this.f1199k) - this.f1200l;
            }
            n();
        }
        j8 = j7;
        this.f1202n = this.f1201m;
        this.f1203o = j8;
        cVar = this.f1191c;
        if (cVar != null) {
        }
        return j8;
    }

    public final void d() {
        Surface surface;
        if (M.f14261a < 30 || (surface = this.f1193e) == null || this.f1198j == Integer.MIN_VALUE || this.f1196h == 0.0f) {
            return;
        }
        this.f1196h = 0.0f;
        a.a(surface, 0.0f);
    }

    public final b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    public void g(float f7) {
        this.f1194f = f7;
        this.f1189a.g();
        q();
    }

    public void h(long j7) {
        long j8 = this.f1202n;
        if (j8 != -1) {
            this.f1204p = j8;
            this.f1205q = this.f1203o;
        }
        this.f1201m++;
        this.f1189a.f(j7 * 1000);
        q();
    }

    public void i(float f7) {
        this.f1197i = f7;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f1192d = true;
        n();
        if (this.f1190b != null) {
            ((c) AbstractC1297a.e(this.f1191c)).a();
            this.f1190b.b();
        }
        r(false);
    }

    public void l() {
        this.f1192d = false;
        b bVar = this.f1190b;
        if (bVar != null) {
            bVar.c();
            ((c) AbstractC1297a.e(this.f1191c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof o) {
            surface = null;
        }
        if (this.f1193e == surface) {
            return;
        }
        d();
        this.f1193e = surface;
        r(true);
    }

    public final void n() {
        this.f1201m = 0L;
        this.f1204p = -1L;
        this.f1202n = -1L;
    }

    public void o(int i7) {
        if (this.f1198j == i7) {
            return;
        }
        this.f1198j = i7;
        r(true);
    }

    public final void p(Display display) {
        long j7;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f1199k = refreshRate;
            j7 = (refreshRate * 80) / 100;
        } else {
            g0.o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j7 = -9223372036854775807L;
            this.f1199k = -9223372036854775807L;
        }
        this.f1200l = j7;
    }

    public final void q() {
        if (M.f14261a < 30 || this.f1193e == null) {
            return;
        }
        float b7 = this.f1189a.e() ? this.f1189a.b() : this.f1194f;
        float f7 = this.f1195g;
        if (b7 == f7) {
            return;
        }
        if (b7 != -1.0f && f7 != -1.0f) {
            if (Math.abs(b7 - this.f1195g) < ((!this.f1189a.e() || this.f1189a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b7 == -1.0f && this.f1189a.c() < 30) {
            return;
        }
        this.f1195g = b7;
        r(false);
    }

    public final void r(boolean z7) {
        Surface surface;
        float f7;
        if (M.f14261a < 30 || (surface = this.f1193e) == null || this.f1198j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f1192d) {
            float f8 = this.f1195g;
            if (f8 != -1.0f) {
                f7 = f8 * this.f1197i;
                if (z7 && this.f1196h == f7) {
                    return;
                }
                this.f1196h = f7;
                a.a(surface, f7);
            }
        }
        f7 = 0.0f;
        if (z7) {
        }
        this.f1196h = f7;
        a.a(surface, f7);
    }

    public final class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f1206a;

        public b(DisplayManager displayManager) {
            this.f1206a = displayManager;
        }

        public final Display a() {
            return this.f1206a.getDisplay(0);
        }

        public void b() {
            this.f1206a.registerDisplayListener(this, M.A());
            s.this.p(a());
        }

        public void c() {
            this.f1206a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            if (i7 == 0) {
                s.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }
}
