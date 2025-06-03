package l;

import I.AbstractC0421s;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.AbstractC1238i;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1505d {

    /* renamed from: a, reason: collision with root package name */
    public final View f16441a;

    /* renamed from: d, reason: collision with root package name */
    public V f16444d;

    /* renamed from: e, reason: collision with root package name */
    public V f16445e;

    /* renamed from: f, reason: collision with root package name */
    public V f16446f;

    /* renamed from: c, reason: collision with root package name */
    public int f16443c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C1506e f16442b = C1506e.b();

    public C1505d(View view) {
        this.f16441a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f16446f == null) {
            this.f16446f = new V();
        }
        V v7 = this.f16446f;
        v7.a();
        ColorStateList j7 = AbstractC0421s.j(this.f16441a);
        if (j7 != null) {
            v7.f16401d = true;
            v7.f16398a = j7;
        }
        PorterDuff.Mode k7 = AbstractC0421s.k(this.f16441a);
        if (k7 != null) {
            v7.f16400c = true;
            v7.f16399b = k7;
        }
        if (!v7.f16401d && !v7.f16400c) {
            return false;
        }
        C1506e.g(drawable, v7, this.f16441a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f16441a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            V v7 = this.f16445e;
            if (v7 != null) {
                C1506e.g(background, v7, this.f16441a.getDrawableState());
                return;
            }
            V v8 = this.f16444d;
            if (v8 != null) {
                C1506e.g(background, v8, this.f16441a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        V v7 = this.f16445e;
        if (v7 != null) {
            return v7.f16398a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        V v7 = this.f16445e;
        if (v7 != null) {
            return v7.f16399b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i7) {
        X s7 = X.s(this.f16441a.getContext(), attributeSet, AbstractC1238i.f13524O2, i7, 0);
        View view = this.f16441a;
        AbstractC0421s.B(view, view.getContext(), AbstractC1238i.f13524O2, attributeSet, s7.o(), i7, 0);
        try {
            if (s7.p(AbstractC1238i.f13528P2)) {
                this.f16443c = s7.l(AbstractC1238i.f13528P2, -1);
                ColorStateList e7 = this.f16442b.e(this.f16441a.getContext(), this.f16443c);
                if (e7 != null) {
                    h(e7);
                }
            }
            if (s7.p(AbstractC1238i.f13532Q2)) {
                AbstractC0421s.F(this.f16441a, s7.c(AbstractC1238i.f13532Q2));
            }
            if (s7.p(AbstractC1238i.f13536R2)) {
                AbstractC0421s.G(this.f16441a, AbstractC1494B.c(s7.i(AbstractC1238i.f13536R2, -1), null));
            }
            s7.t();
        } catch (Throwable th) {
            s7.t();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f16443c = -1;
        h(null);
        b();
    }

    public void g(int i7) {
        this.f16443c = i7;
        C1506e c1506e = this.f16442b;
        h(c1506e != null ? c1506e.e(this.f16441a.getContext(), i7) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f16444d == null) {
                this.f16444d = new V();
            }
            V v7 = this.f16444d;
            v7.f16398a = colorStateList;
            v7.f16401d = true;
        } else {
            this.f16444d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f16445e == null) {
            this.f16445e = new V();
        }
        V v7 = this.f16445e;
        v7.f16398a = colorStateList;
        v7.f16401d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f16445e == null) {
            this.f16445e = new V();
        }
        V v7 = this.f16445e;
        v7.f16399b = mode;
        v7.f16400c = true;
        b();
    }

    public final boolean k() {
        return this.f16444d != null;
    }
}
