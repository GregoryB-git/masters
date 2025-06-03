// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.View;
import android.view.Gravity;
import android.view.WindowManager$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;

public class s extends ViewGroup
{
    public final Rect o;
    public final Rect p;
    
    public s(final Context context) {
        super(context);
        this.o = new Rect();
        this.p = new Rect();
    }
    
    public static int a(final int n) {
        return View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), Integer.MIN_VALUE);
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final WindowManager$LayoutParams windowManager$LayoutParams = (WindowManager$LayoutParams)child.getLayoutParams();
            this.o.set(n, n2, n3, n4);
            Gravity.apply(windowManager$LayoutParams.gravity, child.getMeasuredWidth(), child.getMeasuredHeight(), this.o, windowManager$LayoutParams.x, windowManager$LayoutParams.y, this.p);
            final Rect p5 = this.p;
            child.layout(p5.left, p5.top, p5.right, p5.bottom);
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            this.getChildAt(i).measure(a(n), a(n2));
        }
        super.onMeasure(n, n2);
    }
}
