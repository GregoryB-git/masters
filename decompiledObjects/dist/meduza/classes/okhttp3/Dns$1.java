package okhttp3;

import g;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

class Dns$1
  implements Dns
{
  public final List<InetAddress> a(String paramString)
  {
    if (paramString != null) {
      try
      {
        List localList = Arrays.asList(InetAddress.getAllByName(paramString));
        return localList;
      }
      catch (NullPointerException localNullPointerException)
      {
        paramString = new UnknownHostException(g.d("Broken system behaviour for dns lookup of ", paramString));
        paramString.initCause(localNullPointerException);
        throw paramString;
      }
    }
    throw new UnknownHostException("hostname == null");
  }
}

/* Location:
 * Qualified Name:     okhttp3.Dns.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */