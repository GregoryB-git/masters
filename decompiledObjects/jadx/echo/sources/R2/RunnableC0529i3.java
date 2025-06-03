package R2;

import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: R2.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0529i3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f5335o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f5336p;

    public RunnableC0529i3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1071y0 interfaceC1071y0) {
        this.f5336p = appMeasurementDynamiteService;
        this.f5335o = interfaceC1071y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5336p.f11248b.J().L(this.f5335o);
    }
}
