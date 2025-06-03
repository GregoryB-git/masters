package u6;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.b;

public final class s
{
  public static final a e = new a(null);
  public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");
  public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");
  public static final F h = new F("REMOVE_FROZEN");
  private volatile Object _next;
  private volatile long _state;
  public final int a;
  public final boolean b;
  public final int c;
  public final AtomicReferenceArray d;
  
  public s(int paramInt, boolean paramBoolean)
  {
    a = paramInt;
    b = paramBoolean;
    int i = paramInt - 1;
    c = i;
    d = new AtomicReferenceArray(paramInt);
    if (i <= 1073741823)
    {
      if ((paramInt & i) == 0) {
        return;
      }
      throw new IllegalStateException("Check failed.".toString());
    }
    throw new IllegalStateException("Check failed.".toString());
  }
  
  public final int a(Object paramObject)
  {
    Object localObject = g;
    long l;
    int j;
    int k;
    do
    {
      int i;
      do
      {
        l = ((AtomicLongFieldUpdater)localObject).get(this);
        if ((0x3000000000000000 & l) != 0L) {
          return e.a(l);
        }
        i = (int)(0x3FFFFFFF & l);
        j = (int)((0xFFFFFFFC0000000 & l) >> 30);
        k = c;
        if ((j + 2 & k) == (i & k)) {
          return 1;
        }
        if ((b) || (d.get(j & k) == null)) {
          break;
        }
        k = a;
      } while ((k >= 1024) && ((j - i & 0x3FFFFFFF) <= k >> 1));
      return 1;
    } while (!g.compareAndSet(this, l, e.c(l, j + 1 & 0x3FFFFFFF)));
    d.set(j & k, paramObject);
    localObject = this;
    s locals;
    do
    {
      if ((g.get(localObject) & 0x1000000000000000) == 0L) {
        break;
      }
      locals = ((s)localObject).i().e(j, paramObject);
      localObject = locals;
    } while (locals != null);
    return 0;
  }
  
  public final s b(long paramLong)
  {
    s locals = new s(a * 2, b);
    int i = (int)(0x3FFFFFFF & paramLong);
    int j = (int)((0xFFFFFFFC0000000 & paramLong) >> 30);
    for (;;)
    {
      int k = c;
      if ((i & k) == (j & k)) {
        break;
      }
      Object localObject1 = d.get(k & i);
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new b(i);
      }
      d.set(c & i, localObject2);
      i++;
    }
    g.set(locals, e.d(paramLong, 1152921504606846976L));
    return locals;
  }
  
  public final s c(long paramLong)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = f;
    for (;;)
    {
      s locals = (s)localAtomicReferenceFieldUpdater.get(this);
      if (locals != null) {
        return locals;
      }
      b.a(f, this, null, b(paramLong));
    }
  }
  
  public final boolean d()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = g;
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
  
  public final s e(int paramInt, Object paramObject)
  {
    Object localObject = d.get(c & paramInt);
    if (((localObject instanceof b)) && (a == paramInt))
    {
      d.set(paramInt & c, paramObject);
      return this;
    }
    return null;
  }
  
  public final int f()
  {
    long l = g.get(this);
    int i = (int)(0x3FFFFFFF & l);
    return (int)((l & 0xFFFFFFFC0000000) >> 30) - i & 0x3FFFFFFF;
  }
  
  public final boolean g()
  {
    long l = g.get(this);
    boolean bool;
    if ((int)(0x3FFFFFFF & l) == (int)((l & 0xFFFFFFFC0000000) >> 30)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final long h()
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = g;
    long l1;
    long l2;
    do
    {
      l1 = localAtomicLongFieldUpdater.get(this);
      if ((l1 & 0x1000000000000000) != 0L) {
        return l1;
      }
      l2 = l1 | 0x1000000000000000;
    } while (!localAtomicLongFieldUpdater.compareAndSet(this, l1, l2));
    return l2;
  }
  
  public final s i()
  {
    return c(h());
  }
  
  public final Object j()
  {
    Object localObject1 = g;
    int i;
    int k;
    Object localObject2;
    do
    {
      long l;
      do
      {
        l = ((AtomicLongFieldUpdater)localObject1).get(this);
        if ((0x1000000000000000 & l) != 0L) {
          return h;
        }
        i = (int)(0x3FFFFFFF & l);
        int j = (int)((0xFFFFFFFC0000000 & l) >> 30);
        k = c;
        if ((j & k) == (i & k)) {
          return null;
        }
        localObject2 = d.get(k & i);
        if (localObject2 != null) {
          break;
        }
      } while (!b);
      return null;
      if ((localObject2 instanceof b)) {
        return null;
      }
      k = i + 1 & 0x3FFFFFFF;
      if (g.compareAndSet(this, l, e.b(l, k)))
      {
        d.set(c & i, null);
        return localObject2;
      }
    } while (!b);
    localObject1 = this;
    s locals;
    do
    {
      locals = ((s)localObject1).k(i, k);
      localObject1 = locals;
    } while (locals != null);
    return localObject2;
  }
  
  public final s k(int paramInt1, int paramInt2)
  {
    AtomicLongFieldUpdater localAtomicLongFieldUpdater = g;
    long l;
    do
    {
      l = localAtomicLongFieldUpdater.get(this);
      paramInt1 = (int)(0x3FFFFFFF & l);
      if ((0x1000000000000000 & l) != 0L) {
        return i();
      }
    } while (!g.compareAndSet(this, l, e.b(l, paramInt2)));
    d.set(c & paramInt1, null);
    return null;
  }
  
  public static final class a
  {
    public final int a(long paramLong)
    {
      int i;
      if ((paramLong & 0x2000000000000000) != 0L) {
        i = 2;
      } else {
        i = 1;
      }
      return i;
    }
    
    public final long b(long paramLong, int paramInt)
    {
      return d(paramLong, 1073741823L) | paramInt;
    }
    
    public final long c(long paramLong, int paramInt)
    {
      return d(paramLong, 1152921503533105152L) | paramInt << 30;
    }
    
    public final long d(long paramLong1, long paramLong2)
    {
      return paramLong1 & paramLong2;
    }
  }
  
  public static final class b
  {
    public final int a;
    
    public b(int paramInt)
    {
      a = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     u6.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */