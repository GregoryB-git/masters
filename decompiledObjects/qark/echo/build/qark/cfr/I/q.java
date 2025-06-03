/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package I;

import android.view.View;
import android.view.ViewTreeObserver;

public final class q
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    public final View o;
    public ViewTreeObserver p;
    public final Runnable q;

    public q(View view, Runnable runnable) {
        this.o = view;
        this.p = view.getViewTreeObserver();
        this.q = runnable;
    }

    public static q a(View view, Runnable object) {
        if (view != null) {
            if (object != null) {
                object = new q(view, (Runnable)object);
                view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
                view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
                return object;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b() {
        ViewTreeObserver viewTreeObserver = this.p.isAlive() ? this.p : this.o.getViewTreeObserver();
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        this.o.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public boolean onPreDraw() {
        this.b();
        this.q.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.p = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        this.b();
    }
}

