// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.core.widget;

import android.view.AbsSavedState;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.os.Bundle;
import J.u;
import android.view.accessibility.AccessibilityRecord;
import J.w;
import android.widget.ScrollView;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import android.os.Parcelable;
import android.util.Log;
import I.j;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout$LayoutParams;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.util.TypedValue;
import android.view.ViewParent;
import android.content.res.TypedArray;
import I.s;
import android.view.ViewGroup;
import L.c;
import v.a;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import android.graphics.Rect;
import I.k;
import I.n;
import I.m;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements m
{
    public static final float O;
    public static final a P;
    public static final int[] Q;
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final int[] G;
    public final int[] H;
    public int I;
    public int J;
    public d K;
    public final n L;
    public final k M;
    public float N;
    public final float o;
    public long p;
    public final Rect q;
    public OverScroller r;
    public EdgeEffect s;
    public EdgeEffect t;
    public int u;
    public boolean v;
    public boolean w;
    public View x;
    public boolean y;
    public VelocityTracker z;
    
    static {
        O = (float)(Math.log(0.78) / Math.log(0.9));
        P = new a();
        Q = new int[] { 16843130 };
    }
    
    public NestedScrollView(@NonNull final Context context, final AttributeSet set) {
        this(context, set, v.a.c);
    }
    
    public NestedScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.q = new Rect();
        this.v = true;
        this.w = false;
        this.x = null;
        this.y = false;
        this.B = true;
        this.F = -1;
        this.G = new int[2];
        this.H = new int[2];
        this.s = L.c.a(context, set);
        this.t = L.c.a(context, set);
        this.o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.A();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, NestedScrollView.Q, n, 0);
        this.setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.L = new n((ViewGroup)this);
        this.M = new k((View)this);
        this.setNestedScrollingEnabled(true);
        I.s.D((View)this, NestedScrollView.P);
    }
    
    public static boolean E(final View view, final View view2) {
        if (view == view2) {
            return true;
        }
        final ViewParent parent = view.getParent();
        return parent instanceof ViewGroup && E((View)parent, view2);
    }
    
    private float getVerticalScrollFactorCompat() {
        if (this.N == 0.0f) {
            final TypedValue typedValue = new TypedValue();
            final Context context = ((View)this).getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.N = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.N;
    }
    
    public static int k(final int n, final int n2, final int n3) {
        if (n2 >= n3 || n < 0) {
            return 0;
        }
        if (n2 + n > n3) {
            return n3 - n2;
        }
        return n;
    }
    
    public final void A() {
        this.r = new OverScroller(((View)this).getContext());
        ((View)this).setFocusable(true);
        ((ViewGroup)this).setDescendantFocusability(262144);
        ((View)this).setWillNotDraw(false);
        final ViewConfiguration value = ViewConfiguration.get(((View)this).getContext());
        this.C = value.getScaledTouchSlop();
        this.D = value.getScaledMinimumFlingVelocity();
        this.E = value.getScaledMaximumFlingVelocity();
    }
    
    public final void B() {
        if (this.z == null) {
            this.z = VelocityTracker.obtain();
        }
    }
    
    public final void C(final int u, final int f) {
        this.u = u;
        this.F = f;
        this.W(2, 0);
    }
    
    public final boolean D(final View view) {
        return this.F(view, 0, ((View)this).getHeight()) ^ true;
    }
    
    public final boolean F(final View view, final int n, final int n2) {
        view.getDrawingRect(this.q);
        ((ViewGroup)this).offsetDescendantRectToMyCoords(view, this.q);
        return this.q.bottom + n >= ((View)this).getScrollY() && this.q.top - n <= ((View)this).getScrollY() + n2;
    }
    
    public final void G(final int n, final int n2, final int[] array) {
        final int scrollY = ((View)this).getScrollY();
        ((View)this).scrollBy(0, n);
        final int n3 = ((View)this).getScrollY() - scrollY;
        if (array != null) {
            array[1] += n3;
        }
        this.M.d(0, n3, 0, n - n3, null, n2, array);
    }
    
    public final void H(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.u = (int)motionEvent.getY(n);
            this.F = motionEvent.getPointerId(n);
            final VelocityTracker z = this.z;
            if (z != null) {
                z.clear();
            }
        }
    }
    
    public boolean I(int n, int n2, int n3, int n4, int n5, final int n6, int n7, final int n8, final boolean b) {
        final int overScrollMode = ((View)this).getOverScrollMode();
        final int computeHorizontalScrollRange = this.computeHorizontalScrollRange();
        final int computeHorizontalScrollExtent = this.computeHorizontalScrollExtent();
        final boolean b2 = false;
        final boolean b3 = computeHorizontalScrollRange > computeHorizontalScrollExtent;
        final boolean b4 = this.computeVerticalScrollRange() > this.computeVerticalScrollExtent();
        final boolean b5 = overScrollMode == 0 || (overScrollMode == 1 && b3);
        final boolean b6 = overScrollMode == 0 || (overScrollMode == 1 && b4);
        n3 += n;
        if (!b5) {
            n = 0;
        }
        else {
            n = n7;
        }
        n4 += n2;
        if (!b6) {
            n2 = 0;
        }
        else {
            n2 = n8;
        }
        n7 = -n;
        n += n5;
        n5 = -n2;
        n2 += n6;
        boolean b7;
        if (n3 > n) {
            b7 = true;
        }
        else if (n3 < n7) {
            b7 = true;
            n = n7;
        }
        else {
            b7 = false;
            n = n3;
        }
        boolean b8;
        if (n4 > n2) {
            b8 = true;
        }
        else if (n4 < n5) {
            b8 = true;
            n2 = n5;
        }
        else {
            b8 = false;
            n2 = n4;
        }
        if (b8 && !this.x(1)) {
            this.r.springBack(n, n2, 0, 0, 0, this.getScrollRange());
        }
        this.onOverScrolled(n, n2, b7, b8);
        if (!b7) {
            final boolean b9 = b2;
            if (!b8) {
                return b9;
            }
        }
        return true;
    }
    
    public boolean J(final int n) {
        final boolean b = n == 130;
        final int height = ((View)this).getHeight();
        if (b) {
            this.q.top = ((View)this).getScrollY() + height;
            final int childCount = ((ViewGroup)this).getChildCount();
            if (childCount > 0) {
                final View child = ((ViewGroup)this).getChildAt(childCount - 1);
                final int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin + ((View)this).getPaddingBottom();
                final Rect q = this.q;
                if (q.top + height > n2) {
                    q.top = n2 - height;
                }
            }
        }
        else {
            this.q.top = ((View)this).getScrollY() - height;
            final Rect q2 = this.q;
            if (q2.top < 0) {
                q2.top = 0;
            }
        }
        final Rect q3 = this.q;
        final int top = q3.top;
        final int bottom = height + top;
        q3.bottom = bottom;
        return this.N(n, top, bottom);
    }
    
    public final void K() {
        final VelocityTracker z = this.z;
        if (z != null) {
            z.recycle();
            this.z = null;
        }
    }
    
    public final int L(int round, float d) {
        final float n = d / ((View)this).getWidth();
        final float n2 = round / (float)((View)this).getHeight();
        final float b = L.c.b(this.s);
        d = 0.0f;
        Label_0076: {
            EdgeEffect edgeEffect;
            if (b != 0.0f) {
                final float n3 = d = -L.c.d(this.s, -n2, n);
                if (L.c.b(this.s) != 0.0f) {
                    break Label_0076;
                }
                edgeEffect = this.s;
                d = n3;
            }
            else {
                if (L.c.b(this.t) == 0.0f) {
                    break Label_0076;
                }
                final float n4 = d = L.c.d(this.t, n2, 1.0f - n);
                if (L.c.b(this.t) != 0.0f) {
                    break Label_0076;
                }
                edgeEffect = this.t;
                d = n4;
            }
            edgeEffect.onRelease();
        }
        round = Math.round(d * ((View)this).getHeight());
        if (round != 0) {
            ((View)this).invalidate();
        }
        return round;
    }
    
    public final void M(final boolean b) {
        if (b) {
            this.W(2, 1);
        }
        else {
            this.Y(1);
        }
        this.J = ((View)this).getScrollY();
        I.s.x((View)this);
    }
    
    public final boolean N(final int n, int n2, final int n3) {
        final int height = ((View)this).getHeight();
        final int scrollY = ((View)this).getScrollY();
        final int n4 = height + scrollY;
        final boolean b = false;
        final boolean b2 = n == 33;
        Object t;
        if ((t = this.t(b2, n2, n3)) == null) {
            t = this;
        }
        boolean b3;
        if (n2 >= scrollY && n3 <= n4) {
            b3 = b;
        }
        else {
            if (b2) {
                n2 -= scrollY;
            }
            else {
                n2 = n3 - n4;
            }
            this.O(n2, 0, 1, true);
            b3 = true;
        }
        if (t != ((View)this).findFocus()) {
            ((View)t).requestFocus(n);
        }
        return b3;
    }
    
    public final int O(int n, final int n2, final int n3, final boolean b) {
        if (n3 == 1) {
            this.W(2, n3);
        }
        int n7;
        if (this.n(0, n, this.H, this.G, n3)) {
            final int n4 = this.H[1];
            final int n5 = this.G[1];
            final int n6 = n - n4;
            n = n5;
            n7 = n6;
        }
        else {
            n7 = n;
            n = 0;
        }
        final int scrollY = ((View)this).getScrollY();
        final int scrollRange = this.getScrollRange();
        final boolean b2 = this.i() && !b;
        final boolean b3 = this.I(0, n7, 0, scrollY, 0, scrollRange, 0, 0, true) && !this.x(n3);
        final int n8 = ((View)this).getScrollY() - scrollY;
        final int[] h = this.H;
        this.o(h[1] = 0, n8, 0, n7 - n8, this.G, n3, h);
        final int n9 = this.G[1];
        final int n10 = n7 - this.H[1];
        final int n11 = scrollY + n10;
        Label_0320: {
            EdgeEffect edgeEffect;
            if (n11 < 0) {
                if (!b2) {
                    break Label_0320;
                }
                L.c.d(this.s, -n10 / (float)((View)this).getHeight(), n2 / (float)((View)this).getWidth());
                if (this.t.isFinished()) {
                    break Label_0320;
                }
                edgeEffect = this.t;
            }
            else {
                if (n11 <= scrollRange || !b2) {
                    break Label_0320;
                }
                L.c.d(this.t, n10 / (float)((View)this).getHeight(), 1.0f - n2 / (float)((View)this).getWidth());
                if (this.s.isFinished()) {
                    break Label_0320;
                }
                edgeEffect = this.s;
            }
            edgeEffect.onRelease();
        }
        if (this.s.isFinished() && this.t.isFinished()) {
            if (b3 && n3 == 0) {
                this.z.clear();
            }
        }
        else {
            I.s.x((View)this);
        }
        if (n3 == 1) {
            this.Y(n3);
            this.s.onRelease();
            this.t.onRelease();
        }
        return n + n9;
    }
    
    public final void P(final View view) {
        view.getDrawingRect(this.q);
        ((ViewGroup)this).offsetDescendantRectToMyCoords(view, this.q);
        final int l = this.l(this.q);
        if (l != 0) {
            ((View)this).scrollBy(0, l);
        }
    }
    
    public final boolean Q(final Rect rect, final boolean b) {
        final int l = this.l(rect);
        final boolean b2 = l != 0;
        if (b2) {
            if (b) {
                ((View)this).scrollBy(0, l);
                return b2;
            }
            this.S(0, l);
        }
        return b2;
    }
    
    public final boolean R(final EdgeEffect edgeEffect, final int n) {
        return n > 0 || this.w(-n) < L.c.b(edgeEffect) * ((View)this).getHeight();
    }
    
    public final void S(final int n, final int n2) {
        this.T(n, n2, 250, false);
    }
    
    public final void T(int scrollY, int max, final int n, final boolean b) {
        if (((ViewGroup)this).getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.p > 250L) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int height = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            final int height2 = ((View)this).getHeight();
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            scrollY = ((View)this).getScrollY();
            max = Math.max(0, Math.min(max + scrollY, Math.max(0, height + topMargin + bottomMargin - (height2 - paddingTop - paddingBottom))));
            this.r.startScroll(((View)this).getScrollX(), scrollY, 0, max - scrollY, n);
            this.M(b);
        }
        else {
            if (!this.r.isFinished()) {
                this.g();
            }
            ((View)this).scrollBy(scrollY, max);
        }
        this.p = AnimationUtils.currentAnimationTimeMillis();
    }
    
    public void U(final int n, final int n2, final int n3, final boolean b) {
        this.T(n - ((View)this).getScrollX(), n2 - ((View)this).getScrollY(), n3, b);
    }
    
    public void V(final int n, final int n2, final boolean b) {
        this.U(n, n2, 250, b);
    }
    
    public boolean W(final int n, final int n2) {
        return this.M.m(n, n2);
    }
    
    public final boolean X(final MotionEvent motionEvent) {
        boolean b;
        if (L.c.b(this.s) != 0.0f) {
            L.c.d(this.s, 0.0f, motionEvent.getX() / ((View)this).getWidth());
            b = true;
        }
        else {
            b = false;
        }
        if (L.c.b(this.t) != 0.0f) {
            L.c.d(this.t, 0.0f, 1.0f - motionEvent.getX() / ((View)this).getWidth());
            return true;
        }
        return b;
    }
    
    public void Y(final int n) {
        this.M.n(n);
    }
    
    public void a(final View view, final View view2, final int n, final int n2) {
        this.L.c(view, view2, n, n2);
        this.W(2, n2);
    }
    
    public void addView(final View view) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void addView(final View view, final int n) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view, n);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (((ViewGroup)this).getChildCount() <= 0) {
            super.addView(view, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void b(final View view, final int n) {
        this.L.d(view, n);
        this.Y(n);
    }
    
    public void c(final View view, final int n, final int n2, final int[] array, final int n3) {
        this.n(n, n2, array, null, n3);
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
    
    public void computeScroll() {
        if (this.r.isFinished()) {
            return;
        }
        this.r.computeScrollOffset();
        final int currY = this.r.getCurrY();
        final int m = this.m(currY - this.J);
        this.J = currY;
        final int[] h = this.H;
        this.n(h[1] = 0, m, h, null, 1);
        final int n = m - this.H[1];
        final int scrollRange = this.getScrollRange();
        int n2;
        if ((n2 = n) != 0) {
            final int scrollY = ((View)this).getScrollY();
            this.I(0, n, ((View)this).getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            final int n3 = ((View)this).getScrollY() - scrollY;
            final int n4 = n - n3;
            final int[] h2 = this.H;
            this.o(h2[1] = 0, n3, 0, n4, this.G, 1, h2);
            n2 = n4 - this.H[1];
        }
        if (n2 != 0) {
            final int overScrollMode = ((View)this).getOverScrollMode();
            Label_0230: {
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    EdgeEffect edgeEffect;
                    if (n2 < 0) {
                        if (!this.s.isFinished()) {
                            break Label_0230;
                        }
                        edgeEffect = this.s;
                    }
                    else {
                        if (!this.t.isFinished()) {
                            break Label_0230;
                        }
                        edgeEffect = this.t;
                    }
                    edgeEffect.onAbsorb((int)this.r.getCurrVelocity());
                }
            }
            this.g();
        }
        if (!this.r.isFinished()) {
            I.s.x((View)this);
            return;
        }
        this.Y(1);
    }
    
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }
    
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }
    
    public int computeVerticalScrollRange() {
        final int childCount = ((ViewGroup)this).getChildCount();
        final int n = ((View)this).getHeight() - ((View)this).getPaddingBottom() - ((View)this).getPaddingTop();
        if (childCount == 0) {
            return n;
        }
        final View child = ((ViewGroup)this).getChildAt(0);
        final int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin;
        final int scrollY = ((View)this).getScrollY();
        final int max = Math.max(0, n2 - n);
        if (scrollY < 0) {
            return n2 - scrollY;
        }
        int n3 = n2;
        if (scrollY > max) {
            n3 = n2 + (scrollY - max);
        }
        return n3;
    }
    
    public void d(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.G(n4, n5, array);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.s(keyEvent);
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.M.a(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.M.b(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.n(n, n2, array, array2, 0);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.M.e(n, n2, n3, n4, array);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int scrollY = ((View)this).getScrollY();
        final boolean finished = this.s.isFinished();
        final int n = 0;
        if (!finished) {
            final int save = canvas.save();
            int width = ((View)this).getWidth();
            final int height = ((View)this).getHeight();
            final int min = Math.min(0, scrollY);
            int paddingLeft;
            if (b.a((ViewGroup)this)) {
                width -= ((View)this).getPaddingLeft() + ((View)this).getPaddingRight();
                paddingLeft = ((View)this).getPaddingLeft();
            }
            else {
                paddingLeft = 0;
            }
            int n2 = height;
            int n3 = min;
            if (b.a((ViewGroup)this)) {
                n2 = height - (((View)this).getPaddingTop() + ((View)this).getPaddingBottom());
                n3 = min + ((View)this).getPaddingTop();
            }
            canvas.translate((float)paddingLeft, (float)n3);
            this.s.setSize(width, n2);
            if (this.s.draw(canvas)) {
                I.s.x((View)this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.t.isFinished()) {
            final int save2 = canvas.save();
            final int width2 = ((View)this).getWidth();
            final int height2 = ((View)this).getHeight();
            final int n4 = Math.max(this.getScrollRange(), scrollY) + height2;
            int paddingLeft2 = n;
            int n5 = width2;
            if (b.a((ViewGroup)this)) {
                n5 = width2 - (((View)this).getPaddingLeft() + ((View)this).getPaddingRight());
                paddingLeft2 = ((View)this).getPaddingLeft();
            }
            int n6 = n4;
            int n7 = height2;
            if (b.a((ViewGroup)this)) {
                n7 = height2 - (((View)this).getPaddingTop() + ((View)this).getPaddingBottom());
                n6 = n4 - ((View)this).getPaddingBottom();
            }
            canvas.translate((float)(paddingLeft2 - n5), (float)n6);
            canvas.rotate(180.0f, (float)n5, 0.0f);
            this.t.setSize(n5, n7);
            if (this.t.draw(canvas)) {
                I.s.x((View)this);
            }
            canvas.restoreToCount(save2);
        }
    }
    
    public void e(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.G(n4, n5, null);
    }
    
    public boolean f(final View view, final View view2, final int n, final int n2) {
        return (n & 0x2) != 0x0;
    }
    
    public final void g() {
        this.r.abortAnimation();
        this.Y(1);
    }
    
    public float getBottomFadingEdgeStrength() {
        if (((ViewGroup)this).getChildCount() == 0) {
            return 0.0f;
        }
        final View child = ((ViewGroup)this).getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        final int verticalFadingEdgeLength = ((View)this).getVerticalFadingEdgeLength();
        final int n = child.getBottom() + frameLayout$LayoutParams.bottomMargin - ((View)this).getScrollY() - (((View)this).getHeight() - ((View)this).getPaddingBottom());
        if (n < verticalFadingEdgeLength) {
            return n / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public int getMaxScrollAmount() {
        return (int)(((View)this).getHeight() * 0.5f);
    }
    
    public int getNestedScrollAxes() {
        return this.L.a();
    }
    
    public int getScrollRange() {
        final int childCount = ((ViewGroup)this).getChildCount();
        int max = 0;
        if (childCount > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            max = Math.max(0, child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin - (((View)this).getHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()));
        }
        return max;
    }
    
    public float getTopFadingEdgeStrength() {
        if (((ViewGroup)this).getChildCount() == 0) {
            return 0.0f;
        }
        final int verticalFadingEdgeLength = ((View)this).getVerticalFadingEdgeLength();
        final int scrollY = ((View)this).getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public boolean h(int descendantFocusability) {
        View focus;
        if ((focus = ((View)this).findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, descendantFocusability);
        final int maxScrollAmount = this.getMaxScrollAmount();
        if (nextFocus != null && this.F(nextFocus, maxScrollAmount, ((View)this).getHeight())) {
            nextFocus.getDrawingRect(this.q);
            ((ViewGroup)this).offsetDescendantRectToMyCoords(nextFocus, this.q);
            this.O(this.l(this.q), 0, 1, true);
            nextFocus.requestFocus(descendantFocusability);
        }
        else {
            int n;
            if (descendantFocusability == 33 && ((View)this).getScrollY() < maxScrollAmount) {
                n = ((View)this).getScrollY();
            }
            else {
                n = maxScrollAmount;
                if (descendantFocusability == 130) {
                    n = maxScrollAmount;
                    if (((ViewGroup)this).getChildCount() > 0) {
                        final View child = ((ViewGroup)this).getChildAt(0);
                        n = Math.min(child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin - (((View)this).getScrollY() + ((View)this).getHeight() - ((View)this).getPaddingBottom()), maxScrollAmount);
                    }
                }
            }
            if (n == 0) {
                return false;
            }
            if (descendantFocusability != 130) {
                n = -n;
            }
            this.O(n, 0, 1, true);
        }
        if (focus != null && focus.isFocused() && this.D(focus)) {
            descendantFocusability = ((ViewGroup)this).getDescendantFocusability();
            ((ViewGroup)this).setDescendantFocusability(131072);
            ((View)this).requestFocus();
            ((ViewGroup)this).setDescendantFocusability(descendantFocusability);
        }
        return true;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.x(0);
    }
    
    public final boolean i() {
        final int overScrollMode = ((View)this).getOverScrollMode();
        boolean b = true;
        if (overScrollMode != 0) {
            if (overScrollMode == 1 && this.getScrollRange() > 0) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.M.j();
    }
    
    public final boolean j() {
        final int childCount = ((ViewGroup)this).getChildCount();
        boolean b = false;
        if (childCount > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            b = b;
            if (child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin > ((View)this).getHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom()) {
                b = true;
            }
        }
        return b;
    }
    
    public int l(final Rect rect) {
        final int childCount = ((ViewGroup)this).getChildCount();
        final boolean b = false;
        if (childCount == 0) {
            return 0;
        }
        final int height = ((View)this).getHeight();
        final int scrollY = ((View)this).getScrollY();
        final int n = scrollY + height;
        final int verticalFadingEdgeLength = ((View)this).getVerticalFadingEdgeLength();
        int n2 = scrollY;
        if (rect.top > 0) {
            n2 = scrollY + verticalFadingEdgeLength;
        }
        final View child = ((ViewGroup)this).getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        int n3;
        if (rect.bottom < child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin) {
            n3 = n - verticalFadingEdgeLength;
        }
        else {
            n3 = n;
        }
        final int bottom = rect.bottom;
        if (bottom > n3 && rect.top > n2) {
            int a;
            if (rect.height() > height) {
                a = rect.top - n2;
            }
            else {
                a = rect.bottom - n3;
            }
            return Math.min(a, child.getBottom() + frameLayout$LayoutParams.bottomMargin - n);
        }
        int max = b ? 1 : 0;
        if (rect.top < n2) {
            max = (b ? 1 : 0);
            if (bottom < n3) {
                int a2;
                if (rect.height() > height) {
                    a2 = 0 - (n3 - rect.bottom);
                }
                else {
                    a2 = 0 - (n2 - rect.top);
                }
                max = Math.max(a2, -((View)this).getScrollY());
            }
        }
        return max;
    }
    
    public int m(final int n) {
        final int height = ((View)this).getHeight();
        if (n > 0 && L.c.b(this.s) != 0.0f) {
            final int round = Math.round(-height / 4.0f * L.c.d(this.s, -n * 4.0f / height, 0.5f));
            if (round != n) {
                this.s.finish();
            }
            return n - round;
        }
        int n2;
        if ((n2 = n) < 0) {
            n2 = n;
            if (L.c.b(this.t) != 0.0f) {
                final float n3 = (float)n;
                final float n4 = (float)height;
                final int round2 = Math.round(n4 / 4.0f * L.c.d(this.t, n3 * 4.0f / n4, 0.5f));
                if (round2 != n) {
                    this.t.finish();
                }
                n2 = n - round2;
            }
        }
        return n2;
    }
    
    public void measureChild(final View view, final int n, final int n2) {
        view.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingLeft() + ((View)this).getPaddingRight(), view.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    
    public void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingLeft() + ((View)this).getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public boolean n(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.M.c(n, n2, array, array2, n3);
    }
    
    public void o(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, final int[] array2) {
        this.M.d(n, n2, n3, n4, array, n5, array2);
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = false;
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        boolean b2;
        final boolean b = b2 = false;
        if (action == 8) {
            b2 = b;
            if (!this.y) {
                float n;
                int n2;
                if (j.a(motionEvent, 2)) {
                    n = motionEvent.getAxisValue(9);
                    n2 = (int)motionEvent.getX();
                }
                else if (j.a(motionEvent, 4194304)) {
                    n = motionEvent.getAxisValue(26);
                    n2 = ((View)this).getWidth() / 2;
                }
                else {
                    n2 = 0;
                    n = 0.0f;
                }
                b2 = b;
                if (n != 0.0f) {
                    final int n3 = (int)(n * this.getVerticalScrollFactorCompat());
                    final boolean a = j.a(motionEvent, 8194);
                    final int n4 = -n3;
                    b2 = true;
                    this.O(n4, n2, 1, a);
                }
            }
        }
        return b2;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final boolean b = true;
        final boolean b2 = true;
        if (action == 2 && this.y) {
            return true;
        }
        final int n = action & 0xFF;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 6) {
                            return this.y;
                        }
                        this.H(motionEvent);
                        return this.y;
                    }
                }
                else {
                    final int f = this.F;
                    if (f == -1) {
                        return this.y;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(f);
                    if (pointerIndex == -1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid pointerId=");
                        sb.append(f);
                        sb.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", sb.toString());
                        return this.y;
                    }
                    final int u = (int)motionEvent.getY(pointerIndex);
                    if (Math.abs(u - this.u) <= this.C || (0x2 & this.getNestedScrollAxes()) != 0x0) {
                        return this.y;
                    }
                    this.y = true;
                    this.u = u;
                    this.B();
                    this.z.addMovement(motionEvent);
                    this.I = 0;
                    final ViewParent parent = ((View)this).getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        return this.y;
                    }
                    return this.y;
                }
            }
            this.y = false;
            this.F = -1;
            this.K();
            if (this.r.springBack(((View)this).getScrollX(), ((View)this).getScrollY(), 0, 0, 0, this.getScrollRange())) {
                I.s.x((View)this);
            }
            this.Y(0);
        }
        else {
            final int u2 = (int)motionEvent.getY();
            if (!this.y((int)motionEvent.getX(), u2)) {
                boolean y = b2;
                if (!this.X(motionEvent)) {
                    y = (!this.r.isFinished() && b2);
                }
                this.y = y;
                this.K();
            }
            else {
                this.u = u2;
                this.F = motionEvent.getPointerId(0);
                this.z();
                this.z.addMovement(motionEvent);
                this.r.computeScrollOffset();
                boolean y2 = b;
                if (!this.X(motionEvent)) {
                    y2 = (!this.r.isFinished() && b);
                }
                this.y = y2;
                this.W(2, 0);
            }
        }
        return this.y;
    }
    
    public void onLayout(final boolean b, int k, final int n, int scrollY, final int n2) {
        super.onLayout(b, k, n, scrollY, n2);
        k = 0;
        this.v = false;
        final View x = this.x;
        if (x != null && E(x, (View)this)) {
            this.P(this.x);
        }
        this.x = null;
        if (!this.w) {
            if (this.K != null) {
                this.scrollTo(((View)this).getScrollX(), this.K.o);
                this.K = null;
            }
            if (((ViewGroup)this).getChildCount() > 0) {
                final View child = ((ViewGroup)this).getChildAt(0);
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
                k = child.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
            }
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            scrollY = ((View)this).getScrollY();
            k = k(scrollY, n2 - n - paddingTop - paddingBottom, k);
            if (k != scrollY) {
                this.scrollTo(((View)this).getScrollX(), k);
            }
        }
        this.scrollTo(((View)this).getScrollX(), ((View)this).getScrollY());
        this.w = true;
    }
    
    public void onMeasure(final int n, int measuredHeight) {
        super.onMeasure(n, measuredHeight);
        if (!this.A) {
            return;
        }
        if (View$MeasureSpec.getMode(measuredHeight) == 0) {
            return;
        }
        if (((ViewGroup)this).getChildCount() > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            measuredHeight = child.getMeasuredHeight();
            final int n2 = ((View)this).getMeasuredHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom() - frameLayout$LayoutParams.topMargin - frameLayout$LayoutParams.bottomMargin;
            if (measuredHeight < n2) {
                child.measure(ViewGroup.getChildMeasureSpec(n, ((View)this).getPaddingLeft() + ((View)this).getPaddingRight() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin, frameLayout$LayoutParams.width), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
            }
        }
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (!b) {
            this.dispatchNestedFling(0.0f, n2, true);
            this.u((int)n2);
            return true;
        }
        return false;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.c(view, n, n2, array, 0);
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.G(n4, 0, null);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.a(view, view2, n, 0);
    }
    
    public void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.scrollTo(n, n2);
    }
    
    public boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2;
        if (n == 2) {
            n2 = 130;
        }
        else if ((n2 = n) == 1) {
            n2 = 33;
        }
        final FocusFinder instance = FocusFinder.getInstance();
        View view;
        if (rect == null) {
            view = instance.findNextFocus((ViewGroup)this, (View)null, n2);
        }
        else {
            view = instance.findNextFocusFromRect((ViewGroup)this, rect, n2);
        }
        return view != null && !this.D(view) && view.requestFocus(n2, rect);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final d k = (d)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)k).getSuperState());
        this.K = k;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final d d = new d(super.onSaveInstanceState());
        d.o = ((View)this).getScrollY();
        return (Parcelable)d;
    }
    
    public void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final View focus = ((View)this).findFocus();
        if (focus != null) {
            if (this == focus) {
                return;
            }
            if (this.F(focus, 0, n4)) {
                focus.getDrawingRect(this.q);
                ((ViewGroup)this).offsetDescendantRectToMyCoords(focus, this.q);
                this.p(this.l(this.q));
            }
        }
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.f(view, view2, n, 0);
    }
    
    public void onStopNestedScroll(final View view) {
        this.b(view, 0);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.B();
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = 0;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float)this.I);
        Label_0548: {
            if (actionMasked != 0) {
                Label_0163: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 5) {
                                    final int actionIndex = motionEvent.getActionIndex();
                                    this.u = (int)motionEvent.getY(actionIndex);
                                    this.F = motionEvent.getPointerId(actionIndex);
                                    break Label_0548;
                                }
                                if (actionMasked != 6) {
                                    break Label_0548;
                                }
                                this.H(motionEvent);
                                this.u = (int)motionEvent.getY(motionEvent.findPointerIndex(this.F));
                                break Label_0548;
                            }
                            else if (!this.y || ((ViewGroup)this).getChildCount() <= 0 || !this.r.springBack(((View)this).getScrollX(), ((View)this).getScrollY(), 0, 0, 0, this.getScrollRange())) {
                                break Label_0163;
                            }
                        }
                        else {
                            final int pointerIndex = motionEvent.findPointerIndex(this.F);
                            if (pointerIndex == -1) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Invalid pointerId=");
                                sb.append(this.F);
                                sb.append(" in onTouchEvent");
                                Log.e("NestedScrollView", sb.toString());
                                break Label_0548;
                            }
                            final int n = (int)motionEvent.getY(pointerIndex);
                            final int n2 = this.u - n;
                            int n3;
                            final int a = n3 = n2 - this.L(n2, motionEvent.getX(pointerIndex));
                            if (!this.y) {
                                n3 = a;
                                if (Math.abs(a) > this.C) {
                                    final ViewParent parent = ((View)this).getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    this.y = true;
                                    final int c = this.C;
                                    if (a > 0) {
                                        n3 = a - c;
                                    }
                                    else {
                                        n3 = a + c;
                                    }
                                }
                            }
                            if (this.y) {
                                final int o = this.O(n3, (int)motionEvent.getX(pointerIndex), 0, false);
                                this.u = n - o;
                                this.I += o;
                            }
                            break Label_0548;
                        }
                    }
                    else {
                        final VelocityTracker z = this.z;
                        z.computeCurrentVelocity(1000, (float)this.E);
                        final int a2 = (int)z.getYVelocity(this.F);
                        if (Math.abs(a2) >= this.D) {
                            if (this.q(a2)) {
                                break Label_0163;
                            }
                            final int n4 = -a2;
                            final float n5 = (float)n4;
                            if (!this.dispatchNestedPreFling(0.0f, n5)) {
                                this.dispatchNestedFling(0.0f, n5, true);
                                this.u(n4);
                            }
                            break Label_0163;
                        }
                        else if (!this.r.springBack(((View)this).getScrollX(), ((View)this).getScrollY(), 0, 0, 0, this.getScrollRange())) {
                            break Label_0163;
                        }
                    }
                    I.s.x((View)this);
                }
                this.r();
            }
            else {
                if (((ViewGroup)this).getChildCount() == 0) {
                    return false;
                }
                if (this.y) {
                    final ViewParent parent2 = ((View)this).getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if (!this.r.isFinished()) {
                    this.g();
                }
                this.C((int)motionEvent.getY(), motionEvent.getPointerId(0));
            }
        }
        final VelocityTracker z2 = this.z;
        if (z2 != null) {
            z2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
    
    public final void p(final int n) {
        if (n != 0) {
            if (this.B) {
                this.S(0, n);
                return;
            }
            ((View)this).scrollBy(0, n);
        }
    }
    
    public final boolean q(int n) {
        Label_0040: {
            EdgeEffect edgeEffect;
            if (L.c.b(this.s) != 0.0f) {
                if (!this.R(this.s, n)) {
                    n = -n;
                    break Label_0040;
                }
                edgeEffect = this.s;
            }
            else {
                if (L.c.b(this.t) == 0.0f) {
                    return false;
                }
                final EdgeEffect t = this.t;
                final int n2 = n = -n;
                if (!this.R(t, n2)) {
                    break Label_0040;
                }
                edgeEffect = this.t;
                n = n2;
            }
            edgeEffect.onAbsorb(n);
            return true;
        }
        this.u(n);
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
    
    public void requestChildFocus(final View view, final View x) {
        if (!this.v) {
            this.P(x);
        }
        else {
            this.x = x;
        }
        super.requestChildFocus(view, x);
    }
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return this.Q(rect, b);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        if (b) {
            this.K();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void requestLayout() {
        this.v = true;
        super.requestLayout();
    }
    
    public boolean s(final KeyEvent keyEvent) {
        this.q.setEmpty();
        final boolean j = this.j();
        boolean v = false;
        final boolean b = false;
        int n = 130;
        if (!j) {
            boolean b2 = b;
            if (((View)this).isFocused()) {
                b2 = b;
                if (keyEvent.getKeyCode() != 4) {
                    View focus;
                    if ((focus = ((View)this).findFocus()) == this) {
                        focus = null;
                    }
                    final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, 130);
                    b2 = b;
                    if (nextFocus != null) {
                        b2 = b;
                        if (nextFocus != this) {
                            b2 = b;
                            if (nextFocus.requestFocus(130)) {
                                b2 = true;
                            }
                        }
                    }
                }
            }
            return b2;
        }
        if (keyEvent.getAction() == 0) {
            final int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        n = 33;
                    }
                    this.J(n);
                    return false;
                }
                else {
                    if (!keyEvent.isAltPressed()) {
                        return this.h(130);
                    }
                    return this.v(130);
                }
            }
            else {
                if (!keyEvent.isAltPressed()) {
                    return this.h(33);
                }
                v = this.v(33);
            }
        }
        return v;
    }
    
    public void scrollTo(int k, int i) {
        if (((ViewGroup)this).getChildCount() > 0) {
            final View child = ((ViewGroup)this).getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int width = ((View)this).getWidth();
            final int paddingLeft = ((View)this).getPaddingLeft();
            final int paddingRight = ((View)this).getPaddingRight();
            final int width2 = child.getWidth();
            final int leftMargin = frameLayout$LayoutParams.leftMargin;
            final int rightMargin = frameLayout$LayoutParams.rightMargin;
            final int height = ((View)this).getHeight();
            final int paddingTop = ((View)this).getPaddingTop();
            final int paddingBottom = ((View)this).getPaddingBottom();
            final int height2 = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            k = k(k, width - paddingLeft - paddingRight, width2 + leftMargin + rightMargin);
            i = k(i, height - paddingTop - paddingBottom, height2 + topMargin + bottomMargin);
            if (k != ((View)this).getScrollX() || i != ((View)this).getScrollY()) {
                super.scrollTo(k, i);
            }
        }
    }
    
    public void setFillViewport(final boolean a) {
        if (a != this.A) {
            this.A = a;
            this.requestLayout();
        }
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.M.k(b);
    }
    
    public void setOnScrollChangeListener(final c c) {
    }
    
    public void setSmoothScrollingEnabled(final boolean b) {
        this.B = b;
    }
    
    public boolean shouldDelayChildPressedState() {
        return true;
    }
    
    public boolean startNestedScroll(final int n) {
        return this.W(n, 0);
    }
    
    public void stopNestedScroll() {
        this.Y(0);
    }
    
    public final View t(final boolean b, final int n, final int n2) {
        final ArrayList focusables = ((View)this).getFocusables(2);
        final int size = focusables.size();
        View view = null;
        int n3;
        View view3;
        int n4;
        for (int i = n3 = 0; i < size; ++i, view = view3, n3 = n4) {
            final View view2 = focusables.get(i);
            final int top = view2.getTop();
            final int bottom = view2.getBottom();
            view3 = view;
            n4 = n3;
            if (n < bottom) {
                view3 = view;
                n4 = n3;
                if (top < n2) {
                    final boolean b2 = n < top && bottom < n2;
                    if (view == null) {
                        view3 = view2;
                        n4 = (b2 ? 1 : 0);
                    }
                    else {
                        final boolean b3 = (b && top < view.getTop()) || (!b && bottom > view.getBottom());
                        if (n3 != 0) {
                            view3 = view;
                            n4 = n3;
                            if (!b2) {
                                continue;
                            }
                            view3 = view;
                            n4 = n3;
                            if (!b3) {
                                continue;
                            }
                        }
                        else {
                            if (b2) {
                                view3 = view2;
                                n4 = 1;
                                continue;
                            }
                            view3 = view;
                            n4 = n3;
                            if (!b3) {
                                continue;
                            }
                        }
                        view3 = view2;
                        n4 = n3;
                    }
                }
            }
        }
        return view;
    }
    
    public void u(final int n) {
        if (((ViewGroup)this).getChildCount() > 0) {
            this.r.fling(((View)this).getScrollX(), ((View)this).getScrollY(), 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.M(true);
        }
    }
    
    public boolean v(final int n) {
        final boolean b = n == 130;
        final int height = ((View)this).getHeight();
        final Rect q = this.q;
        q.top = 0;
        q.bottom = height;
        if (b) {
            final int childCount = ((ViewGroup)this).getChildCount();
            if (childCount > 0) {
                final View child = ((ViewGroup)this).getChildAt(childCount - 1);
                this.q.bottom = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin + ((View)this).getPaddingBottom();
                final Rect q2 = this.q;
                q2.top = q2.bottom - height;
            }
        }
        final Rect q3 = this.q;
        return this.N(n, q3.top, q3.bottom);
    }
    
    public final float w(final int a) {
        final double log = Math.log(Math.abs(a) * 0.35f / (this.o * 0.015f));
        final float o = NestedScrollView.O;
        return (float)(this.o * 0.015f * Math.exp(o / (o - 1.0) * log));
    }
    
    public boolean x(final int n) {
        return this.M.i(n);
    }
    
    public final boolean y(final int n, final int n2) {
        final int childCount = ((ViewGroup)this).getChildCount();
        boolean b2;
        final boolean b = b2 = false;
        if (childCount > 0) {
            final int scrollY = ((View)this).getScrollY();
            final View child = ((ViewGroup)this).getChildAt(0);
            b2 = b;
            if (n2 >= child.getTop() - scrollY) {
                b2 = b;
                if (n2 < child.getBottom() - scrollY) {
                    b2 = b;
                    if (n >= child.getLeft()) {
                        b2 = b;
                        if (n < child.getRight()) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final void z() {
        final VelocityTracker z = this.z;
        if (z == null) {
            this.z = VelocityTracker.obtain();
            return;
        }
        z.clear();
    }
    
    public static class a extends I.a
    {
        @Override
        public void f(final View view, final AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            final NestedScrollView nestedScrollView = (NestedScrollView)view;
            ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)ScrollView.class.getName());
            ((AccessibilityRecord)accessibilityEvent).setScrollable(nestedScrollView.getScrollRange() > 0);
            ((AccessibilityRecord)accessibilityEvent).setScrollX(((View)nestedScrollView).getScrollX());
            ((AccessibilityRecord)accessibilityEvent).setScrollY(((View)nestedScrollView).getScrollY());
            J.w.a((AccessibilityRecord)accessibilityEvent, ((View)nestedScrollView).getScrollX());
            J.w.b((AccessibilityRecord)accessibilityEvent, nestedScrollView.getScrollRange());
        }
        
        @Override
        public void g(final View view, final u u) {
            super.g(view, u);
            final NestedScrollView nestedScrollView = (NestedScrollView)view;
            u.I(ScrollView.class.getName());
            if (((View)nestedScrollView).isEnabled()) {
                final int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    u.M(true);
                    if (((View)nestedScrollView).getScrollY() > 0) {
                        u.a(J.u.a.q);
                        u.a(J.u.a.B);
                    }
                    if (((View)nestedScrollView).getScrollY() < scrollRange) {
                        u.a(J.u.a.p);
                        u.a(J.u.a.D);
                    }
                }
            }
        }
        
        @Override
        public boolean j(final View view, int n, final Bundle bundle) {
            if (super.j(view, n, bundle)) {
                return true;
            }
            final NestedScrollView nestedScrollView = (NestedScrollView)view;
            if (!((View)nestedScrollView).isEnabled()) {
                return false;
            }
            final int height = ((View)nestedScrollView).getHeight();
            final Rect rect = new Rect();
            int height2 = height;
            if (((View)nestedScrollView).getMatrix().isIdentity()) {
                height2 = height;
                if (((View)nestedScrollView).getGlobalVisibleRect(rect)) {
                    height2 = rect.height();
                }
            }
            if (n != 4096) {
                if (n != 8192 && n != 16908344) {
                    if (n != 16908346) {
                        return false;
                    }
                }
                else {
                    n = ((View)nestedScrollView).getPaddingBottom();
                    n = Math.max(((View)nestedScrollView).getScrollY() - (height2 - n - ((View)nestedScrollView).getPaddingTop()), 0);
                    if (n != ((View)nestedScrollView).getScrollY()) {
                        nestedScrollView.V(0, n, true);
                        return true;
                    }
                    return false;
                }
            }
            n = ((View)nestedScrollView).getPaddingBottom();
            n = Math.min(((View)nestedScrollView).getScrollY() + (height2 - n - ((View)nestedScrollView).getPaddingTop()), nestedScrollView.getScrollRange());
            if (n != ((View)nestedScrollView).getScrollY()) {
                nestedScrollView.V(0, n, true);
                return true;
            }
            return false;
        }
    }
    
    public abstract static class b
    {
        public static boolean a(final ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }
    
    public interface c
    {
    }
    
    public static class d extends View$BaseSavedState
    {
        public static final Parcelable$Creator<d> CREATOR;
        public int o;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public d a(final Parcel parcel) {
                    return new d(parcel);
                }
                
                public d[] b(final int n) {
                    return new d[n];
                }
            };
        }
        
        public d(final Parcel parcel) {
            super(parcel);
            this.o = parcel.readInt();
        }
        
        public d(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.o);
            sb.append("}");
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.o);
        }
    }
}
