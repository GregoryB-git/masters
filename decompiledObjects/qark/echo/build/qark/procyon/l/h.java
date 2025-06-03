// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import g.a;
import android.view.View;
import I.s;
import e.i;
import android.util.AttributeSet;
import android.graphics.drawable.RippleDrawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import L.d;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class h
{
    public final ImageView a;
    public V b;
    public V c;
    public V d;
    
    public h(final ImageView a) {
        this.a = a;
    }
    
    public final boolean a(final Drawable drawable) {
        if (this.d == null) {
            this.d = new V();
        }
        final V d = this.d;
        d.a();
        final ColorStateList a = L.d.a(this.a);
        if (a != null) {
            d.d = true;
            d.a = a;
        }
        final PorterDuff$Mode b = L.d.b(this.a);
        if (b != null) {
            d.c = true;
            d.b = b;
        }
        if (!d.d && !d.c) {
            return false;
        }
        e.g(drawable, d, ((View)this.a).getDrawableState());
        return true;
    }
    
    public void b() {
        final Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            B.b(drawable);
        }
        if (drawable != null) {
            if (this.j() && this.a(drawable)) {
                return;
            }
            final V c = this.c;
            if (c != null) {
                e.g(drawable, c, ((View)this.a).getDrawableState());
                return;
            }
            final V b = this.b;
            if (b != null) {
                e.g(drawable, b, ((View)this.a).getDrawableState());
            }
        }
    }
    
    public ColorStateList c() {
        final V c = this.c;
        if (c != null) {
            return c.a;
        }
        return null;
    }
    
    public PorterDuff$Mode d() {
        final V c = this.c;
        if (c != null) {
            return c.b;
        }
        return null;
    }
    
    public boolean e() {
        return !(((View)this.a).getBackground() instanceof RippleDrawable);
    }
    
    public void f(final AttributeSet set, int l) {
        final X s = X.s(((View)this.a).getContext(), set, i.H, l, 0);
        final ImageView a = this.a;
        I.s.B((View)a, ((View)a).getContext(), i.H, set, s.o(), l, 0);
        while (true) {
            try {
                Drawable drawable2;
                final Drawable drawable = drawable2 = this.a.getDrawable();
                if (drawable == null) {
                    l = s.l(i.I, -1);
                    drawable2 = drawable;
                    if (l != -1) {
                        final Drawable b = g.a.b(((View)this.a).getContext(), l);
                        if ((drawable2 = b) != null) {
                            this.a.setImageDrawable(b);
                            drawable2 = b;
                        }
                    }
                }
                if (drawable2 != null) {
                    B.b(drawable2);
                }
                if (s.p(i.J)) {
                    L.d.c(this.a, s.c(i.J));
                }
                if (s.p(i.K)) {
                    L.d.d(this.a, B.c(s.i(i.K, -1), null));
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
    
    public void g(final int n) {
        if (n != 0) {
            final Drawable b = g.a.b(((View)this.a).getContext(), n);
            if (b != null) {
                B.b(b);
            }
            this.a.setImageDrawable(b);
        }
        else {
            this.a.setImageDrawable((Drawable)null);
        }
        this.b();
    }
    
    public void h(final ColorStateList a) {
        if (this.c == null) {
            this.c = new V();
        }
        final V c = this.c;
        c.a = a;
        c.d = true;
        this.b();
    }
    
    public void i(final PorterDuff$Mode b) {
        if (this.c == null) {
            this.c = new V();
        }
        final V c = this.c;
        c.b = b;
        c.c = true;
        this.b();
    }
    
    public final boolean j() {
        return this.b != null;
    }
}
