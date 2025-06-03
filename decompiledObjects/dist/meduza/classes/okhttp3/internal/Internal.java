package okhttp3.internal;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers.Builder;
import okhttp3.Response.Builder;
import okhttp3.Route;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;

public abstract class Internal
{
  public static Internal a;
  
  public abstract void a(Headers.Builder paramBuilder, String paramString);
  
  public abstract void b(Headers.Builder paramBuilder, String paramString1, String paramString2);
  
  public abstract void c(ConnectionSpec paramConnectionSpec, SSLSocket paramSSLSocket, boolean paramBoolean);
  
  public abstract int d(Response.Builder paramBuilder);
  
  public abstract boolean e(ConnectionPool paramConnectionPool, RealConnection paramRealConnection);
  
  public abstract Socket f(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation);
  
  public abstract boolean g(Address paramAddress1, Address paramAddress2);
  
  public abstract RealConnection h(ConnectionPool paramConnectionPool, Address paramAddress, StreamAllocation paramStreamAllocation, Route paramRoute);
  
  public abstract void i(ConnectionPool paramConnectionPool, RealConnection paramRealConnection);
  
  public abstract RouteDatabase j(ConnectionPool paramConnectionPool);
  
  public abstract IOException k(Call paramCall, IOException paramIOException);
}

/* Location:
 * Qualified Name:     okhttp3.internal.Internal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */