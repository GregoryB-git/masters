package t8;

public final class i<K, V>
  extends j<K, V>
{
  public i(K paramK, V paramV)
  {
    super(paramK, paramV, localg, localg);
  }
  
  public i(K paramK, V paramV, h<K, V> paramh1, h<K, V> paramh2)
  {
    super(paramK, paramV, paramh1, paramh2);
  }
  
  public final boolean e()
  {
    return true;
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
    return new i(localObject, paramK, paramV, paramh1);
  }
  
  public final h.a m()
  {
    return h.a.a;
  }
  
  public final int size()
  {
    int i = c.size();
    return d.size() + (i + 1);
  }
}

/* Location:
 * Qualified Name:     t8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */