package okhttp3.internal.platform;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.Conscrypt.ProviderBuilder;

public class ConscryptPlatform
  extends Platform
{
  public static ConscryptPlatform n()
  {
    try
    {
      Class.forName("org.conscrypt.Conscrypt");
      if (!Conscrypt.isAvailable()) {
        return null;
      }
      ConscryptPlatform localConscryptPlatform = new ConscryptPlatform();
      return localConscryptPlatform;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public static Provider o()
  {
    return Conscrypt.newProviderBuilder().provideTrustManager().build();
  }
  
  public final void e(SSLSocketFactory paramSSLSocketFactory)
  {
    if (Conscrypt.isConscrypt(paramSSLSocketFactory)) {
      Conscrypt.setUseEngineSocket(paramSSLSocketFactory, true);
    }
  }
  
  public final void f(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList)
  {
    if (Conscrypt.isConscrypt(paramSSLSocket))
    {
      if (paramString != null)
      {
        Conscrypt.setUseSessionTickets(paramSSLSocket, true);
        Conscrypt.setHostname(paramSSLSocket, paramString);
      }
      Conscrypt.setApplicationProtocols(paramSSLSocket, (String[])Platform.b(paramList).toArray(new String[0]));
    }
  }
  
  public final SSLContext h()
  {
    try
    {
      SSLContext localSSLContext1 = SSLContext.getInstance("TLSv1.3", o());
      return localSSLContext1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException1)
    {
      try
      {
        SSLContext localSSLContext2 = SSLContext.getInstance("TLS", o());
        return localSSLContext2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException2)
      {
        throw new IllegalStateException("No TLS provider", localNoSuchAlgorithmException1);
      }
    }
  }
  
  public final String i(SSLSocket paramSSLSocket)
  {
    if (Conscrypt.isConscrypt(paramSSLSocket)) {
      return Conscrypt.getApplicationProtocol(paramSSLSocket);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.ConscryptPlatform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */