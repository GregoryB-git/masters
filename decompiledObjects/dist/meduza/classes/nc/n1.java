package nc;

import ec.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2.m0;
import sc.j;
import sc.q;

public abstract class n1
  extends w
  implements t0, f1
{
  public o1 d;
  
  public final t1 b()
  {
    return null;
  }
  
  public final void dispose()
  {
    Object localObject1 = m();
    Object localObject2;
    int i;
    Object localObject3;
    Object localObject4;
    do
    {
      localObject2 = ((o1)localObject1).F();
      boolean bool = localObject2 instanceof n1;
      i = 0;
      if (!bool) {
        break;
      }
      if (localObject2 != this) {
        return;
      }
      localObject3 = o1.a;
      localObject4 = m0.z;
      do
      {
        if (((AtomicReferenceFieldUpdater)localObject3).compareAndSet(localObject1, localObject2, localObject4))
        {
          i = 1;
          break;
        }
      } while (((AtomicReferenceFieldUpdater)localObject3).get(localObject1) == localObject2);
    } while (i == 0);
    return;
    if (((localObject2 instanceof f1)) && (((f1)localObject2).b() != null))
    {
      do
      {
        localObject1 = h();
        if ((localObject1 instanceof q))
        {
          localObject2 = a;
          break;
        }
        if (localObject1 == this)
        {
          localObject2 = (j)localObject1;
          break;
        }
        i.c(localObject1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        localObject4 = (j)localObject1;
        AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = j.c;
        localObject3 = (q)localAtomicReferenceFieldUpdater.get(localObject4);
        localObject2 = localObject3;
        if (localObject3 == null)
        {
          localObject2 = new q((j)localObject4);
          localAtomicReferenceFieldUpdater.lazySet(localObject4, localObject2);
        }
        localObject3 = j.a;
        do
        {
          if (((AtomicReferenceFieldUpdater)localObject3).compareAndSet(this, localObject1, localObject2))
          {
            i = 1;
            break;
          }
        } while (((AtomicReferenceFieldUpdater)localObject3).get(this) == localObject1);
        i = 0;
      } while (i == 0);
      ((j)localObject4).c();
    }
  }
  
  public final boolean isActive()
  {
    return true;
  }
  
  public final o1 m()
  {
    o1 localo1 = d;
    if (localo1 != null) {
      return localo1;
    }
    i.i("job");
    throw null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('@');
    localStringBuilder.append(g0.b(this));
    localStringBuilder.append("[job@");
    localStringBuilder.append(g0.b(m()));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */