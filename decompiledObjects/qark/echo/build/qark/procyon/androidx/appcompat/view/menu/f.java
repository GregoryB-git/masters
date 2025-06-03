// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.graphics.Rect;
import I.e;
import I.s;
import android.view.Display;
import e.c;
import android.graphics.Point;
import android.view.WindowManager;
import android.widget.PopupWindow$OnDismissListener;
import k.b;
import android.view.View;
import android.content.Context;

public class f
{
    public final Context a;
    public final d b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public g.a i;
    public b j;
    public PopupWindow$OnDismissListener k;
    public final PopupWindow$OnDismissListener l;
    
    public f(final Context context, final d d, final View view, final boolean b, final int n) {
        this(context, d, view, b, n, 0);
    }
    
    public f(final Context a, final d b, final View f, final boolean c, final int d, final int e) {
        this.g = 8388611;
        this.l = (PopupWindow$OnDismissListener)new PopupWindow$OnDismissListener() {
            public void onDismiss() {
                androidx.appcompat.view.menu.f.this.e();
            }
        };
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final b a() {
        final Display defaultDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        final Point point = new Point();
        defaultDisplay.getRealSize(point);
        g g;
        if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(e.c.a)) {
            g = new androidx.appcompat.view.menu.b(this.a, this.f, this.d, this.e, this.c);
        }
        else {
            g = new i(this.a, this.b, this.f, this.d, this.e, this.c);
        }
        ((b)g).l(this.b);
        ((b)g).u(this.l);
        ((b)g).p(this.f);
        g.k(this.i);
        ((b)g).r(this.h);
        ((b)g).s(this.g);
        return (b)g;
    }
    
    public void b() {
        if (this.d()) {
            this.j.dismiss();
        }
    }
    
    public b c() {
        if (this.j == null) {
            this.j = this.a();
        }
        return this.j;
    }
    
    public boolean d() {
        final b j = this.j;
        return j != null && j.i();
    }
    
    public void e() {
        this.j = null;
        final PopupWindow$OnDismissListener k = this.k;
        if (k != null) {
            k.onDismiss();
        }
    }
    
    public void f(final View f) {
        this.f = f;
    }
    
    public void g(final boolean h) {
        this.h = h;
        final b j = this.j;
        if (j != null) {
            j.r(h);
        }
    }
    
    public void h(final int g) {
        this.g = g;
    }
    
    public void i(final PopupWindow$OnDismissListener k) {
        this.k = k;
    }
    
    public void j(final g.a i) {
        this.i = i;
        final b j = this.j;
        if (j != null) {
            j.k(i);
        }
    }
    
    public void k() {
        if (this.m()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    public final void l(int n, final int n2, final boolean b, final boolean b2) {
        final b c = this.c();
        c.v(b2);
        if (b) {
            int n3 = n;
            if ((I.e.a(this.g, s.m(this.f)) & 0x7) == 0x5) {
                n3 = n - this.f.getWidth();
            }
            c.t(n3);
            c.w(n2);
            n = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            c.q(new Rect(n3 - n, n2 - n, n3 + n, n2 + n));
        }
        c.a();
    }
    
    public boolean m() {
        if (this.d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.l(0, 0, false, false);
        return true;
    }
    
    public boolean n(final int n, final int n2) {
        if (this.d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        this.l(n, n2, true, true);
        return true;
    }
}
