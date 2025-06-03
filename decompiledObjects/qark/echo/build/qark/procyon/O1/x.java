// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import x1.B;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import android.os.Bundle;
import kotlin.jvm.internal.g;

public final class x extends e
{
    public static final a c;
    
    static {
        c = new a(null);
    }
    
    public x(final String s, final Bundle bundle) {
        Intrinsics.checkNotNullParameter(s, "action");
        super(s, bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.b(x.c.a(s, bundle2));
    }
    
    public static final class a
    {
        public final Uri a(final String str, final Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "action");
            if (Intrinsics.a(str, "oauth")) {
                final P a = P.a;
                return P.g(H.k(), "oauth/authorize", bundle);
            }
            final P a2 = P.a;
            final String k = H.k();
            final StringBuilder sb = new StringBuilder();
            sb.append(B.w());
            sb.append("/dialog/");
            sb.append(str);
            return P.g(k, sb.toString(), bundle);
        }
    }
}
