package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

public final class OkHttpClient$Builder
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
  
  public OkHttpClient$Builder()
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
  
  public OkHttpClient$Builder(OkHttpClient paramOkHttpClient)
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

/* Location:
 * Qualified Name:     okhttp3.OkHttpClient.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */