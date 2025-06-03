// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class q implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
{
    public final View o;
    public ViewTreeObserver p;
    public final Runnable q;
    
    public q(final View o, final Runnable q) {
        this.o = o;
        this.p = o.getViewTreeObserver();
        this.q = q;
    }
    
    public static q a(final View view, final Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable != null) {
            final q q = new q(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)q);
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)q);
            return q;
        }
        throw new NullPointerException("runnable == null");
    }
    
    public void b() {
        ViewTreeObserver viewTreeObserver;
        if (this.p.isAlive()) {
            viewTreeObserver = this.p;
        }
        else {
            viewTreeObserver = this.o.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.o.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public boolean onPreDraw() {
        this.b();
        this.q.run();
        return true;
    }
    
    public void onViewAttachedToWindow(final View view) {
        this.p = view.getViewTreeObserver();
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.b();
    }
}
