package e7;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzig;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class b3 implements Callable<List<w5>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6 f4102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f4103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzig f4104c;

    public b3(zzig zzigVar, k6 k6Var, Bundle bundle) {
        this.f4102a = k6Var;
        this.f4103b = bundle;
        this.f4104c = zzigVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<w5> call() {
        this.f4104c.f2908a.c0();
        return this.f4104c.f2908a.j(this.f4103b, this.f4102a);
    }
}
