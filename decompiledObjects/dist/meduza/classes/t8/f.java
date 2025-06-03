package t8;

public final class f<K, V>
  extends j<K, V>
{
  public int e = -1;
  
  public f(K paramK, V paramV, h<K, V> paramh1, h<K, V> paramh2)
  {
    super(paramK, paramV, paramh1, paramh2);
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final j<K, V> j(K paramK, V paramV, h<K, V> paramh1, h<K, V> paramh2)
  {
    Object localObject = paramK;
    if (paramK == null) {
      localObject = a;
    }
    paramK = paramV;
    if (paramV == null) {
      paramK = b;
    }
    paramV = paramh1;
    if (paramh1 == null) {
      paramV = c;
    }
    paramh1 = paramh2;
    if (paramh2 == null) {
      paramh1 = d;
    }
    return new f(localObject, paramK, paramV, paramh1);
  }
  
  public final h.a m()
  {
    return h.a.b;
  }
  
  public final void r(j paramj)
  {
    if (e == -1)
    {
      c = paramj;
      return;
    }
    throw new IllegalStateException("Can't set left after using size");
  }
  
  public final int size()
  {
    if (e == -1)
    {
      int i = c.size();
      e = (d.size() + (i + 1));
    }
    return e;
  }
}

/* Location:
 * Qualified Name:     t8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */