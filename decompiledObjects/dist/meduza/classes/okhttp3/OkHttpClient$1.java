package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import xc.c;

class OkHttpClient$1
  extends Internal
{
  public final void a(Headers.Builder paramBuilder, String paramString)
  {
    paramBuilder.a(paramString);
  }
  
  public final void b(Headers.Builder paramBuilder, String paramString1, String paramString2)
  {
    paramBuilder.b(paramString1, paramString2);
  }
  
  public final void c(ConnectionSpec paramConnectionSpec, SSLSocket paramSSLSocket, boolean paramBoolean)
  {
    if (c != null) {
      arrayOfString1 = Util.p(CipherSuite.b, paramSSLSocket.getEnabledCipherSuites(), c);
    } else {
      arrayOfString1 = paramSSLSocket.getEnabledCipherSuites();
    }
    String[] arrayOfString2;
    if (d != null) {
      arrayOfString2 = Util.p(Util.o, paramSSLSocket.getEnabledProtocols(), d);
    } else {
      arrayOfString2 = paramSSLSocket.getEnabledProtocols();
    }
    Object localObject1 = paramSSLSocket.getSupportedCipherSuites();
    Object localObject2 = CipherSuite.b;
    byte[] arrayOfByte = Util.a;
    int i = localObject1.length;
    for (int j = 0; j < i; j++)
    {
      arrayOfByte = localObject1[j];
      if (((CipherSuite.1)localObject2).compare(arrayOfByte, "TLS_FALLBACK_SCSV") == 0) {
        break label129;
      }
    }
    j = -1;
    label129:
    localObject2 = arrayOfString1;
    if (paramBoolean)
    {
      localObject2 = arrayOfString1;
      if (j != -1)
      {
        localObject1 = localObject1[j];
        j = arrayOfString1.length + 1;
        localObject2 = new String[j];
        System.arraycopy(arrayOfString1, 0, localObject2, 0, arrayOfString1.length);
        localObject2[(j - 1)] = localObject1;
      }
    }
    paramConnectionSpec = new ConnectionSpec.Builder(paramConnectionSpec);
    paramConnectionSpec.a((String[])localObject2);
    paramConnectionSpec.c(arrayOfString2);
    paramConnectionSpec = new ConnectionSpec(paramConnectionSpec);
    String[] arrayOfString1 = d;
    if (arrayOfString1 != null) {
      paramSSLSocket.setEnabledProtocols(arrayOfString1);
    }
    paramConnectionSpec = c;
    if (paramConnectionSpec != null) {
      paramSSLSocket.setEnabledCipherSuites(paramConnectionSpec);
    }
  }
  
  public final int d(Response.Builder paramBuilder)
  {
    return c;
  }
  
  public final boolean e(ConnectionPool paramConnectionPool, RealConnection paramRealConnection)
  {
    paramConnectionPool.getClass();
    boolean bool;
    if ((!k) && (a != 0))
    {
      paramConnectionPool.notifyAll();
      bool = false;
    }
    else
    {
      d.remove(paramRealConnection);
      bool = true;
    }
    return bool;
  }
  
  public final Socket f(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation)
  {
    Iterator localIterator = d.iterator();
    RealConnection localRealConnection;
    int i;
    do
    {
      do
      {
        boolean bool = localIterator.hasNext();
        paramConnectionPool = null;
        if (!bool) {
          break;
        }
        localRealConnection = (RealConnection)localIterator.next();
      } while (!localRealConnection.g(paramAddress, null));
      if (h != null) {
        i = 1;
      } else {
        i = 0;
      }
    } while ((i == 0) || (localRealConnection == paramStreamAllocation.b()));
    if ((n == null) && (j.n.size() == 1))
    {
      paramAddress = (Reference)j.n.get(0);
      paramConnectionPool = paramStreamAllocation.c(true, false, false);
      j = localRealConnection;
      n.add(paramAddress);
    }
    else
    {
      throw new IllegalStateException();
    }
    return paramConnectionPool;
  }
  
  public final boolean g(Address paramAddress1, Address paramAddress2)
  {
    return paramAddress1.a(paramAddress2);
  }
  
  public final RealConnection h(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation, Route paramRoute)
  {
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext())
    {
      paramConnectionPool = (RealConnection)localIterator.next();
      if (paramConnectionPool.g(paramAddress, paramRoute))
      {
        paramStreamAllocation.a(paramConnectionPool, true);
        return paramConnectionPool;
      }
    }
    paramConnectionPool = null;
    return paramConnectionPool;
  }
  
  public final void i(ConnectionPool paramConnectionPool, RealConnection paramRealConnection)
  {
    if (!f)
    {
      f = true;
      ConnectionPool.g.execute(c);
    }
    d.add(paramRealConnection);
  }
  
  public final RouteDatabase j(ConnectionPool paramConnectionPool)
  {
    return e;
  }
  
  public final IOException k(Call paramCall, IOException paramIOException)
  {
    if (c.i())
    {
      paramCall = new InterruptedIOException("timeout");
      if (paramIOException != null) {
        paramCall.initCause(paramIOException);
      }
      paramIOException = paramCall;
    }
    return paramIOException;
  }
}

/* Location:
 * Qualified Name:     okhttp3.OkHttpClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */