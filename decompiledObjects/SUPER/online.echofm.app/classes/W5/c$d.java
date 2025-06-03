package W5;

import java.util.RandomAccess;

public final class c$d
  extends c
  implements RandomAccess
{
  public final c p;
  public final int q;
  public int r;
  
  public c$d(c paramc, int paramInt1, int paramInt2)
  {
    p = paramc;
    q = paramInt1;
    c.o.c(paramInt1, paramInt2, paramc.size());
    r = (paramInt2 - paramInt1);
  }
  
  public int a()
  {
    return r;
  }
  
  public Object get(int paramInt)
  {
    c.o.a(paramInt, r);
    return p.get(q + paramInt);
  }
}

/* Location:
 * Qualified Name:     W5.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */