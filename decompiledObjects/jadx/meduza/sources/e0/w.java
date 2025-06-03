package e0;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f3846a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3848c;

    public w(View view, Runnable runnable) {
        this.f3846a = view;
        this.f3847b = view.getViewTreeObserver();
        this.f3848c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        w wVar = new w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(wVar);
        view.addOnAttachStateChangeListener(wVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        (this.f3847b.isAlive() ? this.f3847b : this.f3846a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3846a.removeOnAttachStateChangeListener(this);
        this.f3848c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3847b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        (this.f3847b.isAlive() ? this.f3847b : this.f3846a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3846a.removeOnAttachStateChangeListener(this);
    }
}
