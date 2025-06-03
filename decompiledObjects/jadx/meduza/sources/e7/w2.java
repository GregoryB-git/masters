package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class w2 implements Callable<List<f>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzig f4732d;

    public w2(zzig zzigVar, String str, String str2, String str3) {
        this.f4729a = str;
        this.f4730b = str2;
        this.f4731c = str3;
        this.f4732d = zzigVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<f> call() {
        this.f4732d.f2908a.c0();
        o oVar = this.f4732d.f2908a.f4332c;
        i6.q(oVar);
        return oVar.D(this.f4729a, this.f4730b, this.f4731c);
    }
}
