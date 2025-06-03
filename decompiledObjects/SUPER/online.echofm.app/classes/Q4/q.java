package Q4;

import P4.m;
import P4.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q
  implements t
{
  public final String a;
  public final int b;
  
  public q(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public double a()
  {
    if (b == 0) {
      return 0.0D;
    }
    String str = g();
    try
    {
      double d = Double.valueOf(str).doubleValue();
      return d;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[] { str, "double" }), localNumberFormatException);
    }
  }
  
  public String b()
  {
    if (b == 0) {
      return "";
    }
    h();
    return a;
  }
  
  public long c()
  {
    if (b == 0) {
      return 0L;
    }
    String str = g();
    try
    {
      long l = Long.valueOf(str).longValue();
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[] { str, "long" }), localNumberFormatException);
    }
  }
  
  public boolean d()
  {
    if (b == 0) {
      return false;
    }
    String str = g();
    if (l.f.matcher(str).matches()) {
      return true;
    }
    if (l.g.matcher(str).matches()) {
      return false;
    }
    throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[] { str, "boolean" }));
  }
  
  public byte[] e()
  {
    if (b == 0) {
      return m.m;
    }
    return a.getBytes(l.e);
  }
  
  public int f()
  {
    return b;
  }
  
  public final String g()
  {
    return b().trim();
  }
  
  public final void h()
  {
    if (a != null) {
      return;
    }
    throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
  }
}

/* Location:
 * Qualified Name:     Q4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */