/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.SparseBooleanArray
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import l.E;
import l.Z;

public class a
extends androidx.appcompat.view.menu.a {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public final SparseBooleanArray K = new SparseBooleanArray();
    public e L;
    public a M;
    public c N;
    public b O;
    public final f P;
    public int Q;
    public d x;
    public Drawable y;
    public boolean z;

    public a(Context context) {
        super(context, e.f.c, e.f.b);
        this.P = new f();
    }

    public boolean A() {
        a a8 = this.M;
        if (a8 != null) {
            a8.b();
            return true;
        }
        return false;
    }

    public boolean B() {
        e e8 = this.L;
        if (e8 != null && e8.d()) {
            return true;
        }
        return false;
    }

    public void C(Configuration object) {
        if (!this.F) {
            this.E = j.a.a(this.p).c();
        }
        if ((object = this.q) != null) {
            object.G(true);
        }
    }

    public void D(boolean bl) {
        this.I = bl;
    }

    public void E(ActionMenuView actionMenuView) {
        this.w = actionMenuView;
        actionMenuView.E(this.q);
    }

    public void F(Drawable drawable2) {
        d d8 = this.x;
        if (d8 != null) {
            d8.setImageDrawable(drawable2);
            return;
        }
        this.z = true;
        this.y = drawable2;
    }

    public void G(boolean bl) {
        this.A = bl;
        this.B = true;
    }

    public boolean H() {
        Object object;
        if (this.A && !this.B() && (object = this.q) != null && this.w != null && this.N == null && !object.v().isEmpty()) {
            this.N = object = new c(new e(this.p, this.q, (View)this.x, true));
            ((View)this.w).post((Runnable)object);
            return true;
        }
        return false;
    }

    @Override
    public void b(androidx.appcompat.view.menu.d d8, boolean bl) {
        this.w();
        super.b(d8, bl);
    }

    @Override
    public void c(Context object, androidx.appcompat.view.menu.d d8) {
        super.c((Context)object, d8);
        d8 = object.getResources();
        object = j.a.a((Context)object);
        if (!this.B) {
            this.A = object.d();
        }
        if (!this.H) {
            this.C = object.b();
        }
        if (!this.F) {
            this.E = object.c();
        }
        int n8 = this.C;
        if (this.A) {
            if (this.x == null) {
                this.x = object = new d(this.o);
                if (this.z) {
                    object.setImageDrawable(this.y);
                    this.y = null;
                    this.z = false;
                }
                int n9 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                this.x.measure(n9, n9);
            }
            n8 -= this.x.getMeasuredWidth();
        } else {
            this.x = null;
        }
        this.D = n8;
        this.J = (int)(d8.getDisplayMetrics().density * 56.0f);
    }

    @Override
    public void d(androidx.appcompat.view.menu.e object, h.a a8) {
        a8.d((androidx.appcompat.view.menu.e)object, 0);
        object = (ActionMenuView)this.w;
        a8 = (ActionMenuItemView)a8;
        a8.setItemInvoker((d.b)object);
        if (this.O == null) {
            this.O = new b();
        }
        a8.setPopupCallback(this.O);
    }

    @Override
    public boolean e(j j8) {
        boolean bl = j8.hasVisibleItems();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        Object object = j8;
        while (object.W() != this.q) {
            object = (j)object.W();
        }
        if ((object = this.x(object.getItem())) == null) {
            return false;
        }
        this.Q = j8.getItem().getItemId();
        int n8 = j8.size();
        int n9 = 0;
        do {
            bl = bl2;
            if (n9 >= n8) break;
            MenuItem menuItem = j8.getItem(n9);
            if (menuItem.isVisible() && menuItem.getIcon() != null) {
                bl = true;
                break;
            }
            ++n9;
        } while (true);
        this.M = object = new a(this.p, j8, (View)object);
        object.g(bl);
        this.M.k();
        super.e(j8);
        return true;
    }

    @Override
    public void f(boolean bl) {
        int n8;
        super.f(bl);
        ((View)this.w).requestLayout();
        Object object = this.q;
        if (object != null) {
            object = object.r();
            int n9 = object.size();
            for (n8 = 0; n8 < n9; ++n8) {
                ((androidx.appcompat.view.menu.e)object.get(n8)).g();
            }
        }
        object = (object = this.q) != null ? object.v() : null;
        if (this.A && object != null && ((n8 = object.size()) == 1 ? ((androidx.appcompat.view.menu.e)object.get(0)).isActionViewExpanded() ^ true : n8 > 0)) {
            if (this.x == null) {
                this.x = new d(this.o);
            }
            if ((object = (ViewGroup)this.x.getParent()) != this.w) {
                if (object != null) {
                    object.removeView((View)this.x);
                }
                object = (ActionMenuView)this.w;
                object.addView((View)this.x, (ViewGroup.LayoutParams)object.C());
            }
        } else {
            h h8;
            object = this.x;
            if (object != null && (object = object.getParent()) == (h8 = this.w)) {
                ((ViewGroup)h8).removeView((View)this.x);
            }
        }
        ((ActionMenuView)this.w).setOverflowReserved(this.A);
    }

    @Override
    public boolean g() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public boolean l(ViewGroup viewGroup, int n8) {
        if (viewGroup.getChildAt(n8) == this.x) {
            return false;
        }
        return super.l(viewGroup, n8);
    }

    @Override
    public View n(androidx.appcompat.view.menu.e object, View view, ViewGroup viewGroup) {
        View view2 = object.getActionView();
        if (view2 == null || object.i()) {
            view2 = super.n((androidx.appcompat.view.menu.e)object, view, viewGroup);
        }
        int n8 = object.isActionViewExpanded() ? 8 : 0;
        view2.setVisibility(n8);
        object = (ActionMenuView)viewGroup;
        view = view2.getLayoutParams();
        if (!object.checkLayoutParams((ViewGroup.LayoutParams)view)) {
            view2.setLayoutParams((ViewGroup.LayoutParams)object.B((ViewGroup.LayoutParams)view));
        }
        return view2;
    }

    @Override
    public boolean o(int n8, androidx.appcompat.view.menu.e e8) {
        return e8.k();
    }

    public boolean w() {
        return this.z() | this.A();
    }

    public final View x(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup)this.w;
        if (viewGroup == null) {
            return null;
        }
        int n8 = viewGroup.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = viewGroup.getChildAt(i8);
            if (!(view instanceof h.a) || ((h.a)view).getItemData() != menuItem) continue;
            return view;
        }
        return null;
    }

    public Drawable y() {
        d d8 = this.x;
        if (d8 != null) {
            return d8.getDrawable();
        }
        if (this.z) {
            return this.y;
        }
        return null;
    }

    public boolean z() {
        h h8;
        Object object = this.N;
        if (object != null && (h8 = this.w) != null) {
            ((View)h8).removeCallbacks((Runnable)object);
            this.N = null;
            return true;
        }
        object = this.L;
        if (object != null) {
            object.b();
            return true;
        }
        return false;
    }

    public class a
    extends androidx.appcompat.view.menu.f {
        public a(Context object, j object2, View view) {
            super((Context)object, (androidx.appcompat.view.menu.d)object2, view, false, e.a.f);
            if (!((androidx.appcompat.view.menu.e)object2.getItem()).k()) {
                object = object2 = a.this.x;
                if (object2 == null) {
                    object = (View)a.this.w;
                }
                this.f((View)object);
            }
            this.j(a.this.P);
        }

        @Override
        public void e() {
            a a8 = a.this;
            a8.M = null;
            a8.Q = 0;
            super.e();
        }
    }

    public class b
    extends ActionMenuItemView.b {
        @Override
        public k.c a() {
            a a8 = a.this.M;
            if (a8 != null) {
                return a8.c();
            }
            return null;
        }
    }

    public class c
    implements Runnable {
        public e o;

        public c(e e8) {
            this.o = e8;
        }

        public void run() {
            View view;
            if (a.this.q != null) {
                a.this.q.c();
            }
            if ((view = (View)a.this.w) != null && view.getWindowToken() != null && this.o.m()) {
                a.this.L = this.o;
            }
            a.this.N = null;
        }
    }

    public class d
    extends AppCompatImageView
    implements ActionMenuView.a {
        public d(Context context) {
            super(context, null, e.a.e);
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            Z.a((View)this, this.getContentDescription());
            this.setOnTouchListener((View.OnTouchListener)new E((View)this, a.this){
                public final /* synthetic */ a x;
                {
                    this.x = a8;
                    super(view);
                }

                @Override
                public k.c b() {
                    e e8 = a.this.L;
                    if (e8 == null) {
                        return null;
                    }
                    return e8.c();
                }

                @Override
                public boolean c() {
                    a.this.H();
                    return true;
                }

                @Override
                public boolean d() {
                    a a8 = a.this;
                    if (a8.N != null) {
                        return false;
                    }
                    a8.z();
                    return true;
                }
            });
        }

        @Override
        public boolean b() {
            return false;
        }

        @Override
        public boolean c() {
            return false;
        }

        public boolean performClick() {
            if (ImageView.super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            a.this.H();
            return true;
        }

        public boolean setFrame(int n8, int n9, int n10, int n11) {
            boolean bl = ImageView.super.setFrame(n8, n9, n10, n11);
            Drawable drawable2 = this.getDrawable();
            Drawable drawable3 = this.getBackground();
            if (drawable2 != null && drawable3 != null) {
                int n12 = this.getWidth();
                n9 = this.getHeight();
                n8 = Math.max((int)n12, (int)n9) / 2;
                int n13 = this.getPaddingLeft();
                int n14 = this.getPaddingRight();
                n10 = this.getPaddingTop();
                n11 = this.getPaddingBottom();
                n12 = (n12 + (n13 - n14)) / 2;
                n9 = (n9 + (n10 - n11)) / 2;
                B.a.k(drawable3, n12 - n8, n9 - n8, n12 + n8, n9 + n8);
            }
            return bl;
        }

    }

    public class e
    extends androidx.appcompat.view.menu.f {
        public e(Context context, androidx.appcompat.view.menu.d d8, View view, boolean bl) {
            super(context, d8, view, bl, e.a.f);
            this.h(8388613);
            this.j(a.this.P);
        }

        @Override
        public void e() {
            if (a.this.q != null) {
                a.this.q.close();
            }
            a.this.L = null;
            super.e();
        }
    }

    public class f
    implements g.a {
        @Override
        public void b(androidx.appcompat.view.menu.d d8, boolean bl) {
            g.a a8;
            if (d8 instanceof j) {
                d8.z().d(false);
            }
            if ((a8 = a.this.m()) != null) {
                a8.b(d8, bl);
            }
        }

        @Override
        public boolean c(androidx.appcompat.view.menu.d d8) {
            Object object = a.this.q;
            boolean bl = false;
            if (d8 == object) {
                return false;
            }
            a.this.Q = ((j)d8).getItem().getItemId();
            object = a.this.m();
            if (object != null) {
                bl = object.c(d8);
            }
            return bl;
        }
    }

}

