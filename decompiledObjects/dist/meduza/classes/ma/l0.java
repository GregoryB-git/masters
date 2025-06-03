package ma;

public final class l0<K, V>
{
  public final a<K, V> a;
  public final K b;
  public final V c;
  
  public l0(v1.a parama, v1 paramv1, Object paramObject)
  {
    a = new a(parama, paramv1, paramObject);
    b = "";
    c = paramObject;
  }
  
  public static <K, V> int a(a<K, V> parama, K paramK, V paramV)
  {
    int i = s.c(a, 1, paramK);
    return s.c(c, 2, paramV) + i;
  }
  
  public static <K, V> void b(k paramk, a<K, V> parama, K paramK, V paramV)
  {
    s.q(paramk, a, 1, paramK);
    s.q(paramk, c, 2, paramV);
  }
  
  public static final class a<K, V>
  {
    public final v1 a;
    public final K b;
    public final v1 c;
    public final V d;
    
    public a(v1.a parama, v1 paramv1, Object paramObject)
    {
      a = parama;
      b = "";
      c = paramv1;
      d = paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     ma.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */