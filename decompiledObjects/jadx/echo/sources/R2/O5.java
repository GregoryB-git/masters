package R2;

import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class O5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f4955o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4956p;

    public O5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1071y0 interfaceC1071y0) {
        this.f4956p = appMeasurementDynamiteService;
        this.f4955o = interfaceC1071y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4956p.f11248b.L().X(this.f4955o, this.f4956p.f11248b.o());
    }
}
