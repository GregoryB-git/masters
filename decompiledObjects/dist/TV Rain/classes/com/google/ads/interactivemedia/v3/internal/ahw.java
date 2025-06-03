package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class ahw<E>
  extends ahx<E>
  implements List<E>, RandomAccess
{
  private static final air<Object> a = new ahi(aih.a, 0);
  
  public static <E> ahw<E> a()
  {
    return aih.a;
  }
  
  public static <E> ahw<E> a(E paramE)
  {
    paramE = aim.a(new Object[] { paramE });
    return a(paramE, paramE.length);
  }
  
  public static <E> ahw<E> a(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof ahx))
    {
      ahw localahw = ((ahx)paramCollection).c();
      paramCollection = localahw;
      if (localahw.g())
      {
        paramCollection = localahw.toArray();
        paramCollection = a(paramCollection, paramCollection.length);
      }
      return paramCollection;
    }
    paramCollection = aim.a(paramCollection.toArray());
    return a(paramCollection, paramCollection.length);
  }
  
  public static <E> ahw<E> a(E[] paramArrayOfE)
  {
    if (paramArrayOfE.length == 0) {
      return aih.a;
    }
    paramArrayOfE = aim.a((Object[])paramArrayOfE.clone());
    return a(paramArrayOfE, paramArrayOfE.length);
  }
  
  public static <E> ahw<E> a(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return aih.a;
    }
    return new aih(paramArrayOfObject, paramInt);
  }
  
  private final air<E> a(int paramInt)
  {
    ahf.b(paramInt, size());
    if (isEmpty()) {
      return a;
    }
    return new ahi(this, paramInt);
  }
  
  public static <E> ahw<E> b(Object[] paramArrayOfObject)
  {
    return a(paramArrayOfObject, paramArrayOfObject.length);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
    throws InvalidObjectException
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  public ahw<E> a(int paramInt1, int paramInt2)
  {
    ahf.a(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return aih.a;
    }
    return new ahy(this, paramInt1, paramInt2);
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public int b(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (int j = 0; j < i; j++) {
      paramArrayOfObject[(paramInt + j)] = get(j);
    }
    return paramInt + i;
  }
  
  public final aio<E> b()
  {
    return a(0);
  }
  
  public final ahw<E> c()
  {
    return this;
  }
  
  public boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return aim.a(this, paramObject);
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = get(k).hashCode() + j * 31;
    }
    return j;
  }
  
  public int indexOf(Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    return aim.b(this, paramObject);
  }
  
  public int lastIndexOf(Object paramObject)
  {
    if (paramObject == null) {
      return -1;
    }
    return aim.c(this, paramObject);
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  public Object writeReplace()
  {
    return new ahz(toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */