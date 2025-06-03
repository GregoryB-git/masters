/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.FrameLayout
 *  java.lang.Math
 *  java.lang.Object
 */
package androidx.cardview.widget;

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
import r.b;
import r.d;
import s.a;
import s.c;

public class CardView
extends FrameLayout {
    public static final int[] v = new int[]{16842801};
    public static final c w;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;
    public final Rect t;
    public final s.b u;

    static {
        a a8 = new a();
        w = a8;
        a8.f();
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public CardView(Context context, AttributeSet resources, int n8) {
        s.b b8;
        Rect rect;
        super(context, (AttributeSet)resources, n8);
        this.s = rect = new Rect();
        this.t = new Rect();
        this.u = b8 = new s.b(){
            public Drawable a;

            @Override
            public View a() {
                return CardView.this;
            }

            @Override
            public void b(int n8, int n9, int n10, int n11) {
                CardView.this.t.set(n8, n9, n10, n11);
                CardView cardView = CardView.this;
                Rect rect = cardView.s;
                CardView.super.setPadding(n8 + rect.left, n9 + rect.top, n10 + rect.right, n11 + rect.bottom);
            }

            @Override
            public void c(Drawable drawable2) {
                this.a = drawable2;
                CardView.this.setBackgroundDrawable(drawable2);
            }

            @Override
            public boolean d() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override
            public boolean e() {
                return CardView.this.getUseCompatPadding();
            }

            @Override
            public Drawable f() {
                return this.a;
            }
        };
        TypedArray typedArray = context.obtainStyledAttributes((AttributeSet)resources, d.a, n8, r.c.a);
        if (typedArray.hasValue(d.d)) {
            resources = typedArray.getColorStateList(d.d);
        } else {
            resources = this.getContext().obtainStyledAttributes(v);
            n8 = resources.getColor(0, 0);
            resources.recycle();
            resources = new float[3];
            Color.colorToHSV((int)n8, (float[])resources);
            if (resources[2] > 0.5f) {
                resources = this.getResources();
                n8 = b.b;
            } else {
                resources = this.getResources();
                n8 = b.a;
            }
            n8 = resources.getColor(n8);
            resources = ColorStateList.valueOf((int)n8);
        }
        float f8 = typedArray.getDimension(d.e, 0.0f);
        float f9 = typedArray.getDimension(d.f, 0.0f);
        float f10 = typedArray.getDimension(d.g, 0.0f);
        this.o = typedArray.getBoolean(d.i, false);
        this.p = typedArray.getBoolean(d.h, true);
        n8 = typedArray.getDimensionPixelSize(d.j, 0);
        rect.left = typedArray.getDimensionPixelSize(d.l, n8);
        rect.top = typedArray.getDimensionPixelSize(d.n, n8);
        rect.right = typedArray.getDimensionPixelSize(d.m, n8);
        rect.bottom = typedArray.getDimensionPixelSize(d.k, n8);
        if (f9 > f10) {
            f10 = f9;
        }
        this.q = typedArray.getDimensionPixelSize(d.b, 0);
        this.r = typedArray.getDimensionPixelSize(d.c, 0);
        typedArray.recycle();
        w.j(b8, context, (ColorStateList)resources, f8, f9, f10);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return w.h(this.u);
    }

    public float getCardElevation() {
        return w.e(this.u);
    }

    public int getContentPaddingBottom() {
        return this.s.bottom;
    }

    public int getContentPaddingLeft() {
        return this.s.left;
    }

    public int getContentPaddingRight() {
        return this.s.right;
    }

    public int getContentPaddingTop() {
        return this.s.top;
    }

    public float getMaxCardElevation() {
        return w.i(this.u);
    }

    public boolean getPreventCornerOverlap() {
        return this.p;
    }

    public float getRadius() {
        return w.b(this.u);
    }

    public boolean getUseCompatPadding() {
        return this.o;
    }

    public void onMeasure(int n8, int n9) {
        c c8 = w;
        int n10 = n8;
        int n11 = n9;
        if (!(c8 instanceof a)) {
            n11 = View.MeasureSpec.getMode((int)n8);
            if (n11 == Integer.MIN_VALUE || n11 == 1073741824) {
                n8 = View.MeasureSpec.makeMeasureSpec((int)Math.max((int)((int)Math.ceil((double)c8.c(this.u))), (int)View.MeasureSpec.getSize((int)n8)), (int)n11);
            }
            n11 = View.MeasureSpec.getMode((int)n9);
            if (n11 != Integer.MIN_VALUE && n11 != 1073741824) {
                n10 = n8;
                n11 = n9;
            } else {
                n11 = View.MeasureSpec.makeMeasureSpec((int)Math.max((int)((int)Math.ceil((double)c8.n(this.u))), (int)View.MeasureSpec.getSize((int)n9)), (int)n11);
                n10 = n8;
            }
        }
        super.onMeasure(n10, n11);
    }

    public void setCardBackgroundColor(int n8) {
        w.m(this.u, ColorStateList.valueOf((int)n8));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        w.m(this.u, colorStateList);
    }

    public void setCardElevation(float f8) {
        w.a(this.u, f8);
    }

    public void setMaxCardElevation(float f8) {
        w.l(this.u, f8);
    }

    public void setMinimumHeight(int n8) {
        this.r = n8;
        super.setMinimumHeight(n8);
    }

    public void setMinimumWidth(int n8) {
        this.q = n8;
        super.setMinimumWidth(n8);
    }

    public void setPadding(int n8, int n9, int n10, int n11) {
    }

    public void setPaddingRelative(int n8, int n9, int n10, int n11) {
    }

    public void setPreventCornerOverlap(boolean bl) {
        if (bl != this.p) {
            this.p = bl;
            w.k(this.u);
        }
    }

    public void setRadius(float f8) {
        w.g(this.u, f8);
    }

    public void setUseCompatPadding(boolean bl) {
        if (this.o != bl) {
            this.o = bl;
            w.d(this.u);
        }
    }

}

