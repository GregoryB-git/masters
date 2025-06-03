package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

final class Jdk9Platform
  extends Platform
{
  public final Method c;
  public final Method d;
  
  public Jdk9Platform(Method paramMethod1, Method paramMethod2)
  {
    c = paramMethod1;
    d = paramMethod2;
  }
  
  public final void f(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList)
  {
    try
    {
      paramString = paramSSLSocket.getSSLParameters();
      paramList = Platform.b(paramList);
      c.invoke(paramString, new Object[] { paramList.toArray(new String[paramList.size()]) });
      paramSSLSocket.setSSLParameters(paramString);
      return;
    }
    catch (InvocationTargetException paramSSLSocket) {}catch (IllegalAccessException paramSSLSocket) {}
    throw Util.a("unable to set ssl parameters", paramSSLSocket);
  }
  
  public final String i(SSLSocket paramSSLSocket)
  {
    try
    {
      paramSSLSocket = (String)d.invoke(paramSSLSocket, new Object[0]);
      if (paramSSLSocket != null)
      {
        boolean bool = paramSSLSocket.equals("");
        if (!bool) {
          return paramSSLSocket;
        }
      }
      return null;
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw Util.a("failed to get ALPN selected protocol", paramSSLSocket);
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      if ((paramSSLSocket.getCause() instanceof UnsupportedOperationException)) {
        return null;
      }
      throw Util.a("failed to get ALPN selected protocol", paramSSLSocket);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.Jdk9Platform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */