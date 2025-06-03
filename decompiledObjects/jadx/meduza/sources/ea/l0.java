package ea;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class l0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f4948a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4949b;

    /* renamed from: c, reason: collision with root package name */
    public static h0 f4950c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ec.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ec.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ec.i.e(activity, "activity");
        h0 h0Var = f4950c;
        if (h0Var != null) {
            h0Var.b(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rb.h hVar;
        ec.i.e(activity, "activity");
        h0 h0Var = f4950c;
        if (h0Var != null) {
            h0Var.b(1);
            hVar = rb.h.f13851a;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            f4949b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ec.i.e(activity, "activity");
        ec.i.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ec.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ec.i.e(activity, "activity");
    }
}
