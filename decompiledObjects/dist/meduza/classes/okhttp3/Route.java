package okhttp3;

import f;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class Route
{
  public final Address a;
  public final Proxy b;
  public final InetSocketAddress c;
  
  public Route(Address paramAddress, Proxy paramProxy, InetSocketAddress paramInetSocketAddress)
  {
    if (paramAddress != null)
    {
      if (paramInetSocketAddress != null)
      {
        a = paramAddress;
        b = paramProxy;
        c = paramInetSocketAddress;
        return;
      }
      throw new NullPointerException("inetSocketAddress == null");
    }
    throw new NullPointerException("address == null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Route))
    {
      paramObject = (Route)paramObject;
      if ((a.equals(a)) && (b.equals(b)) && (c.equals(c))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    return c.hashCode() + (j + (i + 527) * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Route{");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     okhttp3.Route
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */