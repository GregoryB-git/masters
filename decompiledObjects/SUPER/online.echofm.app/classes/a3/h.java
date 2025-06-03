package a3;

import W2.m;
import java.util.Arrays;

public abstract class h
{
  public static int a(long paramLong1, long paramLong2)
  {
    boolean bool = paramLong1 < paramLong2;
    int i;
    if (bool) {
      i = -1;
    } else if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static int b(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static long c(long... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 1;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    m.d(bool);
    long l3;
    for (long l1 = paramVarArgs[0]; j < paramVarArgs.length; l1 = l3)
    {
      long l2 = paramVarArgs[j];
      l3 = l1;
      if (l2 > l1) {
        l3 = l2;
      }
      j++;
    }
    return l1;
  }
  
  public static Long d(String paramString, int paramInt)
  {
    if (((String)m.j(paramString)).isEmpty()) {
      return null;
    }
    if ((paramInt >= 2) && (paramInt <= 36))
    {
      int i = 0;
      if (paramString.charAt(0) == '-') {
        i = 1;
      }
      if (i == paramString.length()) {
        return null;
      }
      int j = i + 1;
      int k = a.a(paramString.charAt(i));
      if ((k >= 0) && (k < paramInt))
      {
        long l1 = -k;
        long l2 = paramInt;
        long l3 = Long.MIN_VALUE / l2;
        while (j < paramString.length())
        {
          k = a.a(paramString.charAt(j));
          if ((k >= 0) && (k < paramInt) && (l1 >= l3))
          {
            long l4 = l1 * l2;
            l1 = k;
            if (l4 < l1 - Long.MIN_VALUE) {
              return null;
            }
            l1 = l4 - l1;
            j++;
          }
          else
          {
            return null;
          }
        }
        if (i != 0) {
          return Long.valueOf(l1);
        }
        if (l1 == Long.MIN_VALUE) {
          return null;
        }
        return Long.valueOf(-l1);
      }
      return null;
    }
    paramString = new StringBuilder();
    paramString.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
    paramString.append(paramInt);
    throw new IllegalArgumentException(paramString.toString());
  }
  
  public static final abstract class a
  {
    public static final byte[] a;
    
    static
    {
      byte[] arrayOfByte = new byte[''];
      Arrays.fill(arrayOfByte, (byte)-1);
      int i = 0;
      int k;
      for (int j = 0;; j++)
      {
        k = i;
        if (j >= 10) {
          break;
        }
        arrayOfByte[(j + 48)] = ((byte)(byte)j);
      }
      while (k < 26)
      {
        j = (byte)(k + 10);
        arrayOfByte[(k + 65)] = ((byte)j);
        arrayOfByte[(k + 97)] = ((byte)j);
        k++;
      }
      a = arrayOfByte;
    }
    
    public static int a(char paramChar)
    {
      if (paramChar < '') {
        paramChar = a[paramChar];
      } else {
        paramChar = '￿';
      }
      return paramChar;
    }
  }
}

/* Location:
 * Qualified Name:     a3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */