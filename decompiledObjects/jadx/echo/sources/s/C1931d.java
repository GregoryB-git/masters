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

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1931d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f19135a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f19137c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f19138d;

    /* renamed from: e, reason: collision with root package name */
    public float f19139e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f19142h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f19143i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f19144j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19140f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19141g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f19145k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f19136b = new Paint(5);

    public C1931d(ColorStateList colorStateList, float f7) {
        this.f19135a = f7;
        e(colorStateList);
        this.f19137c = new RectF();
        this.f19138d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f19142h;
    }

    public float c() {
        return this.f19139e;
    }

    public float d() {
        return this.f19135a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z7;
        Paint paint = this.f19136b;
        if (this.f19143i == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f19143i);
            z7 = true;
        }
        RectF rectF = this.f19137c;
        float f7 = this.f19135a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f19142h = colorStateList;
        this.f19136b.setColor(colorStateList.getColorForState(getState(), this.f19142h.getDefaultColor()));
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f7, boolean z7, boolean z8) {
        if (f7 == this.f19139e && this.f19140f == z7 && this.f19141g == z8) {
            return;
        }
        this.f19139e = f7;
        this.f19140f = z7;
        this.f19141g = z8;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f19138d, this.f19135a);
    }

    public void h(float f7) {
        if (f7 == this.f19135a) {
            return;
        }
        this.f19135a = f7;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f19137c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f19138d.set(rect);
        if (this.f19140f) {
            this.f19138d.inset((int) Math.ceil(AbstractC1932e.a(this.f19139e, this.f19135a, this.f19141g)), (int) Math.ceil(AbstractC1932e.b(this.f19139e, this.f19135a, this.f19141g)));
            this.f19137c.set(this.f19138d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f19144j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f19142h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f19142h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z7 = colorForState != this.f19136b.getColor();
        if (z7) {
            this.f19136b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f19144j;
        if (colorStateList2 == null || (mode = this.f19145k) == null) {
            return z7;
        }
        this.f19143i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f19136b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19136b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f19144j = colorStateList;
        this.f19143i = a(colorStateList, this.f19145k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f19145k = mode;
        this.f19143i = a(this.f19144j, mode);
        invalidateSelf();
    }
}
