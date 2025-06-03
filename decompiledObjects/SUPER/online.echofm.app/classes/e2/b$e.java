package e2;

import j4.c;
import j4.d;
import j4.e;

public final class b$e
  implements d
{
  public static final e a = new e();
  public static final c b = c.d("requestTimeMs");
  public static final c c = c.d("requestUptimeMs");
  public static final c d = c.d("clientInfo");
  public static final c e = c.d("logSource");
  public static final c f = c.d("logSourceName");
  public static final c g = c.d("logEvent");
  public static final c h = c.d("qosTier");
  
  public void b(m paramm, e parame)
  {
    parame.b(b, paramm.g());
    parame.b(c, paramm.h());
    parame.g(d, paramm.b());
    parame.g(e, paramm.d());
    parame.g(f, paramm.e());
    parame.g(g, paramm.c());
    parame.g(h, paramm.f());
  }
}

/* Location:
 * Qualified Name:     e2.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */