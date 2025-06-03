package eb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class c0$a
{
  public c0$a(SSLSession paramSSLSession)
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

/* Location:
 * Qualified Name:     eb.c0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */