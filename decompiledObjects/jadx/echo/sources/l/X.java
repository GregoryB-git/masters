package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.AbstractC1294a;
import z.h;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16403a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f16404b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f16405c;

    public X(Context context, TypedArray typedArray) {
        this.f16403a = context;
        this.f16404b = typedArray;
    }

    public static X q(Context context, int i7, int[] iArr) {
        return new X(context, context.obtainStyledAttributes(i7, iArr));
    }

    public static X r(Context context, AttributeSet attributeSet, int[] iArr) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static X s(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    public boolean a(int i7, boolean z7) {
        return this.f16404b.getBoolean(i7, z7);
    }

    public int b(int i7, int i8) {
        return this.f16404b.getColor(i7, i8);
    }

    public ColorStateList c(int i7) {
        int resourceId;
        ColorStateList a7;
        return (!this.f16404b.hasValue(i7) || (resourceId = this.f16404b.getResourceId(i7, 0)) == 0 || (a7 = AbstractC1294a.a(this.f16403a, resourceId)) == null) ? this.f16404b.getColorStateList(i7) : a7;
    }

    public int d(int i7, int i8) {
        return this.f16404b.getDimensionPixelOffset(i7, i8);
    }

    public int e(int i7, int i8) {
        return this.f16404b.getDimensionPixelSize(i7, i8);
    }

    public Drawable f(int i7) {
        int resourceId;
        return (!this.f16404b.hasValue(i7) || (resourceId = this.f16404b.getResourceId(i7, 0)) == 0) ? this.f16404b.getDrawable(i7) : AbstractC1294a.b(this.f16403a, resourceId);
    }

    public float g(int i7, float f7) {
        return this.f16404b.getFloat(i7, f7);
    }

    public Typeface h(int i7, int i8, h.b bVar) {
        int resourceId = this.f16404b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f16405c == null) {
            this.f16405c = new TypedValue();
        }
        return z.h.b(this.f16403a, resourceId, this.f16405c, i8, bVar);
    }

    public int i(int i7, int i8) {
        return this.f16404b.getInt(i7, i8);
    }

    public int j(int i7, int i8) {
        return this.f16404b.getInteger(i7, i8);
    }

    public int k(int i7, int i8) {
        return this.f16404b.getLayoutDimension(i7, i8);
    }

    public int l(int i7, int i8) {
        return this.f16404b.getResourceId(i7, i8);
    }

    public String m(int i7) {
        return this.f16404b.getString(i7);
    }

    public CharSequence n(int i7) {
        return this.f16404b.getText(i7);
    }

    public TypedArray o() {
        return this.f16404b;
    }

    public boolean p(int i7) {
        return this.f16404b.hasValue(i7);
    }

    public void t() {
        this.f16404b.recycle();
    }
}
