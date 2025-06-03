package v3;

import e0.d;
import java.util.Arrays;
import v5.e0;

public final class q1
  extends i1
{
  public static final String e = e0.E(1);
  public static final String f = e0.E(2);
  public static final d o = new d(8);
  public final boolean c;
  public final boolean d;
  
  public q1()
  {
    c = false;
    d = false;
  }
  
  public q1(boolean paramBoolean)
  {
    c = true;
    d = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof q1;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (q1)paramObject;
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
 * Qualified Name:     v3.q1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */