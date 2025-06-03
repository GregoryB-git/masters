// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.graphics.drawable.LayerDrawable;
import e.b;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import e.a;
import android.graphics.drawable.Drawable;
import android.content.Context;
import e.d;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public final class e
{
    public static final PorterDuff$Mode b;
    public static e c;
    public M a;
    
    static {
        b = PorterDuff$Mode.SRC_IN;
    }
    
    public static /* synthetic */ PorterDuff$Mode a() {
        return e.b;
    }
    
    public static e b() {
        // monitorenter(e.class)
        while (true) {
            try {
                if (e.c == null) {
                    f();
                }
                // monitorexit(e.class)
                return e.c;
                // monitorexit(e.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static PorterDuffColorFilter d(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (e.class) {
            return M.l(n, porterDuff$Mode);
        }
    }
    
    public static void f() {
        // monitorenter(e.class)
        // monitorexit(e.class)
        Label_0055: {
            try {
                if (e.c == null) {
                    (e.c = new e()).a = M.h();
                    e.c.a.t((M.e)new M.e() {
                        public final int[] a = { e.d.S, e.d.Q, e.d.a };
                        public final int[] b = { e.d.o, e.d.B, e.d.t, e.d.p, e.d.q, e.d.s, e.d.r };
                        public final int[] c = { e.d.P, e.d.R, e.d.k, e.d.I, e.d.J, e.d.L, e.d.N, e.d.K, e.d.M, e.d.O };
                        public final int[] d = { e.d.w, e.d.i, e.d.v };
                        public final int[] e = { e.d.H, e.d.T };
                        public final int[] f = { e.d.c, e.d.g, e.d.d, e.d.h };
                        
                        @Override
                        public boolean a(final Context context, int round, final Drawable drawable) {
                            PorterDuff$Mode porterDuff$Mode = l.e.a();
                            int n = 0;
                            boolean b = false;
                            Label_0130: {
                                Label_0029: {
                                    if (this.f(this.a, round)) {
                                        n = e.a.l;
                                    }
                                    else {
                                        if (!this.f(this.c, round)) {
                                            if (this.f(this.d, round)) {
                                                porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                                            }
                                            else {
                                                if (round == e.d.u) {
                                                    round = Math.round(40.8f);
                                                    b = true;
                                                    n = 16842800;
                                                    break Label_0130;
                                                }
                                                if (round != e.d.l) {
                                                    n = ((b = false) ? 1 : 0);
                                                    break Label_0029;
                                                }
                                            }
                                            round = -1;
                                            n = 16842801;
                                            b = true;
                                            break Label_0130;
                                        }
                                        n = e.a.j;
                                    }
                                    b = true;
                                }
                                porterDuff$Mode = porterDuff$Mode;
                                round = -1;
                            }
                            if (b) {
                                Drawable mutate = drawable;
                                if (B.a(drawable)) {
                                    mutate = drawable.mutate();
                                }
                                mutate.setColorFilter((ColorFilter)l.e.d(T.c(context, n), porterDuff$Mode));
                                if (round != -1) {
                                    mutate.setAlpha(round);
                                }
                                return true;
                            }
                            return false;
                        }
                        
                        @Override
                        public PorterDuff$Mode b(final int n) {
                            if (n == e.d.F) {
                                return PorterDuff$Mode.MULTIPLY;
                            }
                            return null;
                        }
                        
                        @Override
                        public ColorStateList c(final Context context, final int n) {
                            if (n == e.d.m) {
                                return g.a.a(context, e.b.c);
                            }
                            if (n == e.d.G) {
                                return g.a.a(context, e.b.f);
                            }
                            if (n == e.d.F) {
                                return this.k(context);
                            }
                            if (n == e.d.f) {
                                return this.j(context);
                            }
                            if (n == e.d.b) {
                                return this.g(context);
                            }
                            if (n == e.d.e) {
                                return this.i(context);
                            }
                            if (n == e.d.D || n == e.d.E) {
                                return g.a.a(context, e.b.e);
                            }
                            if (this.f(this.b, n)) {
                                return T.e(context, e.a.l);
                            }
                            if (this.f(this.e, n)) {
                                return g.a.a(context, e.b.b);
                            }
                            if (this.f(this.f, n)) {
                                return g.a.a(context, e.b.a);
                            }
                            if (n == e.d.A) {
                                return g.a.a(context, e.b.d);
                            }
                            return null;
                        }
                        
                        @Override
                        public Drawable d(final M m, final Context context, final int n) {
                            if (n == e.d.j) {
                                return (Drawable)new LayerDrawable(new Drawable[] { m.j(context, e.d.i), m.j(context, e.d.k) });
                            }
                            return null;
                        }
                        
                        @Override
                        public boolean e(final Context context, int n, Drawable drawable) {
                            LayerDrawable layerDrawable;
                            if (n == e.d.C) {
                                layerDrawable = (LayerDrawable)drawable;
                                this.l(layerDrawable.findDrawableByLayerId(16908288), T.c(context, e.a.l), l.e.a());
                                drawable = layerDrawable.findDrawableByLayerId(16908303);
                                n = e.a.l;
                            }
                            else {
                                if (n != e.d.y && n != e.d.x && n != e.d.z) {
                                    return false;
                                }
                                layerDrawable = (LayerDrawable)drawable;
                                this.l(layerDrawable.findDrawableByLayerId(16908288), T.b(context, e.a.l), l.e.a());
                                drawable = layerDrawable.findDrawableByLayerId(16908303);
                                n = e.a.j;
                            }
                            this.l(drawable, T.c(context, n), l.e.a());
                            this.l(layerDrawable.findDrawableByLayerId(16908301), T.c(context, e.a.j), l.e.a());
                            return true;
                        }
                        
                        public final boolean f(final int[] array, final int n) {
                            for (int length = array.length, i = 0; i < length; ++i) {
                                if (array[i] == n) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        
                        public final ColorStateList g(final Context context) {
                            return this.h(context, 0);
                        }
                        
                        public final ColorStateList h(final Context context, final int n) {
                            final int c = T.c(context, e.a.k);
                            return new ColorStateList(new int[][] { T.b, T.e, T.c, T.i }, new int[] { T.b(context, e.a.i), A.a.c(c, n), A.a.c(c, n), n });
                        }
                        
                        public final ColorStateList i(final Context context) {
                            return this.h(context, T.c(context, e.a.h));
                        }
                        
                        public final ColorStateList j(final Context context) {
                            return this.h(context, T.c(context, e.a.i));
                        }
                        
                        public final ColorStateList k(final Context context) {
                            final int[][] array = new int[3][];
                            final int[] array2 = new int[3];
                            final ColorStateList e = T.e(context, e.a.m);
                            if (e != null && e.isStateful()) {
                                final int[] b = T.b;
                                array[0] = b;
                                array2[0] = e.getColorForState(b, 0);
                                array[1] = T.f;
                                array2[1] = T.c(context, e.a.j);
                                array[2] = T.i;
                                array2[2] = e.getDefaultColor();
                            }
                            else {
                                array[0] = T.b;
                                array2[0] = T.b(context, e.a.m);
                                array[1] = T.f;
                                array2[1] = T.c(context, e.a.j);
                                array[2] = T.i;
                                array2[2] = T.c(context, e.a.m);
                            }
                            return new ColorStateList(array, array2);
                        }
                        
                        public final void l(final Drawable drawable, final int n, final PorterDuff$Mode porterDuff$Mode) {
                            Drawable mutate = drawable;
                            if (B.a(drawable)) {
                                mutate = drawable.mutate();
                            }
                            PorterDuff$Mode a;
                            if ((a = porterDuff$Mode) == null) {
                                a = l.e.a();
                            }
                            mutate.setColorFilter((ColorFilter)l.e.d(n, a));
                        }
                    });
                }
            }
            finally {
                break Label_0055;
            }
            return;
        }
    }
    // monitorexit(e.class)
    
    public static void g(final Drawable drawable, final V v, final int[] array) {
        M.v(drawable, v, array);
    }
    
    public Drawable c(final Context context, final int n) {
        synchronized (this) {
            return this.a.j(context, n);
        }
    }
    
    public ColorStateList e(final Context context, final int n) {
        synchronized (this) {
            return this.a.m(context, n);
        }
    }
}
