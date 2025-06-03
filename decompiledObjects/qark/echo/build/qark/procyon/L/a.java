// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.animation.TimeInterpolator;
import android.view.animation.AnimationUtils;
import I.s;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.View$OnTouchListener;

public abstract class a implements View$OnTouchListener
{
    public static final int F;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final a o;
    public final Interpolator p;
    public final View q;
    public Runnable r;
    public float[] s;
    public float[] t;
    public int u;
    public int v;
    public float[] w;
    public float[] x;
    public float[] y;
    public boolean z;
    
    static {
        F = ViewConfiguration.getTapTimeout();
    }
    
    public a(final View q) {
        this.o = new a();
        this.p = (Interpolator)new AccelerateInterpolator();
        this.s = new float[] { 0.0f, 0.0f };
        this.t = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.w = new float[] { 0.0f, 0.0f };
        this.x = new float[] { 0.0f, 0.0f };
        this.y = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.q = q;
        final float density = Resources.getSystem().getDisplayMetrics().density;
        final int n = (int)(1575.0f * density + 0.5f);
        final int n2 = (int)(density * 315.0f + 0.5f);
        final float n3 = (float)n;
        this.o(n3, n3);
        final float n4 = (float)n2;
        this.p(n4, n4);
        this.l(1);
        this.n(Float.MAX_VALUE, Float.MAX_VALUE);
        this.s(0.2f, 0.2f);
        this.t(1.0f, 1.0f);
        this.k(a.F);
        this.r(500);
        this.q(500);
    }
    
    public static float e(final float n, final float n2, final float n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    public static int f(final int n, final int n2, final int n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    public abstract boolean a(final int p0);
    
    public abstract boolean b(final int p0);
    
    public void c() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.q.onTouchEvent(obtain);
        obtain.recycle();
    }
    
    public final float d(final int n, float h, float n2, float n3) {
        h = this.h(this.s[n], n2, this.t[n], h);
        final float n4 = fcmpl(h, 0.0f);
        if (n4 == 0) {
            return 0.0f;
        }
        final float n5 = this.w[n];
        n2 = this.x[n];
        final float n6 = this.y[n];
        n3 *= n5;
        if (n4 > 0) {
            return e(h * n3, n2, n6);
        }
        return -e(-h * n3, n2, n6);
    }
    
    public final float g(final float n, final float n2) {
        if (n2 == 0.0f) {
            return 0.0f;
        }
        final int u = this.u;
        if (u != 0 && u != 1) {
            if (u != 2) {
                return 0.0f;
            }
            if (n < 0.0f) {
                return n / -n2;
            }
        }
        else if (n < n2) {
            if (n >= 0.0f) {
                return 1.0f - n / n2;
            }
            if (this.C && u == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }
    
    public final float h(float n, final float n2, float g, final float n3) {
        n = e(n * n2, 0.0f, g);
        g = this.g(n3, n);
        n = this.g(n2 - n3, n) - g;
        if (n < 0.0f) {
            n = -((TimeInterpolator)this.p).getInterpolation(-n);
        }
        else {
            if (n <= 0.0f) {
                return 0.0f;
            }
            n = ((TimeInterpolator)this.p).getInterpolation(n);
        }
        return e(n, -1.0f, 1.0f);
    }
    
    public final void i() {
        if (this.A) {
            this.C = false;
            return;
        }
        this.o.i();
    }
    
    public abstract void j(final int p0, final int p1);
    
    public a k(final int v) {
        this.v = v;
        return this;
    }
    
    public a l(final int u) {
        this.u = u;
        return this;
    }
    
    public a m(final boolean d) {
        if (this.D && !d) {
            this.i();
        }
        this.D = d;
        return this;
    }
    
    public a n(final float n, final float n2) {
        final float[] t = this.t;
        t[0] = n;
        t[1] = n2;
        return this;
    }
    
    public a o(final float n, final float n2) {
        final float[] y = this.y;
        y[0] = n / 1000.0f;
        y[1] = n2 / 1000.0f;
        return this;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean d = this.D;
        final boolean b = false;
        if (!d) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        Label_0140: {
            Label_0065: {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            break Label_0065;
                        }
                        if (actionMasked != 3) {
                            break Label_0140;
                        }
                    }
                    this.i();
                    break Label_0140;
                }
                this.B = true;
                this.z = false;
            }
            this.o.l(this.d(0, motionEvent.getX(), (float)view.getWidth(), (float)this.q.getWidth()), this.d(1, motionEvent.getY(), (float)view.getHeight(), (float)this.q.getHeight()));
            if (!this.C && this.u()) {
                this.v();
            }
        }
        boolean b2 = b;
        if (this.E) {
            b2 = b;
            if (this.C) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public a p(final float n, final float n2) {
        final float[] x = this.x;
        x[0] = n / 1000.0f;
        x[1] = n2 / 1000.0f;
        return this;
    }
    
    public a q(final int n) {
        this.o.j(n);
        return this;
    }
    
    public a r(final int n) {
        this.o.k(n);
        return this;
    }
    
    public a s(final float n, final float n2) {
        final float[] s = this.s;
        s[0] = n;
        s[1] = n2;
        return this;
    }
    
    public a t(final float n, final float n2) {
        final float[] w = this.w;
        w[0] = n / 1000.0f;
        w[1] = n2 / 1000.0f;
        return this;
    }
    
    public boolean u() {
        final a o = this.o;
        final int f = o.f();
        final int d = o.d();
        return (f != 0 && this.b(f)) || (d != 0 && this.a(d));
    }
    
    public final void v() {
        if (this.r == null) {
            this.r = new b();
        }
        this.C = true;
        this.A = true;
        Label_0070: {
            if (!this.z) {
                final int v = this.v;
                if (v > 0) {
                    I.s.z(this.q, this.r, v);
                    break Label_0070;
                }
            }
            this.r.run();
        }
        this.z = true;
    }
    
    public static class a
    {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public int g;
        public int h;
        public long i;
        public float j;
        public int k;
        
        public a() {
            this.e = Long.MIN_VALUE;
            this.i = -1L;
            this.f = 0L;
            this.g = 0;
            this.h = 0;
        }
        
        public void a() {
            if (this.f != 0L) {
                final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                final float g = this.g(this.e(currentAnimationTimeMillis));
                final long f = this.f;
                this.f = currentAnimationTimeMillis;
                final float n = (currentAnimationTimeMillis - f) * g;
                this.g = (int)(this.c * n);
                this.h = (int)(n * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        
        public int b() {
            return this.g;
        }
        
        public int c() {
            return this.h;
        }
        
        public int d() {
            final float c = this.c;
            return (int)(c / Math.abs(c));
        }
        
        public final float e(final long n) {
            final long e = this.e;
            if (n < e) {
                return 0.0f;
            }
            final long i = this.i;
            if (i >= 0L && n >= i) {
                final float j = this.j;
                return 1.0f - j + j * L.a.e((n - i) / (float)this.k, 0.0f, 1.0f);
            }
            return L.a.e((n - e) / (float)this.a, 0.0f, 1.0f) * 0.5f;
        }
        
        public int f() {
            final float d = this.d;
            return (int)(d / Math.abs(d));
        }
        
        public final float g(final float n) {
            return -4.0f * n * n + n * 4.0f;
        }
        
        public boolean h() {
            return this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k;
        }
        
        public void i() {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = L.a.f((int)(currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = this.e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }
        
        public void j(final int b) {
            this.b = b;
        }
        
        public void k(final int a) {
            this.a = a;
        }
        
        public void l(final float c, final float d) {
            this.c = c;
            this.d = d;
        }
        
        public void m() {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }
    
    public class b implements Runnable
    {
        @Override
        public void run() {
            final a o = a.this;
            if (!o.C) {
                return;
            }
            if (o.A) {
                o.A = false;
                o.o.m();
            }
            final a o2 = a.this.o;
            if (!o2.h() && a.this.u()) {
                final a o3 = a.this;
                if (o3.B) {
                    o3.B = false;
                    o3.c();
                }
                o2.a();
                a.this.j(o2.b(), o2.c());
                I.s.y(a.this.q, this);
                return;
            }
            a.this.C = false;
        }
    }
}
