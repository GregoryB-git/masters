package E1;

import T1.a;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l
{
  public static final a g = new a(null);
  public static l h;
  public static final AtomicBoolean i = new AtomicBoolean(false);
  public final Class a;
  public final Class b;
  public final Method c;
  public final Method d;
  public final Method e;
  public final Method f;
  
  public l(Class paramClass1, Class paramClass2, Method paramMethod1, Method paramMethod2, Method paramMethod3, Method paramMethod4)
  {
    a = paramClass1;
    b = paramClass2;
    c = paramMethod1;
    d = paramMethod2;
    e = paramMethod3;
    f = paramMethod4;
  }
  
  public final Object d(String paramString, List paramList)
  {
    boolean bool = a.d(this);
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    try
    {
      Object localObject2 = m.a;
      localObject2 = m.e(a, c, null, new Object[0]);
      if (localObject2 == null) {
        return null;
      }
      paramString = m.e(b, d, localObject2, new Object[] { paramString });
      if (paramString == null) {
        return null;
      }
      paramString = m.e(b, e, paramString, new Object[] { paramList });
      if (paramString == null) {
        paramString = (String)localObject1;
      } else {
        paramString = m.e(b, f, paramString, new Object[0]);
      }
      return paramString;
    }
    finally
    {
      a.b(paramString, this);
    }
    return null;
  }
  
  public final Class e()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      Class localClass = a;
      return localClass;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public static final class a
  {
    public final void a()
    {
      Class localClass1 = m.a("com.android.billingclient.api.SkuDetailsParams");
      Class localClass2 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
      if ((localClass1 != null) && (localClass2 != null))
      {
        Method localMethod1 = m.d(localClass1, "newBuilder", new Class[0]);
        Method localMethod2 = m.d(localClass2, "setType", new Class[] { String.class });
        Method localMethod3 = m.d(localClass2, "setSkusList", new Class[] { List.class });
        Method localMethod4 = m.d(localClass2, "build", new Class[0]);
        if ((localMethod1 != null) && (localMethod2 != null) && (localMethod3 != null) && (localMethod4 != null)) {
          l.c(new l(localClass1, localClass2, localMethod1, localMethod2, localMethod3, localMethod4));
        }
      }
    }
    
    public final l b()
    {
      if (l.a().get()) {
        return l.b();
      }
      a();
      l.a().set(true);
      return l.b();
    }
  }
}

/* Location:
 * Qualified Name:     E1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */