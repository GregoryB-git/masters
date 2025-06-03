package ea;

import y8.c;
import y8.d;
import y8.e;

public final class h
  implements d<f0>
{
  public static final h a = new h();
  public static final c b = c.a("sessionId");
  public static final c c = c.a("firstSessionId");
  public static final c d = c.a("sessionIndex");
  public static final c e = c.a("eventTimestampUs");
  public static final c f = c.a("dataCollectionStatus");
  public static final c g = c.a("firebaseInstallationId");
  public static final c h = c.a("firebaseAuthenticationToken");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).e(b, a);
    ((e)paramObject2).e(c, b);
    ((e)paramObject2).c(d, c);
    ((e)paramObject2).d(e, d);
    ((e)paramObject2).e(f, e);
    ((e)paramObject2).e(g, f);
    ((e)paramObject2).e(h, g);
  }
}

/* Location:
 * Qualified Name:     ea.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */