package ib;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import r3.a0;

public final class i$a
  extends i
{
  public final a0 e;
  public final a0 f;
  public final a0 g;
  public final a0 h;
  public final int i;
  
  public i$a(a0 parama01, a0 parama02, a0 parama03, a0 parama04, Provider paramProvider, int paramInt)
  {
    super(paramProvider);
    e = parama01;
    f = parama02;
    g = parama03;
    h = parama04;
    i = paramInt;
  }
  
  public final void c(SSLSocket paramSSLSocket, String paramString, List<j> paramList)
  {
    if (paramString != null)
    {
      e.l(paramSSLSocket, new Object[] { Boolean.TRUE });
      f.l(paramSSLSocket, new Object[] { paramString });
    }
    paramString = h;
    paramString.getClass();
    int j;
    if (paramString.b(paramSSLSocket.getClass()) != null) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      paramString = i.b(paramList);
      h.p(paramSSLSocket, new Object[] { paramString });
    }
  }
  
  public final String d(SSLSocket paramSSLSocket)
  {
    a0 locala0 = g;
    locala0.getClass();
    int j;
    if (locala0.b(paramSSLSocket.getClass()) != null) {
      j = 1;
    } else {
      j = 0;
    }
    locala0 = null;
    if (j == 0) {
      return null;
    }
    byte[] arrayOfByte = (byte[])g.p(paramSSLSocket, new Object[0]);
    paramSSLSocket = locala0;
    if (arrayOfByte != null) {
      paramSSLSocket = new String(arrayOfByte, l.b);
    }
    return paramSSLSocket;
  }
  
  public final int e()
  {
    return i;
  }
}

/* Location:
 * Qualified Name:     ib.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */