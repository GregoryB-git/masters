package androidx.appcompat.widget;

import I.AbstractC0421s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.b;
import e.AbstractC1234e;

/* loaded from: classes.dex */
public class AlertDialogLayout extends b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int y(View view) {
        int n7 = AbstractC0421s.n(view);
        if (n7 > 0) {
            return n7;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return y(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public final void i(int i7, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                b.a aVar = (b.a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i10 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i8, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = r2
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = r2
        L5a:
            if (r13 >= r10) goto Lbe
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lbb
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lbb
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.b$a r15 = (androidx.appcompat.widget.b.a) r15
            int r2 = r15.f8795b
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = I.AbstractC0421s.m(r17)
            int r2 = I.AbstractC0408e.a(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L98
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La1
        L92:
            int r2 = r8 - r4
        L94:
            int r3 = r15.rightMargin
            int r2 = r2 - r3
            goto La1
        L98:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
            goto L94
        La1:
            boolean r3 = r6.q(r13)
            if (r3 == 0) goto La8
            int r0 = r0 + r12
        La8:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.x(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lbb:
            int r13 = r13 + 1
            goto L5a
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i7, int i8) {
        if (z(i7, i8)) {
            return;
        }
        super.onMeasure(i7, i8);
    }

    public final void x(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    public final boolean z(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == AbstractC1234e.f13412B) {
                    view = childAt;
                } else if (id == AbstractC1234e.f13419g) {
                    view2 = childAt;
                } else {
                    if ((id != AbstractC1234e.f13421i && id != AbstractC1234e.f13422j) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i7);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i7, 0);
            paddingTop += view.getMeasuredHeight();
            i9 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i9 = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            i10 = y(view2);
            i11 = view2.getMeasuredHeight() - i10;
            paddingTop += i10;
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (view3 != null) {
            view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i12 = view3.getMeasuredHeight();
            paddingTop += i12;
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
        } else {
            i12 = 0;
        }
        int i14 = size - paddingTop;
        if (view2 != null) {
            int i15 = paddingTop - i10;
            int min = Math.min(i14, i11);
            if (min > 0) {
                i14 -= min;
                i10 += min;
            }
            view2.measure(i7, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            paddingTop = i15 + view2.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, view2.getMeasuredState());
        }
        if (view3 != null && i14 > 0) {
            view3.measure(i7, View.MeasureSpec.makeMeasureSpec(i12 + i14, mode));
            paddingTop = (paddingTop - i12) + view3.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, view3.getMeasuredState());
        }
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                i16 = Math.max(i16, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i16 + getPaddingLeft() + getPaddingRight(), i7, i9), View.resolveSizeAndState(paddingTop, i8, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        i(childCount, i8);
        return true;
    }
}
