package ib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

public final class i$c
  extends i
{
  public final Method e;
  public final Method f;
  public final Method g;
  public final Class<?> h;
  public final Class<?> i;
  
  public i$c(Method paramMethod1, Method paramMethod2, Method paramMethod3, Class<?> paramClass1, Class<?> paramClass2, Provider paramProvider)
  {
    super(paramProvider);
    e = paramMethod1;
    f = paramMethod2;
    g = paramMethod3;
    h = paramClass1;
    i = paramClass2;
  }
  
  public final void a(SSLSocket paramSSLSocket)
  {
    try
    {
      try
      {
        g.invoke(null, new Object[] { paramSSLSocket });
      }
      catch (InvocationTargetException paramSSLSocket)
      {
        i.b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", paramSSLSocket);
      }
      return;
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError();
    }
  }
  
  public final void c(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
  {
    paramString = new ArrayList(paramList.size());
    int j = paramList.size();
    Object localObject;
    for (int k = 0; k < j; k++)
    {
      localObject = (j)paramList.get(k);
      if (localObject != j.b) {
        paramString.add(a);
      }
    }
    try
    {
      paramList = i.class.getClassLoader();
      Class localClass1 = h;
      Class localClass2 = i;
      localObject = new ib/i$d;
      ((i.d)localObject).<init>(paramString);
      paramString = Proxy.newProxyInstance(paramList, new Class[] { localClass1, localClass2 }, (InvocationHandler)localObject);
      e.invoke(null, new Object[] { paramSSLSocket, paramString });
      return;
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError(paramSSLSocket);
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new AssertionError(paramSSLSocket);
    }
  }
  
  public final String d(SSLSocket paramSSLSocket)
  {
    try
    {
      Method localMethod = f;
      Object localObject = null;
      paramSSLSocket = (i.d)Proxy.getInvocationHandler(localMethod.invoke(null, new Object[] { paramSSLSocket }));
      boolean bool = b;
      if ((!bool) && (c == null))
      {
        i.b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
        return null;
      }
      if (bool) {
        paramSSLSocket = (SSLSocket)localObject;
      } else {
        paramSSLSocket = c;
      }
      return paramSSLSocket;
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError();
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new AssertionError();
    }
  }
  
  public final int e()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     ib.i.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */