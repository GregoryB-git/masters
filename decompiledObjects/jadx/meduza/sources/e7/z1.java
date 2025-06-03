package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4793a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f4794b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4795c;

    public /* synthetic */ z1(String str, int i10, Object obj) {
        this.f4793a = i10;
        this.f4795c = obj;
        this.f4794b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4793a) {
            case 0:
                w1 w1Var = (w1) this.f4795c;
                String str = this.f4794b;
                k1 l02 = w1Var.n().l0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                hashMap.put("gmp_version", 114010L);
                if (l02 != null) {
                    String h10 = l02.h();
                    if (h10 != null) {
                        hashMap.put("app_version", h10);
                    }
                    hashMap.put("app_version_int", Long.valueOf(l02.w()));
                    l02.f4393a.zzl().l();
                    hashMap.put("dynamite_version", Long.valueOf(l02.f4410s));
                }
                return hashMap;
            default:
                ((zzig) this.f4795c).f2908a.c0();
                o oVar = ((zzig) this.f4795c).f2908a.f4332c;
                i6.q(oVar);
                return oVar.v0(this.f4794b);
        }
    }
}
