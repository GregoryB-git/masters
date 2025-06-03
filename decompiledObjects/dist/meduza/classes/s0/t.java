package s0;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class t
  extends c<Float>
  implements RandomAccess, x0
{
  public float[] b;
  public int c;
  
  static
  {
    t00a = false;
  }
  
  public t()
  {
    this(0, new float[10]);
  }
  
  public t(int paramInt, float[] paramArrayOfFloat)
  {
    b = paramArrayOfFloat;
    c = paramInt;
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    float f = ((Float)paramObject).floatValue();
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
          float[] arrayOfFloat = new float[j.d(i, 3, 2, 1)];
          System.arraycopy(paramObject, 0, arrayOfFloat, 0, paramInt);
          System.arraycopy(b, paramInt, arrayOfFloat, paramInt + 1, c - paramInt);
          b = arrayOfFloat;
        }
        b[paramInt] = f;
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
    h(((Float)paramObject).floatValue());
    return true;
  }
  
  public final boolean addAll(Collection<? extends Float> paramCollection)
  {
    a();
    Object localObject = x.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof t)) {
      return super.addAll(paramCollection);
    }
    localObject = (t)paramCollection;
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
  
  public final x.c c(int paramInt)
  {
    if (paramInt >= c)
    {
      float[] arrayOfFloat = Arrays.copyOf(b, paramInt);
      return new t(c, arrayOfFloat);
    }
    throw new IllegalArgumentException();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof t)) {
      return super.equals(paramObject);
    }
    paramObject = (t)paramObject;
    if (c != c) {
      return false;
    }
    paramObject = b;
    for (int i = 0; i < c; i++) {
      if (Float.floatToIntBits(b[i]) != Float.floatToIntBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final Object get(int paramInt)
  {
    i(paramInt);
    return Float.valueOf(b[paramInt]);
  }
  
  public final void h(float paramFloat)
  {
    a();
    int i = c;
    float[] arrayOfFloat1 = b;
    if (i == arrayOfFloat1.length)
    {
      float[] arrayOfFloat2 = new float[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfFloat1, 0, arrayOfFloat2, 0, i);
      b = arrayOfFloat2;
    }
    arrayOfFloat1 = b;
    i = c;
    c = (i + 1);
    arrayOfFloat1[i] = paramFloat;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < c; j++) {
      i = i * 31 + Float.floatToIntBits(b[j]);
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
    float[] arrayOfFloat = b;
    float f = arrayOfFloat[paramInt];
    int i = c;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfFloat, paramInt + 1, arrayOfFloat, paramInt, i - paramInt - 1);
    }
    c -= 1;
    modCount += 1;
    return Float.valueOf(f);
  }
  
  public final boolean remove(Object paramObject)
  {
    a();
    for (int i = 0; i < c; i++) {
      if (paramObject.equals(Float.valueOf(b[i])))
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
      float[] arrayOfFloat = b;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, c - paramInt2);
      c -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    float f1 = ((Float)paramObject).floatValue();
    a();
    i(paramInt);
    paramObject = b;
    float f2 = paramObject[paramInt];
    paramObject[paramInt] = f1;
    return Float.valueOf(f2);
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     s0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */