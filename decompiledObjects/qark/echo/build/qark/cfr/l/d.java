/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Throwable
 */
package l;

import I.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.i;
import l.B;
import l.V;
import l.X;
import l.e;

public class d {
    public final View a;
    public final e b;
    public int c = -1;
    public V d;
    public V e;
    public V f;

    public d(View view) {
        this.a = view;
        this.b = e.b();
    }

    public final boolean a(Drawable drawable2) {
        if (this.f == null) {
            this.f = new V();
        }
        V v8 = this.f;
        v8.a();
        ColorStateList colorStateList = s.j(this.a);
        if (colorStateList != null) {
            v8.d = true;
            v8.a = colorStateList;
        }
        if ((colorStateList = s.k(this.a)) != null) {
            v8.c = true;
            v8.b = colorStateList;
        }
        if (!v8.d && !v8.c) {
            return false;
        }
        e.g(drawable2, v8, this.a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable2 = this.a.getBackground();
        if (drawable2 != null) {
            if (this.k() && this.a(drawable2)) {
                return;
            }
            V v8 = this.e;
            if (v8 != null) {
                e.g(drawable2, v8, this.a.getDrawableState());
                return;
            }
            v8 = this.d;
            if (v8 != null) {
                e.g(drawable2, v8, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        V v8 = this.e;
        if (v8 != null) {
            return v8.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        V v8 = this.e;
        if (v8 != null) {
            return v8.b;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(AttributeSet attributeSet, int n8) {
        X x8;
        Throwable throwable2;
        block5 : {
            x8 = X.s(this.a.getContext(), attributeSet, i.O2, n8, 0);
            View view = this.a;
            s.B(view, view.getContext(), i.O2, attributeSet, x8.o(), n8, 0);
            try {
                if (x8.p(i.P2)) {
                    this.c = x8.l(i.P2, -1);
                    attributeSet = this.b.e(this.a.getContext(), this.c);
                    if (attributeSet != null) {
                        this.h((ColorStateList)attributeSet);
                    }
                }
                if (x8.p(i.Q2)) {
                    s.F(this.a, x8.c(i.Q2));
                }
                if (!x8.p(i.R2)) break block5;
                s.G(this.a, B.c(x8.i(i.R2, -1), null));
            }
            catch (Throwable throwable2) {}
        }
        x8.t();
        return;
        x8.t();
        throw throwable2;
    }

    public void f(Drawable drawable2) {
        this.c = -1;
        this.h(null);
        this.b();
    }

    public void g(int n8) {
        this.c = n8;
        e e8 = this.b;
        e8 = e8 != null ? e8.e(this.a.getContext(), n8) : null;
        this.h((ColorStateList)e8);
        this.b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new V();
            }
            V v8 = this.d;
            v8.a = colorStateList;
            v8.d = true;
        } else {
            this.d = null;
        }
        this.b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new V();
        }
        V v8 = this.e;
        v8.a = colorStateList;
        v8.d = true;
        this.b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new V();
        }
        V v8 = this.e;
        v8.b = mode;
        v8.c = true;
        this.b();
    }

    public final boolean k() {
        if (this.d != null) {
            return true;
        }
        return false;
    }
}

