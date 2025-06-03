package R2;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC0874c0;

/* renamed from: R2.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611u2 {

    /* renamed from: a, reason: collision with root package name */
    public final N2 f5547a;

    public C0611u2(D5 d52) {
        this.f5547a = d52.i0();
    }

    public final Bundle a(String str, InterfaceC0874c0 interfaceC0874c0) {
        this.f5547a.e().n();
        if (interfaceC0874c0 == null) {
            this.f5547a.j().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle l7 = interfaceC0874c0.l(bundle);
            if (l7 != null) {
                return l7;
            }
            this.f5547a.j().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e7) {
            this.f5547a.j().G().b("Exception occurred while retrieving the Install Referrer", e7.getMessage());
            return null;
        }
    }

    public final boolean b() {
        try {
            G2.c a7 = G2.d.a(this.f5547a.a());
            if (a7 != null) {
                return a7.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f5547a.j().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e7) {
            this.f5547a.j().K().b("Failed to retrieve Play Store version for Install Referrer", e7);
            return false;
        }
    }
}
