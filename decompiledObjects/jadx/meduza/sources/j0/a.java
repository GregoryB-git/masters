package j0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import e0.d0;
import e0.o0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: y, reason: collision with root package name */
    public static final int f8250y = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final C0122a f8251a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f8252b;

    /* renamed from: c, reason: collision with root package name */
    public final View f8253c;

    /* renamed from: d, reason: collision with root package name */
    public b f8254d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f8255e;
    public float[] f;

    /* renamed from: o, reason: collision with root package name */
    public int f8256o;

    /* renamed from: p, reason: collision with root package name */
    public int f8257p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f8258q;

    /* renamed from: r, reason: collision with root package name */
    public float[] f8259r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f8260s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8261u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8262v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8263w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8264x;

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    public static class C0122a {

        /* renamed from: a, reason: collision with root package name */
        public int f8265a;

        /* renamed from: b, reason: collision with root package name */
        public int f8266b;

        /* renamed from: c, reason: collision with root package name */
        public float f8267c;

        /* renamed from: d, reason: collision with root package name */
        public float f8268d;

        /* renamed from: h, reason: collision with root package name */
        public float f8271h;

        /* renamed from: i, reason: collision with root package name */
        public int f8272i;

        /* renamed from: e, reason: collision with root package name */
        public long f8269e = Long.MIN_VALUE;

        /* renamed from: g, reason: collision with root package name */
        public long f8270g = -1;
        public long f = 0;

        public final float a(long j10) {
            if (j10 < this.f8269e) {
                return 0.0f;
            }
            long j11 = this.f8270g;
            if (j11 < 0 || j10 < j11) {
                return a.b((j10 - r0) / this.f8265a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f8271h;
            return (a.b((j10 - j11) / this.f8272i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f8263w) {
                if (aVar.f8261u) {
                    aVar.f8261u = false;
                    C0122a c0122a = aVar.f8251a;
                    c0122a.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0122a.f8269e = currentAnimationTimeMillis;
                    c0122a.f8270g = -1L;
                    c0122a.f = currentAnimationTimeMillis;
                    c0122a.f8271h = 0.5f;
                }
                C0122a c0122a2 = a.this.f8251a;
                if ((c0122a2.f8270g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0122a2.f8270g + ((long) c0122a2.f8272i)) || !a.this.e()) {
                    a.this.f8263w = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f8262v) {
                    aVar2.f8262v = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar2.f8253c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0122a2.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float a10 = c0122a2.a(currentAnimationTimeMillis2);
                long j10 = currentAnimationTimeMillis2 - c0122a2.f;
                c0122a2.f = currentAnimationTimeMillis2;
                ((f) a.this).f8274z.scrollListBy((int) (j10 * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0122a2.f8268d));
                View view = a.this.f8253c;
                WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                view.postOnAnimation(this);
            }
        }
    }

    public a(View view) {
        C0122a c0122a = new C0122a();
        this.f8251a = c0122a;
        this.f8252b = new AccelerateInterpolator();
        this.f8255e = new float[]{0.0f, 0.0f};
        this.f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8258q = new float[]{0.0f, 0.0f};
        this.f8259r = new float[]{0.0f, 0.0f};
        this.f8260s = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8253c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f8260s;
        float f10 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f10;
        fArr[1] = f10;
        float[] fArr2 = this.f8259r;
        float f11 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f11;
        fArr2[1] = f11;
        this.f8256o = 1;
        float[] fArr3 = this.f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f8255e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f8258q;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f8257p = f8250y;
        c0122a.f8265a = 500;
        c0122a.f8266b = 500;
    }

    public static float b(float f, float f10, float f11) {
        return f > f11 ? f11 : f < f10 ? f10 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f8255e
            r0 = r0[r7]
            float[] r1 = r3.f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L25
            android.view.animation.AccelerateInterpolator r5 = r3.f8252b
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L2f
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L38
            android.view.animation.AccelerateInterpolator r5 = r3.f8252b
            float r4 = r5.getInterpolation(r4)
        L2f:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L39
        L38:
            r4 = r2
        L39:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.f8258q
            r0 = r0[r7]
            float[] r1 = r3.f8259r
            r1 = r1[r7]
            float[] r2 = r3.f8260s
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L53
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L53:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.a(float, float, float, int):float");
    }

    public final float c(float f, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f8256o;
        if (i10 == 0 || i10 == 1) {
            if (f < f10) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f10);
                }
                if (this.f8263w && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f < 0.0f) {
            return f / (-f10);
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f8261u) {
            this.f8263w = false;
            return;
        }
        C0122a c0122a = this.f8251a;
        c0122a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0122a.f8269e);
        int i12 = c0122a.f8266b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0122a.f8272i = i10;
        c0122a.f8271h = c0122a.a(currentAnimationTimeMillis);
        c0122a.f8270g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r9 = this;
            j0.a$a r0 = r9.f8251a
            float r1 = r0.f8268d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f8267c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            j0.f r4 = (j0.f) r4
            android.widget.ListView r4 = r4.f8274z
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = r3
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r2
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f8264x
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
            goto L7f
        L16:
            r5.d()
            goto L7f
        L1a:
            r5.f8262v = r2
            r5.t = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f8253c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r0, r3, r4, r1)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f8253c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r7, r6, r3, r2)
            j0.a$a r7 = r5.f8251a
            r7.f8267c = r0
            r7.f8268d = r6
            boolean r6 = r5.f8263w
            if (r6 != 0) goto L7f
            boolean r6 = r5.e()
            if (r6 == 0) goto L7f
            j0.a$b r6 = r5.f8254d
            if (r6 != 0) goto L61
            j0.a$b r6 = new j0.a$b
            r6.<init>()
            r5.f8254d = r6
        L61:
            r5.f8263w = r2
            r5.f8261u = r2
            boolean r6 = r5.t
            if (r6 != 0) goto L78
            int r6 = r5.f8257p
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f8253c
            j0.a$b r0 = r5.f8254d
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, e0.o0> r6 = e0.d0.f3766a
            r7.postOnAnimationDelayed(r0, r3)
            goto L7d
        L78:
            j0.a$b r6 = r5.f8254d
            r6.run()
        L7d:
            r5.t = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
