package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e0.d0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f9298a;

    /* renamed from: d, reason: collision with root package name */
    public x0 f9301d;

    /* renamed from: e, reason: collision with root package name */
    public x0 f9302e;
    public x0 f;

    /* renamed from: c, reason: collision with root package name */
    public int f9300c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final j f9299b = j.a();

    public d(View view) {
        this.f9298a = view;
    }

    public final void a() {
        Drawable background = this.f9298a.getBackground();
        if (background != null) {
            boolean z10 = true;
            if (this.f9301d != null) {
                if (this.f == null) {
                    this.f = new x0();
                }
                x0 x0Var = this.f;
                x0Var.f9492a = null;
                x0Var.f9495d = false;
                x0Var.f9493b = null;
                x0Var.f9494c = false;
                View view = this.f9298a;
                WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                ColorStateList g10 = d0.d.g(view);
                if (g10 != null) {
                    x0Var.f9495d = true;
                    x0Var.f9492a = g10;
                }
                PorterDuff.Mode h10 = d0.d.h(this.f9298a);
                if (h10 != null) {
                    x0Var.f9494c = true;
                    x0Var.f9493b = h10;
                }
                if (x0Var.f9495d || x0Var.f9494c) {
                    j.d(background, x0Var, this.f9298a.getDrawableState());
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            x0 x0Var2 = this.f9302e;
            if (x0Var2 != null) {
                j.d(background, x0Var2, this.f9298a.getDrawableState());
                return;
            }
            x0 x0Var3 = this.f9301d;
            if (x0Var3 != null) {
                j.d(background, x0Var3, this.f9298a.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        x0 x0Var = this.f9302e;
        if (x0Var != null) {
            return x0Var.f9492a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        x0 x0Var = this.f9302e;
        if (x0Var != null) {
            return x0Var.f9493b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        Context context = this.f9298a.getContext();
        int[] iArr = b.a0.M;
        z0 m10 = z0.m(context, attributeSet, iArr, i10);
        View view = this.f9298a;
        e0.d0.g(view, view.getContext(), iArr, attributeSet, m10.f9519b, i10);
        try {
            if (m10.l(0)) {
                this.f9300c = m10.i(0, -1);
                j jVar = this.f9299b;
                Context context2 = this.f9298a.getContext();
                int i12 = this.f9300c;
                synchronized (jVar) {
                    i11 = jVar.f9360a.i(context2, i12);
                }
                if (i11 != null) {
                    g(i11);
                }
            }
            if (m10.l(1)) {
                d0.d.q(this.f9298a, m10.b(1));
            }
            if (m10.l(2)) {
                d0.d.r(this.f9298a, i0.b(m10.h(2, -1), null));
            }
        } finally {
            m10.n();
        }
    }

    public final void e() {
        this.f9300c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f9300c = i10;
        j jVar = this.f9299b;
        if (jVar != null) {
            Context context = this.f9298a.getContext();
            synchronized (jVar) {
                colorStateList = jVar.f9360a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9301d == null) {
                this.f9301d = new x0();
            }
            x0 x0Var = this.f9301d;
            x0Var.f9492a = colorStateList;
            x0Var.f9495d = true;
        } else {
            this.f9301d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f9302e == null) {
            this.f9302e = new x0();
        }
        x0 x0Var = this.f9302e;
        x0Var.f9492a = colorStateList;
        x0Var.f9495d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f9302e == null) {
            this.f9302e = new x0();
        }
        x0 x0Var = this.f9302e;
        x0Var.f9493b = mode;
        x0Var.f9494c = true;
        a();
    }
}
