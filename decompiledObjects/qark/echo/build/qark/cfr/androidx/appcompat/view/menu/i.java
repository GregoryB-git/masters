/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.appcompat.view.menu;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import k.b;
import l.L;

public final class i
extends b
implements PopupWindow.OnDismissListener,
AdapterView.OnItemClickListener,
g,
View.OnKeyListener {
    public static final int J = e.f.j;
    public View A;
    public View B;
    public g.a C;
    public ViewTreeObserver D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public final Context p;
    public final d q;
    public final c r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final L w;
    public final ViewTreeObserver.OnGlobalLayoutListener x;
    public final View.OnAttachStateChangeListener y;
    public PopupWindow.OnDismissListener z;

    public i(Context context, d d8, View view, int n8, int n9, boolean bl) {
        this.x = new ViewTreeObserver.OnGlobalLayoutListener(){

            public void onGlobalLayout() {
                if (i.this.i() && !i.this.w.n()) {
                    View view = i.this.B;
                    if (view != null && view.isShown()) {
                        i.this.w.a();
                        return;
                    }
                    i.this.dismiss();
                }
            }
        };
        this.y = new View.OnAttachStateChangeListener(){

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                Object object = i.this.D;
                if (object != null) {
                    if (!object.isAlive()) {
                        i.this.D = view.getViewTreeObserver();
                    }
                    object = i.this;
                    object.D.removeGlobalOnLayoutListener(object.x);
                }
                view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
        };
        this.H = 0;
        this.p = context;
        this.q = d8;
        this.s = bl;
        this.r = new c(d8, LayoutInflater.from((Context)context), bl, J);
        this.u = n8;
        this.v = n9;
        Resources resources = context.getResources();
        this.t = Math.max((int)(resources.getDisplayMetrics().widthPixels / 2), (int)resources.getDimensionPixelSize(e.c.b));
        this.A = view;
        this.w = new L(context, null, n8, n9);
        d8.b(this, context);
    }

    @Override
    public void a() {
        if (this.z()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public void b(d d8, boolean bl) {
        if (d8 != this.q) {
            return;
        }
        this.dismiss();
        g.a a8 = this.C;
        if (a8 != null) {
            a8.b(d8, bl);
        }
    }

    @Override
    public ListView d() {
        return this.w.d();
    }

    @Override
    public void dismiss() {
        if (this.i()) {
            this.w.dismiss();
        }
    }

    @Override
    public boolean e(j j8) {
        if (j8.hasVisibleItems()) {
            Object object = new f(this.p, j8, this.B, this.s, this.u, this.v);
            object.j(this.C);
            object.g(b.x(j8));
            object.i(this.z);
            this.z = null;
            this.q.d(false);
            int n8 = this.w.j();
            int n9 = this.w.l();
            int n10 = n8;
            if ((Gravity.getAbsoluteGravity((int)this.H, (int)s.m(this.A)) & 7) == 5) {
                n10 = n8 + this.A.getWidth();
            }
            if (object.n(n10, n9)) {
                object = this.C;
                if (object != null) {
                    object.c(j8);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void f(boolean bl) {
        this.F = false;
        c c8 = this.r;
        if (c8 != null) {
            c8.notifyDataSetChanged();
        }
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean i() {
        if (!this.E && this.w.i()) {
            return true;
        }
        return false;
    }

    @Override
    public void k(g.a a8) {
        this.C = a8;
    }

    @Override
    public void l(d d8) {
    }

    public void onDismiss() {
        this.E = true;
        this.q.close();
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.D = this.B.getViewTreeObserver();
            }
            this.D.removeGlobalOnLayoutListener(this.x);
            this.D = null;
        }
        this.B.removeOnAttachStateChangeListener(this.y);
        viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            viewTreeObserver.onDismiss();
        }
    }

    public boolean onKey(View view, int n8, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n8 == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override
    public void p(View view) {
        this.A = view;
    }

    @Override
    public void r(boolean bl) {
        this.r.d(bl);
    }

    @Override
    public void s(int n8) {
        this.H = n8;
    }

    @Override
    public void t(int n8) {
        this.w.v(n8);
    }

    @Override
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override
    public void v(boolean bl) {
        this.I = bl;
    }

    @Override
    public void w(int n8) {
        this.w.C(n8);
    }

    public final boolean z() {
        if (this.i()) {
            return true;
        }
        if (!this.E) {
            ViewTreeObserver viewTreeObserver;
            View view = this.A;
            if (view == null) {
                return false;
            }
            this.B = view;
            this.w.y(this);
            this.w.z(this);
            this.w.x(true);
            view = this.B;
            boolean bl = this.D == null;
            this.D = viewTreeObserver = view.getViewTreeObserver();
            if (bl) {
                viewTreeObserver.addOnGlobalLayoutListener(this.x);
            }
            view.addOnAttachStateChangeListener(this.y);
            this.w.q(view);
            this.w.t(this.H);
            if (!this.F) {
                this.G = b.o((ListAdapter)this.r, null, this.p, this.t);
                this.F = true;
            }
            this.w.s(this.G);
            this.w.w(2);
            this.w.u(this.n());
            this.w.a();
            view = this.w.d();
            view.setOnKeyListener((View.OnKeyListener)this);
            if (this.I && this.q.u() != null) {
                viewTreeObserver = (FrameLayout)LayoutInflater.from((Context)this.p).inflate(e.f.i, (ViewGroup)view, false);
                TextView textView = (TextView)viewTreeObserver.findViewById(16908310);
                if (textView != null) {
                    textView.setText(this.q.u());
                }
                viewTreeObserver.setEnabled(false);
                view.addHeaderView((View)viewTreeObserver, (Object)null, false);
            }
            this.w.p((ListAdapter)this.r);
            this.w.a();
            return true;
        }
        return false;
    }

}

