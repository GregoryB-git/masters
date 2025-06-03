package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.f;
import e0.d0;
import e0.o0;
import e0.q;
import e0.r;
import e0.s;
import e0.s0;
import g.g;
import g.x;
import io.meduza.meduza.R;
import java.util.WeakHashMap;
import l.g0;
import l.h0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements g0, q, r {
    public static final int[] J = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public s0 A;
    public s0 B;
    public d C;
    public OverScroller D;
    public ViewPropertyAnimator E;
    public final a F;
    public final b G;
    public final c H;
    public final s I;

    /* renamed from: a, reason: collision with root package name */
    public int f764a;

    /* renamed from: b, reason: collision with root package name */
    public int f765b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f766c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f767d;

    /* renamed from: e, reason: collision with root package name */
    public h0 f768e;
    public Drawable f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f769o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f770p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f771q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f772r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f773s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f774u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f775v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f776w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f777x;

    /* renamed from: y, reason: collision with root package name */
    public s0 f778y;

    /* renamed from: z, reason: collision with root package name */
    public s0 f779z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f773s = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f773s = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.k();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f767d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.k();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f767d.animate().translationY(-ActionBarOverlayLayout.this.f767d.getHeight()).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f765b = 0;
        this.f775v = new Rect();
        this.f776w = new Rect();
        this.f777x = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        s0 s0Var = s0.f3822b;
        this.f778y = s0Var;
        this.f779z = s0Var;
        this.A = s0Var;
        this.B = s0Var;
        this.F = new a();
        this.G = new b();
        this.H = new c();
        l(context);
        this.I = new s();
    }

    public static boolean j(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // l.g0
    public final boolean a() {
        m();
        return this.f768e.a();
    }

    @Override // l.g0
    public final void b() {
        m();
        this.f768e.b();
    }

    @Override // l.g0
    public final boolean c() {
        m();
        return this.f768e.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // l.g0
    public final void d(f fVar, g.d dVar) {
        m();
        this.f768e.d(fVar, dVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f == null || this.f769o) {
            return;
        }
        if (this.f767d.getVisibility() == 0) {
            i10 = (int) (this.f767d.getTranslationY() + this.f767d.getBottom() + 0.5f);
        } else {
            i10 = 0;
        }
        this.f.setBounds(0, i10, getWidth(), this.f.getIntrinsicHeight() + i10);
        this.f.draw(canvas);
    }

    @Override // l.g0
    public final boolean e() {
        m();
        return this.f768e.e();
    }

    @Override // l.g0
    public final boolean f() {
        m();
        return this.f768e.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // l.g0
    public final boolean g() {
        m();
        return this.f768e.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f767d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.I;
        return sVar.f3821b | sVar.f3820a;
    }

    public CharSequence getTitle() {
        m();
        return this.f768e.getTitle();
    }

    @Override // l.g0
    public final void h(int i10) {
        m();
        if (i10 == 2) {
            this.f768e.r();
        } else if (i10 == 5) {
            this.f768e.s();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // l.g0
    public final void i() {
        m();
        this.f768e.h();
    }

    public final void k() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.f764a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f769o = context.getApplicationInfo().targetSdkVersion < 19;
        this.D = new OverScroller(context);
    }

    public final void m() {
        h0 wrapper;
        if (this.f766c == null) {
            this.f766c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f767d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof h0) {
                wrapper = (h0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    StringBuilder l10 = defpackage.f.l("Can't make a decor toolbar out of ");
                    l10.append(findViewById.getClass().getSimpleName());
                    throw new IllegalStateException(l10.toString());
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f768e = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        s0 c10 = s0.c(windowInsets, this);
        boolean j10 = j(this.f767d, new Rect(c10.f3823a.g().f16491a, c10.f3823a.g().f16492b, c10.f3823a.g().f16493c, c10.f3823a.g().f16494d), false);
        Rect rect = this.f775v;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        d0.d.b(this, c10, rect);
        Rect rect2 = this.f775v;
        s0 h10 = c10.f3823a.h(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f778y = h10;
        boolean z10 = true;
        if (!this.f779z.equals(h10)) {
            this.f779z = this.f778y;
            j10 = true;
        }
        if (this.f776w.equals(this.f775v)) {
            z10 = j10;
        } else {
            this.f776w.set(this.f775v);
        }
        if (z10) {
            requestLayout();
        }
        return c10.f3823a.a().f3823a.c().f3823a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        d0.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        s0 b10;
        m();
        measureChildWithMargins(this.f767d, i10, 0, i11, 0);
        e eVar = (e) this.f767d.getLayoutParams();
        int max = Math.max(0, this.f767d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f767d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f767d.getMeasuredState());
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.f764a;
            if (this.f771q && this.f767d.getTabContainer() != null) {
                measuredHeight += this.f764a;
            }
        } else {
            measuredHeight = this.f767d.getVisibility() != 8 ? this.f767d.getMeasuredHeight() : 0;
        }
        this.f777x.set(this.f775v);
        s0 s0Var = this.f778y;
        this.A = s0Var;
        if (this.f770p || z10) {
            x.b a10 = x.b.a(s0Var.f3823a.g().f16491a, this.A.f3823a.g().f16492b + measuredHeight, this.A.f3823a.g().f16493c, this.A.f3823a.g().f16494d + 0);
            s0 s0Var2 = this.A;
            int i12 = Build.VERSION.SDK_INT;
            s0.e dVar = i12 >= 30 ? new s0.d(s0Var2) : i12 >= 29 ? new s0.c(s0Var2) : new s0.b(s0Var2);
            dVar.d(a10);
            b10 = dVar.b();
        } else {
            Rect rect = this.f777x;
            rect.top += measuredHeight;
            rect.bottom += 0;
            b10 = s0Var.f3823a.h(0, measuredHeight, 0, 0);
        }
        this.A = b10;
        j(this.f766c, this.f777x, true);
        if (!this.B.equals(this.A)) {
            s0 s0Var3 = this.A;
            this.B = s0Var3;
            ContentFrameLayout contentFrameLayout = this.f766c;
            WindowInsets b11 = s0Var3.b();
            if (b11 != null) {
                WindowInsets a11 = d0.c.a(contentFrameLayout, b11);
                if (!a11.equals(b11)) {
                    s0.c(a11, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f766c, i10, 0, i11, 0);
        e eVar2 = (e) this.f766c.getLayoutParams();
        int max3 = Math.max(max, this.f766c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f766c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f766c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f10, boolean z10) {
        if (!this.f772r || !z10) {
            return false;
        }
        this.D.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.D.getFinalY() > this.f767d.getHeight()) {
            k();
            this.H.run();
        } else {
            k();
            this.G.run();
        }
        this.f773s = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // e0.q
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.t + i11;
        this.t = i14;
        setActionBarHideOffset(i14);
    }

    @Override // e0.q
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // e0.r
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        x xVar;
        j.g gVar;
        this.I.f3820a = i10;
        this.t = getActionBarHideOffset();
        k();
        d dVar = this.C;
        if (dVar == null || (gVar = (xVar = (x) dVar).f5692u) == null) {
            return;
        }
        gVar.a();
        xVar.f5692u = null;
    }

    @Override // e0.q
    public final void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f767d.getVisibility() != 0) {
            return false;
        }
        return this.f772r;
    }

    @Override // e0.q
    public final boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f772r || this.f773s) {
            return;
        }
        if (this.t <= this.f767d.getHeight()) {
            k();
            postDelayed(this.G, 600L);
        } else {
            k();
            postDelayed(this.H, 600L);
        }
    }

    @Override // e0.q
    public final void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m();
        int i11 = this.f774u ^ i10;
        this.f774u = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.C;
        if (dVar != null) {
            ((x) dVar).f5688p = !z11;
            if (z10 || !z11) {
                x xVar = (x) dVar;
                if (xVar.f5690r) {
                    xVar.f5690r = false;
                    xVar.y(true);
                }
            } else {
                x xVar2 = (x) dVar;
                if (!xVar2.f5690r) {
                    xVar2.f5690r = true;
                    xVar2.y(true);
                }
            }
        }
        if ((i11 & 256) == 0 || this.C == null) {
            return;
        }
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        d0.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f765b = i10;
        d dVar = this.C;
        if (dVar != null) {
            ((x) dVar).f5687o = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        k();
        this.f767d.setTranslationY(-Math.max(0, Math.min(i10, this.f767d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            ((x) this.C).f5687o = this.f765b;
            int i10 = this.f774u;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, o0> weakHashMap = d0.f3766a;
                d0.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f771q = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f772r) {
            this.f772r = z10;
            if (z10) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        m();
        this.f768e.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f768e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        m();
        this.f768e.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f770p = z10;
        this.f769o = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // l.g0
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f768e.setWindowCallback(callback);
    }

    @Override // l.g0
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f768e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
