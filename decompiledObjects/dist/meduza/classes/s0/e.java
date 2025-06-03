package s0;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class e
  extends c<Boolean>
  implements RandomAccess, x0
{
  public boolean[] b;
  public int c;
  
  static
  {
    e00a = false;
  }
  
  public e()
  {
    this(new boolean[10], 0);
  }
  
  public e(boolean[] paramArrayOfBoolean, int paramInt)
  {
    b = paramArrayOfBoolean;
    c = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    boolean bool = ((Boolean)paramObject).booleanValue();
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
          boolean[] arrayOfBoolean = new boolean[j.d(i, 3, 2, 1)];
          System.arraycopy(paramObject, 0, arrayOfBoolean, 0, paramInt);
          System.arraycopy(b, paramInt, arrayOfBoolean, paramInt + 1, c - paramInt);
          b = arrayOfBoolean;
        }
        b[paramInt] = bool;
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
    h(((Boolean)paramObject).booleanValue());
    return true;
  }
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection)
  {
    a();
    Object localObject = x.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof e)) {
      return super.addAll(paramCollection);
    }
    localObject = (e)paramCollection;
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
      return new e(Arrays.copyOf(b, paramInt), c);
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return super.equals(paramObject);
    }
    paramObject = (e)paramObject;
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
    return Boolean.valueOf(b[paramInt]);
  }
  
  public final void h(boolean paramBoolean)
  {
    a();
    int i = c;
    boolean[] arrayOfBoolean1 = b;
    if (i == arrayOfBoolean1.length)
    {
      arrayOfBoolean2 = new boolean[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfBoolean1, 0, arrayOfBoolean2, 0, i);
      b = arrayOfBoolean2;
    }
    boolean[] arrayOfBoolean2 = b;
    i = c;
    c = (i + 1);
    arrayOfBoolean2[i] = paramBoolean;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < c; j++) {
      i = i * 31 + x.a(b[j]);
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
    boolean[] arrayOfBoolean = b;
    int i = arrayOfBoolean[paramInt];
    int j = c;
    if (paramInt < j - 1) {
      System.arraycopy(arrayOfBoolean, paramInt + 1, arrayOfBoolean, paramInt, j - paramInt - 1);
    }
    c -= 1;
    modCount += 1;
    return Boolean.valueOf(i);
  }
  
  public final boolean remove(Object paramObject)
  {
    a();
    for (int i = 0; i < c; i++) {
      if (paramObject.equals(Boolean.valueOf(b[i])))
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
      boolean[] arrayOfBoolean = b;
      System.arraycopy(arrayOfBoolean, paramInt2, arrayOfBoolean, paramInt1, c - paramInt2);
      c -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    boolean bool = ((Boolean)paramObject).booleanValue();
    a();
    i(paramInt);
    paramObject = b;
    int i = paramObject[paramInt];
    paramObject[paramInt] = bool;
    return Boolean.valueOf(i);
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     s0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */