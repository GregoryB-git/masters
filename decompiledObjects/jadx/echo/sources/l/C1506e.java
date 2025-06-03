package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import e.AbstractC1230a;
import e.AbstractC1231b;
import e.AbstractC1233d;
import g.AbstractC1294a;
import l.M;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506e {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f16448b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1506e f16449c;

    /* renamed from: a, reason: collision with root package name */
    public M f16450a;

    /* renamed from: l.e$a */
    public class a implements M.e {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f16451a = {AbstractC1233d.f13383S, AbstractC1233d.f13381Q, AbstractC1233d.f13385a};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f16452b = {AbstractC1233d.f13399o, AbstractC1233d.f13366B, AbstractC1233d.f13404t, AbstractC1233d.f13400p, AbstractC1233d.f13401q, AbstractC1233d.f13403s, AbstractC1233d.f13402r};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f16453c = {AbstractC1233d.f13380P, AbstractC1233d.f13382R, AbstractC1233d.f13395k, AbstractC1233d.f13373I, AbstractC1233d.f13374J, AbstractC1233d.f13376L, AbstractC1233d.f13378N, AbstractC1233d.f13375K, AbstractC1233d.f13377M, AbstractC1233d.f13379O};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f16454d = {AbstractC1233d.f13407w, AbstractC1233d.f13393i, AbstractC1233d.f13406v};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f16455e = {AbstractC1233d.f13372H, AbstractC1233d.f13384T};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f16456f = {AbstractC1233d.f13387c, AbstractC1233d.f13391g, AbstractC1233d.f13388d, AbstractC1233d.f13392h};

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // l.M.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = l.C1506e.a()
                int[] r1 = r7.f16451a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = e.AbstractC1230a.f13341l
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f16453c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = e.AbstractC1230a.f13339j
                goto L11
            L20:
                int[] r1 = r7.f16454d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = e.AbstractC1233d.f13405u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = e.AbstractC1233d.f13396l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = l.AbstractC1494B.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = l.T.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = l.C1506e.d(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: l.C1506e.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // l.M.e
        public PorterDuff.Mode b(int i7) {
            if (i7 == AbstractC1233d.f13370F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // l.M.e
        public ColorStateList c(Context context, int i7) {
            if (i7 == AbstractC1233d.f13397m) {
                return AbstractC1294a.a(context, AbstractC1231b.f13351c);
            }
            if (i7 == AbstractC1233d.f13371G) {
                return AbstractC1294a.a(context, AbstractC1231b.f13354f);
            }
            if (i7 == AbstractC1233d.f13370F) {
                return k(context);
            }
            if (i7 == AbstractC1233d.f13390f) {
                return j(context);
            }
            if (i7 == AbstractC1233d.f13386b) {
                return g(context);
            }
            if (i7 == AbstractC1233d.f13389e) {
                return i(context);
            }
            if (i7 == AbstractC1233d.f13368D || i7 == AbstractC1233d.f13369E) {
                return AbstractC1294a.a(context, AbstractC1231b.f13353e);
            }
            if (f(this.f16452b, i7)) {
                return T.e(context, AbstractC1230a.f13341l);
            }
            if (f(this.f16455e, i7)) {
                return AbstractC1294a.a(context, AbstractC1231b.f13350b);
            }
            if (f(this.f16456f, i7)) {
                return AbstractC1294a.a(context, AbstractC1231b.f13349a);
            }
            if (i7 == AbstractC1233d.f13365A) {
                return AbstractC1294a.a(context, AbstractC1231b.f13352d);
            }
            return null;
        }

        @Override // l.M.e
        public Drawable d(M m7, Context context, int i7) {
            if (i7 == AbstractC1233d.f13394j) {
                return new LayerDrawable(new Drawable[]{m7.j(context, AbstractC1233d.f13393i), m7.j(context, AbstractC1233d.f13395k)});
            }
            return null;
        }

        @Override // l.M.e
        public boolean e(Context context, int i7, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i8;
            if (i7 == AbstractC1233d.f13367C) {
                layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(R.id.background), T.c(context, AbstractC1230a.f13341l), C1506e.f16448b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i8 = AbstractC1230a.f13341l;
            } else {
                if (i7 != AbstractC1233d.f13409y && i7 != AbstractC1233d.f13408x && i7 != AbstractC1233d.f13410z) {
                    return false;
                }
                layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(R.id.background), T.b(context, AbstractC1230a.f13341l), C1506e.f16448b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i8 = AbstractC1230a.f13339j;
            }
            l(findDrawableByLayerId, T.c(context, i8), C1506e.f16448b);
            l(layerDrawable.findDrawableByLayerId(R.id.progress), T.c(context, AbstractC1230a.f13339j), C1506e.f16448b);
            return true;
        }

        public final boolean f(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i7) {
            int c7 = T.c(context, AbstractC1230a.f13340k);
            return new ColorStateList(new int[][]{T.f16385b, T.f16388e, T.f16386c, T.f16392i}, new int[]{T.b(context, AbstractC1230a.f13338i), A.a.c(c7, i7), A.a.c(c7, i7), i7});
        }

        public final ColorStateList i(Context context) {
            return h(context, T.c(context, AbstractC1230a.f13337h));
        }

        public final ColorStateList j(Context context) {
            return h(context, T.c(context, AbstractC1230a.f13338i));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e7 = T.e(context, AbstractC1230a.f13342m);
            if (e7 == null || !e7.isStateful()) {
                iArr[0] = T.f16385b;
                iArr2[0] = T.b(context, AbstractC1230a.f13342m);
                iArr[1] = T.f16389f;
                iArr2[1] = T.c(context, AbstractC1230a.f13339j);
                iArr[2] = T.f16392i;
                iArr2[2] = T.c(context, AbstractC1230a.f13342m);
            } else {
                int[] iArr3 = T.f16385b;
                iArr[0] = iArr3;
                iArr2[0] = e7.getColorForState(iArr3, 0);
                iArr[1] = T.f16389f;
                iArr2[1] = T.c(context, AbstractC1230a.f13339j);
                iArr[2] = T.f16392i;
                iArr2[2] = e7.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final void l(Drawable drawable, int i7, PorterDuff.Mode mode) {
            if (AbstractC1494B.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1506e.f16448b;
            }
            drawable.setColorFilter(C1506e.d(i7, mode));
        }
    }

    public static synchronized C1506e b() {
        C1506e c1506e;
        synchronized (C1506e.class) {
            try {
                if (f16449c == null) {
                    f();
                }
                c1506e = f16449c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1506e;
    }

    public static synchronized PorterDuffColorFilter d(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter l7;
        synchronized (C1506e.class) {
            l7 = M.l(i7, mode);
        }
        return l7;
    }

    public static synchronized void f() {
        synchronized (C1506e.class) {
            if (f16449c == null) {
                C1506e c1506e = new C1506e();
                f16449c = c1506e;
                c1506e.f16450a = M.h();
                f16449c.f16450a.t(new a());
            }
        }
    }

    public static void g(Drawable drawable, V v7, int[] iArr) {
        M.v(drawable, v7, iArr);
    }

    public synchronized Drawable c(Context context, int i7) {
        return this.f16450a.j(context, i7);
    }

    public synchronized ColorStateList e(Context context, int i7) {
        return this.f16450a.m(context, i7);
    }
}
