package androidx.core.widget;

import I.AbstractC0413j;
import I.AbstractC0421s;
import I.C0404a;
import I.C0414k;
import I.C0417n;
import I.InterfaceC0416m;
import J.u;
import J.w;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import v.AbstractC2046a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0416m {

    /* renamed from: O, reason: collision with root package name */
    public static final float f8843O = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: P, reason: collision with root package name */
    public static final a f8844P = new a();

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f8845Q = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public boolean f8846A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8847B;

    /* renamed from: C, reason: collision with root package name */
    public int f8848C;

    /* renamed from: D, reason: collision with root package name */
    public int f8849D;

    /* renamed from: E, reason: collision with root package name */
    public int f8850E;

    /* renamed from: F, reason: collision with root package name */
    public int f8851F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f8852G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f8853H;

    /* renamed from: I, reason: collision with root package name */
    public int f8854I;

    /* renamed from: J, reason: collision with root package name */
    public int f8855J;

    /* renamed from: K, reason: collision with root package name */
    public d f8856K;

    /* renamed from: L, reason: collision with root package name */
    public final C0417n f8857L;

    /* renamed from: M, reason: collision with root package name */
    public final C0414k f8858M;

    /* renamed from: N, reason: collision with root package name */
    public float f8859N;

    /* renamed from: o, reason: collision with root package name */
    public final float f8860o;

    /* renamed from: p, reason: collision with root package name */
    public long f8861p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f8862q;

    /* renamed from: r, reason: collision with root package name */
    public OverScroller f8863r;

    /* renamed from: s, reason: collision with root package name */
    public EdgeEffect f8864s;

    /* renamed from: t, reason: collision with root package name */
    public EdgeEffect f8865t;

    /* renamed from: u, reason: collision with root package name */
    public int f8866u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8867v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8868w;

    /* renamed from: x, reason: collision with root package name */
    public View f8869x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8870y;

    /* renamed from: z, reason: collision with root package name */
    public VelocityTracker f8871z;

    public static class a extends C0404a {
        @Override // I.C0404a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            w.a(accessibilityEvent, nestedScrollView.getScrollX());
            w.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // I.C0404a
        public void g(View view, u uVar) {
            int scrollRange;
            super.g(view, uVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            uVar.I(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            uVar.M(true);
            if (nestedScrollView.getScrollY() > 0) {
                uVar.a(u.a.f2660q);
                uVar.a(u.a.f2628B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                uVar.a(u.a.f2659p);
                uVar.a(u.a.f2630D);
            }
        }

        @Override // I.C0404a
        public boolean j(View view, int i7, Bundle bundle) {
            if (super.j(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public int f8872o;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i7) {
                return new d[i7];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f8872o = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f8872o + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f8872o);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2046a.f20020c);
    }

    public static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f8859N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f8859N = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f8859N;
    }

    public static int k(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    public final void A() {
        this.f8863r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f8848C = viewConfiguration.getScaledTouchSlop();
        this.f8849D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8850E = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void B() {
        if (this.f8871z == null) {
            this.f8871z = VelocityTracker.obtain();
        }
    }

    public final void C(int i7, int i8) {
        this.f8866u = i7;
        this.f8851F = i8;
        W(2, 0);
    }

    public final boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    public final boolean F(View view, int i7, int i8) {
        view.getDrawingRect(this.f8862q);
        offsetDescendantRectToMyCoords(view, this.f8862q);
        return this.f8862q.bottom + i7 >= getScrollY() && this.f8862q.top - i7 <= getScrollY() + i8;
    }

    public final void G(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f8858M.d(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    public final void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8851F) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f8866u = (int) motionEvent.getY(i7);
            this.f8851F = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f8871z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean I(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7) {
        boolean z8;
        boolean z9;
        int overScrollMode = getOverScrollMode();
        boolean z10 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z11 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        int i15 = i9 + i7;
        int i16 = !z12 ? 0 : i13;
        int i17 = i10 + i8;
        int i18 = !z13 ? 0 : i14;
        int i19 = -i16;
        int i20 = i16 + i11;
        int i21 = -i18;
        int i22 = i18 + i12;
        if (i15 > i20) {
            i15 = i20;
            z8 = true;
        } else if (i15 < i19) {
            z8 = true;
            i15 = i19;
        } else {
            z8 = false;
        }
        if (i17 > i22) {
            i17 = i22;
            z9 = true;
        } else if (i17 < i21) {
            z9 = true;
            i17 = i21;
        } else {
            z9 = false;
        }
        if (z9 && !x(1)) {
            this.f8863r.springBack(i15, i17, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i15, i17, z8, z9);
        return z8 || z9;
    }

    public boolean J(int i7) {
        boolean z7 = i7 == 130;
        int height = getHeight();
        if (z7) {
            this.f8862q.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f8862q;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f8862q.top = getScrollY() - height;
            Rect rect2 = this.f8862q;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f8862q;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return N(i7, i8, i9);
    }

    public final void K() {
        VelocityTracker velocityTracker = this.f8871z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8871z = null;
        }
    }

    public final int L(int i7, float f7) {
        float d7;
        EdgeEffect edgeEffect;
        float width = f7 / getWidth();
        float height = i7 / getHeight();
        float f8 = 0.0f;
        if (L.c.b(this.f8864s) != 0.0f) {
            d7 = -L.c.d(this.f8864s, -height, width);
            if (L.c.b(this.f8864s) == 0.0f) {
                edgeEffect = this.f8864s;
                edgeEffect.onRelease();
            }
            f8 = d7;
        } else if (L.c.b(this.f8865t) != 0.0f) {
            d7 = L.c.d(this.f8865t, height, 1.0f - width);
            if (L.c.b(this.f8865t) == 0.0f) {
                edgeEffect = this.f8865t;
                edgeEffect.onRelease();
            }
            f8 = d7;
        }
        int round = Math.round(f8 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    public final void M(boolean z7) {
        if (z7) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.f8855J = getScrollY();
        AbstractC0421s.x(this);
    }

    public final boolean N(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = false;
        boolean z8 = i7 == 33;
        View t7 = t(z8, i8, i9);
        if (t7 == null) {
            t7 = this;
        }
        if (i8 < scrollY || i9 > i10) {
            O(z8 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z7 = true;
        }
        if (t7 != findFocus()) {
            t7.requestFocus(i7);
        }
        return z7;
    }

    public final int O(int i7, int i8, int i9, boolean z7) {
        int i10;
        int i11;
        EdgeEffect edgeEffect;
        if (i9 == 1) {
            W(2, i9);
        }
        if (n(0, i7, this.f8853H, this.f8852G, i9)) {
            i10 = i7 - this.f8853H[1];
            i11 = this.f8852G[1];
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z8 = i() && !z7;
        boolean z9 = I(0, i10, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i9);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f8853H;
        iArr[1] = 0;
        o(0, scrollY2, 0, i10 - scrollY2, this.f8852G, i9, iArr);
        int i12 = i11 + this.f8852G[1];
        int i13 = i10 - this.f8853H[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z8) {
                L.c.d(this.f8864s, (-i13) / getHeight(), i8 / getWidth());
                if (!this.f8865t.isFinished()) {
                    edgeEffect = this.f8865t;
                    edgeEffect.onRelease();
                }
            }
        } else if (i14 > scrollRange && z8) {
            L.c.d(this.f8865t, i13 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!this.f8864s.isFinished()) {
                edgeEffect = this.f8864s;
                edgeEffect.onRelease();
            }
        }
        if (!this.f8864s.isFinished() || !this.f8865t.isFinished()) {
            AbstractC0421s.x(this);
        } else if (z9 && i9 == 0) {
            this.f8871z.clear();
        }
        if (i9 == 1) {
            Y(i9);
            this.f8864s.onRelease();
            this.f8865t.onRelease();
        }
        return i12;
    }

    public final void P(View view) {
        view.getDrawingRect(this.f8862q);
        offsetDescendantRectToMyCoords(view, this.f8862q);
        int l7 = l(this.f8862q);
        if (l7 != 0) {
            scrollBy(0, l7);
        }
    }

    public final boolean Q(Rect rect, boolean z7) {
        int l7 = l(rect);
        boolean z8 = l7 != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, l7);
            } else {
                S(0, l7);
            }
        }
        return z8;
    }

    public final boolean R(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return w(-i7) < L.c.b(edgeEffect) * ((float) getHeight());
    }

    public final void S(int i7, int i8) {
        T(i7, i8, 250, false);
    }

    public final void T(int i7, int i8, int i9, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f8861p > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f8863r.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            M(z7);
        } else {
            if (!this.f8863r.isFinished()) {
                g();
            }
            scrollBy(i7, i8);
        }
        this.f8861p = AnimationUtils.currentAnimationTimeMillis();
    }

    public void U(int i7, int i8, int i9, boolean z7) {
        T(i7 - getScrollX(), i8 - getScrollY(), i9, z7);
    }

    public void V(int i7, int i8, boolean z7) {
        U(i7, i8, 250, z7);
    }

    public boolean W(int i7, int i8) {
        return this.f8858M.m(i7, i8);
    }

    public final boolean X(MotionEvent motionEvent) {
        boolean z7;
        if (L.c.b(this.f8864s) != 0.0f) {
            L.c.d(this.f8864s, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        if (L.c.b(this.f8865t) == 0.0f) {
            return z7;
        }
        L.c.d(this.f8865t, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Y(int i7) {
        this.f8858M.n(i7);
    }

    @Override // I.InterfaceC0415l
    public void a(View view, View view2, int i7, int i8) {
        this.f8857L.c(view, view2, i7, i8);
        W(2, i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // I.InterfaceC0415l
    public void b(View view, int i7) {
        this.f8857L.d(view, i7);
        Y(i7);
    }

    @Override // I.InterfaceC0415l
    public void c(View view, int i7, int i8, int[] iArr, int i9) {
        n(i7, i8, iArr, null, i9);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f8863r.isFinished()) {
            return;
        }
        this.f8863r.computeScrollOffset();
        int currY = this.f8863r.getCurrY();
        int m7 = m(currY - this.f8855J);
        this.f8855J = currY;
        int[] iArr = this.f8853H;
        iArr[1] = 0;
        n(0, m7, iArr, null, 1);
        int i7 = m7 - this.f8853H[1];
        int scrollRange = getScrollRange();
        if (i7 != 0) {
            int scrollY = getScrollY();
            I(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f8853H;
            iArr2[1] = 0;
            o(0, scrollY2, 0, i8, this.f8852G, 1, iArr2);
            i7 = i8 - this.f8853H[1];
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i7 < 0) {
                    if (this.f8864s.isFinished()) {
                        edgeEffect = this.f8864s;
                        edgeEffect.onAbsorb((int) this.f8863r.getCurrVelocity());
                    }
                } else if (this.f8865t.isFinished()) {
                    edgeEffect = this.f8865t;
                    edgeEffect.onAbsorb((int) this.f8863r.getCurrVelocity());
                }
            }
            g();
        }
        if (this.f8863r.isFinished()) {
            Y(1);
        } else {
            AbstractC0421s.x(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // I.InterfaceC0416m
    public void d(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        G(i10, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z7) {
        return this.f8858M.a(f7, f8, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f8858M.b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return n(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f8858M.e(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i8 = 0;
        if (!this.f8864s.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            this.f8864s.setSize(width, height);
            if (this.f8864s.draw(canvas)) {
                AbstractC0421s.x(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f8865t.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i8 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f8865t.setSize(width2, height2);
        if (this.f8865t.draw(canvas)) {
            AbstractC0421s.x(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // I.InterfaceC0415l
    public void e(View view, int i7, int i8, int i9, int i10, int i11) {
        G(i10, i11, null);
    }

    @Override // I.InterfaceC0415l
    public boolean f(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    public final void g() {
        this.f8863r.abortAnimation();
        Y(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f8857L.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f8862q);
            offsetDescendantRectToMyCoords(findNextFocus, this.f8862q);
            O(l(this.f8862q), 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public final boolean i() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f8858M.j();
    }

    public final boolean j() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public int l(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public int m(int i7) {
        int height = getHeight();
        if (i7 > 0 && L.c.b(this.f8864s) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * L.c.d(this.f8864s, ((-i7) * 4.0f) / height, 0.5f));
            if (round != i7) {
                this.f8864s.finish();
            }
            return i7 - round;
        }
        if (i7 >= 0 || L.c.b(this.f8865t) == 0.0f) {
            return i7;
        }
        float f7 = height;
        int round2 = Math.round((f7 / 4.0f) * L.c.d(this.f8865t, (i7 * 4.0f) / f7, 0.5f));
        if (round2 != i7) {
            this.f8865t.finish();
        }
        return i7 - round2;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f8858M.c(i7, i8, iArr, iArr2, i9);
    }

    public void o(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        this.f8858M.d(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8868w = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        float f7;
        if (motionEvent.getAction() != 8 || this.f8870y) {
            return false;
        }
        if (AbstractC0413j.a(motionEvent, 2)) {
            f7 = motionEvent.getAxisValue(9);
            i7 = (int) motionEvent.getX();
        } else if (AbstractC0413j.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i7 = getWidth() / 2;
            f7 = axisValue;
        } else {
            i7 = 0;
            f7 = 0.0f;
        }
        if (f7 == 0.0f) {
            return false;
        }
        O(-((int) (f7 * getVerticalScrollFactorCompat())), i7, 1, AbstractC0413j.a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.f8870y) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = this.f8851F;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y7 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y7 - this.f8866u) > this.f8848C && (2 & getNestedScrollAxes()) == 0) {
                                this.f8870y = true;
                                this.f8866u = y7;
                                B();
                                this.f8871z.addMovement(motionEvent);
                                this.f8854I = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f8870y = false;
            this.f8851F = -1;
            K();
            if (this.f8863r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AbstractC0421s.x(this);
            }
            Y(0);
        } else {
            int y8 = (int) motionEvent.getY();
            if (y((int) motionEvent.getX(), y8)) {
                this.f8866u = y8;
                this.f8851F = motionEvent.getPointerId(0);
                z();
                this.f8871z.addMovement(motionEvent);
                this.f8863r.computeScrollOffset();
                if (!X(motionEvent) && this.f8863r.isFinished()) {
                    z7 = false;
                }
                this.f8870y = z7;
                W(2, 0);
            } else {
                if (!X(motionEvent) && this.f8863r.isFinished()) {
                    z7 = false;
                }
                this.f8870y = z7;
                K();
            }
        }
        return this.f8870y;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        int i11 = 0;
        this.f8867v = false;
        View view = this.f8869x;
        if (view != null && E(view, this)) {
            P(this.f8869x);
        }
        this.f8869x = null;
        if (!this.f8868w) {
            if (this.f8856K != null) {
                scrollTo(getScrollX(), this.f8856K.f8872o);
                this.f8856K = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int k7 = k(scrollY, paddingTop, i11);
            if (k7 != scrollY) {
                scrollTo(getScrollX(), k7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f8868w = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f8846A && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        u((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        c(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        G(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        a(view, view2, i7, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i7, int i8, boolean z7, boolean z8) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i7) : focusFinder.findNextFocusFromRect(this, rect, i7);
        if (findNextFocus == null || D(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f8856K = dVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f8872o = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !F(findFocus, 0, i10)) {
            return;
        }
        findFocus.getDrawingRect(this.f8862q);
        offsetDescendantRectToMyCoords(findFocus, this.f8862q);
        p(l(this.f8862q));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return f(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r12.f8863r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        I.AbstractC0421s.x(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r12.f8863r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i7) {
        if (i7 != 0) {
            if (this.f8847B) {
                S(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    public final boolean q(int i7) {
        EdgeEffect edgeEffect;
        if (L.c.b(this.f8864s) != 0.0f) {
            if (R(this.f8864s, i7)) {
                edgeEffect = this.f8864s;
                edgeEffect.onAbsorb(i7);
            } else {
                i7 = -i7;
                u(i7);
            }
        } else {
            if (L.c.b(this.f8865t) == 0.0f) {
                return false;
            }
            i7 = -i7;
            if (R(this.f8865t, i7)) {
                edgeEffect = this.f8865t;
                edgeEffect.onAbsorb(i7);
            }
            u(i7);
        }
        return true;
    }

    public final void r() {
        this.f8851F = -1;
        this.f8870y = false;
        K();
        Y(0);
        this.f8864s.onRelease();
        this.f8865t.onRelease();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f8867v) {
            this.f8869x = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        if (z7) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f8867v = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f8862q.setEmpty();
        if (!j()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? h(33) : v(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? h(130) : v(130);
        }
        if (keyCode != 62) {
            return false;
        }
        J(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int k7 = k(i7, width, width2);
            int k8 = k(i8, height, height2);
            if (k7 == getScrollX() && k8 == getScrollY()) {
                return;
            }
            super.scrollTo(k7, k8);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.f8846A) {
            this.f8846A = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        this.f8858M.k(z7);
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.f8847B = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return W(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Y(0);
    }

    public final View t(boolean z7, int i7, int i8) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z9 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9) {
                            if (!z10) {
                            }
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else {
                        if (!z10) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void u(int i7) {
        if (getChildCount() > 0) {
            this.f8863r.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i7) {
        int childCount;
        boolean z7 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f8862q;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f8862q.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f8862q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f8862q;
        return N(i7, rect3.top, rect3.bottom);
    }

    public final float w(int i7) {
        double log = Math.log((Math.abs(i7) * 0.35f) / (this.f8860o * 0.015f));
        float f7 = f8843O;
        return (float) (this.f8860o * 0.015f * Math.exp((f7 / (f7 - 1.0d)) * log));
    }

    public boolean x(int i7) {
        return this.f8858M.i(i7);
    }

    public final boolean y(int i7, int i8) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight();
    }

    public final void z() {
        VelocityTracker velocityTracker = this.f8871z;
        if (velocityTracker == null) {
            this.f8871z = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8862q = new Rect();
        this.f8867v = true;
        this.f8868w = false;
        this.f8869x = null;
        this.f8870y = false;
        this.f8847B = true;
        this.f8851F = -1;
        this.f8852G = new int[2];
        this.f8853H = new int[2];
        this.f8864s = L.c.a(context, attributeSet);
        this.f8865t = L.c.a(context, attributeSet);
        this.f8860o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8845Q, i7, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f8857L = new C0417n(this);
        this.f8858M = new C0414k(this);
        setNestedScrollingEnabled(true);
        AbstractC0421s.D(this, f8844P);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
