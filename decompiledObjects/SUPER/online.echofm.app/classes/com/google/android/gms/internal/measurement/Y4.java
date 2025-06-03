package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class Y4
  extends l3
  implements RandomAccess
{
  public static final Y4 r = new Y4(new Object[0], 0, false);
  public Object[] p;
  public int q;
  
  public Y4(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    p = paramArrayOfObject;
    q = paramInt;
  }
  
  public static Y4 g()
  {
    return r;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    a();
    if (paramInt >= 0)
    {
      int i = q;
      if (paramInt <= i)
      {
        Object[] arrayOfObject1 = p;
        if (i < arrayOfObject1.length)
        {
          System.arraycopy(arrayOfObject1, paramInt, arrayOfObject1, paramInt + 1, i - paramInt);
        }
        else
        {
          Object[] arrayOfObject2 = new Object[i * 3 / 2 + 1];
          System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, paramInt);
          System.arraycopy(p, paramInt, arrayOfObject2, paramInt + 1, q - paramInt);
          p = arrayOfObject2;
        }
        p[paramInt] = paramObject;
        q += 1;
        modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(d(paramInt));
  }
  
  public final boolean add(Object paramObject)
  {
    a();
    int i = q;
    Object[] arrayOfObject = p;
    if (i == arrayOfObject.length) {
      p = Arrays.copyOf(arrayOfObject, i * 3 / 2 + 1);
    }
    arrayOfObject = p;
    i = q;
    q = (i + 1);
    arrayOfObject[i] = paramObject;
    modCount += 1;
    return true;
  }
  
  public final String d(int paramInt)
  {
    int i = q;
    StringBuilder localStringBuilder = new StringBuilder("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final void f(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < q)) {
      return;
    }
    throw new IndexOutOfBoundsException(d(paramInt));
  }
  
  public final Object get(int paramInt)
  {
    f(paramInt);
    return p[paramInt];
  }
  
  public final Object remove(int paramInt)
  {
    a();
    f(paramInt);
    Object[] arrayOfObject = p;
    Object localObject = arrayOfObject[paramInt];
    int i = q;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    q -= 1;
    modCount += 1;
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    a();
    f(paramInt);
    Object[] arrayOfObject = p;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    modCount += 1;
    return localObject;
  }
  
  public final int size()
  {
    return q;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Y4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */