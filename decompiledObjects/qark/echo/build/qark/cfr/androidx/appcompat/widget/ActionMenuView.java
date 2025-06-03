/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b;
import l.d0;

public class ActionMenuView
extends androidx.appcompat.widget.b
implements d.b,
h {
    public androidx.appcompat.view.menu.d D;
    public Context E;
    public int F;
    public boolean G;
    public androidx.appcompat.widget.a H;
    public g.a I;
    public d.a J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public e O;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.M = (int)(56.0f * f8);
        this.N = (int)(f8 * 4.0f);
        this.E = context;
        this.F = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int G(View var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        var11_5 = (c)var0.getLayoutParams();
        var6_6 = View.MeasureSpec.makeMeasureSpec((int)(View.MeasureSpec.getSize((int)var3_3) - var4_4), (int)View.MeasureSpec.getMode((int)var3_3));
        var10_7 = var0 instanceof ActionMenuItemView != false ? (ActionMenuItemView)var0 : null;
        var9_8 = false;
        var3_3 = var10_7 != null && var10_7.f() != false ? 1 : 0;
        if (var2_2 <= 0) ** GOTO lbl-1000
        var4_4 = 2;
        if (var3_3 == 0 || var2_2 >= 2) {
            var0.measure(View.MeasureSpec.makeMeasureSpec((int)(var2_2 * var1_1), (int)Integer.MIN_VALUE), var6_6);
            var7_9 = var0.getMeasuredWidth();
            var2_2 = var5_10 = var7_9 / var1_1;
            if (var7_9 % var1_1 != 0) {
                var2_2 = var5_10 + 1;
            }
            if (var3_3 != 0 && var2_2 < 2) {
                var2_2 = var4_4;
            }
        } else lbl-1000: // 2 sources:
        {
            var2_2 = 0;
        }
        var8_11 = var9_8;
        if (!var11_5.c) {
            var8_11 = var9_8;
            if (var3_3 != 0) {
                var8_11 = true;
            }
        }
        var11_5.f = var8_11;
        var11_5.d = var2_2;
        var0.measure(View.MeasureSpec.makeMeasureSpec((int)(var1_1 * var2_2), (int)1073741824), var6_6);
        return var2_2;
    }

    public c A(AttributeSet attributeSet) {
        return new c(this.getContext(), attributeSet);
    }

    public c B(ViewGroup.LayoutParams object) {
        if (object != null) {
            object = object instanceof c ? new c((c)((Object)object)) : new c((ViewGroup.LayoutParams)object);
            if (object.b <= 0) {
                object.b = 16;
            }
            return object;
        }
        return this.z();
    }

    public c C() {
        c c8 = this.z();
        c8.c = true;
        return c8;
    }

    public boolean D(int n8) {
        boolean bl = false;
        if (n8 == 0) {
            return false;
        }
        View view = this.getChildAt(n8 - 1);
        View view2 = this.getChildAt(n8);
        boolean bl2 = bl;
        if (n8 < this.getChildCount()) {
            bl2 = bl;
            if (view instanceof a) {
                bl2 = ((a)view).b();
            }
        }
        bl = bl2;
        if (n8 > 0) {
            bl = bl2;
            if (view2 instanceof a) {
                bl = bl2 | ((a)view2).c();
            }
        }
        return bl;
    }

    public void E(androidx.appcompat.view.menu.d d8) {
        this.D = d8;
    }

    public boolean F() {
        androidx.appcompat.widget.a a8 = this.H;
        if (a8 != null && a8.B()) {
            return true;
        }
        return false;
    }

    public final void H(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        long l8;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        c c8;
        Object object;
        block41 : {
            n12 = View.MeasureSpec.getMode((int)n9);
            n8 = View.MeasureSpec.getSize((int)n8);
            n19 = View.MeasureSpec.getSize((int)n9);
            n13 = this.getPaddingLeft();
            n10 = this.getPaddingRight();
            int n22 = this.getPaddingTop() + this.getPaddingBottom();
            n21 = ViewGroup.getChildMeasureSpec((int)n9, (int)n22, (int)-2);
            int n23 = n8 - (n13 + n10);
            n8 = this.M;
            int n24 = n23 / n8;
            if (n24 == 0) {
                this.setMeasuredDimension(n23, 0);
                return;
            }
            n11 = n8 + n23 % n8 / n24;
            n17 = this.getChildCount();
            n14 = n13 = (n9 = (n18 = (n8 = (n10 = 0))));
            l8 = 0L;
            n16 = n13;
            n20 = n9;
            n15 = n8;
            n13 = n10;
            n8 = n24;
            n10 = n19;
            while (n15 < n17) {
                object = this.getChildAt(n15);
                if (object.getVisibility() == 8) {
                    n9 = n14;
                } else {
                    boolean bl = object instanceof ActionMenuItemView;
                    ++n20;
                    if (bl) {
                        n9 = this.N;
                        object.setPadding(n9, 0, n9, 0);
                    }
                    c8 = (c)object.getLayoutParams();
                    c8.h = false;
                    c8.e = 0;
                    c8.d = 0;
                    c8.f = false;
                    c8.leftMargin = 0;
                    c8.rightMargin = 0;
                    bl = bl && ((ActionMenuItemView)object).f();
                    c8.g = bl;
                    n9 = c8.c ? 1 : n8;
                    n19 = ActionMenuView.G((View)object, n11, n9, n21, n22);
                    n16 = Math.max((int)n16, (int)n19);
                    n9 = n14;
                    if (c8.f) {
                        n9 = n14 + 1;
                    }
                    if (c8.c) {
                        n18 = 1;
                    }
                    n8 -= n19;
                    n13 = Math.max((int)n13, (int)object.getMeasuredHeight());
                    if (n19 == 1) {
                        l8 |= (long)(1 << n15);
                    }
                }
                ++n15;
                n14 = n9;
            }
            n15 = n18 != 0 && n20 == 2 ? 1 : 0;
            n9 = 0;
            n19 = n8;
            n24 = n15;
            n15 = n23;
            while (n14 > 0 && n19 > 0) {
                long l9;
                n23 = Integer.MAX_VALUE;
                int n25 = 0;
                long l10 = 0L;
                for (n22 = 0; n22 < n17; ++n22) {
                    int n26;
                    object = (c)this.getChildAt(n22).getLayoutParams();
                    if (!object.f) {
                        n8 = n25;
                        n26 = n23;
                        l9 = l10;
                    } else {
                        int n27 = object.d;
                        if (n27 < n23) {
                            l9 = 1L << n22;
                            n26 = n27;
                            n8 = 1;
                        } else {
                            n8 = n25;
                            n26 = n23;
                            l9 = l10;
                            if (n27 == n23) {
                                n8 = n25 + 1;
                                l9 = l10 | 1L << n22;
                                n26 = n23;
                            }
                        }
                    }
                    n25 = n8;
                    n23 = n26;
                    l10 = l9;
                }
                n8 = n9;
                n9 = n13;
                l8 |= l10;
                if (n25 <= n19) {
                    for (n8 = 0; n8 < n17; ++n8) {
                        object = this.getChildAt(n8);
                        c8 = (c)object.getLayoutParams();
                        long l11 = 1 << n8;
                        if ((l10 & l11) == 0L) {
                            l9 = l8;
                            if (c8.d == n23 + 1) {
                                l9 = l8 | l11;
                            }
                            l8 = l9;
                            continue;
                        }
                        if (n24 != 0 && c8.g && n19 == 1) {
                            n13 = this.N;
                            object.setPadding(n13 + n11, 0, n13, 0);
                        }
                        ++c8.d;
                        c8.h = true;
                        --n19;
                    }
                    n13 = n9;
                    n9 = 1;
                    continue;
                }
                break block41;
            }
            n8 = n9;
            n9 = n13;
        }
        n13 = n18 == 0 && n20 == 1 ? 1 : 0;
        if (n19 > 0 && l8 != 0L && (n19 < n20 - 1 || n13 != 0 || n16 > 1)) {
            float f8 = Long.bitCount((long)l8);
            if (n13 == 0) {
                float f9 = f8;
                if ((l8 & 1L) != 0L) {
                    f9 = f8;
                    if (!((c)this.getChildAt((int)0).getLayoutParams()).g) {
                        f9 = f8 - 0.5f;
                    }
                }
                n13 = n17 - 1;
                f8 = f9;
                if ((l8 & (long)(1 << n13)) != 0L) {
                    f8 = f9;
                    if (!((c)this.getChildAt((int)n13).getLayoutParams()).g) {
                        f8 = f9 - 0.5f;
                    }
                }
            }
            n18 = f8 > 0.0f ? (int)((float)(n19 * n11) / f8) : 0;
            n14 = 0;
            do {
                n13 = n8;
                if (n14 < n17) {
                    if ((l8 & (long)(1 << n14)) == 0L) {
                        n13 = n8;
                    } else {
                        object = this.getChildAt(n14);
                        c8 = (c)object.getLayoutParams();
                        if (object instanceof ActionMenuItemView) {
                            c8.e = n18;
                            c8.h = true;
                            if (n14 == 0 && !c8.g) {
                                c8.leftMargin = (- n18) / 2;
                            }
                            n13 = 1;
                        } else if (c8.c) {
                            c8.e = n18;
                            c8.h = true;
                            c8.rightMargin = (- n18) / 2;
                            n13 = 1;
                        } else {
                            if (n14 != 0) {
                                c8.leftMargin = n18 / 2;
                            }
                            n13 = n8;
                            if (n14 != n17 - 1) {
                                c8.rightMargin = n18 / 2;
                                n13 = n8;
                            }
                        }
                    }
                    ++n14;
                    n8 = n13;
                    continue;
                }
                break;
            } while (true);
        } else {
            n13 = n8;
        }
        if (n13 != 0) {
            for (n8 = 0; n8 < n17; ++n8) {
                object = this.getChildAt(n8);
                c8 = (c)object.getLayoutParams();
                if (!c8.h) continue;
                object.measure(View.MeasureSpec.makeMeasureSpec((int)(c8.d * n11 + c8.e), (int)1073741824), n21);
            }
        }
        if (n12 == 1073741824) {
            n9 = n10;
        }
        this.setMeasuredDimension(n15, n9);
    }

    public androidx.appcompat.view.menu.d I() {
        return this.D;
    }

    public void J(g.a a8, d.a a9) {
        this.I = a8;
        this.J = a9;
    }

    public boolean K() {
        androidx.appcompat.widget.a a8 = this.H;
        if (a8 != null && a8.H()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean a(androidx.appcompat.view.menu.e e8) {
        return this.D.H(e8, 0);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.D == null) {
            Object object = this.getContext();
            Object object2 = new androidx.appcompat.view.menu.d((Context)object);
            this.D = object2;
            object2.L(new d());
            this.H = object = new androidx.appcompat.widget.a((Context)object);
            object.G(true);
            object2 = this.H;
            object = this.I;
            if (object == null) {
                object = new b();
            }
            object2.k((g.a)object);
            this.D.b(this.H, this.E);
            this.H.E(this);
        }
        return this.D;
    }

    public Drawable getOverflowIcon() {
        this.getMenu();
        return this.H.y();
    }

    public int getPopupTheme() {
        return this.F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration object) {
        ViewGroup.super.onConfigurationChanged((Configuration)object);
        object = this.H;
        if (object != null) {
            object.f(false);
            if (this.H.B()) {
                this.H.z();
                this.H.H();
            }
        }
    }

    public void onDetachedFromWindow() {
        ViewGroup.super.onDetachedFromWindow();
        this.y();
    }

    @Override
    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        int n12;
        c c8;
        View view;
        int n13;
        if (!this.K) {
            super.onLayout(bl, n8, n9, n10, n11);
            return;
        }
        int n14 = this.getChildCount();
        int n15 = (n11 - n9) / 2;
        int n16 = this.getDividerWidth();
        int n17 = n10 - n8;
        n8 = n17 - this.getPaddingRight() - this.getPaddingLeft();
        bl = d0.a((View)this);
        n11 = 0;
        n10 = 0;
        for (n9 = 0; n9 < n14; ++n9) {
            view = this.getChildAt(n9);
            if (view.getVisibility() == 8) continue;
            c8 = (c)view.getLayoutParams();
            if (c8.c) {
                n11 = n12 = view.getMeasuredWidth();
                if (this.D(n9)) {
                    n11 = n12 + n16;
                }
                int n18 = view.getMeasuredHeight();
                if (bl) {
                    n13 = this.getPaddingLeft() + c8.leftMargin;
                    n12 = n13 + n11;
                } else {
                    n12 = this.getWidth() - this.getPaddingRight() - c8.rightMargin;
                    n13 = n12 - n11;
                }
                int n19 = n15 - n18 / 2;
                view.layout(n13, n19, n12, n18 + n19);
                n8 -= n11;
                n11 = 1;
                continue;
            }
            n8 -= view.getMeasuredWidth() + c8.leftMargin + c8.rightMargin;
            this.D(n9);
            ++n10;
        }
        if (n14 == 1 && n11 == 0) {
            view = this.getChildAt(0);
            n8 = view.getMeasuredWidth();
            n9 = view.getMeasuredHeight();
            n10 = n17 / 2 - n8 / 2;
            n11 = n15 - n9 / 2;
            view.layout(n10, n11, n8 + n10, n9 + n11);
            return;
        }
        n9 = n10 - (n11 ^ 1);
        n8 = n9 > 0 ? (n8 /= n9) : 0;
        n11 = Math.max((int)0, (int)n8);
        if (bl) {
            n9 = this.getWidth() - this.getPaddingRight();
            for (n8 = 0; n8 < n14; ++n8) {
                view = this.getChildAt(n8);
                c8 = (c)view.getLayoutParams();
                n10 = n9;
                if (view.getVisibility() != 8) {
                    if (c8.c) {
                        n10 = n9;
                    } else {
                        n10 = view.getMeasuredWidth();
                        n12 = view.getMeasuredHeight();
                        n13 = n15 - n12 / 2;
                        view.layout(n9 - n10, n13, n9 -= c8.rightMargin, n12 + n13);
                        n10 = n9 - (n10 + c8.leftMargin + n11);
                    }
                }
                n9 = n10;
            }
        } else {
            n9 = this.getPaddingLeft();
            for (n8 = 0; n8 < n14; ++n8) {
                view = this.getChildAt(n8);
                c8 = (c)view.getLayoutParams();
                n10 = n9;
                if (view.getVisibility() != 8) {
                    if (c8.c) {
                        n10 = n9;
                    } else {
                        n10 = view.getMeasuredWidth();
                        n12 = view.getMeasuredHeight();
                        n13 = n15 - n12 / 2;
                        view.layout(n9, n13, (n9 += c8.leftMargin) + n10, n12 + n13);
                        n10 = n9 + (n10 + c8.rightMargin + n11);
                    }
                }
                n9 = n10;
            }
        }
    }

    @Override
    public void onMeasure(int n8, int n9) {
        Object object;
        boolean bl = this.K;
        boolean bl2 = View.MeasureSpec.getMode((int)n8) == 1073741824;
        this.K = bl2;
        if (bl != bl2) {
            this.L = 0;
        }
        int n10 = View.MeasureSpec.getSize((int)n8);
        if (this.K && (object = this.D) != null && n10 != this.L) {
            this.L = n10;
            object.G(true);
        }
        int n11 = this.getChildCount();
        if (this.K && n11 > 0) {
            this.H(n8, n9);
            return;
        }
        for (n10 = 0; n10 < n11; ++n10) {
            object = (c)this.getChildAt(n10).getLayoutParams();
            object.rightMargin = 0;
            object.leftMargin = 0;
        }
        super.onMeasure(n8, n9);
    }

    public void setExpandedActionViewsExclusive(boolean bl) {
        this.H.D(bl);
    }

    public void setOnMenuItemClickListener(e e8) {
        this.O = e8;
    }

    public void setOverflowIcon(Drawable drawable2) {
        this.getMenu();
        this.H.F(drawable2);
    }

    public void setOverflowReserved(boolean bl) {
        this.G = bl;
    }

    public void setPopupTheme(int n8) {
        if (this.F != n8) {
            this.F = n8;
            if (n8 == 0) {
                this.E = this.getContext();
                return;
            }
            this.E = new ContextThemeWrapper(this.getContext(), n8);
        }
    }

    public void setPresenter(androidx.appcompat.widget.a a8) {
        this.H = a8;
        a8.E(this);
    }

    public void y() {
        androidx.appcompat.widget.a a8 = this.H;
        if (a8 != null) {
            a8.w();
        }
    }

    public c z() {
        c c8 = new c(-2, -2);
        c8.b = 16;
        return c8;
    }

    public static interface a {
        public boolean b();

        public boolean c();
    }

    public static class b
    implements g.a {
        @Override
        public void b(androidx.appcompat.view.menu.d d8, boolean bl) {
        }

        @Override
        public boolean c(androidx.appcompat.view.menu.d d8) {
            return false;
        }
    }

    public static class c
    extends b.a {
        public boolean c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;

        public c(int n8, int n9) {
            super(n8, n9);
            this.c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c c8) {
            super((ViewGroup.LayoutParams)c8);
            this.c = c8.c;
        }
    }

    public class d
    implements d.a {
        @Override
        public boolean a(androidx.appcompat.view.menu.d object, MenuItem menuItem) {
            object = ActionMenuView.this.O;
            if (object != null && object.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override
        public void b(androidx.appcompat.view.menu.d d8) {
            d.a a8 = ActionMenuView.this.J;
            if (a8 != null) {
                a8.b(d8);
            }
        }
    }

    public static interface e {
        public boolean onMenuItemClick(MenuItem var1);
    }

}

