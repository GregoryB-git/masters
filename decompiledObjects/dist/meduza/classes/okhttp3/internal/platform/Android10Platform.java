package okhttp3.internal.platform;

import aa.w;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

class Android10Platform
  extends AndroidPlatform
{
  public Android10Platform()
  {
    super(null, null, null, null);
  }
  
  public final void f(SSLSocket paramSSLSocket, String paramString, List<Protocol> paramList)
  {
    try
    {
      if (SSLSockets.isSupportedSocket(paramSSLSocket)) {
        SSLSockets.setUseSessionTickets(paramSSLSocket, true);
      }
      paramString = paramSSLSocket.getSSLParameters();
      paramString.setApplicationProtocols((String[])Platform.b(paramList).toArray(new String[0]));
      paramSSLSocket.setSSLParameters(paramString);
      return;
    }
    catch (IllegalArgumentException paramSSLSocket)
    {
      throw new IOException("Android internal error", paramSSLSocket);
    }
  }
  
  public final String i(SSLSocket paramSSLSocket)
  {
    paramSSLSocket = w.h(paramSSLSocket);
    if ((paramSSLSocket != null) && (!paramSSLSocket.isEmpty())) {
      return paramSSLSocket;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.platform.Android10Platform
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */