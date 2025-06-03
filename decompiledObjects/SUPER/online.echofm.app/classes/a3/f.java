package a3;

import W2.m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public abstract class f
  extends g
{
  public static List c(int... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {
      return Collections.emptyList();
    }
    return new a(paramVarArgs);
  }
  
  public static int d(long paramLong)
  {
    int i = (int)paramLong;
    boolean bool;
    if (i == paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    m.g(bool, "Out of range: %s", paramLong);
    return i;
  }
  
  public static int e(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {
      paramInt1 = -1;
    } else if (paramInt1 > paramInt2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    return paramInt1;
  }
  
  public static int f(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (paramInt2 <= paramInt3) {
      bool = true;
    } else {
      bool = false;
    }
    m.f(bool, "min (%s) must be less than or equal to max (%s)", paramInt2, paramInt3);
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  public static int g(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length >= 4) {
      bool = true;
    } else {
      bool = false;
    }
    m.f(bool, "array too small: %s < %s", paramArrayOfByte.length, 4);
    return h(paramArrayOfByte[0], paramArrayOfByte[1], paramArrayOfByte[2], paramArrayOfByte[3]);
  }
  
  public static int h(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    return paramByte1 << 24 | (paramByte2 & 0xFF) << 16 | (paramByte3 & 0xFF) << 8 | paramByte4 & 0xFF;
  }
  
  public static int i(int paramInt)
  {
    return paramInt;
  }
  
  public static int j(int[] paramArrayOfInt, int paramInt)
  {
    return k(paramArrayOfInt, paramInt, 0, paramArrayOfInt.length);
  }
  
  public static int k(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt2 < paramInt3)
    {
      if (paramArrayOfInt[paramInt2] == paramInt1) {
        return paramInt2;
      }
      paramInt2++;
    }
    return -1;
  }
  
  public static int l(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    
    while (paramInt3 >= paramInt2)
    {
      if (paramArrayOfInt[paramInt3] == paramInt1) {
        return paramInt3;
      }
      paramInt3--;
    }
    return -1;
  }
  
  public static int m(long paramLong)
  {
    if (paramLong > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    if (paramLong < -2147483648L) {
      return Integer.MIN_VALUE;
    }
    return (int)paramLong;
  }
  
  public static int[] n(Collection paramCollection)
  {
    if ((paramCollection instanceof a)) {
      return ((a)paramCollection).f();
    }
    paramCollection = paramCollection.toArray();
    int i = paramCollection.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = ((Number)m.j(paramCollection[j])).intValue();
    }
    return arrayOfInt;
  }
  
  public static Integer o(String paramString)
  {
    return p(paramString, 10);
  }
  
  public static Integer p(String paramString, int paramInt)
  {
    paramString = h.d(paramString, paramInt);
    if ((paramString != null) && (paramString.longValue() == paramString.intValue())) {
      return Integer.valueOf(paramString.intValue());
    }
    return null;
  }
  
  public static class a
    extends AbstractList
    implements RandomAccess, Serializable
  {
    private static final long serialVersionUID = 0L;
    public final int[] o;
    public final int p;
    public final int q;
    
    public a(int[] paramArrayOfInt)
    {
      this(paramArrayOfInt, 0, paramArrayOfInt.length);
    }
    
    public a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
    {
      o = paramArrayOfInt;
      p = paramInt1;
      q = paramInt2;
    }
    
    public Integer a(int paramInt)
    {
      m.h(paramInt, size());
      return Integer.valueOf(o[(p + paramInt)]);
    }
    
    public boolean contains(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof Integer)) && (f.a(o, ((Integer)paramObject).intValue(), p, q) != -1)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Integer d(int paramInt, Integer paramInteger)
    {
      m.h(paramInt, size());
      int[] arrayOfInt = o;
      int i = p;
      int j = arrayOfInt[(i + paramInt)];
      arrayOfInt[(i + paramInt)] = ((Integer)m.j(paramInteger)).intValue();
      return Integer.valueOf(j);
    }
    
    public boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        int i = size();
        if (((a)paramObject).size() != i) {
          return false;
        }
        for (int j = 0; j < i; j++) {
          if (o[(p + j)] != o[(p + j)]) {
            return false;
          }
        }
        return true;
      }
      return super.equals(paramObject);
    }
    
    public int[] f()
    {
      return Arrays.copyOfRange(o, p, q);
    }
    
    public int hashCode()
    {
      int i = p;
      int j = 1;
      while (i < q)
      {
        j = j * 31 + f.i(o[i]);
        i++;
      }
      return j;
    }
    
    public int indexOf(Object paramObject)
    {
      if ((paramObject instanceof Integer))
      {
        int i = f.a(o, ((Integer)paramObject).intValue(), p, q);
        if (i >= 0) {
          return i - p;
        }
      }
      return -1;
    }
    
    public boolean isEmpty()
    {
      return false;
    }
    
    public int lastIndexOf(Object paramObject)
    {
      if ((paramObject instanceof Integer))
      {
        int i = f.b(o, ((Integer)paramObject).intValue(), p, q);
        if (i >= 0) {
          return i - p;
        }
      }
      return -1;
    }
    
    public int size()
    {
      return q - p;
    }
    
    public List subList(int paramInt1, int paramInt2)
    {
      m.n(paramInt1, paramInt2, size());
      if (paramInt1 == paramInt2) {
        return Collections.emptyList();
      }
      int[] arrayOfInt = o;
      int i = p;
      return new a(arrayOfInt, paramInt1 + i, i + paramInt2);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(size() * 5);
      localStringBuilder.append('[');
      localStringBuilder.append(o[p]);
      int i = p;
      for (;;)
      {
        i++;
        if (i >= q) {
          break;
        }
        localStringBuilder.append(", ");
        localStringBuilder.append(o[i]);
      }
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     a3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */