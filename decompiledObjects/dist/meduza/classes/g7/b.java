package g7;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import k6.a.a;
import k6.a.f;
import k6.e.a;
import k6.e.b;

public final class b
  extends a.a
{
  public final a.f buildClient(Context paramContext, Looper paramLooper, m6.a parama, Object paramObject, e.a parama1, e.b paramb)
  {
    paramObject = (a)paramObject;
    parama.getClass();
    paramObject = h;
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", a);
    if (paramObject != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", ((Integer)paramObject).intValue());
    }
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
    localBundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
    localBundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
    localBundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
    localBundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
    return new h7.a(paramContext, paramLooper, parama, localBundle, parama1, paramb);
  }
}

/* Location:
 * Qualified Name:     g7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */