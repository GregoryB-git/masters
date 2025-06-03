package s0;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class w
  extends c<Integer>
  implements RandomAccess, x0
{
  public int[] b;
  public int c;
  
  static
  {
    w00a = false;
  }
  
  public w()
  {
    this(new int[10], 0);
  }
  
  public w(int[] paramArrayOfInt, int paramInt)
  {
    b = paramArrayOfInt;
    c = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    int i = ((Integer)paramObject).intValue();
    a();
    if (paramInt >= 0)
    {
      int j = c;
      if (paramInt <= j)
      {
        int[] arrayOfInt = b;
        if (j < arrayOfInt.length)
        {
          System.arraycopy(arrayOfInt, paramInt, arrayOfInt, paramInt + 1, j - paramInt);
        }
        else
        {
          paramObject = new int[j.d(j, 3, 2, 1)];
          System.arraycopy(arrayOfInt, 0, paramObject, 0, paramInt);
          System.arraycopy(b, paramInt, paramObject, paramInt + 1, c - paramInt);
          b = ((int[])paramObject);
        }
        b[paramInt] = i;
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
    h(((Integer)paramObject).intValue());
    return true;
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection)
  {
    a();
    Object localObject = x.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof w)) {
      return super.addAll(paramCollection);
    }
    localObject = (w)paramCollection;
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
      return new w(Arrays.copyOf(b, paramInt), c);
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof w)) {
      return super.equals(paramObject);
    }
    paramObject = (w)paramObject;
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
    return Integer.valueOf(b[paramInt]);
  }
  
  public final void h(int paramInt)
  {
    a();
    int i = c;
    int[] arrayOfInt1 = b;
    if (i == arrayOfInt1.length)
    {
      int[] arrayOfInt2 = new int[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i);
      b = arrayOfInt2;
    }
    arrayOfInt1 = b;
    i = c;
    c = (i + 1);
    arrayOfInt1[i] = paramInt;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < c; j++) {
      i = i * 31 + b[j];
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
    int[] arrayOfInt = b;
    int i = arrayOfInt[paramInt];
    int j = c;
    if (paramInt < j - 1) {
      System.arraycopy(arrayOfInt, paramInt + 1, arrayOfInt, paramInt, j - paramInt - 1);
    }
    c -= 1;
    modCount += 1;
    return Integer.valueOf(i);
  }
  
  public final boolean remove(Object paramObject)
  {
    a();
    for (int i = 0; i < c; i++) {
      if (paramObject.equals(Integer.valueOf(b[i])))
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
      int[] arrayOfInt = b;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, c - paramInt2);
      c -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    int i = ((Integer)paramObject).intValue();
    a();
    i(paramInt);
    paramObject = b;
    int j = paramObject[paramInt];
    paramObject[paramInt] = i;
    return Integer.valueOf(j);
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     s0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */