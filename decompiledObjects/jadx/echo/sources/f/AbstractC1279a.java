package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import e.AbstractC1238i;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1279a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f14061a;

    public AbstractC1279a(int i7, int i8) {
        super(i7, i8);
        this.f14061a = 8388627;
    }

    public AbstractC1279a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14061a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13633r);
        this.f14061a = obtainStyledAttributes.getInt(AbstractC1238i.f13637s, 0);
        obtainStyledAttributes.recycle();
    }

    public AbstractC1279a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f14061a = 0;
    }

    public AbstractC1279a(AbstractC1279a abstractC1279a) {
        super((ViewGroup.MarginLayoutParams) abstractC1279a);
        this.f14061a = 0;
        this.f14061a = abstractC1279a.f14061a;
    }
}
