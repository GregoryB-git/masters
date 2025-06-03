package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import f;
import java.util.HashMap;
import java.util.Map;

public class URLProtectionSpace
{
  private String host;
  private Long id;
  private int port;
  private String protocol;
  private String realm;
  private SslCertificate sslCertificate;
  private SslError sslError;
  
  public URLProtectionSpace(Long paramLong, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    id = paramLong;
    host = paramString1;
    protocol = paramString2;
    realm = paramString3;
    port = paramInt;
  }
  
  public URLProtectionSpace(String paramString1, String paramString2, String paramString3, int paramInt, SslCertificate paramSslCertificate, SslError paramSslError)
  {
    host = paramString1;
    protocol = paramString2;
    realm = paramString3;
    port = paramInt;
    sslCertificate = paramSslCertificate;
    sslError = paramSslError;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (URLProtectionSpace)paramObject;
      if (port != port) {
        return false;
      }
      if (!host.equals(host)) {
        return false;
      }
      if (!protocol.equals(protocol)) {
        return false;
      }
      Object localObject = realm;
      if (localObject != null ? !((String)localObject).equals(realm) : realm != null) {
        return false;
      }
      localObject = sslCertificate;
      if (localObject != null ? !localObject.equals(sslCertificate) : sslCertificate != null) {
        return false;
      }
      localObject = sslError;
      paramObject = sslError;
      if (localObject != null) {
        bool = localObject.equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getHost()
  {
    return host;
  }
  
  public Long getId()
  {
    return id;
  }
  
  public int getPort()
  {
    return port;
  }
  
  public String getProtocol()
  {
    return protocol;
  }
  
  public String getRealm()
  {
    return realm;
  }
  
  public SslCertificate getSslCertificate()
  {
    return sslCertificate;
  }
  
  public SslError getSslError()
  {
    return sslError;
  }
  
  public int hashCode()
  {
    int i = host.hashCode();
    int j = j.e(protocol, i * 31, 31);
    Object localObject = realm;
    int k = 0;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    } else {
      i = 0;
    }
    int m = port;
    localObject = sslCertificate;
    int n;
    if (localObject != null) {
      n = localObject.hashCode();
    } else {
      n = 0;
    }
    localObject = sslError;
    if (localObject != null) {
      k = localObject.hashCode();
    }
    return (((j + i) * 31 + m) * 31 + n) * 31 + k;
  }
  
  public void setHost(String paramString)
  {
    host = paramString;
  }
  
  public void setId(Long paramLong)
  {
    id = paramLong;
  }
  
  public void setPort(int paramInt)
  {
    port = paramInt;
  }
  
  public void setProtocol(String paramString)
  {
    protocol = paramString;
  }
  
  public void setRealm(String paramString)
  {
    realm = paramString;
  }
  
  public void setSslCertificate(SslCertificate paramSslCertificate)
  {
    sslCertificate = paramSslCertificate;
  }
  
  public void setSslError(SslError paramSslError)
  {
    sslError = paramSslError;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("host", host);
    localHashMap.put("protocol", protocol);
    localHashMap.put("realm", realm);
    localHashMap.put("port", Integer.valueOf(port));
    localHashMap.put("sslCertificate", SslCertificateExt.toMap(sslCertificate));
    localHashMap.put("sslError", SslErrorExt.toMap(sslError));
    localHashMap.put("authenticationMethod", null);
    localHashMap.put("distinguishedNames", null);
    localHashMap.put("receivesCredentialSecurely", null);
    localHashMap.put("isProxy", null);
    localHashMap.put("proxyType", null);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("URLProtectionSpace{host='");
    j.s(localStringBuilder, host, '\'', ", protocol='");
    j.s(localStringBuilder, protocol, '\'', ", realm='");
    j.s(localStringBuilder, realm, '\'', ", port=");
    localStringBuilder.append(port);
    localStringBuilder.append(", sslCertificate=");
    localStringBuilder.append(sslCertificate);
    localStringBuilder.append(", sslError=");
    localStringBuilder.append(sslError);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */