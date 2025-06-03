package f2;

import c2.d;
import c2.f;
import j2.a;
import m2.r;

public abstract class l
{
  public static void a(f paramf, d paramd)
  {
    if ((paramf instanceof s))
    {
      paramf = ((s)paramf).d().f(paramd);
      u.c().e().u(paramf, 1);
    }
    else
    {
      a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", paramf);
    }
  }
}

/* Location:
 * Qualified Name:     f2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */