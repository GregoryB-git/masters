package okhttp3.internal.platform;

import android.os.Build.VERSION;
import g;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

public class Platform
{
  public static final Platform a;
  public static final Logger b;
  
  static
  {
    bool = "Dalvik".equals(System.getProperty("java.vm.name"));
    localObject1 = null;
    localObject2 = null;
    if ((!bool) || ("Dalvik".equals(System.getProperty("java.vm.name")))) {}
    try
    {
      try
      {
        i = Build.VERSION.SDK_INT;
      }
      catch (NoClassDefFoundError localNoClassDefFoundError)
      {
        i = 0;
      }
      if (i >= 29)
      {
        Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        localObject3 = new Android10Platform();
      }
    }
    catch (ClassNotFoundException localClassNotFoundException4)
    {
      try
      {
        int i;
        Object localObject3;
        Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
        localObject8 = new okhttp3/internal/platform/OptionalMethod;
        ((OptionalMethod)localObject8).<init>(null, "setUseSessionTickets", new Class[] { Boolean.TYPE });
        localObject9 = new okhttp3/internal/platform/OptionalMethod;
        ((OptionalMethod)localObject9).<init>(null, "setHostname", new Class[] { String.class });
        Provider localProvider = Security.getProvider("GMSCore_OpenSSL");
        if (localProvider != null) {
          break label183;
        }
        try
        {
          Class.forName("android.net.Network");
          i = 1;
        }
        catch (ClassNotFoundException localClassNotFoundException2)
        {
          i = 0;
        }
        if (i == 0) {
          break label237;
        }
        Object localObject4 = new okhttp3/internal/platform/OptionalMethod;
        ((OptionalMethod)localObject4).<init>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        localObject1 = new okhttp3/internal/platform/OptionalMethod;
        ((OptionalMethod)localObject1).<init>(null, "setAlpnProtocols", new Class[] { byte[].class });
        break label243;
        localObject4 = null;
        localObject1 = localObject4;
        localObject10 = new okhttp3/internal/platform/AndroidPlatform;
        ((AndroidPlatform)localObject10).<init>((OptionalMethod)localObject8, (OptionalMethod)localObject9, (OptionalMethod)localObject4, (OptionalMethod)localObject1);
        localObject4 = localObject10;
        if (localObject4 != null) {
          break label515;
        }
        throw new NullPointerException("No platform found on Android");
        if (!"conscrypt".equals(System.getProperty("okhttp.platform"))) {
          break label300;
        }
        bool = true;
        break label314;
        bool = "Conscrypt".equals(Security.getProviders()[0].getName());
        if (!bool) {
          break label331;
        }
        localObject4 = ConscryptPlatform.n();
        if (localObject4 != null) {
          break label515;
        }
        try
        {
          localObject2 = SSLParameters.class.getMethod("setApplicationProtocols", new Class[] { String[].class });
          localObject10 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
          localObject4 = new okhttp3/internal/platform/Jdk9Platform;
          ((Jdk9Platform)localObject4).<init>((Method)localObject2, (Method)localObject10);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          localObject5 = null;
        }
        if (localObject5 == null) {
          break label390;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException4)
      {
        try
        {
          for (;;)
          {
            Object localObject5 = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Object localObject9 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            localObject2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider");
            Object localObject10 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider");
            localObject9 = ((Class)localObject5).getMethod("put", new Class[] { SSLSocket.class, localObject9 });
            Object localObject8 = ((Class)localObject5).getMethod("get", new Class[] { SSLSocket.class });
            Method localMethod = ((Class)localObject5).getMethod("remove", new Class[] { SSLSocket.class });
            localObject5 = new okhttp3/internal/platform/JdkWithJettyBootPlatform;
            ((JdkWithJettyBootPlatform)localObject5).<init>((Method)localObject9, (Method)localObject8, localMethod, (Class)localObject2, (Class)localObject10);
            if (localObject5 == null)
            {
              localObject5 = new Platform();
              continue;
              a = (Platform)localObject5;
              b = Logger.getLogger(OkHttpClient.class.getName());
              return;
              localClassNotFoundException3 = localClassNotFoundException3;
            }
          }
          localClassNotFoundException4 = localClassNotFoundException4;
          Object localObject6 = localObject2;
        }
        catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException5)
        {
          for (;;)
          {
            Object localObject7 = localObject1;
          }
        }
      }
    }
    localObject3 = null;
    if (localObject3 == null) {
      if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
        localObject3 = localObject2;
      } else {
        try
        {
          Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        }
        catch (ClassNotFoundException localClassNotFoundException1) {}
      }
    }
  }
  
  public static ArrayList b(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Protocol localProtocol = (Protocol)paramList.get(j);
      if (localProtocol != Protocol.b) {
        localArrayList.add(a);
      }
    }
    return localArrayList;
  }
  
  public void a(SSLSocket paramSSLSocket) {}
  
  public CertificateChainCleaner c(X509TrustManager paramX509TrustManager)
  {
    return new BasicCertificateChainCleaner(d(paramX509TrustManager));
  }
  
  public TrustRootIndex d(X509TrustManager paramX509TrustManager)
  {
    return new BasicTrustRootIndex(paramX509TrustManager.getAcceptedIssuers());
  }
  
  public void e(SSLSocketFactory paramSSLSocketFactory) {}
  
  public void f(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList) {}
  
  public void g(Socket paramSocket, InetSocketAddress paramInetSocketAddress, int paramInt)
  {
    paramSocket.connect(paramInetSocketAddress, paramInt);
  }
  
  public SSLContext h()
  {
    if ("1.7".equals(System.getProperty("java.specification.version"))) {}
    for (;;)
    {
      try
      {
        localSSLContext = SSLContext.getInstance("TLSv1.2");
        return localSSLContext;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException2)
      {
        SSLContext localSSLContext;
        continue;
      }
      try
      {
        localSSLContext = SSLContext.getInstance("TLS");
        return localSSLContext;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException1)
      {
        throw new IllegalStateException("No TLS provider", localNoSuchAlgorithmException1);
      }
    }
  }
  
  public String i(SSLSocket paramSSLSocket)
  {
    return null;
  }
  
  public Object j()
  {
    if (b.isLoggable(Level.FINE)) {
      return new Throwable("response.body().close()");
    }
    return null;
  }
  
  public boolean k(String paramString)
  {
    return true;
  }
  
  public void l(int paramInt, String paramString, Throwable paramThrowable)
  {
    Level localLevel;
    if (paramInt == 5) {
      localLevel = Level.WARNING;
    } else {
      localLevel = Level.INFO;
    }
    b.log(localLevel, paramString, paramThrowable);
  }
  
  public void m(Object paramObject, String paramString)
  {
    String str = paramString;
    if (paramObject == null) {
      str = g.d(paramString, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
    }
    l(5, str, (Throwable)paramObject);
  }
  
  public final String toString()
  {
    return getClass().getSimpleName();
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.Platform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */