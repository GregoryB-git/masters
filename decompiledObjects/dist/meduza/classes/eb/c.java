package eb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import n7.g;
import n7.g.a;

public final class c
{
  public static final c k;
  public final q a;
  public final Executor b;
  public final String c;
  public final b d;
  public final String e;
  public final Object[][] f;
  public final List<h.a> g;
  public final Boolean h;
  public final Integer i;
  public final Integer j;
  
  static
  {
    a locala = new a();
    f = new Object[0][2];
    g = Collections.emptyList();
    k = new c(locala);
  }
  
  public c(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    j = j;
  }
  
  public static a b(c paramc)
  {
    a locala = new a();
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    j = j;
    return locala;
  }
  
  public final <T> T a(b<T> paramb)
  {
    x6.b.y(paramb, "key");
    for (int m = 0;; m++)
    {
      Object[][] arrayOfObject = f;
      if (m >= arrayOfObject.length) {
        break;
      }
      if (paramb.equals(arrayOfObject[m][0])) {
        return (T)f[m][1];
      }
    }
    return null;
  }
  
  public final <T> c c(b<T> paramb, T paramT)
  {
    x6.b.y(paramb, "key");
    x6.b.y(paramT, "value");
    a locala = b(this);
    for (int m = 0;; m++)
    {
      arrayOfObject1 = f;
      if (m >= arrayOfObject1.length) {
        break;
      }
      if (paramb.equals(arrayOfObject1[m][0])) {
        break label60;
      }
    }
    m = -1;
    label60:
    int n = f.length;
    int i1;
    if (m == -1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    Object[][] arrayOfObject2 = new Object[n + i1][2];
    f = arrayOfObject2;
    Object[][] arrayOfObject1 = f;
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    if (m == -1) {
      f[f.length] = { paramb, paramT };
    } else {
      f[m] = { paramb, paramT };
    }
    return new c(locala);
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "deadline");
    locala.a(c, "authority");
    locala.a(d, "callCredentials");
    Object localObject = b;
    if (localObject != null) {
      localObject = localObject.getClass();
    } else {
      localObject = null;
    }
    locala.a(localObject, "executor");
    locala.a(e, "compressorName");
    locala.a(Arrays.deepToString(f), "customOptions");
    locala.c("waitForReady", Boolean.TRUE.equals(h));
    locala.a(i, "maxInboundMessageSize");
    locala.a(j, "maxOutboundMessageSize");
    locala.a(g, "streamTracerFactories");
    return locala.toString();
  }
  
  public static final class a
  {
    public q a;
    public Executor b;
    public String c;
    public b d;
    public String e;
    public Object[][] f;
    public List<h.a> g;
    public Boolean h;
    public Integer i;
    public Integer j;
  }
  
  public static final class b<T>
  {
    public final String a;
    
    public b(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     eb.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */