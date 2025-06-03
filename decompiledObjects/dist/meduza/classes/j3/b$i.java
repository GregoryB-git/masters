package j3;

import y8.c;
import y8.d;
import y8.e;

public final class b$i
  implements d<u>
{
  public static final i a = new i();
  public static final c b = c.a("requestTimeMs");
  public static final c c = c.a("requestUptimeMs");
  public static final c d = c.a("clientInfo");
  public static final c e = c.a("logSource");
  public static final c f = c.a("logSourceName");
  public static final c g = c.a("logEvent");
  public static final c h = c.a("qosTier");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (u)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).d(b, ((u)paramObject1).f());
    ((e)paramObject2).d(c, ((u)paramObject1).g());
    ((e)paramObject2).e(d, ((u)paramObject1).a());
    ((e)paramObject2).e(e, ((u)paramObject1).c());
    ((e)paramObject2).e(f, ((u)paramObject1).d());
    ((e)paramObject2).e(g, ((u)paramObject1).b());
    ((e)paramObject2).e(h, ((u)paramObject1).e());
  }
}

/* Location:
 * Qualified Name:     j3.b.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */