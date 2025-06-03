package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class ahx<E>
  extends AbstractCollection<E>
  implements Serializable
{
  private static final Object[] a = new Object[0];
  
  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public int b(Object[] paramArrayOfObject, int paramInt)
  {
    aio localaio = b();
    while (localaio.hasNext())
    {
      paramArrayOfObject[paramInt] = localaio.next();
      paramInt++;
    }
    return paramInt;
  }
  
  public abstract aio<E> b();
  
  public ahw<E> c()
  {
    if (isEmpty()) {
      return ahw.a();
    }
    return ahw.b(toArray());
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public Object[] d()
  {
    return null;
  }
  
  public int e()
  {
    throw new UnsupportedOperationException();
  }
  
  public int f()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean g();
  
  @Deprecated
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    return toArray(a);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    ahf.a(paramArrayOfT);
    int i = size();
    Object localObject;
    if (paramArrayOfT.length < i)
    {
      localObject = d();
      if (localObject != null) {
        return Arrays.copyOfRange((Object[])localObject, e(), f(), paramArrayOfT.getClass());
      }
      localObject = aim.a(paramArrayOfT, i);
    }
    else
    {
      localObject = paramArrayOfT;
      if (paramArrayOfT.length > i)
      {
        paramArrayOfT[i] = null;
        localObject = paramArrayOfT;
      }
    }
    b((Object[])localObject, 0);
    return (T[])localObject;
  }
  
  public Object writeReplace()
  {
    return new ahz(toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */