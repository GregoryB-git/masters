package j3;

import y8.c;
import y8.d;
import y8.e;

public final class b$h
  implements d<t>
{
  public static final h a = new h();
  public static final c b = c.a("eventTimeMs");
  public static final c c = c.a("eventCode");
  public static final c d = c.a("complianceData");
  public static final c e = c.a("eventUptimeMs");
  public static final c f = c.a("sourceExtension");
  public static final c g = c.a("sourceExtensionJsonProto3");
  public static final c h = c.a("timezoneOffsetSeconds");
  public static final c i = c.a("networkConnectionInfo");
  public static final c j = c.a("experimentIds");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (t)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).d(b, ((t)paramObject1).c());
    ((e)paramObject2).e(c, ((t)paramObject1).b());
    ((e)paramObject2).e(d, ((t)paramObject1).a());
    ((e)paramObject2).d(e, ((t)paramObject1).d());
    ((e)paramObject2).e(f, ((t)paramObject1).g());
    ((e)paramObject2).e(g, ((t)paramObject1).h());
    ((e)paramObject2).d(h, ((t)paramObject1).i());
    ((e)paramObject2).e(i, ((t)paramObject1).f());
    ((e)paramObject2).e(j, ((t)paramObject1).e());
  }
}

/* Location:
 * Qualified Name:     j3.b.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */