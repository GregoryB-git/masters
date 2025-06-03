// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import e.i;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import I.s;
import android.graphics.drawable.Drawable;
import android.view.View;

public class d
{
    public final View a;
    public final e b;
    public int c;
    public V d;
    public V e;
    public V f;
    
    public d(final View a) {
        this.c = -1;
        this.a = a;
        this.b = l.e.b();
    }
    
    public final boolean a(final Drawable drawable) {
        if (this.f == null) {
            this.f = new V();
        }
        final V f = this.f;
        f.a();
        final ColorStateList j = s.j(this.a);
        if (j != null) {
            f.d = true;
            f.a = j;
        }
        final PorterDuff$Mode k = s.k(this.a);
        if (k != null) {
            f.c = true;
            f.b = k;
        }
        if (!f.d && !f.c) {
            return false;
        }
        l.e.g(drawable, f, this.a.getDrawableState());
        return true;
    }
    
    public void b() {
        final Drawable background = this.a.getBackground();
        if (background != null) {
            if (this.k() && this.a(background)) {
                return;
            }
            final V e = this.e;
            if (e != null) {
                l.e.g(background, e, this.a.getDrawableState());
                return;
            }
            final V d = this.d;
            if (d != null) {
                l.e.g(background, d, this.a.getDrawableState());
            }
        }
    }
    
    public ColorStateList c() {
        final V e = this.e;
        if (e != null) {
            return e.a;
        }
        return null;
    }
    
    public PorterDuff$Mode d() {
        final V e = this.e;
        if (e != null) {
            return e.b;
        }
        return null;
    }
    
    public void e(final AttributeSet set, final int n) {
        final X s = X.s(this.a.getContext(), set, i.O2, n, 0);
        final View a = this.a;
        I.s.B(a, a.getContext(), i.O2, set, s.o(), n, 0);
        while (true) {
            try {
                if (s.p(i.P2)) {
                    this.c = s.l(i.P2, -1);
                    final ColorStateList e = this.b.e(this.a.getContext(), this.c);
                    if (e != null) {
                        this.h(e);
                    }
                }
                if (s.p(i.Q2)) {
                    I.s.F(this.a, s.c(i.Q2));
                }
                if (s.p(i.R2)) {
                    I.s.G(this.a, B.c(s.i(i.R2, -1), null));
                }
                s.t();
                return;
                s.t();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void f(final Drawable drawable) {
        this.c = -1;
        this.h(null);
        this.b();
    }
    
    public void g(final int c) {
        this.c = c;
        final e b = this.b;
        ColorStateList e;
        if (b != null) {
            e = b.e(this.a.getContext(), c);
        }
        else {
            e = null;
        }
        this.h(e);
        this.b();
    }
    
    public void h(final ColorStateList a) {
        if (a != null) {
            if (this.d == null) {
                this.d = new V();
            }
            final V d = this.d;
            d.a = a;
            d.d = true;
        }
        else {
            this.d = null;
        }
        this.b();
    }
    
    public void i(final ColorStateList a) {
        if (this.e == null) {
            this.e = new V();
        }
        final V e = this.e;
        e.a = a;
        e.d = true;
        this.b();
    }
    
    public void j(final PorterDuff$Mode b) {
        if (this.e == null) {
            this.e = new V();
        }
        final V e = this.e;
        e.b = b;
        e.c = true;
        this.b();
    }
    
    public final boolean k() {
        return this.d != null;
    }
}
