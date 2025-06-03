package ma;

import a0.j;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class u
  extends c<Float>
  implements RandomAccess, c1
{
  public float[] b;
  public int c;
  
  static
  {
    new u(new float[0], 0, false);
  }
  
  public u()
  {
    this(new float[10], 0, true);
  }
  
  public u(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
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
    Object localObject = a0.a;
    paramCollection.getClass();
    if (!(paramCollection instanceof u)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (u)paramCollection;
    int i = c;
    if (i == 0) {
      return false;
    }
    int j = c;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      localObject = b;
      if (i > localObject.length) {
        b = Arrays.copyOf((float[])localObject, i);
      }
      System.arraycopy(b, 0, b, c, c);
      c = i;
      modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final a0.d c(int paramInt)
  {
    if (paramInt >= c) {
      return new u(Arrays.copyOf(b, paramInt), c, true);
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
    if (!(paramObject instanceof u)) {
      return super.equals(paramObject);
    }
    paramObject = (u)paramObject;
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
      arrayOfFloat2 = new float[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfFloat1, 0, arrayOfFloat2, 0, i);
      b = arrayOfFloat2;
    }
    float[] arrayOfFloat2 = b;
    i = c;
    c = (i + 1);
    arrayOfFloat2[i] = paramFloat;
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
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Float)) {
      return -1;
    }
    float f = ((Float)paramObject).floatValue();
    int i = c;
    for (int j = 0; j < i; j++) {
      if (b[j] == f) {
        return j;
      }
    }
    return -1;
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
 * Qualified Name:     ma.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */