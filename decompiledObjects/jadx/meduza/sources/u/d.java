package u;

import android.app.Application;
import u.f;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f14790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f14791b;

    public d(Application application, f.a aVar) {
        this.f14790a = application;
        this.f14791b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14790a.unregisterActivityLifecycleCallbacks(this.f14791b);
    }
}
