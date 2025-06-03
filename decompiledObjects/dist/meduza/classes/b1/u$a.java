package b1;

import y2.k;

public final class u$a<V>
  implements x<V>
{
  public final t<V> a;
  public final x<? super V> b;
  public int c = -1;
  
  public u$a(t paramt, k paramk)
  {
    a = paramt;
    b = paramk;
  }
  
  public final void a(V paramV)
  {
    if (c != a.getVersion())
    {
      c = a.getVersion();
      b.a(paramV);
    }
  }
}

/* Location:
 * Qualified Name:     b1.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */