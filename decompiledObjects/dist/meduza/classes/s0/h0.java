package s0;

import q0.f;

public final class h0<K, V>
{
  public final a<K, V> a;
  public final K b;
  public final V c;
  
  public h0(n1.a parama, n1.c paramc, f paramf)
  {
    a = new a(parama, paramc, paramf);
    b = "";
    c = paramf;
  }
  
  public static <K, V> int a(a<K, V> parama, K paramK, V paramV)
  {
    int i = r.c(a, 1, paramK);
    return r.c(c, 2, paramV) + i;
  }
  
  public static <K, V> void b(j paramj, a<K, V> parama, K paramK, V paramV)
  {
    r.p(paramj, a, 1, paramK);
    r.p(paramj, c, 2, paramV);
  }
  
  public static final class a<K, V>
  {
    public final n1 a;
    public final K b;
    public final n1 c;
    public final V d;
    
    public a(n1.a parama, n1.c paramc, f paramf)
    {
      a = parama;
      b = "";
      c = paramc;
      d = paramf;
    }
  }
}

/* Location:
 * Qualified Name:     s0.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */