package r7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p2.m0;
import x6.b;

public final class a
  extends e9.a
{
  public static int C(long paramLong)
  {
    int i = (int)paramLong;
    boolean bool;
    if (i == paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    b.m(paramLong, "Out of range: %s", bool);
    return i;
  }
  
  public static int D(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt2 <= 1073741823) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return Math.min(Math.max(paramInt1, paramInt2), 1073741823);
    }
    throw new IllegalArgumentException(m0.X("min (%s) must be less than or equal to max (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(1073741823) }));
  }
  
  public static int E(long paramLong)
  {
    if (paramLong > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    if (paramLong < -2147483648L) {
      return Integer.MIN_VALUE;
    }
    return (int)paramLong;
  }
  
  public static int[] F(Collection<? extends Number> paramCollection)
  {
    if ((paramCollection instanceof a))
    {
      paramCollection = (a)paramCollection;
      return Arrays.copyOfRange(a, b, c);
    }
    paramCollection = paramCollection.toArray();
    int i = paramCollection.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramCollection[j];
      localObject.getClass();
      arrayOfInt[j] = ((Number)localObject).intValue();
    }
    return arrayOfInt;
  }
  
  public static final class a
    extends AbstractList<Integer>
    implements RandomAccess, Serializable
  {
    public final int[] a;
    public final int b;
    public final int c;
    
    public a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      a = paramArrayOfInt;
      b = paramInt1;
      c = paramInt2;
    }
    
    public final boolean contains(Object paramObject)
    {
      if ((paramObject instanceof Integer))
      {
        int[] arrayOfInt = a;
        int i = ((Integer)paramObject).intValue();
        int j = b;
        int k = c;
        while (j < k)
        {
          if (arrayOfInt[j] == i) {
            break label59;
          }
          j++;
        }
        j = -1;
        label59:
        if (j != -1)
        {
          bool = true;
          break label74;
        }
      }
      boolean bool = false;
      label74:
      return bool;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i = c - b;
        if (c - b != i) {
          return false;
        }
        for (int j = 0; j < i; j++) {
          if (a[(b + j)] != a[(b + j)]) {
            return false;
          }
        }
        return true;
      }
      return super.equals(paramObject);
    }
    
    public final Object get(int paramInt)
    {
      b.v(paramInt, c - b);
      return Integer.valueOf(a[(b + paramInt)]);
    }
    
    public final int hashCode()
    {
      int i = b;
      int j = 1;
      while (i < c)
      {
        j = j * 31 + a[i];
        i++;
      }
      return j;
    }
    
    public final int indexOf(Object paramObject)
    {
      if ((paramObject instanceof Integer))
      {
        int[] arrayOfInt = a;
        int i = ((Integer)paramObject).intValue();
        int j = b;
        int k = c;
        while (j < k)
        {
          if (arrayOfInt[j] == i) {
            break label59;
          }
          j++;
        }
        j = -1;
        label59:
        if (j >= 0) {
          return j - b;
        }
      }
      return -1;
    }
    
    public final boolean isEmpty()
    {
      return false;
    }
    
    public final int lastIndexOf(Object paramObject)
    {
      if ((paramObject instanceof Integer))
      {
        int[] arrayOfInt = a;
        int i = ((Integer)paramObject).intValue();
        int j = b;
        for (int k = c - 1; k >= j; k--) {
          if (arrayOfInt[k] == i) {
            break label61;
          }
        }
        k = -1;
        label61:
        if (k >= 0) {
          return k - b;
        }
      }
      return -1;
    }
    
    public final Object set(int paramInt, Object paramObject)
    {
      paramObject = (Integer)paramObject;
      b.v(paramInt, c - b);
      int[] arrayOfInt = a;
      int i = b + paramInt;
      paramInt = arrayOfInt[i];
      paramObject.getClass();
      arrayOfInt[i] = ((Integer)paramObject).intValue();
      return Integer.valueOf(paramInt);
    }
    
    public final int size()
    {
      return c - b;
    }
    
    public final List<Integer> subList(int paramInt1, int paramInt2)
    {
      b.E(paramInt1, paramInt2, c - b);
      if (paramInt1 == paramInt2) {
        return Collections.emptyList();
      }
      int[] arrayOfInt = a;
      int i = b;
      return new a(paramInt1 + i, i + paramInt2, arrayOfInt);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder((c - b) * 5);
      localStringBuilder.append('[');
      localStringBuilder.append(a[b]);
      int i = b;
      for (;;)
      {
        i++;
        if (i >= c) {
          break;
        }
        localStringBuilder.append(", ");
        localStringBuilder.append(a[i]);
      }
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     r7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */