package I4;

import M4.l;
import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.Map;

public class g
{
  public static final F4.a f = ;
  public final HttpURLConnection a;
  public final G4.j b;
  public long c = -1L;
  public long d = -1L;
  public final l e;
  
  public g(HttpURLConnection paramHttpURLConnection, l paraml, G4.j paramj)
  {
    a = paramHttpURLConnection;
    b = paramj;
    e = paraml;
    paramj.C(paramHttpURLConnection.getURL().toString());
  }
  
  public boolean A()
  {
    return a.getInstanceFollowRedirects();
  }
  
  public long B()
  {
    a0();
    return a.getLastModified();
  }
  
  public OutputStream C()
  {
    try
    {
      Object localObject = a.getOutputStream();
      if (localObject != null)
      {
        localObject = new b((OutputStream)localObject, b, e);
        return (OutputStream)localObject;
      }
    }
    catch (IOException localIOException)
    {
      break label37;
      return localIOException;
      label37:
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
  
  public Permission D()
  {
    try
    {
      Permission localPermission = a.getPermission();
      return localPermission;
    }
    catch (IOException localIOException)
    {
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
  
  public int E()
  {
    return a.getReadTimeout();
  }
  
  public String F()
  {
    return a.getRequestMethod();
  }
  
  public Map G()
  {
    return a.getRequestProperties();
  }
  
  public String H(String paramString)
  {
    return a.getRequestProperty(paramString);
  }
  
  public int I()
  {
    a0();
    if (d == -1L)
    {
      long l = e.c();
      d = l;
      b.B(l);
    }
    try
    {
      int i = a.getResponseCode();
      b.r(i);
      return i;
    }
    catch (IOException localIOException)
    {
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
  
  public String J()
  {
    a0();
    if (d == -1L)
    {
      long l = e.c();
      d = l;
      b.B(l);
    }
    try
    {
      String str = a.getResponseMessage();
      b.r(a.getResponseCode());
      return str;
    }
    catch (IOException localIOException)
    {
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
  
  public URL K()
  {
    return a.getURL();
  }
  
  public boolean L()
  {
    return a.getUseCaches();
  }
  
  public void M(boolean paramBoolean)
  {
    a.setAllowUserInteraction(paramBoolean);
  }
  
  public void N(int paramInt)
  {
    a.setChunkedStreamingMode(paramInt);
  }
  
  public void O(int paramInt)
  {
    a.setConnectTimeout(paramInt);
  }
  
  public void P(boolean paramBoolean)
  {
    a.setDefaultUseCaches(paramBoolean);
  }
  
  public void Q(boolean paramBoolean)
  {
    a.setDoInput(paramBoolean);
  }
  
  public void R(boolean paramBoolean)
  {
    a.setDoOutput(paramBoolean);
  }
  
  public void S(int paramInt)
  {
    a.setFixedLengthStreamingMode(paramInt);
  }
  
  public void T(long paramLong)
  {
    a.setFixedLengthStreamingMode(paramLong);
  }
  
  public void U(long paramLong)
  {
    a.setIfModifiedSince(paramLong);
  }
  
  public void V(boolean paramBoolean)
  {
    a.setInstanceFollowRedirects(paramBoolean);
  }
  
  public void W(int paramInt)
  {
    a.setReadTimeout(paramInt);
  }
  
  public void X(String paramString)
  {
    a.setRequestMethod(paramString);
  }
  
  public void Y(String paramString1, String paramString2)
  {
    if ("User-Agent".equalsIgnoreCase(paramString1)) {
      b.E(paramString2);
    }
    a.setRequestProperty(paramString1, paramString2);
  }
  
  public void Z(boolean paramBoolean)
  {
    a.setUseCaches(paramBoolean);
  }
  
  public void a(String paramString1, String paramString2)
  {
    a.addRequestProperty(paramString1, paramString2);
  }
  
  public final void a0()
  {
    if (c == -1L)
    {
      e.g();
      long l = e.e();
      c = l;
      b.w(l);
    }
    String str = F();
    if (str != null)
    {
      b.q(str);
    }
    else
    {
      G4.j localj;
      if (o()) {
        localj = b;
      }
      for (str = "POST";; str = "GET")
      {
        localj.q(str);
        break;
        localj = b;
      }
    }
  }
  
  public void b()
  {
    if (c == -1L)
    {
      e.g();
      long l = e.e();
      c = l;
      b.w(l);
    }
    try
    {
      a.connect();
      return;
    }
    catch (IOException localIOException)
    {
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
  
  public boolean b0()
  {
    return a.usingProxy();
  }
  
  public void c()
  {
    b.A(e.c());
    b.g();
    a.disconnect();
  }
  
  public boolean d()
  {
    return a.getAllowUserInteraction();
  }
  
  public int e()
  {
    return a.getConnectTimeout();
  }
  
  public boolean equals(Object paramObject)
  {
    return a.equals(paramObject);
  }
  
  public Object f()
  {
    a0();
    b.r(a.getResponseCode());
    try
    {
      Object localObject = a.getContent();
      if ((localObject instanceof InputStream))
      {
        b.x(a.getContentType());
        localObject = new a((InputStream)localObject, b, e);
      }
      else
      {
        b.x(a.getContentType());
        b.y(a.getContentLength());
        b.A(e.c());
        b.g();
      }
      return localObject;
    }
    catch (IOException localIOException)
    {
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
  
  public Object g(Class[] paramArrayOfClass)
  {
    a0();
    b.r(a.getResponseCode());
    try
    {
      paramArrayOfClass = a.getContent(paramArrayOfClass);
      if ((paramArrayOfClass instanceof InputStream))
      {
        b.x(a.getContentType());
        paramArrayOfClass = new a((InputStream)paramArrayOfClass, b, e);
      }
      else
      {
        b.x(a.getContentType());
        b.y(a.getContentLength());
        b.A(e.c());
        b.g();
      }
      return paramArrayOfClass;
    }
    catch (IOException paramArrayOfClass)
    {
      b.A(e.c());
      j.d(b);
      throw paramArrayOfClass;
    }
  }
  
  public String h()
  {
    a0();
    return a.getContentEncoding();
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public int i()
  {
    a0();
    return a.getContentLength();
  }
  
  public long j()
  {
    a0();
    long l;
    if (Build.VERSION.SDK_INT >= 24) {
      l = e.a(a);
    } else {
      l = 0L;
    }
    return l;
  }
  
  public String k()
  {
    a0();
    return a.getContentType();
  }
  
  public long l()
  {
    a0();
    return a.getDate();
  }
  
  public boolean m()
  {
    return a.getDefaultUseCaches();
  }
  
  public boolean n()
  {
    return a.getDoInput();
  }
  
  public boolean o()
  {
    return a.getDoOutput();
  }
  
  public InputStream p()
  {
    a0();
    try
    {
      b.r(a.getResponseCode());
    }
    catch (IOException localIOException)
    {
      f.a("IOException thrown trying to obtain the response code");
    }
    InputStream localInputStream = a.getErrorStream();
    if (localInputStream != null) {
      return new a(localInputStream, b, e);
    }
    return localInputStream;
  }
  
  public long q()
  {
    a0();
    return a.getExpiration();
  }
  
  public String r(int paramInt)
  {
    a0();
    return a.getHeaderField(paramInt);
  }
  
  public String s(String paramString)
  {
    a0();
    return a.getHeaderField(paramString);
  }
  
  public long t(String paramString, long paramLong)
  {
    a0();
    return a.getHeaderFieldDate(paramString, paramLong);
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public int u(String paramString, int paramInt)
  {
    a0();
    return a.getHeaderFieldInt(paramString, paramInt);
  }
  
  public String v(int paramInt)
  {
    a0();
    return a.getHeaderFieldKey(paramInt);
  }
  
  public long w(String paramString, long paramLong)
  {
    a0();
    if (Build.VERSION.SDK_INT >= 24) {
      paramLong = f.a(a, paramString, paramLong);
    } else {
      paramLong = 0L;
    }
    return paramLong;
  }
  
  public Map x()
  {
    a0();
    return a.getHeaderFields();
  }
  
  public long y()
  {
    return a.getIfModifiedSince();
  }
  
  public InputStream z()
  {
    a0();
    b.r(a.getResponseCode());
    b.x(a.getContentType());
    try
    {
      Object localObject = a.getInputStream();
      if (localObject != null)
      {
        localObject = new a((InputStream)localObject, b, e);
        return (InputStream)localObject;
      }
    }
    catch (IOException localIOException)
    {
      break label71;
      return localIOException;
      label71:
      b.A(e.c());
      j.d(b);
      throw localIOException;
    }
  }
}

/* Location:
 * Qualified Name:     I4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */