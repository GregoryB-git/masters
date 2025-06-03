package sc;

import ec.i;
import ec.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.g0;

public class j
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");
  public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
  private volatile Object _next = this;
  private volatile Object _prev = this;
  private volatile Object _removedRef;
  
  public final j c()
  {
    j localj = (j)b.get(this);
    Object localObject1 = localj;
    label13:
    Object localObject2 = null;
    for (;;)
    {
      Object localObject3 = a;
      Object localObject4 = ((AtomicReferenceFieldUpdater)localObject3).get(localObject1);
      int i = 0;
      int j = 0;
      if (localObject4 == this)
      {
        if (localj == localObject1) {
          return (j)localObject1;
        }
        localObject2 = b;
        do
        {
          if (((AtomicReferenceFieldUpdater)localObject2).compareAndSet(this, localj, localObject1))
          {
            j = 1;
            break;
          }
        } while (((AtomicReferenceFieldUpdater)localObject2).get(this) == localj);
        if (j == 0) {
          break;
        }
        return (j)localObject1;
      }
      if (k()) {
        return null;
      }
      if (localObject4 == null) {
        return (j)localObject1;
      }
      if ((localObject4 instanceof p))
      {
        ((p)localObject4).a(localObject1);
        break;
      }
      if ((localObject4 instanceof q))
      {
        if (localObject2 != null)
        {
          localObject4 = a;
          do
          {
            if (((AtomicReferenceFieldUpdater)localObject3).compareAndSet(localObject2, localObject1, localObject4))
            {
              j = 1;
              break;
            }
          } while (((AtomicReferenceFieldUpdater)localObject3).get(localObject2) == localObject1);
          j = i;
          if (j == 0) {
            break;
          }
          localObject1 = localObject2;
          break label13;
        }
        localObject1 = (j)b.get(localObject1);
        continue;
      }
      i.c(localObject4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
      localObject3 = (j)localObject4;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
  }
  
  public final void e(j paramj)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = b;
    int i;
    do
    {
      j localj = (j)localAtomicReferenceFieldUpdater1.get(paramj);
      if (h() != paramj) {
        return;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = b;
      do
      {
        if (localAtomicReferenceFieldUpdater2.compareAndSet(paramj, localj, this))
        {
          i = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater2.get(paramj) == localj);
      i = 0;
    } while (i == 0);
    if (k()) {
      paramj.c();
    }
  }
  
  public final Object h()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    for (;;)
    {
      Object localObject = localAtomicReferenceFieldUpdater.get(this);
      if (!(localObject instanceof p)) {
        return localObject;
      }
      ((p)localObject).a(this);
    }
  }
  
  public final j i()
  {
    Object localObject1 = h();
    Object localObject2;
    if ((localObject1 instanceof q)) {
      localObject2 = (q)localObject1;
    } else {
      localObject2 = null;
    }
    if (localObject2 != null)
    {
      j localj = a;
      localObject2 = localj;
      if (localj != null) {}
    }
    else
    {
      i.c(localObject1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
      localObject2 = (j)localObject1;
    }
    return (j)localObject2;
  }
  
  public final j j()
  {
    j localj1 = c();
    j localj2 = localj1;
    if (localj1 == null) {
      for (localj2 = (j)b.get(this); localj2.k(); localj2 = (j)b.get(localj2)) {}
    }
    return localj2;
  }
  
  public boolean k()
  {
    return h() instanceof q;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(new b());
    localStringBuilder.append('@');
    localStringBuilder.append(g0.b(this));
    return localStringBuilder.toString();
  }
  
  public static abstract class a
    extends a<j>
  {
    public final j b;
    public j c;
    
    public a(j paramj)
    {
      b = paramj;
    }
    
    public final void b(Object paramObject1, Object paramObject2)
    {
      j localj = (j)paramObject1;
      int i = 1;
      int j;
      if (paramObject2 == null) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        paramObject1 = b;
      } else {
        paramObject1 = c;
      }
      if (paramObject1 != null)
      {
        paramObject2 = j.a;
        while (!((AtomicReferenceFieldUpdater)paramObject2).compareAndSet(localj, this, paramObject1)) {
          if (((AtomicReferenceFieldUpdater)paramObject2).get(localj) != this) {
            i = 0;
          }
        }
        if ((i != 0) && (j != 0))
        {
          paramObject2 = b;
          paramObject1 = c;
          i.b(paramObject1);
          ((j)paramObject2).e((j)paramObject1);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     sc.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */