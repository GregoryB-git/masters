package H4;

/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final F4.a f2395b = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final N4.c f2396a;

    public a(N4.c cVar) {
        this.f2396a = cVar;
    }

    @Override // H4.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f2395b.j("ApplicationInfo is invalid");
        return false;
    }

    public final boolean g() {
        F4.a aVar;
        String str;
        N4.c cVar = this.f2396a;
        if (cVar == null) {
            aVar = f2395b;
            str = "ApplicationInfo is null";
        } else if (!cVar.f0()) {
            aVar = f2395b;
            str = "GoogleAppId is null";
        } else if (!this.f2396a.d0()) {
            aVar = f2395b;
            str = "AppInstanceId is null";
        } else if (!this.f2396a.e0()) {
            aVar = f2395b;
            str = "ApplicationProcessState is null";
        } else {
            if (!this.f2396a.c0()) {
                return true;
            }
            if (!this.f2396a.Z().Y()) {
                aVar = f2395b;
                str = "AndroidAppInfo.packageName is null";
            } else {
                if (this.f2396a.Z().Z()) {
                    return true;
                }
                aVar = f2395b;
                str = "AndroidAppInfo.sdkVersion is null";
            }
        }
        aVar.j(str);
        return false;
    }
}
