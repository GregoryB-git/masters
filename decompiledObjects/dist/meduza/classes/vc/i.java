package vc;

import dc.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.i2;
import p2.m0;
import sc.c;
import sc.t;

public class i
{
  public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head");
  public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx");
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail");
  public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx");
  public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits");
  private volatile int _availablePermits;
  public final int a = 1;
  public final g b;
  private volatile long deqIdx;
  private volatile long enqIdx;
  private volatile Object head;
  private volatile Object tail;
  
  public i(int paramInt)
  {
    int i;
    if ((paramInt >= 0) && (paramInt <= 1)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      k localk = new k(0L, null, 2);
      head = localk;
      tail = localk;
      _availablePermits = (1 - paramInt);
      b = new g(this);
      return;
    }
    throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
  }
  
  public final void c(d.a parama)
  {
    int i;
    label185:
    label192:
    label208:
    label353:
    do
    {
      do
      {
        i = g.getAndDecrement(this);
      } while (i > a);
      if (i > 0)
      {
        parama.b(rb.h.a, b);
        break;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = e;
      k localk = (k)localAtomicReferenceFieldUpdater.get(this);
      long l1 = f.getAndIncrement(this);
      Object localObject1 = f.a;
      long l2 = l1 / j.f;
      Object localObject2 = m0.F(localk, l2, (p)localObject1);
      if (!m0.R(localObject2))
      {
        localObject3 = m0.L(localObject2);
        for (;;)
        {
          t localt = (t)localAtomicReferenceFieldUpdater.get(this);
          if (c < c)
          {
            if (!((t)localObject3).i())
            {
              i = 0;
              break label185;
            }
            do
            {
              if (localAtomicReferenceFieldUpdater.compareAndSet(this, localt, localObject3))
              {
                i = 1;
                break;
              }
            } while (localAtomicReferenceFieldUpdater.get(this) == localt);
            i = 0;
            if (i == 0) {
              break label192;
            }
            if (localt.e()) {
              localt.d();
            }
          }
          i = 1;
          if (i == 0) {
            break;
          }
          break label208;
          if (((t)localObject3).e()) {
            ((c)localObject3).d();
          }
        }
      }
      localObject1 = (k)m0.L(localObject2);
      int j = (int)(l1 % j.f);
      Object localObject3 = e;
      do
      {
        if (((AtomicReferenceArray)localObject3).compareAndSet(j, null, parama))
        {
          i = 1;
          break;
        }
      } while (((AtomicReferenceArray)localObject3).get(j) == null);
      i = 0;
      if (i != 0)
      {
        parama.c((t)localObject1, j);
      }
      else
      {
        localObject3 = j.b;
        localObject2 = j.c;
        localObject1 = e;
        do
        {
          if (((AtomicReferenceArray)localObject1).compareAndSet(j, localObject3, localObject2))
          {
            i = 1;
            break;
          }
        } while (((AtomicReferenceArray)localObject1).get(j) == localObject3);
        i = 0;
        if (i == 0) {
          break label353;
        }
        parama.b(rb.h.a, b);
      }
      i = 1;
      continue;
      i = 0;
    } while (i == 0);
  }
  
  public final void d()
  {
    int i;
    Object localObject1;
    label170:
    label177:
    label193:
    int j;
    boolean bool;
    label423:
    label447:
    do
    {
      i = g.getAndIncrement(this);
      if (i >= a) {
        break label494;
      }
      if (i >= 0) {
        return;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = c;
      k localk = (k)localAtomicReferenceFieldUpdater.get(this);
      long l1 = d.getAndIncrement(this);
      long l2 = l1 / j.f;
      localObject1 = h.a;
      Object localObject2 = m0.F(localk, l2, (p)localObject1);
      if (!m0.R(localObject2))
      {
        localObject3 = m0.L(localObject2);
        for (;;)
        {
          t localt = (t)localAtomicReferenceFieldUpdater.get(this);
          if (c < c)
          {
            if (!((t)localObject3).i())
            {
              i = 0;
              break label170;
            }
            do
            {
              if (localAtomicReferenceFieldUpdater.compareAndSet(this, localt, localObject3))
              {
                i = 1;
                break;
              }
            } while (localAtomicReferenceFieldUpdater.get(this) == localt);
            i = 0;
            if (i == 0) {
              break label177;
            }
            if (localt.e()) {
              localt.d();
            }
          }
          i = 1;
          if (i == 0) {
            break;
          }
          break label193;
          if (((t)localObject3).e()) {
            ((c)localObject3).d();
          }
        }
      }
      localObject3 = (k)m0.L(localObject2);
      ((c)localObject3).a();
      if (c <= l2)
      {
        j = (int)(l1 % j.f);
        localObject1 = j.b;
        localObject1 = e.getAndSet(j, localObject1);
        if (localObject1 == null)
        {
          int k = j.a;
          for (i = 0; i < k; i++) {
            if (e.get(j) == j.c)
            {
              bool = true;
              break label447;
            }
          }
          localObject1 = j.b;
          localObject2 = j.d;
          localObject3 = e;
          do
          {
            if (((AtomicReferenceArray)localObject3).compareAndSet(j, localObject1, localObject2))
            {
              i = 1;
              break;
            }
          } while (((AtomicReferenceArray)localObject3).get(j) == localObject1);
          i = 0;
          bool = 0x1 ^ i;
          continue;
        }
        bool = true;
        if (localObject1 != j.e)
        {
          if (!(localObject1 instanceof nc.k)) {
            break label423;
          }
          localObject3 = (nc.k)localObject1;
          localObject1 = ((nc.k)localObject3).j(rb.h.a, b);
          if (localObject1 != null)
          {
            ((nc.k)localObject3).n(localObject1);
            continue;
          }
        }
      }
      bool = false;
      continue;
      if (!(localObject1 instanceof uc.f)) {
        break;
      }
      bool = ((uc.f)localObject1).e(this, rb.h.a);
    } while (!bool);
    return;
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("unexpected: ");
    ((StringBuilder)localObject3).append(localObject1);
    throw new IllegalStateException(((StringBuilder)localObject3).toString().toString());
    label494:
    do
    {
      localObject3 = g;
      j = ((AtomicIntegerFieldUpdater)localObject3).get(this);
      i = a;
    } while ((j > i) && (!((AtomicIntegerFieldUpdater)localObject3).compareAndSet(this, j, i)));
    localObject3 = f.l("The number of released permits cannot be greater than ");
    ((StringBuilder)localObject3).append(a);
    throw new IllegalStateException(((StringBuilder)localObject3).toString().toString());
  }
}

/* Location:
 * Qualified Name:     vc.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */