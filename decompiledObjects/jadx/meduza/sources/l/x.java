package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.meduza.meduza.R;
import y.a;

/* loaded from: classes.dex */
public final class x extends s {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f9487d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f9488e;
    public ColorStateList f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f9489g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9490h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9491i;

    public x(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.f9489g = null;
        this.f9490h = false;
        this.f9491i = false;
        this.f9487d = seekBar;
    }

    @Override // l.s
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        Context context = this.f9487d.getContext();
        int[] iArr = b.a0.t;
        z0 m10 = z0.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        SeekBar seekBar = this.f9487d;
        e0.d0.g(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f9519b, R.attr.seekBarStyle);
        Drawable f = m10.f(0);
        if (f != null) {
            this.f9487d.setThumb(f);
        }
        Drawable e10 = m10.e(1);
        Drawable drawable = this.f9488e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f9488e = e10;
        if (e10 != null) {
            e10.setCallback(this.f9487d);
            a.b.b(e10, this.f9487d.getLayoutDirection());
            if (e10.isStateful()) {
                e10.setState(this.f9487d.getDrawableState());
            }
            c();
        }
        this.f9487d.invalidate();
        if (m10.l(3)) {
            this.f9489g = i0.b(m10.h(3, -1), this.f9489g);
            this.f9491i = true;
        }
        if (m10.l(2)) {
            this.f = m10.b(2);
            this.f9490h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f9488e;
        if (drawable != null) {
            if (this.f9490h || this.f9491i) {
                Drawable mutate = drawable.mutate();
                this.f9488e = mutate;
                if (this.f9490h) {
                    a.C0261a.h(mutate, this.f);
                }
                if (this.f9491i) {
                    a.C0261a.i(this.f9488e, this.f9489g);
                }
                if (this.f9488e.isStateful()) {
                    this.f9488e.setState(this.f9487d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f9488e != null) {
            int max = this.f9487d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9488e.getIntrinsicWidth();
                int intrinsicHeight = this.f9488e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9488e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f9487d.getWidth() - this.f9487d.getPaddingLeft()) - this.f9487d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f9487d.getPaddingLeft(), this.f9487d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f9488e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
