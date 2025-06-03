package o7;

import java.util.Map;
import x6.b;

public final class l$d
  extends e<K, V>
{
  public final K a;
  public int b;
  
  public l$d(l paraml, int paramInt)
  {
    Object localObject = l.r;
    a = paraml.d(paramInt);
    b = paramInt;
  }
  
  public final void a()
  {
    int i = b;
    if ((i == -1) || (i >= c.size()) || (!b.Q(a, c.d(b))))
    {
      l locall = c;
      Object localObject1 = a;
      Object localObject2 = l.r;
      b = locall.c(localObject1);
    }
  }
  
  public final K getKey()
  {
    return (K)a;
  }
  
  public final V getValue()
  {
    Object localObject = c.b();
    if (localObject != null) {
      return (V)((Map)localObject).get(a);
    }
    a();
    int i = b;
    if (i == -1) {
      localObject = null;
    } else {
      localObject = c.l(i);
    }
    return (V)localObject;
  }
  
  public final V setValue(V paramV)
  {
    Object localObject1 = c.b();
    if (localObject1 != null) {
      return (V)((Map)localObject1).put(a, paramV);
    }
    a();
    int i = b;
    if (i == -1)
    {
      c.put(a, paramV);
      return null;
    }
    Object localObject2 = c.l(i);
    localObject1 = c;
    i = b;
    ((l)localObject1).j()[i] = paramV;
    return (V)localObject2;
  }
}

/* Location:
 * Qualified Name:     o7.l.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */