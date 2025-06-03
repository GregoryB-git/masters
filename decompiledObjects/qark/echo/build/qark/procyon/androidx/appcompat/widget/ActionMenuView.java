// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.ContextThemeWrapper;
import l.d0;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.MenuItem;
import androidx.appcompat.view.menu.e;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.view.View;
import androidx.annotation.NonNull;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.g;
import android.content.Context;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.d;

public class ActionMenuView extends androidx.appcompat.widget.b implements androidx.appcompat.view.menu.d.b, h
{
    public androidx.appcompat.view.menu.d D;
    public Context E;
    public int F;
    public boolean G;
    public androidx.appcompat.widget.a H;
    public g.a I;
    public androidx.appcompat.view.menu.d.a J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public e O;
    
    public ActionMenuView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(@NonNull final Context e, final AttributeSet set) {
        super(e, set);
        this.setBaselineAligned(false);
        final float density = e.getResources().getDisplayMetrics().density;
        this.M = (int)(56.0f * density);
        this.N = (int)(density * 4.0f);
        this.E = e;
        this.F = 0;
    }
    
    public static int G(final View view, final int n, int d, int n2, int n3) {
        final c c = (c)view.getLayoutParams();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2) - n3, View$MeasureSpec.getMode(n2));
        ActionMenuItemView actionMenuItemView;
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView)view;
        }
        else {
            actionMenuItemView = null;
        }
        final boolean b = false;
        if (actionMenuItemView != null && actionMenuItemView.f()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Label_0144: {
            if (d > 0) {
                n3 = 2;
                if (n2 == 0 || d >= 2) {
                    view.measure(View$MeasureSpec.makeMeasureSpec(d * n, Integer.MIN_VALUE), measureSpec);
                    final int measuredWidth = view.getMeasuredWidth();
                    final int n4 = d = measuredWidth / n;
                    if (measuredWidth % n != 0) {
                        d = n4 + 1;
                    }
                    if (n2 != 0 && d < 2) {
                        d = n3;
                    }
                    break Label_0144;
                }
            }
            d = 0;
        }
        boolean f = b;
        if (!c.c) {
            f = b;
            if (n2 != 0) {
                f = true;
            }
        }
        c.f = f;
        c.d = d;
        view.measure(View$MeasureSpec.makeMeasureSpec(n * d, 1073741824), measureSpec);
        return d;
    }
    
    public c A(final AttributeSet set) {
        return new c(((View)this).getContext(), set);
    }
    
    public c B(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams != null) {
            c c;
            if (viewGroup$LayoutParams instanceof c) {
                c = new c((c)viewGroup$LayoutParams);
            }
            else {
                c = new c(viewGroup$LayoutParams);
            }
            if (c.b <= 0) {
                c.b = 16;
            }
            return c;
        }
        return this.z();
    }
    
    public c C() {
        final c z = this.z();
        z.c = true;
        return z;
    }
    
    public boolean D(final int n) {
        final boolean b = false;
        if (n == 0) {
            return false;
        }
        final View child = this.getChildAt(n - 1);
        final View child2 = this.getChildAt(n);
        boolean b2 = b;
        if (n < this.getChildCount()) {
            b2 = b;
            if (child instanceof a) {
                b2 = ((a)child).b();
            }
        }
        boolean b3 = b2;
        if (n > 0) {
            b3 = b2;
            if (child2 instanceof a) {
                b3 = (b2 | ((a)child2).c());
            }
        }
        return b3;
    }
    
    public void E(final androidx.appcompat.view.menu.d d) {
        this.D = d;
    }
    
    public boolean F() {
        final androidx.appcompat.widget.a h = this.H;
        return h != null && h.B();
    }
    
    public final void H(int i, int n) {
        final int mode = View$MeasureSpec.getMode(n);
        i = View$MeasureSpec.getSize(i);
        final int size = View$MeasureSpec.getSize(n);
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int n2 = ((View)this).getPaddingTop() + ((View)this).getPaddingBottom();
        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, n2, -2);
        final int n3 = i - (paddingLeft + paddingRight);
        i = this.M;
        final int n4 = n3 / i;
        if (n4 == 0) {
            ((View)this).setMeasuredDimension(n3, 0);
            return;
        }
        final int n5 = i + n3 % i / n4;
        final int childCount = this.getChildCount();
        final int n6 = i = 0;
        int n7 = n = i;
        int n9;
        final int n8 = n9 = n;
        long j = 0L;
        int max = n8;
        int n10 = n;
        int k = i;
        int max2 = n6;
        i = n4;
        final int n11 = size;
        while (k < childCount) {
            final View child = this.getChildAt(k);
            if (child.getVisibility() == 8) {
                n = n9;
            }
            else {
                final boolean b = child instanceof ActionMenuItemView;
                ++n10;
                if (b) {
                    n = this.N;
                    child.setPadding(n, 0, n, 0);
                }
                final c c = (c)child.getLayoutParams();
                c.h = false;
                c.e = 0;
                c.d = 0;
                c.f = false;
                c.leftMargin = 0;
                c.rightMargin = 0;
                c.g = (b && ((ActionMenuItemView)child).f());
                if (c.c) {
                    n = 1;
                }
                else {
                    n = i;
                }
                final int g = G(child, n5, n, childMeasureSpec, n2);
                max = Math.max(max, g);
                n = n9;
                if (c.f) {
                    n = n9 + 1;
                }
                if (c.c) {
                    n7 = 1;
                }
                i -= g;
                max2 = Math.max(max2, child.getMeasuredHeight());
                if (g == 1) {
                    j |= 1 << k;
                }
            }
            ++k;
            n9 = n;
        }
        final boolean b2 = n7 != 0 && n10 == 2;
        n = 0;
        int n12 = i;
        final boolean b3 = b2;
        final int n13 = n3;
        while (true) {
            while (n9 > 0 && n12 > 0) {
                int n14 = Integer.MAX_VALUE;
                int n15 = 0;
                int l = 0;
                long n16 = 0L;
                while (l < childCount) {
                    final c c2 = (c)this.getChildAt(l).getLayoutParams();
                    int n17;
                    long n18;
                    if (!c2.f) {
                        i = n15;
                        n17 = n14;
                        n18 = n16;
                    }
                    else {
                        final int d = c2.d;
                        if (d < n14) {
                            n18 = 1L << l;
                            n17 = d;
                            i = 1;
                        }
                        else {
                            i = n15;
                            n17 = n14;
                            n18 = n16;
                            if (d == n14) {
                                i = n15 + 1;
                                n18 = (n16 | 1L << l);
                                n17 = n14;
                            }
                        }
                    }
                    ++l;
                    n15 = i;
                    n14 = n17;
                    n16 = n18;
                }
                i = n;
                n = max2;
                j |= n16;
                if (n15 > n12) {
                    final boolean b4 = n7 == 0 && n10 == 1;
                    int n24;
                    if (n12 > 0 && j != 0L && (n12 < n10 - 1 || b4 || max > 1)) {
                        float n19 = (float)Long.bitCount(j);
                        if (!b4) {
                            float n20 = n19;
                            if ((j & 0x1L) != 0x0L) {
                                n20 = n19;
                                if (!((c)this.getChildAt(0).getLayoutParams()).g) {
                                    n20 = n19 - 0.5f;
                                }
                            }
                            final int n21 = childCount - 1;
                            n19 = n20;
                            if ((j & (long)(1 << n21)) != 0x0L) {
                                n19 = n20;
                                if (!((c)this.getChildAt(n21).getLayoutParams()).g) {
                                    n19 = n20 - 0.5f;
                                }
                            }
                        }
                        int n22;
                        if (n19 > 0.0f) {
                            n22 = (int)(n12 * n5 / n19);
                        }
                        else {
                            n22 = 0;
                        }
                        int n23 = 0;
                        while (true) {
                            n24 = i;
                            if (n23 >= childCount) {
                                break;
                            }
                            int n25;
                            if ((j & (long)(1 << n23)) == 0x0L) {
                                n25 = i;
                            }
                            else {
                                final View child2 = this.getChildAt(n23);
                                final c c3 = (c)child2.getLayoutParams();
                                if (child2 instanceof ActionMenuItemView) {
                                    c3.e = n22;
                                    c3.h = true;
                                    if (n23 == 0 && !c3.g) {
                                        c3.leftMargin = -n22 / 2;
                                    }
                                    n25 = 1;
                                }
                                else if (c3.c) {
                                    c3.e = n22;
                                    c3.h = true;
                                    c3.rightMargin = -n22 / 2;
                                    n25 = 1;
                                }
                                else {
                                    if (n23 != 0) {
                                        c3.leftMargin = n22 / 2;
                                    }
                                    n25 = i;
                                    if (n23 != childCount - 1) {
                                        c3.rightMargin = n22 / 2;
                                        n25 = i;
                                    }
                                }
                            }
                            ++n23;
                            i = n25;
                        }
                    }
                    else {
                        n24 = i;
                    }
                    if (n24 != 0) {
                        View child3;
                        c c4;
                        for (i = 0; i < childCount; ++i) {
                            child3 = this.getChildAt(i);
                            c4 = (c)child3.getLayoutParams();
                            if (c4.h) {
                                child3.measure(View$MeasureSpec.makeMeasureSpec(c4.d * n5 + c4.e, 1073741824), childMeasureSpec);
                            }
                        }
                    }
                    if (mode == 1073741824) {
                        n = n11;
                    }
                    ((View)this).setMeasuredDimension(n13, n);
                    return;
                }
                View child4;
                c c5;
                long n26;
                long n27;
                int n28;
                for (i = 0; i < childCount; ++i) {
                    child4 = this.getChildAt(i);
                    c5 = (c)child4.getLayoutParams();
                    n26 = 1 << i;
                    if ((n16 & n26) == 0x0L) {
                        n27 = j;
                        if (c5.d == n14 + 1) {
                            n27 = (j | n26);
                        }
                        j = n27;
                    }
                    else {
                        if (b3 && c5.g && n12 == 1) {
                            n28 = this.N;
                            child4.setPadding(n28 + n5, 0, n28, 0);
                        }
                        ++c5.d;
                        c5.h = true;
                        --n12;
                    }
                }
                max2 = n;
                n = 1;
            }
            i = n;
            n = max2;
            continue;
        }
    }
    
    public androidx.appcompat.view.menu.d I() {
        return this.D;
    }
    
    public void J(final g.a i, final androidx.appcompat.view.menu.d.a j) {
        this.I = i;
        this.J = j;
    }
    
    public boolean K() {
        final androidx.appcompat.widget.a h = this.H;
        return h != null && h.H();
    }
    
    @Override
    public boolean a(final androidx.appcompat.view.menu.e e) {
        return this.D.H((MenuItem)e, 0);
    }
    
    @Override
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public Menu getMenu() {
        if (this.D == null) {
            final Context context = ((View)this).getContext();
            (this.D = new androidx.appcompat.view.menu.d(context)).L((androidx.appcompat.view.menu.d.a)new d());
            (this.H = new androidx.appcompat.widget.a(context)).G(true);
            final androidx.appcompat.widget.a h = this.H;
            g.a i = this.I;
            if (i == null) {
                i = new b();
            }
            h.k(i);
            this.D.b(this.H, this.E);
            this.H.E(this);
        }
        return (Menu)this.D;
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
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final androidx.appcompat.widget.a h = this.H;
        if (h != null) {
            h.f(false);
            if (this.H.B()) {
                this.H.z();
                this.H.H();
            }
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y();
    }
    
    @Override
    public void onLayout(final boolean b, int i, int j, int n, int n2) {
        if (!this.K) {
            super.onLayout(b, i, j, n, n2);
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = (n2 - j) / 2;
        final int dividerWidth = this.getDividerWidth();
        final int n4 = n - i;
        i = n4 - ((View)this).getPaddingRight() - ((View)this).getPaddingLeft();
        final boolean a = d0.a((View)this);
        j = 0;
        n2 = 0;
        n = 0;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final c c = (c)child.getLayoutParams();
                if (c.c) {
                    final int n5 = n2 = child.getMeasuredWidth();
                    if (this.D(j)) {
                        n2 = n5 + dividerWidth;
                    }
                    final int measuredHeight = child.getMeasuredHeight();
                    int n6;
                    int n7;
                    if (a) {
                        n6 = ((View)this).getPaddingLeft() + c.leftMargin;
                        n7 = n6 + n2;
                    }
                    else {
                        n7 = ((View)this).getWidth() - ((View)this).getPaddingRight() - c.rightMargin;
                        n6 = n7 - n2;
                    }
                    final int n8 = n3 - measuredHeight / 2;
                    child.layout(n6, n8, n7, measuredHeight + n8);
                    i -= n2;
                    n2 = 1;
                }
                else {
                    i -= child.getMeasuredWidth() + c.leftMargin + c.rightMargin;
                    this.D(j);
                    ++n;
                }
            }
            ++j;
        }
        if (childCount == 1 && n2 == 0) {
            final View child2 = this.getChildAt(0);
            i = child2.getMeasuredWidth();
            j = child2.getMeasuredHeight();
            n = n4 / 2 - i / 2;
            n2 = n3 - j / 2;
            child2.layout(n, n2, i + n, j + n2);
            return;
        }
        j = n - (n2 ^ 0x1);
        if (j > 0) {
            i /= j;
        }
        else {
            i = 0;
        }
        n2 = Math.max(0, i);
        if (a) {
            j = ((View)this).getWidth() - ((View)this).getPaddingRight();
            View child3;
            c c2;
            int measuredHeight2;
            int n9;
            for (i = 0; i < childCount; ++i, j = n) {
                child3 = this.getChildAt(i);
                c2 = (c)child3.getLayoutParams();
                n = j;
                if (child3.getVisibility() != 8) {
                    if (c2.c) {
                        n = j;
                    }
                    else {
                        j -= c2.rightMargin;
                        n = child3.getMeasuredWidth();
                        measuredHeight2 = child3.getMeasuredHeight();
                        n9 = n3 - measuredHeight2 / 2;
                        child3.layout(j - n, n9, j, measuredHeight2 + n9);
                        n = j - (n + c2.leftMargin + n2);
                    }
                }
            }
        }
        else {
            j = ((View)this).getPaddingLeft();
            View child4;
            c c3;
            int measuredHeight3;
            int n10;
            for (i = 0; i < childCount; ++i, j = n) {
                child4 = this.getChildAt(i);
                c3 = (c)child4.getLayoutParams();
                n = j;
                if (child4.getVisibility() != 8) {
                    if (c3.c) {
                        n = j;
                    }
                    else {
                        j += c3.leftMargin;
                        n = child4.getMeasuredWidth();
                        measuredHeight3 = child4.getMeasuredHeight();
                        n10 = n3 - measuredHeight3 / 2;
                        child4.layout(j, n10, j + n, measuredHeight3 + n10);
                        n = j + (n + c3.rightMargin + n2);
                    }
                }
            }
        }
    }
    
    @Override
    public void onMeasure(final int n, final int n2) {
        final boolean k = this.K;
        final boolean i = View$MeasureSpec.getMode(n) == 1073741824;
        this.K = i;
        if (k != i) {
            this.L = 0;
        }
        final int size = View$MeasureSpec.getSize(n);
        if (this.K) {
            final androidx.appcompat.view.menu.d d = this.D;
            if (d != null && size != this.L) {
                this.L = size;
                d.G(true);
            }
        }
        final int childCount = this.getChildCount();
        if (this.K && childCount > 0) {
            this.H(n, n2);
            return;
        }
        for (int j = 0; j < childCount; ++j) {
            final c c = (c)this.getChildAt(j).getLayoutParams();
            c.rightMargin = 0;
            c.leftMargin = 0;
        }
        super.onMeasure(n, n2);
    }
    
    public void setExpandedActionViewsExclusive(final boolean b) {
        this.H.D(b);
    }
    
    public void setOnMenuItemClickListener(final e o) {
        this.O = o;
    }
    
    public void setOverflowIcon(final Drawable drawable) {
        this.getMenu();
        this.H.F(drawable);
    }
    
    public void setOverflowReserved(final boolean g) {
        this.G = g;
    }
    
    public void setPopupTheme(final int f) {
        if (this.F != f) {
            if ((this.F = f) == 0) {
                this.E = ((View)this).getContext();
                return;
            }
            this.E = (Context)new ContextThemeWrapper(((View)this).getContext(), f);
        }
    }
    
    public void setPresenter(final androidx.appcompat.widget.a h) {
        (this.H = h).E(this);
    }
    
    public void y() {
        final androidx.appcompat.widget.a h = this.H;
        if (h != null) {
            h.w();
        }
    }
    
    public c z() {
        final c c = new c(-2, -2);
        c.b = 16;
        return c;
    }
    
    public interface a
    {
        boolean b();
        
        boolean c();
    }
    
    public static class b implements g.a
    {
        @Override
        public void b(final androidx.appcompat.view.menu.d d, final boolean b) {
        }
        
        @Override
        public boolean c(final androidx.appcompat.view.menu.d d) {
            return false;
        }
    }
    
    public static class c extends a
    {
        public boolean c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        
        public c(final int n, final int n2) {
            super(n, n2);
            this.c = false;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public c(final c c) {
            super((ViewGroup$LayoutParams)c);
            this.c = c.c;
        }
    }
    
    public class d implements androidx.appcompat.view.menu.d.a
    {
        @Override
        public boolean a(final androidx.appcompat.view.menu.d d, final MenuItem menuItem) {
            final e o = ActionMenuView.this.O;
            return o != null && o.onMenuItemClick(menuItem);
        }
        
        @Override
        public void b(final androidx.appcompat.view.menu.d d) {
            final androidx.appcompat.view.menu.d.a j = ActionMenuView.this.J;
            if (j != null) {
                j.b(d);
            }
        }
    }
    
    public interface e
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
}
