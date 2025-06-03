package okhttp3;

import g;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public abstract interface Dns
{
  public static final Dns a = new Dns()
  {
    public final List<InetAddress> a(String paramAnonymousString)
    {
      if (paramAnonymousString != null) {
        try
        {
          List localList = Arrays.asList(InetAddress.getAllByName(paramAnonymousString));
          return localList;
        }
        catch (NullPointerException localNullPointerException)
        {
          paramAnonymousString = new UnknownHostException(g.d("Broken system behaviour for dns lookup of ", paramAnonymousString));
          paramAnonymousString.initCause(localNullPointerException);
          throw paramAnonymousString;
        }
      }
      throw new UnknownHostException("hostname == null");
    }
  };
  
  public abstract List<InetAddress> a(String paramString);
}

/* Location:
 * Qualified Name:     okhttp3.Dns
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */