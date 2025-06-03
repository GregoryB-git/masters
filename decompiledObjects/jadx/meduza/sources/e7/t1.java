package e7;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4668a;

    public t1(i6 i6Var) {
        this.f4668a = i6Var.t;
    }

    public final boolean a() {
        try {
            x6.c a10 = x6.d.a(this.f4668a.f4360a);
            if (a10 != null) {
                return a10.b(128, "com.android.vending").versionCode >= 80837300;
            }
            this.f4668a.zzj().f4067w.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f4668a.zzj().f4067w.c("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
