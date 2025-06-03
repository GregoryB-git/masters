package gb;

import eb.a;
import eb.a0;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import x6.b;

public abstract interface v
  extends Closeable
{
  public abstract x W(SocketAddress paramSocketAddress, a parama, d1.f paramf);
  
  public abstract void close();
  
  public abstract ScheduledExecutorService p0();
  
  public abstract Collection<Class<? extends SocketAddress>> y0();
  
  public static final class a
  {
    public String a = "unknown-authority";
    public a b = a.b;
    public String c;
    public a0 d;
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (a)paramObject;
      bool1 = bool2;
      if (a.equals(a))
      {
        bool1 = bool2;
        if (b.equals(b))
        {
          bool1 = bool2;
          if (b.Q(c, c))
          {
            bool1 = bool2;
            if (b.Q(d, d)) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b, c, d });
    }
  }
}

/* Location:
 * Qualified Name:     gb.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */