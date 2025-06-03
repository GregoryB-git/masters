package d4;

import V3.k;
import Y3.e;

public class d$c
  implements d.d
{
  public final long a;
  
  public d$c(n paramn)
  {
    a = Math.max(512L, Math.sqrt(e.b(paramn) * 100L));
  }
  
  public boolean a(d.b paramb)
  {
    boolean bool;
    if ((paramb.i() > a) && ((paramb.j().isEmpty()) || (!paramb.j().X().equals(b.o())))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     d4.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */