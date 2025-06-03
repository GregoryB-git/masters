package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class s
  extends c
  implements t.d, RandomAccess, U
{
  public static final s r;
  public int[] p;
  public int q;
  
  static
  {
    s locals = new s(new int[0], 0);
    r = locals;
    locals.j();
  }
  
  public s(int[] paramArrayOfInt, int paramInt)
  {
    p = paramArrayOfInt;
    q = paramInt;
  }
  
  public static s i()
  {
    return r;
  }
  
  public Integer D(int paramInt)
  {
    a();
    k(paramInt);
    int[] arrayOfInt = p;
    int i = arrayOfInt[paramInt];
    int j = q;
    if (paramInt < j - 1) {
      System.arraycopy(arrayOfInt, paramInt + 1, arrayOfInt, paramInt, j - paramInt - 1);
    }
    q -= 1;
    modCount += 1;
    return Integer.valueOf(i);
  }
  
  public int F(int paramInt)
  {
    k(paramInt);
    return p[paramInt];
  }
  
  public Integer M(int paramInt, Integer paramInteger)
  {
    return Integer.valueOf(S(paramInt, paramInteger.intValue()));
  }
  
  public int S(int paramInt1, int paramInt2)
  {
    a();
    k(paramInt1);
    int[] arrayOfInt = p;
    int i = arrayOfInt[paramInt1];
    arrayOfInt[paramInt1] = paramInt2;
    return i;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    a();
    t.a(paramCollection);
    if (!(paramCollection instanceof s)) {
      return super.addAll(paramCollection);
    }
    s locals = (s)paramCollection;
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
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d(int paramInt, Integer paramInteger)
  {
    g(paramInt, paramInteger.intValue());
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof s)) {
      return super.equals(paramObject);
    }
    paramObject = (s)paramObject;
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
  
  public boolean f(Integer paramInteger)
  {
    z(paramInteger.intValue());
    return true;
  }
  
  public final void g(int paramInt1, int paramInt2)
  {
    a();
    if (paramInt1 >= 0)
    {
      int i = q;
      if (paramInt1 <= i)
      {
        int[] arrayOfInt1 = p;
        if (i < arrayOfInt1.length)
        {
          System.arraycopy(arrayOfInt1, paramInt1, arrayOfInt1, paramInt1 + 1, i - paramInt1);
        }
        else
        {
          int[] arrayOfInt2 = new int[i * 3 / 2 + 1];
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, paramInt1);
          System.arraycopy(p, paramInt1, arrayOfInt2, paramInt1 + 1, q - paramInt1);
          p = arrayOfInt2;
        }
        p[paramInt1] = paramInt2;
        q += 1;
        modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(s(paramInt1));
  }
  
  public t.d h(int paramInt)
  {
    if (paramInt >= q) {
      return new s(Arrays.copyOf(p, paramInt), q);
    }
    throw new IllegalArgumentException();
  }
  
  public int hashCode()
  {
    int i = 1;
    for (int j = 0; j < q; j++) {
      i = i * 31 + p[j];
    }
    return i;
  }
  
  public int indexOf(Object paramObject)
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
    throw new IndexOutOfBoundsException(s(paramInt));
  }
  
  public Integer q(int paramInt)
  {
    return Integer.valueOf(F(paramInt));
  }
  
  public void removeRange(int paramInt1, int paramInt2)
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
  
  public final String s(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Index:");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", Size:");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public int size()
  {
    return q;
  }
  
  public void z(int paramInt)
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
}

/* Location:
 * Qualified Name:     com.google.protobuf.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */