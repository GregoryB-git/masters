/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package Y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.F;
import x1.L;
import x1.a;

public final class E {
    public static final E a = new E();

    public static final F a(String object, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "authorizationCode");
        Intrinsics.checkNotNullParameter(string2, "redirectUri");
        Intrinsics.checkNotNullParameter(string3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", (String)object);
        bundle.putString("client_id", B.m());
        bundle.putString("redirect_uri", string2);
        bundle.putString("code_verifier", string3);
        object = F.n.x(null, "oauth/access_token", null);
        object.F(L.o);
        object.G(bundle);
        return object;
    }
}

