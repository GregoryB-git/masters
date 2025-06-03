package s0;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class l
  extends c<Double>
  implements RandomAccess, x0
{
  public double[] b;
  public int c;
  
  static
  {
    l00a = false;
  }
  
  public l()
  {
    this(new double[10], 0);
  }
  
  public l(double[] paramArrayOfDouble, int paramInt)
  {
    b = paramArrayOfDouble;
    c = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    double d = ((Double)paramObject).doubleValue();
    a();
    if (paramInt >= 0)
    {
      int i = c;
      if (paramInt <= i)
      {
        double[] arrayOfDouble = b;
        if (i < arrayOfDouble.length)
        {
          System.arraycopy(arrayOfDouble, paramInt, arrayOfDouble, paramInt + 1, i - paramInt);
        }
        else
        {
          paramObject = new double[j.d(i, 3, 2, 1)];
          System.arraycopy(arrayOfDouble, 0, paramObject, 0, paramInt);
          System.arraycopy(b, paramInt, paramObject, paramInt + 1, c - paramInt);
          b = ((double[])paramObject);
        }
        b[paramInt] = d;
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
    h(((Double)paramObject).doubleValue());
    return true;
  }
  
  public final boolean addAll(Collection<? extends Double> paramCollection)
  {
    a();
    Object localObject = x.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof l)) {
      return super.addAll(paramCollection);
    }
    localObject = (l)paramCollection;
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
      return new l(Arrays.copyOf(b, paramInt), c);
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof l)) {
      return super.equals(paramObject);
    }
    paramObject = (l)paramObject;
    if (c != c) {
      return false;
    }
    paramObject = b;
    for (int i = 0; i < c; i++) {
      if (Double.doubleToLongBits(b[i]) != Double.doubleToLongBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final Object get(int paramInt)
  {
    i(paramInt);
    return Double.valueOf(b[paramInt]);
  }
  
  public final void h(double paramDouble)
  {
    a();
    int i = c;
    double[] arrayOfDouble1 = b;
    if (i == arrayOfDouble1.length)
    {
      double[] arrayOfDouble2 = new double[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfDouble1, 0, arrayOfDouble2, 0, i);
      b = arrayOfDouble2;
    }
    arrayOfDouble1 = b;
    i = c;
    c = (i + 1);
    arrayOfDouble1[i] = paramDouble;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < c; j++) {
      i = i * 31 + x.b(Double.doubleToLongBits(b[j]));
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
    double[] arrayOfDouble = b;
    double d = arrayOfDouble[paramInt];
    int i = c;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfDouble, paramInt + 1, arrayOfDouble, paramInt, i - paramInt - 1);
    }
    c -= 1;
    modCount += 1;
    return Double.valueOf(d);
  }
  
  public final boolean remove(Object paramObject)
  {
    a();
    for (int i = 0; i < c; i++) {
      if (paramObject.equals(Double.valueOf(b[i])))
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
      double[] arrayOfDouble = b;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, c - paramInt2);
      c -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    double d1 = ((Double)paramObject).doubleValue();
    a();
    i(paramInt);
    paramObject = b;
    double d2 = paramObject[paramInt];
    paramObject[paramInt] = d1;
    return Double.valueOf(d2);
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     s0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */