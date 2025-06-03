package eb;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class c0
{
  public static final Logger d = Logger.getLogger(c0.class.getName());
  public static final c0 e = new c0();
  public final ConcurrentSkipListMap a;
  public final ConcurrentHashMap b;
  public final ConcurrentHashMap c;
  
  public c0()
  {
    new ConcurrentSkipListMap();
    a = new ConcurrentSkipListMap();
    b = new ConcurrentHashMap();
    c = new ConcurrentHashMap();
    new ConcurrentHashMap();
  }
  
  public static void a(AbstractMap paramAbstractMap, e0 parame0)
  {
    paramAbstractMap = (e0)paramAbstractMap.put(Long.valueOf(fc), parame0);
  }
  
  public static void b(AbstractMap paramAbstractMap, e0 parame0)
  {
    paramAbstractMap = (e0)paramAbstractMap.remove(Long.valueOf(fc));
  }
  
  public static final class a
  {
    public a(SSLSession paramSSLSession)
    {
      paramSSLSession.getCipherSuite();
      Object localObject = paramSSLSession.getLocalCertificates();
      if (localObject != null) {
        localObject = localObject[0];
      }
      try
      {
        localObject = paramSSLSession.getPeerCertificates();
        if (localObject != null) {
          paramSSLSession = localObject[0];
        }
      }
      catch (SSLPeerUnverifiedException localSSLPeerUnverifiedException)
      {
        c0.d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", new Object[] { paramSSLSession.getPeerHost() }), localSSLPeerUnverifiedException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     eb.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */