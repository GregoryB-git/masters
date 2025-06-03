package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;

public abstract class q3
  implements Serializable, Iterable
{
  public static final q3 p = new A3(a4.d);
  public static final x3 q = new D3(null);
  public static final Comparator r = new s3();
  public int o = 0;
  
  public static z3 U(int paramInt)
  {
    return new z3(paramInt, null);
  }
  
  public static int g(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1)
        {
          localStringBuilder = new StringBuilder("Beginning index larger than ending index: ");
          localStringBuilder.append(paramInt1);
          localStringBuilder.append(", ");
          localStringBuilder.append(paramInt2);
          throw new IndexOutOfBoundsException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder("End index: ");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" >= ");
        localStringBuilder.append(paramInt3);
        throw new IndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  public static q3 k(String paramString)
  {
    return new A3(paramString.getBytes(a4.b));
  }
  
  public static q3 q(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new A3(q.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public abstract void D(r3 paramr3);
  
  public abstract byte M(int paramInt);
  
  public abstract int S();
  
  public abstract int T(int paramInt1, int paramInt2, int paramInt3);
  
  public final String V()
  {
    Charset localCharset = a4.b;
    if (S() == 0) {
      return "";
    }
    return s(localCharset);
  }
  
  public abstract boolean W();
  
  public abstract byte a(int paramInt);
  
  public final int d()
  {
    return o;
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = o;
    int j = i;
    if (i == 0)
    {
      j = S();
      i = T(j, 0, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      o = j;
    }
    return j;
  }
  
  public abstract q3 i(int paramInt1, int paramInt2);
  
  public abstract String s(Charset paramCharset);
  
  public final String toString()
  {
    Locale localLocale = Locale.ROOT;
    String str1 = Integer.toHexString(System.identityHashCode(this));
    int i = S();
    Object localObject;
    if (S() <= 50)
    {
      localObject = s5.a(this);
    }
    else
    {
      String str2 = s5.a(i(0, 47));
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(str2);
      ((StringBuilder)localObject).append("...");
      localObject = ((StringBuilder)localObject).toString();
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str1, Integer.valueOf(i), localObject });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.q3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */