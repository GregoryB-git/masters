package gb;

import eb.c;
import eb.h1;
import eb.k0.f;
import eb.k0.j;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r1$e
  implements q.c
{
  public volatile y2.b0 a;
  
  public r1$e(r1 paramr1) {}
  
  public final u a(s2 params2)
  {
    Object localObject = b.z;
    if (b.H.get()) {}
    do
    {
      for (;;)
      {
        return b.F;
        if (localObject != null) {
          break;
        }
        b.n.execute(new z1(this));
      }
      localObject = ((k0.j)localObject).a(params2);
      params2 = a;
      params2 = v0.e((k0.f)localObject, Boolean.TRUE.equals(h));
    } while (params2 == null);
    return params2;
  }
}

/* Location:
 * Qualified Name:     gb.r1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */