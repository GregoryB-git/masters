package P;

import V5.t;
import java.io.File;
import java.util.Set;
import s6.j;

public final class m$d
  extends kotlin.jvm.internal.l
  implements g6.l
{
  public m$d(m paramm)
  {
    super(1);
  }
  
  public final void a(Throwable paramThrowable)
  {
    if (paramThrowable != null) {
      m.f(o).setValue(new h(paramThrowable));
    }
    Object localObject1 = m.k;
    paramThrowable = ((m.a)localObject1).b();
    m localm = o;
    try
    {
      ((m.a)localObject1).a().remove(m.g(localm).getAbsolutePath());
      localObject1 = t.a;
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     P.m.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */