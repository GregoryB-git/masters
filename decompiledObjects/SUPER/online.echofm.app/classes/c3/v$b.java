package c3;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import n3.a;
import p3.C.c;
import p3.z;

public class v$b
{
  public final Class a;
  public ConcurrentMap b = new ConcurrentHashMap();
  public v.c c;
  public a d;
  
  public v$b(Class paramClass)
  {
    a = paramClass;
    d = a.b;
  }
  
  public b a(Object paramObject1, Object paramObject2, C.c paramc)
  {
    return c(paramObject1, paramObject2, paramc, false);
  }
  
  public b b(Object paramObject1, Object paramObject2, C.c paramc)
  {
    return c(paramObject1, paramObject2, paramc, true);
  }
  
  public final b c(Object paramObject1, Object paramObject2, C.c paramc, boolean paramBoolean)
  {
    if (b != null)
    {
      if ((paramObject1 == null) && (paramObject2 == null)) {
        throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
      }
      if (paramc.c0() == z.q)
      {
        paramObject1 = v.a(paramObject1, paramObject2, paramc, b);
        if (paramBoolean) {
          if (c == null) {
            c = ((v.c)paramObject1);
          } else {
            throw new IllegalStateException("you cannot set two primary primitives");
          }
        }
        return this;
      }
      throw new GeneralSecurityException("only ENABLED key is allowed");
    }
    throw new IllegalStateException("addPrimitive cannot be called after build");
  }
  
  public v d()
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = new v((ConcurrentMap)localObject, c, d, a, null);
      b = null;
      return (v)localObject;
    }
    throw new IllegalStateException("build cannot be called twice");
  }
  
  public b e(a parama)
  {
    if (b != null)
    {
      d = parama;
      return this;
    }
    throw new IllegalStateException("setAnnotations cannot be called after build");
  }
}

/* Location:
 * Qualified Name:     c3.v.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */