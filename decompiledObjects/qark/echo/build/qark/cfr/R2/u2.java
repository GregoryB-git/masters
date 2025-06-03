/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import G2.c;
import G2.d;
import R2.D5;
import R2.G2;
import R2.N2;
import R2.Y1;
import R2.a2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.c0;

public final class u2 {
    public final N2 a;

    public u2(D5 d52) {
        this.a = d52.i0();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Bundle a(String string2, c0 c02) {
        this.a.e().n();
        if (c02 == null) {
            this.a.j().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", string2);
        try {
            string2 = c02.l(bundle);
            if (string2 != null) return string2;
        }
        catch (Exception exception) {}
        this.a.j().G().a("Install Referrer Service returned a null response");
        return null;
        this.a.j().G().b("Exception occurred while retrieving the Install Referrer", exception.getMessage());
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b() {
        boolean bl = false;
        try {
            c c8 = d.a(this.a.a());
            if (c8 == null) {
                this.a.j().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            int n8 = c8.e((String)"com.android.vending", (int)128).versionCode;
            if (n8 < 80837300) return bl;
            return true;
        }
        catch (Exception exception) {}
        this.a.j().K().b("Failed to retrieve Play Store version for Install Referrer", (Object)exception);
        return false;
    }
}

