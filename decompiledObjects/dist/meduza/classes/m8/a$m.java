package m8;

import y8.c;
import y8.d;
import y8.e;

public final class a$m
  implements d<f0.e.d.a.b>
{
  public static final m a = new m();
  public static final c b = c.a("threads");
  public static final c c = c.a("exception");
  public static final c d = c.a("appExitInfo");
  public static final c e = c.a("signal");
  public static final c f = c.a("binaries");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0.e.d.a.b)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).e(b, ((f0.e.d.a.b)paramObject1).e());
    ((e)paramObject2).e(c, ((f0.e.d.a.b)paramObject1).c());
    ((e)paramObject2).e(d, ((f0.e.d.a.b)paramObject1).a());
    ((e)paramObject2).e(e, ((f0.e.d.a.b)paramObject1).d());
    ((e)paramObject2).e(f, ((f0.e.d.a.b)paramObject1).b());
  }
}

/* Location:
 * Qualified Name:     m8.a.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */