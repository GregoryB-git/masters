// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.view.WindowInsets;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.os.Bundle;
import U.c;
import android.util.AttributeSet;
import android.content.Context;
import java.util.ArrayList;
import android.widget.FrameLayout;

public final class h extends FrameLayout
{
    public ArrayList o;
    public ArrayList p;
    public boolean q;
    
    public h(final Context context, final AttributeSet set, final n n) {
        super(context, set);
        this.q = true;
        final String classAttribute = set.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.h);
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(c.i);
        }
        final String string2 = obtainStyledAttributes.getString(c.j);
        obtainStyledAttributes.recycle();
        final int id = ((View)this).getId();
        final Fragment g0 = n.g0(id);
        if (string != null && g0 == null) {
            if (id <= 0) {
                String string3;
                if (string2 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string2);
                    string3 = sb.toString();
                }
                else {
                    string3 = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(string);
                sb2.append(string3);
                throw new IllegalStateException(sb2.toString());
            }
            final Fragment a = n.p0().a(context.getClassLoader(), string);
            a.y0(context, set, null);
            n.m().l(true).c((ViewGroup)this, a, string2).h();
        }
    }
    
    public final void a(final View view) {
        final ArrayList p = this.p;
        if (p != null && p.contains(view)) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(view);
        }
    }
    
    public void addView(final View obj, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (n.y0(obj) != null) {
            super.addView(obj, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(obj);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    public boolean addViewInLayout(final View obj, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (n.y0(obj) != null) {
            return super.addViewInLayout(obj, n, viewGroup$LayoutParams, b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(obj);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void dispatchDraw(final Canvas canvas) {
        if (this.q && this.o != null) {
            for (int i = 0; i < this.o.size(); ++i) {
                super.drawChild(canvas, (View)this.o.get(i), ((View)this).getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public boolean drawChild(final Canvas canvas, final View o, final long n) {
        if (this.q) {
            final ArrayList o2 = this.o;
            if (o2 != null && o2.size() > 0 && this.o.contains(o)) {
                return false;
            }
        }
        return super.drawChild(canvas, o, n);
    }
    
    public void endViewTransition(final View view) {
        final ArrayList p = this.p;
        if (p != null) {
            p.remove(view);
            final ArrayList o = this.o;
            if (o != null && o.remove(view)) {
                this.q = true;
            }
        }
        super.endViewTransition(view);
    }
    
    public WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
            ((ViewGroup)this).getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }
    
    public void removeAllViewsInLayout() {
        for (int i = ((ViewGroup)this).getChildCount() - 1; i >= 0; --i) {
            this.a(((ViewGroup)this).getChildAt(i));
        }
        super.removeAllViewsInLayout();
    }
    
    public void removeDetachedView(final View view, final boolean b) {
        if (b) {
            this.a(view);
        }
        super.removeDetachedView(view, b);
    }
    
    public void removeView(final View view) {
        this.a(view);
        super.removeView(view);
    }
    
    public void removeViewAt(final int n) {
        this.a(((ViewGroup)this).getChildAt(n));
        super.removeViewAt(n);
    }
    
    public void removeViewInLayout(final View view) {
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            this.a(((ViewGroup)this).getChildAt(i));
        }
        super.removeViews(n, n2);
    }
    
    public void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            this.a(((ViewGroup)this).getChildAt(i));
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public void setDrawDisappearingViewsLast(final boolean q) {
        this.q = q;
    }
    
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public void startViewTransition(final View e) {
        if (e.getParent() == this) {
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(e);
        }
        super.startViewTransition(e);
    }
}
