package okhttp3;

import f;
import g;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.Util;

public final class Address
{
  public final HttpUrl a;
  public final Dns b;
  public final SocketFactory c;
  public final Authenticator d;
  public final List<Protocol> e;
  public final List<ConnectionSpec> f;
  public final ProxySelector g;
  public final Proxy h;
  public final SSLSocketFactory i;
  public final HostnameVerifier j;
  public final CertificatePinner k;
  
  public Address(String paramString, int paramInt, Dns paramDns, SocketFactory paramSocketFactory, SSLSocketFactory paramSSLSocketFactory, HostnameVerifier paramHostnameVerifier, CertificatePinner paramCertificatePinner, Authenticator paramAuthenticator, Proxy paramProxy, List<Protocol> paramList, List<ConnectionSpec> paramList1, ProxySelector paramProxySelector)
  {
    HttpUrl.Builder localBuilder = new HttpUrl.Builder();
    String str1 = "https";
    String str2;
    if (paramSSLSocketFactory != null) {
      str2 = "https";
    } else {
      str2 = "http";
    }
    if (str2.equalsIgnoreCase("http"))
    {
      str2 = "http";
    }
    else
    {
      if (!str2.equalsIgnoreCase("https")) {
        break label320;
      }
      str2 = str1;
    }
    a = str2;
    if (paramString != null)
    {
      str2 = Util.c(HttpUrl.j(0, paramString.length(), paramString, false));
      if (str2 != null)
      {
        d = str2;
        if ((paramInt > 0) && (paramInt <= 65535))
        {
          e = paramInt;
          a = localBuilder.a();
          if (paramDns != null)
          {
            b = paramDns;
            if (paramSocketFactory != null)
            {
              c = paramSocketFactory;
              if (paramAuthenticator != null)
              {
                d = paramAuthenticator;
                if (paramList != null)
                {
                  e = Util.n(paramList);
                  if (paramList1 != null)
                  {
                    f = Util.n(paramList1);
                    if (paramProxySelector != null)
                    {
                      g = paramProxySelector;
                      h = paramProxy;
                      i = paramSSLSocketFactory;
                      j = paramHostnameVerifier;
                      k = paramCertificatePinner;
                      return;
                    }
                    throw new NullPointerException("proxySelector == null");
                  }
                  throw new NullPointerException("connectionSpecs == null");
                }
                throw new NullPointerException("protocols == null");
              }
              throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
          }
          throw new NullPointerException("dns == null");
        }
        throw new IllegalArgumentException(f.h("unexpected port: ", paramInt));
      }
      throw new IllegalArgumentException(g.d("unexpected host: ", paramString));
    }
    throw new NullPointerException("host == null");
    label320:
    throw new IllegalArgumentException(g.d("unexpected scheme: ", str2));
  }
  
  public final boolean a(Address paramAddress)
  {
    boolean bool;
    if ((b.equals(b)) && (d.equals(d)) && (e.equals(e)) && (f.equals(f)) && (g.equals(g)) && (Util.k(h, h)) && (Util.k(i, i)) && (Util.k(j, j)) && (Util.k(k, k)) && (a.e == a.e)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Address))
    {
      HttpUrl localHttpUrl = a;
      paramObject = (Address)paramObject;
      if ((localHttpUrl.equals(a)) && (a((Address)paramObject))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final int hashCode()
  {
    int m = a.hashCode();
    int n = b.hashCode();
    int i1 = d.hashCode();
    int i2 = e.hashCode();
    int i3 = f.hashCode();
    int i4 = g.hashCode();
    Object localObject = h;
    int i5 = 0;
    int i6;
    if (localObject != null) {
      i6 = ((Proxy)localObject).hashCode();
    } else {
      i6 = 0;
    }
    localObject = i;
    int i7;
    if (localObject != null) {
      i7 = localObject.hashCode();
    } else {
      i7 = 0;
    }
    localObject = j;
    int i8;
    if (localObject != null) {
      i8 = localObject.hashCode();
    } else {
      i8 = 0;
    }
    localObject = k;
    if (localObject != null) {
      i5 = ((CertificatePinner)localObject).hashCode();
    }
    return ((((i4 + (i3 + (i2 + (i1 + (n + (m + 527) * 31) * 31) * 31) * 31) * 31) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i5;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Address{");
    localStringBuilder.append(a.d);
    localStringBuilder.append(":");
    localStringBuilder.append(a.e);
    Object localObject;
    if (h != null)
    {
      localStringBuilder.append(", proxy=");
      localObject = h;
    }
    else
    {
      localStringBuilder.append(", proxySelector=");
      localObject = g;
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     okhttp3.Address
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */