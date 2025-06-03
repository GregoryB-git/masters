package r5;

import java.util.Arrays;
import v3.g;
import v5.e0;
import w3.v;

public final class f$e
  implements g
{
  public static final String d = e0.E(0);
  public static final String e = e0.E(1);
  public static final String f = e0.E(2);
  public final int a;
  public final int[] b;
  public final int c;
  
  static
  {
    new v(12);
  }
  
  public f$e() {}
  
  public f$e(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a = paramInt1;
    paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramArrayOfInt.length);
    b = paramArrayOfInt;
    c = paramInt2;
    Arrays.sort(paramArrayOfInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((a != a) || (!Arrays.equals(b, b)) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    return (Arrays.hashCode(b) + i * 31) * 31 + c;
  }
}

/* Location:
 * Qualified Name:     r5.f.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */