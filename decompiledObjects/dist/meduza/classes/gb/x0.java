package gb;

import eb.e1.a;
import java.util.Arrays;
import java.util.Set;
import n7.g;
import n7.g.a;
import o7.x;
import x6.b;

public final class x0
{
  public final int a;
  public final long b;
  public final x c;
  
  public x0(int paramInt, long paramLong, Set<e1.a> paramSet)
  {
    a = paramInt;
    b = paramLong;
    c = x.q(paramSet);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (x0.class == paramObject.getClass()))
    {
      paramObject = (x0)paramObject;
      if ((a != a) || (b != b) || (!b.Q(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), Long.valueOf(b), c });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.d(String.valueOf(a), "maxAttempts");
    locala.b("hedgingDelayNanos", b);
    locala.a(c, "nonFatalStatusCodes");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */