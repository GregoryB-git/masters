package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a;
import b.a0;
import e0.d0;
import e0.o0;
import io.meduza.meduza.R;
import java.util.WeakHashMap;
import l.f1;

/* loaded from: classes.dex */
public class ActionBarContextView extends l.a {
    public boolean A;
    public int B;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f754q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f755r;

    /* renamed from: s, reason: collision with root package name */
    public View f756s;
    public View t;

    /* renamed from: u, reason: collision with root package name */
    public View f757u;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f758v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f759w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f760x;

    /* renamed from: y, reason: collision with root package name */
    public int f761y;

    /* renamed from: z, reason: collision with root package name */
    public int f762z;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j.a f763a;

        public a(j.a aVar) {
            this.f763a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f763a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f1576q, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : x6.b.X(context, resourceId);
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        setBackground(drawable);
        this.f761y = obtainStyledAttributes.getResourceId(5, 0);
        this.f762z = obtainStyledAttributes.getResourceId(4, 0);
        this.f9254e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.B = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(j.a r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f756s
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.B
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f756s = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r5.f756s
        L1e:
            r5.addView(r0)
        L21:
            android.view.View r0 = r5.f756s
            r2 = 2131361850(0x7f0a003a, float:1.8343464E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.t = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r6 = r6.e()
            androidx.appcompat.widget.a r0 = r5.f9253d
            if (r0 == 0) goto L4e
            r0.h()
            androidx.appcompat.widget.a$a r0 = r0.B
            if (r0 == 0) goto L4e
            boolean r2 = r0.b()
            if (r2 == 0) goto L4e
            k.d r0 = r0.f724j
            r0.dismiss()
        L4e:
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f9253d = r0
            r2 = 1
            r0.t = r2
            r0.f885u = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.a r2 = r5.f9253d
            android.content.Context r3 = r5.f9251b
            r6.b(r2, r3)
            androidx.appcompat.widget.a r6 = r5.f9253d
            androidx.appcompat.view.menu.k r2 = r6.f626p
            if (r2 != 0) goto L86
            android.view.LayoutInflater r3 = r6.f623d
            int r4 = r6.f
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.k) r1
            r6.f626p = r1
            androidx.appcompat.view.menu.f r3 = r6.f622c
            r1.b(r3)
            r6.g()
        L86:
            androidx.appcompat.view.menu.k r1 = r6.f626p
            if (r2 == r1) goto L90
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L90:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f9252c = r1
            r6 = 0
            java.util.WeakHashMap<android.view.View, e0.o0> r2 = e0.d0.f3766a
            r1.setBackground(r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f9252c
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(j.a):void");
    }

    public final void g() {
        if (this.f758v == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f758v = linearLayout;
            this.f759w = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f760x = (TextView) this.f758v.findViewById(R.id.action_bar_subtitle);
            if (this.f761y != 0) {
                this.f759w.setTextAppearance(getContext(), this.f761y);
            }
            if (this.f762z != 0) {
                this.f760x.setTextAppearance(getContext(), this.f762z);
            }
        }
        this.f759w.setText(this.f754q);
        this.f760x.setText(this.f755r);
        boolean z10 = !TextUtils.isEmpty(this.f754q);
        boolean z11 = !TextUtils.isEmpty(this.f755r);
        int i10 = 0;
        this.f760x.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f758v;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f758v.getParent() == null) {
            addView(this.f758v);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // l.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // l.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f755r;
    }

    public CharSequence getTitle() {
        return this.f754q;
    }

    public final void h() {
        removeAllViews();
        this.f757u = null;
        this.f9252c = null;
        this.f9253d = null;
        View view = this.t;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f9253d;
        if (aVar != null) {
            aVar.h();
            a.C0012a c0012a = this.f9253d.B;
            if (c0012a == null || !c0012a.b()) {
                return;
            }
            c0012a.f724j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean a10 = f1.a(this);
        int paddingRight = a10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f756s;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f756s.getLayoutParams();
            int i14 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a10 ? paddingRight - i14 : paddingRight + i14;
            int d10 = l.a.d(this.f756s, i16, paddingTop, paddingTop2, a10) + i16;
            paddingRight = a10 ? d10 - i15 : d10 + i15;
        }
        LinearLayout linearLayout = this.f758v;
        if (linearLayout != null && this.f757u == null && linearLayout.getVisibility() != 8) {
            paddingRight += l.a.d(this.f758v, paddingRight, paddingTop, paddingTop2, a10);
        }
        View view2 = this.f757u;
        if (view2 != null) {
            l.a.d(view2, paddingRight, paddingTop, paddingTop2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f9252c;
        if (actionMenuView != null) {
            l.a.d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f9254e;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        View view = this.f756s;
        if (view != null) {
            int c10 = l.a.c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f756s.getLayoutParams();
            paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f9252c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = l.a.c(this.f9252c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f758v;
        if (linearLayout != null && this.f757u == null) {
            if (this.A) {
                this.f758v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f758v.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f758v.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = l.a.c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f757u;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.f757u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
        }
        if (this.f9254e <= 0) {
            int childCount = getChildCount();
            i12 = 0;
            for (int i18 = 0; i18 < childCount; i18++) {
                int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i12) {
                    i12 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // l.a
    public void setContentHeight(int i10) {
        this.f9254e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f757u;
        if (view2 != null) {
            removeView(view2);
        }
        this.f757u = view;
        if (view != null && (linearLayout = this.f758v) != null) {
            removeView(linearLayout);
            this.f758v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f755r = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f754q = charSequence;
        g();
        d0.i(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.A) {
            requestLayout();
        }
        this.A = z10;
    }

    @Override // l.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
