package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class s extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    public final Rect f15111o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f15112p;

    public s(Context context) {
        super(context);
        this.f15111o = new Rect();
        this.f15112p = new Rect();
    }

    public static int a(int i7) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f15111o.set(i7, i8, i9, i10);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f15111o, layoutParams.x, layoutParams.y, this.f15112p);
            Rect rect = this.f15112p;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            getChildAt(i9).measure(a(i7), a(i8));
        }
        super.onMeasure(i7, i8);
    }
}
