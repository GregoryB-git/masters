package g7;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import k6.a;
import k6.e;

/* loaded from: classes.dex */
public final class b extends a.AbstractC0130a {
    @Override // k6.a.AbstractC0130a
    public final a.f buildClient(Context context, Looper looper, m6.a aVar, Object obj, e.a aVar2, e.b bVar) {
        aVar.getClass();
        Integer num = aVar.f10246h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", aVar.f10240a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new h7.a(context, looper, aVar, bundle, aVar2, bVar);
    }
}
