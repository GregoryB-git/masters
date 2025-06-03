package L;

import I.AbstractC0421s;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: F, reason: collision with root package name */
    public static final int f3254F = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public boolean f3255A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3256B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3257C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3258D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3259E;

    /* renamed from: q, reason: collision with root package name */
    public final View f3262q;

    /* renamed from: r, reason: collision with root package name */
    public Runnable f3263r;

    /* renamed from: u, reason: collision with root package name */
    public int f3266u;

    /* renamed from: v, reason: collision with root package name */
    public int f3267v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3271z;

    /* renamed from: o, reason: collision with root package name */
    public final C0062a f3260o = new C0062a();

    /* renamed from: p, reason: collision with root package name */
    public final Interpolator f3261p = new AccelerateInterpolator();

    /* renamed from: s, reason: collision with root package name */
    public float[] f3264s = {0.0f, 0.0f};

    /* renamed from: t, reason: collision with root package name */
    public float[] f3265t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: w, reason: collision with root package name */
    public float[] f3268w = {0.0f, 0.0f};

    /* renamed from: x, reason: collision with root package name */
    public float[] f3269x = {0.0f, 0.0f};

    /* renamed from: y, reason: collision with root package name */
    public float[] f3270y = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: L.a$a, reason: collision with other inner class name */
    public static class C0062a {

        /* renamed from: a, reason: collision with root package name */
        public int f3272a;

        /* renamed from: b, reason: collision with root package name */
        public int f3273b;

        /* renamed from: c, reason: collision with root package name */
        public float f3274c;

        /* renamed from: d, reason: collision with root package name */
        public float f3275d;

        /* renamed from: j, reason: collision with root package name */
        public float f3281j;

        /* renamed from: k, reason: collision with root package name */
        public int f3282k;

        /* renamed from: e, reason: collision with root package name */
        public long f3276e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public long f3280i = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f3277f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f3278g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f3279h = 0;

        public void a() {
            if (this.f3277f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g7 = g(e(currentAnimationTimeMillis));
            long j7 = currentAnimationTimeMillis - this.f3277f;
            this.f3277f = currentAnimationTimeMillis;
            float f7 = j7 * g7;
            this.f3278g = (int) (this.f3274c * f7);
            this.f3279h = (int) (f7 * this.f3275d);
        }

        public int b() {
            return this.f3278g;
        }

        public int c() {
            return this.f3279h;
        }

        public int d() {
            float f7 = this.f3274c;
            return (int) (f7 / Math.abs(f7));
        }

        public final float e(long j7) {
            if (j7 < this.f3276e) {
                return 0.0f;
            }
            long j8 = this.f3280i;
            if (j8 < 0 || j7 < j8) {
                return a.e((j7 - r0) / this.f3272a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f3281j;
            return (1.0f - f7) + (f7 * a.e((j7 - j8) / this.f3282k, 0.0f, 1.0f));
        }

        public int f() {
            float f7 = this.f3275d;
            return (int) (f7 / Math.abs(f7));
        }

        public final float g(float f7) {
            return ((-4.0f) * f7 * f7) + (f7 * 4.0f);
        }

        public boolean h() {
            return this.f3280i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3280i + ((long) this.f3282k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3282k = a.f((int) (currentAnimationTimeMillis - this.f3276e), 0, this.f3273b);
            this.f3281j = e(currentAnimationTimeMillis);
            this.f3280i = currentAnimationTimeMillis;
        }

        public void j(int i7) {
            this.f3273b = i7;
        }

        public void k(int i7) {
            this.f3272a = i7;
        }

        public void l(float f7, float f8) {
            this.f3274c = f7;
            this.f3275d = f8;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3276e = currentAnimationTimeMillis;
            this.f3280i = -1L;
            this.f3277f = currentAnimationTimeMillis;
            this.f3281j = 0.5f;
            this.f3278g = 0;
            this.f3279h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f3257C) {
                if (aVar.f3255A) {
                    aVar.f3255A = false;
                    aVar.f3260o.m();
                }
                C0062a c0062a = a.this.f3260o;
                if (c0062a.h() || !a.this.u()) {
                    a.this.f3257C = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f3256B) {
                    aVar2.f3256B = false;
                    aVar2.c();
                }
                c0062a.a();
                a.this.j(c0062a.b(), c0062a.c());
                AbstractC0421s.y(a.this.f3262q, this);
            }
        }
    }

    public a(View view) {
        this.f3262q = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = (int) ((1575.0f * f7) + 0.5f);
        o(f8, f8);
        float f9 = (int) ((f7 * 315.0f) + 0.5f);
        p(f9, f9);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f3254F);
        r(500);
        q(500);
    }

    public static float e(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    public static int f(int i7, int i8, int i9) {
        return i7 > i9 ? i9 : i7 < i8 ? i8 : i7;
    }

    public abstract boolean a(int i7);

    public abstract boolean b(int i7);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3262q.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i7, float f7, float f8, float f9) {
        float h7 = h(this.f3264s[i7], f8, this.f3265t[i7], f7);
        if (h7 == 0.0f) {
            return 0.0f;
        }
        float f10 = this.f3268w[i7];
        float f11 = this.f3269x[i7];
        float f12 = this.f3270y[i7];
        float f13 = f10 * f9;
        return h7 > 0.0f ? e(h7 * f13, f11, f12) : -e((-h7) * f13, f11, f12);
    }

    public final float g(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f3266u;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f3257C && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    public final float h(float f7, float f8, float f9, float f10) {
        float interpolation;
        float e7 = e(f7 * f8, 0.0f, f9);
        float g7 = g(f8 - f10, e7) - g(f10, e7);
        if (g7 < 0.0f) {
            interpolation = -this.f3261p.getInterpolation(-g7);
        } else {
            if (g7 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f3261p.getInterpolation(g7);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f3255A) {
            this.f3257C = false;
        } else {
            this.f3260o.i();
        }
    }

    public abstract void j(int i7, int i8);

    public a k(int i7) {
        this.f3267v = i7;
        return this;
    }

    public a l(int i7) {
        this.f3266u = i7;
        return this;
    }

    public a m(boolean z7) {
        if (this.f3258D && !z7) {
            i();
        }
        this.f3258D = z7;
        return this;
    }

    public a n(float f7, float f8) {
        float[] fArr = this.f3265t;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    public a o(float f7, float f8) {
        float[] fArr = this.f3270y;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3258D
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f3256B = r2
            r5.f3271z = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3262q
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3262q
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            L.a$a r7 = r5.f3260o
            r7.l(r0, r6)
            boolean r6 = r5.f3257C
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f3259E
            if (r6 == 0) goto L61
            boolean r6 = r5.f3257C
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f7, float f8) {
        float[] fArr = this.f3269x;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    public a q(int i7) {
        this.f3260o.j(i7);
        return this;
    }

    public a r(int i7) {
        this.f3260o.k(i7);
        return this;
    }

    public a s(float f7, float f8) {
        float[] fArr = this.f3264s;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    public a t(float f7, float f8) {
        float[] fArr = this.f3268w;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0062a c0062a = this.f3260o;
        int f7 = c0062a.f();
        int d7 = c0062a.d();
        return (f7 != 0 && b(f7)) || (d7 != 0 && a(d7));
    }

    public final void v() {
        int i7;
        if (this.f3263r == null) {
            this.f3263r = new b();
        }
        this.f3257C = true;
        this.f3255A = true;
        if (this.f3271z || (i7 = this.f3267v) <= 0) {
            this.f3263r.run();
        } else {
            AbstractC0421s.z(this.f3262q, this.f3263r, i7);
        }
        this.f3271z = true;
    }
}
