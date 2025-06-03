package uc;

import d2.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.i2;
import nc.k;
import nc.t0;
import sc.t;
import ub.h;
import va.a;

public final class e<R>
  extends nc.i
  implements f, i2
{
  public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state");
  public t0 a;
  public Object b;
  private volatile Object state;
  
  public final void b(t0 paramt0)
  {
    a = paramt0;
  }
  
  public final void c(t<?> paramt, int paramInt) {}
  
  public final boolean e(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (i(paramObject1) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void g(Object paramObject)
  {
    b = paramObject;
  }
  
  public final h getContext()
  {
    return null;
  }
  
  public final void h(Throwable paramThrowable)
  {
    paramThrowable = c;
    int i;
    do
    {
      Object localObject = paramThrowable.get(this);
      if (localObject == g.c) {
        return;
      }
      h0 localh0 = g.d;
      do
      {
        if (paramThrowable.compareAndSet(this, localObject, localh0))
        {
          i = 1;
          break;
        }
      } while (paramThrowable.get(this) == localObject);
      i = 0;
    } while (i == 0);
  }
  
  public final int i(Object paramObject)
  {
    Object localObject1;
    int j;
    do
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater;
      int i;
      do
      {
        do
        {
          localAtomicReferenceFieldUpdater = c;
          localObject1 = localAtomicReferenceFieldUpdater.get(this);
        } while ((localObject1 instanceof k));
        if (ec.i.a(localObject1, g.c)) {
          bool = true;
        } else {
          bool = localObject1 instanceof a;
        }
        if (bool) {
          return 3;
        }
        if (ec.i.a(localObject1, g.d)) {
          return 2;
        }
        boolean bool = ec.i.a(localObject1, g.b);
        i = 0;
        j = 0;
        if (!bool) {
          break;
        }
        localObject2 = a.f(paramObject);
        do
        {
          if (localAtomicReferenceFieldUpdater.compareAndSet(this, localObject1, localObject2))
          {
            j = 1;
            break;
          }
        } while (localAtomicReferenceFieldUpdater.get(this) == localObject1);
      } while (j == 0);
      return 1;
      if (!(localObject1 instanceof List)) {
        break;
      }
      Collection localCollection = (Collection)localObject1;
      ec.i.e(localCollection, "<this>");
      Object localObject2 = new ArrayList(localCollection.size() + 1);
      ((ArrayList)localObject2).addAll(localCollection);
      ((ArrayList)localObject2).add(paramObject);
      do
      {
        if (localAtomicReferenceFieldUpdater.compareAndSet(this, localObject1, localObject2))
        {
          j = 1;
          break;
        }
      } while (localAtomicReferenceFieldUpdater.get(this) == localObject1);
      j = i;
    } while (j == 0);
    return 1;
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Unexpected state: ");
    ((StringBuilder)paramObject).append(localObject1);
    throw new IllegalStateException(((StringBuilder)paramObject).toString().toString());
  }
  
  public final class a {}
}

/* Location:
 * Qualified Name:     uc.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */