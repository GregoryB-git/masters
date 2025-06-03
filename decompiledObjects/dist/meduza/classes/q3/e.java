package q3;

import java.util.Map;
import java.util.Set;
import t3.a;

public abstract class e
{
  public abstract a a();
  
  public final long b(h3.e parame, long paramLong, int paramInt)
  {
    long l1 = a().a();
    parame = (a)c().get(parame);
    long l2 = parame.a();
    paramInt--;
    long l3;
    if (l2 > 1L) {
      l3 = l2;
    } else {
      l3 = 2L;
    }
    double d = Math.max(1.0D, Math.log(10000.0D) / Math.log(l3 * paramInt));
    return Math.min(Math.max((Math.pow(3.0D, paramInt) * l2 * d), paramLong - l1), parame.c());
  }
  
  public abstract Map<h3.e, a> c();
  
  public static abstract class a
  {
    public abstract long a();
    
    public abstract Set<e.b> b();
    
    public abstract long c();
    
    public static abstract class a {}
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("NETWORK_UNMETERED", 0);
      a = localb1;
      b localb2 = new b("DEVICE_IDLE", 1);
      b = localb2;
      b localb3 = new b("DEVICE_CHARGING", 2);
      c = localb3;
      d = new b[] { localb1, localb2, localb3 };
    }
    
    public b() {}
  }
}

/* Location:
 * Qualified Name:     q3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */