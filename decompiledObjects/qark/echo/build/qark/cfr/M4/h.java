/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.atomic.AtomicReference
 */
package M4;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class h
implements ViewTreeObserver.OnPreDrawListener {
    public final Handler o = new Handler(Looper.getMainLooper());
    public final AtomicReference p;
    public final Runnable q;
    public final Runnable r;

    public h(View view, Runnable runnable, Runnable runnable2) {
        this.p = new AtomicReference((Object)view);
        this.q = runnable;
        this.r = runnable2;
    }

    public static void a(View view, Runnable object, Runnable runnable) {
        object = new h(view, (Runnable)object, runnable);
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
    }

    public boolean onPreDraw() {
        View view = (View)this.p.getAndSet((Object)null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        this.o.post(this.q);
        this.o.postAtFrontOfQueue(this.r);
        return true;
    }
}

