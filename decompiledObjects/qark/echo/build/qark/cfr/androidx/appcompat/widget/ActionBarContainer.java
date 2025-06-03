/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  java.lang.Math
 *  java.lang.Object
 */
package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c;
import e.e;
import e.i;
import l.b;

public class ActionBarContainer
extends FrameLayout {
    public boolean o;
    public View p;
    public View q;
    public View r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public boolean v;
    public boolean w;
    public int x;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.E((View)this, new b(this));
        context = context.obtainStyledAttributes(attributeSet, i.a);
        this.s = context.getDrawable(i.b);
        this.t = context.getDrawable(i.d);
        this.x = context.getDimensionPixelSize(i.i, -1);
        int n8 = this.getId();
        int n9 = e.x;
        boolean bl = true;
        if (n8 == n9) {
            this.v = true;
            this.u = context.getDrawable(i.c);
        }
        context.recycle();
        if (!(this.v ? this.u == null : this.s == null && this.t == null)) {
            bl = false;
        }
        this.setWillNotDraw(bl);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable2 = this.s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.s.setState(this.getDrawableState());
        }
        if ((drawable2 = this.t) != null && drawable2.isStateful()) {
            this.t.setState(this.getDrawableState());
        }
        if ((drawable2 = this.u) != null && drawable2.isStateful()) {
            this.u.setState(this.getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.p;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        if ((drawable2 = this.t) != null) {
            drawable2.jumpToCurrentState();
        }
        if ((drawable2 = this.u) != null) {
            drawable2.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.q = this.findViewById(e.a);
        this.r = this.findViewById(e.f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.o && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block6 : {
            block9 : {
                block7 : {
                    block8 : {
                        block5 : {
                            super.onLayout(var1_1, var2_2, var3_3, var4_4, var5_5);
                            var10_6 = this.p;
                            var5_5 = 1;
                            var1_1 = var10_6 != null && var10_6.getVisibility() != 8;
                            if (var10_6 != null && var10_6.getVisibility() != 8) {
                                var3_3 = this.getMeasuredHeight();
                                var8_7 = (FrameLayout.LayoutParams)var10_6.getLayoutParams();
                                var6_8 = var10_6.getMeasuredHeight();
                                var7_9 = var8_7.bottomMargin;
                                var10_6.layout(var2_2, var3_3 - var6_8 - var7_9, var4_4, var3_3 - var7_9);
                            }
                            if (!this.v) break block5;
                            var8_7 = this.u;
                            if (var8_7 == null) return;
                            var8_7.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                            break block6;
                        }
                        if (this.s == null) break block7;
                        if (this.q.getVisibility() != 0) break block8;
                        var9_10 = this.s;
                        var3_3 = this.q.getLeft();
                        var4_4 = this.q.getTop();
                        var2_2 = this.q.getRight();
                        var8_7 = this.q;
                        ** GOTO lbl33
                    }
                    var8_7 = this.r;
                    if (var8_7 != null && var8_7.getVisibility() == 0) {
                        var9_10 = this.s;
                        var3_3 = this.r.getLeft();
                        var4_4 = this.r.getTop();
                        var2_2 = this.r.getRight();
                        var8_7 = this.r;
lbl33: // 2 sources:
                        var9_10.setBounds(var3_3, var4_4, var2_2, var8_7.getBottom());
                        var2_2 = var5_5;
                    } else {
                        this.s.setBounds(0, 0, 0, 0);
                        var2_2 = var5_5;
                    }
                    break block9;
                }
                var2_2 = 0;
            }
            this.w = var1_1;
            if (var1_1 && (var8_7 = this.t) != null) {
                var8_7.setBounds(var10_6.getLeft(), var10_6.getTop(), var10_6.getRight(), var10_6.getBottom());
            } else if (var2_2 == 0) return;
        }
        this.invalidate();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMeasure(int var1_1, int var2_2) {
        block6 : {
            var3_3 = var2_2;
            if (this.q == null) {
                var3_3 = var2_2;
                if (View.MeasureSpec.getMode((int)var2_2) == Integer.MIN_VALUE) {
                    var4_4 = this.x;
                    var3_3 = var2_2;
                    if (var4_4 >= 0) {
                        var3_3 = View.MeasureSpec.makeMeasureSpec((int)Math.min((int)var4_4, (int)View.MeasureSpec.getSize((int)var2_2)), (int)Integer.MIN_VALUE);
                    }
                }
            }
            super.onMeasure(var1_1, var3_3);
            if (this.q == null) {
                return;
            }
            var2_2 = View.MeasureSpec.getMode((int)var3_3);
            var5_5 = this.p;
            if (var5_5 == null) return;
            if (var5_5.getVisibility() == 8) return;
            if (var2_2 == 1073741824) return;
            if (this.b(this.q)) break block6;
            var5_5 = this.q;
            ** GOTO lbl23
        }
        if (!this.b(this.r)) {
            var5_5 = this.r;
lbl23: // 2 sources:
            var1_1 = this.a(var5_5);
        } else {
            var1_1 = 0;
        }
        var2_2 = var2_2 == Integer.MIN_VALUE ? View.MeasureSpec.getSize((int)var3_3) : Integer.MAX_VALUE;
        this.setMeasuredDimension(this.getMeasuredWidth(), Math.min((int)(var1_1 + this.a(this.p)), (int)var2_2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPrimaryBackground(Drawable drawable2) {
        boolean bl;
        block7 : {
            block8 : {
                boolean bl2;
                block6 : {
                    Drawable drawable3 = this.s;
                    if (drawable3 != null) {
                        drawable3.setCallback(null);
                        this.unscheduleDrawable(this.s);
                    }
                    this.s = drawable2;
                    if (drawable2 != null) {
                        drawable2.setCallback((Drawable.Callback)this);
                        drawable2 = this.q;
                        if (drawable2 != null) {
                            this.s.setBounds(drawable2.getLeft(), this.q.getTop(), this.q.getRight(), this.q.getBottom());
                        }
                    }
                    bl = this.v;
                    bl2 = false;
                    if (!bl) break block6;
                    bl = bl2;
                    if (this.u != null) break block7;
                    break block8;
                }
                bl = bl2;
                if (this.s != null) break block7;
                bl = bl2;
                if (this.t != null) break block7;
            }
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
        this.invalidateOutline();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSplitBackground(Drawable drawable2) {
        boolean bl;
        block7 : {
            block8 : {
                boolean bl2;
                block6 : {
                    Drawable drawable3 = this.u;
                    if (drawable3 != null) {
                        drawable3.setCallback(null);
                        this.unscheduleDrawable(this.u);
                    }
                    this.u = drawable2;
                    bl2 = false;
                    if (drawable2 != null) {
                        drawable2.setCallback((Drawable.Callback)this);
                        if (this.v && (drawable2 = this.u) != null) {
                            drawable2.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                        }
                    }
                    if (!this.v) break block6;
                    bl = bl2;
                    if (this.u != null) break block7;
                    break block8;
                }
                bl = bl2;
                if (this.s != null) break block7;
                bl = bl2;
                if (this.t != null) break block7;
            }
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
        this.invalidateOutline();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setStackedBackground(Drawable drawable2) {
        boolean bl;
        block7 : {
            block8 : {
                boolean bl2;
                block6 : {
                    Drawable drawable3 = this.t;
                    if (drawable3 != null) {
                        drawable3.setCallback(null);
                        this.unscheduleDrawable(this.t);
                    }
                    this.t = drawable2;
                    if (drawable2 != null) {
                        drawable2.setCallback((Drawable.Callback)this);
                        if (this.w && (drawable2 = this.t) != null) {
                            drawable2.setBounds(this.p.getLeft(), this.p.getTop(), this.p.getRight(), this.p.getBottom());
                        }
                    }
                    bl = this.v;
                    bl2 = false;
                    if (!bl) break block6;
                    bl = bl2;
                    if (this.u != null) break block7;
                    break block8;
                }
                bl = bl2;
                if (this.s != null) break block7;
                bl = bl2;
                if (this.t != null) break block7;
            }
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
        this.invalidateOutline();
    }

    public void setTabContainer(c c8) {
        View view = this.p;
        if (view != null) {
            this.removeView(view);
        }
        this.p = c8;
    }

    public void setTransitioning(boolean bl) {
        this.o = bl;
        int n8 = bl ? 393216 : 262144;
        this.setDescendantFocusability(n8);
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        boolean bl = n8 == 0;
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.setVisible(bl, false);
        }
        if ((drawable2 = this.t) != null) {
            drawable2.setVisible(bl, false);
        }
        if ((drawable2 = this.u) != null) {
            drawable2.setVisible(bl, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int n8) {
        if (n8 != 0) {
            return super.startActionModeForChild(view, callback, n8);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable2) {
        if (drawable2 == this.s && !this.v || drawable2 == this.t && this.w || drawable2 == this.u && this.v || super.verifyDrawable(drawable2)) {
            return true;
        }
        return false;
    }
}

