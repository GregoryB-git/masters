package s0;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class f0
  extends c<Long>
  implements RandomAccess, x0
{
  public long[] b;
  public int c;
  
  static
  {
    f000a = false;
  }
  
  public f0()
  {
    this(new long[10], 0);
  }
  
  public f0(long[] paramArrayOfLong, int paramInt)
  {
    b = paramArrayOfLong;
    c = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    long l = ((Long)paramObject).longValue();
    a();
    if (paramInt >= 0)
    {
      int i = c;
      if (paramInt <= i)
      {
        paramObject = b;
        if (i < paramObject.length)
        {
          System.arraycopy(paramObject, paramInt, paramObject, paramInt + 1, i - paramInt);
        }
        else
        {
          long[] arrayOfLong = new long[j.d(i, 3, 2, 1)];
          System.arraycopy(paramObject, 0, arrayOfLong, 0, paramInt);
          System.arraycopy(b, paramInt, arrayOfLong, paramInt + 1, c - paramInt);
          b = arrayOfLong;
        }
        b[paramInt] = l;
        c += 1;
        modCount += 1;
        return;
      }
    }
    paramObject = j.n("Index:", paramInt, ", Size:");
    ((StringBuilder)paramObject).append(c);
    throw new IndexOutOfBoundsException(((StringBuilder)paramObject).toString());
  }
  
  public final boolean add(Object paramObject)
  {
    h(((Long)paramObject).longValue());
    return true;
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection)
  {
    a();
    Object localObject = x.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof f0)) {
      return super.addAll(paramCollection);
    }
    localObject = (f0)paramCollection;
    int i = c;
    if (i == 0) {
      return false;
    }
    int j = c;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = b;
      if (i > paramCollection.length) {
        b = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(b, 0, b, c, c);
      c = i;
      modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final x.c c(int paramInt)
  {
    if (paramInt >= c) {
      return new f0(Arrays.copyOf(b, paramInt), c);
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f0)) {
      return super.equals(paramObject);
    }
    paramObject = (f0)paramObject;
    if (c != c) {
      return false;
    }
    paramObject = b;
    for (int i = 0; i < c; i++) {
      if (b[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final Object get(int paramInt)
  {
    i(paramInt);
    return Long.valueOf(b[paramInt]);
  }
  
  public final void h(long paramLong)
  {
    a();
    int i = c;
    long[] arrayOfLong1 = b;
    if (i == arrayOfLong1.length)
    {
      arrayOfLong2 = new long[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfLong1, 0, arrayOfLong2, 0, i);
      b = arrayOfLong2;
    }
    long[] arrayOfLong2 = b;
    i = c;
    c = (i + 1);
    arrayOfLong2[i] = paramLong;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < c; j++) {
      i = i * 31 + x.b(b[j]);
    }
    return i;
  }
  
  public final void i(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < c)) {
      return;
    }
    StringBuilder localStringBuilder = j.n("Index:", paramInt, ", Size:");
    localStringBuilder.append(c);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final Object remove(int paramInt)
  {
    a();
    i(paramInt);
    long[] arrayOfLong = b;
    long l = arrayOfLong[paramInt];
    int i = c;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfLong, paramInt + 1, arrayOfLong, paramInt, i - paramInt - 1);
    }
    c -= 1;
    modCount += 1;
    return Long.valueOf(l);
  }
  
  public final boolean remove(Object paramObject)
  {
    a();
    for (int i = 0; i < c; i++) {
      if (paramObject.equals(Long.valueOf(b[i])))
      {
        paramObject = b;
        System.arraycopy(paramObject, i + 1, paramObject, i, c - i - 1);
        c -= 1;
        modCount += 1;
        return true;
      }
    }
    return false;
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    a();
    if (paramInt2 >= paramInt1)
    {
      long[] arrayOfLong = b;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, c - paramInt2);
      c -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    long l1 = ((Long)paramObject).longValue();
    a();
    i(paramInt);
    paramObject = b;
    long l2 = paramObject[paramInt];
    paramObject[paramInt] = l1;
    return Long.valueOf(l2);
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     s0.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */