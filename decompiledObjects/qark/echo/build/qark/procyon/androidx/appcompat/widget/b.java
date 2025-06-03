// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import I.e;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import l.d0;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import I.s;
import l.X;
import e.i;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public abstract class b extends ViewGroup
{
    public int A;
    public int B;
    public int C;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public boolean v;
    public int[] w;
    public int[] x;
    public Drawable y;
    public int z;
    
    public b(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public b(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.o = true;
        this.p = -1;
        this.q = 0;
        this.s = 8388659;
        final X s = X.s(context, set, i.w0, n, 0);
        I.s.B((View)this, context, i.w0, set, s.o(), n, 0);
        n = s.i(i.y0, -1);
        if (n >= 0) {
            this.setOrientation(n);
        }
        n = s.i(i.x0, -1);
        if (n >= 0) {
            this.setGravity(n);
        }
        final boolean a = s.a(i.z0, true);
        if (!a) {
            this.setBaselineAligned(a);
        }
        this.u = s.g(i.B0, -1.0f);
        this.p = s.i(i.A0, -1);
        this.v = s.a(i.E0, false);
        this.setDividerDrawable(s.f(i.C0));
        this.B = s.i(i.F0, 0);
        this.C = s.e(i.D0, 0);
        s.t();
    }
    
    private void i(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View p2 = this.p(i);
            if (p2.getVisibility() != 8) {
                final a a = (a)p2.getLayoutParams();
                if (a.width == -1) {
                    final int height = a.height;
                    a.height = p2.getMeasuredHeight();
                    this.measureChildWithMargins(p2, measureSpec, 0, n2, 0);
                    a.height = height;
                }
            }
        }
    }
    
    private void x(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n3 + n, n4 + n2);
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public void d(final Canvas canvas) {
        final int virtualChildCount = this.getVirtualChildCount();
        final boolean a = d0.a((View)this);
        for (int i = 0; i < virtualChildCount; ++i) {
            final View p = this.p(i);
            if (p != null && p.getVisibility() != 8 && this.q(i)) {
                final a a2 = (a)p.getLayoutParams();
                int n;
                if (a) {
                    n = p.getRight() + a2.rightMargin;
                }
                else {
                    n = p.getLeft() - a2.leftMargin - this.z;
                }
                this.g(canvas, n);
            }
        }
        if (this.q(virtualChildCount)) {
            final View p2 = this.p(virtualChildCount - 1);
            int paddingLeft = 0;
            Label_0211: {
                int n2;
                int n3;
                if (p2 == null) {
                    if (a) {
                        paddingLeft = ((View)this).getPaddingLeft();
                        break Label_0211;
                    }
                    n2 = ((View)this).getWidth();
                    n3 = ((View)this).getPaddingRight();
                }
                else {
                    final a a3 = (a)p2.getLayoutParams();
                    if (!a) {
                        paddingLeft = p2.getRight() + a3.rightMargin;
                        break Label_0211;
                    }
                    n2 = p2.getLeft();
                    n3 = a3.leftMargin;
                }
                paddingLeft = n2 - n3 - this.z;
            }
            this.g(canvas, paddingLeft);
        }
    }
    
    public void e(final Canvas canvas) {
        final int virtualChildCount = this.getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; ++i) {
            final View p = this.p(i);
            if (p != null && p.getVisibility() != 8 && this.q(i)) {
                this.f(canvas, p.getTop() - ((a)p.getLayoutParams()).topMargin - this.A);
            }
        }
        if (this.q(virtualChildCount)) {
            final View p2 = this.p(virtualChildCount - 1);
            int n;
            if (p2 == null) {
                n = ((View)this).getHeight() - ((View)this).getPaddingBottom() - this.A;
            }
            else {
                n = p2.getBottom() + ((a)p2.getLayoutParams()).bottomMargin;
            }
            this.f(canvas, n);
        }
    }
    
    public void f(final Canvas canvas, final int n) {
        this.y.setBounds(((View)this).getPaddingLeft() + this.C, n, ((View)this).getWidth() - ((View)this).getPaddingRight() - this.C, this.A + n);
        this.y.draw(canvas);
    }
    
    public void g(final Canvas canvas, final int n) {
        this.y.setBounds(n, ((View)this).getPaddingTop() + this.C, this.z + n, ((View)this).getHeight() - ((View)this).getPaddingBottom() - this.C);
        this.y.draw(canvas);
    }
    
    public int getBaseline() {
        if (this.p < 0) {
            return super.getBaseline();
        }
        final int childCount = this.getChildCount();
        final int p = this.p;
        if (childCount <= p) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        final View child = this.getChildAt(p);
        final int baseline = child.getBaseline();
        if (baseline != -1) {
            int q;
            final int n = q = this.q;
            if (this.r == 1) {
                final int n2 = this.s & 0x70;
                q = n;
                if (n2 != 48) {
                    if (n2 != 16) {
                        if (n2 != 80) {
                            q = n;
                        }
                        else {
                            q = ((View)this).getBottom() - ((View)this).getTop() - ((View)this).getPaddingBottom() - this.t;
                        }
                    }
                    else {
                        q = n + (((View)this).getBottom() - ((View)this).getTop() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() - this.t) / 2;
                    }
                }
            }
            return q + ((a)child.getLayoutParams()).topMargin + baseline;
        }
        if (this.p == 0) {
            return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
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
    
    public final void h(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(((View)this).getMeasuredHeight(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View p2 = this.p(i);
            if (p2.getVisibility() != 8) {
                final a a = (a)p2.getLayoutParams();
                if (a.height == -1) {
                    final int width = a.width;
                    a.width = p2.getMeasuredWidth();
                    this.measureChildWithMargins(p2, n2, 0, measureSpec, 0);
                    a.width = width;
                }
            }
        }
    }
    
    public a j() {
        final int r = this.r;
        if (r == 0) {
            return new a(-2, -2);
        }
        if (r == 1) {
            return new a(-1, -2);
        }
        return null;
    }
    
    public a k(final AttributeSet set) {
        return new a(((View)this).getContext(), set);
    }
    
    public a l(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new a(viewGroup$LayoutParams);
    }
    
    public int m(final View view, final int n) {
        return 0;
    }
    
    public int n(final View view) {
        return 0;
    }
    
    public int o(final View view) {
        return 0;
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.y == null) {
            return;
        }
        if (this.r == 1) {
            this.e(canvas);
            return;
        }
        this.d(canvas);
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.r == 1) {
            this.s(n, n2, n3, n4);
            return;
        }
        this.r(n, n2, n3, n4);
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.r == 1) {
            this.w(n, n2);
            return;
        }
        this.u(n, n2);
    }
    
    public View p(final int n) {
        return this.getChildAt(n);
    }
    
    public boolean q(int i) {
        final boolean b = false;
        boolean b2 = false;
        if (i == 0) {
            if ((this.B & 0x1) != 0x0) {
                b2 = true;
            }
            return b2;
        }
        if (i == this.getChildCount()) {
            boolean b3 = b;
            if ((this.B & 0x4) != 0x0) {
                b3 = true;
            }
            return b3;
        }
        if ((this.B & 0x2) != 0x0) {
            for (--i; i >= 0; --i) {
                if (this.getChildAt(i).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void r(int n, int n2, int n3, int n4) {
        final boolean a = d0.a((View)this);
        final int paddingTop = ((View)this).getPaddingTop();
        final int n5 = n4 - n2;
        final int paddingBottom = ((View)this).getPaddingBottom();
        final int paddingBottom2 = ((View)this).getPaddingBottom();
        final int virtualChildCount = this.getVirtualChildCount();
        n2 = this.s;
        n4 = (n2 & 0x70);
        final boolean o = this.o;
        final int[] w = this.w;
        final int[] x = this.x;
        n2 = e.a(0x800007 & n2, I.s.m((View)this));
        if (n2 != 1) {
            if (n2 != 5) {
                n2 = ((View)this).getPaddingLeft();
            }
            else {
                n2 = ((View)this).getPaddingLeft() + n3 - n - this.t;
            }
        }
        else {
            n2 = ((View)this).getPaddingLeft() + (n3 - n - this.t) / 2;
        }
        int n6;
        int n7;
        if (a) {
            n6 = virtualChildCount - 1;
            n7 = -1;
        }
        else {
            n6 = 0;
            n7 = 1;
        }
        int i = 0;
        n3 = n4;
        n4 = paddingTop;
        while (i < virtualChildCount) {
            final int n8 = n6 + n7 * i;
            final View p4 = this.p(n8);
            if (p4 == null) {
                n2 += this.v(n8);
            }
            else if (p4.getVisibility() != 8) {
                final int measuredWidth = p4.getMeasuredWidth();
                final int measuredHeight = p4.getMeasuredHeight();
                final a a2 = (a)p4.getLayoutParams();
                int baseline;
                if (o && a2.height != -1) {
                    baseline = p4.getBaseline();
                }
                else {
                    baseline = -1;
                }
                if ((n = a2.b) < 0) {
                    n = n3;
                }
                n &= 0x70;
                if (n != 16) {
                    if (n != 48) {
                        if (n != 80) {
                            n = n4;
                        }
                        else {
                            final int n9 = n = n5 - paddingBottom - measuredHeight - a2.bottomMargin;
                            if (baseline != -1) {
                                n = p4.getMeasuredHeight();
                                n = n9 - (x[2] - (n - baseline));
                            }
                        }
                    }
                    else {
                        final int n10 = n = a2.topMargin + n4;
                        if (baseline != -1) {
                            n = n10 + (w[1] - baseline);
                        }
                    }
                }
                else {
                    n = (n5 - paddingTop - paddingBottom2 - measuredHeight) / 2 + n4 + a2.topMargin - a2.bottomMargin;
                }
                int n11 = n2;
                if (this.q(n8)) {
                    n11 = n2 + this.z;
                }
                n2 = a2.leftMargin + n11;
                this.x(p4, n2 + this.n(p4), n, measuredWidth, measuredHeight);
                n = a2.rightMargin;
                final int o2 = this.o(p4);
                i += this.m(p4, n8);
                n2 += measuredWidth + n + o2;
            }
            ++i;
        }
    }
    
    public void s(int paddingTop, int i, int bottomMargin, int n) {
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int n2 = bottomMargin - paddingTop;
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingRight2 = ((View)this).getPaddingRight();
        final int virtualChildCount = this.getVirtualChildCount();
        final int s = this.s;
        paddingTop = (s & 0x70);
        if (paddingTop != 16) {
            if (paddingTop != 80) {
                paddingTop = ((View)this).getPaddingTop();
            }
            else {
                paddingTop = ((View)this).getPaddingTop() + n - i - this.t;
            }
        }
        else {
            paddingTop = ((View)this).getPaddingTop() + (n - i - this.t) / 2;
        }
    Label_0348:
        for (i = 0; i < virtualChildCount; ++i) {
            final View p4 = this.p(i);
            if (p4 == null) {
                bottomMargin = paddingTop + this.v(i);
            }
            else {
                bottomMargin = paddingTop;
                if (p4.getVisibility() != 8) {
                    final int measuredWidth = p4.getMeasuredWidth();
                    final int measuredHeight = p4.getMeasuredHeight();
                    final a a = (a)p4.getLayoutParams();
                    n = a.b;
                    if ((bottomMargin = n) < 0) {
                        bottomMargin = (s & 0x800007);
                    }
                    bottomMargin = (e.a(bottomMargin, I.s.m((View)this)) & 0x7);
                    while (true) {
                        Label_0230: {
                            if (bottomMargin == 1) {
                                bottomMargin = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin;
                                break Label_0230;
                            }
                            if (bottomMargin == 5) {
                                bottomMargin = n2 - paddingRight - measuredWidth;
                                break Label_0230;
                            }
                            bottomMargin = a.leftMargin + paddingLeft;
                            n = paddingTop;
                            if (this.q(i)) {
                                n = paddingTop + this.A;
                            }
                            paddingTop = n + a.topMargin;
                            this.x(p4, bottomMargin, paddingTop + this.n(p4), measuredWidth, measuredHeight);
                            bottomMargin = a.bottomMargin;
                            n = this.o(p4);
                            i += this.m(p4, i);
                            paddingTop += measuredHeight + bottomMargin + n;
                            continue Label_0348;
                        }
                        bottomMargin -= a.rightMargin;
                        continue;
                    }
                }
            }
            paddingTop = bottomMargin;
        }
    }
    
    public void setBaselineAligned(final boolean o) {
        this.o = o;
    }
    
    public void setBaselineAlignedChildIndex(final int p) {
        if (p >= 0 && p < this.getChildCount()) {
            this.p = p;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("base aligned child index out of range (0, ");
        sb.append(this.getChildCount());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void setDividerDrawable(final Drawable y) {
        if (y == this.y) {
            return;
        }
        this.y = y;
        boolean willNotDraw = false;
        if (y != null) {
            this.z = y.getIntrinsicWidth();
            this.A = y.getIntrinsicHeight();
        }
        else {
            this.z = 0;
            this.A = 0;
        }
        if (y == null) {
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).requestLayout();
    }
    
    public void setDividerPadding(final int c) {
        this.C = c;
    }
    
    public void setGravity(int s) {
        if (this.s != s) {
            int n = s;
            if ((0x800007 & s) == 0x0) {
                n = (s | 0x800003);
            }
            s = n;
            if ((n & 0x70) == 0x0) {
                s = (n | 0x30);
            }
            this.s = s;
            ((View)this).requestLayout();
        }
    }
    
    public void setHorizontalGravity(int n) {
        n &= 0x800007;
        final int s = this.s;
        if ((0x800007 & s) != n) {
            this.s = (n | (0xFF7FFFF8 & s));
            ((View)this).requestLayout();
        }
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean v) {
        this.v = v;
    }
    
    public void setOrientation(final int r) {
        if (this.r != r) {
            this.r = r;
            ((View)this).requestLayout();
        }
    }
    
    public void setShowDividers(final int b) {
        if (b != this.B) {
            ((View)this).requestLayout();
        }
        this.B = b;
    }
    
    public void setVerticalGravity(int n) {
        n &= 0x70;
        final int s = this.s;
        if ((s & 0x70) != n) {
            this.s = (n | (s & 0xFFFFFF8F));
            ((View)this).requestLayout();
        }
    }
    
    public void setWeightSum(final float b) {
        this.u = Math.max(0.0f, b);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void t(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.measureChildWithMargins(view, n2, n3, n4, n5);
    }
    
    public void u(final int n, final int n2) {
        this.t = 0;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        if (this.w == null || this.x == null) {
            this.w = new int[4];
            this.x = new int[4];
        }
        final int[] w = this.w;
        final int[] x = this.x;
        w[2] = (w[3] = -1);
        w[0] = (w[1] = -1);
        x[2] = (x[3] = -1);
        x[0] = (x[1] = -1);
        final boolean o = this.o;
        final boolean v = this.v;
        int n3 = 1073741824;
        final boolean b = mode == 1073741824;
        int b2;
        int i = b2 = 0;
        int max2;
        int max = max2 = b2;
        int n5;
        int n4 = n5 = max2;
        int n7;
        int n6 = n7 = n5;
        int n8 = 1;
        float n9 = 0.0f;
        while (i < virtualChildCount) {
            final View p2 = this.p(i);
            int n16 = 0;
            int n17 = 0;
            Label_0881: {
                if (p2 == null) {
                    this.t += this.v(i);
                }
                else {
                    if (p2.getVisibility() != 8) {
                        if (this.q(i)) {
                            this.t += this.z;
                        }
                        final a a = (a)p2.getLayoutParams();
                        final float a2 = a.a;
                        n9 += a2;
                        Label_0597: {
                            int max4;
                            if (mode == n3 && a.width == 0 && a2 > 0.0f) {
                                final int t = this.t;
                                int max3;
                                if (b) {
                                    max3 = t + (a.leftMargin + a.rightMargin);
                                }
                                else {
                                    max3 = Math.max(t, a.leftMargin + t + a.rightMargin);
                                }
                                this.t = max3;
                                if (!o) {
                                    n5 = 1;
                                    break Label_0597;
                                }
                                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                                p2.measure(measureSpec, measureSpec);
                                max4 = b2;
                            }
                            else {
                                int width;
                                if (a.width == 0 && a2 > 0.0f) {
                                    a.width = -2;
                                    width = 0;
                                }
                                else {
                                    width = Integer.MIN_VALUE;
                                }
                                int t2;
                                if (n9 == 0.0f) {
                                    t2 = this.t;
                                }
                                else {
                                    t2 = 0;
                                }
                                this.t(p2, i, n, t2, n2, 0);
                                if (width != Integer.MIN_VALUE) {
                                    a.width = width;
                                }
                                final int measuredWidth = p2.getMeasuredWidth();
                                int max5;
                                if (b) {
                                    max5 = this.t + (a.leftMargin + measuredWidth + a.rightMargin + this.o(p2));
                                }
                                else {
                                    final int t3 = this.t;
                                    max5 = Math.max(t3, t3 + measuredWidth + a.leftMargin + a.rightMargin + this.o(p2));
                                }
                                this.t = max5;
                                max4 = b2;
                                if (v) {
                                    max4 = Math.max(measuredWidth, b2);
                                }
                            }
                            b2 = max4;
                        }
                        final int n10 = i;
                        final int n11 = 1073741824;
                        int n12;
                        if (mode2 != 1073741824 && a.height == -1) {
                            n12 = (n7 = 1);
                        }
                        else {
                            n12 = 0;
                        }
                        int n13 = a.topMargin + a.bottomMargin;
                        final int b3 = p2.getMeasuredHeight() + n13;
                        final int combineMeasuredStates = View.combineMeasuredStates(n6, p2.getMeasuredState());
                        if (o) {
                            final int baseline = p2.getBaseline();
                            if (baseline != -1) {
                                int n14;
                                if ((n14 = a.b) < 0) {
                                    n14 = this.s;
                                }
                                final int n15 = ((n14 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                w[n15] = Math.max(w[n15], baseline);
                                x[n15] = Math.max(x[n15], b3 - baseline);
                            }
                        }
                        max = Math.max(max, b3);
                        if (n8 != 0 && a.height == -1) {
                            n8 = 1;
                        }
                        else {
                            n8 = 0;
                        }
                        int max6;
                        if (a.a > 0.0f) {
                            if (n12 == 0) {
                                n13 = b3;
                            }
                            max6 = Math.max(n4, n13);
                        }
                        else {
                            if (n12 == 0) {
                                n13 = b3;
                            }
                            max2 = Math.max(max2, n13);
                            max6 = n4;
                        }
                        n16 = this.m(p2, n10) + n10;
                        n6 = combineMeasuredStates;
                        n4 = max6;
                        n17 = n11;
                        break Label_0881;
                    }
                    i += this.m(p2, i);
                }
                final int n18 = i;
                n17 = n3;
                n16 = n18;
            }
            final int n19 = n17;
            i = n16 + 1;
            n3 = n19;
        }
        if (this.t > 0 && this.q(virtualChildCount)) {
            this.t += this.z;
        }
        final int a3 = w[1];
        int max7;
        if (a3 == -1 && w[0] == -1 && w[2] == -1 && w[3] == -1) {
            max7 = max;
        }
        else {
            max7 = Math.max(max, Math.max(w[3], Math.max(w[0], Math.max(a3, w[2]))) + Math.max(x[3], Math.max(x[0], Math.max(x[1], x[2]))));
        }
        final int n20 = n6;
        int n21 = max7;
        Label_1062: {
            if (v) {
                if (mode != Integer.MIN_VALUE) {
                    n21 = max7;
                    if (mode != 0) {
                        break Label_1062;
                    }
                }
                this.t = 0;
                int n22 = 0;
                while (true) {
                    n21 = max7;
                    if (n22 >= virtualChildCount) {
                        break;
                    }
                    final View p3 = this.p(n22);
                    if (p3 == null) {
                        this.t += this.v(n22);
                    }
                    else if (p3.getVisibility() == 8) {
                        n22 += this.m(p3, n22);
                    }
                    else {
                        final a a4 = (a)p3.getLayoutParams();
                        final int t4 = this.t;
                        if (b) {
                            this.t = t4 + (a4.leftMargin + b2 + a4.rightMargin + this.o(p3));
                        }
                        else {
                            this.t = Math.max(t4, t4 + b2 + a4.leftMargin + a4.rightMargin + this.o(p3));
                        }
                    }
                    ++n22;
                }
            }
        }
        final int n23 = this.t + (((View)this).getPaddingLeft() + ((View)this).getPaddingRight());
        this.t = n23;
        final int resolveSizeAndState = View.resolveSizeAndState(Math.max(n23, ((View)this).getSuggestedMinimumWidth()), n, 0);
        final int n24 = (0xFFFFFF & resolveSizeAndState) - this.t;
        int n25;
        int n26;
        int n27;
        int n28;
        int n29;
        if (n5 == 0 && (n24 == 0 || n9 <= 0.0f)) {
            final int max8 = Math.max(max2, n4);
            if (v && mode != 1073741824) {
                for (int j = 0; j < virtualChildCount; ++j) {
                    final View p4 = this.p(j);
                    if (p4 != null) {
                        if (p4.getVisibility() != 8) {
                            if (((a)p4.getLayoutParams()).a > 0.0f) {
                                p4.measure(View$MeasureSpec.makeMeasureSpec(b2, 1073741824), View$MeasureSpec.makeMeasureSpec(p4.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                }
            }
            n25 = virtualChildCount;
            n26 = n20;
            n27 = max8;
            n28 = n21;
            n29 = n8;
        }
        else {
            final float u = this.u;
            if (u > 0.0f) {
                n9 = u;
            }
            w[2] = (w[3] = -1);
            w[0] = (w[1] = -1);
            x[2] = (x[3] = -1);
            x[0] = (x[1] = -1);
            this.t = 0;
            int max9 = -1;
            final int n30 = n20;
            int k = 0;
            int n31 = n8;
            final int n32 = virtualChildCount;
            int n33 = n30;
            int max10 = max2;
            int n34 = n24;
            while (k < n32) {
                final View p5 = this.p(k);
                int n35;
                if (p5 == null || p5.getVisibility() == 8) {
                    n35 = n33;
                }
                else {
                    final a a5 = (a)p5.getLayoutParams();
                    final float a6 = a5.a;
                    int n38;
                    int n39;
                    if (a6 > 0.0f) {
                        final int n36 = (int)(n34 * a6 / n9);
                        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n2, ((View)this).getPaddingTop() + ((View)this).getPaddingBottom() + a5.topMargin + a5.bottomMargin, a5.height);
                        int n37 = 0;
                        Label_1660: {
                            if (a5.width == 0 && mode == 1073741824) {
                                if (n36 > 0) {
                                    n37 = n36;
                                    break Label_1660;
                                }
                            }
                            else if ((n37 = p5.getMeasuredWidth() + n36) >= 0) {
                                break Label_1660;
                            }
                            n37 = 0;
                        }
                        p5.measure(View$MeasureSpec.makeMeasureSpec(n37, 1073741824), childMeasureSpec);
                        final int combineMeasuredStates2 = View.combineMeasuredStates(n33, p5.getMeasuredState() & 0xFF000000);
                        n9 -= a6;
                        n38 = n34 - n36;
                        n39 = combineMeasuredStates2;
                    }
                    else {
                        final int n40 = n34;
                        n39 = n33;
                        n38 = n40;
                    }
                    final int t5 = this.t;
                    if (b) {
                        this.t = t5 + (p5.getMeasuredWidth() + a5.leftMargin + a5.rightMargin + this.o(p5));
                    }
                    else {
                        this.t = Math.max(t5, p5.getMeasuredWidth() + t5 + a5.leftMargin + a5.rightMargin + this.o(p5));
                    }
                    final boolean b4 = mode2 != 1073741824 && a5.height == -1;
                    final int n41 = a5.topMargin + a5.bottomMargin;
                    final int b5 = p5.getMeasuredHeight() + n41;
                    max9 = Math.max(max9, b5);
                    int b6;
                    if (b4) {
                        b6 = n41;
                    }
                    else {
                        b6 = b5;
                    }
                    max10 = Math.max(max10, b6);
                    final boolean b7 = n31 != 0 && a5.height == -1;
                    if (o) {
                        final int baseline2 = p5.getBaseline();
                        if (baseline2 != -1) {
                            int n42;
                            if ((n42 = a5.b) < 0) {
                                n42 = this.s;
                            }
                            final int n43 = ((n42 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                            w[n43] = Math.max(w[n43], baseline2);
                            x[n43] = Math.max(x[n43], b5 - baseline2);
                        }
                    }
                    n31 = (b7 ? 1 : 0);
                    n35 = n39;
                    n34 = n38;
                }
                ++k;
                n33 = n35;
            }
            this.t += ((View)this).getPaddingLeft() + ((View)this).getPaddingRight();
            final int a7 = w[1];
            int max11;
            if (a7 == -1 && w[0] == -1 && w[2] == -1 && w[3] == -1) {
                max11 = max9;
            }
            else {
                max11 = Math.max(max9, Math.max(w[3], Math.max(w[0], Math.max(a7, w[2]))) + Math.max(x[3], Math.max(x[0], Math.max(x[1], x[2]))));
            }
            n28 = max11;
            n27 = max10;
            n29 = n31;
            n25 = n32;
            n26 = n33;
        }
        if (n29 != 0 || mode2 == 1073741824) {
            n27 = n28;
        }
        ((View)this).setMeasuredDimension(resolveSizeAndState | (0xFF000000 & n26), View.resolveSizeAndState(Math.max(n27 + (((View)this).getPaddingTop() + ((View)this).getPaddingBottom()), ((View)this).getSuggestedMinimumHeight()), n2, n26 << 16));
        if (n7 != 0) {
            this.h(n25, n);
        }
    }
    
    public int v(final int n) {
        return 0;
    }
    
    public void w(final int n, final int n2) {
        this.t = 0;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int p2 = this.p;
        final boolean v = this.v;
        int n3;
        int combineMeasuredStates = n3 = 0;
        int max2;
        int max = max2 = n3;
        int i;
        int max3 = i = max2;
        int n5;
        int n4 = n5 = i;
        int n6 = 1;
        float n7 = 0.0f;
        while (i < virtualChildCount) {
            final View p3 = this.p(i);
            if (p3 == null) {
                this.t += this.v(i);
            }
            else if (p3.getVisibility() == 8) {
                i += this.m(p3, i);
            }
            else {
                if (this.q(i)) {
                    this.t += this.A;
                }
                final a a = (a)p3.getLayoutParams();
                final float a2 = a.a;
                n7 += a2;
                if (mode2 == 1073741824 && a.height == 0 && a2 > 0.0f) {
                    final int t = this.t;
                    this.t = Math.max(t, a.topMargin + t + a.bottomMargin);
                    n4 = 1;
                }
                else {
                    int height;
                    if (a.height == 0 && a2 > 0.0f) {
                        a.height = -2;
                        height = 0;
                    }
                    else {
                        height = Integer.MIN_VALUE;
                    }
                    int t2;
                    if (n7 == 0.0f) {
                        t2 = this.t;
                    }
                    else {
                        t2 = 0;
                    }
                    this.t(p3, i, n, 0, n2, t2);
                    if (height != Integer.MIN_VALUE) {
                        a.height = height;
                    }
                    final int measuredHeight = p3.getMeasuredHeight();
                    final int t3 = this.t;
                    this.t = Math.max(t3, t3 + measuredHeight + a.topMargin + a.bottomMargin + this.o(p3));
                    if (v) {
                        max = Math.max(measuredHeight, max);
                    }
                }
                final int n8 = i;
                if (p2 >= 0 && p2 == n8 + 1) {
                    this.q = this.t;
                }
                if (n8 < p2 && a.a > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                int n9;
                if (mode != 1073741824 && a.width == -1) {
                    n9 = (n5 = 1);
                }
                else {
                    n9 = 0;
                }
                int n10 = a.leftMargin + a.rightMargin;
                final int b = p3.getMeasuredWidth() + n10;
                n3 = Math.max(n3, b);
                final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, p3.getMeasuredState());
                final boolean b2 = n6 != 0 && a.width == -1;
                int max4;
                if (a.a > 0.0f) {
                    if (n9 == 0) {
                        n10 = b;
                    }
                    max2 = Math.max(max2, n10);
                    max4 = max3;
                }
                else {
                    if (n9 == 0) {
                        n10 = b;
                    }
                    max4 = Math.max(max3, n10);
                }
                final int m = this.m(p3, n8);
                max3 = max4;
                i = m + n8;
                final int n11 = combineMeasuredStates2;
                n6 = (b2 ? 1 : 0);
                combineMeasuredStates = n11;
            }
            ++i;
        }
        if (this.t > 0 && this.q(virtualChildCount)) {
            this.t += this.A;
        }
        final int n12 = virtualChildCount;
        if (v && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.t = 0;
            for (int j = 0; j < n12; ++j) {
                final View p4 = this.p(j);
                int max5;
                if (p4 == null) {
                    max5 = this.t + this.v(j);
                }
                else {
                    if (p4.getVisibility() == 8) {
                        j += this.m(p4, j);
                        continue;
                    }
                    final a a3 = (a)p4.getLayoutParams();
                    final int t4 = this.t;
                    max5 = Math.max(t4, t4 + max + a3.topMargin + a3.bottomMargin + this.o(p4));
                }
                this.t = max5;
            }
        }
        final int n13 = this.t + (((View)this).getPaddingTop() + ((View)this).getPaddingBottom());
        this.t = n13;
        final int resolveSizeAndState = View.resolveSizeAndState(Math.max(n13, ((View)this).getSuggestedMinimumHeight()), n2, 0);
        final int n14 = (0xFFFFFF & resolveSizeAndState) - this.t;
        int n15;
        int n16;
        if (n4 == 0 && (n14 == 0 || n7 <= 0.0f)) {
            final int max6 = Math.max(max3, max2);
            if (v && mode2 != 1073741824) {
                for (int k = 0; k < n12; ++k) {
                    final View p5 = this.p(k);
                    if (p5 != null) {
                        if (p5.getVisibility() != 8) {
                            if (((a)p5.getLayoutParams()).a > 0.0f) {
                                p5.measure(View$MeasureSpec.makeMeasureSpec(p5.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(max, 1073741824));
                            }
                        }
                    }
                }
            }
            n15 = combineMeasuredStates;
            n16 = max6;
        }
        else {
            final float u = this.u;
            if (u > 0.0f) {
                n7 = u;
            }
            this.t = 0;
            int n17 = n14;
            for (int l = 0; l < n12; ++l) {
                final View p6 = this.p(l);
                if (p6.getVisibility() != 8) {
                    final a a4 = (a)p6.getLayoutParams();
                    final float a5 = a4.a;
                    if (a5 > 0.0f) {
                        final int n18 = (int)(n17 * a5 / n7);
                        final int paddingLeft = ((View)this).getPaddingLeft();
                        final int paddingRight = ((View)this).getPaddingRight();
                        final int leftMargin = a4.leftMargin;
                        final int rightMargin = a4.rightMargin;
                        final int width = a4.width;
                        final int n19 = n17 - n18;
                        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n, paddingLeft + paddingRight + leftMargin + rightMargin, width);
                        int n20 = 0;
                        Label_1192: {
                            if (a4.height == 0 && mode2 == 1073741824) {
                                if (n18 > 0) {
                                    n20 = n18;
                                    break Label_1192;
                                }
                            }
                            else if ((n20 = p6.getMeasuredHeight() + n18) >= 0) {
                                break Label_1192;
                            }
                            n20 = 0;
                        }
                        p6.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n20, 1073741824));
                        combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, p6.getMeasuredState() & 0xFFFFFF00);
                        n7 -= a5;
                        n17 = n19;
                    }
                    int b3 = a4.leftMargin + a4.rightMargin;
                    final int b4 = p6.getMeasuredWidth() + b3;
                    n3 = Math.max(n3, b4);
                    if (mode == 1073741824 || a4.width != -1) {
                        b3 = b4;
                    }
                    max3 = Math.max(max3, b3);
                    if (n6 != 0 && a4.width == -1) {
                        n6 = 1;
                    }
                    else {
                        n6 = 0;
                    }
                    final int t5 = this.t;
                    this.t = Math.max(t5, p6.getMeasuredHeight() + t5 + a4.topMargin + a4.bottomMargin + this.o(p6));
                }
            }
            this.t += ((View)this).getPaddingTop() + ((View)this).getPaddingBottom();
            n15 = combineMeasuredStates;
            n16 = max3;
        }
        if (n6 != 0 || mode == 1073741824) {
            n16 = n3;
        }
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(n16 + (((View)this).getPaddingLeft() + ((View)this).getPaddingRight()), ((View)this).getSuggestedMinimumWidth()), n, n15), resolveSizeAndState);
        if (n5 != 0) {
            this.i(n12, n2);
        }
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public float a;
        public int b;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.b = -1;
            this.a = 0.0f;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = -1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.G0);
            this.a = obtainStyledAttributes.getFloat(i.I0, 0.0f);
            this.b = obtainStyledAttributes.getInt(i.H0, -1);
            obtainStyledAttributes.recycle();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = -1;
        }
    }
}
