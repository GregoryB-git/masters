/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package D3;

import E3.f;
import F3.b;
import android.os.Bundle;
import java.util.Locale;
import w3.a;

public class e
implements a.b {
    public b a;
    public b b;

    public static void b(b b8, String string2, Bundle bundle) {
        if (b8 == null) {
            return;
        }
        b8.t(string2, bundle);
    }

    @Override
    public void a(int n8, Bundle bundle) {
        f.f().i(String.format((Locale)Locale.US, (String)"Analytics listener received message. ID: %d, Extras: %s", (Object[])new Object[]{n8, bundle}));
        if (bundle == null) {
            return;
        }
        String string2 = bundle.getString("name");
        if (string2 != null) {
            Bundle bundle2;
            bundle = bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            this.c(string2, bundle);
        }
    }

    public final void c(String string2, Bundle bundle) {
        b b8 = "clx".equals((Object)bundle.getString("_o")) ? this.a : this.b;
        e.b(b8, string2, bundle);
    }

    public void d(b b8) {
        this.b = b8;
    }

    public void e(b b8) {
        this.a = b8;
    }
}

