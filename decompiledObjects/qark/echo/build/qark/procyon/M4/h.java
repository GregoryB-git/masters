// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import android.os.Looper;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class h implements ViewTreeObserver$OnPreDrawListener
{
    public final Handler o;
    public final AtomicReference p;
    public final Runnable q;
    public final Runnable r;
    
    public h(final View initialValue, final Runnable q, final Runnable r) {
        this.o = new Handler(Looper.getMainLooper());
        this.p = new AtomicReference((V)initialValue);
        this.q = q;
        this.r = r;
    }
    
    public static void a(final View view, final Runnable runnable, final Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new h(view, runnable, runnable2));
    }
    
    public boolean onPreDraw() {
        final View view = this.p.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.o.post(this.q);
        this.o.postAtFrontOfQueue(this.r);
        return true;
    }
}
