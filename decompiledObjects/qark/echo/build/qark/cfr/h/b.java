/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.System
 *  java.lang.Throwable
 */
package h;

import B.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.SparseArray;

public abstract class b
extends Drawable
implements Drawable.Callback {
    public c o;
    public Rect p;
    public Drawable q;
    public Drawable r;
    public int s = 255;
    public boolean t;
    public int u = -1;
    public boolean v;
    public Runnable w;
    public long x;
    public long y;
    public b z;

    public static int f(Resources resources, int n8) {
        if (resources != null) {
            n8 = resources.getDisplayMetrics().densityDpi;
        }
        int n9 = n8;
        if (n8 == 0) {
            n9 = 160;
        }
        return n9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(boolean var1_1) {
        block9 : {
            block8 : {
                block6 : {
                    block7 : {
                        block5 : {
                            var3_2 = true;
                            this.t = true;
                            var4_3 = SystemClock.uptimeMillis();
                            var8_4 = this.q;
                            if (var8_4 == null) break block5;
                            var6_5 = this.x;
                            if (var6_5 == 0L) break block6;
                            if (var6_5 > var4_3) break block7;
                            var8_4.setAlpha(this.s);
                        }
                        this.x = 0L;
                        break block6;
                    }
                    var8_4.setAlpha((255 - (int)((var6_5 - var4_3) * 255L) / this.o.A) * this.s / 255);
                    var2_6 = true;
                    break block8;
                }
                var2_6 = false;
            }
            var8_4 = this.r;
            if (var8_4 == null) ** GOTO lbl27
            var6_5 = this.y;
            if (var6_5 == 0L) break block9;
            if (var6_5 <= var4_3) {
                var8_4.setVisible(false, false);
                this.r = null;
lbl27: // 2 sources:
                this.y = 0L;
            } else {
                var8_4.setAlpha((int)((var6_5 - var4_3) * 255L) / this.o.B * this.s / 255);
                var2_6 = var3_2;
            }
        }
        if (var1_1 == false) return;
        if (var2_6 == false) return;
        this.scheduleSelf(this.w, var4_3 + 16L);
    }

    public void applyTheme(Resources.Theme theme) {
        this.o.b(theme);
    }

    public abstract c b();

    public int c() {
        return this.u;
    }

    public boolean canApplyTheme() {
        return this.o.canApplyTheme();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Drawable drawable2) {
        Throwable throwable2;
        block8 : {
            if (this.z == null) {
                this.z = new b();
            }
            drawable2.setCallback((Drawable.Callback)this.z.b(drawable2.getCallback()));
            try {
                if (this.o.A <= 0 && this.t) {
                    drawable2.setAlpha(this.s);
                }
                c c8 = this.o;
                if (c8.E) {
                    drawable2.setColorFilter(c8.D);
                } else {
                    if (c8.H) {
                        a.m(drawable2, c8.F);
                    }
                    c8 = this.o;
                    if (c8.I) {
                        a.n(drawable2, c8.G);
                    }
                }
                drawable2.setVisible(this.isVisible(), true);
                drawable2.setDither(this.o.x);
                drawable2.setState(this.getState());
                drawable2.setLevel(this.getLevel());
                drawable2.setBounds(this.getBounds());
                drawable2.setLayoutDirection(this.getLayoutDirection());
                drawable2.setAutoMirrored(this.o.C);
                c8 = this.p;
                if (c8 == null) break block8;
                drawable2.setHotspotBounds(c8.left, c8.top, c8.right, c8.bottom);
            }
            catch (Throwable throwable2) {}
        }
        drawable2.setCallback(this.z.a());
        return;
        drawable2.setCallback(this.z.a());
        throw throwable2;
    }

    public void draw(Canvas canvas) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((drawable2 = this.r) != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        if (this.isAutoMirrored() && a.e(this) == 1) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean g(int var1_1) {
        if (var1_1 == this.u) {
            return false;
        }
        var2_2 = SystemClock.uptimeMillis();
        if (this.o.B > 0) {
            var4_3 = this.r;
            if (var4_3 != null) {
                var4_3.setVisible(false, false);
            }
            if ((var4_3 = this.q) != null) {
                this.r = var4_3;
                this.y = (long)this.o.B + var2_2;
            } else {
                this.r = null;
                this.y = 0L;
            }
        } else {
            var4_3 = this.q;
            if (var4_3 != null) {
                var4_3.setVisible(false, false);
            }
        }
        if (var1_1 < 0) ** GOTO lbl-1000
        var4_3 = this.o;
        if (var1_1 < var4_3.h) {
            this.q = var4_3 = var4_3.g(var1_1);
            this.u = var1_1;
            if (var4_3 != null) {
                var1_1 = this.o.A;
                if (var1_1 > 0) {
                    this.x = var2_2 + (long)var1_1;
                }
                this.d((Drawable)var4_3);
            }
        } else lbl-1000: // 2 sources:
        {
            this.q = null;
            this.u = -1;
        }
        if (this.x != 0L || this.y != 0L) {
            var4_3 = this.w;
            if (var4_3 == null) {
                this.w = new Runnable(){

                    public void run() {
                        b.this.a(true);
                        b.this.invalidateSelf();
                    }
                };
            } else {
                this.unscheduleSelf((Runnable)var4_3);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    public int getAlpha() {
        return this.s;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.o.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.o.c()) {
            this.o.d = this.getChangingConfigurations();
            return this.o;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.q;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.p;
        if (rect2 != null) {
            rect.set(rect2);
            return;
        }
        super.getHotspotBounds(rect);
    }

    public int getIntrinsicHeight() {
        if (this.o.q()) {
            return this.o.i();
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            return drawable2.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.o.q()) {
            return this.o.m();
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            return drawable2.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.o.q()) {
            return this.o.j();
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            return drawable2.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.o.q()) {
            return this.o.k();
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            return drawable2.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isVisible()) {
            return this.o.n();
        }
        return -2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        int n8;
        boolean bl;
        Rect rect2 = this.o.l();
        if (rect2 != null) {
            rect.set(rect2);
            n8 = rect2.left;
            int n9 = rect2.top;
            int n10 = rect2.bottom;
            bl = (rect2.right | (n8 | n9 | n10)) != 0;
        } else {
            rect2 = this.q;
            bl = rect2 != null ? rect2.getPadding(rect) : super.getPadding(rect);
        }
        if (this.e()) {
            n8 = rect.left;
            rect.left = rect.right;
            rect.right = n8;
        }
        return bl;
    }

    public void h(c c8) {
        this.o = c8;
        int n8 = this.u;
        if (n8 >= 0) {
            c8 = c8.g(n8);
            this.q = c8;
            if (c8 != null) {
                this.d((Drawable)c8);
            }
        }
        this.r = null;
    }

    public final void i(Resources resources) {
        this.o.y(resources);
    }

    public void invalidateDrawable(Drawable drawable2) {
        c c8 = this.o;
        if (c8 != null) {
            c8.p();
        }
        if (drawable2 == this.q && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }

    public boolean isAutoMirrored() {
        return this.o.C;
    }

    public void jumpToCurrentState() {
        block10 : {
            block9 : {
                boolean bl;
                block8 : {
                    Drawable drawable2 = this.r;
                    boolean bl2 = true;
                    if (drawable2 != null) {
                        drawable2.jumpToCurrentState();
                        this.r = null;
                        bl = true;
                    } else {
                        bl = false;
                    }
                    drawable2 = this.q;
                    if (drawable2 != null) {
                        drawable2.jumpToCurrentState();
                        if (this.t) {
                            this.q.setAlpha(this.s);
                        }
                    }
                    if (this.y != 0L) {
                        this.y = 0L;
                        bl = bl2;
                    }
                    if (this.x == 0L) break block8;
                    this.x = 0L;
                    break block9;
                }
                if (!bl) break block10;
            }
            this.invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.v && super.mutate() == this) {
            c c8 = this.b();
            c8.r();
            this.h(c8);
            this.v = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        if ((drawable2 = this.q) != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int n8) {
        return this.o.w(n8, this.c());
    }

    public boolean onLevelChange(int n8) {
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            return drawable2.setLevel(n8);
        }
        drawable2 = this.q;
        if (drawable2 != null) {
            return drawable2.setLevel(n8);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable2, Runnable runnable, long l8) {
        if (drawable2 == this.q && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, l8);
        }
    }

    public void setAlpha(int n8) {
        if (!this.t || this.s != n8) {
            this.t = true;
            this.s = n8;
            Drawable drawable2 = this.q;
            if (drawable2 != null) {
                if (this.x == 0L) {
                    drawable2.setAlpha(n8);
                    return;
                }
                this.a(false);
            }
        }
    }

    public void setAutoMirrored(boolean bl) {
        c c8 = this.o;
        if (c8.C != bl) {
            c8.C = bl;
            c8 = this.q;
            if (c8 != null) {
                a.i((Drawable)c8, bl);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c c8 = this.o;
        c8.E = true;
        if (c8.D != colorFilter) {
            c8.D = colorFilter;
            c8 = this.q;
            if (c8 != null) {
                c8.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean bl) {
        c c8 = this.o;
        if (c8.x != bl) {
            c8.x = bl;
            c8 = this.q;
            if (c8 != null) {
                c8.setDither(bl);
            }
        }
    }

    public void setHotspot(float f8, float f9) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            a.j(drawable2, f8, f9);
        }
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        Rect rect = this.p;
        if (rect == null) {
            this.p = new Rect(n8, n9, n10, n11);
        } else {
            rect.set(n8, n9, n10, n11);
        }
        rect = this.q;
        if (rect != null) {
            a.k((Drawable)rect, n8, n9, n10, n11);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        c c8 = this.o;
        c8.H = true;
        if (c8.F != colorStateList) {
            c8.F = colorStateList;
            a.m(this.q, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c c8 = this.o;
        c8.I = true;
        if (c8.G != mode) {
            c8.G = mode;
            a.n(this.q, mode);
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = super.setVisible(bl, bl2);
        Drawable drawable2 = this.r;
        if (drawable2 != null) {
            drawable2.setVisible(bl, bl2);
        }
        if ((drawable2 = this.q) != null) {
            drawable2.setVisible(bl, bl2);
        }
        return bl3;
    }

    public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
        if (drawable2 == this.q && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }

    public static class b
    implements Drawable.Callback {
        public Drawable.Callback o;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.o;
            this.o = null;
            return callback;
        }

        public b b(Drawable.Callback callback) {
            this.o = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable2) {
        }

        public void scheduleDrawable(Drawable drawable2, Runnable runnable, long l8) {
            Drawable.Callback callback = this.o;
            if (callback != null) {
                callback.scheduleDrawable(drawable2, runnable, l8);
            }
        }

        public void unscheduleDrawable(Drawable drawable2, Runnable runnable) {
            Drawable.Callback callback = this.o;
            if (callback != null) {
                callback.unscheduleDrawable(drawable2, runnable);
            }
        }
    }

    public static abstract class c
    extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;
        public final b a;
        public Resources b;
        public int c = 160;
        public int d;
        public int e;
        public SparseArray f;
        public Drawable[] g;
        public int h;
        public boolean i;
        public boolean j;
        public Rect k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        /*
         * Enabled aggressive block sorting
         */
        public c(c c8, b resources, Resources resources2) {
            int n8 = 0;
            this.i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = resources;
            resources = resources2 != null ? resources2 : (c8 != null ? c8.b : null);
            this.b = resources;
            int n9 = c8 != null ? c8.c : 0;
            this.c = n9 = b.f(resources2, n9);
            if (c8 == null) {
                this.g = new Drawable[10];
                this.h = 0;
                return;
            } else {
                this.d = c8.d;
                this.e = c8.e;
                this.v = true;
                this.w = true;
                this.i = c8.i;
                this.l = c8.l;
                this.x = c8.x;
                this.y = c8.y;
                this.z = c8.z;
                this.A = c8.A;
                this.B = c8.B;
                this.C = c8.C;
                this.D = c8.D;
                this.E = c8.E;
                this.F = c8.F;
                this.G = c8.G;
                this.H = c8.H;
                this.I = c8.I;
                if (c8.c == n9) {
                    if (c8.j) {
                        this.k = new Rect(c8.k);
                        this.j = true;
                    }
                    if (c8.m) {
                        this.n = c8.n;
                        this.o = c8.o;
                        this.p = c8.p;
                        this.q = c8.q;
                        this.m = true;
                    }
                }
                if (c8.r) {
                    this.s = c8.s;
                    this.r = true;
                }
                if (c8.t) {
                    this.u = c8.u;
                    this.t = true;
                }
                resources = c8.g;
                this.g = new Drawable[resources.length];
                this.h = c8.h;
                c8 = c8.f;
                c8 = c8 != null ? c8.clone() : new SparseArray(this.h);
                this.f = c8;
                int n10 = this.h;
                for (n9 = n8; n9 < n10; ++n9) {
                    c8 = resources[n9];
                    if (c8 == null) continue;
                    if ((c8 = c8.getConstantState()) != null) {
                        this.f.put(n9, (Object)c8);
                        continue;
                    }
                    this.g[n9] = resources[n9];
                }
            }
        }

        public final int a(Drawable drawable2) {
            int n8 = this.h;
            if (n8 >= this.g.length) {
                this.o(n8, n8 + 10);
            }
            drawable2.mutate();
            drawable2.setVisible(false, true);
            drawable2.setCallback((Drawable.Callback)this.a);
            this.g[n8] = drawable2;
            ++this.h;
            int n9 = this.e;
            this.e = drawable2.getChangingConfigurations() | n9;
            this.p();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return n8;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                this.e();
                int n8 = this.h;
                Drawable[] arrdrawable = this.g;
                for (int i8 = 0; i8 < n8; ++i8) {
                    Drawable drawable2 = arrdrawable[i8];
                    if (drawable2 == null || !drawable2.canApplyTheme()) continue;
                    arrdrawable[i8].applyTheme(theme);
                    this.e |= arrdrawable[i8].getChangingConfigurations();
                }
                this.y(theme.getResources());
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean c() {
            synchronized (this) {
                int n8;
                Drawable[] arrdrawable;
                block6 : {
                    try {
                        if (this.v) {
                            return this.w;
                        }
                        this.e();
                        this.v = true;
                        n8 = this.h;
                        arrdrawable = this.g;
                        break block6;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (arrdrawable[i8].getConstantState() != null) continue;
                    this.w = false;
                    return false;
                }
                {
                    this.w = true;
                    return true;
                }
            }
        }

        public boolean canApplyTheme() {
            int n8 = this.h;
            Drawable[] arrdrawable = this.g;
            for (int i8 = 0; i8 < n8; ++i8) {
                Drawable drawable2 = arrdrawable[i8];
                if (!(drawable2 != null ? drawable2.canApplyTheme() : (drawable2 = (Drawable.ConstantState)this.f.get(i8)) != null && drawable2.canApplyTheme())) continue;
                return true;
            }
            return false;
        }

        public void d() {
            this.m = true;
            this.e();
            int n8 = this.h;
            Drawable[] arrdrawable = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                Drawable drawable2 = arrdrawable[i8];
                int n9 = drawable2.getIntrinsicWidth();
                if (n9 > this.n) {
                    this.n = n9;
                }
                if ((n9 = drawable2.getIntrinsicHeight()) > this.o) {
                    this.o = n9;
                }
                if ((n9 = drawable2.getMinimumWidth()) > this.p) {
                    this.p = n9;
                }
                if ((n9 = drawable2.getMinimumHeight()) <= this.q) continue;
                this.q = n9;
            }
        }

        public final void e() {
            SparseArray sparseArray = this.f;
            if (sparseArray != null) {
                int n8 = sparseArray.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    int n9 = this.f.keyAt(i8);
                    sparseArray = (Drawable.ConstantState)this.f.valueAt(i8);
                    this.g[n9] = this.s(sparseArray.newDrawable(this.b));
                }
                this.f = null;
            }
        }

        public final int f() {
            return this.g.length;
        }

        public final Drawable g(int n8) {
            int n9;
            Drawable drawable2 = this.g[n8];
            if (drawable2 != null) {
                return drawable2;
            }
            drawable2 = this.f;
            if (drawable2 != null && (n9 = drawable2.indexOfKey(n8)) >= 0) {
                this.g[n8] = drawable2 = this.s(((Drawable.ConstantState)this.f.valueAt(n9)).newDrawable(this.b));
                this.f.removeAt(n9);
                if (this.f.size() == 0) {
                    this.f = null;
                }
                return drawable2;
            }
            return null;
        }

        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final int h() {
            return this.h;
        }

        public final int i() {
            if (!this.m) {
                this.d();
            }
            return this.o;
        }

        public final int j() {
            if (!this.m) {
                this.d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.m) {
                this.d();
            }
            return this.p;
        }

        public final Rect l() {
            boolean bl = this.i;
            Rect rect = null;
            if (bl) {
                return null;
            }
            Rect rect2 = this.k;
            if (rect2 == null) {
                if (this.j) {
                    return rect2;
                }
                this.e();
                Rect rect3 = new Rect();
                int n8 = this.h;
                Drawable[] arrdrawable = this.g;
                for (int i8 = 0; i8 < n8; ++i8) {
                    Rect rect4 = rect;
                    if (arrdrawable[i8].getPadding(rect3)) {
                        int n9;
                        rect2 = rect;
                        if (rect == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if ((n9 = rect3.left) > rect2.left) {
                            rect2.left = n9;
                        }
                        if ((n9 = rect3.top) > rect2.top) {
                            rect2.top = n9;
                        }
                        if ((n9 = rect3.right) > rect2.right) {
                            rect2.right = n9;
                        }
                        n9 = rect3.bottom;
                        rect4 = rect2;
                        if (n9 > rect2.bottom) {
                            rect2.bottom = n9;
                            rect4 = rect2;
                        }
                    }
                    rect = rect4;
                }
                this.j = true;
                this.k = rect;
                return rect;
            }
            return rect2;
        }

        public final int m() {
            if (!this.m) {
                this.d();
            }
            return this.n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            this.e();
            int n8 = this.h;
            Drawable[] arrdrawable = this.g;
            int n9 = n8 > 0 ? arrdrawable[0].getOpacity() : -2;
            for (int i8 = 1; i8 < n8; ++i8) {
                n9 = Drawable.resolveOpacity((int)n9, (int)arrdrawable[i8].getOpacity());
            }
            this.s = n9;
            this.r = true;
            return n9;
        }

        public void o(int n8, int n9) {
            Drawable[] arrdrawable = new Drawable[n9];
            System.arraycopy((Object)this.g, (int)0, (Object)arrdrawable, (int)0, (int)n8);
            this.g = arrdrawable;
        }

        public void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable2) {
            drawable2.setLayoutDirection(this.z);
            drawable2 = drawable2.mutate();
            drawable2.setCallback((Drawable.Callback)this.a);
            return drawable2;
        }

        public final void t(boolean bl) {
            this.l = bl;
        }

        public final void u(int n8) {
            this.A = n8;
        }

        public final void v(int n8) {
            this.B = n8;
        }

        public final boolean w(int n8, int n9) {
            int n10 = this.h;
            Drawable[] arrdrawable = this.g;
            boolean bl = false;
            for (int i8 = 0; i8 < n10; ++i8) {
                Drawable drawable2 = arrdrawable[i8];
                boolean bl2 = bl;
                if (drawable2 != null) {
                    boolean bl3 = drawable2.setLayoutDirection(n8);
                    bl2 = bl;
                    if (i8 == n9) {
                        bl2 = bl3;
                    }
                }
                bl = bl2;
            }
            this.z = n8;
            return bl;
        }

        public final void x(boolean bl) {
            this.i = bl;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int n8 = b.f(resources, this.c);
                int n9 = this.c;
                this.c = n8;
                if (n9 != n8) {
                    this.m = false;
                    this.j = false;
                }
            }
        }
    }

}

