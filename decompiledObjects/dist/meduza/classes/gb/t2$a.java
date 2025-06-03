package gb;

import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class t2$a
  implements t2.c
{
  public final PasswordAuthentication a(String paramString, InetAddress paramInetAddress, int paramInt)
  {
    URL localURL2;
    try
    {
      URL localURL1 = new java/net/URL;
      localURL1.<init>("https", paramString, paramInt, "");
    }
    catch (MalformedURLException localMalformedURLException)
    {
      t2.d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[] { "https", paramString });
      localURL2 = null;
    }
    return Authenticator.requestPasswordAuthentication(paramString, paramInetAddress, paramInt, "https", "", null, localURL2, Authenticator.RequestorType.PROXY);
  }
}

/* Location:
 * Qualified Name:     gb.t2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */