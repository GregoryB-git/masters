package d8;

import c9.a;
import c9.c;
import java.util.Set;
import n7.w;

public final class u$a
  implements c
{
  public final Set<Class<?>> a;
  public final c b;
  
  public u$a(Set<Class<?>> paramSet, c paramc)
  {
    a = paramSet;
    b = paramc;
  }
  
  public final void b(a<?> parama)
  {
    if (a.contains(a))
    {
      b.b(parama);
      return;
    }
    throw new w(String.format("Attempting to publish an undeclared event %s.", new Object[] { parama }));
  }
}

/* Location:
 * Qualified Name:     d8.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */