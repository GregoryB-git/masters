package androidx.appcompat.widget;

import I.AbstractC0421s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import e.AbstractC1234e;
import e.AbstractC1238i;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public boolean f8614o;

    /* renamed from: p, reason: collision with root package name */
    public int f8615p;

    /* renamed from: q, reason: collision with root package name */
    public int f8616q;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8615p = -1;
        this.f8616q = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13618n0);
        AbstractC0421s.B(this, context, AbstractC1238i.f13618n0, attributeSet, obtainStyledAttributes, 0, 0);
        this.f8614o = obtainStyledAttributes.getBoolean(AbstractC1238i.f13622o0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z7) {
        setOrientation(z7 ? 1 : 0);
        setGravity(z7 ? 5 : 80);
        View findViewById = findViewById(AbstractC1234e.f13435w);
        if (findViewById != null) {
            findViewById.setVisibility(z7 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i7) {
        int childCount = getChildCount();
        while (i7 < childCount) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f8616q, super.getMinimumHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:
    
        if (r1 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f8614o
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.f8615p
            if (r0 <= r1) goto L16
            boolean r1 = r5.b()
            if (r1 == 0) goto L16
            r5.setStacked(r2)
        L16:
            r5.f8615p = r0
        L18:
            boolean r1 = r5.b()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L31
        L2f:
            r0 = r6
            r1 = r2
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f8614o
            if (r0 == 0) goto L4d
            boolean r0 = r5.b()
            if (r0 != 0) goto L4d
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4d
            r5.setStacked(r3)
            goto L4f
        L4d:
            if (r1 == 0) goto L52
        L4f:
            super.onMeasure(r6, r7)
        L52:
            int r6 = r5.a(r2)
            if (r6 < 0) goto L9e
            android.view.View r7 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.getPaddingTop()
            int r7 = r7.getMeasuredHeight()
            int r1 = r1 + r7
            int r7 = r0.topMargin
            int r1 = r1 + r7
            int r7 = r0.bottomMargin
            int r1 = r1 + r7
            boolean r7 = r5.b()
            if (r7 == 0) goto L98
            int r6 = r6 + r3
            int r6 = r5.a(r6)
            if (r6 < 0) goto L96
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r6.getPaddingTop()
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r7 = r7 * r0
            int r7 = (int) r7
            int r6 = r6 + r7
            int r1 = r1 + r6
        L96:
            r2 = r1
            goto L9e
        L98:
            int r6 = r5.getPaddingBottom()
            int r2 = r1 + r6
        L9e:
            int r6 = I.AbstractC0421s.n(r5)
            if (r6 == r2) goto La7
            r5.setMinimumHeight(r2)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z7) {
        if (this.f8614o != z7) {
            this.f8614o = z7;
            if (!z7 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
