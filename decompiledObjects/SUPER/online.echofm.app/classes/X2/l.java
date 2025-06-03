package X2;

import W2.k;
import java.util.Arrays;

public abstract class l
{
  public static Object a(int paramInt)
  {
    if ((paramInt >= 2) && (paramInt <= 1073741824) && (Integer.highestOneBit(paramInt) == paramInt))
    {
      if (paramInt <= 256) {
        return new byte[paramInt];
      }
      if (paramInt <= 65536) {
        return new short[paramInt];
      }
      return new int[paramInt];
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("must be power of 2 between 2^1 and 2^30: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 & paramInt2;
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    return paramInt1 & paramInt2;
  }
  
  public static int d(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 & paramInt3 | paramInt2 & paramInt3;
  }
  
  public static int e(int paramInt)
  {
    int i;
    if (paramInt < 32) {
      i = 4;
    } else {
      i = 2;
    }
    return i * (paramInt + 1);
  }
  
  public static int f(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3, int[] paramArrayOfInt, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i = s.c(paramObject1);
    int j = i & paramInt;
    int k = h(paramObject3, j);
    if (k == 0) {
      return -1;
    }
    int m = b(i, paramInt);
    i = -1;
    for (;;)
    {
      k--;
      int n = paramArrayOfInt[k];
      if ((b(n, paramInt) == m) && (k.a(paramObject1, paramArrayOfObject1[k])) && ((paramArrayOfObject2 == null) || (k.a(paramObject2, paramArrayOfObject2[k]))))
      {
        n = c(n, paramInt);
        if (i == -1) {
          i(paramObject3, j, n);
        } else {
          paramArrayOfInt[i] = d(paramArrayOfInt[i], n, paramInt);
        }
        return k;
      }
      n = c(n, paramInt);
      if (n == 0) {
        return -1;
      }
      i = k;
      k = n;
    }
  }
  
  public static void g(Object paramObject)
  {
    if ((paramObject instanceof byte[])) {
      Arrays.fill((byte[])paramObject, (byte)0);
    } else if ((paramObject instanceof short[])) {
      Arrays.fill((short[])paramObject, (short)0);
    } else {
      Arrays.fill((int[])paramObject, 0);
    }
  }
  
  public static int h(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof byte[])) {
      return ((byte[])paramObject)[paramInt] & 0xFF;
    }
    if ((paramObject instanceof short[])) {
      return ((short[])paramObject)[paramInt] & 0xFFFF;
    }
    return ((int[])paramObject)[paramInt];
  }
  
  public static void i(Object paramObject, int paramInt1, int paramInt2)
  {
    if ((paramObject instanceof byte[])) {
      ((byte[])paramObject)[paramInt1] = ((byte)(byte)paramInt2);
    } else if ((paramObject instanceof short[])) {
      ((short[])paramObject)[paramInt1] = ((short)(short)paramInt2);
    } else {
      ((int[])paramObject)[paramInt1] = paramInt2;
    }
  }
  
  public static int j(int paramInt)
  {
    return Math.max(4, s.a(paramInt + 1, 1.0D));
  }
}

/* Location:
 * Qualified Name:     X2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */