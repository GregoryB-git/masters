/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityRecord
 *  android.view.animation.AnimationUtils
 *  android.widget.EdgeEffect
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.OverScroller
 *  android.widget.ScrollView
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 */
package androidx.core.widget;

import I.j;
import I.k;
import I.m;
import I.n;
import I.s;
import J.u;
import J.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
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
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class NestedScrollView
extends FrameLayout
implements m {
    public static final float O = (float)(Math.log((double)0.78) / Math.log((double)0.9));
    public static final a P = new a();
    public static final int[] Q = new int[]{16843130};
    public boolean A;
    public boolean B = true;
    public int C;
    public int D;
    public int E;
    public int F = -1;
    public final int[] G = new int[2];
    public final int[] H = new int[2];
    public int I;
    public int J;
    public d K;
    public final n L;
    public final k M;
    public float N;
    public final float o;
    public long p;
    public final Rect q = new Rect();
    public OverScroller r;
    public EdgeEffect s;
    public EdgeEffect t;
    public int u;
    public boolean v = true;
    public boolean w = false;
    public View x = null;
    public boolean y = false;
    public VelocityTracker z;

    public NestedScrollView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v.a.c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        this.s = L.c.a(context, attributeSet);
        this.t = L.c.a(context, attributeSet);
        this.o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.A();
        context = context.obtainStyledAttributes(attributeSet, Q, n8, 0);
        this.setFillViewport(context.getBoolean(0, false));
        context.recycle();
        this.L = new n((ViewGroup)this);
        this.M = new k((View)this);
        this.setNestedScrollingEnabled(true);
        s.D((View)this, P);
    }

    public static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if ((view = view.getParent()) instanceof ViewGroup && NestedScrollView.E(view, view2)) {
            return true;
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.N == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = this.getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.N = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.N;
    }

    public static int k(int n8, int n9, int n10) {
        if (n9 < n10 && n8 >= 0) {
            if (n9 + n8 > n10) {
                return n10 - n9;
            }
            return n8;
        }
        return 0;
    }

    public final void A() {
        this.r = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)this.getContext());
        this.C = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        this.E = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void B() {
        if (this.z == null) {
            this.z = VelocityTracker.obtain();
        }
    }

    public final void C(int n8, int n9) {
        this.u = n8;
        this.F = n9;
        this.W(2, 0);
    }

    public final boolean D(View view) {
        return this.F(view, 0, this.getHeight()) ^ true;
    }

    public final boolean F(View view, int n8, int n9) {
        view.getDrawingRect(this.q);
        this.offsetDescendantRectToMyCoords(view, this.q);
        if (this.q.bottom + n8 >= this.getScrollY() && this.q.top - n8 <= this.getScrollY() + n9) {
            return true;
        }
        return false;
    }

    public final void G(int n8, int n9, int[] arrn) {
        int n10 = this.getScrollY();
        this.scrollBy(0, n8);
        n10 = this.getScrollY() - n10;
        if (arrn != null) {
            arrn[1] = arrn[1] + n10;
        }
        this.M.d(0, n10, 0, n8 - n10, null, n9, arrn);
    }

    public final void H(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n8) == this.F) {
            n8 = n8 == 0 ? 1 : 0;
            this.u = (int)motionEvent.getY(n8);
            this.F = motionEvent.getPointerId(n8);
            motionEvent = this.z;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    public boolean I(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, boolean bl) {
        block13 : {
            block12 : {
                boolean bl2;
                int n16 = this.getOverScrollMode();
                int n17 = this.computeHorizontalScrollRange();
                int n18 = this.computeHorizontalScrollExtent();
                boolean bl3 = false;
                n17 = n17 > n18 ? 1 : 0;
                n18 = this.computeVerticalScrollRange() > this.computeVerticalScrollExtent() ? 1 : 0;
                n17 = n16 != 0 && (n16 != 1 || n17 == 0) ? 0 : 1;
                n18 = n16 != 0 && (n16 != 1 || n18 == 0) ? 0 : 1;
                n8 = n17 == 0 ? 0 : n14;
                n11 += n9;
                n9 = n18 == 0 ? 0 : n15;
                n14 = - n8;
                n12 = - n9;
                n9 += n13;
                if ((n10 += n8) > (n8 += n12)) {
                    bl = true;
                } else if (n10 < n14) {
                    bl = true;
                    n8 = n14;
                } else {
                    bl = false;
                    n8 = n10;
                }
                if (n11 > n9) {
                    bl2 = true;
                } else if (n11 < n12) {
                    bl2 = true;
                    n9 = n12;
                } else {
                    bl2 = false;
                    n9 = n11;
                }
                if (bl2 && !this.x(1)) {
                    this.r.springBack(n8, n9, 0, 0, 0, this.getScrollRange());
                }
                this.onOverScrolled(n8, n9, bl, bl2);
                if (bl) break block12;
                bl = bl3;
                if (!bl2) break block13;
            }
            bl = true;
        }
        return bl;
    }

    public boolean J(int n8) {
        Rect rect;
        int n9 = n8 == 130 ? 1 : 0;
        int n10 = this.getHeight();
        if (n9 != 0) {
            this.q.top = this.getScrollY() + n10;
            n9 = this.getChildCount();
            if (n9 > 0) {
                rect = this.getChildAt(n9 - 1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)rect.getLayoutParams();
                n9 = rect.getBottom() + layoutParams.bottomMargin + this.getPaddingBottom();
                rect = this.q;
                if (rect.top + n10 > n9) {
                    rect.top = n9 - n10;
                }
            }
        } else {
            this.q.top = this.getScrollY() - n10;
            rect = this.q;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        rect = this.q;
        n9 = rect.top;
        rect.bottom = n10 += n9;
        return this.N(n8, n9, n10);
    }

    public final void K() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.z = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int L(int n8, float f8) {
        block5 : {
            EdgeEffect edgeEffect;
            block6 : {
                float f9;
                float f10;
                block4 : {
                    f10 = f8 / (float)this.getWidth();
                    f9 = (float)n8 / (float)this.getHeight();
                    float f11 = L.c.b(this.s);
                    f8 = 0.0f;
                    if (f11 == 0.0f) break block4;
                    f8 = f10 = - L.c.d(this.s, - f9, f10);
                    if (L.c.b(this.s) != 0.0f) break block5;
                    edgeEffect = this.s;
                    f8 = f10;
                    break block6;
                }
                if (L.c.b(this.t) == 0.0f) break block5;
                f8 = f10 = L.c.d(this.t, f9, 1.0f - f10);
                if (L.c.b(this.t) != 0.0f) break block5;
                edgeEffect = this.t;
                f8 = f10;
            }
            edgeEffect.onRelease();
        }
        if ((n8 = Math.round((float)(f8 * (float)this.getHeight()))) != 0) {
            this.invalidate();
        }
        return n8;
    }

    public final void M(boolean bl) {
        if (bl) {
            this.W(2, 1);
        } else {
            this.Y(1);
        }
        this.J = this.getScrollY();
        s.x((View)this);
    }

    public final boolean N(int n8, int n9, int n10) {
        int n11 = this.getHeight();
        int n12 = this.getScrollY();
        n11 += n12;
        boolean bl = false;
        boolean bl2 = n8 == 33;
        View view = this.t(bl2, n9, n10);
        Object object = view;
        if (view == null) {
            object = this;
        }
        if (n9 >= n12 && n10 <= n11) {
            bl2 = bl;
        } else {
            n9 = bl2 ? (n9 -= n12) : n10 - n11;
            this.O(n9, 0, 1, true);
            bl2 = true;
        }
        if (object != this.findFocus()) {
            object.requestFocus(n8);
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int O(int n8, int n9, int n10, boolean bl) {
        int n11;
        boolean bl2;
        block12 : {
            EdgeEffect edgeEffect;
            block13 : {
                int n12;
                int n13;
                int n14;
                int n15;
                block11 : {
                    if (n10 == 1) {
                        this.W(2, n10);
                    }
                    if (this.n(0, n8, this.H, this.G, n10)) {
                        n12 = this.H[1];
                        n15 = this.G[1];
                        n12 = n8 - n12;
                        n8 = n15;
                        n15 = n12;
                    } else {
                        n15 = n8;
                        n8 = 0;
                    }
                    n13 = this.getScrollY();
                    n14 = this.getScrollRange();
                    n12 = this.i() && !bl ? 1 : 0;
                    bl2 = this.I(0, n15, 0, n13, 0, n14, 0, 0, true) && !this.x(n10);
                    n11 = this.getScrollY() - n13;
                    edgeEffect = this.H;
                    edgeEffect[1] = 0;
                    this.o(0, n11, 0, n15 - n11, this.G, n10, (int[])edgeEffect);
                    n11 = this.G[1];
                    if ((n13 += (n15 -= this.H[1])) >= 0) break block11;
                    if (n12 == 0) break block12;
                    L.c.d(this.s, (float)(- n15) / (float)this.getHeight(), (float)n9 / (float)this.getWidth());
                    if (this.t.isFinished()) break block12;
                    edgeEffect = this.t;
                    break block13;
                }
                if (n13 <= n14 || n12 == 0) break block12;
                L.c.d(this.t, (float)n15 / (float)this.getHeight(), 1.0f - (float)n9 / (float)this.getWidth());
                if (this.s.isFinished()) break block12;
                edgeEffect = this.s;
            }
            edgeEffect.onRelease();
        }
        if (this.s.isFinished() && this.t.isFinished()) {
            if (bl2 && n10 == 0) {
                this.z.clear();
            }
        } else {
            s.x((View)this);
        }
        if (n10 == 1) {
            this.Y(n10);
            this.s.onRelease();
            this.t.onRelease();
        }
        return n8 + n11;
    }

    public final void P(View view) {
        view.getDrawingRect(this.q);
        this.offsetDescendantRectToMyCoords(view, this.q);
        int n8 = this.l(this.q);
        if (n8 != 0) {
            this.scrollBy(0, n8);
        }
    }

    public final boolean Q(Rect rect, boolean bl) {
        int n8 = this.l(rect);
        boolean bl2 = n8 != 0;
        if (bl2) {
            if (bl) {
                this.scrollBy(0, n8);
                return bl2;
            }
            this.S(0, n8);
        }
        return bl2;
    }

    public final boolean R(EdgeEffect edgeEffect, int n8) {
        if (n8 > 0) {
            return true;
        }
        float f8 = L.c.b(edgeEffect);
        float f9 = this.getHeight();
        if (this.w(- n8) < f8 * f9) {
            return true;
        }
        return false;
    }

    public final void S(int n8, int n9) {
        this.T(n8, n9, 250, false);
    }

    public final void T(int n8, int n9, int n10, boolean bl) {
        if (this.getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.p > 250L) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n11 = view.getHeight();
            int n12 = layoutParams.topMargin;
            int n13 = layoutParams.bottomMargin;
            int n14 = this.getHeight();
            int n15 = this.getPaddingTop();
            int n16 = this.getPaddingBottom();
            n8 = this.getScrollY();
            n9 = Math.max((int)0, (int)Math.min((int)(n9 + n8), (int)Math.max((int)0, (int)(n11 + n12 + n13 - (n14 - n15 - n16)))));
            this.r.startScroll(this.getScrollX(), n8, 0, n9 - n8, n10);
            this.M(bl);
        } else {
            if (!this.r.isFinished()) {
                this.g();
            }
            this.scrollBy(n8, n9);
        }
        this.p = AnimationUtils.currentAnimationTimeMillis();
    }

    public void U(int n8, int n9, int n10, boolean bl) {
        this.T(n8 - this.getScrollX(), n9 - this.getScrollY(), n10, bl);
    }

    public void V(int n8, int n9, boolean bl) {
        this.U(n8, n9, 250, bl);
    }

    public boolean W(int n8, int n9) {
        return this.M.m(n8, n9);
    }

    public final boolean X(MotionEvent motionEvent) {
        boolean bl;
        if (L.c.b(this.s) != 0.0f) {
            L.c.d(this.s, 0.0f, motionEvent.getX() / (float)this.getWidth());
            bl = true;
        } else {
            bl = false;
        }
        if (L.c.b(this.t) != 0.0f) {
            L.c.d(this.t, 0.0f, 1.0f - motionEvent.getX() / (float)this.getWidth());
            return true;
        }
        return bl;
    }

    public void Y(int n8) {
        this.M.n(n8);
    }

    @Override
    public void a(View view, View view2, int n8, int n9) {
        this.L.c(view, view2, n8, n9);
        this.W(2, n9);
    }

    public void addView(View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int n8) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override
    public void b(View view, int n8) {
        this.L.d(view, n8);
        this.Y(n8);
    }

    @Override
    public void c(View view, int n8, int n9, int[] arrn, int n10) {
        this.n(n8, n9, arrn, null, n10);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void computeScroll() {
        block6 : {
            block7 : {
                int[] arrn;
                block9 : {
                    block8 : {
                        if (this.r.isFinished()) {
                            return;
                        }
                        this.r.computeScrollOffset();
                        int n8 = this.r.getCurrY();
                        int n9 = this.m(n8 - this.J);
                        this.J = n8;
                        arrn = this.H;
                        arrn[1] = 0;
                        this.n(0, n9, arrn, null, 1);
                        int n10 = this.getScrollRange();
                        n8 = n9 -= this.H[1];
                        if (n9 != 0) {
                            n8 = this.getScrollY();
                            this.I(0, n9, this.getScrollX(), n8, 0, n10, 0, 0, false);
                            n8 = this.getScrollY() - n8;
                            arrn = this.H;
                            arrn[1] = 0;
                            this.o(0, n8, 0, n9 -= n8, this.G, 1, arrn);
                            n8 = n9 - this.H[1];
                        }
                        if (n8 == 0) break block6;
                        n9 = this.getOverScrollMode();
                        if (n9 != 0 && (n9 != 1 || n10 <= 0)) break block7;
                        if (n8 >= 0) break block8;
                        if (!this.s.isFinished()) break block7;
                        arrn = this.s;
                        break block9;
                    }
                    if (!this.t.isFinished()) break block7;
                    arrn = this.t;
                }
                arrn.onAbsorb((int)this.r.getCurrVelocity());
            }
            this.g();
        }
        if (!this.r.isFinished()) {
            s.x((View)this);
            return;
        }
        this.Y(1);
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max((int)0, (int)super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int n8 = this.getChildCount();
        int n9 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (n8 == 0) {
            return n9;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        n8 = view.getBottom() + layoutParams.bottomMargin;
        int n10 = this.getScrollY();
        int n11 = Math.max((int)0, (int)(n8 - n9));
        if (n10 < 0) {
            return n8 - n10;
        }
        n9 = n8;
        if (n10 > n11) {
            n9 = n8 + (n10 - n11);
        }
        return n9;
    }

    @Override
    public void d(View view, int n8, int n9, int n10, int n11, int n12, int[] arrn) {
        this.G(n11, n12, arrn);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !this.s(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean bl) {
        return this.M.a(f8, f9, bl);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.M.b(f8, f9);
    }

    public boolean dispatchNestedPreScroll(int n8, int n9, int[] arrn, int[] arrn2) {
        return this.n(n8, n9, arrn, arrn2, 0);
    }

    public boolean dispatchNestedScroll(int n8, int n9, int n10, int n11, int[] arrn) {
        return this.M.e(n8, n9, n10, n11, arrn);
    }

    public void draw(Canvas canvas) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        super.draw(canvas);
        int n15 = this.getScrollY();
        boolean bl = this.s.isFinished();
        int n16 = 0;
        if (!bl) {
            n13 = canvas.save();
            n9 = this.getWidth();
            n14 = this.getHeight();
            n10 = Math.min((int)0, (int)n15);
            if (b.a((ViewGroup)this)) {
                n9 -= this.getPaddingLeft() + this.getPaddingRight();
                n12 = this.getPaddingLeft();
            } else {
                n12 = 0;
            }
            n8 = n14;
            n11 = n10;
            if (b.a((ViewGroup)this)) {
                n8 = n14 - (this.getPaddingTop() + this.getPaddingBottom());
                n11 = n10 + this.getPaddingTop();
            }
            canvas.translate((float)n12, (float)n11);
            this.s.setSize(n9, n8);
            if (this.s.draw(canvas)) {
                s.x((View)this);
            }
            canvas.restoreToCount(n13);
        }
        if (!this.t.isFinished()) {
            n13 = canvas.save();
            n11 = this.getWidth();
            n10 = this.getHeight();
            n14 = Math.max((int)this.getScrollRange(), (int)n15) + n10;
            n12 = n16;
            n9 = n11;
            if (b.a((ViewGroup)this)) {
                n9 = n11 - (this.getPaddingLeft() + this.getPaddingRight());
                n12 = this.getPaddingLeft();
            }
            n8 = n14;
            n11 = n10;
            if (b.a((ViewGroup)this)) {
                n11 = n10 - (this.getPaddingTop() + this.getPaddingBottom());
                n8 = n14 - this.getPaddingBottom();
            }
            canvas.translate((float)(n12 - n9), (float)n8);
            canvas.rotate(180.0f, (float)n9, 0.0f);
            this.t.setSize(n9, n11);
            if (this.t.draw(canvas)) {
                s.x((View)this);
            }
            canvas.restoreToCount(n13);
        }
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
        this.G(n11, n12, null);
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        if ((n8 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void g() {
        this.r.abortAnimation();
        this.Y(1);
    }

    public float getBottomFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n8 = this.getVerticalFadingEdgeLength();
        int n9 = this.getHeight();
        int n10 = this.getPaddingBottom();
        n9 = view.getBottom() + layoutParams.bottomMargin - this.getScrollY() - (n9 - n10);
        if (n9 < n8) {
            return (float)n9 / (float)n8;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int)((float)this.getHeight() * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.L.a();
    }

    public int getScrollRange() {
        int n8 = this.getChildCount();
        int n9 = 0;
        if (n8 > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            n9 = Math.max((int)0, (int)(view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom())));
        }
        return n9;
    }

    public float getTopFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        int n8 = this.getVerticalFadingEdgeLength();
        int n9 = this.getScrollY();
        if (n9 < n8) {
            return (float)n9 / (float)n8;
        }
        return 1.0f;
    }

    public boolean h(int n8) {
        View view;
        View view2 = view = this.findFocus();
        if (view == this) {
            view2 = null;
        }
        view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view2, n8);
        int n9 = this.getMaxScrollAmount();
        if (view != null && this.F(view, n9, this.getHeight())) {
            view.getDrawingRect(this.q);
            this.offsetDescendantRectToMyCoords(view, this.q);
            this.O(this.l(this.q), 0, 1, true);
            view.requestFocus(n8);
        } else {
            int n10;
            if (n8 == 33 && this.getScrollY() < n9) {
                n10 = this.getScrollY();
            } else {
                n10 = n9;
                if (n8 == 130) {
                    n10 = n9;
                    if (this.getChildCount() > 0) {
                        view = this.getChildAt(0);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
                        n10 = Math.min((int)(view.getBottom() + layoutParams.bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom())), (int)n9);
                    }
                }
            }
            if (n10 == 0) {
                return false;
            }
            if (n8 != 130) {
                n10 = - n10;
            }
            this.O(n10, 0, 1, true);
        }
        if (view2 != null && view2.isFocused() && this.D(view2)) {
            n8 = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(n8);
        }
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return this.x(0);
    }

    public final boolean i() {
        int n8 = this.getOverScrollMode();
        boolean bl = true;
        if (n8 != 0) {
            if (n8 == 1 && this.getScrollRange() > 0) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public boolean isNestedScrollingEnabled() {
        return this.M.j();
    }

    public final boolean j() {
        boolean bl;
        int n8 = this.getChildCount();
        boolean bl2 = bl = false;
        if (n8 > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            bl2 = bl;
            if (view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int l(Rect rect) {
        int n8 = this.getChildCount();
        int n9 = 0;
        if (n8 == 0) {
            return 0;
        }
        int n10 = this.getHeight();
        int n11 = this.getScrollY();
        int n12 = n11 + n10;
        int n13 = this.getVerticalFadingEdgeLength();
        n8 = n11;
        if (rect.top > 0) {
            n8 = n11 + n13;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        n11 = rect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin ? n12 - n13 : n12;
        n13 = rect.bottom;
        if (n13 > n11 && rect.top > n8) {
            n8 = rect.height() > n10 ? rect.top - n8 : rect.bottom - n11;
            return Math.min((int)n8, (int)(view.getBottom() + layoutParams.bottomMargin - n12));
        }
        n12 = n9;
        if (rect.top < n8) {
            n12 = n9;
            if (n13 < n11) {
                n8 = rect.height() > n10 ? 0 - (n11 - rect.bottom) : 0 - (n8 - rect.top);
                n12 = Math.max((int)n8, (int)(- this.getScrollY()));
            }
        }
        return n12;
    }

    public int m(int n8) {
        int n9 = this.getHeight();
        if (n8 > 0 && L.c.b(this.s) != 0.0f) {
            float f8 = (float)(- n8) * 4.0f / (float)n9;
            int n10 = Math.round((float)((float)(- n9) / 4.0f * L.c.d(this.s, f8, 0.5f)));
            if (n10 != n8) {
                this.s.finish();
            }
            return n8 - n10;
        }
        int n11 = n8;
        if (n8 < 0) {
            n11 = n8;
            if (L.c.b(this.t) != 0.0f) {
                float f9 = n8;
                float f10 = n9;
                n11 = Math.round((float)(f10 / 4.0f * L.c.d(this.t, f9 = f9 * 4.0f / f10, 0.5f)));
                if (n11 != n8) {
                    this.t.finish();
                }
                n11 = n8 - n11;
            }
        }
        return n11;
    }

    public void measureChild(View view, int n8, int n9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight()), (int)layoutParams.width), View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
    }

    public void measureChildWithMargins(View view, int n8, int n9, int n10, int n11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n9), (int)marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec((int)(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), (int)0));
    }

    public boolean n(int n8, int n9, int[] arrn, int[] arrn2, int n10) {
        return this.M.c(n8, n9, arrn, arrn2, n10);
    }

    public void o(int n8, int n9, int n10, int n11, int[] arrn, int n12, int[] arrn2) {
        this.M.d(n8, n9, n10, n11, arrn, n12, arrn2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean bl;
        int n8 = motionEvent.getAction();
        boolean bl2 = bl = false;
        if (n8 == 8) {
            bl2 = bl;
            if (!this.y) {
                float f8;
                if (j.a(motionEvent, 2)) {
                    f8 = motionEvent.getAxisValue(9);
                    n8 = (int)motionEvent.getX();
                } else if (j.a(motionEvent, 4194304)) {
                    f8 = motionEvent.getAxisValue(26);
                    n8 = this.getWidth() / 2;
                } else {
                    n8 = 0;
                    f8 = 0.0f;
                }
                bl2 = bl;
                if (f8 != 0.0f) {
                    int n9 = (int)(f8 * this.getVerticalScrollFactorCompat());
                    bl = j.a(motionEvent, 8194);
                    n9 = - n9;
                    bl2 = true;
                    this.O(n9, n8, 1, bl);
                }
            }
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getAction();
        boolean bl = true;
        boolean bl2 = true;
        if (n8 == 2 && this.y) {
            return true;
        }
        if ((n8 &= 255) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 6) return this.y;
                        this.H(motionEvent);
                        return this.y;
                    }
                } else {
                    n8 = this.F;
                    if (n8 == -1) return this.y;
                    int n9 = motionEvent.findPointerIndex(n8);
                    if (n9 == -1) {
                        motionEvent = new StringBuilder();
                        motionEvent.append("Invalid pointerId=");
                        motionEvent.append(n8);
                        motionEvent.append(" in onInterceptTouchEvent");
                        Log.e((String)"NestedScrollView", (String)motionEvent.toString());
                        return this.y;
                    } else {
                        n8 = (int)motionEvent.getY(n9);
                        if (Math.abs((int)(n8 - this.u)) <= this.C || (2 & this.getNestedScrollAxes()) != 0) return this.y;
                        this.y = true;
                        this.u = n8;
                        this.B();
                        this.z.addMovement(motionEvent);
                        this.I = 0;
                        motionEvent = this.getParent();
                        if (motionEvent == null) return this.y;
                        motionEvent.requestDisallowInterceptTouchEvent(true);
                    }
                    return this.y;
                }
            }
            this.y = false;
            this.F = -1;
            this.K();
            if (this.r.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                s.x((View)this);
            }
            this.Y(0);
            return this.y;
        }
        n8 = (int)motionEvent.getY();
        if (!this.y((int)motionEvent.getX(), n8)) {
            boolean bl3 = bl2;
            if (!this.X(motionEvent)) {
                bl3 = !this.r.isFinished() ? bl2 : false;
            }
            this.y = bl3;
            this.K();
            return this.y;
        } else {
            this.u = n8;
            this.F = motionEvent.getPointerId(0);
            this.z();
            this.z.addMovement(motionEvent);
            this.r.computeScrollOffset();
            boolean bl4 = bl;
            if (!this.X(motionEvent)) {
                bl4 = !this.r.isFinished() ? bl : false;
            }
            this.y = bl4;
            this.W(2, 0);
        }
        return this.y;
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        n8 = 0;
        this.v = false;
        View view = this.x;
        if (view != null && NestedScrollView.E(view, (View)this)) {
            this.P(this.x);
        }
        this.x = null;
        if (!this.w) {
            if (this.K != null) {
                this.scrollTo(this.getScrollX(), this.K.o);
                this.K = null;
            }
            if (this.getChildCount() > 0) {
                view = this.getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
                n8 = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int n12 = this.getPaddingTop();
            int n13 = this.getPaddingBottom();
            n10 = this.getScrollY();
            n8 = NestedScrollView.k(n10, n11 - n9 - n12 - n13, n8);
            if (n8 != n10) {
                this.scrollTo(this.getScrollX(), n8);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.w = true;
    }

    public void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (!this.A) {
            return;
        }
        if (View.MeasureSpec.getMode((int)n9) == 0) {
            return;
        }
        if (this.getChildCount() > 0) {
            int n10;
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            n9 = view.getMeasuredHeight();
            if (n9 < (n10 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin)) {
                view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin), (int)layoutParams.width), View.MeasureSpec.makeMeasureSpec((int)n10, (int)1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        if (!bl) {
            this.dispatchNestedFling(0.0f, f9, true);
            this.u((int)f9);
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        return this.dispatchNestedPreFling(f8, f9);
    }

    public void onNestedPreScroll(View view, int n8, int n9, int[] arrn) {
        this.c(view, n8, n9, arrn, 0);
    }

    public void onNestedScroll(View view, int n8, int n9, int n10, int n11) {
        this.G(n11, 0, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int n8) {
        this.a(view, view2, n8, 0);
    }

    public void onOverScrolled(int n8, int n9, boolean bl, boolean bl2) {
        super.scrollTo(n8, n9);
    }

    public boolean onRequestFocusInDescendants(int n8, Rect rect) {
        int n9;
        if (n8 == 2) {
            n9 = 130;
        } else {
            n9 = n8;
            if (n8 == 1) {
                n9 = 33;
            }
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        focusFinder = rect == null ? focusFinder.findNextFocus((ViewGroup)this, null, n9) : focusFinder.findNextFocusFromRect((ViewGroup)this, rect, n9);
        if (focusFinder == null) {
            return false;
        }
        if (this.D((View)focusFinder)) {
            return false;
        }
        return focusFinder.requestFocus(n9, rect);
    }

    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof d)) {
            super.onRestoreInstanceState((Parcelable)object);
            return;
        }
        object = (d)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.K = object;
        this.requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        d d8 = new d(super.onSaveInstanceState());
        d8.o = this.getScrollY();
        return d8;
    }

    public void onScrollChanged(int n8, int n9, int n10, int n11) {
        super.onScrollChanged(n8, n9, n10, n11);
    }

    public void onSizeChanged(int n8, int n9, int n10, int n11) {
        super.onSizeChanged(n8, n9, n10, n11);
        View view = this.findFocus();
        if (view != null) {
            if (this == view) {
                return;
            }
            if (this.F(view, 0, n11)) {
                view.getDrawingRect(this.q);
                this.offsetDescendantRectToMyCoords(view, this.q);
                this.p(this.l(this.q));
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int n8) {
        return this.f(view, view2, n8, 0);
    }

    public void onStopNestedScroll(View view) {
        this.b(view, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        block23 : {
            ViewParent viewParent;
            block19 : {
                block24 : {
                    block25 : {
                        block26 : {
                            float f8;
                            int n8;
                            block20 : {
                                block21 : {
                                    block22 : {
                                        this.B();
                                        n8 = motionEvent.getActionMasked();
                                        if (n8 == 0) {
                                            this.I = 0;
                                        }
                                        motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
                                        motionEvent2.offsetLocation(0.0f, (float)this.I);
                                        if (n8 == 0) break block19;
                                        if (n8 == 1) break block20;
                                        if (n8 == 2) break block21;
                                        if (n8 == 3) break block22;
                                        if (n8 != 5) {
                                            if (n8 == 6) {
                                                this.H(motionEvent);
                                                this.u = (int)motionEvent.getY(motionEvent.findPointerIndex(this.F));
                                            }
                                        } else {
                                            n8 = motionEvent.getActionIndex();
                                            this.u = (int)motionEvent.getY(n8);
                                            this.F = motionEvent.getPointerId(n8);
                                        }
                                        break block23;
                                    }
                                    if (!this.y || this.getChildCount() <= 0 || !this.r.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) break block24;
                                    break block25;
                                }
                                int n9 = motionEvent.findPointerIndex(this.F);
                                if (n9 == -1) {
                                    motionEvent = new StringBuilder();
                                    motionEvent.append("Invalid pointerId=");
                                    motionEvent.append(this.F);
                                    motionEvent.append(" in onTouchEvent");
                                    Log.e((String)"NestedScrollView", (String)motionEvent.toString());
                                } else {
                                    int n10;
                                    int n11 = (int)motionEvent.getY(n9);
                                    n8 = this.u - n11;
                                    n8 = n10 = n8 - this.L(n8, motionEvent.getX(n9));
                                    if (!this.y) {
                                        n8 = n10;
                                        if (Math.abs((int)n10) > this.C) {
                                            ViewParent viewParent2 = this.getParent();
                                            if (viewParent2 != null) {
                                                viewParent2.requestDisallowInterceptTouchEvent(true);
                                            }
                                            this.y = true;
                                            n8 = this.C;
                                            n8 = n10 > 0 ? n10 - n8 : n10 + n8;
                                        }
                                    }
                                    if (this.y) {
                                        n8 = this.O(n8, (int)motionEvent.getX(n9), 0, false);
                                        this.u = n11 - n8;
                                        this.I += n8;
                                    }
                                }
                                break block23;
                            }
                            motionEvent = this.z;
                            motionEvent.computeCurrentVelocity(1000, (float)this.E);
                            n8 = (int)motionEvent.getYVelocity(this.F);
                            if (Math.abs((int)n8) < this.D) break block26;
                            if (!this.q(n8) && !this.dispatchNestedPreFling(0.0f, f8 = (float)(n8 = - n8))) {
                                this.dispatchNestedFling(0.0f, f8, true);
                                this.u(n8);
                            }
                            break block24;
                        }
                        if (!this.r.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) break block24;
                    }
                    s.x((View)this);
                }
                this.r();
                break block23;
            }
            if (this.getChildCount() == 0) {
                return false;
            }
            if (this.y && (viewParent = this.getParent()) != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.r.isFinished()) {
                this.g();
            }
            this.C((int)motionEvent.getY(), motionEvent.getPointerId(0));
        }
        motionEvent = this.z;
        if (motionEvent != null) {
            motionEvent.addMovement(motionEvent2);
        }
        motionEvent2.recycle();
        return true;
    }

    public final void p(int n8) {
        if (n8 != 0) {
            if (this.B) {
                this.S(0, n8);
                return;
            }
            this.scrollBy(0, n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean q(int n8) {
        block5 : {
            EdgeEffect edgeEffect;
            block4 : {
                int n9;
                block2 : {
                    block3 : {
                        if (L.c.b(this.s) == 0.0f) break block2;
                        if (!this.R(this.s, n8)) break block3;
                        edgeEffect = this.s;
                        break block4;
                    }
                    n8 = - n8;
                    break block5;
                }
                if (L.c.b(this.t) == 0.0f) return false;
                edgeEffect = this.t;
                n8 = n9 = - n8;
                if (!this.R(edgeEffect, n9)) break block5;
                edgeEffect = this.t;
                n8 = n9;
            }
            edgeEffect.onAbsorb(n8);
            return true;
        }
        this.u(n8);
        return true;
    }

    public final void r() {
        this.F = -1;
        this.y = false;
        this.K();
        this.Y(0);
        this.s.onRelease();
        this.t.onRelease();
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.v) {
            this.P(view2);
        } else {
            this.x = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return this.Q(rect, bl);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        if (bl) {
            this.K();
        }
        super.requestDisallowInterceptTouchEvent(bl);
    }

    public void requestLayout() {
        this.v = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.q.setEmpty();
        boolean bl = this.j();
        boolean bl2 = false;
        boolean bl3 = false;
        int n8 = 130;
        if (!bl) {
            bl2 = bl3;
            if (this.isFocused()) {
                bl2 = bl3;
                if (keyEvent.getKeyCode() != 4) {
                    View view = this.findFocus();
                    keyEvent = view;
                    if (view == this) {
                        keyEvent = null;
                    }
                    keyEvent = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)keyEvent, 130);
                    bl2 = bl3;
                    if (keyEvent != null) {
                        bl2 = bl3;
                        if (keyEvent != this) {
                            bl2 = bl3;
                            if (keyEvent.requestFocus(130)) {
                                bl2 = true;
                            }
                        }
                    }
                }
            }
            return bl2;
        }
        if (keyEvent.getAction() == 0) {
            int n9 = keyEvent.getKeyCode();
            if (n9 != 19) {
                if (n9 != 20) {
                    if (n9 != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        n8 = 33;
                    }
                    this.J(n8);
                    return false;
                }
                if (!keyEvent.isAltPressed()) {
                    return this.h(130);
                }
                return this.v(130);
            }
            if (!keyEvent.isAltPressed()) {
                return this.h(33);
            }
            bl2 = this.v(33);
        }
        return bl2;
    }

    public void scrollTo(int n8, int n9) {
        if (this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n10 = this.getWidth();
            int n11 = this.getPaddingLeft();
            int n12 = this.getPaddingRight();
            int n13 = view.getWidth();
            int n14 = layoutParams.leftMargin;
            int n15 = layoutParams.rightMargin;
            int n16 = this.getHeight();
            int n17 = this.getPaddingTop();
            int n18 = this.getPaddingBottom();
            int n19 = view.getHeight();
            int n20 = layoutParams.topMargin;
            int n21 = layoutParams.bottomMargin;
            n8 = NestedScrollView.k(n8, n10 - n11 - n12, n13 + n14 + n15);
            n9 = NestedScrollView.k(n9, n16 - n17 - n18, n19 + n20 + n21);
            if (n8 != this.getScrollX() || n9 != this.getScrollY()) {
                super.scrollTo(n8, n9);
            }
        }
    }

    public void setFillViewport(boolean bl) {
        if (bl != this.A) {
            this.A = bl;
            this.requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean bl) {
        this.M.k(bl);
    }

    public void setOnScrollChangeListener(c c8) {
    }

    public void setSmoothScrollingEnabled(boolean bl) {
        this.B = bl;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int n8) {
        return this.W(n8, 0);
    }

    public void stopNestedScroll() {
        this.Y(0);
    }

    public final View t(boolean bl, int n8, int n9) {
        int n10;
        ArrayList arrayList = this.getFocusables(2);
        int n11 = arrayList.size();
        View view = null;
        int n12 = n10 = 0;
        while (n10 < n11) {
            int n13;
            View view2;
            block3 : {
                View view3;
                block6 : {
                    int n14;
                    block7 : {
                        int n15;
                        block5 : {
                            int n16;
                            block4 : {
                                view3 = (View)arrayList.get(n10);
                                n14 = view3.getTop();
                                n16 = view3.getBottom();
                                view2 = view;
                                n13 = n12;
                                if (n8 >= n16) break block3;
                                view2 = view;
                                n13 = n12;
                                if (n14 >= n9) break block3;
                                n15 = n8 < n14 && n16 < n9 ? 1 : 0;
                                if (view != null) break block4;
                                view2 = view3;
                                n13 = n15;
                                break block3;
                            }
                            n14 = bl && n14 < view.getTop() || !bl && n16 > view.getBottom() ? 1 : 0;
                            if (n12 == 0) break block5;
                            view2 = view;
                            n13 = n12;
                            if (n15 == 0) break block3;
                            view2 = view;
                            n13 = n12;
                            if (n14 == 0) break block3;
                            break block6;
                        }
                        if (n15 == 0) break block7;
                        view2 = view3;
                        n13 = 1;
                        break block3;
                    }
                    view2 = view;
                    n13 = n12;
                    if (n14 == 0) break block3;
                }
                view2 = view3;
                n13 = n12;
            }
            ++n10;
            view = view2;
            n12 = n13;
        }
        return view;
    }

    public void u(int n8) {
        if (this.getChildCount() > 0) {
            this.r.fling(this.getScrollX(), this.getScrollY(), 0, n8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.M(true);
        }
    }

    public boolean v(int n8) {
        int n9 = n8 == 130 ? 1 : 0;
        int n10 = this.getHeight();
        Rect rect = this.q;
        rect.top = 0;
        rect.bottom = n10;
        if (n9 != 0 && (n9 = this.getChildCount()) > 0) {
            rect = this.getChildAt(n9 - 1);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)rect.getLayoutParams();
            this.q.bottom = rect.getBottom() + layoutParams.bottomMargin + this.getPaddingBottom();
            rect = this.q;
            rect.top = rect.bottom - n10;
        }
        rect = this.q;
        return this.N(n8, rect.top, rect.bottom);
    }

    public final float w(int n8) {
        double d8 = Math.log((double)((float)Math.abs((int)n8) * 0.35f / (this.o * 0.015f)));
        float f8 = O;
        double d9 = f8;
        return (float)((double)(this.o * 0.015f) * Math.exp((double)((double)f8 / (d9 - 1.0) * d8)));
    }

    public boolean x(int n8) {
        return this.M.i(n8);
    }

    public final boolean y(int n8, int n9) {
        boolean bl;
        int n10 = this.getChildCount();
        boolean bl2 = bl = false;
        if (n10 > 0) {
            n10 = this.getScrollY();
            View view = this.getChildAt(0);
            bl2 = bl;
            if (n9 >= view.getTop() - n10) {
                bl2 = bl;
                if (n9 < view.getBottom() - n10) {
                    bl2 = bl;
                    if (n8 >= view.getLeft()) {
                        bl2 = bl;
                        if (n8 < view.getRight()) {
                            bl2 = true;
                        }
                    }
                }
            }
        }
        return bl2;
    }

    public final void z() {
        VelocityTracker velocityTracker = this.z;
        if (velocityTracker == null) {
            this.z = VelocityTracker.obtain();
            return;
        }
        velocityTracker.clear();
    }

    public static class a
    extends I.a {
        @Override
        public void f(View object, AccessibilityEvent accessibilityEvent) {
            super.f((View)object, accessibilityEvent);
            object = (NestedScrollView)object;
            accessibilityEvent.setClassName((CharSequence)ScrollView.class.getName());
            boolean bl = object.getScrollRange() > 0;
            accessibilityEvent.setScrollable(bl);
            accessibilityEvent.setScrollX(object.getScrollX());
            accessibilityEvent.setScrollY(object.getScrollY());
            w.a((AccessibilityRecord)accessibilityEvent, object.getScrollX());
            w.b((AccessibilityRecord)accessibilityEvent, object.getScrollRange());
        }

        @Override
        public void g(View object, u u8) {
            int n8;
            super.g((View)object, u8);
            object = (NestedScrollView)object;
            u8.I(ScrollView.class.getName());
            if (object.isEnabled() && (n8 = object.getScrollRange()) > 0) {
                u8.M(true);
                if (object.getScrollY() > 0) {
                    u8.a(u.a.q);
                    u8.a(u.a.B);
                }
                if (object.getScrollY() < n8) {
                    u8.a(u.a.p);
                    u8.a(u.a.D);
                }
            }
        }

        @Override
        public boolean j(View object, int n8, Bundle bundle) {
            if (super.j((View)object, n8, bundle)) {
                return true;
            }
            if (!(object = (NestedScrollView)object).isEnabled()) {
                return false;
            }
            int n9 = object.getHeight();
            bundle = new Rect();
            int n10 = n9;
            if (object.getMatrix().isIdentity()) {
                n10 = n9;
                if (object.getGlobalVisibleRect((Rect)bundle)) {
                    n10 = bundle.height();
                }
            }
            if (n8 != 4096) {
                if (n8 != 8192 && n8 != 16908344) {
                    if (n8 != 16908346) {
                        return false;
                    }
                } else {
                    n8 = object.getPaddingBottom();
                    n9 = object.getPaddingTop();
                    n8 = Math.max((int)(object.getScrollY() - (n10 - n8 - n9)), (int)0);
                    if (n8 != object.getScrollY()) {
                        object.V(0, n8, true);
                        return true;
                    }
                    return false;
                }
            }
            n8 = object.getPaddingBottom();
            n9 = object.getPaddingTop();
            n8 = Math.min((int)(object.getScrollY() + (n10 - n8 - n9)), (int)object.getScrollRange());
            if (n8 != object.getScrollY()) {
                object.V(0, n8, true);
                return true;
            }
            return false;
        }
    }

    public static abstract class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public static interface c {
    }

    public static class d
    extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator(){

            public d a(Parcel parcel) {
                return new d(parcel);
            }

            public d[] b(int n8) {
                return new d[n8];
            }
        };
        public int o;

        public d(Parcel parcel) {
            super(parcel);
            this.o = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)((Object)this))));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.o);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.o);
        }

    }

}

