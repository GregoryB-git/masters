package gb;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import x6.b;

public final class h
{
  public static final Logger c = Logger.getLogger(h.class.getName());
  public final String a;
  public final AtomicLong b;
  
  public h(long paramLong)
  {
    AtomicLong localAtomicLong = new AtomicLong();
    b = localAtomicLong;
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    b.s("value must be positive", bool);
    a = "keepalive time nanos";
    localAtomicLong.set(paramLong);
  }
  
  public final class a
  {
    public final long a;
    
    public a(long paramLong)
    {
      a = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     gb.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */