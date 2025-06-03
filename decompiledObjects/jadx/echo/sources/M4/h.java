package M4;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o, reason: collision with root package name */
    public final Handler f3544o = new Handler(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f3545p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f3546q;

    /* renamed from: r, reason: collision with root package name */
    public final Runnable f3547r;

    public h(View view, Runnable runnable, Runnable runnable2) {
        this.f3545p = new AtomicReference(view);
        this.f3546q = runnable;
        this.f3547r = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f3545p.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f3544o.post(this.f3546q);
        this.f3544o.postAtFrontOfQueue(this.f3547r);
        return true;
    }
}
