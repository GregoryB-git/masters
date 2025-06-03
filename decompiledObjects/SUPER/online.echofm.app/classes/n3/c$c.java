package n3;

import c3.k;
import java.util.Objects;

public final class c$c
{
  public final k a;
  public final int b;
  public final String c;
  public final String d;
  
  public c$c(k paramk, int paramInt, String paramString1, String paramString2)
  {
    a = paramk;
    b = paramInt;
    c = paramString1;
    d = paramString2;
  }
  
  public int a()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (c)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (b == b)
      {
        bool1 = bool2;
        if (c.equals(c))
        {
          bool1 = bool2;
          if (d.equals(d)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { a, Integer.valueOf(b), c, d });
  }
  
  public String toString()
  {
    return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[] { a, Integer.valueOf(b), c, d });
  }
}

/* Location:
 * Qualified Name:     n3.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */