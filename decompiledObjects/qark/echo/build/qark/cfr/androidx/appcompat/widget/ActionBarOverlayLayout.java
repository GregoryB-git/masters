/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewPropertyAnimator
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowInsets
 *  android.widget.OverScroller
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.appcompat.widget;

import A.f;
import I.l;
import I.m;
import I.n;
import I.s;
import I.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import e.a;
import l.A;

@SuppressLint(value={"UnknownNullness"})
public class ActionBarOverlayLayout
extends ViewGroup
implements l,
m {
    public static final int[] S = new int[]{a.b, 16842841};
    public int A;
    public final Rect B = new Rect();
    public final Rect C = new Rect();
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public final Rect G = new Rect();
    public final Rect H = new Rect();
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
    public int p = 0;
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

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        this.I = object = x.b;
        this.J = object;
        this.K = object;
        this.L = object;
        this.O = new AnimatorListenerAdapter(){

            public void onAnimationCancel(Animator object) {
                object = ActionBarOverlayLayout.this;
                object.N = null;
                object.y = false;
            }

            public void onAnimationEnd(Animator object) {
                object = ActionBarOverlayLayout.this;
                object.N = null;
                object.y = false;
            }
        };
        this.P = new Runnable(){

            public void run() {
                ActionBarOverlayLayout.this.l();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.N = actionBarOverlayLayout.r.animate().translationY(0.0f).setListener((Animator.AnimatorListener)ActionBarOverlayLayout.this.O);
            }
        };
        this.Q = new Runnable(){

            public void run() {
                ActionBarOverlayLayout.this.l();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.N = actionBarOverlayLayout.r.animate().translationY((float)(- ActionBarOverlayLayout.this.r.getHeight())).setListener((Animator.AnimatorListener)ActionBarOverlayLayout.this.O);
            }
        };
        this.m(context);
        this.R = new n(this);
    }

    @Override
    public void a(View view, View view2, int n8, int n9) {
        if (n9 == 0) {
            this.onNestedScrollAccepted(view, view2, n8);
        }
    }

    @Override
    public void b(View view, int n8) {
        if (n8 == 0) {
            this.onStopNestedScroll(view);
        }
    }

    @Override
    public void c(View view, int n8, int n9, int[] arrn, int n10) {
        if (n10 == 0) {
            this.onNestedPreScroll(view, n8, n9, arrn);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override
    public void d(View view, int n8, int n9, int n10, int n11, int n12, int[] arrn) {
        this.e(view, n8, n9, n10, n11, n12);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.t != null && !this.u) {
            int n8 = this.r.getVisibility() == 0 ? (int)((float)this.r.getBottom() + this.r.getTranslationY() + 0.5f) : 0;
            this.t.setBounds(0, n8, this.getWidth(), this.t.getIntrinsicHeight() + n8);
            this.t.draw(canvas);
        }
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
        if (n12 == 0) {
            this.onNestedScroll(view, n8, n9, n10, n11);
        }
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        if (n9 == 0 && this.onStartNestedScroll(view, view2, n8)) {
            return true;
        }
        return false;
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        this.l();
        this.Q.run();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.r;
        if (actionBarContainer != null) {
            return - (int)actionBarContainer.getTranslationY();
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

    public final boolean h(View object, Rect rect, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5;
        int n8;
        int n9;
        object = (e)object.getLayoutParams();
        if (bl && (n8 = object.leftMargin) != (n9 = rect.left)) {
            object.leftMargin = n9;
            bl5 = true;
        } else {
            bl5 = false;
        }
        bl = bl5;
        if (bl2) {
            n8 = object.topMargin;
            n9 = rect.top;
            bl = bl5;
            if (n8 != n9) {
                object.topMargin = n9;
                bl = true;
            }
        }
        bl2 = bl;
        if (bl4) {
            n8 = object.rightMargin;
            n9 = rect.right;
            bl2 = bl;
            if (n8 != n9) {
                object.rightMargin = n9;
                bl2 = true;
            }
        }
        if (bl3 && (n8 = object.bottomMargin) != (n9 = rect.bottom)) {
            object.bottomMargin = n9;
            return true;
        }
        return bl2;
    }

    public e i() {
        return new e(-1, -1);
    }

    public e j(AttributeSet attributeSet) {
        return new e(this.getContext(), attributeSet);
    }

    public final A k(View view) {
        if (view instanceof A) {
            return (A)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        stringBuilder.append(view.getClass().getSimpleName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void l() {
        this.removeCallbacks(this.P);
        this.removeCallbacks(this.Q);
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void m(Context context) {
        Drawable drawable2;
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(S);
        boolean bl = false;
        this.o = typedArray.getDimensionPixelSize(0, 0);
        this.t = drawable2 = typedArray.getDrawable(1);
        boolean bl2 = drawable2 == null;
        this.setWillNotDraw(bl2);
        typedArray.recycle();
        bl2 = bl;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            bl2 = true;
        }
        this.u = bl2;
        this.M = new OverScroller(context);
    }

    public final void n() {
        this.l();
        this.postDelayed(this.Q, 600L);
    }

    public final void o() {
        this.l();
        this.postDelayed(this.P, 600L);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets object) {
        block6 : {
            block5 : {
                boolean bl;
                block4 : {
                    this.p();
                    object = x.s((WindowInsets)object);
                    Object object2 = new Rect(object.i(), object.k(), object.j(), object.h());
                    bl = this.h((View)this.r, (Rect)object2, true, true, false, true);
                    s.b((View)this, (x)object, this.B);
                    object2 = this.B;
                    this.I = object2 = object.l(object2.left, object2.top, object2.right, object2.bottom);
                    if (!this.J.equals(object2)) {
                        this.J = this.I;
                        bl = true;
                    }
                    if (this.C.equals((Object)this.B)) break block4;
                    this.C.set(this.B);
                    break block5;
                }
                if (!bl) break block6;
            }
            this.requestLayout();
        }
        return object.a().c().b().r();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m(this.getContext());
        s.A((View)this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l();
    }

    public void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        n9 = this.getChildCount();
        n10 = this.getPaddingLeft();
        n11 = this.getPaddingTop();
        for (n8 = 0; n8 < n9; ++n8) {
            View view = this.getChildAt(n8);
            if (view.getVisibility() == 8) continue;
            e e8 = (e)view.getLayoutParams();
            int n12 = view.getMeasuredWidth();
            int n13 = view.getMeasuredHeight();
            int n14 = e8.leftMargin + n10;
            int n15 = e8.topMargin + n11;
            view.layout(n14, n15, n12 + n14, n13 + n15);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onMeasure(int n8, int n9) {
        int n10;
        int n11;
        this.p();
        this.measureChildWithMargins((View)this.r, n8, 0, n9, 0);
        Object object = (e)this.r.getLayoutParams();
        int n12 = Math.max((int)0, (int)(this.r.getMeasuredWidth() + object.leftMargin + object.rightMargin));
        int n13 = Math.max((int)0, (int)(this.r.getMeasuredHeight() + object.topMargin + object.bottomMargin));
        int n14 = View.combineMeasuredStates((int)0, (int)this.r.getMeasuredState());
        int n15 = (s.r((View)this) & 256) != 0 ? 1 : 0;
        if (n15 != 0) {
            n11 = n10 = this.o;
            if (this.w) {
                n11 = n10;
                if (this.r.getTabContainer() != null) {
                    n11 = n10 + this.o;
                }
            }
        } else {
            n11 = this.r.getVisibility() != 8 ? this.r.getMeasuredHeight() : 0;
        }
        this.D.set(this.B);
        this.K = object = this.I;
        if (!this.v && n15 == 0) {
            Rect rect = this.D;
            rect.top += n11;
            object = object.l(0, n11, 0, 0);
        } else {
            object = f.b(object.i(), this.K.k() + n11, this.K.j(), this.K.h());
            object = new x.b(this.K).c((f)object).a();
        }
        this.K = object;
        this.h((View)this.q, this.D, true, true, true, true);
        if (!this.L.equals(this.K)) {
            this.L = object = this.K;
            s.c((View)this.q, (x)object);
        }
        this.measureChildWithMargins((View)this.q, n8, 0, n9, 0);
        object = (e)this.q.getLayoutParams();
        n11 = Math.max((int)n12, (int)(this.q.getMeasuredWidth() + object.leftMargin + object.rightMargin));
        n15 = Math.max((int)n13, (int)(this.q.getMeasuredHeight() + object.topMargin + object.bottomMargin));
        n10 = View.combineMeasuredStates((int)n14, (int)this.q.getMeasuredState());
        n14 = this.getPaddingLeft();
        n13 = this.getPaddingRight();
        n15 = Math.max((int)(n15 + (this.getPaddingTop() + this.getPaddingBottom())), (int)this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max((int)(n11 + (n14 + n13)), (int)this.getSuggestedMinimumWidth()), (int)n8, (int)n10), View.resolveSizeAndState((int)n15, (int)n9, (int)(n10 << 16)));
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        if (this.x && bl) {
            if (this.r(f9)) {
                this.g();
            } else {
                this.q();
            }
            this.y = true;
            return true;
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    public void onNestedPreScroll(View view, int n8, int n9, int[] arrn) {
    }

    public void onNestedScroll(View view, int n8, int n9, int n10, int n11) {
        this.z = n8 = this.z + n9;
        this.setActionBarHideOffset(n8);
    }

    public void onNestedScrollAccepted(View view, View view2, int n8) {
        this.R.b(view, view2, n8);
        this.z = this.getActionBarHideOffset();
        this.l();
    }

    public boolean onStartNestedScroll(View view, View view2, int n8) {
        if ((n8 & 2) != 0 && this.r.getVisibility() == 0) {
            return this.x;
        }
        return false;
    }

    public void onStopNestedScroll(View view) {
        if (this.x && !this.y) {
            if (this.z <= this.r.getHeight()) {
                this.o();
                return;
            }
            this.n();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int n8) {
        super.onWindowSystemUiVisibilityChanged(n8);
        this.p();
        this.A = n8;
    }

    public void onWindowVisibilityChanged(int n8) {
        super.onWindowVisibilityChanged(n8);
        this.p = n8;
    }

    public void p() {
        if (this.q == null) {
            this.q = (ContentFrameLayout)this.findViewById(e.e.b);
            this.r = (ActionBarContainer)this.findViewById(e.e.c);
            this.s = this.k(this.findViewById(e.e.a));
        }
    }

    public final void q() {
        this.l();
        this.P.run();
    }

    public final boolean r(float f8) {
        this.M.fling(0, 0, 0, (int)f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.M.getFinalY() > this.r.getHeight()) {
            return true;
        }
        return false;
    }

    public void setActionBarHideOffset(int n8) {
        this.l();
        n8 = Math.max((int)0, (int)Math.min((int)n8, (int)this.r.getHeight()));
        this.r.setTranslationY((float)(- n8));
    }

    public void setActionBarVisibilityCallback(d d8) {
        if (this.getWindowToken() == null) {
            return;
        }
        throw null;
    }

    public void setHasNonEmbeddedTabs(boolean bl) {
        this.w = bl;
    }

    public void setHideOnContentScrollEnabled(boolean bl) {
        if (bl != this.x) {
            this.x = bl;
            if (!bl) {
                this.l();
                this.setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int n8) {
        this.p();
        this.s.setIcon(n8);
    }

    public void setIcon(Drawable drawable2) {
        this.p();
        this.s.setIcon(drawable2);
    }

    public void setLogo(int n8) {
        this.p();
        this.s.c(n8);
    }

    public void setOverlayMode(boolean bl) {
        this.v = bl;
        bl = bl && this.getContext().getApplicationInfo().targetSdkVersion < 19;
        this.u = bl;
    }

    public void setShowingForActionMode(boolean bl) {
    }

    public void setUiOptions(int n8) {
    }

    public void setWindowCallback(Window.Callback callback) {
        this.p();
        this.s.b(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        this.p();
        this.s.a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static interface d {
    }

    public static class e
    extends ViewGroup.MarginLayoutParams {
        public e(int n8, int n9) {
            super(n8, n9);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

}

