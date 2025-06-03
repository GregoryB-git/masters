/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.widget.FrameLayout
 *  java.lang.ClassLoader
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 */
package androidx.fragment.app;

import U.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import java.util.ArrayList;

public final class h
extends FrameLayout {
    public ArrayList o;
    public ArrayList p;
    public boolean q = true;

    public h(Context object, AttributeSet attributeSet, n n8) {
        super((Context)object, attributeSet);
        String string2 = attributeSet.getClassAttribute();
        Object object2 = object.obtainStyledAttributes(attributeSet, c.h);
        Object object3 = string2;
        if (string2 == null) {
            object3 = object2.getString(c.i);
        }
        string2 = object2.getString(c.j);
        object2.recycle();
        int n9 = this.getId();
        object2 = n8.g0(n9);
        if (object3 != null && object2 == null) {
            if (n9 <= 0) {
                if (string2 != null) {
                    object = new StringBuilder();
                    object.append(" with tag ");
                    object.append(string2);
                    object = object.toString();
                } else {
                    object = "";
                }
                attributeSet = new StringBuilder();
                attributeSet.append("FragmentContainerView must have an android:id to add Fragment ");
                attributeSet.append((String)object3);
                attributeSet.append((String)object);
                throw new IllegalStateException(attributeSet.toString());
            }
            object3 = n8.p0().a(object.getClassLoader(), (String)object3);
            object3.y0((Context)object, attributeSet, null);
            n8.m().l(true).c((ViewGroup)this, (Fragment)object3, string2).h();
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.p;
        if (arrayList != null && arrayList.contains((Object)view)) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add((Object)view);
        }
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, n8, layoutParams);
            return;
        }
        layoutParams = new StringBuilder();
        layoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        layoutParams.append((Object)view);
        layoutParams.append(" is not associated with a Fragment.");
        throw new IllegalStateException(layoutParams.toString());
    }

    public boolean addViewInLayout(View view, int n8, ViewGroup.LayoutParams layoutParams, boolean bl) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, n8, layoutParams, bl);
        }
        layoutParams = new StringBuilder();
        layoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        layoutParams.append((Object)view);
        layoutParams.append(" is not associated with a Fragment.");
        throw new IllegalStateException(layoutParams.toString());
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.q && this.o != null) {
            for (int i8 = 0; i8 < this.o.size(); ++i8) {
                super.drawChild(canvas, (View)this.o.get(i8), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long l8) {
        ArrayList arrayList;
        if (this.q && (arrayList = this.o) != null && arrayList.size() > 0 && this.o.contains((Object)view)) {
            return false;
        }
        return super.drawChild(canvas, view, l8);
    }

    public void endViewTransition(View view) {
        ArrayList arrayList = this.p;
        if (arrayList != null) {
            arrayList.remove((Object)view);
            arrayList = this.o;
            if (arrayList != null && arrayList.remove((Object)view)) {
                this.q = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            this.getChildAt(i8).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int i8 = this.getChildCount() - 1; i8 >= 0; --i8) {
            this.a(this.getChildAt(i8));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean bl) {
        if (bl) {
            this.a(view);
        }
        super.removeDetachedView(view, bl);
    }

    public void removeView(View view) {
        this.a(view);
        super.removeView(view);
    }

    public void removeViewAt(int n8) {
        this.a(this.getChildAt(n8));
        super.removeViewAt(n8);
    }

    public void removeViewInLayout(View view) {
        this.a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int n8, int n9) {
        for (int i8 = n8; i8 < n8 + n9; ++i8) {
            this.a(this.getChildAt(i8));
        }
        super.removeViews(n8, n9);
    }

    public void removeViewsInLayout(int n8, int n9) {
        for (int i8 = n8; i8 < n8 + n9; ++i8) {
            this.a(this.getChildAt(i8));
        }
        super.removeViewsInLayout(n8, n9);
    }

    public void setDrawDisappearingViewsLast(boolean bl) {
        this.q = bl;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add((Object)view);
        }
        super.startViewTransition(view);
    }
}

