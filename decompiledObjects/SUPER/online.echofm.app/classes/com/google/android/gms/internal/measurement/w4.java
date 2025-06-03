package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w4
  extends l3
  implements i4, S4, RandomAccess
{
  public static final w4 r = new w4(new long[0], 0, false);
  public long[] p;
  public int q;
  
  public w4(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    p = paramArrayOfLong;
    q = paramInt;
  }
  
  public static w4 f()
  {
    return r;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    a();
    a4.e(paramCollection);
    if (!(paramCollection instanceof w4)) {
      return super.addAll(paramCollection);
    }
    w4 localw4 = (w4)paramCollection;
    int i = q;
    if (i == 0) {
      return false;
    }
    int j = q;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = p;
      if (i > paramCollection.length) {
        p = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(p, 0, p, q, q);
      q = i;
      modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject)
  {
    return indexOf(paramObject) != -1;
  }
  
  public final void d(long paramLong)
  {
    a();
    int i = q;
    long[] arrayOfLong1 = p;
    if (i == arrayOfLong1.length)
    {
      long[] arrayOfLong2 = new long[i * 3 / 2 + 1];
      System.arraycopy(arrayOfLong1, 0, arrayOfLong2, 0, i);
      p = arrayOfLong2;
    }
    arrayOfLong1 = p;
    i = q;
    q = (i + 1);
    arrayOfLong1[i] = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof w4)) {
      return super.equals(paramObject);
    }
    paramObject = (w4)paramObject;
    if (q != q) {
      return false;
    }
    paramObject = p;
    for (int i = 0; i < q; i++) {
      if (p[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final String g(int paramInt)
  {
    int i = q;
    StringBuilder localStringBuilder = new StringBuilder("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < q; j++) {
      i = i * 31 + a4.b(p[j]);
    }
    return i;
  }
  
  public final void i(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < q)) {
      return;
    }
    throw new IndexOutOfBoundsException(g(paramInt));
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Long)) {
      return -1;
    }
    long l = ((Long)paramObject).longValue();
    int i = size();
    for (int j = 0; j < i; j++) {
      if (p[j] == l) {
        return j;
      }
    }
    return -1;
  }
  
  public final long l(int paramInt)
  {
    i(paramInt);
    return p[paramInt];
  }
  
  public final i4 r(int paramInt)
  {
    if (paramInt >= q) {
      return new w4(Arrays.copyOf(p, paramInt), q, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    a();
    if (paramInt2 >= paramInt1)
    {
      long[] arrayOfLong = p;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, q - paramInt2);
      q -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return q;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.w4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */