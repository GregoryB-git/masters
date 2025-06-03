/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package L;

import I.s;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
implements View.OnTouchListener {
    public static final int F = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final a o = new a();
    public final Interpolator p = new AccelerateInterpolator();
    public final View q;
    public Runnable r;
    public float[] s = new float[]{0.0f, 0.0f};
    public float[] t = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    public int u;
    public int v;
    public float[] w = new float[]{0.0f, 0.0f};
    public float[] x = new float[]{0.0f, 0.0f};
    public float[] y = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean z;

    public a(View view) {
        this.q = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        int n8 = (int)(1575.0f * f8 + 0.5f);
        int n9 = (int)(f8 * 315.0f + 0.5f);
        f8 = n8;
        this.o(f8, f8);
        f8 = n9;
        this.p(f8, f8);
        this.l(1);
        this.n(Float.MAX_VALUE, Float.MAX_VALUE);
        this.s(0.2f, 0.2f);
        this.t(1.0f, 1.0f);
        this.k(F);
        this.r(500);
        this.q(500);
    }

    public static float e(float f8, float f9, float f10) {
        if (f8 > f10) {
            return f10;
        }
        if (f8 < f9) {
            return f9;
        }
        return f8;
    }

    public static int f(int n8, int n9, int n10) {
        if (n8 > n10) {
            return n10;
        }
        if (n8 < n9) {
            return n9;
        }
        return n8;
    }

    public abstract boolean a(int var1);

    public abstract boolean b(int var1);

    public void c() {
        long l8 = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
        this.q.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    public final float d(int n8, float f8, float f9, float f10) {
        float f11 = f8 = this.h(this.s[n8], f9, this.t[n8], f8) FCMPL 0.0f;
        if (f11 == false) {
            return 0.0f;
        }
        float f12 = this.w[n8];
        f9 = this.x[n8];
        float f13 = this.y[n8];
        f10 = f12 * f10;
        if (f11 > 0) {
            return a.e(f8 * f10, f9, f13);
        }
        return - a.e((- f8) * f10, f9, f13);
    }

    public final float g(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int n8 = this.u;
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                return 0.0f;
            }
            if (f8 < 0.0f) {
                return f8 / (- f9);
            }
        } else if (f8 < f9) {
            if (f8 >= 0.0f) {
                return 1.0f - f8 / f9;
            }
            if (this.C && n8 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final float h(float f8, float f9, float f10, float f11) {
        block4 : {
            block3 : {
                block2 : {
                    f8 = a.e(f8 * f9, 0.0f, f10);
                    f10 = this.g(f11, f8);
                    if ((f8 = this.g(f9 - f11, f8) - f10) >= 0.0f) break block2;
                    f8 = - this.p.getInterpolation(- f8);
                    break block3;
                }
                if (f8 <= 0.0f) break block4;
                f8 = this.p.getInterpolation(f8);
            }
            return a.e(f8, -1.0f, 1.0f);
        }
        return 0.0f;
    }

    public final void i() {
        if (this.A) {
            this.C = false;
            return;
        }
        this.o.i();
    }

    public abstract void j(int var1, int var2);

    public a k(int n8) {
        this.v = n8;
        return this;
    }

    public a l(int n8) {
        this.u = n8;
        return this;
    }

    public a m(boolean bl) {
        if (this.D && !bl) {
            this.i();
        }
        this.D = bl;
        return this;
    }

    public a n(float f8, float f9) {
        float[] arrf = this.t;
        arrf[0] = f8;
        arrf[1] = f9;
        return this;
    }

    public a o(float f8, float f9) {
        float[] arrf = this.y;
        arrf[0] = f8 / 1000.0f;
        arrf[1] = f9 / 1000.0f;
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl;
        boolean bl2;
        block9 : {
            block8 : {
                block6 : {
                    block7 : {
                        bl2 = this.D;
                        bl = false;
                        if (!bl2) {
                            return false;
                        }
                        int n8 = motionEvent.getActionMasked();
                        if (n8 == 0) break block6;
                        if (n8 == 1) break block7;
                        if (n8 == 2) break block8;
                        if (n8 != 3) break block9;
                    }
                    this.i();
                    break block9;
                }
                this.B = true;
                this.z = false;
            }
            float f8 = this.d(0, motionEvent.getX(), view.getWidth(), this.q.getWidth());
            float f9 = this.d(1, motionEvent.getY(), view.getHeight(), this.q.getHeight());
            this.o.l(f8, f9);
            if (!this.C && this.u()) {
                this.v();
            }
        }
        bl2 = bl;
        if (this.E) {
            bl2 = bl;
            if (this.C) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public a p(float f8, float f9) {
        float[] arrf = this.x;
        arrf[0] = f8 / 1000.0f;
        arrf[1] = f9 / 1000.0f;
        return this;
    }

    public a q(int n8) {
        this.o.j(n8);
        return this;
    }

    public a r(int n8) {
        this.o.k(n8);
        return this;
    }

    public a s(float f8, float f9) {
        float[] arrf = this.s;
        arrf[0] = f8;
        arrf[1] = f9;
        return this;
    }

    public a t(float f8, float f9) {
        float[] arrf = this.w;
        arrf[0] = f8 / 1000.0f;
        arrf[1] = f9 / 1000.0f;
        return this;
    }

    public boolean u() {
        a a8 = this.o;
        int n8 = a8.f();
        int n9 = a8.d();
        if (n8 != 0 && this.b(n8) || n9 != 0 && this.a(n9)) {
            return true;
        }
        return false;
    }

    public final void v() {
        int n8;
        if (this.r == null) {
            this.r = new b();
        }
        this.C = true;
        this.A = true;
        if (!this.z && (n8 = this.v) > 0) {
            s.z(this.q, this.r, n8);
        } else {
            this.r.run();
        }
        this.z = true;
    }

    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e = Long.MIN_VALUE;
        public long f = 0L;
        public int g = 0;
        public int h = 0;
        public long i = -1L;
        public float j;
        public int k;

        public void a() {
            if (this.f != 0L) {
                long l8 = AnimationUtils.currentAnimationTimeMillis();
                float f8 = this.g(this.e(l8));
                long l9 = this.f;
                this.f = l8;
                f8 = (float)(l8 - l9) * f8;
                this.g = (int)(this.c * f8);
                this.h = (int)(f8 * this.d);
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
            float f8 = this.c;
            return (int)(f8 / Math.abs((float)f8));
        }

        public final float e(long l8) {
            long l9 = this.e;
            if (l8 < l9) {
                return 0.0f;
            }
            long l10 = this.i;
            if (l10 >= 0L && l8 >= l10) {
                float f8 = this.j;
                return 1.0f - f8 + f8 * a.e((float)(l8 - l10) / (float)this.k, 0.0f, 1.0f);
            }
            return a.e((float)(l8 - l9) / (float)this.a, 0.0f, 1.0f) * 0.5f;
        }

        public int f() {
            float f8 = this.d;
            return (int)(f8 / Math.abs((float)f8));
        }

        public final float g(float f8) {
            return -4.0f * f8 * f8 + f8 * 4.0f;
        }

        public boolean h() {
            if (this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + (long)this.k) {
                return true;
            }
            return false;
        }

        public void i() {
            long l8 = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int)(l8 - this.e), 0, this.b);
            this.j = this.e(l8);
            this.i = l8;
        }

        public void j(int n8) {
            this.b = n8;
        }

        public void k(int n8) {
            this.a = n8;
        }

        public void l(float f8, float f9) {
            this.c = f8;
            this.d = f9;
        }

        public void m() {
            long l8;
            this.e = l8 = AnimationUtils.currentAnimationTimeMillis();
            this.i = -1L;
            this.f = l8;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    public class b
    implements Runnable {
        public void run() {
            Object object = a.this;
            if (!object.C) {
                return;
            }
            if (object.A) {
                object.A = false;
                object.o.m();
            }
            if (!(object = a.this.o).h() && a.this.u()) {
                a a8 = a.this;
                if (a8.B) {
                    a8.B = false;
                    a8.c();
                }
                object.a();
                int n8 = object.b();
                int n9 = object.c();
                a.this.j(n8, n9);
                s.y(a.this.q, this);
                return;
            }
            a.this.C = false;
        }
    }

}

