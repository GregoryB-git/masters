/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  android.view.Display
 *  android.view.Surface
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package D0;

import D0.i;
import D0.o;
import D0.r;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import g0.M;

public final class s {
    public final i a = new i();
    public final b b;
    public final c c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public s(Context object) {
        this.b = object = this.f((Context)object);
        object = object != null ? c.d() : null;
        this.c = object;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static boolean c(long l8, long l9) {
        if (Math.abs((long)(l8 - l9)) <= 20000000L) {
            return true;
        }
        return false;
    }

    public static long e(long l8, long l9, long l10) {
        if (l8 <= (l9 += (l8 - l9) / l10 * l10)) {
            l10 = l9 - l10;
        } else {
            long l11 = l10 + l9;
            l10 = l9;
            l9 = l11;
        }
        if (l9 - l8 < l8 - l10) {
            return l9;
        }
        return l10;
    }

    public long b(long l8) {
        long l9;
        if (this.p != -1L && this.a.e()) {
            l9 = this.a.a();
            if (s.c(l8, l9 = this.q + (long)((float)(l9 * (this.m - this.p)) / this.i))) {
                l8 = l9;
            } else {
                this.n();
            }
        }
        this.n = this.m;
        this.o = l8;
        c c8 = this.c;
        if (c8 != null) {
            if (this.k == -9223372036854775807L) {
                return l8;
            }
            l9 = c8.o;
            if (l9 == -9223372036854775807L) {
                return l8;
            }
            return s.e(l8, l9, this.k) - this.l;
        }
        return l8;
    }

    public final void d() {
        Surface surface;
        if (M.a >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE) {
            if (this.h == 0.0f) {
                return;
            }
            this.h = 0.0f;
            a.a(surface, 0.0f);
        }
    }

    public final b f(Context object) {
        Object var2_2 = null;
        if (object == null) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager)object.getSystemService("display");
        object = var2_2;
        if (displayManager != null) {
            object = new b(displayManager);
        }
        return object;
    }

    public void g(float f8) {
        this.f = f8;
        this.a.g();
        this.q();
    }

    public void h(long l8) {
        long l9 = this.n;
        if (l9 != -1L) {
            this.p = l9;
            this.q = this.o;
        }
        ++this.m;
        this.a.f(l8 * 1000L);
        this.q();
    }

    public void i(float f8) {
        this.i = f8;
        this.n();
        this.r(false);
    }

    public void j() {
        this.n();
    }

    public void k() {
        this.d = true;
        this.n();
        if (this.b != null) {
            ((c)g0.a.e(this.c)).a();
            this.b.b();
        }
        this.r(false);
    }

    public void l() {
        this.d = false;
        b b8 = this.b;
        if (b8 != null) {
            b8.c();
            ((c)g0.a.e(this.c)).e();
        }
        this.d();
    }

    public void m(Surface surface) {
        Surface surface2 = surface;
        if (surface instanceof o) {
            surface2 = null;
        }
        if (this.e == surface2) {
            return;
        }
        this.d();
        this.e = surface2;
        this.r(true);
    }

    public final void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public void o(int n8) {
        if (this.j == n8) {
            return;
        }
        this.j = n8;
        this.r(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void p(Display display) {
        long l8;
        if (display != null) {
            this.k = l8 = (long)(1.0E9 / (double)display.getRefreshRate());
            l8 = l8 * 80L / 100L;
        } else {
            g0.o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            l8 = -9223372036854775807L;
            this.k = -9223372036854775807L;
        }
        this.l = l8;
    }

    public final void q() {
        block5 : {
            float f8;
            block7 : {
                float f9;
                block6 : {
                    if (M.a < 30) break block5;
                    if (this.e == null) {
                        return;
                    }
                    f8 = this.a.e() ? this.a.b() : this.f;
                    float f10 = this.g;
                    if (f8 == f10) {
                        return;
                    }
                    f9 = f8 FCMPL -1.0f;
                    if (f9 == false || f10 == -1.0f) break block6;
                    f10 = this.a.e() && this.a.d() >= 5000000000L ? 0.02f : 1.0f;
                    if (Math.abs((float)(f8 - this.g)) < f10) break block5;
                    break block7;
                }
                if (f9 == false && this.a.c() < 30) break block5;
            }
            this.g = f8;
            this.r(false);
        }
    }

    public final void r(boolean bl) {
        Surface surface;
        if (M.a >= 30 && (surface = this.e) != null) {
            float f8;
            if (this.j == Integer.MIN_VALUE) {
                return;
            }
            f8 = this.d && (f8 = this.g) != -1.0f ? (f8 *= this.i) : 0.0f;
            if (!bl && this.h == f8) {
                return;
            }
            this.h = f8;
            a.a(surface, f8);
        }
    }

    public static final abstract class a {
        public static void a(Surface surface, float f8) {
            int n8 = f8 == 0.0f ? 0 : 1;
            try {
                r.a(surface, f8, n8);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                g0.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", (Throwable)illegalStateException);
                return;
            }
        }
    }

    public final class b
    implements DisplayManager.DisplayListener {
        public final DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public final Display a() {
            return this.a.getDisplay(0);
        }

        public void b() {
            this.a.registerDisplayListener((DisplayManager.DisplayListener)this, M.A());
            s.this.p(this.a());
        }

        public void c() {
            this.a.unregisterDisplayListener((DisplayManager.DisplayListener)this);
        }

        public void onDisplayAdded(int n8) {
        }

        public void onDisplayChanged(int n8) {
            if (n8 == 0) {
                s.this.p(this.a());
            }
        }

        public void onDisplayRemoved(int n8) {
        }
    }

    public static final class c
    implements Choreographer.FrameCallback,
    Handler.Callback {
        public static final c t = new c();
        public volatile long o = -9223372036854775807L;
        public final Handler p;
        public final HandlerThread q;
        public Choreographer r;
        public int s;

        public c() {
            HandlerThread handlerThread;
            this.q = handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            handlerThread = M.z(handlerThread.getLooper(), this);
            this.p = handlerThread;
            handlerThread.sendEmptyMessage(1);
        }

        public static c d() {
            return t;
        }

        public void a() {
            this.p.sendEmptyMessage(2);
        }

        public final void b() {
            Choreographer choreographer = this.r;
            if (choreographer != null) {
                int n8;
                this.s = n8 = this.s + 1;
                if (n8 == 1) {
                    choreographer.postFrameCallback((Choreographer.FrameCallback)this);
                }
            }
        }

        public final void c() {
            try {
                this.r = Choreographer.getInstance();
                return;
            }
            catch (RuntimeException runtimeException) {
                g0.o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", (Throwable)runtimeException);
                return;
            }
        }

        public void doFrame(long l8) {
            this.o = l8;
            ((Choreographer)g0.a.e((Object)this.r)).postFrameCallbackDelayed((Choreographer.FrameCallback)this, 500L);
        }

        public void e() {
            this.p.sendEmptyMessage(3);
        }

        public final void f() {
            Choreographer choreographer = this.r;
            if (choreographer != null) {
                int n8;
                this.s = n8 = this.s - 1;
                if (n8 == 0) {
                    choreographer.removeFrameCallback((Choreographer.FrameCallback)this);
                    this.o = -9223372036854775807L;
                }
            }
        }

        public boolean handleMessage(Message message) {
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return false;
                    }
                    this.f();
                    return true;
                }
                this.b();
                return true;
            }
            this.c();
            return true;
        }
    }

}

