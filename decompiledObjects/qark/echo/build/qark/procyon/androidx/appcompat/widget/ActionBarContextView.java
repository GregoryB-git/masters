// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.widget;

import android.view.accessibility.AccessibilityRecord;
import android.view.View$MeasureSpec;
import l.d0;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import e.e;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import e.f;
import I.s;
import l.X;
import e.i;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import l.a;

public class ActionBarContextView extends a
{
    public TextView A;
    public TextView B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public CharSequence v;
    public CharSequence w;
    public View x;
    public View y;
    public LinearLayout z;
    
    public ActionBarContextView(@NonNull final Context context, final AttributeSet set) {
        this(context, set, e.a.d);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final X s = X.s(context, set, i.w, n, 0);
        I.s.E((View)this, s.f(i.x));
        this.C = s.l(i.B, 0);
        this.D = s.l(i.A, 0);
        super.s = s.k(i.z, 0);
        this.F = s.l(i.y, f.d);
        s.t();
    }
    
    public final void d() {
        if (this.z == null) {
            LayoutInflater.from(((View)this).getContext()).inflate(f.a, (ViewGroup)this);
            final LinearLayout z = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.z = z;
            this.A = (TextView)((View)z).findViewById(e.e);
            this.B = (TextView)((View)this.z).findViewById(e.d);
            if (this.C != 0) {
                this.A.setTextAppearance(((View)this).getContext(), this.C);
            }
            if (this.D != 0) {
                this.B.setTextAppearance(((View)this).getContext(), this.D);
            }
        }
        this.A.setText(this.v);
        this.B.setText(this.w);
        final boolean empty = TextUtils.isEmpty(this.v);
        final boolean b = TextUtils.isEmpty(this.w) ^ true;
        final TextView b2 = this.B;
        final int n = 8;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)b2).setVisibility(visibility);
        final LinearLayout z2 = this.z;
        int visibility2 = 0;
        Label_0208: {
            if (!(empty ^ true)) {
                visibility2 = n;
                if (!b) {
                    break Label_0208;
                }
            }
            visibility2 = 0;
        }
        ((View)z2).setVisibility(visibility2);
        if (((View)this.z).getParent() == null) {
            this.addView((View)this.z);
        }
    }
    
    public ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(((View)this).getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.w;
    }
    
    public CharSequence getTitle() {
        return this.v;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final a r = super.r;
        if (r != null) {
            r.z();
            super.r.A();
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            ((AccessibilityRecord)accessibilityEvent).setSource((View)this);
            ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)this.getClass().getName());
            accessibilityEvent.setPackageName((CharSequence)((View)this).getContext().getPackageName());
            ((AccessibilityRecord)accessibilityEvent).setContentDescription(this.v);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }
    
    public void onLayout(final boolean b, int paddingLeft, int n, final int n2, int n3) {
        final boolean a = d0.a((View)this);
        int paddingLeft2;
        if (a) {
            paddingLeft2 = n2 - paddingLeft - ((View)this).getPaddingRight();
        }
        else {
            paddingLeft2 = ((View)this).getPaddingLeft();
        }
        final int paddingTop = ((View)this).getPaddingTop();
        final int n4 = n3 - n - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom();
        final View x = this.x;
        n = paddingLeft2;
        if (x != null) {
            n = paddingLeft2;
            if (x.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.x.getLayoutParams();
                if (a) {
                    n = viewGroup$MarginLayoutParams.rightMargin;
                }
                else {
                    n = viewGroup$MarginLayoutParams.leftMargin;
                }
                if (a) {
                    n3 = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n3 = viewGroup$MarginLayoutParams.rightMargin;
                }
                n = l.a.b(paddingLeft2, n, a);
                n = l.a.b(n + this.c(this.x, n, paddingTop, n4, a), n3, a);
            }
        }
        final LinearLayout z = this.z;
        n3 = n;
        if (z != null) {
            n3 = n;
            if (this.y == null) {
                n3 = n;
                if (((View)z).getVisibility() != 8) {
                    n3 = n + this.c((View)this.z, n, paddingTop, n4, a);
                }
            }
        }
        final View y = this.y;
        if (y != null) {
            this.c(y, n3, paddingTop, n4, a);
        }
        if (a) {
            paddingLeft = ((View)this).getPaddingLeft();
        }
        else {
            paddingLeft = n2 - paddingLeft - ((View)this).getPaddingRight();
        }
        final ActionMenuView q = super.q;
        if (q != null) {
            this.c((View)q, paddingLeft, paddingTop, n4, a ^ true);
        }
    }
    
    public void onMeasure(int i, int b) {
        final int mode = View$MeasureSpec.getMode(i);
        final int n = 1073741824;
        if (mode != 1073741824) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View$MeasureSpec.getMode(b) == 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
        final int size = View$MeasureSpec.getSize(i);
        int n2 = super.s;
        if (n2 <= 0) {
            n2 = View$MeasureSpec.getSize(b);
        }
        final int n3 = ((View)this).getPaddingTop() + ((View)this).getPaddingBottom();
        i = size - ((View)this).getPaddingLeft() - ((View)this).getPaddingRight();
        final int b2 = n2 - n3;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(b2, Integer.MIN_VALUE);
        final View x = this.x;
        final int n4 = 0;
        b = i;
        if (x != null) {
            i = this.a(x, i, measureSpec, 0);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.x.getLayoutParams();
            b = i - (viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin);
        }
        final ActionMenuView q = super.q;
        i = b;
        if (q != null) {
            i = b;
            if (((View)q).getParent() == this) {
                i = this.a((View)super.q, b, measureSpec, 0);
            }
        }
        final LinearLayout z = this.z;
        b = i;
        if (z != null) {
            b = i;
            if (this.y == null) {
                if (this.E) {
                    b = View$MeasureSpec.makeMeasureSpec(0, 0);
                    ((View)this.z).measure(b, measureSpec);
                    final int measuredWidth = ((View)this.z).getMeasuredWidth();
                    final boolean b3 = measuredWidth <= i;
                    b = i;
                    if (b3) {
                        b = i - measuredWidth;
                    }
                    final LinearLayout z2 = this.z;
                    if (b3) {
                        i = 0;
                    }
                    else {
                        i = 8;
                    }
                    ((View)z2).setVisibility(i);
                }
                else {
                    b = this.a((View)z, i, measureSpec, 0);
                }
            }
        }
        final View y = this.y;
        if (y != null) {
            final ViewGroup$LayoutParams layoutParams = y.getLayoutParams();
            final int width = layoutParams.width;
            if (width != -2) {
                i = 1073741824;
            }
            else {
                i = Integer.MIN_VALUE;
            }
            int min = b;
            if (width >= 0) {
                min = Math.min(width, b);
            }
            final int height = layoutParams.height;
            if (height != -2) {
                b = n;
            }
            else {
                b = Integer.MIN_VALUE;
            }
            int min2 = b2;
            if (height >= 0) {
                min2 = Math.min(height, b2);
            }
            this.y.measure(View$MeasureSpec.makeMeasureSpec(min, i), View$MeasureSpec.makeMeasureSpec(min2, b));
        }
        if (super.s <= 0) {
            final int childCount = this.getChildCount();
            b = 0;
            int n5;
            int n6;
            for (i = n4; i < childCount; ++i, b = n6) {
                n5 = this.getChildAt(i).getMeasuredHeight() + n3;
                if (n5 > (n6 = b)) {
                    n6 = n5;
                }
            }
            ((View)this).setMeasuredDimension(size, b);
            return;
        }
        ((View)this).setMeasuredDimension(size, n2);
    }
    
    @Override
    public void setContentHeight(final int s) {
        super.s = s;
    }
    
    public void setCustomView(final View y) {
        final View y2 = this.y;
        if (y2 != null) {
            this.removeView(y2);
        }
        if ((this.y = y) != null) {
            final LinearLayout z = this.z;
            if (z != null) {
                this.removeView((View)z);
                this.z = null;
            }
        }
        if (y != null) {
            this.addView(y);
        }
        ((View)this).requestLayout();
    }
    
    public void setSubtitle(final CharSequence w) {
        this.w = w;
        this.d();
    }
    
    public void setTitle(final CharSequence v) {
        this.v = v;
        this.d();
    }
    
    public void setTitleOptional(final boolean e) {
        if (e != this.E) {
            ((View)this).requestLayout();
        }
        this.E = e;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
