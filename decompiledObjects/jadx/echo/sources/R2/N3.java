package R2;

import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class N3 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f4938o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4939p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f4940q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f4941r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f4942s;

    public N3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1071y0 interfaceC1071y0, String str, String str2, boolean z7) {
        this.f4942s = appMeasurementDynamiteService;
        this.f4938o = interfaceC1071y0;
        this.f4939p = str;
        this.f4940q = str2;
        this.f4941r = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4942s.f11248b.J().O(this.f4938o, this.f4939p, this.f4940q, this.f4941r);
    }
}
