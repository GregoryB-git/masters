// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.view.KeyEvent;
import android.view.Gravity;
import I.s;
import android.widget.ListView;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import e.f;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import l.L;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.PopupWindow$OnDismissListener;
import k.b;

public final class i extends b implements PopupWindow$OnDismissListener, AdapterView$OnItemClickListener, g, View$OnKeyListener
{
    public static final int J;
    public View A;
    public View B;
    public a C;
    public ViewTreeObserver D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public final Context p;
    public final d q;
    public final androidx.appcompat.view.menu.c r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final L w;
    public final ViewTreeObserver$OnGlobalLayoutListener x;
    public final View$OnAttachStateChangeListener y;
    public PopupWindow$OnDismissListener z;
    
    static {
        J = f.j;
    }
    
    public i(final Context p6, final d q, final View a, final int u, final int v, final boolean s) {
        this.x = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (i.this.i() && !i.this.w.n()) {
                    final View b = i.this.B;
                    if (b != null && b.isShown()) {
                        i.this.w.a();
                        return;
                    }
                    i.this.dismiss();
                }
            }
        };
        this.y = (View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(final View view) {
            }
            
            public void onViewDetachedFromWindow(final View view) {
                final ViewTreeObserver d = i.this.D;
                if (d != null) {
                    if (!d.isAlive()) {
                        i.this.D = view.getViewTreeObserver();
                    }
                    final i o = i.this;
                    o.D.removeGlobalOnLayoutListener(o.x);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        };
        this.H = 0;
        this.p = p6;
        this.q = q;
        this.s = s;
        this.r = new androidx.appcompat.view.menu.c(q, LayoutInflater.from(p6), s, i.J);
        this.u = u;
        this.v = v;
        final Resources resources = p6.getResources();
        this.t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.c.b));
        this.A = a;
        this.w = new L(p6, null, u, v);
        q.b(this, p6);
    }
    
    public void a() {
        if (this.z()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
    
    public void b(final d d, final boolean b) {
        if (d != this.q) {
            return;
        }
        this.dismiss();
        final a c = this.C;
        if (c != null) {
            c.b(d, b);
        }
    }
    
    public ListView d() {
        return this.w.d();
    }
    
    public void dismiss() {
        if (this.i()) {
            this.w.dismiss();
        }
    }
    
    public boolean e(final j j) {
        if (j.hasVisibleItems()) {
            final androidx.appcompat.view.menu.f f = new androidx.appcompat.view.menu.f(this.p, j, this.B, this.s, this.u, this.v);
            f.j(this.C);
            f.g(b.x(j));
            f.i(this.z);
            this.z = null;
            this.q.d(false);
            final int i = this.w.j();
            final int l = this.w.l();
            int n = i;
            if ((Gravity.getAbsoluteGravity(this.H, I.s.m(this.A)) & 0x7) == 0x5) {
                n = i + this.A.getWidth();
            }
            if (f.n(n, l)) {
                final a c = this.C;
                if (c != null) {
                    c.c(j);
                }
                return true;
            }
        }
        return false;
    }
    
    public void f(final boolean b) {
        this.F = false;
        final androidx.appcompat.view.menu.c r = this.r;
        if (r != null) {
            r.notifyDataSetChanged();
        }
    }
    
    public boolean g() {
        return false;
    }
    
    public boolean i() {
        return !this.E && this.w.i();
    }
    
    public void k(final a c) {
        this.C = c;
    }
    
    @Override
    public void l(final d d) {
    }
    
    public void onDismiss() {
        this.E = true;
        this.q.close();
        final ViewTreeObserver d = this.D;
        if (d != null) {
            if (!d.isAlive()) {
                this.D = this.B.getViewTreeObserver();
            }
            this.D.removeGlobalOnLayoutListener(this.x);
            this.D = null;
        }
        this.B.removeOnAttachStateChangeListener(this.y);
        final PopupWindow$OnDismissListener z = this.z;
        if (z != null) {
            z.onDismiss();
        }
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public void p(final View a) {
        this.A = a;
    }
    
    @Override
    public void r(final boolean b) {
        this.r.d(b);
    }
    
    @Override
    public void s(final int h) {
        this.H = h;
    }
    
    @Override
    public void t(final int n) {
        this.w.v(n);
    }
    
    @Override
    public void u(final PopupWindow$OnDismissListener z) {
        this.z = z;
    }
    
    @Override
    public void v(final boolean i) {
        this.I = i;
    }
    
    @Override
    public void w(final int n) {
        this.w.C(n);
    }
    
    public final boolean z() {
        if (this.i()) {
            return true;
        }
        if (this.E) {
            return false;
        }
        final View a = this.A;
        if (a == null) {
            return false;
        }
        this.B = a;
        this.w.y((PopupWindow$OnDismissListener)this);
        this.w.z((AdapterView$OnItemClickListener)this);
        this.w.x(true);
        final View b = this.B;
        final boolean b2 = this.D == null;
        final ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
        this.D = viewTreeObserver;
        if (b2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.x);
        }
        b.addOnAttachStateChangeListener(this.y);
        this.w.q(b);
        this.w.t(this.H);
        if (!this.F) {
            this.G = k.b.o((ListAdapter)this.r, null, this.p, this.t);
            this.F = true;
        }
        this.w.s(this.G);
        this.w.w(2);
        this.w.u(this.n());
        this.w.a();
        final ListView d = this.w.d();
        ((View)d).setOnKeyListener((View$OnKeyListener)this);
        if (this.I && this.q.u() != null) {
            final FrameLayout frameLayout = (FrameLayout)LayoutInflater.from(this.p).inflate(f.i, (ViewGroup)d, false);
            final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
            if (textView != null) {
                textView.setText(this.q.u());
            }
            ((View)frameLayout).setEnabled(false);
            d.addHeaderView((View)frameLayout, (Object)null, false);
        }
        this.w.p((ListAdapter)this.r);
        this.w.a();
        return true;
    }
}
