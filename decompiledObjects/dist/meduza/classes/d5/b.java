package d5;

import java.util.Arrays;

public final class b
{
  public final String a;
  public final String b;
  public final int c;
  public final int d;
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    a = paramString1;
    b = paramString2;
    c = paramInt1;
    d = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if ((c != c) || (d != d) || (!x6.b.Q(a, a)) || (!x6.b.Q(b, b))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, Integer.valueOf(c), Integer.valueOf(d) });
  }
}

/* Location:
 * Qualified Name:     d5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */