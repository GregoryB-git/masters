package e0;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f3813a;

    public o0(View view) {
        this.f3813a = new WeakReference<>(view);
    }

    public final void a(float f) {
        View view = this.f3813a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.f3813a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f3813a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(p0 p0Var) {
        View view = this.f3813a.get();
        if (view != null) {
            if (p0Var != null) {
                view.animate().setListener(new n0(p0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = this.f3813a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
