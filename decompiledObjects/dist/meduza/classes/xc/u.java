package xc;

import java.util.concurrent.atomic.AtomicReference;

public final class u
{
  public static final t a;
  public static final int b;
  public static final AtomicReference<t>[] c;
  
  static
  {
    int i = 0;
    a = new t(new byte[0], 0, 0, false, false);
    int j = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
    b = j;
    AtomicReference[] arrayOfAtomicReference = new AtomicReference[j];
    while (i < j)
    {
      arrayOfAtomicReference[i] = new AtomicReference();
      i++;
    }
    c = arrayOfAtomicReference;
  }
  
  public static final void a(t paramt)
  {
    int i;
    if ((f == null) && (g == null)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (d) {
        return;
      }
      i = (int)(Thread.currentThread().getId() & b - 1L);
      AtomicReference localAtomicReference = c[i];
      t localt1 = a;
      t localt2 = (t)localAtomicReference.getAndSet(localt1);
      if (localt2 == localt1) {
        return;
      }
      if (localt2 != null) {
        i = c;
      } else {
        i = 0;
      }
      if (i >= 65536)
      {
        localAtomicReference.set(localt2);
        return;
      }
      f = localt2;
      b = 0;
      c = (i + 8192);
      localAtomicReference.set(paramt);
      return;
    }
    throw new IllegalArgumentException("Failed requirement.".toString());
  }
  
  public static final t b()
  {
    int i = (int)(Thread.currentThread().getId() & b - 1L);
    AtomicReference localAtomicReference = c[i];
    t localt1 = a;
    t localt2 = (t)localAtomicReference.getAndSet(localt1);
    if (localt2 == localt1) {
      return new t();
    }
    if (localt2 == null)
    {
      localAtomicReference.set(null);
      return new t();
    }
    localAtomicReference.set(f);
    f = null;
    c = 0;
    return localt2;
  }
}

/* Location:
 * Qualified Name:     xc.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */