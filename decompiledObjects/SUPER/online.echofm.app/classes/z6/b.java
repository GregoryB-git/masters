package z6;

import V2.e;
import V2.j;
import V5.n;
import V5.o;
import X5.d;
import Z5.h;
import java.util.concurrent.CancellationException;
import p6.l;
import p6.l.a;
import p6.m;

public abstract class b
{
  public static final Object a(j paramj, d paramd)
  {
    return b(paramj, null, paramd);
  }
  
  public static final Object b(j paramj, V2.a parama, d paramd)
  {
    if (paramj.m())
    {
      parama = paramj.i();
      if (parama == null)
      {
        if (!paramj.l()) {
          return paramj.j();
        }
        parama = new StringBuilder();
        parama.append("Task ");
        parama.append(paramj);
        parama.append(" was cancelled normally.");
        throw new CancellationException(parama.toString());
      }
      throw parama;
    }
    parama = new m(Y5.b.b(paramd), 1);
    parama.z();
    paramj.c(a.o, new a(parama));
    paramj = parama.w();
    if (paramj == Y5.b.c()) {
      h.c(paramd);
    }
    return paramj;
  }
  
  public static final class a
    implements e
  {
    public a(l paraml) {}
    
    public final void a(j paramj)
    {
      Object localObject1 = paramj.i();
      Object localObject2;
      if (localObject1 == null)
      {
        if (paramj.l())
        {
          l.a.a(a, null, 1, null);
        }
        else
        {
          localObject2 = a;
          localObject1 = n.o;
          ((d)localObject2).resumeWith(n.a(paramj.j()));
        }
      }
      else
      {
        paramj = a;
        localObject2 = n.o;
        paramj.resumeWith(n.a(o.a((Throwable)localObject1)));
      }
    }
  }
}

/* Location:
 * Qualified Name:     z6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */