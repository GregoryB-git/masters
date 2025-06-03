package okhttp3;

import f;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import xc.c;

public class OkHttpClient
  implements Cloneable, Call.Factory, WebSocket.Factory
{
  public static final List<Protocol> K = Util.o(new Protocol[] { Protocol.e, Protocol.c });
  public static final List<ConnectionSpec> L = Util.o(new ConnectionSpec[] { ConnectionSpec.e, ConnectionSpec.f });
  public final ConnectionPool A;
  public final Dns B;
  public final boolean C;
  public final boolean D;
  public final boolean E;
  public final int F;
  public final int G;
  public final int H;
  public final int I;
  public final int J;
  public final Dispatcher a;
  public final Proxy b;
  public final List<Protocol> c;
  public final List<ConnectionSpec> d;
  public final List<Interceptor> e;
  public final List<Interceptor> f;
  public final EventListener.Factory o;
  public final ProxySelector p;
  public final CookieJar q;
  public final Cache r;
  public final InternalCache s;
  public final SocketFactory t;
  public final SSLSocketFactory u;
  public final CertificateChainCleaner v;
  public final HostnameVerifier w;
  public final CertificatePinner x;
  public final Authenticator y;
  public final Authenticator z;
  
  static
  {
    Internal.a = new Internal()
    {
      public final void a(Headers.Builder paramAnonymousBuilder, String paramAnonymousString)
      {
        paramAnonymousBuilder.a(paramAnonymousString);
      }
      
      public final void b(Headers.Builder paramAnonymousBuilder, String paramAnonymousString1, String paramAnonymousString2)
      {
        paramAnonymousBuilder.b(paramAnonymousString1, paramAnonymousString2);
      }
      
      public final void c(ConnectionSpec paramAnonymousConnectionSpec, SSLSocket paramAnonymousSSLSocket, boolean paramAnonymousBoolean)
      {
        if (c != null) {
          arrayOfString1 = Util.p(CipherSuite.b, paramAnonymousSSLSocket.getEnabledCipherSuites(), c);
        } else {
          arrayOfString1 = paramAnonymousSSLSocket.getEnabledCipherSuites();
        }
        String[] arrayOfString2;
        if (d != null) {
          arrayOfString2 = Util.p(Util.o, paramAnonymousSSLSocket.getEnabledProtocols(), d);
        } else {
          arrayOfString2 = paramAnonymousSSLSocket.getEnabledProtocols();
        }
        Object localObject1 = paramAnonymousSSLSocket.getSupportedCipherSuites();
        Object localObject2 = CipherSuite.b;
        byte[] arrayOfByte = Util.a;
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
        {
          arrayOfByte = localObject1[j];
          if (((CipherSuite.1)localObject2).compare(arrayOfByte, "TLS_FALLBACK_SCSV") == 0) {
            break label129;
          }
        }
        j = -1;
        label129:
        localObject2 = arrayOfString1;
        if (paramAnonymousBoolean)
        {
          localObject2 = arrayOfString1;
          if (j != -1)
          {
            localObject1 = localObject1[j];
            j = arrayOfString1.length + 1;
            localObject2 = new String[j];
            System.arraycopy(arrayOfString1, 0, localObject2, 0, arrayOfString1.length);
            localObject2[(j - 1)] = localObject1;
          }
        }
        paramAnonymousConnectionSpec = new ConnectionSpec.Builder(paramAnonymousConnectionSpec);
        paramAnonymousConnectionSpec.a((String[])localObject2);
        paramAnonymousConnectionSpec.c(arrayOfString2);
        paramAnonymousConnectionSpec = new ConnectionSpec(paramAnonymousConnectionSpec);
        String[] arrayOfString1 = d;
        if (arrayOfString1 != null) {
          paramAnonymousSSLSocket.setEnabledProtocols(arrayOfString1);
        }
        paramAnonymousConnectionSpec = c;
        if (paramAnonymousConnectionSpec != null) {
          paramAnonymousSSLSocket.setEnabledCipherSuites(paramAnonymousConnectionSpec);
        }
      }
      
      public final int d(Response.Builder paramAnonymousBuilder)
      {
        return c;
      }
      
      public final boolean e(ConnectionPool paramAnonymousConnectionPool, RealConnection paramAnonymousRealConnection)
      {
        paramAnonymousConnectionPool.getClass();
        boolean bool;
        if ((!k) && (a != 0))
        {
          paramAnonymousConnectionPool.notifyAll();
          bool = false;
        }
        else
        {
          d.remove(paramAnonymousRealConnection);
          bool = true;
        }
        return bool;
      }
      
      public final Socket f(ConnectionPool paramAnonymousConnectionPool, Address paramAnonymousAddress, StreamAllocation paramAnonymousStreamAllocation)
      {
        Iterator localIterator = d.iterator();
        RealConnection localRealConnection;
        int i;
        do
        {
          do
          {
            boolean bool = localIterator.hasNext();
            paramAnonymousConnectionPool = null;
            if (!bool) {
              break;
            }
            localRealConnection = (RealConnection)localIterator.next();
          } while (!localRealConnection.g(paramAnonymousAddress, null));
          if (h != null) {
            i = 1;
          } else {
            i = 0;
          }
        } while ((i == 0) || (localRealConnection == paramAnonymousStreamAllocation.b()));
        if ((n == null) && (j.n.size() == 1))
        {
          paramAnonymousAddress = (Reference)j.n.get(0);
          paramAnonymousConnectionPool = paramAnonymousStreamAllocation.c(true, false, false);
          j = localRealConnection;
          n.add(paramAnonymousAddress);
        }
        else
        {
          throw new IllegalStateException();
        }
        return paramAnonymousConnectionPool;
      }
      
      public final boolean g(Address paramAnonymousAddress1, Address paramAnonymousAddress2)
      {
        return paramAnonymousAddress1.a(paramAnonymousAddress2);
      }
      
      public final RealConnection h(ConnectionPool paramAnonymousConnectionPool, Address paramAnonymousAddress, StreamAllocation paramAnonymousStreamAllocation, Route paramAnonymousRoute)
      {
        Iterator localIterator = d.iterator();
        while (localIterator.hasNext())
        {
          paramAnonymousConnectionPool = (RealConnection)localIterator.next();
          if (paramAnonymousConnectionPool.g(paramAnonymousAddress, paramAnonymousRoute))
          {
            paramAnonymousStreamAllocation.a(paramAnonymousConnectionPool, true);
            return paramAnonymousConnectionPool;
          }
        }
        paramAnonymousConnectionPool = null;
        return paramAnonymousConnectionPool;
      }
      
      public final void i(ConnectionPool paramAnonymousConnectionPool, RealConnection paramAnonymousRealConnection)
      {
        if (!f)
        {
          f = true;
          ConnectionPool.g.execute(c);
        }
        d.add(paramAnonymousRealConnection);
      }
      
      public final RouteDatabase j(ConnectionPool paramAnonymousConnectionPool)
      {
        return e;
      }
      
      public final IOException k(Call paramAnonymousCall, IOException paramAnonymousIOException)
      {
        if (c.i())
        {
          paramAnonymousCall = new InterruptedIOException("timeout");
          if (paramAnonymousIOException != null) {
            paramAnonymousCall.initCause(paramAnonymousIOException);
          }
          paramAnonymousIOException = paramAnonymousCall;
        }
        return paramAnonymousIOException;
      }
    };
  }
  
  public OkHttpClient()
  {
    this(new Builder());
  }
  
  public OkHttpClient(Builder paramBuilder)
  {
    a = a;
    b = b;
    c = c;
    Object localObject1 = d;
    d = ((List)localObject1);
    e = Util.n(e);
    f = Util.n(f);
    o = g;
    p = h;
    q = i;
    r = j;
    s = k;
    t = l;
    localObject1 = ((List)localObject1).iterator();
    for (int i = 0;; i = 1)
    {
      if (!((Iterator)localObject1).hasNext()) {
        break label154;
      }
      localObject2 = (ConnectionSpec)((Iterator)localObject1).next();
      if ((i == 0) && (!a)) {
        break;
      }
    }
    label154:
    localObject1 = m;
    if ((localObject1 == null) && (i != 0)) {
      try
      {
        localObject1 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        ((TrustManagerFactory)localObject1).init(null);
        localObject1 = ((TrustManagerFactory)localObject1).getTrustManagers();
        if (localObject1.length == 1)
        {
          localObject2 = localObject1[0];
          if ((localObject2 instanceof X509TrustManager))
          {
            localObject1 = (X509TrustManager)localObject2;
            try
            {
              localObject2 = Platform.a;
              Object localObject3 = ((Platform)localObject2).h();
              ((SSLContext)localObject3).init(null, new TrustManager[] { localObject1 }, null);
              localObject3 = ((SSLContext)localObject3).getSocketFactory();
              u = ((SSLSocketFactory)localObject3);
              localObject1 = ((Platform)localObject2).c((X509TrustManager)localObject1);
            }
            catch (GeneralSecurityException paramBuilder)
            {
              throw Util.a("No System TLS", paramBuilder);
            }
          }
        }
        localObject2 = new java/lang/IllegalStateException;
        paramBuilder = new java/lang/StringBuilder;
        paramBuilder.<init>();
        paramBuilder.append("Unexpected default trust managers:");
        paramBuilder.append(Arrays.toString((Object[])localObject1));
        ((IllegalStateException)localObject2).<init>(paramBuilder.toString());
        throw ((Throwable)localObject2);
      }
      catch (GeneralSecurityException paramBuilder)
      {
        throw Util.a("No System TLS", paramBuilder);
      }
    }
    u = ((SSLSocketFactory)localObject1);
    localObject1 = n;
    v = ((CertificateChainCleaner)localObject1);
    Object localObject2 = u;
    if (localObject2 != null) {
      Platform.a.e((SSLSocketFactory)localObject2);
    }
    w = o;
    localObject2 = p;
    if (Util.k(b, localObject1)) {
      localObject1 = localObject2;
    } else {
      localObject1 = new CertificatePinner(a, (CertificateChainCleaner)localObject1);
    }
    x = ((CertificatePinner)localObject1);
    y = q;
    z = r;
    A = s;
    B = t;
    C = u;
    D = v;
    E = w;
    F = x;
    G = y;
    H = z;
    I = A;
    J = B;
    if (!e.contains(null))
    {
      if (!f.contains(null)) {
        return;
      }
      paramBuilder = f.l("Null network interceptor: ");
      paramBuilder.append(f);
      throw new IllegalStateException(paramBuilder.toString());
    }
    paramBuilder = f.l("Null interceptor: ");
    paramBuilder.append(e);
    throw new IllegalStateException(paramBuilder.toString());
  }
  
  public final Call a(Request paramRequest)
  {
    paramRequest = new RealCall(this, paramRequest, false);
    d = o.a();
    return paramRequest;
  }
  
  public static final class Builder
  {
    public int A;
    public int B;
    public Dispatcher a;
    public Proxy b;
    public List<Protocol> c;
    public List<ConnectionSpec> d;
    public final ArrayList e;
    public final ArrayList f;
    public EventListener.Factory g;
    public ProxySelector h;
    public CookieJar i;
    public Cache j;
    public InternalCache k;
    public SocketFactory l;
    public SSLSocketFactory m;
    public CertificateChainCleaner n;
    public HostnameVerifier o;
    public CertificatePinner p;
    public Authenticator q;
    public Authenticator r;
    public ConnectionPool s;
    public Dns t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    
    public Builder()
    {
      e = new ArrayList();
      f = new ArrayList();
      a = new Dispatcher();
      c = OkHttpClient.K;
      d = OkHttpClient.L;
      g = new EventListener.2(EventListener.a);
      Object localObject = ProxySelector.getDefault();
      h = ((ProxySelector)localObject);
      if (localObject == null) {
        h = new NullProxySelector();
      }
      i = CookieJar.a;
      l = SocketFactory.getDefault();
      o = OkHostnameVerifier.a;
      p = CertificatePinner.c;
      localObject = Authenticator.a;
      q = ((Authenticator)localObject);
      r = ((Authenticator)localObject);
      s = new ConnectionPool();
      t = Dns.a;
      u = true;
      v = true;
      w = true;
      x = 0;
      y = 10000;
      z = 10000;
      A = 10000;
      B = 0;
    }
    
    public Builder(OkHttpClient paramOkHttpClient)
    {
      ArrayList localArrayList1 = new ArrayList();
      e = localArrayList1;
      ArrayList localArrayList2 = new ArrayList();
      f = localArrayList2;
      a = a;
      b = b;
      c = c;
      d = d;
      localArrayList1.addAll(e);
      localArrayList2.addAll(f);
      g = o;
      h = p;
      i = q;
      k = s;
      j = r;
      l = t;
      m = u;
      n = v;
      o = w;
      p = x;
      q = y;
      r = z;
      s = A;
      t = B;
      u = C;
      v = D;
      w = E;
      x = F;
      y = G;
      z = H;
      A = I;
      B = J;
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.OkHttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */