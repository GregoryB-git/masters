package ma;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class j0
  extends c<Long>
  implements RandomAccess, c1
{
  public long[] b;
  public int c;
  
  static
  {
    new j0(new long[0], 0, false);
  }
  
  public j0()
  {
    this(new long[10], 0, true);
  }
  
  public j0(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
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
        long[] arrayOfLong = b;
        if (i < arrayOfLong.length)
        {
          System.arraycopy(arrayOfLong, paramInt, arrayOfLong, paramInt + 1, i - paramInt);
        }
        else
        {
          paramObject = new long[j.d(i, 3, 2, 1)];
          System.arraycopy(arrayOfLong, 0, paramObject, 0, paramInt);
          System.arraycopy(b, paramInt, paramObject, paramInt + 1, c - paramInt);
          b = ((long[])paramObject);
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
    Object localObject = a0.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof j0)) {
      return super.addAll(paramCollection);
    }
    localObject = (j0)paramCollection;
    int i = c;
    if (i == 0) {
      return false;
    }
    int j = c;
    if (Integer.MAX_VALUE - j >= i)
    {
      j += i;
      paramCollection = b;
      if (j > paramCollection.length) {
        b = Arrays.copyOf(paramCollection, j);
      }
      System.arraycopy(b, 0, b, c, c);
      c = j;
      modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final a0.d c(int paramInt)
  {
    if (paramInt >= c) {
      return new j0(Arrays.copyOf(b, paramInt), c, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof j0)) {
      return super.equals(paramObject);
    }
    paramObject = (j0)paramObject;
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
      i = i * 31 + a0.b(b[j]);
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
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Long)) {
      return -1;
    }
    long l = ((Long)paramObject).longValue();
    int i = c;
    for (int j = 0; j < i; j++) {
      if (b[j] == l) {
        return j;
      }
    }
    return -1;
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
 * Qualified Name:     ma.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */