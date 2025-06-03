package R2;

import java.util.Iterator;
import java.util.List;

public final class P1
{
  public static final Object h = new Object();
  public final String a;
  public final N1 b;
  public final Object c;
  public final Object d;
  public final Object e = new Object();
  public volatile Object f = null;
  public volatile Object g = null;
  
  public P1(String paramString, Object paramObject1, Object paramObject2, N1 paramN1)
  {
    a = paramString;
    c = paramObject1;
    d = paramObject2;
    b = paramN1;
  }
  
  public final Object a(Object paramObject)
  {
    synchronized (e)
    {
      if (paramObject == null) {}
    }
    return c;
    synchronized (h)
    {
      if (!f.a()) {
        break label66;
      }
      if (g == null) {
        paramObject = c;
      }
    }
    paramObject = g;
    return paramObject;
    for (;;)
    {
      try
      {
        label66:
        Iterator localIterator = K.z0().iterator();
        if (localIterator.hasNext())
        {
          localP1 = (P1)localIterator.next();
          boolean bool = f.a();
          if (!bool) {
            ??? = null;
          }
        }
      }
      catch (SecurityException paramObject)
      {
        P1 localP1;
        N1 localN1;
        continue;
      }
      try
      {
        localN1 = b;
        paramObject = ???;
        if (localN1 != null) {
          paramObject = localN1.a();
        }
      }
      catch (IllegalStateException paramObject)
      {
        paramObject = ???;
        continue;
      }
      synchronized (h)
      {
        g = paramObject;
      }
    }
    paramObject = new java/lang/IllegalStateException;
    ((IllegalStateException)paramObject).<init>("Refreshing flag cache must be done on a worker thread.");
    throw ((Throwable)paramObject);
    paramObject = b;
    if (paramObject == null) {
      return c;
    }
    try
    {
      paramObject = ((N1)paramObject).a();
      return paramObject;
    }
    catch (IllegalStateException paramObject)
    {
      return c;
    }
    catch (SecurityException paramObject)
    {
      return c;
    }
    throw ((Throwable)paramObject);
    paramObject = finally;
    throw ((Throwable)paramObject);
  }
  
  public final String b()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     R2.P1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */