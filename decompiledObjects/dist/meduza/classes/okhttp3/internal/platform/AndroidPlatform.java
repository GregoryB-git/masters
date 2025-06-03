package okhttp3.internal.platform;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import xc.f;

class AndroidPlatform
  extends Platform
{
  public final OptionalMethod<Socket> c;
  public final OptionalMethod<Socket> d;
  public final OptionalMethod<Socket> e;
  public final OptionalMethod<Socket> f;
  public final CloseGuard g;
  
  public AndroidPlatform(OptionalMethod paramOptionalMethod1, OptionalMethod paramOptionalMethod2, OptionalMethod paramOptionalMethod3, OptionalMethod paramOptionalMethod4)
  {
    Object localObject1 = null;
    Object localObject4;
    Object localObject3;
    try
    {
      Object localObject2 = Class.forName("dalvik.system.CloseGuard");
      localObject4 = ((Class)localObject2).getMethod("get", new Class[0]);
      Method localMethod = ((Class)localObject2).getMethod("open", new Class[] { String.class });
      localObject2 = ((Class)localObject2).getMethod("warnIfOpen", new Class[0]);
      localObject1 = localObject4;
      localObject4 = localObject2;
      localObject2 = localMethod;
    }
    catch (Exception localException)
    {
      localObject4 = null;
      localObject3 = localObject4;
    }
    g = new CloseGuard((Method)localObject1, (Method)localObject3, (Method)localObject4);
    c = paramOptionalMethod1;
    d = paramOptionalMethod2;
    e = paramOptionalMethod3;
    f = paramOptionalMethod4;
  }
  
  public static boolean n(Class paramClass, Object paramObject, String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    try
    {
      bool2 = ((Boolean)paramClass.getMethod("isCleartextTrafficPermitted", new Class[] { String.class }).invoke(paramObject, new Object[] { paramString })).booleanValue();
      return bool2;
    }
    catch (NoSuchMethodException paramString) {}
    try
    {
      bool2 = ((Boolean)paramClass.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(paramObject, new Object[0])).booleanValue();
      bool1 = bool2;
    }
    catch (NoSuchMethodException paramClass)
    {
      for (;;) {}
    }
    return bool1;
  }
  
  public final CertificateChainCleaner c(X509TrustManager paramX509TrustManager)
  {
    try
    {
      Object localObject = Class.forName("android.net.http.X509TrustManagerExtensions");
      localObject = new AndroidCertificateChainCleaner(((Class)localObject).getConstructor(new Class[] { X509TrustManager.class }).newInstance(new Object[] { paramX509TrustManager }), ((Class)localObject).getMethod("checkServerTrusted", new Class[] { X509Certificate[].class, String.class, String.class }));
      return (CertificateChainCleaner)localObject;
    }
    catch (Exception localException) {}
    return super.c(paramX509TrustManager);
  }
  
  public final TrustRootIndex d(X509TrustManager paramX509TrustManager)
  {
    try
    {
      Object localObject = paramX509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[] { X509Certificate.class });
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = new AndroidTrustRootIndex(paramX509TrustManager, (Method)localObject);
      return (TrustRootIndex)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    return new BasicTrustRootIndex(paramX509TrustManager.getAcceptedIssuers());
  }
  
  public void f(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList)
  {
    if (paramString != null)
    {
      c.c(paramSSLSocket, new Object[] { Boolean.TRUE });
      d.c(paramSSLSocket, new Object[] { paramString });
    }
    paramString = f;
    if (paramString != null)
    {
      int i;
      if (paramString.a(paramSSLSocket.getClass()) != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        f localf = new f();
        int j = paramList.size();
        for (i = 0; i < j; i++)
        {
          paramString = (Protocol)paramList.get(i);
          if (paramString != Protocol.b)
          {
            localf.B0(a.length());
            localf.H0(a);
          }
        }
        paramList = localf.b0(b);
        paramString = f;
        paramString.getClass();
        try
        {
          paramString.b(paramSSLSocket, new Object[] { paramList });
        }
        catch (InvocationTargetException paramSSLSocket)
        {
          paramString = paramSSLSocket.getTargetException();
          if ((paramString instanceof RuntimeException)) {
            throw ((RuntimeException)paramString);
          }
          paramSSLSocket = new AssertionError("Unexpected exception");
          paramSSLSocket.initCause(paramString);
          throw paramSSLSocket;
        }
      }
    }
  }
  
  public final void g(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    try
    {
      paramSocket.connect(paramInetSocketAddress, paramInt);
      return;
    }
    catch (ClassCastException paramInetSocketAddress)
    {
      if (Build.VERSION.SDK_INT == 26)
      {
        paramSocket = new IOException("Exception in connect");
        paramSocket.initCause(paramInetSocketAddress);
        throw paramSocket;
      }
      throw paramInetSocketAddress;
    }
    catch (SecurityException paramInetSocketAddress)
    {
      paramSocket = new IOException("Exception in connect");
      paramSocket.initCause(paramInetSocketAddress);
      throw paramSocket;
    }
    catch (AssertionError paramSocket)
    {
      if (Util.q(paramSocket)) {
        throw new IOException(paramSocket);
      }
      throw paramSocket;
    }
  }
  
  public final SSLContext h()
  {
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("TLS");
      return localSSLContext;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new IllegalStateException("No TLS provider", localNoSuchAlgorithmException);
    }
  }
  
  public String i(SSLSocket paramSSLSocket)
  {
    Object localObject = e;
    Throwable localThrowable = null;
    if (localObject == null) {
      return null;
    }
    int i;
    if (((OptionalMethod)localObject).a(paramSSLSocket.getClass()) != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return null;
    }
    localObject = e;
    localObject.getClass();
    try
    {
      paramSSLSocket = ((OptionalMethod)localObject).b(paramSSLSocket, new Object[0]);
      localObject = (byte[])paramSSLSocket;
      paramSSLSocket = localThrowable;
      if (localObject != null) {
        paramSSLSocket = new String((byte[])localObject, Util.i);
      }
      return paramSSLSocket;
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      localThrowable = paramSSLSocket.getTargetException();
      if ((localThrowable instanceof RuntimeException)) {
        throw ((RuntimeException)localThrowable);
      }
      paramSSLSocket = new AssertionError("Unexpected exception");
      paramSSLSocket.initCause(localThrowable);
      throw paramSSLSocket;
    }
  }
  
  public final Object j()
  {
    CloseGuard localCloseGuard = g;
    Method localMethod = a;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localMethod != null) {}
    try
    {
      localObject2 = localMethod.invoke(null, new Object[0]);
      b.invoke(localObject2, new Object[] { "response.body().close()" });
      return localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = localObject1;
      }
    }
  }
  
  public final boolean k(String paramString)
  {
    try
    {
      try
      {
        Class localClass = Class.forName("android.security.NetworkSecurityPolicy");
        boolean bool = n(localClass, localClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), paramString);
        return bool;
      }
      catch (InvocationTargetException paramString) {}catch (IllegalArgumentException paramString) {}catch (IllegalAccessException paramString) {}
      throw Util.a("unable to determine cleartext support", paramString);
    }
    catch (ClassNotFoundException|NoSuchMethodException paramString) {}
    return true;
  }
  
  public final void l(int paramInt, String paramString, Throwable paramThrowable)
  {
    int i = 5;
    if (paramInt != 5) {
      i = 3;
    }
    Object localObject = paramString;
    if (paramThrowable != null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append('\n');
      ((StringBuilder)localObject).append(Log.getStackTraceString(paramThrowable));
      localObject = ((StringBuilder)localObject).toString();
    }
    paramInt = 0;
    int j = ((String)localObject).length();
    if (paramInt < j)
    {
      int k = ((String)localObject).indexOf('\n', paramInt);
      if (k == -1) {
        k = j;
      }
      for (;;)
      {
        int m = Math.min(k, paramInt + 4000);
        Log.println(i, "OkHttp", ((String)localObject).substring(paramInt, m));
        if (m >= k)
        {
          paramInt = m + 1;
          break;
        }
        paramInt = m;
      }
    }
  }
  
  public final void m(Object paramObject, String paramString)
  {
    CloseGuard localCloseGuard = g;
    localCloseGuard.getClass();
    i = 0;
    j = i;
    if (paramObject != null) {}
    try
    {
      c.invoke(paramObject, new Object[0]);
      j = 1;
    }
    catch (Exception paramObject)
    {
      for (;;)
      {
        j = i;
      }
    }
    if (j == 0) {
      l(5, paramString, null);
    }
  }
  
  public static final class AndroidCertificateChainCleaner
    extends CertificateChainCleaner
  {
    public final Object a;
    public final Method b;
    
    public AndroidCertificateChainCleaner(Object paramObject, Method paramMethod)
    {
      a = paramObject;
      b = paramMethod;
    }
    
    public final List a(String paramString, List paramList)
    {
      try
      {
        paramList = (X509Certificate[])paramList.toArray(new X509Certificate[paramList.size()]);
        paramString = (List)b.invoke(a, new Object[] { paramList, "RSA", paramString });
        return paramString;
      }
      catch (IllegalAccessException paramString)
      {
        throw new AssertionError(paramString);
      }
      catch (InvocationTargetException paramString)
      {
        paramList = new SSLPeerUnverifiedException(paramString.getMessage());
        paramList.initCause(paramString);
        throw paramList;
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      return paramObject instanceof AndroidCertificateChainCleaner;
    }
    
    public final int hashCode()
    {
      return 0;
    }
  }
  
  public static final class AndroidTrustRootIndex
    implements TrustRootIndex
  {
    public final X509TrustManager a;
    public final Method b;
    
    public AndroidTrustRootIndex(X509TrustManager paramX509TrustManager, Method paramMethod)
    {
      b = paramMethod;
      a = paramX509TrustManager;
    }
    
    public final X509Certificate a(X509Certificate paramX509Certificate)
    {
      try
      {
        paramX509Certificate = (TrustAnchor)b.invoke(a, new Object[] { paramX509Certificate });
        if (paramX509Certificate != null) {
          paramX509Certificate = paramX509Certificate.getTrustedCert();
        }
      }
      catch (IllegalAccessException paramX509Certificate)
      {
        throw Util.a("unable to get issues and signature", paramX509Certificate);
      }
      catch (InvocationTargetException paramX509Certificate)
      {
        for (;;) {}
      }
      paramX509Certificate = null;
      return paramX509Certificate;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof AndroidTrustRootIndex)) {
        return false;
      }
      paramObject = (AndroidTrustRootIndex)paramObject;
      if ((!a.equals(a)) || (!b.equals(b))) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      int i = a.hashCode();
      return b.hashCode() * 31 + i;
    }
  }
  
  public static final class CloseGuard
  {
    public final Method a;
    public final Method b;
    public final Method c;
    
    public CloseGuard(Method paramMethod1, Method paramMethod2, Method paramMethod3)
    {
      a = paramMethod1;
      b = paramMethod2;
      c = paramMethod3;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.AndroidPlatform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */