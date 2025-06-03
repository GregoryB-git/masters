package m8;

import y8.c;
import y8.d;
import y8.e;

public final class a$j
  implements d<f0.e>
{
  public static final j a = new j();
  public static final c b = c.a("generator");
  public static final c c = c.a("identifier");
  public static final c d = c.a("appQualitySessionId");
  public static final c e = c.a("startedAt");
  public static final c f = c.a("endedAt");
  public static final c g = c.a("crashed");
  public static final c h = c.a("app");
  public static final c i = c.a("user");
  public static final c j = c.a("os");
  public static final c k = c.a("device");
  public static final c l = c.a("events");
  public static final c m = c.a("generatorType");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0.e)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).e(b, ((f0.e)paramObject1).f());
    ((e)paramObject2).e(c, ((f0.e)paramObject1).h().getBytes(f0.a));
    ((e)paramObject2).e(d, ((f0.e)paramObject1).b());
    ((e)paramObject2).d(e, ((f0.e)paramObject1).j());
    ((e)paramObject2).e(f, ((f0.e)paramObject1).d());
    ((e)paramObject2).a(g, ((f0.e)paramObject1).l());
    ((e)paramObject2).e(h, ((f0.e)paramObject1).a());
    ((e)paramObject2).e(i, ((f0.e)paramObject1).k());
    ((e)paramObject2).e(j, ((f0.e)paramObject1).i());
    ((e)paramObject2).e(k, ((f0.e)paramObject1).c());
    ((e)paramObject2).e(l, ((f0.e)paramObject1).e());
    ((e)paramObject2).c(m, ((f0.e)paramObject1).g());
  }
}

/* Location:
 * Qualified Name:     m8.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */