package ma;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class g
  extends c<Boolean>
  implements RandomAccess, c1
{
  public boolean[] b;
  public int c;
  
  static
  {
    new g(new boolean[0], 0, false);
  }
  
  public g()
  {
    this(new boolean[10], 0, true);
  }
  
  public g(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
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
    Object localObject = a0.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof g)) {
      return super.addAll(paramCollection);
    }
    localObject = (g)paramCollection;
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
      return new g(Arrays.copyOf(b, paramInt), c, true);
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
    if (!(paramObject instanceof g)) {
      return super.equals(paramObject);
    }
    paramObject = (g)paramObject;
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
      boolean[] arrayOfBoolean2 = new boolean[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfBoolean1, 0, arrayOfBoolean2, 0, i);
      b = arrayOfBoolean2;
    }
    arrayOfBoolean1 = b;
    i = c;
    c = (i + 1);
    arrayOfBoolean1[i] = paramBoolean;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < c; j++) {
      i = i * 31 + a0.a(b[j]);
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
    if (!(paramObject instanceof Boolean)) {
      return -1;
    }
    int i = ((Boolean)paramObject).booleanValue();
    int j = c;
    for (int k = 0; k < j; k++) {
      if (b[k] == i) {
        return k;
      }
    }
    return -1;
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
 * Qualified Name:     ma.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */