package Y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import x1.L;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f7361a = new E();

    public static final x1.F a(String authorizationCode, String redirectUri, String codeVerifier) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", C2146B.m());
        bundle.putString("redirect_uri", redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        x1.F x7 = x1.F.f20890n.x(null, "oauth/access_token", null);
        x7.F(L.GET);
        x7.G(bundle);
        return x7;
    }
}
