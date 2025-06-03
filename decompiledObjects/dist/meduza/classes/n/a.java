package n;

import java.util.HashMap;

public final class a<K, V>
  extends b<K, V>
{
  public final HashMap<K, b.c<K, V>> e = new HashMap();
  
  public final b.c<K, V> a(K paramK)
  {
    return (b.c)e.get(paramK);
  }
  
  public final V h(K paramK, V paramV)
  {
    Object localObject = a(paramK);
    if (localObject != null) {
      return (V)b;
    }
    localObject = e;
    b.c localc = new b.c(paramK, paramV);
    d += 1;
    paramV = b;
    if (paramV == null)
    {
      a = localc;
    }
    else
    {
      c = localc;
      d = paramV;
    }
    b = localc;
    ((HashMap)localObject).put(paramK, localc);
    return null;
  }
  
  public final V i(K paramK)
  {
    Object localObject = super.i(paramK);
    e.remove(paramK);
    return (V)localObject;
  }
}

/* Location:
 * Qualified Name:     n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */