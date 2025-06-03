package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import r.AbstractC1907a;
import r.AbstractC1908b;
import r.AbstractC1909c;
import r.AbstractC1910d;
import s.C1928a;
import s.InterfaceC1929b;
import s.InterfaceC1930c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f8815v = {R.attr.colorBackground};

    /* renamed from: w, reason: collision with root package name */
    public static final InterfaceC1930c f8816w;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8817o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8818p;

    /* renamed from: q, reason: collision with root package name */
    public int f8819q;

    /* renamed from: r, reason: collision with root package name */
    public int f8820r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f8821s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f8822t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC1929b f8823u;

    public class a implements InterfaceC1929b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f8824a;

        public a() {
        }

        @Override // s.InterfaceC1929b
        public View a() {
            return CardView.this;
        }

        @Override // s.InterfaceC1929b
        public void b(int i7, int i8, int i9, int i10) {
            CardView.this.f8822t.set(i7, i8, i9, i10);
            CardView cardView = CardView.this;
            Rect rect = cardView.f8821s;
            CardView.super.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
        }

        @Override // s.InterfaceC1929b
        public void c(Drawable drawable) {
            this.f8824a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // s.InterfaceC1929b
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // s.InterfaceC1929b
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // s.InterfaceC1929b
        public Drawable f() {
            return this.f8824a;
        }
    }

    static {
        C1928a c1928a = new C1928a();
        f8816w = c1928a;
        c1928a.f();
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1907a.f18899a);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f8816w.h(this.f8823u);
    }

    public float getCardElevation() {
        return f8816w.e(this.f8823u);
    }

    public int getContentPaddingBottom() {
        return this.f8821s.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8821s.left;
    }

    public int getContentPaddingRight() {
        return this.f8821s.right;
    }

    public int getContentPaddingTop() {
        return this.f8821s.top;
    }

    public float getMaxCardElevation() {
        return f8816w.i(this.f8823u);
    }

    public boolean getPreventCornerOverlap() {
        return this.f8818p;
    }

    public float getRadius() {
        return f8816w.b(this.f8823u);
    }

    public boolean getUseCompatPadding() {
        return this.f8817o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        if (!(f8816w instanceof C1928a)) {
            int mode = View.MeasureSpec.getMode(i7);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.c(this.f8823u)), View.MeasureSpec.getSize(i7)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i8);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.n(this.f8823u)), View.MeasureSpec.getSize(i8)), mode2);
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(int i7) {
        f8816w.m(this.f8823u, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f7) {
        f8816w.a(this.f8823u, f7);
    }

    public void setMaxCardElevation(float f7) {
        f8816w.l(this.f8823u, f7);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        this.f8820r = i7;
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        this.f8819q = i7;
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }

    public void setPreventCornerOverlap(boolean z7) {
        if (z7 != this.f8818p) {
            this.f8818p = z7;
            f8816w.k(this.f8823u);
        }
    }

    public void setRadius(float f7) {
        f8816w.g(this.f8823u, f7);
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f8817o != z7) {
            this.f8817o = z7;
            f8816w.d(this.f8823u);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources;
        int i8;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f8821s = rect;
        this.f8822t = new Rect();
        a aVar = new a();
        this.f8823u = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1910d.f18903a, i7, AbstractC1909c.f18902a);
        if (obtainStyledAttributes.hasValue(AbstractC1910d.f18906d)) {
            valueOf = obtainStyledAttributes.getColorStateList(AbstractC1910d.f18906d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f8815v);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i8 = AbstractC1908b.f18901b;
            } else {
                resources = getResources();
                i8 = AbstractC1908b.f18900a;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i8));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(AbstractC1910d.f18907e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(AbstractC1910d.f18908f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(AbstractC1910d.f18909g, 0.0f);
        this.f8817o = obtainStyledAttributes.getBoolean(AbstractC1910d.f18911i, false);
        this.f8818p = obtainStyledAttributes.getBoolean(AbstractC1910d.f18910h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18912j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18914l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18916n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18915m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18913k, dimensionPixelSize);
        float f7 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f8819q = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18904b, 0);
        this.f8820r = obtainStyledAttributes.getDimensionPixelSize(AbstractC1910d.f18905c, 0);
        obtainStyledAttributes.recycle();
        f8816w.j(aVar, context, colorStateList, dimension, dimension2, f7);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f8816w.m(this.f8823u, colorStateList);
    }
}
