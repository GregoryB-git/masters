package I4;

import G4.j;
import M4.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class d
  extends HttpsURLConnection
{
  public final g a;
  public final HttpsURLConnection b;
  
  public d(HttpsURLConnection paramHttpsURLConnection, l paraml, j paramj)
  {
    super(paramHttpsURLConnection.getURL());
    b = paramHttpsURLConnection;
    a = new g(paramHttpsURLConnection, paraml, paramj);
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
  
  public String getCipherSuite()
  {
    return b.getCipherSuite();
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
  
  public HostnameVerifier getHostnameVerifier()
  {
    return b.getHostnameVerifier();
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
  
  public Certificate[] getLocalCertificates()
  {
    return b.getLocalCertificates();
  }
  
  public Principal getLocalPrincipal()
  {
    return b.getLocalPrincipal();
  }
  
  public OutputStream getOutputStream()
  {
    return a.C();
  }
  
  public Principal getPeerPrincipal()
  {
    return b.getPeerPrincipal();
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
  
  public SSLSocketFactory getSSLSocketFactory()
  {
    return b.getSSLSocketFactory();
  }
  
  public Certificate[] getServerCertificates()
  {
    return b.getServerCertificates();
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
  
  public void setHostnameVerifier(HostnameVerifier paramHostnameVerifier)
  {
    b.setHostnameVerifier(paramHostnameVerifier);
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
  
  public void setSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory)
  {
    b.setSSLSocketFactory(paramSSLSocketFactory);
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
 * Qualified Name:     I4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */