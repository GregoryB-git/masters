// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import android.os.Message;
import android.view.Choreographer;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Handler$Callback;
import android.view.Choreographer$FrameCallback;
import android.hardware.display.DisplayManager$DisplayListener;
import g0.a;
import android.hardware.display.DisplayManager;
import g0.M;
import android.view.Display;
import android.content.Context;
import android.view.Surface;

public final class s
{
    public final i a;
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
    
    public s(final Context context) {
        this.a = new i();
        final b f = this.f(context);
        this.b = f;
        c d;
        if (f != null) {
            d = s.c.d();
        }
        else {
            d = null;
        }
        this.c = d;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }
    
    public static boolean c(final long n, final long n2) {
        return Math.abs(n - n2) <= 20000000L;
    }
    
    public static long e(final long n, long n2, long n3) {
        n2 += (n - n2) / n3 * n3;
        if (n <= n2) {
            n3 = n2 - n3;
        }
        else {
            final long n4 = n3 + n2;
            n3 = n2;
            n2 = n4;
        }
        if (n2 - n < n - n3) {
            return n2;
        }
        return n3;
    }
    
    public long b(long o) {
        if (this.p != -1L && this.a.e()) {
            final long n = this.q + (long)(this.a.a() * (this.m - this.p) / this.i);
            if (c(o, n)) {
                o = n;
            }
            else {
                this.n();
            }
        }
        this.n = this.m;
        this.o = o;
        final c c = this.c;
        if (c == null) {
            return o;
        }
        if (this.k == -9223372036854775807L) {
            return o;
        }
        final long o2 = c.o;
        if (o2 == -9223372036854775807L) {
            return o;
        }
        return e(o, o2, this.k) - this.l;
    }
    
    public final void d() {
        if (M.a >= 30) {
            final Surface e = this.e;
            if (e != null && this.j != Integer.MIN_VALUE) {
                if (this.h == 0.0f) {
                    return;
                }
                s.a.a(e, this.h = 0.0f);
            }
        }
    }
    
    public final b f(final Context context) {
        final b b = null;
        if (context == null) {
            return null;
        }
        final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        b b2 = b;
        if (displayManager != null) {
            b2 = new b(displayManager);
        }
        return b2;
    }
    
    public void g(final float f) {
        this.f = f;
        this.a.g();
        this.q();
    }
    
    public void h(final long n) {
        final long n2 = this.n;
        if (n2 != -1L) {
            this.p = n2;
            this.q = this.o;
        }
        ++this.m;
        this.a.f(n * 1000L);
        this.q();
    }
    
    public void i(final float i) {
        this.i = i;
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
        final b b = this.b;
        if (b != null) {
            b.c();
            ((c)g0.a.e(this.c)).e();
        }
        this.d();
    }
    
    public void m(final Surface surface) {
        Surface e = surface;
        if (surface instanceof o) {
            e = null;
        }
        if (this.e == e) {
            return;
        }
        this.d();
        this.e = e;
        this.r(true);
    }
    
    public final void n() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }
    
    public void o(final int j) {
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.r(true);
    }
    
    public final void p(final Display display) {
        long l;
        if (display != null) {
            final long k = (long)(1.0E9 / display.getRefreshRate());
            this.k = k;
            l = k * 80L / 100L;
        }
        else {
            g0.o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            l = -9223372036854775807L;
            this.k = -9223372036854775807L;
        }
        this.l = l;
    }
    
    public final void q() {
        if (M.a >= 30) {
            if (this.e == null) {
                return;
            }
            float g;
            if (this.a.e()) {
                g = this.a.b();
            }
            else {
                g = this.f;
            }
            final float g2 = this.g;
            if (g == g2) {
                return;
            }
            final float n = fcmpl(g, -1.0f);
            if (n != 0 && g2 != -1.0f) {
                float n2;
                if (this.a.e() && this.a.d() >= 5000000000L) {
                    n2 = 0.02f;
                }
                else {
                    n2 = 1.0f;
                }
                if (Math.abs(g - this.g) < n2) {
                    return;
                }
            }
            else if (n == 0) {
                if (this.a.c() < 30) {
                    return;
                }
            }
            this.g = g;
            this.r(false);
        }
    }
    
    public final void r(final boolean b) {
        if (M.a >= 30) {
            final Surface e = this.e;
            if (e != null) {
                if (this.j == Integer.MIN_VALUE) {
                    return;
                }
                float h = 0.0f;
                Label_0058: {
                    if (this.d) {
                        final float g = this.g;
                        if (g != -1.0f) {
                            h = g * this.i;
                            break Label_0058;
                        }
                    }
                    h = 0.0f;
                }
                if (!b && this.h == h) {
                    return;
                }
                s.a.a(e, this.h = h);
            }
        }
    }
    
    public abstract static final class a
    {
        public static void a(final Surface surface, final float n) {
            int n2;
            if (n == 0.0f) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            try {
                r.a(surface, n, n2);
            }
            catch (IllegalStateException ex) {
                g0.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", ex);
            }
        }
    }
    
    public final class b implements DisplayManager$DisplayListener
    {
        public final DisplayManager a;
        
        public b(final DisplayManager a) {
            this.a = a;
        }
        
        public final Display a() {
            return this.a.getDisplay(0);
        }
        
        public void b() {
            this.a.registerDisplayListener((DisplayManager$DisplayListener)this, M.A());
            s.this.p(this.a());
        }
        
        public void c() {
            this.a.unregisterDisplayListener((DisplayManager$DisplayListener)this);
        }
        
        public void onDisplayAdded(final int n) {
        }
        
        public void onDisplayChanged(final int n) {
            if (n == 0) {
                s.this.p(this.a());
            }
        }
        
        public void onDisplayRemoved(final int n) {
        }
    }
    
    public static final class c implements Choreographer$FrameCallback, Handler$Callback
    {
        public static final c t;
        public volatile long o;
        public final Handler p;
        public final HandlerThread q;
        public Choreographer r;
        public int s;
        
        static {
            t = new c();
        }
        
        public c() {
            this.o = -9223372036854775807L;
            final HandlerThread q = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            ((Thread)(this.q = q)).start();
            (this.p = M.z(q.getLooper(), (Handler$Callback)this)).sendEmptyMessage(1);
        }
        
        public static c d() {
            return c.t;
        }
        
        public void a() {
            this.p.sendEmptyMessage(2);
        }
        
        public final void b() {
            final Choreographer r = this.r;
            if (r != null && ++this.s == 1) {
                r.postFrameCallback((Choreographer$FrameCallback)this);
            }
        }
        
        public final void c() {
            try {
                this.r = Choreographer.getInstance();
            }
            catch (RuntimeException ex) {
                g0.o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", ex);
            }
        }
        
        public void doFrame(final long o) {
            this.o = o;
            ((Choreographer)g0.a.e(this.r)).postFrameCallbackDelayed((Choreographer$FrameCallback)this, 500L);
        }
        
        public void e() {
            this.p.sendEmptyMessage(3);
        }
        
        public final void f() {
            final Choreographer r = this.r;
            if (r != null && --this.s == 0) {
                r.removeFrameCallback((Choreographer$FrameCallback)this);
                this.o = -9223372036854775807L;
            }
        }
        
        public boolean handleMessage(final Message message) {
            final int what = message.what;
            if (what == 1) {
                this.c();
                return true;
            }
            if (what == 2) {
                this.b();
                return true;
            }
            if (what != 3) {
                return false;
            }
            this.f();
            return true;
        }
    }
}
