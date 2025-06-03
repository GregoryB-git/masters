package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f9429a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f9430b;

    /* renamed from: c, reason: collision with root package name */
    public int f9431c = 0;

    public o(ImageView imageView) {
        this.f9429a = imageView;
    }

    public final void a() {
        x0 x0Var;
        Drawable drawable = this.f9429a.getDrawable();
        if (drawable != null) {
            i0.a(drawable);
        }
        if (drawable == null || (x0Var = this.f9430b) == null) {
            return;
        }
        j.d(drawable, x0Var, this.f9429a.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        Context context = this.f9429a.getContext();
        int[] iArr = b.a0.f1578s;
        z0 m10 = z0.m(context, attributeSet, iArr, i10);
        ImageView imageView = this.f9429a;
        e0.d0.g(imageView, imageView.getContext(), iArr, attributeSet, m10.f9519b, i10);
        try {
            Drawable drawable = this.f9429a.getDrawable();
            if (drawable == null && (i11 = m10.i(1, -1)) != -1 && (drawable = x6.b.X(this.f9429a.getContext(), i11)) != null) {
                this.f9429a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                i0.a(drawable);
            }
            if (m10.l(2)) {
                j0.e.c(this.f9429a, m10.b(2));
            }
            if (m10.l(3)) {
                j0.e.d(this.f9429a, i0.b(m10.h(3, -1), null));
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            Drawable X = x6.b.X(this.f9429a.getContext(), i10);
            if (X != null) {
                i0.a(X);
            }
            this.f9429a.setImageDrawable(X);
        } else {
            this.f9429a.setImageDrawable(null);
        }
        a();
    }
}
