package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public class NullProxySelector
  extends ProxySelector
{
  public final void connectFailed(URI paramURI, SocketAddress paramSocketAddress, IOException paramIOException) {}
  
  public final List<Proxy> select(URI paramURI)
  {
    if (paramURI != null) {
      return Collections.singletonList(Proxy.NO_PROXY);
    }
    throw new IllegalArgumentException("uri must not be null");
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.proxy.NullProxySelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */