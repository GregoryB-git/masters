package m8;

import y8.c;
import y8.d;
import y8.e;

public final class a$s
  implements d<f0.e.d.c>
{
  public static final s a = new s();
  public static final c b = c.a("batteryLevel");
  public static final c c = c.a("batteryVelocity");
  public static final c d = c.a("proximityOn");
  public static final c e = c.a("orientation");
  public static final c f = c.a("ramUsed");
  public static final c g = c.a("diskUsed");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0.e.d.c)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).e(b, ((f0.e.d.c)paramObject1).a());
    ((e)paramObject2).c(c, ((f0.e.d.c)paramObject1).b());
    ((e)paramObject2).a(d, ((f0.e.d.c)paramObject1).f());
    ((e)paramObject2).c(e, ((f0.e.d.c)paramObject1).d());
    ((e)paramObject2).d(f, ((f0.e.d.c)paramObject1).e());
    ((e)paramObject2).d(g, ((f0.e.d.c)paramObject1).c());
  }
}

/* Location:
 * Qualified Name:     m8.a.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */