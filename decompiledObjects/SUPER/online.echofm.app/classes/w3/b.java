package w3;

import A2.n;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s3.e;
import x3.f;

public class b
  implements a
{
  public static volatile a c;
  public final Q2.a a;
  public final Map b;
  
  public b(Q2.a parama)
  {
    n.i(parama);
    a = parama;
    b = new ConcurrentHashMap();
  }
  
  public static a h(e parame, Context paramContext, n4.d paramd)
  {
    n.i(parame);
    n.i(paramContext);
    n.i(paramd);
    n.i(paramContext.getApplicationContext());
    if (c == null)
    {
      Bundle localBundle;
      try
      {
        if (c != null) {
          break label108;
        }
        localBundle = new android/os/Bundle;
        localBundle.<init>(1);
        if (parame.y())
        {
          paramd.b(s3.b.class, c.o, d.a);
          localBundle.putBoolean("dataCollectionDefaultEnabled", parame.x());
        }
      }
      finally
      {
        break label114;
      }
      parame = new w3/b;
      parame.<init>(J0.f(paramContext, null, null, null, localBundle).z());
      c = parame;
      label108:
      break label119;
      label114:
      throw parame;
    }
    label119:
    return c;
  }
  
  public Map a(boolean paramBoolean)
  {
    return a.d(null, null, paramBoolean);
  }
  
  public void b(a.c paramc)
  {
    if (!x3.a.h(paramc)) {
      return;
    }
    a.g(x3.a.a(paramc));
  }
  
  public List c(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    paramString1 = a.b(paramString1, paramString2).iterator();
    while (paramString1.hasNext()) {
      localArrayList.add(x3.a.c((Bundle)paramString1.next()));
    }
    return localArrayList;
  }
  
  public void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    if ((paramString2 != null) && (!x3.a.e(paramString2, paramBundle))) {
      return;
    }
    a.a(paramString1, paramString2, paramBundle);
  }
  
  public void d(String paramString1, String paramString2, Object paramObject)
  {
    if (!x3.a.j(paramString1)) {
      return;
    }
    if (!x3.a.f(paramString1, paramString2)) {
      return;
    }
    a.h(paramString1, paramString2, paramObject);
  }
  
  public void e(String paramString1, String paramString2, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    if (!x3.a.j(paramString1)) {
      return;
    }
    if (!x3.a.e(paramString2, localBundle)) {
      return;
    }
    if (!x3.a.g(paramString1, paramString2, localBundle)) {
      return;
    }
    x3.a.d(paramString1, paramString2, localBundle);
    a.e(paramString1, paramString2, localBundle);
  }
  
  public int f(String paramString)
  {
    return a.c(paramString);
  }
  
  public a.a g(final String paramString, a.b paramb)
  {
    n.i(paramb);
    if (!x3.a.j(paramString)) {
      return null;
    }
    if (j(paramString)) {
      return null;
    }
    Q2.a locala = a;
    if ("fiam".equals(paramString)) {
      paramb = new x3.d(locala, paramb);
    } else if ("clx".equals(paramString)) {
      paramb = new f(locala, paramb);
    } else {
      paramb = null;
    }
    if (paramb != null)
    {
      b.put(paramString, paramb);
      return new a(paramString);
    }
    return null;
  }
  
  public final boolean j(String paramString)
  {
    return (!paramString.isEmpty()) && (b.containsKey(paramString)) && (b.get(paramString) != null);
  }
  
  public class a
    implements a.a
  {
    public a(String paramString) {}
  }
}

/* Location:
 * Qualified Name:     w3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */