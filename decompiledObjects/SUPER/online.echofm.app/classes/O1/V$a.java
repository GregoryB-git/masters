package O1;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import x1.a;
import x1.a.c;
import x1.o;

public class V$a
{
  public Context a;
  public String b;
  public String c;
  public int d;
  public V.d e;
  public Bundle f;
  public a g;
  
  public V$a(Context paramContext, String paramString, Bundle paramBundle)
  {
    Object localObject = a.z;
    g = ((a.c)localObject).e();
    if (!((a.c)localObject).g())
    {
      localObject = P.J(paramContext);
      if (localObject != null) {
        b = ((String)localObject);
      } else {
        throw new o("Attempted to create a builder without a valid access token or a valid default Application ID.");
      }
    }
    b(paramContext, paramString, paramBundle);
  }
  
  public V$a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = P.J(paramContext);
    }
    b = Q.k(str, "applicationId");
    b(paramContext, paramString2, paramBundle);
  }
  
  public V a()
  {
    Object localObject = g;
    if (localObject != null)
    {
      Bundle localBundle = f;
      localb = null;
      if (localBundle != null)
      {
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = ((a)localObject).c();
        }
        localBundle.putString("app_id", (String)localObject);
      }
      localBundle = f;
      if (localBundle != null)
      {
        localObject = g;
        if (localObject == null) {
          localObject = localb;
        } else {
          localObject = ((a)localObject).l();
        }
        localBundle.putString("access_token", (String)localObject);
      }
    }
    else
    {
      localObject = f;
      if (localObject != null) {
        ((BaseBundle)localObject).putString("app_id", b);
      }
    }
    V.b localb = V.A;
    localObject = a;
    if (localObject != null) {
      return localb.c((Context)localObject, c, f, d, e);
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final void b(Context paramContext, String paramString, Bundle paramBundle)
  {
    a = paramContext;
    c = paramString;
    if (paramBundle != null) {
      f = paramBundle;
    } else {
      f = new Bundle();
    }
  }
  
  public final String c()
  {
    return b;
  }
  
  public final Context d()
  {
    return a;
  }
  
  public final V.d e()
  {
    return e;
  }
  
  public final Bundle f()
  {
    return f;
  }
  
  public final int g()
  {
    return d;
  }
  
  public final a h(V.d paramd)
  {
    e = paramd;
    return this;
  }
}

/* Location:
 * Qualified Name:     O1.V.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */