package r6;

import V5.t;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.v;
import p6.P0;
import u6.C;
import u6.F;
import u6.e;
import u6.x;

public class l
  extends b
{
  public final int n;
  public final a o;
  
  public l(int paramInt, a parama, g6.l paraml)
  {
    super(paramInt, paraml);
    n = paramInt;
    o = parama;
    if (parama != a.o)
    {
      if (paramInt >= 1) {
        return;
      }
      parama = new StringBuilder();
      parama.append("Buffered channel capacity must be at least 1, but ");
      parama.append(paramInt);
      parama.append(" was specified");
      throw new IllegalArgumentException(parama.toString().toString());
    }
    parama = new StringBuilder();
    parama.append("This implementation does not support suspension for senders, use ");
    parama.append(v.b(b.class).a());
    parama.append(" instead");
    throw new IllegalArgumentException(parama.toString().toString());
  }
  
  public final Object A0(Object paramObject, boolean paramBoolean)
  {
    if (o == a.q) {
      paramObject = y0(paramObject, paramBoolean);
    } else {
      paramObject = z0(paramObject);
    }
    return paramObject;
  }
  
  public boolean T()
  {
    boolean bool;
    if (o == a.p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object d(Object paramObject)
  {
    return A0(paramObject, false);
  }
  
  public final Object y0(Object paramObject, boolean paramBoolean)
  {
    Object localObject = super.d(paramObject);
    if ((!g.f(localObject)) && (!g.e(localObject)))
    {
      if (paramBoolean)
      {
        localObject = c;
        if (localObject != null)
        {
          paramObject = x.d((g6.l)localObject, paramObject, null, 2, null);
          if (paramObject != null) {
            throw ((Throwable)paramObject);
          }
        }
      }
      return g.a.c(t.a);
    }
    return localObject;
  }
  
  public final Object z0(Object paramObject)
  {
    F localF = c.d;
    Object localObject = (i)b.j().get(this);
    long l2;
    boolean bool;
    int i;
    int j;
    for (;;)
    {
      long l1 = b.k().getAndIncrement(this);
      l2 = l1 & 0xFFFFFFFFFFFFFFF;
      bool = b.l(this, l1);
      i = c.b;
      l1 = l2 / i;
      j = (int)(l2 % i);
      if (q != l1)
      {
        i locali = b.f(this, l1, (i)localObject);
        if (locali == null)
        {
          if (!bool) {
            continue;
          }
          return g.a.a(H());
        }
        localObject = locali;
      }
      int k = b.q(this, (i)localObject, j, paramObject, l2, localF, bool);
      if (k == 0) {
        break label291;
      }
      if (k == 1) {
        break label281;
      }
      if (k == 2) {
        break label206;
      }
      if (k == 3) {
        break label193;
      }
      if (k == 4) {
        break;
      }
      if (k == 5) {
        ((e)localObject).b();
      }
    }
    if (l2 < G()) {
      ((e)localObject).b();
    }
    return g.a.a(H());
    label193:
    throw new IllegalStateException("unexpected".toString());
    label206:
    if (bool)
    {
      ((C)localObject).p();
      return g.a.a(H());
    }
    if ((localF instanceof P0)) {
      paramObject = (P0)localF;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      b.o(this, (P0)paramObject, (i)localObject, j);
    }
    y(q * i + j);
    return g.a.c(t.a);
    label281:
    return g.a.c(t.a);
    label291:
    ((e)localObject).b();
    return g.a.c(t.a);
  }
}

/* Location:
 * Qualified Name:     r6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */