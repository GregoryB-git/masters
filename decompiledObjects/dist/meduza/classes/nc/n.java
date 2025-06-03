package nc;

import b.a0;
import ec.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sc.g;

public final class n
  extends l1
{
  public final l<?> e;
  
  public n(l<?> paraml)
  {
    e = paraml;
  }
  
  public final void l(Throwable paramThrowable)
  {
    l locall = e;
    paramThrowable = locall.r(m());
    boolean bool = locall.x();
    int i = 0;
    int j;
    if (!bool)
    {
      j = i;
    }
    else
    {
      Object localObject1 = d;
      i.c(localObject1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
      localObject1 = (g)localObject1;
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = g.p;
      do
      {
        Object localObject2;
        do
        {
          localObject2 = localAtomicReferenceFieldUpdater.get(localObject1);
          localObject3 = a0.Z;
          bool = i.a(localObject2, localObject3);
          j = 1;
          if (!bool) {
            break;
          }
          localObject2 = g.p;
          do
          {
            if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(localObject1, localObject3, paramThrowable))
            {
              j = 1;
              break;
            }
          } while (((AtomicReferenceFieldUpdater)localObject2).get(localObject1) == localObject3);
          j = 0;
        } while (j == 0);
        if ((localObject2 instanceof Throwable))
        {
          j = 1;
          break;
        }
        Object localObject3 = g.p;
        while (!((AtomicReferenceFieldUpdater)localObject3).compareAndSet(localObject1, localObject2, null)) {
          if (((AtomicReferenceFieldUpdater)localObject3).get(localObject1) != localObject2) {
            j = 0;
          }
        }
      } while (j == 0);
      j = i;
    }
    if (j == 0)
    {
      locall.cancel(paramThrowable);
      if (!locall.x()) {
        locall.p();
      }
    }
  }
}

/* Location:
 * Qualified Name:     nc.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */