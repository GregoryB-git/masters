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
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.b;
import e0.o;
import g.u;
import java.util.Iterator;
import l.f1;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements f.b, k {
    public boolean A;
    public androidx.appcompat.widget.a B;
    public j.a C;
    public f.a D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public e I;

    /* renamed from: x, reason: collision with root package name */
    public f f783x;

    /* renamed from: y, reason: collision with root package name */
    public Context f784y;

    /* renamed from: z, reason: collision with root package name */
    public int f785z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final void b(f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(f fVar) {
            return false;
        }
    }

    public static class c extends b.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f786a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f787b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f788c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f789d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f790e;
        public boolean f;

        public c() {
            super(-2, -2);
            this.f786a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f786a = cVar.f786a;
        }
    }

    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            boolean z10;
            boolean onMenuItemSelected;
            e eVar = ActionMenuView.this.I;
            if (eVar == null) {
                return false;
            }
            Toolbar.a aVar = (Toolbar.a) eVar;
            Iterator<o> it = Toolbar.this.O.f3807b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (it.next().a(menuItem)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                onMenuItemSelected = true;
            } else {
                Toolbar.h hVar = Toolbar.this.Q;
                onMenuItemSelected = hVar != null ? u.this.f5652b.onMenuItemSelected(0, menuItem) : false;
            }
            return onMenuItemSelected;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.D;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.G = (int) (56.0f * f);
        this.H = (int) (f * 4.0f);
        this.f784y = context;
        this.f785z = 0;
    }

    public static c i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            c cVar = new c();
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
            return cVar;
        }
        c cVar2 = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar2).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        }
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.f783x.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.f783x = fVar;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: e */
    public final b.a generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: f */
    public final b.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ b.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f783x == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.f783x = fVar;
            fVar.f669e = new d();
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.B = aVar;
            aVar.t = true;
            aVar.f885u = true;
            j.a aVar2 = this.C;
            if (aVar2 == null) {
                aVar2 = new b();
            }
            aVar.f624e = aVar2;
            this.f783x.b(aVar, this.f784y);
            androidx.appcompat.widget.a aVar3 = this.B;
            aVar3.f626p = this;
            this.f783x = aVar3.f622c;
        }
        return this.f783x;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.B;
        a.d dVar = aVar.f882q;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.f884s) {
            return aVar.f883r;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f785z;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.B;
        if (aVar != null) {
            aVar.g();
            if (this.B.k()) {
                this.B.h();
                this.B.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.B;
        if (aVar != null) {
            aVar.h();
            a.C0012a c0012a = aVar.B;
            if (c0012a == null || !c0012a.b()) {
                return;
            }
            c0012a.f724j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.E) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = f1.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f786a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    j(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f786a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f786a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.appcompat.widget.b, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r12;
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar;
        boolean z10 = this.E;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.E = z11;
        if (z10 != z11) {
            this.F = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.E && (fVar = this.f783x) != null && size != this.F) {
            this.F = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.E || childCount <= 0) {
            for (int i18 = 0; i18 < childCount; i18++) {
                c cVar = (c) getChildAt(i18).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i19 = size2 - paddingRight;
        int i20 = this.G;
        int i21 = i19 / i20;
        int i22 = i19 % i20;
        if (i21 == 0) {
            setMeasuredDimension(i19, 0);
            return;
        }
        int i23 = (i22 / i21) + i20;
        int childCount2 = getChildCount();
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z12 = false;
        int i28 = 0;
        long j10 = 0;
        while (i27 < childCount2) {
            View childAt = getChildAt(i27);
            int i29 = size3;
            if (childAt.getVisibility() == 8) {
                i15 = mode;
                i14 = i19;
                i16 = paddingBottom;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                int i30 = i25 + 1;
                if (z13) {
                    int i31 = this.H;
                    i13 = i30;
                    r12 = 0;
                    childAt.setPadding(i31, 0, i31, 0);
                } else {
                    i13 = i30;
                    r12 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f = r12;
                cVar2.f788c = r12;
                cVar2.f787b = r12;
                cVar2.f789d = r12;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = r12;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = r12;
                cVar2.f790e = z13 && ((ActionMenuItemView) childAt).l();
                int i32 = cVar2.f786a ? 1 : i21;
                i14 = i19;
                c cVar3 = (c) childAt.getLayoutParams();
                i15 = mode;
                i16 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = actionMenuItemView != null && actionMenuItemView.l();
                if (i32 <= 0 || (z14 && i32 < 2)) {
                    i17 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i32 * i23, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i17 = measuredWidth / i23;
                    if (measuredWidth % i23 != 0) {
                        i17++;
                    }
                    if (z14 && i17 < 2) {
                        i17 = 2;
                    }
                }
                cVar3.f789d = !cVar3.f786a && z14;
                cVar3.f787b = i17;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i17, 1073741824), makeMeasureSpec);
                i26 = Math.max(i26, i17);
                if (cVar2.f789d) {
                    i28++;
                }
                if (cVar2.f786a) {
                    z12 = true;
                }
                i21 -= i17;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (i17 == 1) {
                    j10 |= 1 << i27;
                }
                i25 = i13;
            }
            i27++;
            size3 = i29;
            paddingBottom = i16;
            i19 = i14;
            mode = i15;
        }
        int i33 = mode;
        int i34 = i19;
        int i35 = size3;
        boolean z15 = z12 && i25 == 2;
        boolean z16 = false;
        while (i28 > 0 && i21 > 0) {
            int i36 = Integer.MAX_VALUE;
            int i37 = 0;
            long j11 = 0;
            for (int i38 = 0; i38 < childCount2; i38++) {
                c cVar4 = (c) getChildAt(i38).getLayoutParams();
                if (cVar4.f789d) {
                    int i39 = cVar4.f787b;
                    if (i39 < i36) {
                        j11 = 1 << i38;
                        i36 = i39;
                        i37 = 1;
                    } else if (i39 == i36) {
                        i37++;
                        j11 |= 1 << i38;
                    }
                }
            }
            j10 |= j11;
            if (i37 > i21) {
                break;
            }
            int i40 = i36 + 1;
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt2 = getChildAt(i41);
                c cVar5 = (c) childAt2.getLayoutParams();
                int i42 = childMeasureSpec;
                int i43 = childCount2;
                long j12 = 1 << i41;
                if ((j11 & j12) != 0) {
                    if (z15 && cVar5.f790e && i21 == 1) {
                        int i44 = this.H;
                        childAt2.setPadding(i44 + i23, 0, i44, 0);
                    }
                    cVar5.f787b++;
                    cVar5.f = true;
                    i21--;
                } else if (cVar5.f787b == i40) {
                    j10 |= j12;
                }
                i41++;
                childMeasureSpec = i42;
                childCount2 = i43;
            }
            z16 = true;
        }
        int i45 = childMeasureSpec;
        int i46 = childCount2;
        boolean z17 = !z12 && i25 == 1;
        if (i21 <= 0 || j10 == 0 || (i21 >= i25 - 1 && !z17 && i26 <= 1)) {
            i12 = i46;
        } else {
            float bitCount = Long.bitCount(j10);
            if (!z17) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f790e) {
                    bitCount -= 0.5f;
                }
                int i47 = i46 - 1;
                if ((j10 & (1 << i47)) != 0 && !((c) getChildAt(i47).getLayoutParams()).f790e) {
                    bitCount -= 0.5f;
                }
            }
            int i48 = bitCount > 0.0f ? (int) ((i21 * i23) / bitCount) : 0;
            boolean z18 = z16;
            i12 = i46;
            for (int i49 = 0; i49 < i12; i49++) {
                if ((j10 & (1 << i49)) != 0) {
                    View childAt3 = getChildAt(i49);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f788c = i48;
                        cVar6.f = true;
                        if (i49 == 0 && !cVar6.f790e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i48) / 2;
                        }
                        z18 = true;
                    } else {
                        if (cVar6.f786a) {
                            cVar6.f788c = i48;
                            cVar6.f = true;
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i48) / 2;
                            z18 = true;
                        } else {
                            if (i49 != 0) {
                                ((LinearLayout.LayoutParams) cVar6).leftMargin = i48 / 2;
                            }
                            if (i49 != i12 - 1) {
                                ((LinearLayout.LayoutParams) cVar6).rightMargin = i48 / 2;
                            }
                        }
                    }
                }
            }
            z16 = z18;
        }
        if (z16) {
            for (int i50 = 0; i50 < i12; i50++) {
                View childAt4 = getChildAt(i50);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f787b * i23) + cVar7.f788c, 1073741824), i45);
                }
            }
        }
        setMeasuredDimension(i34, i33 != 1073741824 ? i24 : i35);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.B.f889y = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.I = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.B;
        a.d dVar = aVar.f882q;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            aVar.f884s = true;
            aVar.f883r = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.A = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f785z != i10) {
            this.f785z = i10;
            if (i10 == 0) {
                this.f784y = getContext();
            } else {
                this.f784y = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.B = aVar;
        aVar.f626p = this;
        this.f783x = aVar.f622c;
    }
}
