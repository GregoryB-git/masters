package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

class JdkWithJettyBootPlatform
  extends Platform
{
  public final Method c;
  public final Method d;
  public final Method e;
  public final Class<?> f;
  public final Class<?> g;
  
  public JdkWithJettyBootPlatform(Method paramMethod1, Method paramMethod2, Method paramMethod3, Class<?> paramClass1, Class<?> paramClass2)
  {
    c = paramMethod1;
    d = paramMethod2;
    e = paramMethod3;
    f = paramClass1;
    g = paramClass2;
  }
  
  public final void a(SSLSocket paramSSLSocket)
  {
    try
    {
      e.invoke(null, new Object[] { paramSSLSocket });
      return;
    }
    catch (InvocationTargetException paramSSLSocket) {}catch (IllegalAccessException paramSSLSocket) {}
    throw Util.a("unable to remove alpn", paramSSLSocket);
  }
  
  public final void f(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList)
  {
    ArrayList localArrayList = Platform.b(paramList);
    try
    {
      ClassLoader localClassLoader = Platform.class.getClassLoader();
      paramString = f;
      paramList = g;
      JettyNegoProvider localJettyNegoProvider = new okhttp3/internal/platform/JdkWithJettyBootPlatform$JettyNegoProvider;
      localJettyNegoProvider.<init>(localArrayList);
      paramString = Proxy.newProxyInstance(localClassLoader, new Class[] { paramString, paramList }, localJettyNegoProvider);
      c.invoke(null, new Object[] { paramSSLSocket, paramString });
      return;
    }
    catch (IllegalAccessException paramSSLSocket) {}catch (InvocationTargetException paramSSLSocket) {}
    throw Util.a("unable to set alpn", paramSSLSocket);
  }
  
  public final String i(SSLSocket paramSSLSocket)
  {
    try
    {
      Method localMethod = d;
      Object localObject = null;
      paramSSLSocket = (JettyNegoProvider)Proxy.getInvocationHandler(localMethod.invoke(null, new Object[] { paramSSLSocket }));
      boolean bool = b;
      if ((!bool) && (c == null))
      {
        Platform.a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
        return null;
      }
      if (bool) {
        paramSSLSocket = (SSLSocket)localObject;
      } else {
        paramSSLSocket = c;
      }
      return paramSSLSocket;
    }
    catch (IllegalAccessException paramSSLSocket) {}catch (InvocationTargetException paramSSLSocket) {}
    throw Util.a("unable to get selected protocol", paramSSLSocket);
  }
  
  public static class JettyNegoProvider
    implements InvocationHandler
  {
    public final List<String> a;
    public boolean b;
    public String c;
    
    public JettyNegoProvider(ArrayList paramArrayList)
    {
      a = paramArrayList;
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      String str = paramMethod.getName();
      Class localClass = paramMethod.getReturnType();
      paramObject = paramArrayOfObject;
      if (paramArrayOfObject == null) {
        paramObject = Util.b;
      }
      if ((str.equals("supports")) && (Boolean.TYPE == localClass)) {
        return Boolean.TRUE;
      }
      if ((str.equals("unsupported")) && (Void.TYPE == localClass))
      {
        b = true;
        return null;
      }
      if ((str.equals("protocols")) && (paramObject.length == 0)) {
        return a;
      }
      if (((str.equals("selectProtocol")) || (str.equals("select"))) && (String.class == localClass) && (paramObject.length == 1))
      {
        paramArrayOfObject = paramObject[0];
        if ((paramArrayOfObject instanceof List))
        {
          paramObject = (List)paramArrayOfObject;
          int i = ((List)paramObject).size();
          int j = 0;
          if (j < i) {
            if (!a.contains(((List)paramObject).get(j))) {}
          }
          for (paramObject = ((List)paramObject).get(j);; paramObject = a.get(0))
          {
            paramObject = (String)paramObject;
            c = ((String)paramObject);
            return paramObject;
            j++;
            break;
          }
        }
      }
      if (((str.equals("protocolSelected")) || (str.equals("selected"))) && (paramObject.length == 1))
      {
        c = ((String)paramObject[0]);
        return null;
      }
      return paramMethod.invoke(this, (Object[])paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.JdkWithJettyBootPlatform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */