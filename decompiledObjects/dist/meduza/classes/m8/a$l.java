package m8;

import y8.c;
import y8.d;
import y8.e;

public final class a$l
  implements d<f0.e.d.a.b.a>
{
  public static final l a = new l();
  public static final c b = c.a("baseAddress");
  public static final c c = c.a("size");
  public static final c d = c.a("name");
  public static final c e = c.a("uuid");
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (f0.e.d.a.b.a)paramObject1;
    paramObject2 = (e)paramObject2;
    ((e)paramObject2).d(b, ((f0.e.d.a.b.a)paramObject1).a());
    ((e)paramObject2).d(c, ((f0.e.d.a.b.a)paramObject1).c());
    ((e)paramObject2).e(d, ((f0.e.d.a.b.a)paramObject1).b());
    c localc = e;
    paramObject1 = ((f0.e.d.a.b.a)paramObject1).d();
    if (paramObject1 != null) {
      paramObject1 = ((String)paramObject1).getBytes(f0.a);
    } else {
      paramObject1 = null;
    }
    ((e)paramObject2).e(localc, paramObject1);
  }
}

/* Location:
 * Qualified Name:     m8.a.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */