package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b;
import l.d0;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements d.b, h {

    /* renamed from: D, reason: collision with root package name */
    public androidx.appcompat.view.menu.d f8592D;

    /* renamed from: E, reason: collision with root package name */
    public Context f8593E;

    /* renamed from: F, reason: collision with root package name */
    public int f8594F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8595G;

    /* renamed from: H, reason: collision with root package name */
    public androidx.appcompat.widget.a f8596H;

    /* renamed from: I, reason: collision with root package name */
    public g.a f8597I;

    /* renamed from: J, reason: collision with root package name */
    public d.a f8598J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8599K;

    /* renamed from: L, reason: collision with root package name */
    public int f8600L;

    /* renamed from: M, reason: collision with root package name */
    public int f8601M;

    /* renamed from: N, reason: collision with root package name */
    public int f8602N;

    /* renamed from: O, reason: collision with root package name */
    public e f8603O;

    public interface a {
        boolean b();

        boolean c();
    }

    public static class b implements g.a {
        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            return false;
        }
    }

    public static class c extends b.a {

        /* renamed from: c, reason: collision with root package name */
        public boolean f8604c;

        /* renamed from: d, reason: collision with root package name */
        public int f8605d;

        /* renamed from: e, reason: collision with root package name */
        public int f8606e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8607f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8608g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8609h;

        public c(int i7, int i8) {
            super(i7, i8);
            this.f8604c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f8604c = cVar.f8604c;
        }
    }

    public class d implements d.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f8603O;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            d.a aVar = ActionMenuView.this.f8598J;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int G(View view, int i7, int i8, int i9, int i10) {
        int i11;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - i10, View.MeasureSpec.getMode(i9));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z7 = false;
        boolean z8 = actionMenuItemView != null && actionMenuItemView.f();
        if (i8 > 0) {
            i11 = 2;
            if (!z8 || i8 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i12 = measuredWidth / i7;
                if (measuredWidth % i7 != 0) {
                    i12++;
                }
                if (!z8 || i12 >= 2) {
                    i11 = i12;
                }
                if (!cVar.f8604c && z8) {
                    z7 = true;
                }
                cVar.f8607f = z7;
                cVar.f8605d = i11;
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
                return i11;
            }
        }
        i11 = 0;
        if (!cVar.f8604c) {
            z7 = true;
        }
        cVar.f8607f = z7;
        cVar.f8605d = i11;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
        return i11;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f8795b <= 0) {
            cVar.f8795b = 16;
        }
        return cVar;
    }

    public c C() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f8604c = true;
        return generateDefaultLayoutParams;
    }

    public boolean D(int i7) {
        boolean z7 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof a)) {
            z7 = ((a) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof a)) ? z7 : z7 | ((a) childAt2).c();
    }

    public void E(androidx.appcompat.view.menu.d dVar) {
        this.f8592D = dVar;
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.f8596H;
        return aVar != null && aVar.B();
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    public final void H(int i7, int i8) {
        int i9;
        int i10;
        boolean z7;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        int i13;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f8601M;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z10 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j7 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i24 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i25 = i21 + 1;
                if (z11) {
                    int i26 = this.f8602N;
                    i13 = i25;
                    r14 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    i13 = i25;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f8609h = r14;
                cVar.f8606e = r14;
                cVar.f8605d = r14;
                cVar.f8607f = r14;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r14;
                cVar.f8608g = z11 && ((ActionMenuItemView) childAt).f();
                int G6 = G(childAt, i18, cVar.f8604c ? 1 : i16, childMeasureSpec, paddingTop);
                i22 = Math.max(i22, G6);
                if (cVar.f8607f) {
                    i23++;
                }
                if (cVar.f8604c) {
                    z10 = true;
                }
                i16 -= G6;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (G6 == 1) {
                    j7 |= 1 << i20;
                    i19 = i19;
                }
                i21 = i13;
            }
            i20++;
            size2 = i24;
        }
        int i27 = size2;
        boolean z12 = z10 && i21 == 2;
        boolean z13 = false;
        while (i23 > 0 && i16 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j8 = 0;
            while (i30 < childCount) {
                boolean z14 = z13;
                c cVar2 = (c) getChildAt(i30).getLayoutParams();
                int i31 = i19;
                if (cVar2.f8607f) {
                    int i32 = cVar2.f8605d;
                    if (i32 < i28) {
                        j8 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j8 |= 1 << i30;
                    }
                }
                i30++;
                i19 = i31;
                z13 = z14;
            }
            z7 = z13;
            i11 = i19;
            j7 |= j8;
            if (i29 > i16) {
                i9 = mode;
                i10 = i14;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i35 = i14;
                int i36 = mode;
                long j9 = 1 << i34;
                if ((j8 & j9) == 0) {
                    if (cVar3.f8605d == i33) {
                        j7 |= j9;
                    }
                    z9 = z12;
                } else {
                    if (z12 && cVar3.f8608g && i16 == 1) {
                        int i37 = this.f8602N;
                        z9 = z12;
                        childAt2.setPadding(i37 + i18, 0, i37, 0);
                    } else {
                        z9 = z12;
                    }
                    cVar3.f8605d++;
                    cVar3.f8609h = true;
                    i16--;
                }
                i34++;
                mode = i36;
                i14 = i35;
                z12 = z9;
            }
            i19 = i11;
            z13 = true;
        }
        i9 = mode;
        i10 = i14;
        z7 = z13;
        i11 = i19;
        boolean z15 = !z10 && i21 == 1;
        if (i16 <= 0 || j7 == 0 || (i16 >= i21 - 1 && !z15 && i22 <= 1)) {
            i12 = 0;
            z8 = z7;
        } else {
            float bitCount = Long.bitCount(j7);
            if (z15) {
                i12 = 0;
            } else {
                i12 = 0;
                if ((j7 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f8608g) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount - 1;
                if ((j7 & (1 << i38)) != 0 && !((c) getChildAt(i38).getLayoutParams()).f8608g) {
                    bitCount -= 0.5f;
                }
            }
            int i39 = bitCount > 0.0f ? (int) ((i16 * i18) / bitCount) : i12;
            z8 = z7;
            for (int i40 = i12; i40 < childCount; i40++) {
                if ((j7 & (1 << i40)) != 0) {
                    View childAt3 = getChildAt(i40);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f8606e = i39;
                        cVar4.f8609h = true;
                        if (i40 == 0 && !cVar4.f8608g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i39) / 2;
                        }
                        z8 = true;
                    } else if (cVar4.f8604c) {
                        cVar4.f8606e = i39;
                        cVar4.f8609h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i39) / 2;
                        z8 = true;
                    } else {
                        if (i40 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i39 / 2;
                        }
                        if (i40 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i39 / 2;
                        }
                    }
                }
            }
        }
        if (z8) {
            for (int i41 = i12; i41 < childCount; i41++) {
                View childAt4 = getChildAt(i41);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f8609h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f8605d * i18) + cVar5.f8606e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, i9 != 1073741824 ? i11 : i27);
    }

    public androidx.appcompat.view.menu.d I() {
        return this.f8592D;
    }

    public void J(g.a aVar, d.a aVar2) {
        this.f8597I = aVar;
        this.f8598J = aVar2;
    }

    public boolean K() {
        androidx.appcompat.widget.a aVar = this.f8596H;
        return aVar != null && aVar.H();
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(androidx.appcompat.view.menu.e eVar) {
        return this.f8592D.H(eVar, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f8592D == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(context);
            this.f8592D = dVar;
            dVar.L(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f8596H = aVar;
            aVar.G(true);
            androidx.appcompat.widget.a aVar2 = this.f8596H;
            g.a aVar3 = this.f8597I;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.k(aVar3);
            this.f8592D.b(this.f8596H, this.f8593E);
            this.f8596H.E(this);
        }
        return this.f8592D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f8596H.y();
    }

    public int getPopupTheme() {
        return this.f8594F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f8596H;
        if (aVar != null) {
            aVar.f(false);
            if (this.f8596H.B()) {
                this.f8596H.z();
                this.f8596H.H();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f8599K) {
            super.onLayout(z7, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean a7 = d0.a(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f8604c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (D(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a7) {
                        i11 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    D(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (a7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f8604c) {
                    int i22 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f8604c) {
                int i25 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = i25 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i7, int i8) {
        androidx.appcompat.view.menu.d dVar;
        boolean z7 = this.f8599K;
        boolean z8 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f8599K = z8;
        if (z7 != z8) {
            this.f8600L = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f8599K && (dVar = this.f8592D) != null && size != this.f8600L) {
            this.f8600L = size;
            dVar.G(true);
        }
        int childCount = getChildCount();
        if (this.f8599K && childCount > 0) {
            H(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            c cVar = (c) getChildAt(i9).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f8596H.D(z7);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f8603O = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f8596H.F(drawable);
    }

    public void setOverflowReserved(boolean z7) {
        this.f8595G = z7;
    }

    public void setPopupTheme(int i7) {
        if (this.f8594F != i7) {
            this.f8594F = i7;
            if (i7 == 0) {
                this.f8593E = getContext();
            } else {
                this.f8593E = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f8596H = aVar;
        aVar.E(this);
    }

    public void y() {
        androidx.appcompat.widget.a aVar = this.f8596H;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f8795b = 16;
        return cVar;
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f8601M = (int) (56.0f * f7);
        this.f8602N = (int) (f7 * 4.0f);
        this.f8593E = context;
        this.f8594F = 0;
    }
}
