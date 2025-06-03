package okhttp3.internal.connection;

import f;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;

public final class ConnectionSpecSelector
{
  public final List<ConnectionSpec> a;
  public int b = 0;
  public boolean c;
  public boolean d;
  
  public ConnectionSpecSelector(List<ConnectionSpec> paramList)
  {
    a = paramList;
  }
  
  public final ConnectionSpec a(SSLSocket paramSSLSocket)
  {
    int i = b;
    int j = a.size();
    boolean bool;
    for (;;)
    {
      bool = true;
      if (i >= j) {
        break;
      }
      localObject = (ConnectionSpec)a.get(i);
      if (((ConnectionSpec)localObject).a(paramSSLSocket))
      {
        b = (i + 1);
        break label66;
      }
      i++;
    }
    Object localObject = null;
    label66:
    if (localObject != null)
    {
      for (i = b; i < a.size(); i++) {
        if (((ConnectionSpec)a.get(i)).a(paramSSLSocket)) {
          break label121;
        }
      }
      bool = false;
      label121:
      c = bool;
      Internal.a.c((ConnectionSpec)localObject, paramSSLSocket, d);
      return (ConnectionSpec)localObject;
    }
    localObject = f.l("Unable to find acceptable protocols. isFallback=");
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append(", modes=");
    ((StringBuilder)localObject).append(a);
    ((StringBuilder)localObject).append(", supported protocols=");
    ((StringBuilder)localObject).append(Arrays.toString(paramSSLSocket.getEnabledProtocols()));
    throw new UnknownServiceException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.connection.ConnectionSpecSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */