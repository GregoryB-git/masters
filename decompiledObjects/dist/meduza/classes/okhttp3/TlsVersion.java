package okhttp3;

import g;

public enum TlsVersion
{
  public final String a;
  
  static
  {
    TlsVersion localTlsVersion1 = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
    b = localTlsVersion1;
    TlsVersion localTlsVersion2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
    c = localTlsVersion2;
    TlsVersion localTlsVersion3 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
    d = localTlsVersion3;
    TlsVersion localTlsVersion4 = new TlsVersion("TLS_1_0", 3, "TLSv1");
    e = localTlsVersion4;
    TlsVersion localTlsVersion5 = new TlsVersion("SSL_3_0", 4, "SSLv3");
    f = localTlsVersion5;
    o = new TlsVersion[] { localTlsVersion1, localTlsVersion2, localTlsVersion3, localTlsVersion4, localTlsVersion5 };
  }
  
  public TlsVersion(String paramString)
  {
    a = paramString;
  }
  
  public static TlsVersion f(String paramString)
  {
    paramString.getClass();
    paramString.hashCode();
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 79923350: 
      if (paramString.equals("TLSv1")) {
        i = 4;
      }
      break;
    case 79201641: 
      if (paramString.equals("SSLv3")) {
        i = 3;
      }
      break;
    case -503070501: 
      if (paramString.equals("TLSv1.3")) {
        i = 2;
      }
      break;
    case -503070502: 
      if (paramString.equals("TLSv1.2")) {
        i = 1;
      }
      break;
    case -503070503: 
      if (paramString.equals("TLSv1.1")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      throw new IllegalArgumentException(g.d("Unexpected TLS version: ", paramString));
    case 4: 
      return e;
    case 3: 
      return f;
    case 2: 
      return b;
    case 1: 
      return c;
    }
    return d;
  }
}

/* Location:
 * Qualified Name:     okhttp3.TlsVersion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */