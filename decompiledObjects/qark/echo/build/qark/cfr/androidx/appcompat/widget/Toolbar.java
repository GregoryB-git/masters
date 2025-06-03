/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$ClassLoaderCreator
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package androidx.appcompat.widget;

import I.h;
import I.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.a;
import e.i;
import j.b;
import j.c;
import java.util.ArrayList;
import java.util.List;
import l.A;
import l.O;
import l.X;
import l.w;

public class Toolbar
extends ViewGroup {
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
    public int K = 8388627;
    public CharSequence L;
    public CharSequence M;
    public ColorStateList N;
    public ColorStateList O;
    public boolean P;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public final ArrayList S = new ArrayList();
    public final int[] T = new int[2];
    public final ActionMenuView.e U;
    public androidx.appcompat.widget.d V;
    public a W;
    public d a0;
    public g.a b0;
    public d.a c0;
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

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.s);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int n8) {
        int n9;
        super(context, attributeSet, n8);
        this.U = new ActionMenuView.e(){

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Toolbar.this.getClass();
                return false;
            }
        };
        this.e0 = new Runnable(){

            public void run() {
                Toolbar.this.H();
            }
        };
        X x8 = X.s(this.getContext(), attributeSet, i.j2, n8, 0);
        s.B((View)this, context, i.j2, attributeSet, x8.o(), n8, 0);
        this.z = x8.l(i.L2, 0);
        this.A = x8.l(i.C2, 0);
        this.K = x8.j(i.k2, this.K);
        this.B = x8.j(i.l2, 48);
        n8 = n9 = x8.d(i.F2, 0);
        if (x8.p(i.K2)) {
            n8 = x8.d(i.K2, n9);
        }
        this.G = n8;
        this.F = n8;
        this.E = n8;
        this.D = n8;
        n8 = x8.d(i.I2, -1);
        if (n8 >= 0) {
            this.D = n8;
        }
        if ((n8 = x8.d(i.H2, -1)) >= 0) {
            this.E = n8;
        }
        if ((n8 = x8.d(i.J2, -1)) >= 0) {
            this.F = n8;
        }
        if ((n8 = x8.d(i.G2, -1)) >= 0) {
            this.G = n8;
        }
        this.C = x8.e(i.w2, -1);
        n8 = x8.d(i.s2, Integer.MIN_VALUE);
        n9 = x8.d(i.o2, Integer.MIN_VALUE);
        int n10 = x8.e(i.q2, 0);
        int n11 = x8.e(i.r2, 0);
        this.f();
        this.H.e(n10, n11);
        if (n8 != Integer.MIN_VALUE || n9 != Integer.MIN_VALUE) {
            this.H.g(n8, n9);
        }
        this.I = x8.d(i.t2, Integer.MIN_VALUE);
        this.J = x8.d(i.p2, Integer.MIN_VALUE);
        this.t = x8.f(i.n2);
        this.u = x8.n(i.m2);
        context = x8.n(i.E2);
        if (!TextUtils.isEmpty((CharSequence)context)) {
            this.setTitle((CharSequence)context);
        }
        if (!TextUtils.isEmpty((CharSequence)(context = x8.n(i.B2)))) {
            this.setSubtitle((CharSequence)context);
        }
        this.x = this.getContext();
        this.setPopupTheme(x8.l(i.A2, 0));
        context = x8.f(i.z2);
        if (context != null) {
            this.setNavigationIcon((Drawable)context);
        }
        if (!TextUtils.isEmpty((CharSequence)(context = x8.n(i.y2)))) {
            this.setNavigationContentDescription((CharSequence)context);
        }
        if ((context = x8.f(i.u2)) != null) {
            this.setLogo((Drawable)context);
        }
        if (!TextUtils.isEmpty((CharSequence)(context = x8.n(i.v2)))) {
            this.setLogoDescription((CharSequence)context);
        }
        if (x8.p(i.M2)) {
            this.setTitleTextColor(x8.c(i.M2));
        }
        if (x8.p(i.D2)) {
            this.setSubtitleTextColor(x8.c(i.D2));
        }
        if (x8.p(i.x2)) {
            this.t(x8.l(i.x2, 0));
        }
        x8.t();
    }

    private MenuInflater getMenuInflater() {
        return new c(this.getContext());
    }

    public final void A() {
        this.removeCallbacks(this.e0);
        this.post(this.e0);
    }

    public void B() {
        for (int i8 = this.getChildCount() - 1; i8 >= 0; --i8) {
            View view = this.getChildAt(i8);
            if (((e)view.getLayoutParams()).b == 2 || view == this.o) continue;
            this.removeViewAt(i8);
            this.S.add((Object)view);
        }
    }

    public void C(int n8, int n9) {
        this.f();
        this.H.g(n8, n9);
    }

    public void D(Context context, int n8) {
        this.A = n8;
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextAppearance(context, n8);
        }
    }

    public void E(Context context, int n8) {
        this.z = n8;
        TextView textView = this.p;
        if (textView != null) {
            textView.setTextAppearance(context, n8);
        }
    }

    public final boolean F() {
        if (!this.d0) {
            return false;
        }
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if (!this.G(view) || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) continue;
            return false;
        }
        return true;
    }

    public final boolean G(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public boolean H() {
        ActionMenuView actionMenuView = this.o;
        if (actionMenuView != null && actionMenuView.K()) {
            return true;
        }
        return false;
    }

    public void a() {
        for (int i8 = this.S.size() - 1; i8 >= 0; --i8) {
            this.addView((View)this.S.get(i8));
        }
        this.S.clear();
    }

    public final void b(List list, int n8) {
        int n9 = s.m((View)this);
        int n10 = 0;
        n9 = n9 == 1 ? 1 : 0;
        int n11 = this.getChildCount();
        int n12 = I.e.a(n8, s.m((View)this));
        list.clear();
        if (n9 != 0) {
            for (n8 = n11 - 1; n8 >= 0; --n8) {
                View view = this.getChildAt(n8);
                e e8 = (e)view.getLayoutParams();
                if (e8.b != 0 || !this.G(view) || this.n(e8.a) != n12) continue;
                list.add((Object)view);
            }
        } else {
            for (n8 = n10; n8 < n11; ++n8) {
                View view = this.getChildAt(n8);
                e e9 = (e)view.getLayoutParams();
                if (e9.b != 0 || !this.G(view) || this.n(e9.a) != n12) continue;
                list.add((Object)view);
            }
        }
    }

    public final void c(View view, boolean bl) {
        Object object = view.getLayoutParams();
        object = object == null ? this.k() : (!this.checkLayoutParams((ViewGroup.LayoutParams)object) ? this.m((ViewGroup.LayoutParams)object) : (e)((Object)object));
        object.b = 1;
        if (bl && this.w != null) {
            view.setLayoutParams((ViewGroup.LayoutParams)object);
            this.S.add((Object)view);
            return;
        }
        this.addView(view, (ViewGroup.LayoutParams)object);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && layoutParams instanceof e) {
            return true;
        }
        return false;
    }

    public void d() {
        Object object = this.a0;
        object = object == null ? null : object.p;
        if (object != null) {
            object.collapseActionView();
        }
    }

    public void e() {
        if (this.v == null) {
            Object object = new l.g(this.getContext(), null, e.a.r);
            this.v = object;
            object.setImageDrawable(this.t);
            this.v.setContentDescription(this.u);
            object = this.k();
            object.a = this.B & 112 | 8388611;
            object.b = 2;
            this.v.setLayoutParams((ViewGroup.LayoutParams)object);
            this.v.setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
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
            this.s = new AppCompatImageView(this.getContext());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.v;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.v;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        O o8 = this.H;
        if (o8 != null) {
            return o8.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int n8 = this.J;
        if (n8 != Integer.MIN_VALUE) {
            return n8;
        }
        return this.getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        O o8 = this.H;
        if (o8 != null) {
            return o8.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        O o8 = this.H;
        if (o8 != null) {
            return o8.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        O o8 = this.H;
        if (o8 != null) {
            return o8.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int n8 = this.I;
        if (n8 != Integer.MIN_VALUE) {
            return n8;
        }
        return this.getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        Object object = this.o;
        if (object != null && (object = object.I()) != null && object.hasVisibleItems()) {
            return Math.max((int)this.getContentInsetEnd(), (int)Math.max((int)this.J, (int)0));
        }
        return this.getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (s.m((View)this) == 1) {
            return this.getCurrentContentInsetEnd();
        }
        return this.getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (s.m((View)this) == 1) {
            return this.getCurrentContentInsetStart();
        }
        return this.getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (this.getNavigationIcon() != null) {
            return Math.max((int)this.getContentInsetStart(), (int)Math.max((int)this.I, (int)0));
        }
        return this.getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.s;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.s;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        this.h();
        return this.o.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.r;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.r;
        if (imageButton != null) {
            return imageButton.getDrawable();
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
            androidx.appcompat.view.menu.d d8 = (androidx.appcompat.view.menu.d)this.o.getMenu();
            if (this.a0 == null) {
                this.a0 = new d();
            }
            this.o.setExpandedActionViewsExclusive(true);
            d8.b(this.a0, this.x);
        }
    }

    public final void i() {
        if (this.o == null) {
            Object object = new ActionMenuView(this.getContext());
            this.o = object;
            object.setPopupTheme(this.y);
            this.o.setOnMenuItemClickListener(this.U);
            this.o.J(this.b0, this.c0);
            object = this.k();
            object.a = this.B & 112 | 8388613;
            this.o.setLayoutParams((ViewGroup.LayoutParams)object);
            this.c((View)this.o, false);
        }
    }

    public final void j() {
        if (this.r == null) {
            this.r = new l.g(this.getContext(), null, e.a.r);
            e e8 = this.k();
            e8.a = this.B & 112 | 8388611;
            this.r.setLayoutParams((ViewGroup.LayoutParams)e8);
        }
    }

    public e k() {
        return new e(-2, -2);
    }

    public e l(AttributeSet attributeSet) {
        return new e(this.getContext(), attributeSet);
    }

    public e m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e)layoutParams);
        }
        if (layoutParams instanceof f.a) {
            return new e((f.a)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new e(layoutParams);
    }

    public final int n(int n8) {
        int n9 = s.m((View)this);
        int n10 = I.e.a(n8, n9) & 7;
        if (n10 != 1) {
            n8 = 3;
            if (n10 != 3 && n10 != 5) {
                if (n9 == 1) {
                    n8 = 5;
                }
                return n8;
            }
        }
        return n10;
    }

    public final int o(View view, int n8) {
        e e8 = (e)view.getLayoutParams();
        int n9 = view.getMeasuredHeight();
        n8 = n8 > 0 ? (n9 - n8) / 2 : 0;
        int n10 = this.p(e8.a);
        if (n10 != 48) {
            if (n10 != 80) {
                int n11 = this.getPaddingTop();
                int n12 = this.getPaddingBottom();
                int n13 = this.getHeight();
                n10 = (n13 - n11 - n12 - n9) / 2;
                if (n10 >= (n8 = e8.topMargin)) {
                    n9 = n13 - n12 - n9 - n10 - n11;
                    n12 = e8.bottomMargin;
                    n8 = n10;
                    if (n9 < n12) {
                        n8 = Math.max((int)0, (int)(n10 - (n12 - n9)));
                    }
                }
                return n11 + n8;
            }
            return this.getHeight() - this.getPaddingBottom() - n9 - e8.bottomMargin - n8;
        }
        return this.getPaddingTop() - n8;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.e0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 9) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean bl = super.onHoverEvent(motionEvent);
            if (n8 == 9 && !bl) {
                this.Q = true;
            }
        }
        if (n8 == 10 || n8 == 3) {
            this.Q = false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block43 : {
            block41 : {
                block42 : {
                    block39 : {
                        block40 : {
                            var8_6 = s.m((View)this) == 1 ? 1 : 0;
                            var10_7 = this.getWidth();
                            var13_8 = this.getHeight();
                            var6_9 = this.getPaddingLeft();
                            var11_10 = this.getPaddingRight();
                            var12_11 = this.getPaddingTop();
                            var14_12 = this.getPaddingBottom();
                            var9_13 = var10_7 - var11_10;
                            var20_14 = this.T;
                            var20_14[1] = 0;
                            var20_14[0] = 0;
                            var2_2 = s.n((View)this);
                            var5_5 = var2_2 >= 0 ? Math.min((int)var2_2, (int)(var5_5 - var3_3)) : 0;
                            if (!this.G((View)this.r)) break block39;
                            var18_15 = this.r;
                            if (var8_6 == 0) break block40;
                            var7_16 = this.x((View)var18_15, var9_13, var20_14, var5_5);
                            var4_4 = var6_9;
                            break block41;
                        }
                        var4_4 = this.w((View)var18_15, var6_9, var20_14, var5_5);
                        break block42;
                    }
                    var4_4 = var6_9;
                }
                var7_16 = var9_13;
            }
            var2_2 = var4_4;
            var3_3 = var7_16;
            if (this.G((View)this.v)) {
                var18_15 = this.v;
                if (var8_6 != 0) {
                    var3_3 = this.x((View)var18_15, var7_16, var20_14, var5_5);
                    var2_2 = var4_4;
                } else {
                    var2_2 = this.w((View)var18_15, var4_4, var20_14, var5_5);
                    var3_3 = var7_16;
                }
            }
            var7_16 = var2_2;
            var4_4 = var3_3;
            if (this.G((View)this.o)) {
                var18_15 = this.o;
                if (var8_6 != 0) {
                    var7_16 = this.w((View)var18_15, var2_2, var20_14, var5_5);
                    var4_4 = var3_3;
                } else {
                    var4_4 = this.x((View)var18_15, var3_3, var20_14, var5_5);
                    var7_16 = var2_2;
                }
            }
            var3_3 = this.getCurrentContentInsetLeft();
            var2_2 = this.getCurrentContentInsetRight();
            var20_14[0] = Math.max((int)0, (int)(var3_3 - var7_16));
            var20_14[1] = Math.max((int)0, (int)(var2_2 - (var9_13 - var4_4)));
            var3_3 = Math.max((int)var7_16, (int)var3_3);
            var4_4 = Math.min((int)var4_4, (int)(var9_13 - var2_2));
            var2_2 = var3_3;
            var7_16 = var4_4;
            if (this.G(this.w)) {
                var18_15 = this.w;
                if (var8_6 != 0) {
                    var7_16 = this.x((View)var18_15, var4_4, var20_14, var5_5);
                    var2_2 = var3_3;
                } else {
                    var2_2 = this.w((View)var18_15, var3_3, var20_14, var5_5);
                    var7_16 = var4_4;
                }
            }
            var4_4 = var2_2;
            var3_3 = var7_16;
            if (this.G((View)this.s)) {
                var18_15 = this.s;
                if (var8_6 != 0) {
                    var3_3 = this.x((View)var18_15, var7_16, var20_14, var5_5);
                    var4_4 = var2_2;
                } else {
                    var4_4 = this.w((View)var18_15, var2_2, var20_14, var5_5);
                    var3_3 = var7_16;
                }
            }
            var1_1 = this.G((View)this.p);
            var17_17 = this.G((View)this.q);
            if (var1_1) {
                var18_15 = (e)this.p.getLayoutParams();
                var2_2 = var18_15.topMargin + this.p.getMeasuredHeight() + var18_15.bottomMargin;
            } else {
                var2_2 = 0;
            }
            if (var17_17) {
                var18_15 = (e)this.q.getLayoutParams();
                var2_2 += var18_15.topMargin + this.q.getMeasuredHeight() + var18_15.bottomMargin;
            }
            if (var1_1 || var17_17) break block43;
            var2_2 = var4_4;
            ** GOTO lbl139
        }
        var18_15 = var1_1 != false ? this.p : this.q;
        var19_20 = var17_17 != false ? this.q : this.p;
        var18_15 = (e)var18_15.getLayoutParams();
        var19_20 = (e)var19_20.getLayoutParams();
        var7_16 = var1_1 != false && this.p.getMeasuredWidth() > 0 || var17_17 != false && this.q.getMeasuredWidth() > 0 ? 1 : 0;
        var9_13 = this.K & 112;
        if (var9_13 != 48) {
            if (var9_13 != 80) {
                var9_13 = (var13_8 - var12_11 - var14_12 - var2_2) / 2;
                var15_18 = var18_15.topMargin;
                var16_19 = this.F;
                if (var9_13 < var15_18 + var16_19) {
                    var2_2 = var15_18 + var16_19;
                } else {
                    var13_8 = var13_8 - var14_12 - var2_2 - var9_13 - var12_11;
                    var14_12 = var18_15.bottomMargin;
                    var15_18 = this.G;
                    var2_2 = var9_13;
                    if (var13_8 < var14_12 + var15_18) {
                        var2_2 = Math.max((int)0, (int)(var9_13 - (var19_20.bottomMargin + var15_18 - var13_8)));
                    }
                }
                var2_2 = var12_11 + var2_2;
            } else {
                var2_2 = var13_8 - var14_12 - var19_20.bottomMargin - this.G - var2_2;
            }
        } else {
            var2_2 = this.getPaddingTop() + var18_15.topMargin + this.F;
        }
        if (var8_6 != 0) {
            var8_6 = var7_16 != 0 ? this.D : 0;
            var3_3 -= Math.max((int)0, (int)(var8_6 -= var20_14[1]));
            var20_14[1] = Math.max((int)0, (int)(- var8_6));
            if (var1_1) {
                var18_15 = (e)this.p.getLayoutParams();
                var9_13 = var3_3 - this.p.getMeasuredWidth();
                var8_6 = this.p.getMeasuredHeight() + var2_2;
                this.p.layout(var9_13, var2_2, var3_3, var8_6);
                var2_2 = var9_13 - this.E;
                var9_13 = var8_6 + var18_15.bottomMargin;
            } else {
                var8_6 = var3_3;
                var9_13 = var2_2;
                var2_2 = var8_6;
            }
            if (var17_17) {
                var8_6 = var9_13 + ((e)this.q.getLayoutParams()).topMargin;
                var9_13 = this.q.getMeasuredWidth();
                var12_11 = this.q.getMeasuredHeight();
                this.q.layout(var3_3 - var9_13, var8_6, var3_3, var12_11 + var8_6);
                var8_6 = var3_3 - this.E;
            } else {
                var8_6 = var3_3;
            }
            if (var7_16 != 0) {
                var3_3 = Math.min((int)var2_2, (int)var8_6);
            }
            var2_2 = var4_4;
lbl139: // 2 sources:
            var4_4 = var3_3;
        } else {
            var8_6 = var7_16 != 0 ? this.D : 0;
            var4_4 += Math.max((int)0, (int)(var8_6 -= var20_14[0]));
            var20_14[0] = Math.max((int)0, (int)(- var8_6));
            if (var1_1) {
                var18_15 = (e)this.p.getLayoutParams();
                var8_6 = this.p.getMeasuredWidth() + var4_4;
                var9_13 = this.p.getMeasuredHeight() + var2_2;
                this.p.layout(var4_4, var2_2, var8_6, var9_13);
                var8_6 += this.E;
                var2_2 = var9_13 + var18_15.bottomMargin;
            } else {
                var8_6 = var4_4;
            }
            if (var17_17) {
                var9_13 = this.q.getMeasuredWidth() + var4_4;
                var12_11 = this.q.getMeasuredHeight();
                this.q.layout(var4_4, var2_2, var9_13, var12_11 + (var2_2 += ((e)this.q.getLayoutParams()).topMargin));
                var9_13 += this.E;
            } else {
                var9_13 = var4_4;
            }
            var2_2 = var4_4;
            var4_4 = var3_3;
            if (var7_16 != 0) {
                var2_2 = Math.max((int)var8_6, (int)var9_13);
                var4_4 = var3_3;
            }
        }
        var7_16 = var6_9;
        var6_9 = 0;
        this.b((List)this.R, 3);
        var8_6 = this.R.size();
        for (var3_3 = 0; var3_3 < var8_6; ++var3_3) {
            var2_2 = this.w((View)this.R.get(var3_3), var2_2, var20_14, var5_5);
        }
        this.b((List)this.R, 5);
        var8_6 = this.R.size();
        for (var3_3 = 0; var3_3 < var8_6; ++var3_3) {
            var4_4 = this.x((View)this.R.get(var3_3), var4_4, var20_14, var5_5);
        }
        this.b((List)this.R, 1);
        var8_6 = this.s((List)this.R, var20_14);
        var3_3 = var7_16 + (var10_7 - var7_16 - var11_10) / 2 - var8_6 / 2;
        var7_16 = var8_6 + var3_3;
        if (var3_3 >= var2_2) {
            var2_2 = var7_16 > var4_4 ? var3_3 - (var7_16 - var4_4) : var3_3;
        }
        var4_4 = this.R.size();
        var3_3 = var2_2;
        var2_2 = var6_9;
        do {
            if (var2_2 >= var4_4) {
                this.R.clear();
                return;
            }
            var3_3 = this.w((View)this.R.get(var2_2), var3_3, var20_14, var5_5);
            ++var2_2;
        } while (true);
    }

    public void onMeasure(int n8, int n9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof g)) {
            super.onRestoreInstanceState((Parcelable)object);
            return;
        }
        g g8 = (g)object;
        super.onRestoreInstanceState(g8.a());
        object = this.o;
        object = object != null ? object.I() : null;
        int n8 = g8.q;
        if (n8 != 0 && this.a0 != null && object != null && (object = object.findItem(n8)) != null) {
            object.expandActionView();
        }
        if (g8.r) {
            this.A();
        }
    }

    public void onRtlPropertiesChanged(int n8) {
        super.onRtlPropertiesChanged(n8);
        this.f();
        O o8 = this.H;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        o8.f(bl);
    }

    public Parcelable onSaveInstanceState() {
        g g8 = new g(super.onSaveInstanceState());
        Object object = this.a0;
        if (object != null && (object = object.p) != null) {
            g8.q = object.getItemId();
        }
        g8.r = this.v();
        return g8;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 0) {
            this.P = false;
        }
        if (!this.P) {
            boolean bl = super.onTouchEvent(motionEvent);
            if (n8 == 0 && !bl) {
                this.P = true;
            }
        }
        if (n8 == 1 || n8 == 3) {
            this.P = false;
        }
        return true;
    }

    public final int p(int n8) {
        int n9;
        n8 = n9 = n8 & 112;
        if (n9 != 16) {
            n8 = n9;
            if (n9 != 48) {
                n8 = n9;
                if (n9 != 80) {
                    n8 = this.K & 112;
                }
            }
        }
        return n8;
    }

    public final int q(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return h.b((ViewGroup.MarginLayoutParams)view) + h.a((ViewGroup.MarginLayoutParams)view);
    }

    public final int r(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return view.topMargin + view.bottomMargin;
    }

    public final int s(List list, int[] view) {
        int n8;
        int n9 = view[0];
        int n10 = view[1];
        int n11 = list.size();
        int n12 = n8 = 0;
        while (n8 < n11) {
            view = (View)list.get(n8);
            e e8 = (e)view.getLayoutParams();
            n9 = e8.leftMargin - n9;
            n10 = e8.rightMargin - n10;
            int n13 = Math.max((int)0, (int)n9);
            int n14 = Math.max((int)0, (int)n10);
            n9 = Math.max((int)0, (int)(- n9));
            n10 = Math.max((int)0, (int)(- n10));
            n12 += n13 + view.getMeasuredWidth() + n14;
            ++n8;
        }
        return n12;
    }

    public void setCollapseContentDescription(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getContext().getText(n8) : null;
        this.setCollapseContentDescription(charSequence);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        ImageButton imageButton;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.e();
        }
        if ((imageButton = this.v) != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int n8) {
        this.setCollapseIcon(g.a.b(this.getContext(), n8));
    }

    public void setCollapseIcon(Drawable drawable2) {
        if (drawable2 != null) {
            this.e();
            this.v.setImageDrawable(drawable2);
            return;
        }
        drawable2 = this.v;
        if (drawable2 != null) {
            drawable2.setImageDrawable(this.t);
        }
    }

    public void setCollapsible(boolean bl) {
        this.d0 = bl;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = Integer.MIN_VALUE;
        }
        if (n9 != this.J) {
            this.J = n9;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = Integer.MIN_VALUE;
        }
        if (n9 != this.I) {
            this.I = n9;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setLogo(int n8) {
        this.setLogo(g.a.b(this.getContext(), n8));
    }

    public void setLogo(Drawable drawable2) {
        ImageView imageView;
        if (drawable2 != null) {
            this.g();
            if (!this.u((View)this.s)) {
                this.c((View)this.s, true);
            }
        } else {
            imageView = this.s;
            if (imageView != null && this.u((View)imageView)) {
                this.removeView((View)this.s);
                this.S.remove((Object)this.s);
            }
        }
        if ((imageView = this.s) != null) {
            imageView.setImageDrawable(drawable2);
        }
    }

    public void setLogoDescription(int n8) {
        this.setLogoDescription(this.getContext().getText(n8));
    }

    public void setLogoDescription(CharSequence charSequence) {
        ImageView imageView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.g();
        }
        if ((imageView = this.s) != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getContext().getText(n8) : null;
        this.setNavigationContentDescription(charSequence);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        ImageButton imageButton;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.j();
        }
        if ((imageButton = this.r) != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int n8) {
        this.setNavigationIcon(g.a.b(this.getContext(), n8));
    }

    public void setNavigationIcon(Drawable drawable2) {
        ImageButton imageButton;
        if (drawable2 != null) {
            this.j();
            if (!this.u((View)this.r)) {
                this.c((View)this.r, true);
            }
        } else {
            imageButton = this.r;
            if (imageButton != null && this.u((View)imageButton)) {
                this.removeView((View)this.r);
                this.S.remove((Object)this.r);
            }
        }
        if ((imageButton = this.r) != null) {
            imageButton.setImageDrawable(drawable2);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.j();
        this.r.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f f8) {
    }

    public void setOverflowIcon(Drawable drawable2) {
        this.h();
        this.o.setOverflowIcon(drawable2);
    }

    public void setPopupTheme(int n8) {
        if (this.y != n8) {
            this.y = n8;
            if (n8 == 0) {
                this.x = this.getContext();
                return;
            }
            this.x = new ContextThemeWrapper(this.getContext(), n8);
        }
    }

    public void setSubtitle(int n8) {
        this.setSubtitle(this.getContext().getText(n8));
    }

    public void setSubtitle(CharSequence charSequence) {
        TextView textView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.q == null) {
                textView = this.getContext();
                w w8 = new w((Context)textView);
                this.q = w8;
                w8.setSingleLine();
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                int n8 = this.A;
                if (n8 != 0) {
                    this.q.setTextAppearance((Context)textView, n8);
                }
                if ((textView = this.O) != null) {
                    this.q.setTextColor((ColorStateList)textView);
                }
            }
            if (!this.u((View)this.q)) {
                this.c((View)this.q, true);
            }
        } else {
            textView = this.q;
            if (textView != null && this.u((View)textView)) {
                this.removeView((View)this.q);
                this.S.remove((Object)this.q);
            }
        }
        if ((textView = this.q) != null) {
            textView.setText(charSequence);
        }
        this.M = charSequence;
    }

    public void setSubtitleTextColor(int n8) {
        this.setSubtitleTextColor(ColorStateList.valueOf((int)n8));
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.O = colorStateList;
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int n8) {
        this.setTitle(this.getContext().getText(n8));
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.p == null) {
                textView = this.getContext();
                w w8 = new w((Context)textView);
                this.p = w8;
                w8.setSingleLine();
                this.p.setEllipsize(TextUtils.TruncateAt.END);
                int n8 = this.z;
                if (n8 != 0) {
                    this.p.setTextAppearance((Context)textView, n8);
                }
                if ((textView = this.N) != null) {
                    this.p.setTextColor((ColorStateList)textView);
                }
            }
            if (!this.u((View)this.p)) {
                this.c((View)this.p, true);
            }
        } else {
            textView = this.p;
            if (textView != null && this.u((View)textView)) {
                this.removeView((View)this.p);
                this.S.remove((Object)this.p);
            }
        }
        if ((textView = this.p) != null) {
            textView.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setTitleMarginBottom(int n8) {
        this.G = n8;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int n8) {
        this.E = n8;
        this.requestLayout();
    }

    public void setTitleMarginStart(int n8) {
        this.D = n8;
        this.requestLayout();
    }

    public void setTitleMarginTop(int n8) {
        this.F = n8;
        this.requestLayout();
    }

    public void setTitleTextColor(int n8) {
        this.setTitleTextColor(ColorStateList.valueOf((int)n8));
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.N = colorStateList;
        TextView textView = this.p;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void t(int n8) {
        this.getMenuInflater().inflate(n8, this.getMenu());
    }

    public final boolean u(View view) {
        if (view.getParent() != this && !this.S.contains((Object)view)) {
            return false;
        }
        return true;
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.o;
        if (actionMenuView != null && actionMenuView.F()) {
            return true;
        }
        return false;
    }

    public final int w(View view, int n8, int[] arrn, int n9) {
        e e8 = (e)view.getLayoutParams();
        int n10 = e8.leftMargin - arrn[0];
        arrn[0] = Math.max((int)0, (int)(- n10));
        n9 = this.o(view, n9);
        n10 = view.getMeasuredWidth();
        view.layout(n8, n9, (n8 += Math.max((int)0, (int)n10)) + n10, view.getMeasuredHeight() + n9);
        return n8 + (n10 + e8.rightMargin);
    }

    public final int x(View view, int n8, int[] arrn, int n9) {
        e e8 = (e)view.getLayoutParams();
        int n10 = e8.rightMargin - arrn[1];
        arrn[1] = Math.max((int)0, (int)(- n10));
        n9 = this.o(view, n9);
        n10 = view.getMeasuredWidth();
        view.layout(n8 - n10, n9, n8 -= Math.max((int)0, (int)n10), view.getMeasuredHeight() + n9);
        return n8 - (n10 + e8.leftMargin);
    }

    public final int y(View view, int n8, int n9, int n10, int n11, int[] arrn) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n12 = marginLayoutParams.leftMargin - arrn[0];
        int n13 = marginLayoutParams.rightMargin - arrn[1];
        int n14 = Math.max((int)0, (int)n12) + Math.max((int)0, (int)n13);
        arrn[0] = Math.max((int)0, (int)(- n12));
        arrn[1] = Math.max((int)0, (int)(- n13));
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + n14 + n9), (int)marginLayoutParams.width), ViewGroup.getChildMeasureSpec((int)n10, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n11), (int)marginLayoutParams.height));
        return view.getMeasuredWidth() + n14;
    }

    public final void z(View view, int n8, int n9, int n10, int n11, int n12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n13 = ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n9), (int)marginLayoutParams.width);
        n9 = ViewGroup.getChildMeasureSpec((int)n10, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n11), (int)marginLayoutParams.height);
        n10 = View.MeasureSpec.getMode((int)n9);
        n8 = n9;
        if (n10 != 1073741824) {
            n8 = n9;
            if (n12 >= 0) {
                n8 = n12;
                if (n10 != 0) {
                    n8 = Math.min((int)View.MeasureSpec.getSize((int)n9), (int)n12);
                }
                n8 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)1073741824);
            }
        }
        view.measure(n13, n8);
    }

    public class d
    implements androidx.appcompat.view.menu.g {
        public androidx.appcompat.view.menu.d o;
        public androidx.appcompat.view.menu.e p;

        @Override
        public void b(androidx.appcompat.view.menu.d d8, boolean bl) {
        }

        @Override
        public void c(Context object, androidx.appcompat.view.menu.d d8) {
            androidx.appcompat.view.menu.e e8;
            object = this.o;
            if (object != null && (e8 = this.p) != null) {
                object.e(e8);
            }
            this.o = d8;
        }

        @Override
        public boolean e(j j8) {
            return false;
        }

        @Override
        public void f(boolean bl) {
            if (this.p != null) {
                androidx.appcompat.view.menu.d d8 = this.o;
                if (d8 != null) {
                    int n8 = d8.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        if (this.o.getItem(i8) != this.p) continue;
                        return;
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
        public boolean h(androidx.appcompat.view.menu.d object, androidx.appcompat.view.menu.e e8) {
            object = Toolbar.this.w;
            if (object instanceof b) {
                ((b)object).c();
            }
            object = Toolbar.this;
            object.removeView(object.w);
            object = Toolbar.this;
            object.removeView((View)object.v);
            object = Toolbar.this;
            object.w = null;
            object.a();
            this.p = null;
            Toolbar.this.requestLayout();
            e8.q(false);
            return true;
        }

        @Override
        public boolean j(androidx.appcompat.view.menu.d object, androidx.appcompat.view.menu.e e8) {
            Toolbar.this.e();
            object = Toolbar.this.v.getParent();
            Toolbar toolbar = Toolbar.this;
            if (object != toolbar) {
                if (object instanceof ViewGroup) {
                    ((ViewGroup)object).removeView((View)toolbar.v);
                }
                object = Toolbar.this;
                object.addView((View)object.v);
            }
            Toolbar.this.w = e8.getActionView();
            this.p = e8;
            object = Toolbar.this.w.getParent();
            if (object != (toolbar = Toolbar.this)) {
                if (object instanceof ViewGroup) {
                    ((ViewGroup)object).removeView(toolbar.w);
                }
                object = Toolbar.this.k();
                toolbar = Toolbar.this;
                object.a = toolbar.B & 112 | 8388611;
                object.b = 2;
                toolbar.w.setLayoutParams((ViewGroup.LayoutParams)object);
                object = Toolbar.this;
                object.addView(object.w);
            }
            Toolbar.this.B();
            Toolbar.this.requestLayout();
            e8.q(true);
            object = Toolbar.this.w;
            if (object instanceof b) {
                ((b)object).b();
            }
            return true;
        }
    }

    public static class e
    extends f.a {
        public int b = 0;

        public e(int n8, int n9) {
            super(n8, n9);
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams)marginLayoutParams);
            this.a(marginLayoutParams);
        }

        public e(e e8) {
            super(e8);
            this.b = e8.b;
        }

        public e(f.a a8) {
            super(a8);
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static interface f {
    }

    public static class g
    extends N.a {
        public static final Parcelable.Creator<g> CREATOR = new Parcelable.ClassLoaderCreator(){

            public g a(Parcel parcel) {
                return new g(parcel, null);
            }

            public g b(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public g[] c(int n8) {
                return new g[n8];
            }
        };
        public int q;
        public boolean r;

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = parcel.readInt();
            boolean bl = parcel.readInt() != 0;
            this.r = bl;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

    }

}

