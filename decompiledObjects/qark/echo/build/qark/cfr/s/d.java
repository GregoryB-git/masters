/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  java.lang.Math
 */
package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import s.e;

public class d
extends Drawable {
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f = false;
    public boolean g = true;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    public d(ColorStateList colorStateList, float f8) {
        this.a = f8;
        this.b = new Paint(5);
        this.e(colorStateList);
        this.c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    public ColorStateList b() {
        return this.h;
    }

    public float c() {
        return this.e;
    }

    public float d() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        boolean bl;
        Paint paint = this.b;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter((ColorFilter)this.i);
            bl = true;
        } else {
            bl = false;
        }
        RectF rectF = this.c;
        float f8 = this.a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (bl) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList == null) {
            colorStateList2 = ColorStateList.valueOf((int)0);
        }
        this.h = colorStateList2;
        this.b.setColor(colorStateList2.getColorForState(this.getState(), this.h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        this.e(colorStateList);
        this.invalidateSelf();
    }

    public void g(float f8, boolean bl, boolean bl2) {
        if (f8 == this.e && this.f == bl && this.g == bl2) {
            return;
        }
        this.e = f8;
        this.f = bl;
        this.g = bl2;
        this.i(null);
        this.invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }

    public void h(float f8) {
        if (f8 == this.a) {
            return;
        }
        this.a = f8;
        this.i(null);
        this.invalidateSelf();
    }

    public final void i(Rect rect) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = this.getBounds();
        }
        this.c.set((float)rect2.left, (float)rect2.top, (float)rect2.right, (float)rect2.bottom);
        this.d.set(rect2);
        if (this.f) {
            float f8 = e.b(this.e, this.a, this.g);
            float f9 = e.a(this.e, this.a, this.g);
            this.d.inset((int)Math.ceil((double)f9), (int)Math.ceil((double)f8));
            this.c.set(this.d);
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful() || (colorStateList = this.h) != null && colorStateList.isStateful() || super.isStateful()) {
            return true;
        }
        return false;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i(rect);
    }

    public boolean onStateChange(int[] colorStateList) {
        ColorStateList colorStateList2 = this.h;
        int n8 = colorStateList2.getColorForState((int[])colorStateList, colorStateList2.getDefaultColor());
        boolean bl = n8 != this.b.getColor();
        if (bl) {
            this.b.setColor(n8);
        }
        if ((colorStateList = this.j) != null && (colorStateList2 = this.k) != null) {
            this.i = this.a(colorStateList, (PorterDuff.Mode)colorStateList2);
            return true;
        }
        return bl;
    }

    public void setAlpha(int n8) {
        this.b.setAlpha(n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = this.a(colorStateList, this.k);
        this.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = this.a(this.j, mode);
        this.invalidateSelf();
    }
}

