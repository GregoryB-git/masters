package okhttp3;

import g;
import java.io.IOException;

public enum Protocol
{
  public final String a;
  
  static
  {
    Protocol localProtocol1 = new Protocol("HTTP_1_0", 0, "http/1.0");
    b = localProtocol1;
    Protocol localProtocol2 = new Protocol("HTTP_1_1", 1, "http/1.1");
    c = localProtocol2;
    Protocol localProtocol3 = new Protocol("SPDY_3", 2, "spdy/3.1");
    d = localProtocol3;
    Protocol localProtocol4 = new Protocol("HTTP_2", 3, "h2");
    e = localProtocol4;
    Protocol localProtocol5 = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    f = localProtocol5;
    Protocol localProtocol6 = new Protocol("QUIC", 5, "quic");
    o = localProtocol6;
    p = new Protocol[] { localProtocol1, localProtocol2, localProtocol3, localProtocol4, localProtocol5, localProtocol6 };
  }
  
  public Protocol(String paramString)
  {
    a = paramString;
  }
  
  public static Protocol f(String paramString)
  {
    Protocol localProtocol = b;
    if (paramString.equals("http/1.0")) {
      return localProtocol;
    }
    localProtocol = c;
    if (paramString.equals("http/1.1")) {
      return localProtocol;
    }
    localProtocol = f;
    if (paramString.equals("h2_prior_knowledge")) {
      return localProtocol;
    }
    localProtocol = e;
    if (paramString.equals("h2")) {
      return localProtocol;
    }
    localProtocol = d;
    if (paramString.equals("spdy/3.1")) {
      return localProtocol;
    }
    localProtocol = o;
    if (paramString.equals("quic")) {
      return localProtocol;
    }
    throw new IOException(g.d("Unexpected protocol: ", paramString));
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     okhttp3.Protocol
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */