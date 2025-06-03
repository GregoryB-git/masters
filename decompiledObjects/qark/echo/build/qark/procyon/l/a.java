// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.view.MotionEvent;
import android.content.res.TypedArray;
import e.i;
import android.content.res.Configuration;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.util.AttributeSet;
import androidx.appcompat.widget.ActionMenuView;
import android.content.Context;
import android.view.ViewGroup;

public abstract class a extends ViewGroup
{
    public final a o;
    public final Context p;
    public ActionMenuView q;
    public a r;
    public int s;
    public boolean t;
    public boolean u;
    
    public a(final Context p3, final AttributeSet set, final int n) {
        super(p3, set, n);
        this.o = new a();
        final TypedValue typedValue = new TypedValue();
        if (p3.getTheme().resolveAttribute(e.a.a, typedValue, true) && typedValue.resourceId != 0) {
            this.p = (Context)new ContextThemeWrapper(p3, typedValue.resourceId);
            return;
        }
        this.p = p3;
    }
    
    public static int b(final int n, final int n2, final boolean b) {
        if (b) {
            return n - n2;
        }
        return n + n2;
    }
    
    public int a(final View view, final int n, final int n2, final int n3) {
        view.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), n2);
        return Math.max(0, n - view.getMeasuredWidth() - n3);
    }
    
    public int c(final View view, int n, int n2, final int n3, final boolean b) {
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        n2 += (n3 - measuredHeight) / 2;
        if (b) {
            view.layout(n - measuredWidth, n2, n, measuredHeight + n2);
        }
        else {
            view.layout(n, n2, n + measuredWidth, measuredHeight + n2);
        }
        n = measuredWidth;
        if (b) {
            n = -measuredWidth;
        }
        return n;
    }
    
    public int getAnimatedVisibility() {
        return ((View)this).getVisibility();
    }
    
    public int getContentHeight() {
        return this.s;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes((AttributeSet)null, i.a, e.a.c, 0);
        this.setContentHeight(obtainStyledAttributes.getLayoutDimension(i.i, 0));
        obtainStyledAttributes.recycle();
        final a r = this.r;
        if (r != null) {
            r.C(configuration);
        }
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.u = false;
        }
        if (!this.u) {
            final boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.u = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.u = false;
        }
        return true;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t = false;
        }
        if (!this.t) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.t = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.t = false;
        }
        return true;
    }
    
    public abstract void setContentHeight(final int p0);
    
    public void setVisibility(final int visibility) {
        if (visibility != ((View)this).getVisibility()) {
            super.setVisibility(visibility);
        }
    }
    
    public class a
    {
        public boolean a;
        
        public a() {
            this.a = false;
        }
    }
}
