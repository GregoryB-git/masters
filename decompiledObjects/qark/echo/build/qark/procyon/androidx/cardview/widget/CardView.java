// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.cardview.widget;

import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Color;
import r.d;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import s.a;
import s.b;
import android.graphics.Rect;
import s.c;
import android.widget.FrameLayout;

public class CardView extends FrameLayout
{
    public static final int[] v;
    public static final c w;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;
    public final Rect t;
    public final b u;
    
    static {
        v = new int[] { 16842801 };
        (w = new a()).f();
    }
    
    public CardView(@NonNull final Context context, final AttributeSet set) {
        this(context, set, r.a.a);
    }
    
    public CardView(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        final Rect s = new Rect();
        this.s = s;
        this.t = new Rect();
        final b u = new b() {
            public Drawable a;
            
            @Override
            public View a() {
                return (View)CardView.this;
            }
            
            @Override
            public void b(final int n, final int n2, final int n3, final int n4) {
                CardView.this.t.set(n, n2, n3, n4);
                final CardView b = CardView.this;
                final Rect s = b.s;
                CardView.a(b, n + s.left, n2 + s.top, n3 + s.right, n4 + s.bottom);
            }
            
            @Override
            public void c(final Drawable drawable) {
                this.a = drawable;
                ((View)CardView.this).setBackgroundDrawable(drawable);
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
        this.u = u;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, d.a, n, r.c.a);
        ColorStateList list;
        if (obtainStyledAttributes.hasValue(d.d)) {
            list = obtainStyledAttributes.getColorStateList(d.d);
        }
        else {
            final TypedArray obtainStyledAttributes2 = ((View)this).getContext().obtainStyledAttributes(CardView.v);
            n = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            final float[] array = new float[3];
            Color.colorToHSV(n, array);
            Resources resources;
            if (array[2] > 0.5f) {
                resources = ((View)this).getResources();
                n = r.b.b;
            }
            else {
                resources = ((View)this).getResources();
                n = r.b.a;
            }
            n = resources.getColor(n);
            list = ColorStateList.valueOf(n);
        }
        final float dimension = obtainStyledAttributes.getDimension(d.e, 0.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(d.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(d.g, 0.0f);
        this.o = obtainStyledAttributes.getBoolean(d.i, false);
        this.p = obtainStyledAttributes.getBoolean(d.h, true);
        n = obtainStyledAttributes.getDimensionPixelSize(d.j, 0);
        s.left = obtainStyledAttributes.getDimensionPixelSize(d.l, n);
        s.top = obtainStyledAttributes.getDimensionPixelSize(d.n, n);
        s.right = obtainStyledAttributes.getDimensionPixelSize(d.m, n);
        s.bottom = obtainStyledAttributes.getDimensionPixelSize(d.k, n);
        if (dimension2 > dimension3) {
            dimension3 = dimension2;
        }
        this.q = obtainStyledAttributes.getDimensionPixelSize(d.b, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(d.c, 0);
        obtainStyledAttributes.recycle();
        CardView.w.j(u, context, list, dimension, dimension2, dimension3);
    }
    
    public static /* synthetic */ void a(final CardView cardView, final int n, final int n2, final int n3, final int n4) {
        cardView.setPadding(n, n2, n3, n4);
    }
    
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return CardView.w.h(this.u);
    }
    
    public float getCardElevation() {
        return CardView.w.e(this.u);
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
        return CardView.w.i(this.u);
    }
    
    public boolean getPreventCornerOverlap() {
        return this.p;
    }
    
    public float getRadius() {
        return CardView.w.b(this.u);
    }
    
    public boolean getUseCompatPadding() {
        return this.o;
    }
    
    public void onMeasure(int measureSpec, final int n) {
        final c w = CardView.w;
        int n2 = measureSpec;
        int measureSpec2 = n;
        if (!(w instanceof a)) {
            final int mode = View$MeasureSpec.getMode(measureSpec);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(w.c(this.u)), View$MeasureSpec.getSize(measureSpec)), mode);
            }
            final int mode2 = View$MeasureSpec.getMode(n);
            if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
                n2 = measureSpec;
                measureSpec2 = n;
            }
            else {
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(w.n(this.u)), View$MeasureSpec.getSize(n)), mode2);
                n2 = measureSpec;
            }
        }
        super.onMeasure(n2, measureSpec2);
    }
    
    public void setCardBackgroundColor(final int n) {
        CardView.w.m(this.u, ColorStateList.valueOf(n));
    }
    
    public void setCardBackgroundColor(final ColorStateList list) {
        CardView.w.m(this.u, list);
    }
    
    public void setCardElevation(final float n) {
        CardView.w.a(this.u, n);
    }
    
    public void setMaxCardElevation(final float n) {
        CardView.w.l(this.u, n);
    }
    
    public void setMinimumHeight(final int r) {
        super.setMinimumHeight(this.r = r);
    }
    
    public void setMinimumWidth(final int q) {
        super.setMinimumWidth(this.q = q);
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPreventCornerOverlap(final boolean p) {
        if (p != this.p) {
            this.p = p;
            CardView.w.k(this.u);
        }
    }
    
    public void setRadius(final float n) {
        CardView.w.g(this.u, n);
    }
    
    public void setUseCompatPadding(final boolean o) {
        if (this.o != o) {
            this.o = o;
            CardView.w.d(this.u);
        }
    }
}
