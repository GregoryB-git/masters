package Y1;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.F;
import x1.F.c;
import x1.L;

public final class E
{
  public static final E a = new E();
  
  public static final F a(String paramString1, String paramString2, String paramString3)
  {
    Intrinsics.checkNotNullParameter(paramString1, "authorizationCode");
    Intrinsics.checkNotNullParameter(paramString2, "redirectUri");
    Intrinsics.checkNotNullParameter(paramString3, "codeVerifier");
    Bundle localBundle = new Bundle();
    localBundle.putString("code", paramString1);
    localBundle.putString("client_id", B.m());
    localBundle.putString("redirect_uri", paramString2);
    localBundle.putString("code_verifier", paramString3);
    paramString1 = F.n.x(null, "oauth/access_token", null);
    paramString1.F(L.o);
    paramString1.G(localBundle);
    return paramString1;
  }
}

/* Location:
 * Qualified Name:     Y1.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */