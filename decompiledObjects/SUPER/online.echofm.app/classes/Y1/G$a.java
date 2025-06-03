package Y1;

import O1.V;
import O1.V.a;
import O1.V.b;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class G$a
  extends V.a
{
  public String h = "fbconnect://success";
  public t i = t.v;
  public B j = B.q;
  public boolean k;
  public boolean l;
  public String m;
  public String n;
  
  public G$a(G paramG, Context paramContext, String paramString, Bundle paramBundle)
  {
    super(paramContext, paramString, "oauth", paramBundle);
  }
  
  public V a()
  {
    Bundle localBundle = f();
    if (localBundle != null)
    {
      localBundle.putString("redirect_uri", h);
      localBundle.putString("client_id", c());
      localBundle.putString("e2e", j());
      if (j == B.r) {
        localObject = "token,signed_request,graph_domain,granted_scopes";
      } else {
        localObject = "token,signed_request,graph_domain";
      }
      localBundle.putString("response_type", (String)localObject);
      localBundle.putString("return_scopes", "true");
      localBundle.putString("auth_type", i());
      localBundle.putString("login_behavior", i.name());
      if (k) {
        localBundle.putString("fx_app", j.toString());
      }
      if (l) {
        localBundle.putString("skip_dedupe", "true");
      }
      V.b localb = V.A;
      Object localObject = d();
      if (localObject != null) {
        return localb.d((Context)localObject, "oauth", localBundle, g(), j, e());
      }
      throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
    }
    throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
  }
  
  public final String i()
  {
    String str = n;
    if (str != null) {
      return str;
    }
    Intrinsics.n("authType");
    throw null;
  }
  
  public final String j()
  {
    String str = m;
    if (str != null) {
      return str;
    }
    Intrinsics.n("e2e");
    throw null;
  }
  
  public final a k(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "authType");
    l(paramString);
    return this;
  }
  
  public final void l(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    n = paramString;
  }
  
  public final a m(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "e2e");
    n(paramString);
    return this;
  }
  
  public final void n(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<set-?>");
    m = paramString;
  }
  
  public final a o(boolean paramBoolean)
  {
    k = paramBoolean;
    return this;
  }
  
  public final a p(boolean paramBoolean)
  {
    String str;
    if (paramBoolean) {
      str = "fbconnect://chrome_os_success";
    } else {
      str = "fbconnect://success";
    }
    h = str;
    return this;
  }
  
  public final a q(t paramt)
  {
    Intrinsics.checkNotNullParameter(paramt, "loginBehavior");
    i = paramt;
    return this;
  }
  
  public final a r(B paramB)
  {
    Intrinsics.checkNotNullParameter(paramB, "targetApp");
    j = paramB;
    return this;
  }
  
  public final a s(boolean paramBoolean)
  {
    l = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     Y1.G.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */