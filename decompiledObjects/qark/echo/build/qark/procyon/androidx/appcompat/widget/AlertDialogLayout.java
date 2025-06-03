// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import I.e;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import I.s;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class AlertDialogLayout extends b
{
    public AlertDialogLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public static int y(final View view) {
        final int n = s.n(view);
        if (n > 0) {
            return n;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 1) {
                return y(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
    
    public final void i(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                if (a.width == -1) {
                    final int height = a.height;
                    a.height = child.getMeasuredHeight();
                    this.measureChildWithMargins(child, measureSpec, 0, n2, 0);
                    a.height = height;
                }
            }
        }
    }
    
    @Override
    public void onLayout(final boolean b, int n, int intrinsicHeight, int i, int b2) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int n2 = i - n;
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingRight2 = ((View)this).getPaddingRight();
        n = ((View)this).getMeasuredHeight();
        final int childCount = this.getChildCount();
        final int gravity = this.getGravity();
        i = (gravity & 0x70);
        if (i != 16) {
            if (i != 80) {
                n = ((View)this).getPaddingTop();
            }
            else {
                n = ((View)this).getPaddingTop() + b2 - intrinsicHeight - n;
            }
        }
        else {
            n = ((View)this).getPaddingTop() + (b2 - intrinsicHeight - n) / 2;
        }
        final Drawable dividerDrawable = this.getDividerDrawable();
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        }
        else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        View child;
        int measuredWidth;
        int measuredHeight;
        a a;
        int n3;
        for (i = 0; i < childCount; ++i, n = b2) {
            child = this.getChildAt(i);
            b2 = n;
            if (child != null) {
                b2 = n;
                if (child.getVisibility() != 8) {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    a = (a)child.getLayoutParams();
                    if ((b2 = a.b) < 0) {
                        b2 = (gravity & 0x800007);
                    }
                    b2 = (e.a(b2, I.s.m((View)this)) & 0x7);
                    Label_0296: {
                        if (b2 != 1) {
                            if (b2 != 5) {
                                b2 = a.leftMargin + paddingLeft;
                                break Label_0296;
                            }
                            b2 = n2 - paddingRight - measuredWidth;
                        }
                        else {
                            b2 = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin;
                        }
                        b2 -= a.rightMargin;
                    }
                    n3 = n;
                    if (this.q(i)) {
                        n3 = n + intrinsicHeight;
                    }
                    n = n3 + a.topMargin;
                    this.x(child, b2, n, measuredWidth, measuredHeight);
                    b2 = n + (measuredHeight + a.bottomMargin);
                }
            }
        }
    }
    
    @Override
    public void onMeasure(final int n, final int n2) {
        if (!this.z(n, n2)) {
            super.onMeasure(n, n2);
        }
    }
    
    public final void x(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n3 + n, n4 + n2);
    }
    
    public final boolean z(final int n, final int n2) {
        final int childCount = this.getChildCount();
        View view = null;
        View view3;
        View view2 = view3 = null;
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final int id = child.getId();
                if (id == e.e.B) {
                    view = child;
                }
                else if (id == e.e.g) {
                    view2 = child;
                }
                else {
                    if (id != e.e.i && id != e.e.j) {
                        return false;
                    }
                    if (view3 != null) {
                        return false;
                    }
                    view3 = child;
                }
            }
        }
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n2);
        final int mode2 = View$MeasureSpec.getMode(n);
        int n3 = ((View)this).getPaddingTop() + ((View)this).getPaddingBottom();
        int n4;
        if (view != null) {
            view.measure(n, 0);
            n3 += view.getMeasuredHeight();
            n4 = View.combineMeasuredStates(0, view.getMeasuredState());
        }
        else {
            n4 = 0;
        }
        int y;
        int b;
        if (view2 != null) {
            view2.measure(n, 0);
            y = y(view2);
            b = view2.getMeasuredHeight() - y;
            n3 += y;
            n4 = View.combineMeasuredStates(n4, view2.getMeasuredState());
        }
        else {
            y = (b = 0);
        }
        int measuredHeight;
        if (view3 != null) {
            int measureSpec;
            if (mode == 0) {
                measureSpec = 0;
            }
            else {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n3), mode);
            }
            view3.measure(n, measureSpec);
            measuredHeight = view3.getMeasuredHeight();
            n3 += measuredHeight;
            n4 = View.combineMeasuredStates(n4, view3.getMeasuredState());
        }
        else {
            measuredHeight = 0;
        }
        final int a = size - n3;
        int n5 = n4;
        int n6 = a;
        int n7 = n3;
        if (view2 != null) {
            final int min = Math.min(a, b);
            int n8 = a;
            int n9 = y;
            if (min > 0) {
                n8 = a - min;
                n9 = y + min;
            }
            view2.measure(n, View$MeasureSpec.makeMeasureSpec(n9, 1073741824));
            n7 = n3 - y + view2.getMeasuredHeight();
            final int combineMeasuredStates = View.combineMeasuredStates(n4, view2.getMeasuredState());
            n6 = n8;
            n5 = combineMeasuredStates;
        }
        int combineMeasuredStates2 = n5;
        int n10 = n7;
        if (view3 != null) {
            combineMeasuredStates2 = n5;
            n10 = n7;
            if (n6 > 0) {
                view3.measure(n, View$MeasureSpec.makeMeasureSpec(measuredHeight + n6, mode));
                n10 = n7 - measuredHeight + view3.getMeasuredHeight();
                combineMeasuredStates2 = View.combineMeasuredStates(n5, view3.getMeasuredState());
            }
        }
        int j = 0;
        int a2 = 0;
        while (j < childCount) {
            final View child2 = this.getChildAt(j);
            int max = a2;
            if (child2.getVisibility() != 8) {
                max = Math.max(a2, child2.getMeasuredWidth());
            }
            ++j;
            a2 = max;
        }
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(a2 + (((View)this).getPaddingLeft() + ((View)this).getPaddingRight()), n, combineMeasuredStates2), View.resolveSizeAndState(n10, n2, 0));
        if (mode2 != 1073741824) {
            this.i(childCount, n2);
        }
        return true;
    }
}
