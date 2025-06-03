package gb;

import eb.e1.a;
import java.util.Arrays;
import java.util.Set;
import n7.g;
import n7.g.a;
import o7.x;
import x6.b;

public final class a3
{
  public final int a;
  public final long b;
  public final long c;
  public final double d;
  public final Long e;
  public final x f;
  
  public a3(int paramInt, long paramLong1, long paramLong2, double paramDouble, Long paramLong, Set<e1.a> paramSet)
  {
    a = paramInt;
    b = paramLong1;
    c = paramLong2;
    d = paramDouble;
    e = paramLong;
    f = x.q(paramSet);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a3;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (a3)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (b == b)
      {
        bool1 = bool2;
        if (c == c)
        {
          bool1 = bool2;
          if (Double.compare(d, d) == 0)
          {
            bool1 = bool2;
            if (b.Q(e, e))
            {
              bool1 = bool2;
              if (b.Q(f, f)) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), Long.valueOf(b), Long.valueOf(c), Double.valueOf(d), e, f });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.d(String.valueOf(a), "maxAttempts");
    locala.b("initialBackoffNanos", b);
    locala.b("maxBackoffNanos", c);
    locala.d(String.valueOf(d), "backoffMultiplier");
    locala.a(e, "perAttemptRecvTimeoutNanos");
    locala.a(f, "retryableStatusCodes");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.a3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */