// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import android.os.Build$VERSION;
import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.view.ViewTreeObserver$OnDrawListener;

public class e implements ViewTreeObserver$OnDrawListener
{
    public final Handler a;
    public final AtomicReference b;
    public final Runnable c;
    
    public e(final View initialValue, final Runnable c) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new AtomicReference((V)initialValue);
        this.c = c;
    }
    
    public static boolean b(final View view) {
        return view.getViewTreeObserver().isAlive() && c(view);
    }
    
    public static boolean c(final View view) {
        return view.isAttachedToWindow();
    }
    
    public static void e(final View view, final Runnable runnable) {
        final e e = new e(view, runnable);
        if (Build$VERSION.SDK_INT < 26 && !b(view)) {
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(final View view) {
                    view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)e);
                    view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                }
                
                public void onViewDetachedFromWindow(final View view) {
                    view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                }
            });
            return;
        }
        view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)e);
    }
    
    public void onDraw() {
        final View view = this.b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new d(this, view));
        this.a.postAtFrontOfQueue(this.c);
    }
}
