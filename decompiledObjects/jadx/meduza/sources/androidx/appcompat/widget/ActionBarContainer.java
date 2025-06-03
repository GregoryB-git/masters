package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.a0;
import e0.d0;
import e0.o0;
import io.meduza.meduza.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f745a;

    /* renamed from: b, reason: collision with root package name */
    public c f746b;

    /* renamed from: c, reason: collision with root package name */
    public View f747c;

    /* renamed from: d, reason: collision with root package name */
    public View f748d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f749e;
    public Drawable f;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f750o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f751p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f752q;

    /* renamed from: r, reason: collision with root package name */
    public int f753r;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.b bVar = new l.b(this);
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f);
        boolean z10 = false;
        this.f749e = obtainStyledAttributes.getDrawable(0);
        this.f = obtainStyledAttributes.getDrawable(2);
        this.f753r = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f751p = true;
            this.f750o = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f751p ? !(this.f749e != null || this.f != null) : this.f750o == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f749e;
        if (drawable != null && drawable.isStateful()) {
            this.f749e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f750o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f750o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f746b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f749e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f750o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f747c = findViewById(R.id.action_bar);
        this.f748d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f745a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        c cVar = this.f746b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (cVar == null || cVar.getVisibility() == 8) ? false : true;
        if (cVar != null && cVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cVar.getLayoutParams();
            int measuredHeight2 = measuredHeight - cVar.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            cVar.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f751p) {
            Drawable drawable3 = this.f750o;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f749e != null) {
                if (this.f747c.getVisibility() == 0) {
                    drawable2 = this.f749e;
                    left = this.f747c.getLeft();
                    top = this.f747c.getTop();
                    right = this.f747c.getRight();
                    view = this.f747c;
                } else {
                    View view2 = this.f748d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f749e.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f749e;
                        left = this.f748d.getLeft();
                        top = this.f748d.getTop();
                        right = this.f748d.getRight();
                        view = this.f748d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f752q = z13;
            if (z13 && (drawable = this.f) != null) {
                drawable.setBounds(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f747c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L1c
            int r0 = r6.f753r
            if (r0 < 0) goto L1c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f747c
            if (r7 != 0) goto L24
            return
        L24:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.c r0 = r6.f746b
            if (r0 == 0) goto L89
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L89
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L89
            android.view.View r0 = r6.f747c
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L4d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L4b
            goto L4d
        L4b:
            r0 = r4
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 != 0) goto L53
            android.view.View r0 = r6.f747c
            goto L69
        L53:
            android.view.View r0 = r6.f748d
            if (r0 == 0) goto L65
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L65
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r3 = r4
        L65:
            if (r3 != 0) goto L6d
            android.view.View r0 = r6.f748d
        L69:
            int r4 = a(r0)
        L6d:
            if (r7 != r1) goto L74
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L77
        L74:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L77:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.c r0 = r6.f746b
            int r0 = a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f749e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f749e);
        }
        this.f749e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f747c;
            if (view != null) {
                this.f749e.setBounds(view.getLeft(), this.f747c.getTop(), this.f747c.getRight(), this.f747c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f751p ? this.f749e != null || this.f != null : this.f750o != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f750o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f750o);
        }
        this.f750o = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f751p && (drawable2 = this.f750o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f751p ? !(this.f749e != null || this.f != null) : this.f750o == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f752q && (drawable2 = this.f) != null) {
                drawable2.setBounds(this.f746b.getLeft(), this.f746b.getTop(), this.f746b.getRight(), this.f746b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f751p ? this.f749e != null || this.f != null : this.f750o != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        c cVar2 = this.f746b;
        if (cVar2 != null) {
            removeView(cVar2);
        }
        this.f746b = cVar;
        if (cVar != null) {
            addView(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f745a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f749e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f750o;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f749e && !this.f751p) || (drawable == this.f && this.f752q) || ((drawable == this.f750o && this.f751p) || super.verifyDrawable(drawable));
    }
}
