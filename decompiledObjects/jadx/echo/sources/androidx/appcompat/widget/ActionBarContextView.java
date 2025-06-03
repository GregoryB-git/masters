package androidx.appcompat.widget;

import I.AbstractC0421s;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import e.AbstractC1230a;
import e.AbstractC1234e;
import e.AbstractC1235f;
import e.AbstractC1238i;
import l.AbstractC1502a;
import l.X;
import l.d0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1502a {

    /* renamed from: A, reason: collision with root package name */
    public TextView f8547A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f8548B;

    /* renamed from: C, reason: collision with root package name */
    public int f8549C;

    /* renamed from: D, reason: collision with root package name */
    public int f8550D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8551E;

    /* renamed from: F, reason: collision with root package name */
    public int f8552F;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f8553v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f8554w;

    /* renamed from: x, reason: collision with root package name */
    public View f8555x;

    /* renamed from: y, reason: collision with root package name */
    public View f8556y;

    /* renamed from: z, reason: collision with root package name */
    public LinearLayout f8557z;

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1230a.f13333d);
    }

    public final void d() {
        if (this.f8557z == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC1235f.f13439a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8557z = linearLayout;
            this.f8547A = (TextView) linearLayout.findViewById(AbstractC1234e.f13417e);
            this.f8548B = (TextView) this.f8557z.findViewById(AbstractC1234e.f13416d);
            if (this.f8549C != 0) {
                this.f8547A.setTextAppearance(getContext(), this.f8549C);
            }
            if (this.f8550D != 0) {
                this.f8548B.setTextAppearance(getContext(), this.f8550D);
            }
        }
        this.f8547A.setText(this.f8553v);
        this.f8548B.setText(this.f8554w);
        boolean z7 = !TextUtils.isEmpty(this.f8553v);
        boolean z8 = !TextUtils.isEmpty(this.f8554w);
        this.f8548B.setVisibility(z8 ? 0 : 8);
        this.f8557z.setVisibility((z7 || z8) ? 0 : 8);
        if (this.f8557z.getParent() == null) {
            addView(this.f8557z);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // l.AbstractC1502a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // l.AbstractC1502a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f8554w;
    }

    public CharSequence getTitle() {
        return this.f8553v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f16409r;
        if (aVar != null) {
            aVar.z();
            this.f16409r.A();
        }
    }

    @Override // l.AbstractC1502a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f8553v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean a7 = d0.a(this);
        int paddingRight = a7 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8555x;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8555x.getLayoutParams();
            int i11 = a7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = a7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int b7 = AbstractC1502a.b(paddingRight, i11, a7);
            paddingRight = AbstractC1502a.b(b7 + c(this.f8555x, b7, paddingTop, paddingTop2, a7), i12, a7);
        }
        int i13 = paddingRight;
        LinearLayout linearLayout = this.f8557z;
        if (linearLayout != null && this.f8556y == null && linearLayout.getVisibility() != 8) {
            i13 += c(this.f8557z, i13, paddingTop, paddingTop2, a7);
        }
        int i14 = i13;
        View view2 = this.f8556y;
        if (view2 != null) {
            c(view2, i14, paddingTop, paddingTop2, a7);
        }
        int paddingLeft = a7 ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f16408q;
        if (actionMenuView != null) {
            c(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i7);
        int i9 = this.f16410s;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.f8555x;
        if (view != null) {
            int a7 = a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8555x.getLayoutParams();
            paddingLeft = a7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f16408q;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = a(this.f16408q, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f8557z;
        if (linearLayout != null && this.f8556y == null) {
            if (this.f8551E) {
                this.f8557z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f8557z.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.f8557z.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f8556y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.f8556y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f16410s > 0) {
            setMeasuredDimension(size, i9);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // l.AbstractC1502a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // l.AbstractC1502a
    public void setContentHeight(int i7) {
        this.f16410s = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8556y;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8556y = view;
        if (view != null && (linearLayout = this.f8557z) != null) {
            removeView(linearLayout);
            this.f8557z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8554w = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f8553v = charSequence;
        d();
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f8551E) {
            requestLayout();
        }
        this.f8551E = z7;
    }

    @Override // l.AbstractC1502a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X s7 = X.s(context, attributeSet, AbstractC1238i.f13653w, i7, 0);
        AbstractC0421s.E(this, s7.f(AbstractC1238i.f13657x));
        this.f8549C = s7.l(AbstractC1238i.f13469B, 0);
        this.f8550D = s7.l(AbstractC1238i.f13465A, 0);
        this.f16410s = s7.k(AbstractC1238i.f13665z, 0);
        this.f8552F = s7.l(AbstractC1238i.f13661y, AbstractC1235f.f13442d);
        s7.t();
    }
}
