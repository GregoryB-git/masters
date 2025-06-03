package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

public final class Handshake
{
  public final TlsVersion a;
  public final CipherSuite b;
  public final List<Certificate> c;
  public final List<Certificate> d;
  
  public Handshake(TlsVersion paramTlsVersion, CipherSuite paramCipherSuite, List<Certificate> paramList1, List<Certificate> paramList2)
  {
    a = paramTlsVersion;
    b = paramCipherSuite;
    c = paramList1;
    d = paramList2;
  }
  
  public static Handshake a(SSLSession paramSSLSession)
  {
    Object localObject1 = paramSSLSession.getCipherSuite();
    if (localObject1 != null)
    {
      if (!"SSL_NULL_WITH_NULL_NULL".equals(localObject1))
      {
        CipherSuite localCipherSuite = CipherSuite.a((String)localObject1);
        localObject1 = paramSSLSession.getProtocol();
        if (localObject1 != null)
        {
          if (!"NONE".equals(localObject1))
          {
            TlsVersion localTlsVersion = TlsVersion.f((String)localObject1);
            Object localObject2;
            try
            {
              localObject1 = paramSSLSession.getPeerCertificates();
            }
            catch (SSLPeerUnverifiedException localSSLPeerUnverifiedException)
            {
              localObject2 = null;
            }
            if (localObject2 != null) {
              localObject2 = Util.o((Object[])localObject2);
            } else {
              localObject2 = Collections.emptyList();
            }
            paramSSLSession = paramSSLSession.getLocalCertificates();
            if (paramSSLSession != null) {
              paramSSLSession = Util.o(paramSSLSession);
            } else {
              paramSSLSession = Collections.emptyList();
            }
            return new Handshake(localTlsVersion, localCipherSuite, (List)localObject2, paramSSLSession);
          }
          throw new IOException("tlsVersion == NONE");
        }
        throw new IllegalStateException("tlsVersion == null");
      }
      throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
    }
    throw new IllegalStateException("cipherSuite == null");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Handshake;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Handshake)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b))
      {
        bool1 = bool2;
        if (c.equals(c))
        {
          bool1 = bool2;
          if (d.equals(d)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    int k = c.hashCode();
    return d.hashCode() + (k + (j + (i + 527) * 31) * 31) * 31;
  }
}

/* Location:
 * Qualified Name:     okhttp3.Handshake
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */