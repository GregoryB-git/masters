package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.a0;
import e0.d0;
import e0.o0;
import io.meduza.meduza.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f793a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f794b;

    /* renamed from: c, reason: collision with root package name */
    public int f795c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f795c = -1;
        int[] iArr = a0.f1582x;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        d0.g(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f793a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f793a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f794b != z10) {
            if (!z10 || this.f793a) {
                this.f794b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f793a) {
            if (size > this.f795c && this.f794b) {
                setStacked(false);
            }
            this.f795c = size;
        }
        if (this.f794b || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f793a && !this.f794b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 >= childCount) {
                i15 = -1;
                break;
            } else if (getChildAt(i15).getVisibility() == 0) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f794b) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    }
                    i16++;
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i14 += paddingBottom;
        }
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        if (getMinimumHeight() != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f793a != z10) {
            this.f793a = z10;
            if (!z10 && this.f794b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
