package R2;

import android.content.ComponentName;

/* renamed from: R2.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0503e5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0475a5 f5281o;

    public RunnableC0503e5(ServiceConnectionC0475a5 serviceConnectionC0475a5) {
        this.f5281o = serviceConnectionC0475a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D4.I(this.f5281o.f5200c, new ComponentName(this.f5281o.f5200c.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
