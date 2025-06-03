package w7;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import java.util.concurrent.ConcurrentHashMap;
import m6.j;
import o7.l0;
import o7.t;

public final class c
  implements a
{
  public static volatile c c;
  public final d7.a a;
  public final ConcurrentHashMap b;
  
  public c(d7.a parama)
  {
    j.i(parama);
    a = parama;
    b = new ConcurrentHashMap();
  }
  
  public final b a(String paramString, f8.b paramb)
  {
    boolean bool = x7.b.c.contains(paramString);
    int i = 1;
    if (!(bool ^ true)) {
      return null;
    }
    if ((paramString.isEmpty()) || (!b.containsKey(paramString)) || (b.get(paramString) == null)) {
      i = 0;
    }
    if (i != 0) {
      return null;
    }
    d7.a locala = a;
    if ("fiam".equals(paramString)) {
      paramb = new x7.a(locala, paramb);
    } else if ("clx".equals(paramString)) {
      paramb = new x7.c(locala, paramb);
    } else {
      paramb = null;
    }
    if (paramb != null)
    {
      b.put(paramString, paramb);
      return new b();
    }
    return null;
  }
  
  public final void b(String paramString1, String paramString2, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    boolean bool = x7.b.c.contains(paramString1);
    int i = 1;
    if (!(bool ^ true)) {
      return;
    }
    int j;
    Object localObject;
    if (!x7.b.b.contains(paramString2))
    {
      paramBundle = x7.b.d;
      j = d;
      k = 0;
      do
      {
        if (k >= j) {
          break;
        }
        localObject = paramBundle.get(k);
        k++;
      } while (!localBundle.containsKey((String)localObject));
    }
    int k = 0;
    break label102;
    k = 1;
    label102:
    if (k == 0) {
      return;
    }
    if (!"_cmp".equals(paramString2))
    {
      k = i;
    }
    else
    {
      if ((x7.b.c.contains(paramString1) ^ true))
      {
        localObject = x7.b.d;
        j = d;
        k = 0;
        while (k < j)
        {
          paramBundle = ((l0)localObject).get(k);
          k++;
          if (localBundle.containsKey((String)paramBundle)) {
            break label312;
          }
        }
        k = -1;
        switch (paramString1.hashCode())
        {
        default: 
          break;
        case 3142703: 
          if (paramString1.equals("fiam")) {
            k = 2;
          }
          break;
        case 101230: 
          if (paramString1.equals("fdl")) {
            k = 1;
          }
          break;
        case 101200: 
          if (paramString1.equals("fcm")) {
            k = 0;
          }
          break;
        }
      }
      switch (k)
      {
      default: 
        k = 0;
        break;
      case 2: 
        paramBundle = "fiam_integration";
        break;
      case 1: 
        paramBundle = "fdl_integration";
        break;
      case 0: 
        label312:
        paramBundle = "fcm_integration";
      }
      localBundle.putString("_cis", paramBundle);
      k = i;
    }
    if (k == 0) {
      return;
    }
    if (("clx".equals(paramString1)) && ("_ae".equals(paramString2))) {
      localBundle.putLong("_r", 1L);
    }
    a.a.zzb(paramString1, paramString2, localBundle);
  }
  
  public final void c(String paramString)
  {
    if (!(x7.b.c.contains("fcm") ^ true)) {
      return;
    }
    a.a.zza("fcm", "_ln", paramString, true);
  }
}

/* Location:
 * Qualified Name:     w7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */