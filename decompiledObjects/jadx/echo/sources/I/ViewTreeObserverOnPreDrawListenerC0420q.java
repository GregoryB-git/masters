package I;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: I.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0420q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public final View f2431o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f2432p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f2433q;

    public ViewTreeObserverOnPreDrawListenerC0420q(View view, Runnable runnable) {
        this.f2431o = view;
        this.f2432p = view.getViewTreeObserver();
        this.f2433q = runnable;
    }

    public static ViewTreeObserverOnPreDrawListenerC0420q a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0420q viewTreeObserverOnPreDrawListenerC0420q = new ViewTreeObserverOnPreDrawListenerC0420q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0420q);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0420q);
        return viewTreeObserverOnPreDrawListenerC0420q;
    }

    public void b() {
        (this.f2432p.isAlive() ? this.f2432p : this.f2431o.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2431o.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2433q.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2432p = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
