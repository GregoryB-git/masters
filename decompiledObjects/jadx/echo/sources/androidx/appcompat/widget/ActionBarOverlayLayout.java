package androidx.appcompat.widget;

import A.f;
import I.AbstractC0421s;
import I.C0417n;
import I.C0426x;
import I.InterfaceC0415l;
import I.InterfaceC0416m;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import e.AbstractC1230a;
import e.AbstractC1234e;
import l.InterfaceC1493A;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0415l, InterfaceC0416m {

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f8558S = {AbstractC1230a.f13331b, R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public int f8559A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f8560B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f8561C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f8562D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f8563E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f8564F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f8565G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f8566H;

    /* renamed from: I, reason: collision with root package name */
    public C0426x f8567I;

    /* renamed from: J, reason: collision with root package name */
    public C0426x f8568J;

    /* renamed from: K, reason: collision with root package name */
    public C0426x f8569K;

    /* renamed from: L, reason: collision with root package name */
    public C0426x f8570L;

    /* renamed from: M, reason: collision with root package name */
    public OverScroller f8571M;

    /* renamed from: N, reason: collision with root package name */
    public ViewPropertyAnimator f8572N;

    /* renamed from: O, reason: collision with root package name */
    public final AnimatorListenerAdapter f8573O;

    /* renamed from: P, reason: collision with root package name */
    public final Runnable f8574P;

    /* renamed from: Q, reason: collision with root package name */
    public final Runnable f8575Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0417n f8576R;

    /* renamed from: o, reason: collision with root package name */
    public int f8577o;

    /* renamed from: p, reason: collision with root package name */
    public int f8578p;

    /* renamed from: q, reason: collision with root package name */
    public ContentFrameLayout f8579q;

    /* renamed from: r, reason: collision with root package name */
    public ActionBarContainer f8580r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC1493A f8581s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f8582t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8583u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8584v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8585w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8586x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8587y;

    /* renamed from: z, reason: collision with root package name */
    public int f8588z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8572N = null;
            actionBarOverlayLayout.f8587y = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8572N = null;
            actionBarOverlayLayout.f8587y = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8572N = actionBarOverlayLayout.f8580r.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f8573O);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8572N = actionBarOverlayLayout.f8580r.animate().translationY(-ActionBarOverlayLayout.this.f8580r.getHeight()).setListener(ActionBarOverlayLayout.this.f8573O);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i7, int i8) {
            super(i7, i8);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8578p = 0;
        this.f8560B = new Rect();
        this.f8561C = new Rect();
        this.f8562D = new Rect();
        this.f8563E = new Rect();
        this.f8564F = new Rect();
        this.f8565G = new Rect();
        this.f8566H = new Rect();
        C0426x c0426x = C0426x.f2453b;
        this.f8567I = c0426x;
        this.f8568J = c0426x;
        this.f8569K = c0426x;
        this.f8570L = c0426x;
        this.f8573O = new a();
        this.f8574P = new b();
        this.f8575Q = new c();
        m(context);
        this.f8576R = new C0417n(this);
    }

    @Override // I.InterfaceC0415l
    public void a(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // I.InterfaceC0415l
    public void b(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // I.InterfaceC0415l
    public void c(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // I.InterfaceC0416m
    public void d(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        e(view, i7, i8, i9, i10, i11);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8582t == null || this.f8583u) {
            return;
        }
        int bottom = this.f8580r.getVisibility() == 0 ? (int) (this.f8580r.getBottom() + this.f8580r.getTranslationY() + 0.5f) : 0;
        this.f8582t.setBounds(0, bottom, getWidth(), this.f8582t.getIntrinsicHeight() + bottom);
        this.f8582t.draw(canvas);
    }

    @Override // I.InterfaceC0415l
    public void e(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // I.InterfaceC0415l
    public boolean f(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        l();
        this.f8575Q.run();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f8580r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8576R.a();
    }

    public CharSequence getTitle() {
        p();
        return this.f8581s.getTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1493A k(View view) {
        if (view instanceof InterfaceC1493A) {
            return (InterfaceC1493A) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void l() {
        removeCallbacks(this.f8574P);
        removeCallbacks(this.f8575Q);
        ViewPropertyAnimator viewPropertyAnimator = this.f8572N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void m(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f8558S);
        this.f8577o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f8582t = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f8583u = context.getApplicationInfo().targetSdkVersion < 19;
        this.f8571M = new OverScroller(context);
    }

    public final void n() {
        l();
        postDelayed(this.f8575Q, 600L);
    }

    public final void o() {
        l();
        postDelayed(this.f8574P, 600L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.p()
            I.x r8 = I.C0426x.s(r8)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r0 = r8.i()
            int r1 = r8.k()
            int r3 = r8.j()
            int r4 = r8.h()
            r2.<init>(r0, r1, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r7.f8580r
            r5 = 0
            r6 = 1
            r3 = 1
            r4 = 1
            r0 = r7
            boolean r0 = r0.h(r1, r2, r3, r4, r5, r6)
            android.graphics.Rect r1 = r7.f8560B
            I.AbstractC0421s.b(r7, r8, r1)
            android.graphics.Rect r1 = r7.f8560B
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r1 = r1.bottom
            I.x r1 = r8.l(r2, r3, r4, r1)
            r7.f8567I = r1
            I.x r2 = r7.f8568J
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L49
            I.x r0 = r7.f8567I
            r7.f8568J = r0
            r0 = 1
        L49:
            android.graphics.Rect r1 = r7.f8561C
            android.graphics.Rect r2 = r7.f8560B
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L5b
            android.graphics.Rect r0 = r7.f8561C
            android.graphics.Rect r1 = r7.f8560B
            r0.set(r1)
            goto L5d
        L5b:
            if (r0 == 0) goto L60
        L5d:
            r7.requestLayout()
        L60:
            I.x r8 = r8.a()
            I.x r8 = r8.c()
            I.x r8 = r8.b()
            android.view.WindowInsets r8 = r8.r()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m(getContext());
        AbstractC0421s.A(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int measuredHeight;
        C0426x a7;
        p();
        measureChildWithMargins(this.f8580r, i7, 0, i8, 0);
        e eVar = (e) this.f8580r.getLayoutParams();
        int max = Math.max(0, this.f8580r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f8580r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f8580r.getMeasuredState());
        boolean z7 = (AbstractC0421s.r(this) & 256) != 0;
        if (z7) {
            measuredHeight = this.f8577o;
            if (this.f8585w && this.f8580r.getTabContainer() != null) {
                measuredHeight += this.f8577o;
            }
        } else {
            measuredHeight = this.f8580r.getVisibility() != 8 ? this.f8580r.getMeasuredHeight() : 0;
        }
        this.f8562D.set(this.f8560B);
        C0426x c0426x = this.f8567I;
        this.f8569K = c0426x;
        if (this.f8584v || z7) {
            a7 = new C0426x.b(this.f8569K).c(f.b(c0426x.i(), this.f8569K.k() + measuredHeight, this.f8569K.j(), this.f8569K.h())).a();
        } else {
            Rect rect = this.f8562D;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            a7 = c0426x.l(0, measuredHeight, 0, 0);
        }
        this.f8569K = a7;
        h(this.f8579q, this.f8562D, true, true, true, true);
        if (!this.f8570L.equals(this.f8569K)) {
            C0426x c0426x2 = this.f8569K;
            this.f8570L = c0426x2;
            AbstractC0421s.c(this.f8579q, c0426x2);
        }
        measureChildWithMargins(this.f8579q, i7, 0, i8, 0);
        e eVar2 = (e) this.f8579q.getLayoutParams();
        int max3 = Math.max(max, this.f8579q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f8579q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f8579q.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (!this.f8586x || !z7) {
            return false;
        }
        if (r(f8)) {
            g();
        } else {
            q();
        }
        this.f8587y = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f8588z + i8;
        this.f8588z = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f8576R.b(view, view2, i7);
        this.f8588z = getActionBarHideOffset();
        l();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f8580r.getVisibility() != 0) {
            return false;
        }
        return this.f8586x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.f8586x || this.f8587y) {
            return;
        }
        if (this.f8588z <= this.f8580r.getHeight()) {
            o();
        } else {
            n();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        p();
        this.f8559A = i7;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f8578p = i7;
    }

    public void p() {
        if (this.f8579q == null) {
            this.f8579q = (ContentFrameLayout) findViewById(AbstractC1234e.f13414b);
            this.f8580r = (ActionBarContainer) findViewById(AbstractC1234e.f13415c);
            this.f8581s = k(findViewById(AbstractC1234e.f13413a));
        }
    }

    public final void q() {
        l();
        this.f8574P.run();
    }

    public final boolean r(float f7) {
        this.f8571M.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f8571M.getFinalY() > this.f8580r.getHeight();
    }

    public void setActionBarHideOffset(int i7) {
        l();
        this.f8580r.setTranslationY(-Math.max(0, Math.min(i7, this.f8580r.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f8585w = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f8586x) {
            this.f8586x = z7;
            if (z7) {
                return;
            }
            l();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        p();
        this.f8581s.setIcon(i7);
    }

    public void setLogo(int i7) {
        p();
        this.f8581s.c(i7);
    }

    public void setOverlayMode(boolean z7) {
        this.f8584v = z7;
        this.f8583u = z7 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i7) {
    }

    public void setWindowCallback(Window.Callback callback) {
        p();
        this.f8581s.b(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        p();
        this.f8581s.a(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        p();
        this.f8581s.setIcon(drawable);
    }
}
