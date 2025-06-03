/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  java.lang.Math
 *  java.lang.Object
 */
package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import e.i;

public abstract class a
extends ViewGroup {
    public final a o;
    public final Context p;
    public ActionMenuView q;
    public androidx.appcompat.widget.a r;
    public int s;
    public boolean t;
    public boolean u;

    public a(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        this.o = new a();
        attributeSet = new TypedValue();
        if (context.getTheme().resolveAttribute(e.a.a, (TypedValue)attributeSet, true) && attributeSet.resourceId != 0) {
            this.p = new ContextThemeWrapper(context, attributeSet.resourceId);
            return;
        }
        this.p = context;
    }

    public static int b(int n8, int n9, boolean bl) {
        if (bl) {
            return n8 - n9;
        }
        return n8 + n9;
    }

    public int a(View view, int n8, int n9, int n10) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)n8, (int)Integer.MIN_VALUE), n9);
        return Math.max((int)0, (int)(n8 - view.getMeasuredWidth() - n10));
    }

    public int c(View view, int n8, int n9, int n10, boolean bl) {
        int n11 = view.getMeasuredWidth();
        int n12 = view.getMeasuredHeight();
        n9 += (n10 - n12) / 2;
        if (bl) {
            view.layout(n8 - n11, n9, n8, n12 + n9);
        } else {
            view.layout(n8, n9, n8 + n11, n12 + n9);
        }
        n8 = n11;
        if (bl) {
            n8 = - n11;
        }
        return n8;
    }

    public int getAnimatedVisibility() {
        return this.getVisibility();
    }

    public int getContentHeight() {
        return this.s;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object object = this.getContext().obtainStyledAttributes(null, i.a, e.a.c, 0);
        this.setContentHeight(object.getLayoutDimension(i.i, 0));
        object.recycle();
        object = this.r;
        if (object != null) {
            object.C(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 9) {
            this.u = false;
        }
        if (!this.u) {
            boolean bl = super.onHoverEvent(motionEvent);
            if (n8 == 9 && !bl) {
                this.u = true;
            }
        }
        if (n8 == 10 || n8 == 3) {
            this.u = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 0) {
            this.t = false;
        }
        if (!this.t) {
            boolean bl = super.onTouchEvent(motionEvent);
            if (n8 == 0 && !bl) {
                this.t = true;
            }
        }
        if (n8 == 1 || n8 == 3) {
            this.t = false;
        }
        return true;
    }

    public abstract void setContentHeight(int var1);

    public void setVisibility(int n8) {
        if (n8 != this.getVisibility()) {
            super.setVisibility(n8);
        }
    }

    public class a {
        public boolean a;

        public a() {
            this.a = false;
        }
    }

}

