package r6;

import X5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import p6.P0;
import u6.C;
import u6.x;

public final class i
  extends C
{
  public final b s;
  public final AtomicReferenceArray t;
  
  public i(long paramLong, i parami, b paramb, int paramInt)
  {
    super(paramLong, parami, paramInt);
    s = paramb;
    t = new AtomicReferenceArray(c.b * 2);
  }
  
  public final void A(int paramInt, Object paramObject)
  {
    t.set(paramInt * 2 + 1, paramObject);
  }
  
  public final void B(int paramInt, Object paramObject)
  {
    z(paramInt, paramObject);
  }
  
  public int n()
  {
    return c.b;
  }
  
  public void o(int paramInt, Throwable paramThrowable, g paramg)
  {
    int i = c.b;
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
    Object localObject1 = v(k);
    Object localObject2;
    label204:
    do
    {
      do
      {
        localObject2 = w(k);
        if (((localObject2 instanceof P0)) || ((localObject2 instanceof o))) {
          break label204;
        }
        if ((localObject2 == c.j()) || (localObject2 == c.i())) {
          break;
        }
      } while ((localObject2 == c.p()) || (localObject2 == c.q()));
      if ((localObject2 != c.f()) && (localObject2 != c.d))
      {
        if (localObject2 == c.z()) {
          return;
        }
        paramThrowable = new StringBuilder();
        paramThrowable.append("unexpected state: ");
        paramThrowable.append(localObject2);
        throw new IllegalStateException(paramThrowable.toString().toString());
      }
      return;
      s(k);
      if (j != 0)
      {
        paramThrowable = uc;
        if (paramThrowable != null) {
          x.b(paramThrowable, localObject1, paramg);
        }
      }
      return;
      if (j != 0) {
        paramThrowable = c.j();
      } else {
        paramThrowable = c.i();
      }
    } while (!r(k, localObject2, paramThrowable));
    s(k);
    x(k, j ^ 0x1);
    if (j != 0)
    {
      paramThrowable = uc;
      if (paramThrowable != null) {
        x.b(paramThrowable, localObject1, paramg);
      }
    }
  }
  
  public final boolean r(int paramInt, Object paramObject1, Object paramObject2)
  {
    return h.a(t, paramInt * 2 + 1, paramObject1, paramObject2);
  }
  
  public final void s(int paramInt)
  {
    z(paramInt, null);
  }
  
  public final Object t(int paramInt, Object paramObject)
  {
    return t.getAndSet(paramInt * 2 + 1, paramObject);
  }
  
  public final b u()
  {
    b localb = s;
    Intrinsics.b(localb);
    return localb;
  }
  
  public final Object v(int paramInt)
  {
    return t.get(paramInt * 2);
  }
  
  public final Object w(int paramInt)
  {
    return t.get(paramInt * 2 + 1);
  }
  
  public final void x(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      u().x0(q * c.b + paramInt);
    }
    p();
  }
  
  public final Object y(int paramInt)
  {
    Object localObject = v(paramInt);
    s(paramInt);
    return localObject;
  }
  
  public final void z(int paramInt, Object paramObject)
  {
    t.lazySet(paramInt * 2, paramObject);
  }
}

/* Location:
 * Qualified Name:     r6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */