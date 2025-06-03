package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class v2 implements Callable<List<f>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzig f4712d;

    public v2(zzig zzigVar, String str, String str2, String str3) {
        this.f4709a = str;
        this.f4710b = str2;
        this.f4711c = str3;
        this.f4712d = zzigVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<f> call() {
        this.f4712d.f2908a.c0();
        o oVar = this.f4712d.f2908a.f4332c;
        i6.q(oVar);
        return oVar.D(this.f4709a, this.f4710b, this.f4711c);
    }
}
