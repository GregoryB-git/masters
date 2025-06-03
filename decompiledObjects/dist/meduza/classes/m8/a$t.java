package m8;

import y8.c;
import y8.d;
import y8.e;

public final class a$t
  implements d<f0.e.d>
{
  public static final t a = new t();
  public static final c b = c.a("timestamp");
  public static final c c = c.a("type");
  public static final c d = c.a("app");
  public static final c e = c.a("device");
  public static final c f = c.a("log");
  public static final c g = c.a("rollouts");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0.e.d)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).d(b, ((f0.e.d)paramObject1).e());
    ((e)paramObject2).e(c, ((f0.e.d)paramObject1).f());
    ((e)paramObject2).e(d, ((f0.e.d)paramObject1).a());
    ((e)paramObject2).e(e, ((f0.e.d)paramObject1).b());
    ((e)paramObject2).e(f, ((f0.e.d)paramObject1).c());
    ((e)paramObject2).e(g, ((f0.e.d)paramObject1).d());
  }
}

/* Location:
 * Qualified Name:     m8.a.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */