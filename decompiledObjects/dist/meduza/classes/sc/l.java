package sc;

import d2.h0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class l<E>
{
  public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");
  public static final AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(l.class, "_state");
  public static final h0 g = new h0("REMOVE_FROZEN", 9);
  private volatile Object _next;
  private volatile long _state;
  public final int a;
  public final boolean b;
  public final int c;
  public final AtomicReferenceArray d;
  
  public l(int paramInt, boolean paramBoolean)
  {
    a = paramInt;
    b = paramBoolean;
    int i = paramInt - 1;
    c = i;
    d = new AtomicReferenceArray(paramInt);
    int j = 0;
    int k;
    if (i <= 1073741823) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      k = j;
      if ((paramInt & i) == 0) {
        k = 1;
      }
      if (k != 0) {
        return;
      }
      throw new IllegalStateException("Check failed.".toString());
    }
    throw new IllegalStateException("Check failed.".toString());
  }
  
  public final int a(E paramE)
  {
    Object localObject1 = f;
    long l;
    int i;
    int k;
    do
    {
      int j;
      do
      {
        l = ((AtomicLongFieldUpdater)localObject1).get(this);
        i = 1;
        if ((0x3000000000000000 & l) != 0L)
        {
          if ((l & 0x2000000000000000) != 0L) {
            i = 2;
          }
          return i;
        }
        j = (int)((0x3FFFFFFF & l) >> 0);
        i = (int)((0xFFFFFFFC0000000 & l) >> 30);
        k = c;
        if ((i + 2 & k) == (j & k)) {
          return 1;
        }
        if ((b) || (d.get(i & k) == null)) {
          break;
        }
        k = a;
      } while ((k >= 1024) && ((i - j & 0x3FFFFFFF) <= k >> 1));
      return 1;
    } while (!f.compareAndSet(this, l, 0xF00000003FFFFFFF & l | (i + 1 & 0x3FFFFFFF) << 30));
    d.set(i & k, paramE);
    Object localObject2 = this;
    do
    {
      if ((f.get(localObject2) & 0x1000000000000000) == 0L) {
        break;
      }
      localObject1 = ((l)localObject2).c();
      localObject2 = d.get(c & i);
      if (((localObject2 instanceof a)) && (a == i)) {
        d.set(c & i, paramE);
      } else {
        localObject1 = null;
      }
      localObject2 = localObject1;
    } while (localObject1 != null);
    return 0;
  }
  
  public final boolean b()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = f;
    long l;
    do
    {
      l = localAtomicLongFieldUpdater.get(this);
      if ((l & 0x2000000000000000) != 0L) {
        return true;
      }
      if ((0x1000000000000000 & l) != 0L) {
        return false;
      }
    } while (!localAtomicLongFieldUpdater.compareAndSet(this, l, l | 0x2000000000000000));
    return true;
  }
  
  public final l<E> c()
  {
    Object localObject1 = f;
    long l2;
    do
    {
      l1 = ((AtomicLongFieldUpdater)localObject1).get(this);
      if ((l1 & 0x1000000000000000) != 0L) {
        break;
      }
      l2 = l1 | 0x1000000000000000;
    } while (!((AtomicLongFieldUpdater)localObject1).compareAndSet(this, l1, l2));
    long l1 = l2;
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = e;
    for (;;)
    {
      localObject1 = (l)localAtomicReferenceFieldUpdater1.get(this);
      if (localObject1 != null) {
        return (l<E>)localObject1;
      }
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = e;
      l locall = new l(a * 2, b);
      int i = (int)((0x3FFFFFFF & l1) >> 0);
      int j = (int)((0xFFFFFFFC0000000 & l1) >> 30);
      for (;;)
      {
        int k = c;
        int m = i & k;
        if (m == (k & j)) {
          break;
        }
        Object localObject2 = d.get(m);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new a(i);
        }
        d.set(c & i, localObject1);
        i++;
      }
      f.set(locall, 0xEFFFFFFFFFFFFFFF & l1);
      if (!localAtomicReferenceFieldUpdater2.compareAndSet(this, null, locall)) {
        if (localAtomicReferenceFieldUpdater2.get(this) == null) {
          break;
        }
      }
    }
  }
  
  public final Object d()
  {
    Object localObject1 = f;
    long l1;
    int m;
    Object localObject2;
    Object localObject3;
    long l2;
    do
    {
      int i;
      do
      {
        l1 = ((AtomicLongFieldUpdater)localObject1).get(this);
        if ((l1 & 0x1000000000000000) != 0L) {
          return g;
        }
        i = (int)((l1 & 0x3FFFFFFF) >> 0);
        int j = (int)((0xFFFFFFFC0000000 & l1) >> 30);
        int k = c;
        m = k & i;
        if ((j & k) == m) {
          return null;
        }
        localObject2 = d.get(m);
        if (localObject2 != null) {
          break;
        }
      } while (!b);
      return null;
      if ((localObject2 instanceof a)) {
        return null;
      }
      localObject3 = f;
      l2 = (i + 1 & 0x3FFFFFFF) << 0;
      if (((AtomicLongFieldUpdater)localObject3).compareAndSet(this, l1, l1 & 0xFFFFFFFFC0000000 | l2))
      {
        d.set(c & i, null);
        return localObject2;
      }
    } while (!b);
    localObject1 = this;
    do
    {
      localObject3 = f;
      do
      {
        l1 = ((AtomicLongFieldUpdater)localObject3).get(localObject1);
        m = (int)((l1 & 0x3FFFFFFF) >> 0);
        if ((l1 & 0x1000000000000000) != 0L)
        {
          localObject3 = ((l)localObject1).c();
          break;
        }
      } while (!f.compareAndSet(localObject1, l1, l1 & 0xFFFFFFFFC0000000 | l2));
      d.set(c & m, null);
      localObject3 = null;
      localObject1 = localObject3;
    } while (localObject3 != null);
    return localObject2;
  }
  
  public static final class a
  {
    public final int a;
    
    public a(int paramInt)
    {
      a = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     sc.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */