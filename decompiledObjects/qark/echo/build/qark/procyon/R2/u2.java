// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import G2.c;
import G2.d;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.c0;

public final class u2
{
    public final N2 a;
    
    public u2(final D5 d5) {
        this.a = d5.i0();
    }
    
    public final Bundle a(final String s, final c0 c0) {
        this.a.e().n();
        if (c0 == null) {
            this.a.j().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("package_name", s);
        Label_0081: {
            Bundle l;
            try {
                l = c0.l(bundle);
                if (l == null) {
                    this.a.j().G().a("Install Referrer Service returned a null response");
                    return null;
                }
            }
            catch (Exception ex) {
                break Label_0081;
            }
            return l;
        }
        final Exception ex;
        this.a.j().G().b("Exception occurred while retrieving the Install Referrer", ex.getMessage());
        return null;
    }
    
    public final boolean b() {
        boolean b = false;
        while (true) {
            try {
                final c a = d.a(this.a.a());
                if (a == null) {
                    this.a.j().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                    return false;
                }
                if (a.e("com.android.vending", 128).versionCode >= 80837300) {
                    b = true;
                }
                return b;
                final Exception ex;
                this.a.j().K().b("Failed to retrieve Play Store version for Install Referrer", ex);
                return false;
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
}
