package vc;

import d2.h0;
import dc.q;
import ec.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.g0;
import nc.i2;
import nc.k;
import p2.m0;
import sc.t;

public final class d
  extends i
  implements a
{
  public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
  private volatile Object owner;
  
  public d(boolean paramBoolean)
  {
    super(paramBoolean);
    h0 localh0;
    if (paramBoolean) {
      localh0 = null;
    } else {
      localh0 = b.a0.j0;
    }
    owner = localh0;
    new b(this);
  }
  
  public final void a(Object paramObject)
  {
    while (e())
    {
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = h;
      Object localObject1 = localAtomicReferenceFieldUpdater.get(this);
      Object localObject2 = b.a0.j0;
      if (localObject1 != localObject2)
      {
        int i = 0;
        int j;
        if ((localObject1 != paramObject) && (paramObject != null)) {
          j = 0;
        } else {
          j = 1;
        }
        if (j != 0)
        {
          do
          {
            if (localAtomicReferenceFieldUpdater.compareAndSet(this, localObject1, localObject2))
            {
              j = 1;
              break;
            }
          } while (localAtomicReferenceFieldUpdater.get(this) == localObject1);
          j = i;
          if (j != 0) {
            d();
          }
        }
        else
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("This mutex is locked by ");
          ((StringBuilder)localObject2).append(localObject1);
          ((StringBuilder)localObject2).append(", but ");
          ((StringBuilder)localObject2).append(paramObject);
          ((StringBuilder)localObject2).append(" is expected");
          throw new IllegalStateException(((StringBuilder)localObject2).toString().toString());
        }
      }
    }
    throw new IllegalStateException("This mutex is not locked".toString());
  }
  
  public final Object b(wb.c paramc)
  {
    Object localObject1;
    int j;
    do
    {
      for (;;)
      {
        localObject1 = i.g;
        i = ((AtomicIntegerFieldUpdater)localObject1).get(this);
        if (i <= a) {
          break;
        }
        do
        {
          localObject1 = i.g;
          i = ((AtomicIntegerFieldUpdater)localObject1).get(this);
          j = a;
          if (i <= j) {
            break;
          }
        } while (!((AtomicIntegerFieldUpdater)localObject1).compareAndSet(this, i, j));
      }
      j = 0;
      if (i <= 0)
      {
        i = 0;
        break;
      }
    } while (!((AtomicIntegerFieldUpdater)localObject1).compareAndSet(this, i, i - 1));
    int i = 1;
    if (i != 0)
    {
      h.set(this, null);
      i = 0;
    }
    else
    {
      i = 1;
    }
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
      }
    }
    else {
      j = 1;
    }
    if (j == 0) {
      paramc = b.a0.u(m0.P(paramc));
    }
    try
    {
      localObject1 = new vc/d$a;
      ((a)localObject1).<init>(this, paramc);
      c((a)localObject1);
      paramc = paramc.s();
      localObject1 = vb.a.a;
      if (paramc != localObject1) {
        paramc = rb.h.a;
      }
      if (paramc != localObject1) {
        paramc = rb.h.a;
      }
      return paramc;
    }
    finally
    {
      paramc.A();
    }
  }
  
  public final boolean e()
  {
    int i = i.g.get(this);
    boolean bool = false;
    if (Math.max(i, 0) == 0) {
      bool = true;
    }
    return bool;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Mutex@");
    localStringBuilder.append(g0.b(this));
    localStringBuilder.append("[isLocked=");
    localStringBuilder.append(e());
    localStringBuilder.append(",owner=");
    localStringBuilder.append(h.get(this));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public final class a
    implements k<rb.h>, i2
  {
    public final nc.l<rb.h> a;
    public final Object b;
    
    public a(nc.l paraml)
    {
      a = paraml;
      b = null;
    }
    
    public final void b(Object paramObject, dc.l paraml)
    {
      paramObject = (rb.h)paramObject;
      paraml = d.this;
      d.h.set(paraml, b);
      a.b(paramObject, new b(d.this, this));
    }
    
    public final void c(t<?> paramt, int paramInt)
    {
      a.c(paramt, paramInt);
    }
    
    public final boolean cancel(Throwable paramThrowable)
    {
      return a.cancel(paramThrowable);
    }
    
    public final h0 e(Throwable paramThrowable)
    {
      return a.e(paramThrowable);
    }
    
    public final ub.h getContext()
    {
      return a.e;
    }
    
    public final void h(nc.a0 parama0, rb.h paramh)
    {
      a.h(parama0, paramh);
    }
    
    public final h0 j(Object paramObject, dc.l paraml)
    {
      paraml = (rb.h)paramObject;
      paramObject = d.this;
      paraml = a.D(paraml, new c((d)paramObject, this));
      if (paraml != null)
      {
        paramObject = d.this;
        d.h.set(paramObject, b);
      }
      return paraml;
    }
    
    public final void n(Object paramObject)
    {
      a.n(paramObject);
    }
    
    public final void resumeWith(Object paramObject)
    {
      a.resumeWith(paramObject);
    }
  }
  
  public static final class b
    extends j
    implements q<uc.f<?>, Object, Object, dc.l<? super Throwable, ? extends rb.h>>
  {
    public b(d paramd)
    {
      super();
    }
    
    public final Object f(qc.f paramf, Object paramObject1, Object paramObject2)
    {
      paramf = (uc.f)paramf;
      return new e(a, paramObject1);
    }
  }
}

/* Location:
 * Qualified Name:     vc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */