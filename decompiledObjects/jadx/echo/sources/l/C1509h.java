package l;

import I.AbstractC0421s;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import e.AbstractC1238i;
import g.AbstractC1294a;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1509h {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f16459a;

    /* renamed from: b, reason: collision with root package name */
    public V f16460b;

    /* renamed from: c, reason: collision with root package name */
    public V f16461c;

    /* renamed from: d, reason: collision with root package name */
    public V f16462d;

    public C1509h(ImageView imageView) {
        this.f16459a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f16462d == null) {
            this.f16462d = new V();
        }
        V v7 = this.f16462d;
        v7.a();
        ColorStateList a7 = L.d.a(this.f16459a);
        if (a7 != null) {
            v7.f16401d = true;
            v7.f16398a = a7;
        }
        PorterDuff.Mode b7 = L.d.b(this.f16459a);
        if (b7 != null) {
            v7.f16400c = true;
            v7.f16399b = b7;
        }
        if (!v7.f16401d && !v7.f16400c) {
            return false;
        }
        C1506e.g(drawable, v7, this.f16459a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable = this.f16459a.getDrawable();
        if (drawable != null) {
            AbstractC1494B.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            V v7 = this.f16461c;
            if (v7 != null) {
                C1506e.g(drawable, v7, this.f16459a.getDrawableState());
                return;
            }
            V v8 = this.f16460b;
            if (v8 != null) {
                C1506e.g(drawable, v8, this.f16459a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        V v7 = this.f16461c;
        if (v7 != null) {
            return v7.f16398a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        V v7 = this.f16461c;
        if (v7 != null) {
            return v7.f16399b;
        }
        return null;
    }

    public boolean e() {
        return !(this.f16459a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i7) {
        int l7;
        X s7 = X.s(this.f16459a.getContext(), attributeSet, AbstractC1238i.f13493H, i7, 0);
        ImageView imageView = this.f16459a;
        AbstractC0421s.B(imageView, imageView.getContext(), AbstractC1238i.f13493H, attributeSet, s7.o(), i7, 0);
        try {
            Drawable drawable = this.f16459a.getDrawable();
            if (drawable == null && (l7 = s7.l(AbstractC1238i.f13497I, -1)) != -1 && (drawable = AbstractC1294a.b(this.f16459a.getContext(), l7)) != null) {
                this.f16459a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1494B.b(drawable);
            }
            if (s7.p(AbstractC1238i.f13501J)) {
                L.d.c(this.f16459a, s7.c(AbstractC1238i.f13501J));
            }
            if (s7.p(AbstractC1238i.f13505K)) {
                L.d.d(this.f16459a, AbstractC1494B.c(s7.i(AbstractC1238i.f13505K, -1), null));
            }
            s7.t();
        } catch (Throwable th) {
            s7.t();
            throw th;
        }
    }

    public void g(int i7) {
        if (i7 != 0) {
            Drawable b7 = AbstractC1294a.b(this.f16459a.getContext(), i7);
            if (b7 != null) {
                AbstractC1494B.b(b7);
            }
            this.f16459a.setImageDrawable(b7);
        } else {
            this.f16459a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f16461c == null) {
            this.f16461c = new V();
        }
        V v7 = this.f16461c;
        v7.f16398a = colorStateList;
        v7.f16401d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f16461c == null) {
            this.f16461c = new V();
        }
        V v7 = this.f16461c;
        v7.f16399b = mode;
        v7.f16400c = true;
        b();
    }

    public final boolean j() {
        return this.f16460b != null;
    }
}
