/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Throwable
 */
package l;

import A.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import e.b;
import e.d;
import l.B;
import l.M;
import l.T;
import l.V;

public final class e {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static e c;
    public M a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e b() {
        synchronized (e.class) {
            try {
                if (c != null) return c;
                e.f();
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static PorterDuffColorFilter d(int n8, PorterDuff.Mode mode) {
        synchronized (e.class) {
            mode = M.l(n8, mode);
            return mode;
        }
    }

    public static void f() {
        synchronized (e.class) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        e e8;
                        if (c != null) break block3;
                        c = e8 = new e();
                        e8.a = M.h();
                        e.c.a.t(new M.e(){
                            public final int[] a = new int[]{d.S, d.Q, d.a};
                            public final int[] b = new int[]{d.o, d.B, d.t, d.p, d.q, d.s, d.r};
                            public final int[] c = new int[]{d.P, d.R, d.k, d.I, d.J, d.L, d.N, d.K, d.M, d.O};
                            public final int[] d = new int[]{d.w, d.i, d.v};
                            public final int[] e = new int[]{d.H, d.T};
                            public final int[] f = new int[]{d.c, d.g, d.d, d.h};

                            /*
                             * Unable to fully structure code
                             * Enabled aggressive block sorting
                             * Lifted jumps to return sites
                             */
                            @Override
                            public boolean a(Context var1_1, int var2_2, Drawable var3_3) {
                                block8 : {
                                    block7 : {
                                        block6 : {
                                            block5 : {
                                                var6_5 = var7_4 = e.a();
                                                if (!this.f(this.a, var2_2)) break block5;
                                                var4_6 = e.a.l;
                                                break block6;
                                            }
                                            if (!this.f(this.c, var2_2)) break block7;
                                            var4_6 = e.a.j;
                                        }
                                        var5_7 = 1;
                                        ** GOTO lbl27
                                    }
                                    if (!this.f(this.d, var2_2)) break block8;
                                    var6_5 = PorterDuff.Mode.MULTIPLY;
                                    ** GOTO lbl-1000
                                }
                                if (var2_2 == d.u) {
                                    var2_2 = Math.round((float)40.8f);
                                    var5_7 = 1;
                                    var4_6 = 16842800;
                                } else if (var2_2 == d.l) lbl-1000: // 2 sources:
                                {
                                    var2_2 = -1;
                                    var4_6 = 16842801;
                                    var5_7 = 1;
                                } else {
                                    var5_7 = var4_6 = 0;
lbl27: // 2 sources:
                                    var6_5 = var7_4;
                                    var2_2 = -1;
                                }
                                if (var5_7 == 0) return false;
                                var7_4 = var3_3;
                                if (B.a(var3_3)) {
                                    var7_4 = var3_3.mutate();
                                }
                                var7_4.setColorFilter((ColorFilter)e.d(T.c(var1_1, var4_6), var6_5));
                                if (var2_2 == -1) return true;
                                var7_4.setAlpha(var2_2);
                                return true;
                            }

                            @Override
                            public PorterDuff.Mode b(int n8) {
                                if (n8 == d.F) {
                                    return PorterDuff.Mode.MULTIPLY;
                                }
                                return null;
                            }

                            @Override
                            public ColorStateList c(Context context, int n8) {
                                if (n8 == d.m) {
                                    return g.a.a(context, b.c);
                                }
                                if (n8 == d.G) {
                                    return g.a.a(context, b.f);
                                }
                                if (n8 == d.F) {
                                    return this.k(context);
                                }
                                if (n8 == d.f) {
                                    return this.j(context);
                                }
                                if (n8 == d.b) {
                                    return this.g(context);
                                }
                                if (n8 == d.e) {
                                    return this.i(context);
                                }
                                if (n8 != d.D && n8 != d.E) {
                                    if (this.f(this.b, n8)) {
                                        return T.e(context, e.a.l);
                                    }
                                    if (this.f(this.e, n8)) {
                                        return g.a.a(context, b.b);
                                    }
                                    if (this.f(this.f, n8)) {
                                        return g.a.a(context, b.a);
                                    }
                                    if (n8 == d.A) {
                                        return g.a.a(context, b.d);
                                    }
                                    return null;
                                }
                                return g.a.a(context, b.e);
                            }

                            @Override
                            public Drawable d(M m8, Context context, int n8) {
                                if (n8 == d.j) {
                                    return new LayerDrawable(new Drawable[]{m8.j(context, d.i), m8.j(context, d.k)});
                                }
                                return null;
                            }

                            /*
                             * Enabled aggressive block sorting
                             */
                            @Override
                            public boolean e(Context context, int n8, Drawable drawable2) {
                                LayerDrawable layerDrawable;
                                if (n8 == d.C) {
                                    layerDrawable = (LayerDrawable)drawable2;
                                    this.l(layerDrawable.findDrawableByLayerId(16908288), T.c(context, e.a.l), b);
                                    drawable2 = layerDrawable.findDrawableByLayerId(16908303);
                                    n8 = e.a.l;
                                } else {
                                    if (n8 != d.y && n8 != d.x && n8 != d.z) {
                                        return false;
                                    }
                                    layerDrawable = (LayerDrawable)drawable2;
                                    this.l(layerDrawable.findDrawableByLayerId(16908288), T.b(context, e.a.l), b);
                                    drawable2 = layerDrawable.findDrawableByLayerId(16908303);
                                    n8 = e.a.j;
                                }
                                this.l(drawable2, T.c(context, n8), b);
                                this.l(layerDrawable.findDrawableByLayerId(16908301), T.c(context, e.a.j), b);
                                return true;
                            }

                            public final boolean f(int[] arrn, int n8) {
                                int n9 = arrn.length;
                                for (int i8 = 0; i8 < n9; ++i8) {
                                    if (arrn[i8] != n8) continue;
                                    return true;
                                }
                                return false;
                            }

                            public final ColorStateList g(Context context) {
                                return this.h(context, 0);
                            }

                            public final ColorStateList h(Context arrn, int n8) {
                                int n9 = T.c((Context)arrn, e.a.k);
                                int n10 = T.b((Context)arrn, e.a.i);
                                arrn = T.b;
                                int[] arrn2 = T.e;
                                int n11 = a.c(n9, n8);
                                int[] arrn3 = T.c;
                                n9 = a.c(n9, n8);
                                return new ColorStateList((int[][])new int[][]{arrn, arrn2, arrn3, T.i}, new int[]{n10, n11, n9, n8});
                            }

                            public final ColorStateList i(Context context) {
                                return this.h(context, T.c(context, e.a.h));
                            }

                            public final ColorStateList j(Context context) {
                                return this.h(context, T.c(context, e.a.i));
                            }

                            public final ColorStateList k(Context context) {
                                int[][] arrarrn = new int[3][];
                                int[] arrn = new int[3];
                                ColorStateList colorStateList = T.e(context, e.a.m);
                                if (colorStateList != null && colorStateList.isStateful()) {
                                    int[] arrn2 = T.b;
                                    arrarrn[0] = arrn2;
                                    arrn[0] = colorStateList.getColorForState(arrn2, 0);
                                    arrarrn[1] = T.f;
                                    arrn[1] = T.c(context, e.a.j);
                                    arrarrn[2] = T.i;
                                    arrn[2] = colorStateList.getDefaultColor();
                                } else {
                                    arrarrn[0] = T.b;
                                    arrn[0] = T.b(context, e.a.m);
                                    arrarrn[1] = T.f;
                                    arrn[1] = T.c(context, e.a.j);
                                    arrarrn[2] = T.i;
                                    arrn[2] = T.c(context, e.a.m);
                                }
                                return new ColorStateList((int[][])arrarrn, arrn);
                            }

                            public final void l(Drawable drawable2, int n8, PorterDuff.Mode mode) {
                                Drawable drawable3 = drawable2;
                                if (B.a(drawable2)) {
                                    drawable3 = drawable2.mutate();
                                }
                                drawable2 = mode;
                                if (mode == null) {
                                    drawable2 = b;
                                }
                                drawable3.setColorFilter((ColorFilter)e.d(n8, (PorterDuff.Mode)drawable2));
                            }
                        });
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static void g(Drawable drawable2, V v8, int[] arrn) {
        M.v(drawable2, v8, arrn);
    }

    public Drawable c(Context context, int n8) {
        synchronized (this) {
            context = this.a.j(context, n8);
            return context;
        }
    }

    public ColorStateList e(Context context, int n8) {
        synchronized (this) {
            context = this.a.m(context, n8);
            return context;
        }
    }

}

