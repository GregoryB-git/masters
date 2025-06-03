// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.ViewGroup;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.graphics.drawable.Drawable$Callback;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.TypedArray;
import e.e;
import e.i;
import I.s;
import l.b;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout
{
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
    
    public ActionBarContainer(final Context context, final AttributeSet set) {
        super(context, set);
        I.s.E((View)this, new b(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.a);
        this.s = obtainStyledAttributes.getDrawable(i.b);
        this.t = obtainStyledAttributes.getDrawable(i.d);
        this.x = obtainStyledAttributes.getDimensionPixelSize(i.i, -1);
        final int id = ((View)this).getId();
        final int x = e.x;
        boolean willNotDraw = true;
        if (id == x) {
            this.v = true;
            this.u = obtainStyledAttributes.getDrawable(i.c);
        }
        obtainStyledAttributes.recycle();
        Label_0137: {
            if (this.v) {
                if (this.u == null) {
                    break Label_0137;
                }
            }
            else if (this.s == null && this.t == null) {
                break Label_0137;
            }
            willNotDraw = false;
        }
        ((View)this).setWillNotDraw(willNotDraw);
    }
    
    public final int a(final View view) {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
    }
    
    public final boolean b(final View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable s = this.s;
        if (s != null && s.isStateful()) {
            this.s.setState(((View)this).getDrawableState());
        }
        final Drawable t = this.t;
        if (t != null && t.isStateful()) {
            this.t.setState(((View)this).getDrawableState());
        }
        final Drawable u = this.u;
        if (u != null && u.isStateful()) {
            this.u.setState(((View)this).getDrawableState());
        }
    }
    
    public View getTabContainer() {
        return this.p;
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable s = this.s;
        if (s != null) {
            s.jumpToCurrentState();
        }
        final Drawable t = this.t;
        if (t != null) {
            t.jumpToCurrentState();
        }
        final Drawable u = this.u;
        if (u != null) {
            u.jumpToCurrentState();
        }
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.q = ((View)this).findViewById(e.a);
        this.r = ((View)this).findViewById(e.f);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.o || super.onInterceptTouchEvent(motionEvent);
    }
    
    public void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final View p5 = this.p;
        n4 = 1;
        final boolean w = p5 != null && p5.getVisibility() != 8;
        if (p5 != null && p5.getVisibility() != 8) {
            n2 = ((View)this).getMeasuredHeight();
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)p5.getLayoutParams();
            final int measuredHeight = p5.getMeasuredHeight();
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            p5.layout(n, n2 - measuredHeight - bottomMargin, n3, n2 - bottomMargin);
        }
        Label_0345: {
            if (this.v) {
                final Drawable u = this.u;
                if (u == null) {
                    return;
                }
                u.setBounds(0, 0, ((View)this).getMeasuredWidth(), ((View)this).getMeasuredHeight());
            }
            else {
                Label_0293: {
                    if (this.s != null) {
                        Drawable drawable;
                        View view;
                        if (this.q.getVisibility() == 0) {
                            drawable = this.s;
                            n2 = this.q.getLeft();
                            n3 = this.q.getTop();
                            n = this.q.getRight();
                            view = this.q;
                        }
                        else {
                            final View r = this.r;
                            if (r == null || r.getVisibility() != 0) {
                                this.s.setBounds(0, 0, 0, 0);
                                n = n4;
                                break Label_0293;
                            }
                            drawable = this.s;
                            n2 = this.r.getLeft();
                            n3 = this.r.getTop();
                            n = this.r.getRight();
                            view = this.r;
                        }
                        drawable.setBounds(n2, n3, n, view.getBottom());
                        n = n4;
                    }
                    else {
                        n = 0;
                    }
                }
                this.w = w;
                if (w) {
                    final Drawable t = this.t;
                    if (t != null) {
                        t.setBounds(p5.getLeft(), p5.getTop(), p5.getRight(), p5.getBottom());
                        break Label_0345;
                    }
                }
                if (n == 0) {
                    return;
                }
            }
        }
        ((View)this).invalidate();
    }
    
    public void onMeasure(int a, int b) {
        int measureSpec = b;
        if (this.q == null) {
            measureSpec = b;
            if (View$MeasureSpec.getMode(b) == Integer.MIN_VALUE) {
                final int x = this.x;
                measureSpec = b;
                if (x >= 0) {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(x, View$MeasureSpec.getSize(b)), Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(a, measureSpec);
        if (this.q == null) {
            return;
        }
        b = View$MeasureSpec.getMode(measureSpec);
        final View p2 = this.p;
        if (p2 != null && p2.getVisibility() != 8 && b != 1073741824) {
            Label_0143: {
                View view;
                if (!this.b(this.q)) {
                    view = this.q;
                }
                else {
                    if (this.b(this.r)) {
                        a = 0;
                        break Label_0143;
                    }
                    view = this.r;
                }
                a = this.a(view);
            }
            if (b == Integer.MIN_VALUE) {
                b = View$MeasureSpec.getSize(measureSpec);
            }
            else {
                b = Integer.MAX_VALUE;
            }
            ((View)this).setMeasuredDimension(((View)this).getMeasuredWidth(), Math.min(a + this.a(this.p), b));
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public void setPrimaryBackground(final Drawable s) {
        final Drawable s2 = this.s;
        if (s2 != null) {
            s2.setCallback((Drawable$Callback)null);
            ((View)this).unscheduleDrawable(this.s);
        }
        if ((this.s = s) != null) {
            s.setCallback((Drawable$Callback)this);
            final View q = this.q;
            if (q != null) {
                this.s.setBounds(q.getLeft(), this.q.getTop(), this.q.getRight(), this.q.getBottom());
            }
        }
        final boolean v = this.v;
        final boolean b = false;
        boolean willNotDraw = false;
        Label_0126: {
            if (v) {
                willNotDraw = b;
                if (this.u != null) {
                    break Label_0126;
                }
            }
            else {
                willNotDraw = b;
                if (this.s != null) {
                    break Label_0126;
                }
                willNotDraw = b;
                if (this.t != null) {
                    break Label_0126;
                }
            }
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setSplitBackground(Drawable u) {
        final Drawable u2 = this.u;
        if (u2 != null) {
            u2.setCallback((Drawable$Callback)null);
            ((View)this).unscheduleDrawable(this.u);
        }
        this.u = u;
        final boolean b = false;
        if (u != null) {
            u.setCallback((Drawable$Callback)this);
            if (this.v) {
                u = this.u;
                if (u != null) {
                    u.setBounds(0, 0, ((View)this).getMeasuredWidth(), ((View)this).getMeasuredHeight());
                }
            }
        }
        boolean willNotDraw = false;
        Label_0113: {
            if (this.v) {
                willNotDraw = b;
                if (this.u != null) {
                    break Label_0113;
                }
            }
            else {
                willNotDraw = b;
                if (this.s != null) {
                    break Label_0113;
                }
                willNotDraw = b;
                if (this.t != null) {
                    break Label_0113;
                }
            }
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setStackedBackground(Drawable t) {
        final Drawable t2 = this.t;
        if (t2 != null) {
            t2.setCallback((Drawable$Callback)null);
            ((View)this).unscheduleDrawable(this.t);
        }
        if ((this.t = t) != null) {
            t.setCallback((Drawable$Callback)this);
            if (this.w) {
                t = this.t;
                if (t != null) {
                    t.setBounds(this.p.getLeft(), this.p.getTop(), this.p.getRight(), this.p.getBottom());
                }
            }
        }
        final boolean v = this.v;
        final boolean b = false;
        boolean willNotDraw = false;
        Label_0133: {
            if (v) {
                willNotDraw = b;
                if (this.u != null) {
                    break Label_0133;
                }
            }
            else {
                willNotDraw = b;
                if (this.s != null) {
                    break Label_0133;
                }
                willNotDraw = b;
                if (this.t != null) {
                    break Label_0133;
                }
            }
            willNotDraw = true;
        }
        ((View)this).setWillNotDraw(willNotDraw);
        ((View)this).invalidate();
        ((View)this).invalidateOutline();
    }
    
    public void setTabContainer(final c p) {
        final View p2 = this.p;
        if (p2 != null) {
            ((ViewGroup)this).removeView(p2);
        }
        this.p = (View)p;
    }
    
    public void setTransitioning(final boolean o) {
        this.o = o;
        int descendantFocusability;
        if (o) {
            descendantFocusability = 393216;
        }
        else {
            descendantFocusability = 262144;
        }
        ((ViewGroup)this).setDescendantFocusability(descendantFocusability);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable s = this.s;
        if (s != null) {
            s.setVisible(b, false);
        }
        final Drawable t = this.t;
        if (t != null) {
            t.setVisible(b, false);
        }
        final Drawable u = this.u;
        if (u != null) {
            u.setVisible(b, false);
        }
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        if (n != 0) {
            return super.startActionModeForChild(view, actionMode$Callback, n);
        }
        return null;
    }
    
    public boolean verifyDrawable(final Drawable drawable) {
        return (drawable == this.s && !this.v) || (drawable == this.t && this.w) || (drawable == this.u && this.v) || super.verifyDrawable(drawable);
    }
}
