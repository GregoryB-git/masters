package okhttp3;

import f;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class CipherSuite
{
  public static final Comparator<String> b = new Comparator()
  {
    public final int compare(Object paramAnonymousObject1, Object paramAnonymousObject2)
    {
      paramAnonymousObject1 = (String)paramAnonymousObject1;
      paramAnonymousObject2 = (String)paramAnonymousObject2;
      int i = Math.min(((String)paramAnonymousObject1).length(), ((String)paramAnonymousObject2).length());
      int j = 4;
      int k = -1;
      if (j < i)
      {
        int m = ((String)paramAnonymousObject1).charAt(j);
        int n = ((String)paramAnonymousObject2).charAt(j);
        if (m != n) {
          if (m < n)
          {
            j = k;
            break label116;
          }
        }
      }
      do
      {
        j = 1;
        break label116;
        j++;
        break;
        i = ((String)paramAnonymousObject1).length();
        j = ((String)paramAnonymousObject2).length();
        if (i == j) {
          break label113;
        }
      } while (i >= j);
      j = k;
      break label116;
      label113:
      j = 0;
      label116:
      return j;
    }
  };
  public static final LinkedHashMap c = new LinkedHashMap();
  public static final CipherSuite d;
  public static final CipherSuite e;
  public static final CipherSuite f;
  public static final CipherSuite g;
  public static final CipherSuite h;
  public static final CipherSuite i;
  public static final CipherSuite j;
  public static final CipherSuite k;
  public static final CipherSuite l;
  public static final CipherSuite m;
  public static final CipherSuite n;
  public static final CipherSuite o;
  public static final CipherSuite p;
  public static final CipherSuite q = b("TLS_AES_128_GCM_SHA256");
  public static final CipherSuite r = b("TLS_AES_256_GCM_SHA384");
  public static final CipherSuite s = b("TLS_CHACHA20_POLY1305_SHA256");
  public static final CipherSuite t = b("TLS_AES_128_CCM_SHA256");
  public static final CipherSuite u = b("TLS_AES_256_CCM_8_SHA256");
  public final String a;
  
  static
  {
    b("SSL_RSA_WITH_NULL_MD5");
    b("SSL_RSA_WITH_NULL_SHA");
    b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    b("SSL_RSA_WITH_RC4_128_MD5");
    b("SSL_RSA_WITH_RC4_128_SHA");
    b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    b("SSL_RSA_WITH_DES_CBC_SHA");
    d = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    b("SSL_DH_anon_WITH_RC4_128_MD5");
    b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    b("SSL_DH_anon_WITH_DES_CBC_SHA");
    b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    b("TLS_KRB5_WITH_DES_CBC_SHA");
    b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    b("TLS_KRB5_WITH_RC4_128_SHA");
    b("TLS_KRB5_WITH_DES_CBC_MD5");
    b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    b("TLS_KRB5_WITH_RC4_128_MD5");
    b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    e = b("TLS_RSA_WITH_AES_128_CBC_SHA");
    b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    f = b("TLS_RSA_WITH_AES_256_CBC_SHA");
    b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    b("TLS_RSA_WITH_NULL_SHA256");
    b("TLS_RSA_WITH_AES_128_CBC_SHA256");
    b("TLS_RSA_WITH_AES_256_CBC_SHA256");
    b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    b("TLS_PSK_WITH_RC4_128_SHA");
    b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    b("TLS_PSK_WITH_AES_128_CBC_SHA");
    b("TLS_PSK_WITH_AES_256_CBC_SHA");
    b("TLS_RSA_WITH_SEED_CBC_SHA");
    g = b("TLS_RSA_WITH_AES_128_GCM_SHA256");
    h = b("TLS_RSA_WITH_AES_256_GCM_SHA384");
    b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    b("TLS_FALLBACK_SCSV");
    b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    b("TLS_ECDH_RSA_WITH_NULL_SHA");
    b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    b("TLS_ECDHE_RSA_WITH_NULL_SHA");
    b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    i = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    j = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    b("TLS_ECDH_anon_WITH_NULL_SHA");
    b("TLS_ECDH_anon_WITH_RC4_128_SHA");
    b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    k = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    l = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    m = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    n = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    o = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    p = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
  }
  
  public CipherSuite(String paramString)
  {
    paramString.getClass();
    a = paramString;
  }
  
  public static CipherSuite a(String paramString)
  {
    try
    {
      LinkedHashMap localLinkedHashMap = c;
      CipherSuite localCipherSuite1 = (CipherSuite)localLinkedHashMap.get(paramString);
      CipherSuite localCipherSuite2 = localCipherSuite1;
      if (localCipherSuite1 == null)
      {
        localCipherSuite1 = (CipherSuite)localLinkedHashMap.get(c(paramString));
        localCipherSuite2 = localCipherSuite1;
        if (localCipherSuite1 == null)
        {
          localCipherSuite2 = new okhttp3/CipherSuite;
          localCipherSuite2.<init>(paramString);
        }
        localLinkedHashMap.put(paramString, localCipherSuite2);
      }
      return localCipherSuite2;
    }
    finally {}
  }
  
  public static CipherSuite b(String paramString)
  {
    CipherSuite localCipherSuite = new CipherSuite(paramString);
    c.put(paramString, localCipherSuite);
    return localCipherSuite;
  }
  
  public static String c(String paramString)
  {
    if (paramString.startsWith("TLS_"))
    {
      localObject = f.l("SSL_");
      ((StringBuilder)localObject).append(paramString.substring(4));
      return ((StringBuilder)localObject).toString();
    }
    Object localObject = paramString;
    if (paramString.startsWith("SSL_"))
    {
      localObject = f.l("TLS_");
      ((StringBuilder)localObject).append(paramString.substring(4));
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     okhttp3.CipherSuite
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */