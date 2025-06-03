package R2;

import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: R2.n4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0565n4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1071y0 f5432o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I f5433p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5434q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f5435r;

    public RunnableC0565n4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1071y0 interfaceC1071y0, I i7, String str) {
        this.f5435r = appMeasurementDynamiteService;
        this.f5432o = interfaceC1071y0;
        this.f5433p = i7;
        this.f5434q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5435r.f11248b.J().M(this.f5432o, this.f5433p, this.f5434q);
    }
}
