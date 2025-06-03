package gb;

import eb.a0;
import eb.y0;
import eb.z0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.q;
import x6.b;

public final class t2
  implements z0
{
  public static final Logger d = Logger.getLogger(t2.class.getName());
  public static final a e = new a();
  public static final b f = new b();
  public final q<ProxySelector> a;
  public final c b;
  public final InetSocketAddress c;
  
  public t2()
  {
    localb.getClass();
    a = localb;
    localObject.getClass();
    b = ((c)localObject);
    if (str != null)
    {
      localObject = str.split(":", 2);
      int i = 80;
      if (localObject.length > 1) {
        i = Integer.parseInt(localObject[1]);
      }
      d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
      c = new InetSocketAddress(localObject[0], i);
    }
    else
    {
      c = null;
    }
  }
  
  public final y0 a(InetSocketAddress paramInetSocketAddress)
  {
    boolean bool = paramInetSocketAddress instanceof InetSocketAddress;
    Object localObject1 = null;
    InetSocketAddress localInetSocketAddress = null;
    Object localObject2 = null;
    if (!bool) {
      return null;
    }
    Object localObject3 = c;
    int i;
    if (localObject3 != null)
    {
      i = a0.e;
      b.y(localObject3, "proxyAddress");
      b.y(paramInetSocketAddress, "targetAddress");
      return new a0((SocketAddress)localObject3, paramInetSocketAddress, null, null);
    }
    try
    {
      localObject3 = v0.a;
      Object localObject5;
      Object localObject6;
      localObject1 = d;
    }
    finally
    {
      try
      {
        localObject3 = (String)InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(paramInetSocketAddress, new Object[0]);
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException1)
      {
        localObject5 = paramInetSocketAddress.getHostName();
        try
        {
          localObject7 = new java/net/URI;
          ((URI)localObject7).<init>("https", null, (String)localObject5, paramInetSocketAddress.getPort(), null, null, null);
          localObject5 = (ProxySelector)a.get();
          if (localObject5 != null) {
            break label164;
          }
          d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
          return localInetSocketAddress;
          localObject5 = ((ProxySelector)localObject5).select((URI)localObject7);
          if (((List)localObject5).size() <= 1) {
            break label192;
          }
          d.warning("More than 1 proxy detected, gRPC will select the first one");
          localObject5 = (Proxy)((List)localObject5).get(0);
          if (((Proxy)localObject5).type() != Proxy.Type.DIRECT) {
            break label222;
          }
          return localInetSocketAddress;
          localInetSocketAddress = (InetSocketAddress)((Proxy)localObject5).address();
          localObject7 = b;
          try
          {
            localObject5 = (String)InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(localInetSocketAddress, new Object[0]);
          }
          catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException2)
          {
            localObject6 = localInetSocketAddress.getHostName();
          }
          localObject6 = ((c)localObject7).a((String)localObject6, localInetSocketAddress.getAddress(), localInetSocketAddress.getPort());
          localObject7 = localInetSocketAddress;
          if (!localInetSocketAddress.isUnresolved()) {
            break label330;
          }
          localObject7 = new InetSocketAddress(InetAddress.getByName(localInetSocketAddress.getHostName()), localInetSocketAddress.getPort());
          i = a0.e;
          if (localObject6 != null) {
            break label346;
          }
          localObject6 = null;
          break label381;
          localObject1 = ((PasswordAuthentication)localObject6).getUserName();
          if (((PasswordAuthentication)localObject6).getPassword() != null) {
            break label367;
          }
          localObject6 = localObject2;
          break label381;
          localObject6 = new String(((PasswordAuthentication)localObject6).getPassword());
          paramInetSocketAddress = new a0((SocketAddress)localObject7, paramInetSocketAddress, (String)localObject1, (String)localObject6);
        }
        catch (URISyntaxException localURISyntaxException)
        {
          localObject1 = d;
          paramInetSocketAddress = Level.WARNING;
          localObject7 = "Failed to construct URI for proxy lookup, proceeding without proxy";
          break label427;
        }
      }
      localObject4 = finally;
    }
    label164:
    label192:
    label222:
    label330:
    label346:
    label367:
    label381:
    paramInetSocketAddress = Level.WARNING;
    Object localObject7 = "Failed to get host for proxy lookup, proceeding without proxy";
    label427:
    ((Logger)localObject1).log(paramInetSocketAddress, (String)localObject7, localURISyntaxException);
    paramInetSocketAddress = localInetSocketAddress;
    return paramInetSocketAddress;
  }
  
  public final class a
    implements t2.c
  {
    public final PasswordAuthentication a(String paramString, InetAddress paramInetAddress, int paramInt)
    {
      URL localURL2;
      try
      {
        URL localURL1 = new java/net/URL;
        localURL1.<init>("https", paramString, paramInt, "");
      }
      catch (MalformedURLException localMalformedURLException)
      {
        t2.d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[] { "https", paramString });
        localURL2 = null;
      }
      return Authenticator.requestPasswordAuthentication(paramString, paramInetAddress, paramInt, "https", "", null, localURL2, Authenticator.RequestorType.PROXY);
    }
  }
  
  public final class b
    implements q<ProxySelector>
  {
    public final Object get()
    {
      return ProxySelector.getDefault();
    }
  }
  
  public static abstract interface c
  {
    public abstract PasswordAuthentication a(String paramString, InetAddress paramInetAddress, int paramInt);
  }
}

/* Location:
 * Qualified Name:     gb.t2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */