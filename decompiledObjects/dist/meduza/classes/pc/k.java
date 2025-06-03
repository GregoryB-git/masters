package pc;

import d2.h0;
import dc.l;
import ec.i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nc.i2;
import p2.m0;
import sc.t;
import ub.h;

public final class k<E>
  extends t<k<E>>
{
  public final b<E> e;
  public final AtomicReferenceArray f;
  
  public k(long paramLong, k<E> paramk, b<E> paramb, int paramInt)
  {
    super(paramLong, paramk, paramInt);
    e = paramb;
    f = new AtomicReferenceArray(e.b * 2);
  }
  
  public final int f()
  {
    return e.b;
  }
  
  public final void g(int paramInt, h paramh)
  {
    int i = e.b;
    int j;
    if (paramInt >= i) {
      j = 1;
    } else {
      j = 0;
    }
    int k = paramInt;
    if (j != 0) {
      k = paramInt - i;
    }
    Object localObject1 = f.get(k * 2);
    Object localObject2;
    Object localObject3;
    label219:
    do
    {
      do
      {
        localObject2 = k(k);
        if (((localObject2 instanceof i2)) || ((localObject2 instanceof u))) {
          break label219;
        }
        if ((localObject2 == e.j) || (localObject2 == e.k)) {
          break;
        }
      } while ((localObject2 == e.g) || (localObject2 == e.f));
      if ((localObject2 != e.i) && (localObject2 != e.d))
      {
        if (localObject2 == e.l) {
          return;
        }
        paramh = new StringBuilder();
        paramh.append("unexpected state: ");
        paramh.append(localObject2);
        throw new IllegalStateException(paramh.toString().toString());
      }
      return;
      n(k, null);
      if (j != 0)
      {
        localObject3 = e;
        i.b(localObject3);
        localObject3 = b;
        if (localObject3 != null) {
          m0.j((l)localObject3, localObject1, paramh);
        }
      }
      return;
      if (j != 0) {
        localObject3 = e.j;
      } else {
        localObject3 = e.k;
      }
    } while (!j(k, localObject2, localObject3));
    n(k, null);
    l(k, j ^ 0x1);
    if (j != 0)
    {
      localObject3 = e;
      i.b(localObject3);
      localObject3 = b;
      if (localObject3 != null) {
        m0.j((l)localObject3, localObject1, paramh);
      }
    }
  }
  
  public final boolean j(int paramInt, Object paramObject1, Object paramObject2)
  {
    AtomicReferenceArray localAtomicReferenceArray = f;
    boolean bool = true;
    paramInt = paramInt * 2 + 1;
    while (!localAtomicReferenceArray.compareAndSet(paramInt, paramObject1, paramObject2)) {
      if (localAtomicReferenceArray.get(paramInt) != paramObject1) {
        bool = false;
      }
    }
    return bool;
  }
  
  public final Object k(int paramInt)
  {
    return f.get(paramInt * 2 + 1);
  }
  
  public final void l(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b localb = e;
      i.b(localb);
      localb.K(c * e.b + paramInt);
    }
    h();
  }
  
  public final E m(int paramInt)
  {
    Object localObject = f.get(paramInt * 2);
    n(paramInt, null);
    return (E)localObject;
  }
  
  public final void n(int paramInt, Object paramObject)
  {
    f.lazySet(paramInt * 2, paramObject);
  }
  
  public final void o(int paramInt, h0 paramh0)
  {
    f.set(paramInt * 2 + 1, paramh0);
  }
}

/* Location:
 * Qualified Name:     pc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */