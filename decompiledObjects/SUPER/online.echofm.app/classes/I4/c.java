package I4;

import G4.j;
import M4.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.Map;

public final class c
  extends HttpURLConnection
{
  public final g a;
  
  public c(HttpURLConnection paramHttpURLConnection, l paraml, j paramj)
  {
    super(paramHttpURLConnection.getURL());
    a = new g(paramHttpURLConnection, paraml, paramj);
  }
  
  public void addRequestProperty(String paramString1, String paramString2)
  {
    a.a(paramString1, paramString2);
  }
  
  public void connect()
  {
    a.b();
  }
  
  public void disconnect()
  {
    a.c();
  }
  
  public boolean equals(Object paramObject)
  {
    return a.equals(paramObject);
  }
  
  public boolean getAllowUserInteraction()
  {
    return a.d();
  }
  
  public int getConnectTimeout()
  {
    return a.e();
  }
  
  public Object getContent()
  {
    return a.f();
  }
  
  public Object getContent(Class[] paramArrayOfClass)
  {
    return a.g(paramArrayOfClass);
  }
  
  public String getContentEncoding()
  {
    return a.h();
  }
  
  public int getContentLength()
  {
    return a.i();
  }
  
  public long getContentLengthLong()
  {
    return a.j();
  }
  
  public String getContentType()
  {
    return a.k();
  }
  
  public long getDate()
  {
    return a.l();
  }
  
  public boolean getDefaultUseCaches()
  {
    return a.m();
  }
  
  public boolean getDoInput()
  {
    return a.n();
  }
  
  public boolean getDoOutput()
  {
    return a.o();
  }
  
  public InputStream getErrorStream()
  {
    return a.p();
  }
  
  public long getExpiration()
  {
    return a.q();
  }
  
  public String getHeaderField(int paramInt)
  {
    return a.r(paramInt);
  }
  
  public String getHeaderField(String paramString)
  {
    return a.s(paramString);
  }
  
  public long getHeaderFieldDate(String paramString, long paramLong)
  {
    return a.t(paramString, paramLong);
  }
  
  public int getHeaderFieldInt(String paramString, int paramInt)
  {
    return a.u(paramString, paramInt);
  }
  
  public String getHeaderFieldKey(int paramInt)
  {
    return a.v(paramInt);
  }
  
  public long getHeaderFieldLong(String paramString, long paramLong)
  {
    return a.w(paramString, paramLong);
  }
  
  public Map getHeaderFields()
  {
    return a.x();
  }
  
  public long getIfModifiedSince()
  {
    return a.y();
  }
  
  public InputStream getInputStream()
  {
    return a.z();
  }
  
  public boolean getInstanceFollowRedirects()
  {
    return a.A();
  }
  
  public long getLastModified()
  {
    return a.B();
  }
  
  public OutputStream getOutputStream()
  {
    return a.C();
  }
  
  public Permission getPermission()
  {
    return a.D();
  }
  
  public int getReadTimeout()
  {
    return a.E();
  }
  
  public String getRequestMethod()
  {
    return a.F();
  }
  
  public Map getRequestProperties()
  {
    return a.G();
  }
  
  public String getRequestProperty(String paramString)
  {
    return a.H(paramString);
  }
  
  public int getResponseCode()
  {
    return a.I();
  }
  
  public String getResponseMessage()
  {
    return a.J();
  }
  
  public URL getURL()
  {
    return a.K();
  }
  
  public boolean getUseCaches()
  {
    return a.L();
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public void setAllowUserInteraction(boolean paramBoolean)
  {
    a.M(paramBoolean);
  }
  
  public void setChunkedStreamingMode(int paramInt)
  {
    a.N(paramInt);
  }
  
  public void setConnectTimeout(int paramInt)
  {
    a.O(paramInt);
  }
  
  public void setDefaultUseCaches(boolean paramBoolean)
  {
    a.P(paramBoolean);
  }
  
  public void setDoInput(boolean paramBoolean)
  {
    a.Q(paramBoolean);
  }
  
  public void setDoOutput(boolean paramBoolean)
  {
    a.R(paramBoolean);
  }
  
  public void setFixedLengthStreamingMode(int paramInt)
  {
    a.S(paramInt);
  }
  
  public void setFixedLengthStreamingMode(long paramLong)
  {
    a.T(paramLong);
  }
  
  public void setIfModifiedSince(long paramLong)
  {
    a.U(paramLong);
  }
  
  public void setInstanceFollowRedirects(boolean paramBoolean)
  {
    a.V(paramBoolean);
  }
  
  public void setReadTimeout(int paramInt)
  {
    a.W(paramInt);
  }
  
  public void setRequestMethod(String paramString)
  {
    a.X(paramString);
  }
  
  public void setRequestProperty(String paramString1, String paramString2)
  {
    a.Y(paramString1, paramString2);
  }
  
  public void setUseCaches(boolean paramBoolean)
  {
    a.Z(paramBoolean);
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public boolean usingProxy()
  {
    return a.b0();
  }
}

/* Location:
 * Qualified Name:     I4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */