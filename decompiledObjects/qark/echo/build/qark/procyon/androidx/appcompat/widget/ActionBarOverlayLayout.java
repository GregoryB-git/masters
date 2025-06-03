// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.Window$Callback;
import e.e;
import A.f;
import android.content.res.Configuration;
import I.s;
import android.view.WindowInsets;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import e.a;
import android.graphics.drawable.Drawable;
import l.A;
import I.n;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;
import I.x;
import android.graphics.Rect;
import android.annotation.SuppressLint;
import I.m;
import I.l;
import android.view.ViewGroup;

@SuppressLint({ "UnknownNullness" })
public class ActionBarOverlayLayout extends ViewGroup implements l, m
{
    public static final int[] S;
    public int A;
    public final Rect B;
    public final Rect C;
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public final Rect H;
    public x I;
    public x J;
    public x K;
    public x L;
    public OverScroller M;
    public ViewPropertyAnimator N;
    public final AnimatorListenerAdapter O;
    public final Runnable P;
    public final Runnable Q;
    public final n R;
    public int o;
    public int p;
    public ContentFrameLayout q;
    public ActionBarContainer r;
    public A s;
    public Drawable t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;
    
    static {
        S = new int[] { a.b, 16842841 };
    }
    
    public ActionBarOverlayLayout(@NonNull final Context context, final AttributeSet set) {
        super(context, set);
        this.p = 0;
        this.B = new Rect();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        final x b = I.x.b;
        this.I = b;
        this.J = b;
        this.K = b;
        this.L = b;
        this.O = new AnimatorListenerAdapter() {
            public void onAnimationCancel(final Animator animator) {
                final ActionBarOverlayLayout a = ActionBarOverlayLayout.this;
                a.N = null;
                a.y = false;
            }
            
            public void onAnimationEnd(final Animator animator) {
                final ActionBarOverlayLayout a = ActionBarOverlayLayout.this;
                a.N = null;
                a.y = false;
            }
        };
        this.P = new Runnable() {
            @Override
            public void run() {
                ActionBarOverlayLayout.this.l();
                final ActionBarOverlayLayout o = ActionBarOverlayLayout.this;
                o.N = ((View)o.r).animate().translationY(0.0f).setListener((Animator$AnimatorListener)ActionBarOverlayLayout.this.O);
            }
        };
        this.Q = new Runnable() {
            @Override
            public void run() {
                ActionBarOverlayLayout.this.l();
                final ActionBarOverlayLayout o = ActionBarOverlayLayout.this;
                o.N = ((View)o.r).animate().translationY((float)(-((View)ActionBarOverlayLayout.this.r).getHeight())).setListener((Animator$AnimatorListener)ActionBarOverlayLayout.this.O);
            }
        };
        this.m(context);
        this.R = new n(this);
    }
    
    public void a(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    public void b(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public void c(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    public boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof e;
    }
    
    public void d(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.e(view, n, n2, n3, n4, n5);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.t != null && !this.u) {
            int n;
            if (((View)this.r).getVisibility() == 0) {
                n = (int)(((View)this.r).getBottom() + ((View)this.r).getTranslationY() + 0.5f);
            }
            else {
                n = 0;
            }
            this.t.setBounds(0, n, ((View)this).getWidth(), this.t.getIntrinsicHeight() + n);
            this.t.draw(canvas);
        }
    }
    
    public void e(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public boolean f(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public boolean fitSystemWindows(final Rect rect) {
        return super.fitSystemWindows(rect);
    }
    
    public final void g() {
        this.l();
        this.Q.run();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new e(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        final ActionBarContainer r = this.r;
        if (r != null) {
            return -(int)((View)r).getTranslationY();
        }
        return 0;
    }
    
    public int getNestedScrollAxes() {
        return this.R.a();
    }
    
    public CharSequence getTitle() {
        this.p();
        return this.s.getTitle();
    }
    
    public final boolean h(final View view, final Rect rect, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final e e = (e)view.getLayoutParams();
        boolean b5 = false;
        Label_0046: {
            if (b) {
                final int leftMargin = e.leftMargin;
                final int left = rect.left;
                if (leftMargin != left) {
                    e.leftMargin = left;
                    b5 = true;
                    break Label_0046;
                }
            }
            b5 = false;
        }
        boolean b6 = b5;
        if (b2) {
            final int topMargin = e.topMargin;
            final int top = rect.top;
            b6 = b5;
            if (topMargin != top) {
                e.topMargin = top;
                b6 = true;
            }
        }
        boolean b7 = b6;
        if (b4) {
            final int rightMargin = e.rightMargin;
            final int right = rect.right;
            b7 = b6;
            if (rightMargin != right) {
                e.rightMargin = right;
                b7 = true;
            }
        }
        if (b3) {
            final int bottomMargin = e.bottomMargin;
            final int bottom = rect.bottom;
            if (bottomMargin != bottom) {
                e.bottomMargin = bottom;
                return true;
            }
        }
        return b7;
    }
    
    public e i() {
        return new e(-1, -1);
    }
    
    public e j(final AttributeSet set) {
        return new e(((View)this).getContext(), set);
    }
    
    public final A k(final View view) {
        if (view instanceof A) {
            return (A)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }
    
    public void l() {
        ((View)this).removeCallbacks(this.P);
        ((View)this).removeCallbacks(this.Q);
        final ViewPropertyAnimator n = this.N;
        if (n != null) {
            n.cancel();
        }
    }
    
    public final void m(final Context context) {
        final TypedArray obtainStyledAttributes = ((View)this).getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.S);
        final boolean b = false;
        this.o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.t = drawable;
        ((View)this).setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean u = b;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            u = true;
        }
        this.u = u;
        this.M = new OverScroller(context);
    }
    
    public final void n() {
        this.l();
        ((View)this).postDelayed(this.Q, 600L);
    }
    
    public final void o() {
        this.l();
        ((View)this).postDelayed(this.P, 600L);
    }
    
    public WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        this.p();
        final x s = I.x.s(windowInsets);
        boolean h = this.h((View)this.r, new Rect(s.i(), s.k(), s.j(), s.h()), true, true, false, true);
        I.s.b((View)this, s, this.B);
        final Rect b = this.B;
        final x l = s.l(b.left, b.top, b.right, b.bottom);
        this.I = l;
        if (!this.J.equals(l)) {
            this.J = this.I;
            h = true;
        }
        if (!this.C.equals((Object)this.B)) {
            this.C.set(this.B);
        }
        else if (!h) {
            return s.a().c().b().r();
        }
        ((View)this).requestLayout();
        return s.a().c().b().r();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m(((View)this).getContext());
        I.s.A((View)this);
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l();
    }
    
    public void onLayout(final boolean b, int i, int childCount, int paddingLeft, int paddingTop) {
        childCount = this.getChildCount();
        paddingLeft = ((View)this).getPaddingLeft();
        paddingTop = ((View)this).getPaddingTop();
        View child;
        e e;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                e = (e)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = e.leftMargin + paddingLeft;
                n2 = e.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        this.p();
        this.measureChildWithMargins((View)this.r, n, 0, n2, 0);
        final e e = (e)((View)this.r).getLayoutParams();
        final int max = Math.max(0, ((View)this.r).getMeasuredWidth() + e.leftMargin + e.rightMargin);
        final int max2 = Math.max(0, ((View)this.r).getMeasuredHeight() + e.topMargin + e.bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, ((View)this.r).getMeasuredState());
        final boolean b = (I.s.r((View)this) & 0x100) != 0x0;
        int n4;
        if (b) {
            final int n3 = n4 = this.o;
            if (this.w) {
                n4 = n3;
                if (this.r.getTabContainer() != null) {
                    n4 = n3 + this.o;
                }
            }
        }
        else if (((View)this.r).getVisibility() != 8) {
            n4 = ((View)this.r).getMeasuredHeight();
        }
        else {
            n4 = 0;
        }
        this.D.set(this.B);
        final x i = this.I;
        this.K = i;
        x k;
        if (!this.v && !b) {
            final Rect d = this.D;
            d.top += n4;
            d.bottom = d.bottom;
            k = i.l(0, n4, 0, 0);
        }
        else {
            k = new x.b(this.K).c(f.b(i.i(), this.K.k() + n4, this.K.j(), this.K.h())).a();
        }
        this.K = k;
        this.h((View)this.q, this.D, true, true, true, true);
        if (!this.L.equals(this.K)) {
            final x j = this.K;
            this.L = j;
            I.s.c((View)this.q, j);
        }
        this.measureChildWithMargins((View)this.q, n, 0, n2, 0);
        final e e2 = (e)((View)this.q).getLayoutParams();
        final int max3 = Math.max(max, ((View)this.q).getMeasuredWidth() + e2.leftMargin + e2.rightMargin);
        final int max4 = Math.max(max2, ((View)this.q).getMeasuredHeight() + e2.topMargin + e2.bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, ((View)this.q).getMeasuredState());
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (((View)this).getPaddingLeft() + ((View)this).getPaddingRight()), ((View)this).getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + (((View)this).getPaddingTop() + ((View)this).getPaddingBottom()), ((View)this).getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (this.x && b) {
            if (this.r(n2)) {
                this.g();
            }
            else {
                this.q();
            }
            return this.y = true;
        }
        return false;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public void onNestedScroll(final View view, int z, final int n, final int n2, final int n3) {
        z = this.z + n;
        this.setActionBarHideOffset(this.z = z);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.R.b(view, view2, n);
        this.z = this.getActionBarHideOffset();
        this.l();
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && ((View)this.r).getVisibility() == 0 && this.x;
    }
    
    public void onStopNestedScroll(final View view) {
        if (this.x && !this.y) {
            if (this.z <= ((View)this.r).getHeight()) {
                this.o();
                return;
            }
            this.n();
        }
    }
    
    public void onWindowSystemUiVisibilityChanged(final int a) {
        super.onWindowSystemUiVisibilityChanged(a);
        this.p();
        this.A = a;
    }
    
    public void onWindowVisibilityChanged(final int p) {
        super.onWindowVisibilityChanged(p);
        this.p = p;
    }
    
    public void p() {
        if (this.q == null) {
            this.q = (ContentFrameLayout)((View)this).findViewById(e.e.b);
            this.r = (ActionBarContainer)((View)this).findViewById(e.e.c);
            this.s = this.k(((View)this).findViewById(e.e.a));
        }
    }
    
    public final void q() {
        this.l();
        this.P.run();
    }
    
    public final boolean r(final float n) {
        this.M.fling(0, 0, 0, (int)n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.M.getFinalY() > ((View)this.r).getHeight();
    }
    
    public void setActionBarHideOffset(int max) {
        this.l();
        max = Math.max(0, Math.min(max, ((View)this.r).getHeight()));
        ((View)this.r).setTranslationY((float)(-max));
    }
    
    public void setActionBarVisibilityCallback(final d d) {
        if (((View)this).getWindowToken() == null) {
            return;
        }
        throw null;
    }
    
    public void setHasNonEmbeddedTabs(final boolean w) {
        this.w = w;
    }
    
    public void setHideOnContentScrollEnabled(final boolean x) {
        if (x != this.x && !(this.x = x)) {
            this.l();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int icon) {
        this.p();
        this.s.setIcon(icon);
    }
    
    public void setIcon(final Drawable icon) {
        this.p();
        this.s.setIcon(icon);
    }
    
    public void setLogo(final int n) {
        this.p();
        this.s.c(n);
    }
    
    public void setOverlayMode(final boolean v) {
        this.v = v;
        this.u = (v && ((View)this).getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final Window$Callback window$Callback) {
        this.p();
        this.s.b(window$Callback);
    }
    
    public void setWindowTitle(final CharSequence charSequence) {
        this.p();
        this.s.a(charSequence);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public interface d
    {
    }
    
    public static class e extends ViewGroup$MarginLayoutParams
    {
        public e(final int n, final int n2) {
            super(n, n2);
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
