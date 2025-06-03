package U3;

import c4.c;
import c4.d;
import java.util.concurrent.ScheduledExecutorService;

public class a$b
{
  public final ScheduledExecutorService a;
  public long b = 1000L;
  public double c = 0.5D;
  public long d = 30000L;
  public double e = 1.3D;
  public final c f;
  
  public a$b(ScheduledExecutorService paramScheduledExecutorService, d paramd, String paramString)
  {
    a = paramScheduledExecutorService;
    f = new c(paramd, paramString);
  }
  
  public a a()
  {
    return new a(a, f, b, d, e, c, null);
  }
  
  public b b(double paramDouble)
  {
    if ((paramDouble >= 0.0D) && (paramDouble <= 1.0D))
    {
      c = paramDouble;
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Argument out of range: ");
    localStringBuilder.append(paramDouble);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public b c(long paramLong)
  {
    d = paramLong;
    return this;
  }
  
  public b d(long paramLong)
  {
    b = paramLong;
    return this;
  }
  
  public b e(double paramDouble)
  {
    e = paramDouble;
    return this;
  }
}

/* Location:
 * Qualified Name:     U3.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */