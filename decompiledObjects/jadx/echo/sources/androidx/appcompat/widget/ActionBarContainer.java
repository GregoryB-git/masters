package androidx.appcompat.widget;

import I.AbstractC0421s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import e.AbstractC1234e;
import e.AbstractC1238i;
import l.C1503b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public boolean f8537o;

    /* renamed from: p, reason: collision with root package name */
    public View f8538p;

    /* renamed from: q, reason: collision with root package name */
    public View f8539q;

    /* renamed from: r, reason: collision with root package name */
    public View f8540r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f8541s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f8542t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f8543u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8544v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8545w;

    /* renamed from: x, reason: collision with root package name */
    public int f8546x;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0421s.E(this, new C1503b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13565a);
        this.f8541s = obtainStyledAttributes.getDrawable(AbstractC1238i.f13569b);
        this.f8542t = obtainStyledAttributes.getDrawable(AbstractC1238i.f13577d);
        this.f8546x = obtainStyledAttributes.getDimensionPixelSize(AbstractC1238i.f13597i, -1);
        boolean z7 = true;
        if (getId() == AbstractC1234e.f13436x) {
            this.f8544v = true;
            this.f8543u = obtainStyledAttributes.getDrawable(AbstractC1238i.f13573c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f8544v ? this.f8541s != null || this.f8542t != null : this.f8543u != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8541s;
        if (drawable != null && drawable.isStateful()) {
            this.f8541s.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8542t;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8542t.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8543u;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f8543u.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f8538p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8541s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8542t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8543u;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f8539q = findViewById(AbstractC1234e.f13413a);
        this.f8540r = findViewById(AbstractC1234e.f13418f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8537o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z7, i7, i8, i9, i10);
        View view2 = this.f8538p;
        boolean z8 = true;
        boolean z9 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            view2.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f8544v) {
            Drawable drawable3 = this.f8543u;
            if (drawable3 == null) {
                return;
            } else {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f8541s != null) {
                if (this.f8539q.getVisibility() == 0) {
                    drawable2 = this.f8541s;
                    left = this.f8539q.getLeft();
                    top = this.f8539q.getTop();
                    right = this.f8539q.getRight();
                    view = this.f8539q;
                } else {
                    View view3 = this.f8540r;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f8541s.setBounds(0, 0, 0, 0);
                    } else {
                        drawable2 = this.f8541s;
                        left = this.f8540r.getLeft();
                        top = this.f8540r.getTop();
                        right = this.f8540r.getRight();
                        view = this.f8540r;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
            } else {
                z8 = false;
            }
            this.f8545w = z9;
            if (z9 && (drawable = this.f8542t) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            } else if (!z8) {
                return;
            }
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f8539q
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f8546x
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f8539q
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f8538p
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f8539q
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f8539q
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f8540r
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f8540r
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f8538p
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8541s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8541s);
        }
        this.f8541s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8539q;
            if (view != null) {
                this.f8541s.setBounds(view.getLeft(), this.f8539q.getTop(), this.f8539q.getRight(), this.f8539q.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f8544v ? !(this.f8541s != null || this.f8542t != null) : this.f8543u == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8543u;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8543u);
        }
        this.f8543u = drawable;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8544v && (drawable2 = this.f8543u) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f8544v ? !(this.f8541s != null || this.f8542t != null) : this.f8543u == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8542t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8542t);
        }
        this.f8542t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8545w && (drawable2 = this.f8542t) != null) {
                drawable2.setBounds(this.f8538p.getLeft(), this.f8538p.getTop(), this.f8538p.getRight(), this.f8538p.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f8544v ? !(this.f8541s != null || this.f8542t != null) : this.f8543u == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        View view = this.f8538p;
        if (view != null) {
            removeView(view);
        }
        this.f8538p = cVar;
    }

    public void setTransitioning(boolean z7) {
        this.f8537o = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f8541s;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f8542t;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f8543u;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f8541s && !this.f8544v) || (drawable == this.f8542t && this.f8545w) || ((drawable == this.f8543u && this.f8544v) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
