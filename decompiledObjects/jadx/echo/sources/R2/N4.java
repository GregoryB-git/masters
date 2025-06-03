package R2;

import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class N4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f4943o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4944p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f4945q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4946r;

    public N4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1071y0 interfaceC1071y0, String str, String str2) {
        this.f4946r = appMeasurementDynamiteService;
        this.f4943o = interfaceC1071y0;
        this.f4944p = str;
        this.f4945q = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4946r.f11248b.J().N(this.f4943o, this.f4944p, this.f4945q);
    }
}
