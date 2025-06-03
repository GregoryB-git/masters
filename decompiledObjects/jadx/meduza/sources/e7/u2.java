package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class u2 implements Callable<List<s6>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzig f4690d;

    public u2(zzig zzigVar, String str, String str2, String str3) {
        this.f4687a = str;
        this.f4688b = str2;
        this.f4689c = str3;
        this.f4690d = zzigVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<s6> call() {
        this.f4690d.f2908a.c0();
        o oVar = this.f4690d.f2908a.f4332c;
        i6.q(oVar);
        return oVar.d0(this.f4687a, this.f4688b, this.f4689c);
    }
}
