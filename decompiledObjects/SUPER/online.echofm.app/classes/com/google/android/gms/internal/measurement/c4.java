package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class c4
  extends l3
  implements f4, S4, RandomAccess
{
  public static final c4 r = new c4(new int[0], 0, false);
  public int[] p;
  public int q;
  
  public c4(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    p = paramArrayOfInt;
    q = paramInt;
  }
  
  public static c4 f()
  {
    return r;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    a();
    a4.e(paramCollection);
    if (!(paramCollection instanceof c4)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (c4)paramCollection;
    int i = q;
    if (i == 0) {
      return false;
    }
    int j = q;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      int[] arrayOfInt = p;
      if (i > arrayOfInt.length) {
        p = Arrays.copyOf(arrayOfInt, i);
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
  
  public final int d(int paramInt)
  {
    k(paramInt);
    return p[paramInt];
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c4)) {
      return super.equals(paramObject);
    }
    paramObject = (c4)paramObject;
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
  
  public final void g(int paramInt)
  {
    a();
    int i = q;
    int[] arrayOfInt1 = p;
    if (i == arrayOfInt1.length)
    {
      arrayOfInt2 = new int[i * 3 / 2 + 1];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i);
      p = arrayOfInt2;
    }
    int[] arrayOfInt2 = p;
    i = q;
    q = (i + 1);
    arrayOfInt2[i] = paramInt;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < q; j++) {
      i = i * 31 + p[j];
    }
    return i;
  }
  
  public final String i(int paramInt)
  {
    int i = q;
    StringBuilder localStringBuilder = new StringBuilder("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Integer)) {
      return -1;
    }
    int i = ((Integer)paramObject).intValue();
    int j = size();
    for (int k = 0; k < j; k++) {
      if (p[k] == i) {
        return k;
      }
    }
    return -1;
  }
  
  public final void k(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < q)) {
      return;
    }
    throw new IndexOutOfBoundsException(i(paramInt));
  }
  
  public final f4 r(int paramInt)
  {
    if (paramInt >= q) {
      return new c4(Arrays.copyOf(p, paramInt), q, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    a();
    if (paramInt2 >= paramInt1)
    {
      int[] arrayOfInt = p;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, q - paramInt2);
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
 * Qualified Name:     com.google.android.gms.internal.measurement.c4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */