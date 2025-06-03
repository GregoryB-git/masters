// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D3;

import android.os.BaseBundle;
import java.util.Locale;
import E3.f;
import android.os.Bundle;
import F3.b;
import w3.a;

public class e implements b
{
    public F3.b a;
    public F3.b b;
    
    public static void b(final F3.b b, final String s, final Bundle bundle) {
        if (b == null) {
            return;
        }
        b.t(s, bundle);
    }
    
    @Override
    public void a(final int i, Bundle bundle) {
        f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", i, bundle));
        if (bundle == null) {
            return;
        }
        final String string = ((BaseBundle)bundle).getString("name");
        if (string != null) {
            if ((bundle = bundle.getBundle("params")) == null) {
                bundle = new Bundle();
            }
            this.c(string, bundle);
        }
    }
    
    public final void c(final String s, final Bundle bundle) {
        F3.b b;
        if ("clx".equals(((BaseBundle)bundle).getString("_o"))) {
            b = this.a;
        }
        else {
            b = this.b;
        }
        b(b, s, bundle);
    }
    
    public void d(final F3.b b) {
        this.b = b;
    }
    
    public void e(final F3.b a) {
        this.a = a;
    }
}
