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
 *  android.graphics.drawable.RippleDrawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageView
 *  java.lang.Object
 *  java.lang.Throwable
 */
package l;

import I.s;
import L.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import e.i;
import g.a;
import l.B;
import l.V;
import l.X;
import l.e;

public class h {
    public final ImageView a;
    public V b;
    public V c;
    public V d;

    public h(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable2) {
        if (this.d == null) {
            this.d = new V();
        }
        V v8 = this.d;
        v8.a();
        ColorStateList colorStateList = d.a(this.a);
        if (colorStateList != null) {
            v8.d = true;
            v8.a = colorStateList;
        }
        if ((colorStateList = d.b(this.a)) != null) {
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
        Drawable drawable2 = this.a.getDrawable();
        if (drawable2 != null) {
            B.b(drawable2);
        }
        if (drawable2 != null) {
            if (this.j() && this.a(drawable2)) {
                return;
            }
            V v8 = this.c;
            if (v8 != null) {
                e.g(drawable2, v8, this.a.getDrawableState());
                return;
            }
            v8 = this.b;
            if (v8 != null) {
                e.g(drawable2, v8, this.a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        V v8 = this.c;
        if (v8 != null) {
            return v8.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        V v8 = this.c;
        if (v8 != null) {
            return v8.b;
        }
        return null;
    }

    public boolean e() {
        if (this.a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(AttributeSet attributeSet, int n8) {
        X x8;
        Throwable throwable2;
        block7 : {
            x8 = X.s(this.a.getContext(), attributeSet, i.H, n8, 0);
            ImageView imageView = this.a;
            s.B((View)imageView, imageView.getContext(), i.H, attributeSet, x8.o(), n8, 0);
            try {
                imageView = this.a.getDrawable();
                attributeSet = imageView;
                if (imageView == null) {
                    n8 = x8.l(i.I, -1);
                    attributeSet = imageView;
                    if (n8 != -1) {
                        imageView = a.b(this.a.getContext(), n8);
                        attributeSet = imageView;
                        if (imageView != null) {
                            this.a.setImageDrawable((Drawable)imageView);
                            attributeSet = imageView;
                        }
                    }
                }
                if (attributeSet != null) {
                    B.b((Drawable)attributeSet);
                }
                if (x8.p(i.J)) {
                    d.c(this.a, x8.c(i.J));
                }
                if (!x8.p(i.K)) break block7;
                d.d(this.a, B.c(x8.i(i.K, -1), null));
            }
            catch (Throwable throwable2) {}
        }
        x8.t();
        return;
        x8.t();
        throw throwable2;
    }

    public void g(int n8) {
        if (n8 != 0) {
            Drawable drawable2 = a.b(this.a.getContext(), n8);
            if (drawable2 != null) {
                B.b(drawable2);
            }
            this.a.setImageDrawable(drawable2);
        } else {
            this.a.setImageDrawable(null);
        }
        this.b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new V();
        }
        V v8 = this.c;
        v8.a = colorStateList;
        v8.d = true;
        this.b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new V();
        }
        V v8 = this.c;
        v8.b = mode;
        v8.c = true;
        this.b();
    }

    public final boolean j() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}

