package R2;

import E2.e;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import java.util.Set;

public final class c6
{
  public final N2 a;
  
  public c6(N2 paramN2)
  {
    a = paramN2;
  }
  
  public final void a()
  {
    a.e().n();
    if (!d()) {
      return;
    }
    Object localObject;
    if (e())
    {
      a.F().w.b(null);
      localObject = new Bundle();
      ((BaseBundle)localObject).putString("source", "(not set)");
      ((BaseBundle)localObject).putString("medium", "(not set)");
      ((BaseBundle)localObject).putString("_cis", "intent");
      ((BaseBundle)localObject).putLong("_cc", 1L);
      a.H().z0("auto", "_cmpx", (Bundle)localObject);
    }
    else
    {
      localObject = a.F().w.a();
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        a.j().I().a("Cache still valid but referrer not found");
      }
      else
      {
        long l = a.F().x.a() / 3600000L;
        Uri localUri = Uri.parse((String)localObject);
        Bundle localBundle = new Bundle();
        Pair localPair = new Pair(localUri.getPath(), localBundle);
        localObject = localUri.getQueryParameterNames().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          localBundle.putString(str, localUri.getQueryParameter(str));
        }
        ((Bundle)second).putLong("_cc", (l - 1L) * 3600000L);
        localObject = first;
        if (localObject == null) {
          localObject = "app";
        } else {
          localObject = (String)localObject;
        }
        a.H().z0((String)localObject, "_cmp", (Bundle)second);
      }
      a.F().w.b(null);
    }
    a.F().x.b(0L);
  }
  
  public final void b(String paramString, Bundle paramBundle)
  {
    a.e().n();
    if (!a.p())
    {
      if ((paramBundle != null) && (!paramBundle.isEmpty()))
      {
        if (paramString != null)
        {
          localObject = paramString;
          if (!paramString.isEmpty()) {}
        }
        else
        {
          localObject = "auto";
        }
        paramString = new Uri.Builder();
        paramString.path((String)localObject);
        Object localObject = paramBundle.keySet().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          paramString.appendQueryParameter(str, paramBundle.getString(str));
        }
        paramString = paramString.build().toString();
      }
      else
      {
        paramString = null;
      }
      if (!TextUtils.isEmpty(paramString))
      {
        a.F().w.b(paramString);
        a.F().x.b(a.b().a());
      }
    }
  }
  
  public final void c()
  {
    if ((d()) && (e())) {
      a.F().w.b(null);
    }
  }
  
  public final boolean d()
  {
    return a.F().x.a() > 0L;
  }
  
  public final boolean e()
  {
    if (!d()) {
      return false;
    }
    return a.b().a() - a.F().x.a() > a.z().x(null, K.V);
  }
}

/* Location:
 * Qualified Name:     R2.c6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */