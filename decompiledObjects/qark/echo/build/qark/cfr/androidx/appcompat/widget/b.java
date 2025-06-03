/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.appcompat.widget;

import I.e;
import I.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import e.i;
import l.X;
import l.d0;

public abstract class b
extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public boolean o = true;
    public int p = -1;
    public int q = 0;
    public int r;
    public int s = 8388659;
    public int t;
    public float u;
    public boolean v;
    public int[] w;
    public int[] x;
    public Drawable y;
    public int z;

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int n8) {
        boolean bl;
        super(context, attributeSet, n8);
        X x8 = X.s(context, attributeSet, i.w0, n8, 0);
        s.B((View)this, context, i.w0, attributeSet, x8.o(), n8, 0);
        n8 = x8.i(i.y0, -1);
        if (n8 >= 0) {
            this.setOrientation(n8);
        }
        if ((n8 = x8.i(i.x0, -1)) >= 0) {
            this.setGravity(n8);
        }
        if (!(bl = x8.a(i.z0, true))) {
            this.setBaselineAligned(bl);
        }
        this.u = x8.g(i.B0, -1.0f);
        this.p = x8.i(i.A0, -1);
        this.v = x8.a(i.E0, false);
        this.setDividerDrawable(x8.f(i.C0));
        this.B = x8.i(i.F0, 0);
        this.C = x8.e(i.D0, 0);
        x8.t();
    }

    private void i(int n8, int n9) {
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)1073741824);
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.p(i8);
            if (view.getVisibility() == 8) continue;
            a a8 = (a)view.getLayoutParams();
            if (a8.width != -1) continue;
            int n11 = a8.height;
            a8.height = view.getMeasuredHeight();
            this.measureChildWithMargins(view, n10, 0, n9, 0);
            a8.height = n11;
        }
    }

    private void x(View view, int n8, int n9, int n10, int n11) {
        view.layout(n8, n9, n10 + n8, n11 + n9);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void d(Canvas var1_1) {
        block5 : {
            block3 : {
                block4 : {
                    var4_2 = this.getVirtualChildCount();
                    var5_3 = d0.a((View)this);
                    for (var2_4 = 0; var2_4 < var4_2; ++var2_4) {
                        var6_6 = this.p(var2_4);
                        if (var6_6 == null || var6_6.getVisibility() == 8 || !this.q(var2_4)) continue;
                        var7_7 = (a)var6_6.getLayoutParams();
                        var3_5 = var5_3 != false ? var6_6.getRight() + var7_7.rightMargin : var6_6.getLeft() - var7_7.leftMargin - this.z;
                        this.g(var1_1, var3_5);
                    }
                    if (this.q(var4_2) == false) return;
                    var6_6 = this.p(var4_2 - 1);
                    if (var6_6 != null) break block3;
                    if (!var5_3) break block4;
                    var2_4 = this.getPaddingLeft();
                    break block5;
                }
                var2_4 = this.getWidth();
                var3_5 = this.getPaddingRight();
                ** GOTO lbl25
            }
            var7_7 = (a)var6_6.getLayoutParams();
            if (var5_3) {
                var2_4 = var6_6.getLeft();
                var3_5 = var7_7.leftMargin;
lbl25: // 2 sources:
                var2_4 = var2_4 - var3_5 - this.z;
            } else {
                var2_4 = var6_6.getRight() + var7_7.rightMargin;
            }
        }
        this.g(var1_1, var2_4);
    }

    public void e(Canvas canvas) {
        int n8;
        View view;
        a a8;
        int n9 = this.getVirtualChildCount();
        for (n8 = 0; n8 < n9; ++n8) {
            view = this.p(n8);
            if (view == null || view.getVisibility() == 8 || !this.q(n8)) continue;
            a8 = (a)view.getLayoutParams();
            this.f(canvas, view.getTop() - a8.topMargin - this.A);
        }
        if (this.q(n9)) {
            view = this.p(n9 - 1);
            if (view == null) {
                n8 = this.getHeight() - this.getPaddingBottom() - this.A;
            } else {
                a8 = (a)view.getLayoutParams();
                n8 = view.getBottom() + a8.bottomMargin;
            }
            this.f(canvas, n8);
        }
    }

    public void f(Canvas canvas, int n8) {
        this.y.setBounds(this.getPaddingLeft() + this.C, n8, this.getWidth() - this.getPaddingRight() - this.C, this.A + n8);
        this.y.draw(canvas);
    }

    public void g(Canvas canvas, int n8) {
        this.y.setBounds(n8, this.getPaddingTop() + this.C, this.z + n8, this.getHeight() - this.getPaddingBottom() - this.C);
        this.y.draw(canvas);
    }

    public int getBaseline() {
        int n8;
        if (this.p < 0) {
            return super.getBaseline();
        }
        int n9 = this.getChildCount();
        if (n9 > (n8 = this.p)) {
            View view = this.getChildAt(n8);
            int n10 = view.getBaseline();
            if (n10 == -1) {
                if (this.p == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            n9 = n8 = this.q;
            if (this.r == 1) {
                int n11 = this.s & 112;
                n9 = n8;
                if (n11 != 48) {
                    n9 = n11 != 16 ? (n11 != 80 ? n8 : this.getBottom() - this.getTop() - this.getPaddingBottom() - this.t) : n8 + (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.t) / 2;
                }
            }
            return n9 + ((a)view.getLayoutParams()).topMargin + n10;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.p;
    }

    public Drawable getDividerDrawable() {
        return this.y;
    }

    public int getDividerPadding() {
        return this.C;
    }

    public int getDividerWidth() {
        return this.z;
    }

    public int getGravity() {
        return this.s;
    }

    public int getOrientation() {
        return this.r;
    }

    public int getShowDividers() {
        return this.B;
    }

    public int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.u;
    }

    public final void h(int n8, int n9) {
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)1073741824);
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.p(i8);
            if (view.getVisibility() == 8) continue;
            a a8 = (a)view.getLayoutParams();
            if (a8.height != -1) continue;
            int n11 = a8.width;
            a8.width = view.getMeasuredWidth();
            this.measureChildWithMargins(view, n9, 0, n10, 0);
            a8.width = n11;
        }
    }

    public a j() {
        int n8 = this.r;
        if (n8 == 0) {
            return new a(-2, -2);
        }
        if (n8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public a k(AttributeSet attributeSet) {
        return new a(this.getContext(), attributeSet);
    }

    public a l(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int m(View view, int n8) {
        return 0;
    }

    public int n(View view) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    public void onDraw(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        if (this.r == 1) {
            this.e(canvas);
            return;
        }
        this.d(canvas);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        if (this.r == 1) {
            this.s(n8, n9, n10, n11);
            return;
        }
        this.r(n8, n9, n10, n11);
    }

    public void onMeasure(int n8, int n9) {
        if (this.r == 1) {
            this.w(n8, n9);
            return;
        }
        this.u(n8, n9);
    }

    public View p(int n8) {
        return this.getChildAt(n8);
    }

    public boolean q(int n8) {
        boolean bl = false;
        boolean bl2 = false;
        if (n8 == 0) {
            if ((this.B & 1) != 0) {
                bl2 = true;
            }
            return bl2;
        }
        if (n8 == this.getChildCount()) {
            bl2 = bl;
            if ((this.B & 4) != 0) {
                bl2 = true;
            }
            return bl2;
        }
        if ((this.B & 2) != 0) {
            --n8;
            while (n8 >= 0) {
                if (this.getChildAt(n8).getVisibility() != 8) {
                    return true;
                }
                --n8;
            }
        }
        return false;
    }

    public void r(int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        boolean bl = d0.a((View)this);
        int n14 = this.getPaddingTop();
        int n15 = n11 - n9;
        int n16 = this.getPaddingBottom();
        int n17 = this.getPaddingBottom();
        int n18 = this.getVirtualChildCount();
        n9 = this.s;
        n11 = n9 & 112;
        boolean bl2 = this.o;
        int[] arrn = this.w;
        int[] arrn2 = this.x;
        n9 = e.a(8388615 & n9, s.m((View)this));
        boolean bl3 = true;
        n9 = n9 != 1 ? (n9 != 5 ? this.getPaddingLeft() : this.getPaddingLeft() + n10 - n8 - this.t) : this.getPaddingLeft() + (n10 - n8 - this.t) / 2;
        if (bl) {
            n13 = n18 - 1;
            n12 = -1;
        } else {
            n13 = 0;
            n12 = 1;
        }
        n10 = n11;
        n11 = n14;
        for (int i8 = 0; i8 < n18; ++i8) {
            int n19 = n13 + n12 * i8;
            View view = this.p(n19);
            if (view == null) {
                n9 += this.v(n19);
                continue;
            }
            if (view.getVisibility() != 8) {
                int n20;
                int n21 = view.getMeasuredWidth();
                int n22 = view.getMeasuredHeight();
                a a8 = (a)view.getLayoutParams();
                int n23 = bl2 && a8.height != -1 ? view.getBaseline() : -1;
                n8 = n20 = a8.b;
                if (n20 < 0) {
                    n8 = n10;
                }
                if ((n8 &= 112) != 16) {
                    if (n8 != 48) {
                        if (n8 != 80) {
                            n8 = n11;
                        } else {
                            n8 = n20 = n15 - n16 - n22 - a8.bottomMargin;
                            if (n23 != -1) {
                                n8 = view.getMeasuredHeight();
                                n8 = n20 - (arrn2[2] - (n8 - n23));
                            }
                        }
                    } else {
                        n8 = n20 = a8.topMargin + n11;
                        if (n23 != -1) {
                            n8 = n20 + (arrn[1] - n23);
                        }
                    }
                } else {
                    n8 = (n15 - n14 - n17 - n22) / 2 + n11 + a8.topMargin - a8.bottomMargin;
                }
                bl3 = true;
                n23 = n9;
                if (this.q(n19)) {
                    n23 = n9 + this.z;
                }
                n9 = a8.leftMargin + n23;
                this.x(view, n9 + this.n(view), n8, n21, n22);
                n8 = a8.rightMargin;
                n23 = this.o(view);
                i8 += this.m(view, n19);
                n9 += n21 + n8 + n23;
                continue;
            }
            bl3 = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void s(int n8, int n9, int n10, int n11) {
        int n12 = this.getPaddingLeft();
        int n13 = n10 - n8;
        int n14 = this.getPaddingRight();
        int n15 = this.getPaddingRight();
        int n16 = this.getVirtualChildCount();
        int n17 = this.s;
        n8 = n17 & 112;
        n8 = n8 != 16 ? (n8 != 80 ? this.getPaddingTop() : this.getPaddingTop() + n11 - n9 - this.t) : this.getPaddingTop() + (n11 - n9 - this.t) / 2;
        n9 = 0;
        while (n9 < n16) {
            block8 : {
                View view;
                int n18;
                int n19;
                block7 : {
                    block9 : {
                        block5 : {
                            block6 : {
                                block4 : {
                                    block3 : {
                                        view = this.p(n9);
                                        if (view != null) break block3;
                                        n10 = n8 + this.v(n9);
                                        break block4;
                                    }
                                    n10 = n8;
                                    if (view.getVisibility() == 8) break block4;
                                    n18 = view.getMeasuredWidth();
                                    n19 = view.getMeasuredHeight();
                                    a a8 = (a)view.getLayoutParams();
                                    n10 = n11 = a8.b;
                                    if (n11 < 0) {
                                        n10 = n17 & 8388615;
                                    }
                                    if ((n10 = e.a(n10, s.m((View)this)) & 7) == 1) break block5;
                                    if (n10 == 5) break block6;
                                    n10 = a8.leftMargin + n12;
                                    break block7;
                                }
                                n8 = n10;
                                break block8;
                            }
                            n10 = n13 - n14 - n18;
                            break block9;
                        }
                        n10 = (n13 - n12 - n15 - n18) / 2 + n12 + a8.leftMargin;
                    }
                    n10 -= a8.rightMargin;
                }
                n11 = n8;
                if (this.q(n9)) {
                    n11 = n8 + this.A;
                }
                n8 = n11 + a8.topMargin;
                this.x(view, n10, n8 + this.n(view), n18, n19);
                n10 = a8.bottomMargin;
                n11 = this.o(view);
                n9 += this.m(view, n9);
                n8 += n19 + n10 + n11;
            }
            ++n9;
        }
    }

    public void setBaselineAligned(boolean bl) {
        this.o = bl;
    }

    public void setBaselineAlignedChildIndex(int n8) {
        if (n8 >= 0 && n8 < this.getChildCount()) {
            this.p = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("base aligned child index out of range (0, ");
        stringBuilder.append(this.getChildCount());
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setDividerDrawable(Drawable drawable2) {
        if (drawable2 == this.y) {
            return;
        }
        this.y = drawable2;
        boolean bl = false;
        if (drawable2 != null) {
            this.z = drawable2.getIntrinsicWidth();
            this.A = drawable2.getIntrinsicHeight();
        } else {
            this.z = 0;
            this.A = 0;
        }
        if (drawable2 == null) {
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.requestLayout();
    }

    public void setDividerPadding(int n8) {
        this.C = n8;
    }

    public void setGravity(int n8) {
        if (this.s != n8) {
            int n9 = n8;
            if ((8388615 & n8) == 0) {
                n9 = n8 | 8388611;
            }
            n8 = n9;
            if ((n9 & 112) == 0) {
                n8 = n9 | 48;
            }
            this.s = n8;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int n8) {
        int n9 = this.s;
        if ((8388615 & n9) != (n8 &= 8388615)) {
            this.s = n8 | -8388616 & n9;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean bl) {
        this.v = bl;
    }

    public void setOrientation(int n8) {
        if (this.r != n8) {
            this.r = n8;
            this.requestLayout();
        }
    }

    public void setShowDividers(int n8) {
        if (n8 != this.B) {
            this.requestLayout();
        }
        this.B = n8;
    }

    public void setVerticalGravity(int n8) {
        int n9 = this.s;
        if ((n9 & 112) != (n8 &= 112)) {
            this.s = n8 | n9 & -113;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.u = Math.max((float)0.0f, (float)f8);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(View view, int n8, int n9, int n10, int n11, int n12) {
        this.measureChildWithMargins(view, n9, n10, n11, n12);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void u(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        block52 : {
            float f8;
            int n18;
            View view;
            boolean bl;
            int[] arrn;
            int n19;
            int n20;
            boolean bl2;
            float f9;
            int n21;
            a a8;
            int n22;
            View view2;
            int n23;
            int n24;
            block51 : {
                block49 : {
                    block50 : {
                        block48 : {
                            boolean bl3;
                            block46 : {
                                block47 : {
                                    this.t = 0;
                                    n19 = this.getVirtualChildCount();
                                    n24 = View.MeasureSpec.getMode((int)n8);
                                    n10 = View.MeasureSpec.getMode((int)n9);
                                    if (this.w == null || this.x == null) {
                                        this.w = new int[4];
                                        this.x = new int[4];
                                    }
                                    arrn = this.w;
                                    view2 = this.x;
                                    arrn[3] = -1;
                                    arrn[2] = -1;
                                    arrn[1] = -1;
                                    arrn[0] = -1;
                                    view2[3] = -1;
                                    view2[2] = -1;
                                    view2[1] = -1;
                                    view2[0] = -1;
                                    bl2 = this.o;
                                    bl3 = this.v;
                                    n20 = 1073741824;
                                    bl = n24 == 1073741824;
                                    n17 = n13 = (n18 = (n16 = (n14 = (n23 = (n15 = (n12 = 0))))));
                                    n21 = 1;
                                    f9 = 0.0f;
                                    while (n12 < n19) {
                                        block41 : {
                                            int n25;
                                            block45 : {
                                                block44 : {
                                                    block42 : {
                                                        block43 : {
                                                            block40 : {
                                                                block39 : {
                                                                    block38 : {
                                                                        view = this.p(n12);
                                                                        if (view != null) break block38;
                                                                        this.t += this.v(n12);
                                                                        break block39;
                                                                    }
                                                                    if (view.getVisibility() != 8) break block40;
                                                                    n12 += this.m(view, n12);
                                                                }
                                                                n22 = n12;
                                                                n12 = n20;
                                                                n20 = n22;
                                                                break block41;
                                                            }
                                                            if (this.q(n12)) {
                                                                this.t += this.z;
                                                            }
                                                            a8 = (a)view.getLayoutParams();
                                                            f8 = a8.a;
                                                            f9 += f8;
                                                            if (n24 != n20 || a8.width != 0 || f8 <= 0.0f) break block42;
                                                            n20 = this.t;
                                                            n20 = bl ? (n20 += a8.leftMargin + a8.rightMargin) : Math.max((int)n20, (int)(a8.leftMargin + n20 + a8.rightMargin));
                                                            this.t = n20;
                                                            if (!bl2) break block43;
                                                            n20 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                                                            view.measure(n20, n20);
                                                            n20 = n15;
                                                            break block44;
                                                        }
                                                        n18 = 1;
                                                        break block45;
                                                    }
                                                    if (a8.width == 0 && f8 > 0.0f) {
                                                        a8.width = -2;
                                                        n20 = 0;
                                                    } else {
                                                        n20 = Integer.MIN_VALUE;
                                                    }
                                                    n22 = f9 == 0.0f ? this.t : 0;
                                                    this.t(view, n12, n8, n22, n9, 0);
                                                    if (n20 != Integer.MIN_VALUE) {
                                                        a8.width = n20;
                                                    }
                                                    n22 = view.getMeasuredWidth();
                                                    if (bl) {
                                                        n20 = this.t + (a8.leftMargin + n22 + a8.rightMargin + this.o(view));
                                                    } else {
                                                        n20 = this.t;
                                                        n20 = Math.max((int)n20, (int)(n20 + n22 + a8.leftMargin + a8.rightMargin + this.o(view)));
                                                    }
                                                    this.t = n20;
                                                    n20 = n15;
                                                    if (bl3) {
                                                        n20 = Math.max((int)n22, (int)n15);
                                                    }
                                                }
                                                n15 = n20;
                                            }
                                            int n26 = n12;
                                            n11 = 1073741824;
                                            if (n10 != 1073741824 && a8.height == -1) {
                                                n17 = n12 = 1;
                                            } else {
                                                n12 = 0;
                                            }
                                            n20 = a8.topMargin + a8.bottomMargin;
                                            n22 = view.getMeasuredHeight() + n20;
                                            int n27 = View.combineMeasuredStates((int)n13, (int)view.getMeasuredState());
                                            if (bl2 && (n25 = view.getBaseline()) != -1) {
                                                int n28;
                                                n13 = n28 = a8.b;
                                                if (n28 < 0) {
                                                    n13 = this.s;
                                                }
                                                n13 = ((n13 & 112) >> 4 & -2) >> 1;
                                                arrn[n13] = Math.max((int)arrn[n13], (int)n25);
                                                view2[n13] = Math.max((int)view2[n13], (int)(n22 - n25));
                                            }
                                            n23 = Math.max((int)n23, (int)n22);
                                            n21 = n21 != 0 && a8.height == -1 ? 1 : 0;
                                            if (a8.a > 0.0f) {
                                                if (n12 == 0) {
                                                    n20 = n22;
                                                }
                                                n12 = Math.max((int)n16, (int)n20);
                                            } else {
                                                if (n12 == 0) {
                                                    n20 = n22;
                                                }
                                                n14 = Math.max((int)n14, (int)n20);
                                                n12 = n16;
                                            }
                                            n20 = this.m(view, n26) + n26;
                                            n13 = n27;
                                            n16 = n12;
                                            n12 = n11;
                                        }
                                        n22 = n12;
                                        n12 = n20 + 1;
                                        n20 = n22;
                                    }
                                    if (this.t > 0 && this.q(n19)) {
                                        this.t += this.z;
                                    }
                                    n12 = (n12 = arrn[1]) == -1 && arrn[0] == -1 && arrn[2] == -1 && arrn[3] == -1 ? n23 : Math.max((int)n23, (int)(Math.max((int)arrn[3], (int)Math.max((int)arrn[0], (int)Math.max((int)n12, (int)arrn[2]))) + Math.max((int)view2[3], (int)Math.max((int)view2[0], (int)Math.max((int)view2[1], (int)view2[2])))));
                                    n23 = n13;
                                    n20 = n12;
                                    if (!bl3) break block46;
                                    if (n24 == Integer.MIN_VALUE) break block47;
                                    n20 = n12;
                                    if (n24 != 0) break block46;
                                }
                                this.t = 0;
                                n13 = 0;
                                do {
                                    n20 = n12;
                                    if (n13 >= n19) break;
                                    view = this.p(n13);
                                    if (view == null) {
                                        this.t += this.v(n13);
                                    } else if (view.getVisibility() == 8) {
                                        n13 += this.m(view, n13);
                                    } else {
                                        a8 = (a)view.getLayoutParams();
                                        n20 = this.t;
                                        this.t = bl ? n20 + (a8.leftMargin + n15 + a8.rightMargin + this.o(view)) : Math.max((int)n20, (int)(n20 + n15 + a8.leftMargin + a8.rightMargin + this.o(view)));
                                    }
                                    ++n13;
                                } while (true);
                            }
                            this.t = n12 = this.t + (this.getPaddingLeft() + this.getPaddingRight());
                            n11 = View.resolveSizeAndState((int)Math.max((int)n12, (int)this.getSuggestedMinimumWidth()), (int)n8, (int)0);
                            n22 = (16777215 & n11) - this.t;
                            if (n18 != 0 || n22 != 0 && f9 > 0.0f) break block48;
                            n16 = Math.max((int)n14, (int)n16);
                            if (!bl3 || n24 == 1073741824) break block49;
                            break block50;
                        }
                        f8 = this.u;
                        if (f8 > 0.0f) {
                            f9 = f8;
                        }
                        arrn[3] = -1;
                        arrn[2] = -1;
                        arrn[1] = -1;
                        arrn[0] = -1;
                        view2[3] = -1;
                        view2[2] = -1;
                        view2[1] = -1;
                        view2[0] = -1;
                        this.t = 0;
                        n18 = -1;
                        n15 = n23;
                        n13 = n21;
                        n12 = n19;
                        n21 = n15;
                        n16 = n14;
                        n14 = n22;
                        break block51;
                    }
                    for (n14 = 0; n14 < n19; ++n14) {
                        view2 = this.p(n14);
                        if (view2 == null || view2.getVisibility() == 8 || ((a)view2.getLayoutParams()).a <= 0.0f) continue;
                        view2.measure(View.MeasureSpec.makeMeasureSpec((int)n15, (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)view2.getMeasuredHeight(), (int)1073741824));
                    }
                }
                n13 = n19;
                n12 = n23;
                n14 = n16;
                n15 = n20;
                n16 = n21;
                break block52;
            }
            for (n23 = 0; n23 < n12; ++n23) {
                block54 : {
                    block59 : {
                        block55 : {
                            block58 : {
                                block57 : {
                                    block56 : {
                                        block53 : {
                                            view = this.p(n23);
                                            if (view != null && view.getVisibility() != 8) break block53;
                                            n15 = n21;
                                            break block54;
                                        }
                                        a8 = (a)view.getLayoutParams();
                                        f8 = a8.a;
                                        if (f8 <= 0.0f) break block55;
                                        n20 = (int)((float)n14 * f8 / f9);
                                        n22 = ViewGroup.getChildMeasureSpec((int)n9, (int)(this.getPaddingTop() + this.getPaddingBottom() + a8.topMargin + a8.bottomMargin), (int)a8.height);
                                        if (a8.width != 0 || n24 != 1073741824) break block56;
                                        if (n20 <= 0) break block57;
                                        n15 = n20;
                                        break block58;
                                    }
                                    n15 = n19 = view.getMeasuredWidth() + n20;
                                    if (n19 >= 0) break block58;
                                }
                                n15 = 0;
                            }
                            view.measure(View.MeasureSpec.makeMeasureSpec((int)n15, (int)1073741824), n22);
                            n15 = View.combineMeasuredStates((int)n21, (int)(view.getMeasuredState() & -16777216));
                            f9 -= f8;
                            n21 = n14 - n20;
                            n14 = n15;
                            break block59;
                        }
                        n15 = n14;
                        n14 = n21;
                        n21 = n15;
                    }
                    n15 = this.t;
                    this.t = bl ? n15 + (view.getMeasuredWidth() + a8.leftMargin + a8.rightMargin + this.o(view)) : Math.max((int)n15, (int)(view.getMeasuredWidth() + n15 + a8.leftMargin + a8.rightMargin + this.o(view)));
                    n15 = n10 != 1073741824 && a8.height == -1 ? 1 : 0;
                    n19 = a8.topMargin + a8.bottomMargin;
                    n20 = view.getMeasuredHeight() + n19;
                    n18 = Math.max((int)n18, (int)n20);
                    n15 = n15 != 0 ? n19 : n20;
                    n16 = Math.max((int)n16, (int)n15);
                    n15 = n13 != 0 && a8.height == -1 ? 1 : 0;
                    if (bl2 && (n22 = view.getBaseline()) != -1) {
                        n13 = n19 = a8.b;
                        if (n19 < 0) {
                            n13 = this.s;
                        }
                        n13 = ((n13 & 112) >> 4 & -2) >> 1;
                        arrn[n13] = Math.max((int)arrn[n13], (int)n22);
                        view2[n13] = Math.max((int)view2[n13], (int)(n20 - n22));
                    }
                    n13 = n15;
                    n15 = n14;
                    n14 = n21;
                }
                n21 = n15;
            }
            this.t += this.getPaddingLeft() + this.getPaddingRight();
            n14 = arrn[1];
            n14 = n14 == -1 && arrn[0] == -1 && arrn[2] == -1 && arrn[3] == -1 ? n18 : Math.max((int)n18, (int)(Math.max((int)arrn[3], (int)Math.max((int)arrn[0], (int)Math.max((int)n14, (int)arrn[2]))) + Math.max((int)view2[3], (int)Math.max((int)view2[0], (int)Math.max((int)view2[1], (int)view2[2])))));
            n15 = n14;
            n14 = n16;
            n16 = n13;
            n13 = n12;
            n12 = n21;
        }
        if (n16 != 0 || n10 == 1073741824) {
            n14 = n15;
        }
        this.setMeasuredDimension(n11 | -16777216 & n12, View.resolveSizeAndState((int)Math.max((int)(n14 + (this.getPaddingTop() + this.getPaddingBottom())), (int)this.getSuggestedMinimumHeight()), (int)n9, (int)(n12 << 16)));
        if (n17 != 0) {
            this.h(n13, n8);
        }
    }

    public int v(int n8) {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void w(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        block40 : {
            int n18;
            int n19;
            int n20;
            int n21;
            float f8;
            View view;
            int n22;
            float f9;
            a a8;
            int n23;
            int n24;
            int n25;
            int n26;
            block39 : {
                block37 : {
                    block38 : {
                        block36 : {
                            this.t = 0;
                            n21 = this.getVirtualChildCount();
                            n17 = View.MeasureSpec.getMode((int)n8);
                            n18 = View.MeasureSpec.getMode((int)n9);
                            n19 = this.p;
                            boolean bl = this.v;
                            n13 = n24 = (n26 = (n23 = (n12 = (n25 = (n14 = (n15 = 0))))));
                            n11 = 1;
                            f8 = 0.0f;
                            while (n26 < n21) {
                                view = this.p(n26);
                                if (view == null) {
                                    this.t += this.v(n26);
                                } else if (view.getVisibility() == 8) {
                                    n26 += this.m(view, n26);
                                } else {
                                    if (this.q(n26)) {
                                        this.t += this.A;
                                    }
                                    a8 = (a)view.getLayoutParams();
                                    f9 = a8.a;
                                    f8 += f9;
                                    if (n18 == 1073741824 && a8.height == 0 && f9 > 0.0f) {
                                        n24 = this.t;
                                        this.t = Math.max((int)n24, (int)(a8.topMargin + n24 + a8.bottomMargin));
                                        n24 = 1;
                                    } else {
                                        if (a8.height == 0 && f9 > 0.0f) {
                                            a8.height = -2;
                                            n16 = 0;
                                        } else {
                                            n16 = Integer.MIN_VALUE;
                                        }
                                        n10 = f8 == 0.0f ? this.t : 0;
                                        this.t(view, n26, n8, 0, n9, n10);
                                        if (n16 != Integer.MIN_VALUE) {
                                            a8.height = n16;
                                        }
                                        n16 = view.getMeasuredHeight();
                                        n10 = this.t;
                                        this.t = Math.max((int)n10, (int)(n10 + n16 + a8.topMargin + a8.bottomMargin + this.o(view)));
                                        if (bl) {
                                            n25 = Math.max((int)n16, (int)n25);
                                        }
                                    }
                                    n20 = n26;
                                    if (n19 >= 0 && n19 == n20 + 1) {
                                        this.q = this.t;
                                    }
                                    if (n20 < n19 && a8.a > 0.0f) {
                                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                                    }
                                    if (n17 != 1073741824 && a8.width == -1) {
                                        n13 = n26 = 1;
                                    } else {
                                        n26 = 0;
                                    }
                                    n16 = a8.leftMargin + a8.rightMargin;
                                    n10 = view.getMeasuredWidth() + n16;
                                    n14 = Math.max((int)n14, (int)n10);
                                    n22 = View.combineMeasuredStates((int)n15, (int)view.getMeasuredState());
                                    n15 = n11 != 0 && a8.width == -1 ? 1 : 0;
                                    if (a8.a > 0.0f) {
                                        if (n26 == 0) {
                                            n16 = n10;
                                        }
                                        n12 = Math.max((int)n12, (int)n16);
                                        n11 = n23;
                                    } else {
                                        if (n26 == 0) {
                                            n16 = n10;
                                        }
                                        n11 = Math.max((int)n23, (int)n16);
                                    }
                                    n26 = this.m(view, n20);
                                    n23 = n11;
                                    n26 += n20;
                                    n16 = n22;
                                    n11 = n15;
                                    n15 = n16;
                                }
                                ++n26;
                            }
                            if (this.t > 0 && this.q(n21)) {
                                this.t += this.A;
                            }
                            n16 = n21;
                            if (bl && (n18 == Integer.MIN_VALUE || n18 == 0)) {
                                this.t = 0;
                                for (n26 = 0; n26 < n16; ++n26) {
                                    view = this.p(n26);
                                    if (view == null) {
                                        n21 = this.t + this.v(n26);
                                    } else {
                                        if (view.getVisibility() == 8) {
                                            n26 += this.m(view, n26);
                                            continue;
                                        }
                                        a8 = (a)view.getLayoutParams();
                                        n21 = this.t;
                                        n21 = Math.max((int)n21, (int)(n21 + n25 + a8.topMargin + a8.bottomMargin + this.o(view)));
                                    }
                                    this.t = n21;
                                }
                            }
                            this.t = n26 = this.t + (this.getPaddingTop() + this.getPaddingBottom());
                            n10 = View.resolveSizeAndState((int)Math.max((int)n26, (int)this.getSuggestedMinimumHeight()), (int)n9, (int)0);
                            n26 = (16777215 & n10) - this.t;
                            if (n24 != 0 || n26 != 0 && f8 > 0.0f) break block36;
                            n23 = Math.max((int)n23, (int)n12);
                            if (!bl || n18 == 1073741824) break block37;
                            break block38;
                        }
                        f9 = this.u;
                        if (f9 > 0.0f) {
                            f8 = f9;
                        }
                        this.t = 0;
                        n12 = n26;
                        break block39;
                    }
                    for (n12 = 0; n12 < n16; ++n12) {
                        view = this.p(n12);
                        if (view == null || view.getVisibility() == 8 || ((a)view.getLayoutParams()).a <= 0.0f) continue;
                        view.measure(View.MeasureSpec.makeMeasureSpec((int)view.getMeasuredWidth(), (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)n25, (int)1073741824));
                    }
                }
                n12 = n15;
                n15 = n23;
                break block40;
            }
            for (n25 = 0; n25 < n16; ++n25) {
                block41 : {
                    block44 : {
                        block43 : {
                            block42 : {
                                view = this.p(n25);
                                if (view.getVisibility() == 8) continue;
                                a8 = (a)view.getLayoutParams();
                                f9 = a8.a;
                                if (f9 <= 0.0f) break block41;
                                n21 = (int)((float)n12 * f9 / f8);
                                n24 = this.getPaddingLeft();
                                n20 = this.getPaddingRight();
                                n22 = a8.leftMargin;
                                n19 = a8.rightMargin;
                                int n27 = a8.width;
                                n26 = n12 - n21;
                                n24 = ViewGroup.getChildMeasureSpec((int)n8, (int)(n24 + n20 + n22 + n19), (int)n27);
                                if (a8.height != 0 || n18 != 1073741824) break block42;
                                if (n21 <= 0) break block43;
                                n12 = n21;
                                break block44;
                            }
                            n12 = n21 = view.getMeasuredHeight() + n21;
                            if (n21 >= 0) break block44;
                        }
                        n12 = 0;
                    }
                    view.measure(n24, View.MeasureSpec.makeMeasureSpec((int)n12, (int)1073741824));
                    n15 = View.combineMeasuredStates((int)n15, (int)(view.getMeasuredState() & -256));
                    f8 -= f9;
                    n12 = n26;
                }
                n26 = a8.leftMargin + a8.rightMargin;
                n21 = view.getMeasuredWidth() + n26;
                n14 = Math.max((int)n14, (int)n21);
                if (n17 == 1073741824 || a8.width != -1) {
                    n26 = n21;
                }
                n23 = Math.max((int)n23, (int)n26);
                n11 = n11 != 0 && a8.width == -1 ? 1 : 0;
                n26 = this.t;
                this.t = Math.max((int)n26, (int)(view.getMeasuredHeight() + n26 + a8.topMargin + a8.bottomMargin + this.o(view)));
            }
            this.t += this.getPaddingTop() + this.getPaddingBottom();
            n12 = n15;
            n15 = n23;
        }
        if (n11 != 0 || n17 == 1073741824) {
            n15 = n14;
        }
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max((int)(n15 + (this.getPaddingLeft() + this.getPaddingRight())), (int)this.getSuggestedMinimumWidth()), (int)n8, (int)n12), n10);
        if (n13 != 0) {
            this.i(n16, n9);
        }
    }

    public static class a
    extends ViewGroup.MarginLayoutParams {
        public float a;
        public int b = -1;

        public a(int n8, int n9) {
            super(n8, n9);
            this.a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, i.G0);
            this.a = context.getFloat(i.I0, 0.0f);
            this.b = context.getInt(i.H0, -1);
            context.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

}

