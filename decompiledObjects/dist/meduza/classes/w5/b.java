package w5;

import e0.d;
import f;
import java.util.Arrays;
import v3.g;
import v5.e0;

public final class b
  implements g
{
  public static final String f = e0.E(0);
  public static final String o = e0.E(1);
  public static final String p = e0.E(2);
  public static final String q = e0.E(3);
  public static final d r = new d(19);
  public final int a;
  public final int b;
  public final int c;
  public final byte[] d;
  public int e;
  
  public b(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramArrayOfByte;
  }
  
  public static int a(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 9)
      {
        if ((paramInt != 4) && (paramInt != 5) && (paramInt != 6) && (paramInt != 7)) {
          return -1;
        }
        return 2;
      }
      return 6;
    }
    return 1;
  }
  
  public static int b(int paramInt)
  {
    if (paramInt != 1) {
      if (paramInt != 16)
      {
        if (paramInt != 18)
        {
          if ((paramInt != 6) && (paramInt != 7)) {
            return -1;
          }
        }
        else {
          return 7;
        }
      }
      else {
        return 6;
      }
    }
    return 3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((a != a) || (b != b) || (c != c) || (!Arrays.equals(d, d))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (e == 0)
    {
      int i = a;
      int j = b;
      int k = c;
      e = (Arrays.hashCode(d) + (((527 + i) * 31 + j) * 31 + k) * 31);
    }
    return e;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ColorInfo(");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(c);
    localStringBuilder.append(", ");
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    localStringBuilder.append(bool);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     w5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */