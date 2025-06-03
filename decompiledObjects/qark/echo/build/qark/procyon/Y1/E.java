// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import android.os.BaseBundle;
import x1.L;
import x1.a;
import x1.B;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.F;

public final class E
{
    public static final E a;
    
    static {
        a = new E();
    }
    
    public static final F a(final String s, final String s2, final String s3) {
        Intrinsics.checkNotNullParameter(s, "authorizationCode");
        Intrinsics.checkNotNullParameter(s2, "redirectUri");
        Intrinsics.checkNotNullParameter(s3, "codeVerifier");
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("code", s);
        ((BaseBundle)bundle).putString("client_id", B.m());
        ((BaseBundle)bundle).putString("redirect_uri", s2);
        ((BaseBundle)bundle).putString("code_verifier", s3);
        final F x = F.n.x(null, "oauth/access_token", null);
        x.F(L.o);
        x.G(bundle);
        return x;
    }
}
