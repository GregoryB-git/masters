/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  java.lang.Math
 */
package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.b;
import e.e;

public class AlertDialogLayout
extends b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int y(View view) {
        int n8 = s.n(view);
        if (n8 > 0) {
            return n8;
        }
        if (view instanceof ViewGroup && (view = (ViewGroup)view).getChildCount() == 1) {
            return AlertDialogLayout.y(view.getChildAt(0));
        }
        return 0;
    }

    public final void i(int n8, int n9) {
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)1073741824);
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if (view.getVisibility() == 8) continue;
            b.a a8 = (b.a)view.getLayoutParams();
            if (a8.width != -1) continue;
            int n11 = a8.height;
            a8.height = view.getMeasuredHeight();
            this.measureChildWithMargins(view, n10, 0, n9, 0);
            a8.height = n11;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        int n12 = this.getPaddingLeft();
        int n13 = n10 - n8;
        int n14 = this.getPaddingRight();
        int n15 = this.getPaddingRight();
        n8 = this.getMeasuredHeight();
        int n16 = this.getChildCount();
        int n17 = this.getGravity();
        n10 = n17 & 112;
        n8 = n10 != 16 ? (n10 != 80 ? this.getPaddingTop() : this.getPaddingTop() + n11 - n9 - n8) : this.getPaddingTop() + (n11 - n9 - n8) / 2;
        Drawable drawable2 = this.getDividerDrawable();
        n9 = drawable2 == null ? 0 : drawable2.getIntrinsicHeight();
        n10 = 0;
        while (n10 < n16) {
            block3 : {
                int n18;
                int n19;
                int n20;
                block6 : {
                    block7 : {
                        block4 : {
                            block5 : {
                                drawable2 = this.getChildAt(n10);
                                n11 = n8;
                                if (drawable2 == null) break block3;
                                n11 = n8;
                                if (drawable2.getVisibility() == 8) break block3;
                                n18 = drawable2.getMeasuredWidth();
                                n19 = drawable2.getMeasuredHeight();
                                b.a a8 = (b.a)drawable2.getLayoutParams();
                                n11 = n20 = a8.b;
                                if (n20 < 0) {
                                    n11 = n17 & 8388615;
                                }
                                if ((n11 = I.e.a(n11, s.m((View)this)) & 7) == 1) break block4;
                                if (n11 == 5) break block5;
                                n11 = a8.leftMargin + n12;
                                break block6;
                            }
                            n11 = n13 - n14 - n18;
                            break block7;
                        }
                        n11 = (n13 - n12 - n15 - n18) / 2 + n12 + a8.leftMargin;
                    }
                    n11 -= a8.rightMargin;
                }
                n20 = n8;
                if (this.q(n10)) {
                    n20 = n8 + n9;
                }
                n8 = n20 + a8.topMargin;
                this.x((View)drawable2, n11, n8, n18, n19);
                n11 = n8 + (n19 + a8.bottomMargin);
            }
            ++n10;
            n8 = n11;
        }
    }

    @Override
    public void onMeasure(int n8, int n9) {
        if (!this.z(n8, n9)) {
            super.onMeasure(n8, n9);
        }
    }

    public final void x(View view, int n8, int n9, int n10, int n11) {
        view.layout(n8, n9, n10 + n8, n11 + n9);
    }

    public final boolean z(int n8, int n9) {
        int n10;
        int n11;
        View view;
        int n12;
        int n13;
        View view2;
        int n14;
        int n15 = this.getChildCount();
        View view3 = null;
        View view4 = view = null;
        for (n10 = 0; n10 < n15; ++n10) {
            view2 = this.getChildAt(n10);
            if (view2.getVisibility() == 8) continue;
            n14 = view2.getId();
            if (n14 == e.B) {
                view3 = view2;
                continue;
            }
            if (n14 == e.g) {
                view = view2;
                continue;
            }
            if (n14 != e.i && n14 != e.j) {
                return false;
            }
            if (view4 != null) {
                return false;
            }
            view4 = view2;
        }
        int n16 = View.MeasureSpec.getMode((int)n9);
        int n17 = View.MeasureSpec.getSize((int)n9);
        int n18 = View.MeasureSpec.getMode((int)n8);
        int n19 = this.getPaddingTop() + this.getPaddingBottom();
        if (view3 != null) {
            view3.measure(n8, 0);
            n19 += view3.getMeasuredHeight();
            n14 = View.combineMeasuredStates((int)0, (int)view3.getMeasuredState());
        } else {
            n14 = 0;
        }
        if (view != null) {
            view.measure(n8, 0);
            n10 = AlertDialogLayout.y(view);
            n12 = view.getMeasuredHeight() - n10;
            n19 += n10;
            n14 = View.combineMeasuredStates((int)n14, (int)view.getMeasuredState());
        } else {
            n12 = n10 = 0;
        }
        if (view4 != null) {
            n13 = n16 == 0 ? 0 : View.MeasureSpec.makeMeasureSpec((int)Math.max((int)0, (int)(n17 - n19)), (int)n16);
            view4.measure(n8, n13);
            n11 = view4.getMeasuredHeight();
            n19 += n11;
            n14 = View.combineMeasuredStates((int)n14, (int)view4.getMeasuredState());
        } else {
            n11 = 0;
        }
        int n20 = n17 - n19;
        n17 = n14;
        int n21 = n20;
        n13 = n19;
        if (view != null) {
            n12 = Math.min((int)n20, (int)n12);
            n17 = n20;
            n13 = n10;
            if (n12 > 0) {
                n17 = n20 - n12;
                n13 = n10 + n12;
            }
            view.measure(n8, View.MeasureSpec.makeMeasureSpec((int)n13, (int)1073741824));
            n13 = n19 - n10 + view.getMeasuredHeight();
            n10 = View.combineMeasuredStates((int)n14, (int)view.getMeasuredState());
            n21 = n17;
            n17 = n10;
        }
        n14 = n17;
        n10 = n13;
        if (view4 != null) {
            n14 = n17;
            n10 = n13;
            if (n21 > 0) {
                view4.measure(n8, View.MeasureSpec.makeMeasureSpec((int)(n11 + n21), (int)n16));
                n10 = n13 - n11 + view4.getMeasuredHeight();
                n14 = View.combineMeasuredStates((int)n17, (int)view4.getMeasuredState());
            }
        }
        n13 = 0;
        for (n19 = 0; n19 < n15; ++n19) {
            view2 = this.getChildAt(n19);
            n17 = n13;
            if (view2.getVisibility() != 8) {
                n17 = Math.max((int)n13, (int)view2.getMeasuredWidth());
            }
            n13 = n17;
        }
        this.setMeasuredDimension(View.resolveSizeAndState((int)(n13 + (this.getPaddingLeft() + this.getPaddingRight())), (int)n8, (int)n14), View.resolveSizeAndState((int)n10, (int)n9, (int)0));
        if (n18 != 1073741824) {
            this.i(n15, n9);
        }
        return true;
    }
}

