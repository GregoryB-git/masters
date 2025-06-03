package eb;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;

public abstract class v0
  extends u0.c
{
  public Collection<Class<? extends SocketAddress>> c()
  {
    return Collections.singleton(InetSocketAddress.class);
  }
  
  public abstract boolean d();
  
  public abstract int e();
}

/* Location:
 * Qualified Name:     eb.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */