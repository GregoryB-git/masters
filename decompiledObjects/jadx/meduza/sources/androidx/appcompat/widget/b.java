package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import b.a0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import defpackage.f;
import e0.d0;
import l.f1;

/* loaded from: classes.dex */
public class b extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f899a;

    /* renamed from: b, reason: collision with root package name */
    public int f900b;

    /* renamed from: c, reason: collision with root package name */
    public int f901c;

    /* renamed from: d, reason: collision with root package name */
    public int f902d;

    /* renamed from: e, reason: collision with root package name */
    public int f903e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public float f904o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f905p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f906q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f907r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f908s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f909u;

    /* renamed from: v, reason: collision with root package name */
    public int f910v;

    /* renamed from: w, reason: collision with root package name */
    public int f911w;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int resourceId;
        this.f899a = true;
        this.f900b = -1;
        this.f901c = 0;
        this.f903e = 8388659;
        int[] iArr = a0.A;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d0.g(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f904o = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f900b = obtainStyledAttributes.getInt(3, -1);
        this.f905p = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : x6.b.X(context, resourceId));
        this.f910v = obtainStyledAttributes.getInt(8, 0);
        this.f911w = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public final void c(Canvas canvas, int i10) {
        this.f908s.setBounds(getPaddingLeft() + this.f911w, i10, (getWidth() - getPaddingRight()) - this.f911w, this.f909u + i10);
        this.f908s.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i10) {
        this.f908s.setBounds(i10, getPaddingTop() + this.f911w, this.t + i10, (getHeight() - getPaddingBottom()) - this.f911w);
        this.f908s.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f902d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f900b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f900b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f900b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f901c;
        if (this.f902d == 1 && (i10 = this.f903e & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f900b;
    }

    public Drawable getDividerDrawable() {
        return this.f908s;
    }

    public int getDividerPadding() {
        return this.f911w;
    }

    public int getDividerWidth() {
        return this.t;
    }

    public int getGravity() {
        return this.f903e;
    }

    public int getOrientation() {
        return this.f902d;
    }

    public int getShowDividers() {
        return this.f910v;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f904o;
    }

    public final boolean h(int i10) {
        if (i10 == 0) {
            return (this.f910v & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f910v & 4) != 0;
        }
        if ((this.f910v & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.f908s == null) {
            return;
        }
        int i11 = 0;
        if (this.f902d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && h(i11)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f909u);
                }
                i11++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f909u : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = f1.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                d(canvas, a10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.t);
            }
            i11++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.t;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (a10) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i10 = getPaddingRight();
                right = (left - i10) - this.t;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a8, code lost:
    
        if (r14 < 0) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06c6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f899a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f900b = i10;
            return;
        }
        StringBuilder l10 = f.l("base aligned child index out of range (0, ");
        l10.append(getChildCount());
        l10.append(")");
        throw new IllegalArgumentException(l10.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f908s) {
            return;
        }
        this.f908s = drawable;
        if (drawable != null) {
            this.t = drawable.getIntrinsicWidth();
            this.f909u = drawable.getIntrinsicHeight();
        } else {
            this.t = 0;
            this.f909u = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f911w = i10;
    }

    public void setGravity(int i10) {
        if (this.f903e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i10 |= 48;
            }
            this.f903e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f903e;
        if ((8388615 & i12) != i11) {
            this.f903e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f905p = z10;
    }

    public void setOrientation(int i10) {
        if (this.f902d != i10) {
            this.f902d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f910v) {
            requestLayout();
        }
        this.f910v = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i12 = this.f903e;
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i11) {
            this.f903e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f904o = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
