/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.atomic.AtomicReference
 */
package M4;

import M4.d;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class e
implements ViewTreeObserver.OnDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final Runnable c;

    public e(View view, Runnable runnable) {
        this.b = new AtomicReference((Object)view);
        this.c = runnable;
    }

    public static /* synthetic */ void a(e e8, View view) {
        e8.d(view);
    }

    public static boolean b(View view) {
        if (view.getViewTreeObserver().isAlive() && e.c(view)) {
            return true;
        }
        return false;
    }

    public static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    public static void e(View view, Runnable object) {
        object = new e(view, (Runnable)object);
        if (Build.VERSION.SDK_INT < 26 && !e.b(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(){

                public void onViewAttachedToWindow(View view) {
                    view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)e.this);
                    view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
                }

                public void onViewDetachedFromWindow(View view) {
                    view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
                }
            });
            return;
        }
        view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)object);
    }

    public final /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
    }

    public void onDraw() {
        View view = (View)this.b.getAndSet((Object)null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new d(this, view));
        this.a.postAtFrontOfQueue(this.c);
    }

}

