package X2;

import java.util.Map;

public final class k$g
  extends e
{
  public final Object o;
  public int p;
  
  public k$g(k paramk, int paramInt)
  {
    o = k.b(paramk, paramInt);
    p = paramInt;
  }
  
  public final void a()
  {
    int i = p;
    if ((i == -1) || (i >= q.size()) || (!W2.k.a(o, k.b(q, p)))) {
      p = k.i(q, o);
    }
  }
  
  public Object getKey()
  {
    return o;
  }
  
  public Object getValue()
  {
    Object localObject = q.w();
    if (localObject != null) {
      return N.a(((Map)localObject).get(o));
    }
    a();
    int i = p;
    if (i == -1) {
      localObject = N.b();
    } else {
      localObject = k.j(q, i);
    }
    return localObject;
  }
  
  public Object setValue(Object paramObject)
  {
    Object localObject = q.w();
    if (localObject != null) {
      return N.a(((Map)localObject).put(o, paramObject));
    }
    a();
    int i = p;
    if (i == -1)
    {
      q.put(o, paramObject);
      return N.b();
    }
    localObject = k.j(q, i);
    k.f(q, p, paramObject);
    return localObject;
  }
}

/* Location:
 * Qualified Name:     X2.k.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */