package gb;

import eb.u0.a;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import n7.p;
import x6.b;

public final class j0
  extends eb.v0
{
  public static final boolean a;
  
  static
  {
    ClassLoader localClassLoader = j0.class.getClassLoader();
    boolean bool = false;
    try
    {
      Class.forName("android.app.Application", false, localClassLoader);
      bool = true;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    a = bool;
  }
  
  public final void a() {}
  
  public final i0 b(URI paramURI, u0.a parama)
  {
    if ("dns".equals(paramURI.getScheme()))
    {
      String str = paramURI.getPath();
      b.y(str, "targetPath");
      b.r(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, paramURI);
      str = str.substring(1);
      paramURI.getAuthority();
      return new i0(str, parama, v0.p, new p(), a);
    }
    return null;
  }
  
  public Collection<Class<? extends SocketAddress>> c()
  {
    return Collections.singleton(InetSocketAddress.class);
  }
  
  public boolean d()
  {
    return true;
  }
  
  public int e()
  {
    return 5;
  }
}

/* Location:
 * Qualified Name:     gb.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */