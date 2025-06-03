package v3;

import java.util.Arrays;
import r3.j;
import v5.e0;

public final class k0
  extends i1
{
  public static final String e = e0.E(1);
  public static final String f = e0.E(2);
  public static final j o = new j(7);
  public final boolean c;
  public final boolean d;
  
  public k0()
  {
    c = false;
    d = false;
  }
  
  public k0(boolean paramBoolean)
  {
    c = true;
    d = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof k0;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (k0)paramObject;
    bool1 = bool2;
    if (d == d)
    {
      bool1 = bool2;
      if (c == c) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Boolean.valueOf(c), Boolean.valueOf(d) });
  }
}

/* Location:
 * Qualified Name:     v3.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */