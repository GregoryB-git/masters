/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 */
package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class s
extends ViewGroup {
    public final Rect o = new Rect();
    public final Rect p = new Rect();

    public s(Context context) {
        super(context);
    }

    public static int a(int n8) {
        return View.MeasureSpec.makeMeasureSpec((int)View.MeasureSpec.getSize((int)n8), (int)Integer.MIN_VALUE);
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            View view = this.getChildAt(i8);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)view.getLayoutParams();
            this.o.set(n8, n9, n10, n11);
            Gravity.apply((int)layoutParams.gravity, (int)view.getMeasuredWidth(), (int)view.getMeasuredHeight(), (Rect)this.o, (int)layoutParams.x, (int)layoutParams.y, (Rect)this.p);
            layoutParams = this.p;
            view.layout(layoutParams.left, layoutParams.top, layoutParams.right, layoutParams.bottom);
        }
    }

    public void onMeasure(int n8, int n9) {
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            this.getChildAt(i8).measure(s.a(n8), s.a(n9));
        }
        super.onMeasure(n8, n9);
    }
}

