package ib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import r3.a0;

public class i
{
  public static final Logger b = Logger.getLogger(i.class.getName());
  public static final String[] c = { "com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider" };
  public static final i d;
  public final Provider a;
  
  static
  {
    Object localObject1 = Security.getProviders();
    int i = localObject1.length;
    int j = 0;
    Object localObject5;
    for (int k = 0; k < i; k++)
    {
      localObject2 = localObject1[k];
      for (localObject5 : c) {
        if (((String)localObject5).equals(localObject2.getClass().getName()))
        {
          b.log(Level.FINE, "Found registered provider {0}", localObject5);
          break label149;
        }
      }
    }
    b.log(Level.WARNING, "Unable to find Conscrypt");
    Object localObject2 = null;
    label149:
    Object localObject6;
    if (localObject2 != null)
    {
      ??? = new a0(null, "setUseSessionTickets", new Class[] { Boolean.TYPE });
      localObject5 = new a0(null, "setHostname", new Class[] { String.class });
      localObject1 = new a0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
      localObject6 = new a0(null, "setAlpnProtocols", new Class[] { byte[].class });
    }
    try
    {
      Class localClass = Class.forName("android.net.TrafficStats");
      localClass.getMethod("tagSocket", new Class[] { Socket.class });
      localClass.getMethod("untagSocket", new Class[] { Socket.class });
      if ((!((Provider)localObject2).getName().equals("GmsCore_OpenSSL")) && (!((Provider)localObject2).getName().equals("Conscrypt")) && (!((Provider)localObject2).getName().equals("Ssl_Guard")))
      {
        try
        {
          i.class.getClassLoader().loadClass("android.net.Network");
          k = 1;
        }
        catch (ClassNotFoundException localClassNotFoundException2)
        {
          b.log(Level.FINE, "Can't find class", localClassNotFoundException2);
          k = 0;
        }
        if (k == 0)
        {
          try
          {
            i.class.getClassLoader().loadClass("android.app.ActivityOptions");
            k = 1;
          }
          catch (ClassNotFoundException localClassNotFoundException3)
          {
            b.log(Level.FINE, "Can't find class", localClassNotFoundException3);
            k = j;
          }
          if (k != 0)
          {
            k = 2;
            break label406;
          }
          k = 3;
          break label406;
        }
      }
      k = 1;
      label406:
      localObject2 = new a((a0)???, (a0)localObject5, (a0)localObject1, (a0)localObject6, (Provider)localObject2, k);
      try
      {
        localObject5 = SSLContext.getDefault().getProvider();
        i locali;
        try
        {
          localObject2 = SSLContext.getInstance("TLS", (Provider)localObject5);
          ((SSLContext)localObject2).init(null, null, null);
          localObject2 = ((SSLContext)localObject2).createSSLEngine();
          ??? = new ib/f;
          ((f)???).<init>();
          ((Method)AccessController.doPrivileged((PrivilegedExceptionAction)???)).invoke(localObject2, new Object[0]);
          localObject2 = new ib/g;
          ((g)localObject2).<init>();
          ??? = (Method)AccessController.doPrivileged((PrivilegedExceptionAction)localObject2);
          localObject2 = new ib/h;
          ((h)localObject2).<init>();
          localObject1 = (Method)AccessController.doPrivileged((PrivilegedExceptionAction)localObject2);
          localObject2 = new ib/i$b;
          ((b)localObject2).<init>((Provider)localObject5, (Method)???, (Method)localObject1);
        }
        catch (NoSuchAlgorithmException|KeyManagementException|PrivilegedActionException|IllegalAccessException|InvocationTargetException localNoSuchAlgorithmException1)
        {
          try
          {
            Object localObject3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
            localObject6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            localObject1 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider");
            ??? = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider");
            Method localMethod1 = ((Class)localObject3).getMethod("put", new Class[] { SSLSocket.class, localObject6 });
            localObject6 = ((Class)localObject3).getMethod("get", new Class[] { SSLSocket.class });
            Method localMethod2 = ((Class)localObject3).getMethod("remove", new Class[] { SSLSocket.class });
            localObject3 = new ib/i$c;
            ((c)localObject3).<init>(localMethod1, (Method)localObject6, localMethod2, (Class)localObject1, (Class)???, (Provider)localObject5);
          }
          catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException1)
          {
            locali = new i((Provider)localObject5);
          }
        }
        d = locali;
        return;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException2)
      {
        throw new RuntimeException(localNoSuchAlgorithmException2);
      }
    }
    catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException4)
    {
      for (;;) {}
    }
  }
  
  public i(Provider paramProvider)
  {
    a = paramProvider;
  }
  
  public static byte[] b(List<j> paramList)
  {
    xc.f localf = new xc.f();
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      j localj = (j)paramList.get(j);
      if (localj != j.b)
      {
        localf.B0(a.length());
        localf.H0(a);
      }
    }
    return localf.b0(b);
  }
  
  public void a(SSLSocket paramSSLSocket) {}
  
  public void c(SSLSocket paramSSLSocket, String paramString, List<j> paramList) {}
  
  public String d(SSLSocket paramSSLSocket)
  {
    return null;
  }
  
  public int e()
  {
    return 3;
  }
  
  public static final class a
    extends i
  {
    public final a0 e;
    public final a0 f;
    public final a0 g;
    public final a0 h;
    public final int i;
    
    public a(a0 parama01, a0 parama02, a0 parama03, a0 parama04, Provider paramProvider, int paramInt)
    {
      super();
      e = parama01;
      f = parama02;
      g = parama03;
      h = parama04;
      i = paramInt;
    }
    
    public final void c(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
    {
      if (paramString != null)
      {
        e.l(paramSSLSocket, new Object[] { Boolean.TRUE });
        f.l(paramSSLSocket, new Object[] { paramString });
      }
      paramString = h;
      paramString.getClass();
      int j;
      if (paramString.b(paramSSLSocket.getClass()) != null) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        paramString = i.b(paramList);
        h.p(paramSSLSocket, new Object[] { paramString });
      }
    }
    
    public final String d(SSLSocket paramSSLSocket)
    {
      a0 locala0 = g;
      locala0.getClass();
      int j;
      if (locala0.b(paramSSLSocket.getClass()) != null) {
        j = 1;
      } else {
        j = 0;
      }
      locala0 = null;
      if (j == 0) {
        return null;
      }
      byte[] arrayOfByte = (byte[])g.p(paramSSLSocket, new Object[0]);
      paramSSLSocket = locala0;
      if (arrayOfByte != null) {
        paramSSLSocket = new String(arrayOfByte, l.b);
      }
      return paramSSLSocket;
    }
    
    public final int e()
    {
      return i;
    }
  }
  
  public static final class b
    extends i
  {
    public final Method e;
    public final Method f;
    
    public b(Provider paramProvider, Method paramMethod1, Method paramMethod2)
    {
      super();
      e = paramMethod1;
      f = paramMethod2;
    }
    
    public final void c(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
    {
      paramString = paramSSLSocket.getSSLParameters();
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        j localj = (j)paramList.next();
        if (localj != j.b) {
          localArrayList.add(a);
        }
      }
      try
      {
        e.invoke(paramString, new Object[] { localArrayList.toArray(new String[localArrayList.size()]) });
        paramSSLSocket.setSSLParameters(paramString);
        return;
      }
      catch (InvocationTargetException paramSSLSocket)
      {
        throw new RuntimeException(paramSSLSocket);
      }
      catch (IllegalAccessException paramSSLSocket)
      {
        throw new RuntimeException(paramSSLSocket);
      }
    }
    
    public final String d(SSLSocket paramSSLSocket)
    {
      try
      {
        paramSSLSocket = (String)f.invoke(paramSSLSocket, new Object[0]);
        return paramSSLSocket;
      }
      catch (InvocationTargetException paramSSLSocket)
      {
        throw new RuntimeException(paramSSLSocket);
      }
      catch (IllegalAccessException paramSSLSocket)
      {
        throw new RuntimeException(paramSSLSocket);
      }
    }
    
    public final int e()
    {
      return 1;
    }
  }
  
  public static final class c
    extends i
  {
    public final Method e;
    public final Method f;
    public final Method g;
    public final Class<?> h;
    public final Class<?> i;
    
    public c(Method paramMethod1, Method paramMethod2, Method paramMethod3, Class<?> paramClass1, Class<?> paramClass2, Provider paramProvider)
    {
      super();
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
  
  public static final class d
    implements InvocationHandler
  {
    public final List<String> a;
    public boolean b;
    public String c;
    
    public d(ArrayList paramArrayList)
    {
      a = paramArrayList;
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      String str = paramMethod.getName();
      Class localClass = paramMethod.getReturnType();
      paramObject = paramArrayOfObject;
      if (paramArrayOfObject == null) {
        paramObject = l.a;
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
 * Qualified Name:     ib.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */