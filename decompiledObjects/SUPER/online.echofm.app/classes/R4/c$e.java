package R4;

import j4.c;
import j4.d;
import j4.e;

public final class c$e
  implements d
{
  public static final e a = new e();
  public static final c b = c.d("sessionId");
  public static final c c = c.d("firstSessionId");
  public static final c d = c.d("sessionIndex");
  public static final c e = c.d("eventTimestampUs");
  public static final c f = c.d("dataCollectionStatus");
  public static final c g = c.d("firebaseInstallationId");
  
  public void b(t paramt, e parame)
  {
    parame.g(b, paramt.e());
    parame.g(c, paramt.d());
    parame.c(d, paramt.f());
    parame.b(e, paramt.b());
    parame.g(f, paramt.a());
    parame.g(g, paramt.c());
  }
}

/* Location:
 * Qualified Name:     R4.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */