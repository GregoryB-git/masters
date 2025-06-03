package androidx.appcompat.widget;

import I.AbstractC0421s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import e.AbstractC1238i;
import l.X;
import l.d0;

/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f8779A;

    /* renamed from: B, reason: collision with root package name */
    public int f8780B;

    /* renamed from: C, reason: collision with root package name */
    public int f8781C;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8782o;

    /* renamed from: p, reason: collision with root package name */
    public int f8783p;

    /* renamed from: q, reason: collision with root package name */
    public int f8784q;

    /* renamed from: r, reason: collision with root package name */
    public int f8785r;

    /* renamed from: s, reason: collision with root package name */
    public int f8786s;

    /* renamed from: t, reason: collision with root package name */
    public int f8787t;

    /* renamed from: u, reason: collision with root package name */
    public float f8788u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8789v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f8790w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f8791x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f8792y;

    /* renamed from: z, reason: collision with root package name */
    public int f8793z;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f8794a;

        /* renamed from: b, reason: collision with root package name */
        public int f8795b;

        public a(int i7, int i8) {
            super(i7, i8);
            this.f8795b = -1;
            this.f8794a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8795b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13490G0);
            this.f8794a = obtainStyledAttributes.getFloat(AbstractC1238i.f13498I0, 0.0f);
            this.f8795b = obtainStyledAttributes.getInt(AbstractC1238i.f13494H0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8795b = -1;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void i(int i7, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View p7 = p(i9);
            if (p7.getVisibility() != 8) {
                a aVar = (a) p7.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = p7.getMeasuredHeight();
                    measureChildWithMargins(p7, makeMeasureSpec, 0, i8, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i10;
                }
            }
        }
    }

    private void x(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void d(Canvas canvas) {
        int right;
        int left;
        int i7;
        int virtualChildCount = getVirtualChildCount();
        boolean a7 = d0.a(this);
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View p7 = p(i8);
            if (p7 != null && p7.getVisibility() != 8 && q(i8)) {
                a aVar = (a) p7.getLayoutParams();
                g(canvas, a7 ? p7.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (p7.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f8793z);
            }
        }
        if (q(virtualChildCount)) {
            View p8 = p(virtualChildCount - 1);
            if (p8 != null) {
                a aVar2 = (a) p8.getLayoutParams();
                if (a7) {
                    left = p8.getLeft();
                    i7 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i7) - this.f8793z;
                } else {
                    right = p8.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (a7) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i7 = getPaddingRight();
                right = (left - i7) - this.f8793z;
            }
            g(canvas, right);
        }
    }

    public void e(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View p7 = p(i7);
            if (p7 != null && p7.getVisibility() != 8 && q(i7)) {
                f(canvas, (p7.getTop() - ((ViewGroup.MarginLayoutParams) ((a) p7.getLayoutParams())).topMargin) - this.f8779A);
            }
        }
        if (q(virtualChildCount)) {
            View p8 = p(virtualChildCount - 1);
            f(canvas, p8 == null ? (getHeight() - getPaddingBottom()) - this.f8779A : p8.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) p8.getLayoutParams())).bottomMargin);
        }
    }

    public void f(Canvas canvas, int i7) {
        this.f8792y.setBounds(getPaddingLeft() + this.f8781C, i7, (getWidth() - getPaddingRight()) - this.f8781C, this.f8779A + i7);
        this.f8792y.draw(canvas);
    }

    public void g(Canvas canvas, int i7) {
        this.f8792y.setBounds(i7, getPaddingTop() + this.f8781C, this.f8793z + i7, (getHeight() - getPaddingBottom()) - this.f8781C);
        this.f8792y.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f8783p < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f8783p;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8783p == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f8784q;
        if (this.f8785r == 1 && (i7 = this.f8786s & 112) != 48) {
            if (i7 == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8787t) / 2;
            } else if (i7 == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8787t;
            }
        }
        return i9 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8783p;
    }

    public Drawable getDividerDrawable() {
        return this.f8792y;
    }

    public int getDividerPadding() {
        return this.f8781C;
    }

    public int getDividerWidth() {
        return this.f8793z;
    }

    public int getGravity() {
        return this.f8786s;
    }

    public int getOrientation() {
        return this.f8785r;
    }

    public int getShowDividers() {
        return this.f8780B;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8788u;
    }

    public final void h(int i7, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View p7 = p(i9);
            if (p7.getVisibility() != 8) {
                a aVar = (a) p7.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = p7.getMeasuredWidth();
                    measureChildWithMargins(p7, i8, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i10;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i7 = this.f8785r;
        if (i7 == 0) {
            return new a(-2, -2);
        }
        if (i7 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int m(View view, int i7) {
        return 0;
    }

    public int n(View view) {
        return 0;
    }

    public int o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f8792y == null) {
            return;
        }
        if (this.f8785r == 1) {
            e(canvas);
        } else {
            d(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        if (this.f8785r == 1) {
            s(i7, i8, i9, i10);
        } else {
            r(i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        if (this.f8785r == 1) {
            w(i7, i8);
        } else {
            u(i7, i8);
        }
    }

    public View p(int i7) {
        return getChildAt(i7);
    }

    public boolean q(int i7) {
        if (i7 == 0) {
            return (this.f8780B & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f8780B & 4) != 0;
        }
        if ((this.f8780B & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.r(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f8786s
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f8787t
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f8787t
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.p(r12)
            r14 = 1
            if (r13 != 0) goto L5a
            int r1 = r6.v(r12)
            int r0 = r0 + r1
        L57:
            r1 = r14
            goto Lc6
        L5a:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L57
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.b$a r5 = (androidx.appcompat.widget.b.a) r5
            int r1 = r5.f8795b
            if (r1 >= 0) goto L76
            r1 = r11
        L76:
            int r2 = I.AbstractC0421s.m(r17)
            int r1 = I.AbstractC0408e.a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L90
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L88:
            r2 = r1
            goto L99
        L8a:
            int r1 = r8 - r4
        L8c:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            goto L88
        L90:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            goto L8c
        L99:
            boolean r1 = r6.q(r12)
            if (r1 == 0) goto La2
            int r1 = r6.f8779A
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.n(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.x(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.o(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z7) {
        this.f8782o = z7;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f8783p = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8792y) {
            return;
        }
        this.f8792y = drawable;
        if (drawable != null) {
            this.f8793z = drawable.getIntrinsicWidth();
            this.f8779A = drawable.getIntrinsicHeight();
        } else {
            this.f8793z = 0;
            this.f8779A = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f8781C = i7;
    }

    public void setGravity(int i7) {
        if (this.f8786s != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f8786s = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f8786s;
        if ((8388615 & i9) != i8) {
            this.f8786s = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f8789v = z7;
    }

    public void setOrientation(int i7) {
        if (this.f8785r != i7) {
            this.f8785r = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f8780B) {
            requestLayout();
        }
        this.f8780B = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f8786s;
        if ((i9 & 112) != i8) {
            this.f8786s = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f8788u = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(View view, int i7, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x03ae, code lost:
    
        if (r8 > 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b1, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b2, code lost:
    
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c5, code lost:
    
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03c2, code lost:
    
        if (r8 < 0) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.u(int, int):void");
    }

    public int v(int i7) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d1, code lost:
    
        if (r15 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d4, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d5, code lost:
    
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e8, code lost:
    
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0313, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r14).width == (-1)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e5, code lost:
    
        if (r15 < 0) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.w(int, int):void");
    }

    public b(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8782o = true;
        this.f8783p = -1;
        this.f8784q = 0;
        this.f8786s = 8388659;
        X s7 = X.s(context, attributeSet, AbstractC1238i.f13654w0, i7, 0);
        AbstractC0421s.B(this, context, AbstractC1238i.f13654w0, attributeSet, s7.o(), i7, 0);
        int i8 = s7.i(AbstractC1238i.f13662y0, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = s7.i(AbstractC1238i.f13658x0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean a7 = s7.a(AbstractC1238i.f13666z0, true);
        if (!a7) {
            setBaselineAligned(a7);
        }
        this.f8788u = s7.g(AbstractC1238i.f13470B0, -1.0f);
        this.f8783p = s7.i(AbstractC1238i.f13466A0, -1);
        this.f8789v = s7.a(AbstractC1238i.f13482E0, false);
        setDividerDrawable(s7.f(AbstractC1238i.f13474C0));
        this.f8780B = s7.i(AbstractC1238i.f13486F0, 0);
        this.f8781C = s7.e(AbstractC1238i.f13478D0, 0);
        s7.t();
    }
}
