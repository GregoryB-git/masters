package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class t2 implements Callable<List<s6>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzig f4672d;

    public t2(zzig zzigVar, String str, String str2, String str3) {
        this.f4669a = str;
        this.f4670b = str2;
        this.f4671c = str3;
        this.f4672d = zzigVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<s6> call() {
        this.f4672d.f2908a.c0();
        o oVar = this.f4672d.f2908a.f4332c;
        i6.q(oVar);
        return oVar.d0(this.f4669a, this.f4670b, this.f4671c);
    }
}
