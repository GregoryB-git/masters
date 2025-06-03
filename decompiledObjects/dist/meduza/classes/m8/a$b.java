package m8;

import y8.c;
import y8.d;
import y8.e;

public final class a$b
  implements d<f0.a>
{
  public static final b a = new b();
  public static final c b = c.a("pid");
  public static final c c = c.a("processName");
  public static final c d = c.a("reasonCode");
  public static final c e = c.a("importance");
  public static final c f = c.a("pss");
  public static final c g = c.a("rss");
  public static final c h = c.a("timestamp");
  public static final c i = c.a("traceFile");
  public static final c j = c.a("buildIdMappingForArch");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0.a)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).c(b, ((f0.a)paramObject1).c());
    ((e)paramObject2).e(c, ((f0.a)paramObject1).d());
    ((e)paramObject2).c(d, ((f0.a)paramObject1).f());
    ((e)paramObject2).c(e, ((f0.a)paramObject1).b());
    ((e)paramObject2).d(f, ((f0.a)paramObject1).e());
    ((e)paramObject2).d(g, ((f0.a)paramObject1).g());
    ((e)paramObject2).d(h, ((f0.a)paramObject1).h());
    ((e)paramObject2).e(i, ((f0.a)paramObject1).i());
    ((e)paramObject2).e(j, ((f0.a)paramObject1).a());
  }
}

/* Location:
 * Qualified Name:     m8.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */