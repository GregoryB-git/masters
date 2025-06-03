package eb;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import n7.g;
import n7.g.a;
import x6.b;

public final class a0
  extends y0
{
  public final SocketAddress a;
  public final InetSocketAddress b;
  public final String c;
  public final String d;
  
  public a0(SocketAddress paramSocketAddress, InetSocketAddress paramInetSocketAddress, String paramString1, String paramString2)
  {
    b.y(paramSocketAddress, "proxyAddress");
    b.y(paramInetSocketAddress, "targetAddress");
    if ((paramSocketAddress instanceof InetSocketAddress)) {
      b.G(paramSocketAddress, "The proxy address %s is not resolved", ((InetSocketAddress)paramSocketAddress).isUnresolved() ^ true);
    }
    a = paramSocketAddress;
    b = paramInetSocketAddress;
    c = paramString1;
    d = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a0;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (a0)paramObject;
    bool1 = bool2;
    if (b.Q(a, a))
    {
      bool1 = bool2;
      if (b.Q(b, b))
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
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "proxyAddr");
    locala.a(b, "targetAddr");
    locala.a(c, "username");
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    locala.c("hasPassword", bool);
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */