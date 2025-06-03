package hb;

import g;
import ib.b.a;
import ib.e;
import ib.j;
import ib.l;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class n
{
  public static final List<j> a = Collections.unmodifiableList(Arrays.asList(new j[] { j.e }));
  
  public static SSLSocket a(SSLSocketFactory paramSSLSocketFactory, HostnameVerifier paramHostnameVerifier, Socket paramSocket, String paramString, int paramInt, ib.b paramb)
  {
    x6.b.y(paramSSLSocketFactory, "sslSocketFactory");
    x6.b.y(paramSocket, "socket");
    x6.b.y(paramb, "spec");
    SSLSocket localSSLSocket = (SSLSocket)paramSSLSocketFactory.createSocket(paramSocket, paramString, paramInt, true);
    paramSSLSocketFactory = b;
    paramSocket = null;
    if (paramSSLSocketFactory != null)
    {
      paramSSLSocketFactory = localSSLSocket.getEnabledCipherSuites();
      paramSSLSocketFactory = (String[])l.a(b, paramSSLSocketFactory);
    }
    else
    {
      paramSSLSocketFactory = null;
    }
    Object localObject = localSSLSocket.getEnabledProtocols();
    localObject = (String[])l.a(c, (Object[])localObject);
    b.a locala = new b.a(paramb);
    if (a)
    {
      if (paramSSLSocketFactory == null) {
        b = null;
      } else {
        b = ((String[])paramSSLSocketFactory.clone());
      }
      if (a)
      {
        if (localObject == null) {
          c = null;
        } else {
          c = ((String[])((String[])localObject).clone());
        }
        paramSSLSocketFactory = new ib.b(locala);
        localSSLSocket.setEnabledProtocols(c);
        paramSSLSocketFactory = b;
        if (paramSSLSocketFactory != null) {
          localSSLSocket.setEnabledCipherSuites(paramSSLSocketFactory);
        }
        localObject = k.d;
        paramSSLSocketFactory = paramSocket;
        if (d) {
          paramSSLSocketFactory = a;
        }
        paramb = ((k)localObject).d(localSSLSocket, paramString, paramSSLSocketFactory);
        paramSocket = a;
        paramSSLSocketFactory = j.b;
        if (!paramb.equals("http/1.0"))
        {
          paramSSLSocketFactory = j.c;
          if (!paramb.equals("http/1.1"))
          {
            paramSSLSocketFactory = j.e;
            if (!paramb.equals("h2"))
            {
              paramSSLSocketFactory = j.d;
              if (!paramb.equals("spdy/3.1")) {
                break label428;
              }
            }
          }
        }
        boolean bool = paramSocket.contains(paramSSLSocketFactory);
        paramSSLSocketFactory = new StringBuilder();
        paramSSLSocketFactory.append("Only ");
        paramSSLSocketFactory.append(paramSocket);
        paramSSLSocketFactory.append(" are supported, but negotiated protocol is %s");
        x6.b.G(paramb, paramSSLSocketFactory.toString(), bool);
        paramSSLSocketFactory = paramHostnameVerifier;
        if (paramHostnameVerifier == null) {
          paramSSLSocketFactory = e.a;
        }
        if ((paramString.startsWith("[")) && (paramString.endsWith("]"))) {
          paramHostnameVerifier = paramString.substring(1, paramString.length() - 1);
        } else {
          paramHostnameVerifier = paramString;
        }
        if (paramSSLSocketFactory.verify(paramHostnameVerifier, localSSLSocket.getSession())) {
          return localSSLSocket;
        }
        throw new SSLPeerUnverifiedException(g.d("Cannot verify hostname: ", paramString));
        label428:
        throw new IOException(g.d("Unexpected protocol: ", paramb));
      }
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    throw new IllegalStateException("no cipher suites for cleartext connections");
  }
}

/* Location:
 * Qualified Name:     hb.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */