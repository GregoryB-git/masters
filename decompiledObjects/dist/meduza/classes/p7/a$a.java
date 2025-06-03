package p7;

import f;
import java.math.RoundingMode;
import java.util.Arrays;
import q7.b;

public final class a$a
{
  public final String a;
  public final char[] b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final byte[] g;
  public final boolean[] h;
  public final boolean i;
  
  public a$a(String paramString, char[] paramArrayOfChar)
  {
    a = paramString;
    b = paramArrayOfChar;
    try
    {
      j = b.b(paramArrayOfChar.length, RoundingMode.UNNECESSARY);
      d = j;
      k = Integer.numberOfTrailingZeros(j);
      int m = 1 << 3 - k;
      e = m;
      f = (j >> k);
      c = (paramArrayOfChar.length - 1);
      g = arrayOfByte;
      paramString = new boolean[m];
      for (j = 0; j < f; j++) {
        paramString[b.a(j * 8, d, RoundingMode.CEILING)] = 1;
      }
      h = paramString;
      i = false;
      return;
    }
    catch (ArithmeticException localArithmeticException)
    {
      paramString = f.l("Illegal alphabet length ");
      paramString.append(paramArrayOfChar.length);
      throw new IllegalArgumentException(paramString.toString(), localArithmeticException);
    }
  }
  
  public final int a(char paramChar)
  {
    if (paramChar <= '')
    {
      int j = g[paramChar];
      if (j == -1)
      {
        if ((paramChar > ' ') && (paramChar != ''))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unrecognized character: ");
          localStringBuilder.append(paramChar);
          throw new a.d(localStringBuilder.toString());
        }
        localStringBuilder = f.l("Unrecognized character: 0x");
        localStringBuilder.append(Integer.toHexString(paramChar));
        throw new a.d(localStringBuilder.toString());
      }
      return j;
    }
    StringBuilder localStringBuilder = f.l("Unrecognized character: 0x");
    localStringBuilder.append(Integer.toHexString(paramChar));
    throw new a.d(localStringBuilder.toString());
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (a)paramObject;
      bool3 = bool2;
      if (i == i)
      {
        bool3 = bool2;
        if (Arrays.equals(b, b)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    int j = Arrays.hashCode(b);
    int k;
    if (i) {
      k = 1231;
    } else {
      k = 1237;
    }
    return j + k;
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     p7.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */