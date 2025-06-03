// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.view.ViewParent;
import j.b;
import androidx.appcompat.view.menu.j;
import android.view.View$MeasureSpec;
import android.text.TextUtils$TruncateAt;
import l.w;
import android.view.ContextThemeWrapper;
import I.h;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import l.A;
import android.view.Menu;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import I.e;
import java.util.List;
import j.c;
import android.view.MenuInflater;
import android.text.TextUtils;
import I.s;
import l.X;
import e.i;
import android.view.MenuItem;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import java.util.ArrayList;
import android.content.res.ColorStateList;
import l.O;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public O H;
    public int I;
    public int J;
    public int K;
    public CharSequence L;
    public CharSequence M;
    public ColorStateList N;
    public ColorStateList O;
    public boolean P;
    public boolean Q;
    public final ArrayList R;
    public final ArrayList S;
    public final int[] T;
    public final ActionMenuView.e U;
    public androidx.appcompat.widget.d V;
    public a W;
    public d a0;
    public androidx.appcompat.view.menu.g.a b0;
    public androidx.appcompat.view.menu.d.a c0;
    public boolean d0;
    public final Runnable e0;
    public ActionMenuView o;
    public TextView p;
    public TextView q;
    public ImageButton r;
    public ImageView s;
    public Drawable t;
    public CharSequence u;
    public ImageButton v;
    public View w;
    public Context x;
    public int y;
    public int z;
    
    public Toolbar(@NonNull final Context context, final AttributeSet set) {
        this(context, set, e.a.s);
    }
    
    public Toolbar(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.K = 8388627;
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new int[2];
        this.U = new ActionMenuView.e() {
            @Override
            public boolean onMenuItemClick(final MenuItem menuItem) {
                Toolbar.this.getClass();
                return false;
            }
        };
        this.e0 = new Runnable() {
            @Override
            public void run() {
                Toolbar.this.H();
            }
        };
        final X s = X.s(((View)this).getContext(), set, i.j2, n, 0);
        I.s.B((View)this, context, i.j2, set, s.o(), n, 0);
        this.z = s.l(i.L2, 0);
        this.A = s.l(i.C2, 0);
        this.K = s.j(i.k2, this.K);
        this.B = s.j(i.l2, 48);
        final int n2 = n = s.d(i.F2, 0);
        if (s.p(i.K2)) {
            n = s.d(i.K2, n2);
        }
        this.G = n;
        this.F = n;
        this.E = n;
        this.D = n;
        n = s.d(i.I2, -1);
        if (n >= 0) {
            this.D = n;
        }
        n = s.d(i.H2, -1);
        if (n >= 0) {
            this.E = n;
        }
        n = s.d(i.J2, -1);
        if (n >= 0) {
            this.F = n;
        }
        n = s.d(i.G2, -1);
        if (n >= 0) {
            this.G = n;
        }
        this.C = s.e(i.w2, -1);
        n = s.d(i.s2, Integer.MIN_VALUE);
        final int d = s.d(i.o2, Integer.MIN_VALUE);
        final int e = s.e(i.q2, 0);
        final int e2 = s.e(i.r2, 0);
        this.f();
        this.H.e(e, e2);
        if (n != Integer.MIN_VALUE || d != Integer.MIN_VALUE) {
            this.H.g(n, d);
        }
        this.I = s.d(i.t2, Integer.MIN_VALUE);
        this.J = s.d(i.p2, Integer.MIN_VALUE);
        this.t = s.f(i.n2);
        this.u = s.n(i.m2);
        final CharSequence n3 = s.n(i.E2);
        if (!TextUtils.isEmpty(n3)) {
            this.setTitle(n3);
        }
        final CharSequence n4 = s.n(i.B2);
        if (!TextUtils.isEmpty(n4)) {
            this.setSubtitle(n4);
        }
        this.x = ((View)this).getContext();
        this.setPopupTheme(s.l(i.A2, 0));
        final Drawable f = s.f(i.z2);
        if (f != null) {
            this.setNavigationIcon(f);
        }
        final CharSequence n5 = s.n(i.y2);
        if (!TextUtils.isEmpty(n5)) {
            this.setNavigationContentDescription(n5);
        }
        final Drawable f2 = s.f(i.u2);
        if (f2 != null) {
            this.setLogo(f2);
        }
        final CharSequence n6 = s.n(i.v2);
        if (!TextUtils.isEmpty(n6)) {
            this.setLogoDescription(n6);
        }
        if (s.p(i.M2)) {
            this.setTitleTextColor(s.c(i.M2));
        }
        if (s.p(i.D2)) {
            this.setSubtitleTextColor(s.c(i.D2));
        }
        if (s.p(i.x2)) {
            this.t(s.l(i.x2, 0));
        }
        s.t();
    }
    
    private MenuInflater getMenuInflater() {
        return new c(((View)this).getContext());
    }
    
    public final void A() {
        ((View)this).removeCallbacks(this.e0);
        ((View)this).post(this.e0);
    }
    
    public void B() {
        for (int i = this.getChildCount() - 1; i >= 0; --i) {
            final View child = this.getChildAt(i);
            if (((e)child.getLayoutParams()).b != 2 && child != this.o) {
                this.removeViewAt(i);
                this.S.add(child);
            }
        }
    }
    
    public void C(final int n, final int n2) {
        this.f();
        this.H.g(n, n2);
    }
    
    public void D(final Context context, final int a) {
        this.A = a;
        final TextView q = this.q;
        if (q != null) {
            q.setTextAppearance(context, a);
        }
    }
    
    public void E(final Context context, final int z) {
        this.z = z;
        final TextView p2 = this.p;
        if (p2 != null) {
            p2.setTextAppearance(context, z);
        }
    }
    
    public final boolean F() {
        if (!this.d0) {
            return false;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (this.G(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean G(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    public boolean H() {
        final ActionMenuView o = this.o;
        return o != null && o.K();
    }
    
    public void a() {
        for (int i = this.S.size() - 1; i >= 0; --i) {
            this.addView((View)this.S.get(i));
        }
        this.S.clear();
    }
    
    public final void b(final List list, int i) {
        final int m = I.s.m((View)this);
        final int n = 0;
        final boolean b = m == 1;
        final int childCount = this.getChildCount();
        final int a = I.e.a(i, I.s.m((View)this));
        list.clear();
        i = n;
        if (b) {
            View child;
            e e;
            for (i = childCount - 1; i >= 0; --i) {
                child = this.getChildAt(i);
                e = (e)child.getLayoutParams();
                if (e.b == 0 && this.G(child) && this.n(e.a) == a) {
                    list.add(child);
                }
            }
        }
        else {
            while (i < childCount) {
                final View child2 = this.getChildAt(i);
                final e e2 = (e)child2.getLayoutParams();
                if (e2.b == 0 && this.G(child2) && this.n(e2.a) == a) {
                    list.add(child2);
                }
                ++i;
            }
        }
    }
    
    public final void c(final View e, final boolean b) {
        final ViewGroup$LayoutParams layoutParams = e.getLayoutParams();
        e layoutParams2;
        if (layoutParams == null) {
            layoutParams2 = this.k();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = this.m(layoutParams);
        }
        else {
            layoutParams2 = (e)layoutParams;
        }
        layoutParams2.b = 1;
        if (b && this.w != null) {
            e.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.S.add(e);
            return;
        }
        this.addView(e, (ViewGroup$LayoutParams)layoutParams2);
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof e;
    }
    
    public void d() {
        final d a0 = this.a0;
        androidx.appcompat.view.menu.e p;
        if (a0 == null) {
            p = null;
        }
        else {
            p = a0.p;
        }
        if (p != null) {
            p.collapseActionView();
        }
    }
    
    public void e() {
        if (this.v == null) {
            ((ImageView)(this.v = new l.g(((View)this).getContext(), null, e.a.r))).setImageDrawable(this.t);
            ((View)this.v).setContentDescription(this.u);
            final e k = this.k();
            k.a = ((this.B & 0x70) | 0x800003);
            k.b = 2;
            ((View)this.v).setLayoutParams((ViewGroup$LayoutParams)k);
            ((View)this.v).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public void onClick(final View view) {
                    Toolbar.this.d();
                }
            });
        }
    }
    
    public final void f() {
        if (this.H == null) {
            this.H = new O();
        }
    }
    
    public final void g() {
        if (this.s == null) {
            this.s = new AppCompatImageView(((View)this).getContext());
        }
    }
    
    public CharSequence getCollapseContentDescription() {
        final ImageButton v = this.v;
        if (v != null) {
            return ((View)v).getContentDescription();
        }
        return null;
    }
    
    public Drawable getCollapseIcon() {
        final ImageButton v = this.v;
        if (v != null) {
            return ((ImageView)v).getDrawable();
        }
        return null;
    }
    
    public int getContentInsetEnd() {
        final O h = this.H;
        if (h != null) {
            return h.a();
        }
        return 0;
    }
    
    public int getContentInsetEndWithActions() {
        final int j = this.J;
        if (j != Integer.MIN_VALUE) {
            return j;
        }
        return this.getContentInsetEnd();
    }
    
    public int getContentInsetLeft() {
        final O h = this.H;
        if (h != null) {
            return h.b();
        }
        return 0;
    }
    
    public int getContentInsetRight() {
        final O h = this.H;
        if (h != null) {
            return h.c();
        }
        return 0;
    }
    
    public int getContentInsetStart() {
        final O h = this.H;
        if (h != null) {
            return h.d();
        }
        return 0;
    }
    
    public int getContentInsetStartWithNavigation() {
        final int i = this.I;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return this.getContentInsetStart();
    }
    
    public int getCurrentContentInsetEnd() {
        final ActionMenuView o = this.o;
        if (o != null) {
            final androidx.appcompat.view.menu.d i = o.I();
            if (i != null && i.hasVisibleItems()) {
                return Math.max(this.getContentInsetEnd(), Math.max(this.J, 0));
            }
        }
        return this.getContentInsetEnd();
    }
    
    public int getCurrentContentInsetLeft() {
        if (I.s.m((View)this) == 1) {
            return this.getCurrentContentInsetEnd();
        }
        return this.getCurrentContentInsetStart();
    }
    
    public int getCurrentContentInsetRight() {
        if (I.s.m((View)this) == 1) {
            return this.getCurrentContentInsetStart();
        }
        return this.getCurrentContentInsetEnd();
    }
    
    public int getCurrentContentInsetStart() {
        if (this.getNavigationIcon() != null) {
            return Math.max(this.getContentInsetStart(), Math.max(this.I, 0));
        }
        return this.getContentInsetStart();
    }
    
    public Drawable getLogo() {
        final ImageView s = this.s;
        if (s != null) {
            return s.getDrawable();
        }
        return null;
    }
    
    public CharSequence getLogoDescription() {
        final ImageView s = this.s;
        if (s != null) {
            return ((View)s).getContentDescription();
        }
        return null;
    }
    
    public Menu getMenu() {
        this.h();
        return this.o.getMenu();
    }
    
    public CharSequence getNavigationContentDescription() {
        final ImageButton r = this.r;
        if (r != null) {
            return ((View)r).getContentDescription();
        }
        return null;
    }
    
    public Drawable getNavigationIcon() {
        final ImageButton r = this.r;
        if (r != null) {
            return ((ImageView)r).getDrawable();
        }
        return null;
    }
    
    public a getOuterActionMenuPresenter() {
        return this.W;
    }
    
    public Drawable getOverflowIcon() {
        this.h();
        return this.o.getOverflowIcon();
    }
    
    public Context getPopupContext() {
        return this.x;
    }
    
    public int getPopupTheme() {
        return this.y;
    }
    
    public CharSequence getSubtitle() {
        return this.M;
    }
    
    public final TextView getSubtitleTextView() {
        return this.q;
    }
    
    public CharSequence getTitle() {
        return this.L;
    }
    
    public int getTitleMarginBottom() {
        return this.G;
    }
    
    public int getTitleMarginEnd() {
        return this.E;
    }
    
    public int getTitleMarginStart() {
        return this.D;
    }
    
    public int getTitleMarginTop() {
        return this.F;
    }
    
    public final TextView getTitleTextView() {
        return this.p;
    }
    
    public A getWrapper() {
        if (this.V == null) {
            this.V = new androidx.appcompat.widget.d(this, true);
        }
        return this.V;
    }
    
    public final void h() {
        this.i();
        if (this.o.I() == null) {
            final androidx.appcompat.view.menu.d d = (androidx.appcompat.view.menu.d)this.o.getMenu();
            if (this.a0 == null) {
                this.a0 = new d();
            }
            this.o.setExpandedActionViewsExclusive(true);
            d.b(this.a0, this.x);
        }
    }
    
    public final void i() {
        if (this.o == null) {
            (this.o = new ActionMenuView(((View)this).getContext())).setPopupTheme(this.y);
            this.o.setOnMenuItemClickListener(this.U);
            this.o.J(this.b0, this.c0);
            final e k = this.k();
            k.a = ((this.B & 0x70) | 0x800005);
            ((View)this.o).setLayoutParams((ViewGroup$LayoutParams)k);
            this.c((View)this.o, false);
        }
    }
    
    public final void j() {
        if (this.r == null) {
            this.r = new l.g(((View)this).getContext(), null, e.a.r);
            final e k = this.k();
            k.a = ((this.B & 0x70) | 0x800003);
            ((View)this.r).setLayoutParams((ViewGroup$LayoutParams)k);
        }
    }
    
    public e k() {
        return new e(-2, -2);
    }
    
    public e l(final AttributeSet set) {
        return new e(((View)this).getContext(), set);
    }
    
    public e m(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof e) {
            return new e((e)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof f.a) {
            return new e((f.a)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new e((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new e(viewGroup$LayoutParams);
    }
    
    public final int n(int n) {
        final int m = I.s.m((View)this);
        final int n2 = I.e.a(n, m) & 0x7;
        if (n2 != 1) {
            n = 3;
            if (n2 != 3 && n2 != 5) {
                if (m == 1) {
                    n = 5;
                }
                return n;
            }
        }
        return n2;
    }
    
    public final int o(final View view, int n) {
        final e e = (e)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        final int p2 = this.p(e.a);
        if (p2 == 48) {
            return ((View)this).getPaddingTop() - n;
        }
        if (p2 != 80) {
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int height = ((View)this).getHeight();
            final int n2 = (height - paddingTop - paddingBottom - measuredHeight) / 2;
            n = e.topMargin;
            if (n2 >= n) {
                final int n3 = height - paddingBottom - measuredHeight - n2 - paddingTop;
                final int bottomMargin = e.bottomMargin;
                n = n2;
                if (n3 < bottomMargin) {
                    n = Math.max(0, n2 - (bottomMargin - n3));
                }
            }
            return paddingTop + n;
        }
        return ((View)this).getHeight() - ((View)this).getPaddingBottom() - measuredHeight - e.bottomMargin - n;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((View)this).removeCallbacks(this.e0);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Q = false;
        }
        if (!this.Q) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.Q = false;
        }
        return true;
    }
    
    public void onLayout(final boolean b, int i, int j, int a, int min) {
        final boolean b2 = I.s.m((View)this) == 1;
        final int width = ((View)this).getWidth();
        final int height = ((View)this).getHeight();
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingTop = ((View)this).getPaddingTop();
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int n = width - paddingRight;
        final int[] t = this.T;
        t[t[1] = 0] = 0;
        i = I.s.n((View)this);
        if (i >= 0) {
            min = Math.min(i, min - j);
        }
        else {
            min = 0;
        }
        int x = 0;
        Label_0172: {
            if (this.G((View)this.r)) {
                final ImageButton r = this.r;
                if (b2) {
                    x = this.x((View)r, n, t, min);
                    a = paddingLeft;
                    break Label_0172;
                }
                a = this.w((View)r, paddingLeft, t, min);
            }
            else {
                a = paddingLeft;
            }
            x = n;
        }
        i = a;
        j = x;
        if (this.G((View)this.v)) {
            final ImageButton v = this.v;
            if (b2) {
                j = this.x((View)v, x, t, min);
                i = a;
            }
            else {
                i = this.w((View)v, a, t, min);
                j = x;
            }
        }
        int w = i;
        a = j;
        if (this.G((View)this.o)) {
            final ActionMenuView o = this.o;
            if (b2) {
                w = this.w((View)o, i, t, min);
                a = j;
            }
            else {
                a = this.x((View)o, j, t, min);
                w = i;
            }
        }
        j = this.getCurrentContentInsetLeft();
        i = this.getCurrentContentInsetRight();
        t[0] = Math.max(0, j - w);
        t[1] = Math.max(0, i - (n - a));
        j = Math.max(w, j);
        a = Math.min(a, n - i);
        i = j;
        int x2 = a;
        if (this.G(this.w)) {
            final View w2 = this.w;
            if (b2) {
                x2 = this.x(w2, a, t, min);
                i = j;
            }
            else {
                i = this.w(w2, j, t, min);
                x2 = a;
            }
        }
        a = i;
        j = x2;
        if (this.G((View)this.s)) {
            final ImageView s = this.s;
            if (b2) {
                j = this.x((View)s, x2, t, min);
                a = i;
            }
            else {
                a = this.w((View)s, i, t, min);
                j = x2;
            }
        }
        final boolean g = this.G((View)this.p);
        final boolean g2 = this.G((View)this.q);
        if (g) {
            final e e = (e)((View)this.p).getLayoutParams();
            i = e.topMargin + ((View)this.p).getMeasuredHeight() + e.bottomMargin;
        }
        else {
            i = 0;
        }
        if (g2) {
            final e e2 = (e)((View)this.q).getLayoutParams();
            i += e2.topMargin + ((View)this.q).getMeasuredHeight() + e2.bottomMargin;
        }
        Label_1326: {
            if (!g && !g2) {
                i = a;
            }
            else {
                TextView textView;
                if (g) {
                    textView = this.p;
                }
                else {
                    textView = this.q;
                }
                TextView textView2;
                if (g2) {
                    textView2 = this.q;
                }
                else {
                    textView2 = this.p;
                }
                final e e3 = (e)((View)textView).getLayoutParams();
                final e e4 = (e)((View)textView2).getLayoutParams();
                final boolean b3 = (g && ((View)this.p).getMeasuredWidth() > 0) || (g2 && ((View)this.q).getMeasuredWidth() > 0);
                final int n2 = this.K & 0x70;
                if (n2 != 48) {
                    if (n2 != 80) {
                        final int n3 = (height - paddingTop - paddingBottom - i) / 2;
                        final int topMargin = e3.topMargin;
                        final int f = this.F;
                        if (n3 < topMargin + f) {
                            i = topMargin + f;
                        }
                        else {
                            final int n4 = height - paddingBottom - i - n3 - paddingTop;
                            final int bottomMargin = e3.bottomMargin;
                            final int g3 = this.G;
                            i = n3;
                            if (n4 < bottomMargin + g3) {
                                i = Math.max(0, n3 - (e4.bottomMargin + g3 - n4));
                            }
                        }
                        i += paddingTop;
                    }
                    else {
                        i = height - paddingBottom - e4.bottomMargin - this.G - i;
                    }
                }
                else {
                    i = ((View)this).getPaddingTop() + e3.topMargin + this.F;
                }
                if (b2) {
                    int d;
                    if (b3) {
                        d = this.D;
                    }
                    else {
                        d = 0;
                    }
                    final int b4 = d - t[1];
                    j -= Math.max(0, b4);
                    t[1] = Math.max(0, -b4);
                    int n7;
                    if (g) {
                        final e e5 = (e)((View)this.p).getLayoutParams();
                        final int n5 = j - ((View)this.p).getMeasuredWidth();
                        final int n6 = ((View)this.p).getMeasuredHeight() + i;
                        ((View)this.p).layout(n5, i, j, n6);
                        i = n5 - this.E;
                        n7 = n6 + e5.bottomMargin;
                    }
                    else {
                        final int n8 = j;
                        n7 = i;
                        i = n8;
                    }
                    int b5;
                    if (g2) {
                        final int n9 = n7 + ((e)((View)this.q).getLayoutParams()).topMargin;
                        ((View)this.q).layout(j - ((View)this.q).getMeasuredWidth(), n9, j, ((View)this.q).getMeasuredHeight() + n9);
                        b5 = j - this.E;
                    }
                    else {
                        b5 = j;
                    }
                    if (b3) {
                        j = Math.min(i, b5);
                    }
                    i = a;
                }
                else {
                    int d2;
                    if (b3) {
                        d2 = this.D;
                    }
                    else {
                        d2 = 0;
                    }
                    final int b6 = d2 - t[0];
                    a += Math.max(0, b6);
                    t[0] = Math.max(0, -b6);
                    int a2;
                    if (g) {
                        final e e6 = (e)((View)this.p).getLayoutParams();
                        final int n10 = ((View)this.p).getMeasuredWidth() + a;
                        final int n11 = ((View)this.p).getMeasuredHeight() + i;
                        ((View)this.p).layout(a, i, n10, n11);
                        a2 = n10 + this.E;
                        i = n11 + e6.bottomMargin;
                    }
                    else {
                        a2 = a;
                    }
                    int b7;
                    if (g2) {
                        i += ((e)((View)this.q).getLayoutParams()).topMargin;
                        final int n12 = ((View)this.q).getMeasuredWidth() + a;
                        ((View)this.q).layout(a, i, n12, ((View)this.q).getMeasuredHeight() + i);
                        b7 = n12 + this.E;
                    }
                    else {
                        b7 = a;
                    }
                    i = a;
                    a = j;
                    if (b3) {
                        i = Math.max(a2, b7);
                        a = j;
                    }
                    break Label_1326;
                }
            }
            a = j;
        }
        final int n13 = paddingLeft;
        final int n14 = 0;
        this.b(this.R, 3);
        int size;
        for (size = this.R.size(), j = 0; j < size; ++j) {
            i = this.w(this.R.get(j), i, t, min);
        }
        this.b(this.R, 5);
        int size2;
        for (size2 = this.R.size(), j = 0; j < size2; ++j) {
            a = this.x(this.R.get(j), a, t, min);
        }
        this.b(this.R, 1);
        final int s2 = this.s(this.R, t);
        j = n13 + (width - n13 - paddingRight) / 2 - s2 / 2;
        final int n15 = s2 + j;
        if (j >= i) {
            if (n15 > a) {
                i = j - (n15 - a);
            }
            else {
                i = j;
            }
        }
        a = this.R.size();
        j = i;
        for (i = n14; i < a; ++i) {
            j = this.w(this.R.get(i), j, t, min);
        }
        this.R.clear();
    }
    
    public void onMeasure(final int n, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final g g = (g)parcelable;
        super.onRestoreInstanceState(g.a());
        final ActionMenuView o = this.o;
        Object i;
        if (o != null) {
            i = o.I();
        }
        else {
            i = null;
        }
        final int q = g.q;
        if (q != 0 && this.a0 != null && i != null) {
            final MenuItem item = ((Menu)i).findItem(q);
            if (item != null) {
                item.expandActionView();
            }
        }
        if (g.r) {
            this.A();
        }
    }
    
    public void onRtlPropertiesChanged(final int n) {
        super.onRtlPropertiesChanged(n);
        this.f();
        final O h = this.H;
        boolean b = true;
        if (n != 1) {
            b = false;
        }
        h.f(b);
    }
    
    public Parcelable onSaveInstanceState() {
        final g g = new g(super.onSaveInstanceState());
        final d a0 = this.a0;
        if (a0 != null) {
            final androidx.appcompat.view.menu.e p = a0.p;
            if (p != null) {
                g.q = p.getItemId();
            }
        }
        g.r = this.v();
        return (Parcelable)g;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = false;
        }
        if (!this.P) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.P = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.P = false;
        }
        return true;
    }
    
    public final int p(int n) {
        final int n2 = n &= 0x70;
        if (n2 != 16 && (n = n2) != 48 && (n = n2) != 80) {
            n = (this.K & 0x70);
        }
        return n;
    }
    
    public final int q(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return h.b(viewGroup$MarginLayoutParams) + h.a(viewGroup$MarginLayoutParams);
    }
    
    public final int r(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin;
    }
    
    public final int s(final List list, final int[] array) {
        int max = array[0];
        int max2 = array[1];
        int n;
        for (int size = list.size(), i = n = 0; i < size; ++i) {
            final View view = list.get(i);
            final e e = (e)view.getLayoutParams();
            final int b = e.leftMargin - max;
            final int b2 = e.rightMargin - max2;
            final int max3 = Math.max(0, b);
            final int max4 = Math.max(0, b2);
            max = Math.max(0, -b);
            max2 = Math.max(0, -b2);
            n += max3 + view.getMeasuredWidth() + max4;
        }
        return n;
    }
    
    public void setCollapseContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setCollapseContentDescription(text);
    }
    
    public void setCollapseContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.e();
        }
        final ImageButton v = this.v;
        if (v != null) {
            ((View)v).setContentDescription(contentDescription);
        }
    }
    
    public void setCollapseIcon(final int n) {
        this.setCollapseIcon(g.a.b(((View)this).getContext(), n));
    }
    
    public void setCollapseIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.e();
            ((ImageView)this.v).setImageDrawable(imageDrawable);
            return;
        }
        final ImageButton v = this.v;
        if (v != null) {
            ((ImageView)v).setImageDrawable(this.t);
        }
    }
    
    public void setCollapsible(final boolean d0) {
        this.d0 = d0;
        ((View)this).requestLayout();
    }
    
    public void setContentInsetEndWithActions(final int n) {
        int j = n;
        if (n < 0) {
            j = Integer.MIN_VALUE;
        }
        if (j != this.J) {
            this.J = j;
            if (this.getNavigationIcon() != null) {
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setContentInsetStartWithNavigation(final int n) {
        int i = n;
        if (n < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.I) {
            this.I = i;
            if (this.getNavigationIcon() != null) {
                ((View)this).requestLayout();
            }
        }
    }
    
    public void setLogo(final int n) {
        this.setLogo(g.a.b(((View)this).getContext(), n));
    }
    
    public void setLogo(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.g();
            if (!this.u((View)this.s)) {
                this.c((View)this.s, true);
            }
        }
        else {
            final ImageView s = this.s;
            if (s != null && this.u((View)s)) {
                this.removeView((View)this.s);
                this.S.remove(this.s);
            }
        }
        final ImageView s2 = this.s;
        if (s2 != null) {
            s2.setImageDrawable(imageDrawable);
        }
    }
    
    public void setLogoDescription(final int n) {
        this.setLogoDescription(((View)this).getContext().getText(n));
    }
    
    public void setLogoDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.g();
        }
        final ImageView s = this.s;
        if (s != null) {
            ((View)s).setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setNavigationContentDescription(text);
    }
    
    public void setNavigationContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.j();
        }
        final ImageButton r = this.r;
        if (r != null) {
            ((View)r).setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationIcon(final int n) {
        this.setNavigationIcon(g.a.b(((View)this).getContext(), n));
    }
    
    public void setNavigationIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.j();
            if (!this.u((View)this.r)) {
                this.c((View)this.r, true);
            }
        }
        else {
            final ImageButton r = this.r;
            if (r != null && this.u((View)r)) {
                this.removeView((View)this.r);
                this.S.remove(this.r);
            }
        }
        final ImageButton r2 = this.r;
        if (r2 != null) {
            ((ImageView)r2).setImageDrawable(imageDrawable);
        }
    }
    
    public void setNavigationOnClickListener(final View$OnClickListener onClickListener) {
        this.j();
        ((View)this.r).setOnClickListener(onClickListener);
    }
    
    public void setOnMenuItemClickListener(final f f) {
    }
    
    public void setOverflowIcon(final Drawable overflowIcon) {
        this.h();
        this.o.setOverflowIcon(overflowIcon);
    }
    
    public void setPopupTheme(final int y) {
        if (this.y != y) {
            if ((this.y = y) == 0) {
                this.x = ((View)this).getContext();
                return;
            }
            this.x = (Context)new ContextThemeWrapper(((View)this).getContext(), y);
        }
    }
    
    public void setSubtitle(final int n) {
        this.setSubtitle(((View)this).getContext().getText(n));
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.q == null) {
                final Context context = ((View)this).getContext();
                (this.q = new w(context)).setSingleLine();
                this.q.setEllipsize(TextUtils$TruncateAt.END);
                final int a = this.A;
                if (a != 0) {
                    this.q.setTextAppearance(context, a);
                }
                final ColorStateList o = this.O;
                if (o != null) {
                    this.q.setTextColor(o);
                }
            }
            if (!this.u((View)this.q)) {
                this.c((View)this.q, true);
            }
        }
        else {
            final TextView q = this.q;
            if (q != null && this.u((View)q)) {
                this.removeView((View)this.q);
                this.S.remove(this.q);
            }
        }
        final TextView q2 = this.q;
        if (q2 != null) {
            q2.setText(charSequence);
        }
        this.M = charSequence;
    }
    
    public void setSubtitleTextColor(final int n) {
        this.setSubtitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setSubtitleTextColor(@NonNull final ColorStateList list) {
        this.O = list;
        final TextView q = this.q;
        if (q != null) {
            q.setTextColor(list);
        }
    }
    
    public void setTitle(final int n) {
        this.setTitle(((View)this).getContext().getText(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.p == null) {
                final Context context = ((View)this).getContext();
                (this.p = new w(context)).setSingleLine();
                this.p.setEllipsize(TextUtils$TruncateAt.END);
                final int z = this.z;
                if (z != 0) {
                    this.p.setTextAppearance(context, z);
                }
                final ColorStateList n = this.N;
                if (n != null) {
                    this.p.setTextColor(n);
                }
            }
            if (!this.u((View)this.p)) {
                this.c((View)this.p, true);
            }
        }
        else {
            final TextView p = this.p;
            if (p != null && this.u((View)p)) {
                this.removeView((View)this.p);
                this.S.remove(this.p);
            }
        }
        final TextView p2 = this.p;
        if (p2 != null) {
            p2.setText(charSequence);
        }
        this.L = charSequence;
    }
    
    public void setTitleMarginBottom(final int g) {
        this.G = g;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginEnd(final int e) {
        this.E = e;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginStart(final int d) {
        this.D = d;
        ((View)this).requestLayout();
    }
    
    public void setTitleMarginTop(final int f) {
        this.F = f;
        ((View)this).requestLayout();
    }
    
    public void setTitleTextColor(final int n) {
        this.setTitleTextColor(ColorStateList.valueOf(n));
    }
    
    public void setTitleTextColor(@NonNull final ColorStateList list) {
        this.N = list;
        final TextView p = this.p;
        if (p != null) {
            p.setTextColor(list);
        }
    }
    
    public void t(final int n) {
        this.getMenuInflater().inflate(n, this.getMenu());
    }
    
    public final boolean u(final View o) {
        return o.getParent() == this || this.S.contains(o);
    }
    
    public boolean v() {
        final ActionMenuView o = this.o;
        return o != null && o.F();
    }
    
    public final int w(final View view, int n, final int[] array, int o) {
        final e e = (e)view.getLayoutParams();
        final int b = e.leftMargin - array[0];
        n += Math.max(0, b);
        array[0] = Math.max(0, -b);
        o = this.o(view, o);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n, o, n + measuredWidth, view.getMeasuredHeight() + o);
        return n + (measuredWidth + e.rightMargin);
    }
    
    public final int x(final View view, int n, final int[] array, int o) {
        final e e = (e)view.getLayoutParams();
        final int b = e.rightMargin - array[1];
        n -= Math.max(0, b);
        array[1] = Math.max(0, -b);
        o = this.o(view, o);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, o, n, view.getMeasuredHeight() + o);
        return n - (measuredWidth + e.leftMargin);
    }
    
    public final int y(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int b = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int b2 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n5 = Math.max(0, b) + Math.max(0, b2);
        array[0] = Math.max(0, -b);
        array[1] = Math.max(0, -b2);
        view.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingLeft() + ((View)this).getPaddingRight() + n5 + n2, viewGroup$MarginLayoutParams.width), ViewGroup.getChildMeasureSpec(n3, ((View)this).getPaddingTop() + ((View)this).getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n4, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n5;
    }
    
    public final void z(final View view, int n, int childMeasureSpec, int mode, final int n2, final int b) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingLeft() + ((View)this).getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        childMeasureSpec = ViewGroup.getChildMeasureSpec(mode, ((View)this).getPaddingTop() + ((View)this).getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n2, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        n = childMeasureSpec;
        if (mode != 1073741824) {
            n = childMeasureSpec;
            if (b >= 0) {
                n = b;
                if (mode != 0) {
                    n = Math.min(View$MeasureSpec.getSize(childMeasureSpec), b);
                }
                n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, n);
    }
    
    public class d implements g
    {
        public androidx.appcompat.view.menu.d o;
        public androidx.appcompat.view.menu.e p;
        
        @Override
        public void b(final androidx.appcompat.view.menu.d d, final boolean b) {
        }
        
        @Override
        public void c(final Context context, final androidx.appcompat.view.menu.d o) {
            final androidx.appcompat.view.menu.d o2 = this.o;
            if (o2 != null) {
                final androidx.appcompat.view.menu.e p2 = this.p;
                if (p2 != null) {
                    o2.e(p2);
                }
            }
            this.o = o;
        }
        
        @Override
        public boolean e(final j j) {
            return false;
        }
        
        @Override
        public void f(final boolean b) {
            if (this.p != null) {
                final androidx.appcompat.view.menu.d o = this.o;
                if (o != null) {
                    for (int size = o.size(), i = 0; i < size; ++i) {
                        if (this.o.getItem(i) == this.p) {
                            return;
                        }
                    }
                }
                this.h(this.o, this.p);
            }
        }
        
        @Override
        public boolean g() {
            return false;
        }
        
        @Override
        public boolean h(final androidx.appcompat.view.menu.d d, final androidx.appcompat.view.menu.e e) {
            final View w = Toolbar.this.w;
            if (w instanceof b) {
                ((b)w).c();
            }
            final Toolbar q = Toolbar.this;
            q.removeView(q.w);
            final Toolbar q2 = Toolbar.this;
            q2.removeView((View)q2.v);
            final Toolbar q3 = Toolbar.this;
            q3.w = null;
            q3.a();
            this.p = null;
            ((View)Toolbar.this).requestLayout();
            e.q(false);
            return true;
        }
        
        @Override
        public boolean j(final androidx.appcompat.view.menu.d d, final androidx.appcompat.view.menu.e p2) {
            Toolbar.this.e();
            final ViewParent parent = ((View)Toolbar.this.v).getParent();
            final Toolbar q = Toolbar.this;
            if (parent != q) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView((View)q.v);
                }
                final Toolbar q2 = Toolbar.this;
                q2.addView((View)q2.v);
            }
            Toolbar.this.w = p2.getActionView();
            this.p = p2;
            final ViewParent parent2 = Toolbar.this.w.getParent();
            final Toolbar q3 = Toolbar.this;
            if (parent2 != q3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup)parent2).removeView(q3.w);
                }
                final e k = Toolbar.this.k();
                final Toolbar q4 = Toolbar.this;
                k.a = ((q4.B & 0x70) | 0x800003);
                k.b = 2;
                q4.w.setLayoutParams((ViewGroup$LayoutParams)k);
                final Toolbar q5 = Toolbar.this;
                q5.addView(q5.w);
            }
            Toolbar.this.B();
            ((View)Toolbar.this).requestLayout();
            p2.q(true);
            final View w = Toolbar.this.w;
            if (w instanceof b) {
                ((b)w).b();
            }
            return true;
        }
    }
    
    public static class e extends a
    {
        public int b;
        
        public e(final int n, final int n2) {
            super(n, n2);
            this.b = 0;
            super.a = 8388627;
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = 0;
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = 0;
        }
        
        public e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
            this.b = 0;
            this.a(viewGroup$MarginLayoutParams);
        }
        
        public e(final e e) {
            super(e);
            this.b = 0;
            this.b = e.b;
        }
        
        public e(final a a) {
            super(a);
            this.b = 0;
        }
        
        public void a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super.leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            super.topMargin = viewGroup$MarginLayoutParams.topMargin;
            super.rightMargin = viewGroup$MarginLayoutParams.rightMargin;
            super.bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
        }
    }
    
    public interface f
    {
    }
    
    public static class g extends a
    {
        public static final Parcelable$Creator<g> CREATOR;
        public int q;
        public boolean r;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator() {
                public g a(final Parcel parcel) {
                    return new g(parcel, null);
                }
                
                public g b(final Parcel parcel, final ClassLoader classLoader) {
                    return new g(parcel, classLoader);
                }
                
                public g[] c(final int n) {
                    return new g[n];
                }
            };
        }
        
        public g(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = parcel.readInt();
            this.r = (parcel.readInt() != 0);
        }
        
        public g(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
    }
}
