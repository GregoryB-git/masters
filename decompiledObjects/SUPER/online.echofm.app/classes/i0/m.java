package i0;

import X2.a0;
import X2.q;
import X2.w;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import g0.M;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class m
  extends b
  implements g
{
  public final boolean e;
  public final boolean f;
  public final int g;
  public final int h;
  public final String i;
  public final u j;
  public final u k;
  public final W2.n l;
  public final boolean m;
  public k n;
  public HttpURLConnection o;
  public InputStream p;
  public boolean q;
  public int r;
  public long s;
  public long t;
  
  public m(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, u paramu, W2.n paramn, boolean paramBoolean3)
  {
    super(true);
    i = paramString;
    g = paramInt1;
    h = paramInt2;
    e = paramBoolean1;
    f = paramBoolean2;
    if ((paramBoolean1) && (paramBoolean2)) {
      throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
    }
    j = paramu;
    l = paramn;
    k = new u();
    m = paramBoolean3;
  }
  
  public static boolean w(HttpURLConnection paramHttpURLConnection)
  {
    return "gzip".equalsIgnoreCase(paramHttpURLConnection.getHeaderField("Content-Encoding"));
  }
  
  public static void z(HttpURLConnection paramHttpURLConnection, long paramLong)
  {
    if ((paramHttpURLConnection != null) && (M.a <= 20)) {}
    try
    {
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      if (paramLong == -1L)
      {
        if (paramHttpURLConnection.read() != -1) {}
      }
      else if (paramLong <= 2048L) {
        return;
      }
      Object localObject = paramHttpURLConnection.getClass().getName();
      if (("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(localObject)) || ("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(localObject)))
      {
        localObject = ((Class)g0.a.e(paramHttpURLConnection.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
        ((AccessibleObject)localObject).setAccessible(true);
        ((Method)localObject).invoke(paramHttpURLConnection, new Object[0]);
      }
      return;
    }
    catch (Exception paramHttpURLConnection)
    {
      for (;;) {}
    }
  }
  
  public HttpURLConnection A(URL paramURL)
  {
    return (HttpURLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection());
  }
  
  public final int B(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = s;
    int i1 = paramInt2;
    if (l1 != -1L)
    {
      l1 -= t;
      if (l1 == 0L) {
        return -1;
      }
      i1 = (int)Math.min(paramInt2, l1);
    }
    paramInt1 = ((InputStream)M.i(p)).read(paramArrayOfByte, paramInt1, i1);
    if (paramInt1 == -1) {
      return -1;
    }
    t += paramInt1;
    q(paramInt1);
    return paramInt1;
  }
  
  public final void C(long paramLong, k paramk)
  {
    if (paramLong == 0L) {
      return;
    }
    byte[] arrayOfByte = new byte['က'];
    while (paramLong > 0L)
    {
      int i1 = (int)Math.min(paramLong, 'က');
      i1 = ((InputStream)M.i(p)).read(arrayOfByte, 0, i1);
      if (!Thread.currentThread().isInterrupted())
      {
        if (i1 != -1)
        {
          paramLong -= i1;
          q(i1);
        }
        else
        {
          throw new r(paramk, 2008, 1);
        }
      }
      else {
        throw new r(new InterruptedIOException(), paramk, 2000, 1);
      }
    }
  }
  
  public void close()
  {
    try
    {
      InputStream localInputStream = p;
      if (localInputStream != null)
      {
        long l1 = s;
        long l2 = -1L;
        if (l1 != -1L) {
          l2 = l1 - t;
        }
        z(o, l2);
      }
      r localr;
      p = null;
    }
    finally
    {
      try
      {
        localInputStream.close();
      }
      catch (IOException localIOException)
      {
        localr = new i0/r;
        localr.<init>(localIOException, (k)M.i(n), 2000, 3);
        throw localr;
      }
      localObject = finally;
      break label113;
    }
    u();
    if (q)
    {
      q = false;
      r();
    }
    return;
    label113:
    p = null;
    u();
    if (q)
    {
      q = false;
      r();
    }
    throw localIOException;
  }
  
  public long e(k paramk)
  {
    n = paramk;
    long l1 = 0L;
    t = 0L;
    s = 0L;
    s(paramk);
    try
    {
      Object localObject1 = x(paramk);
      o = ((HttpURLConnection)localObject1);
      r = ((HttpURLConnection)localObject1).getResponseCode();
      String str = ((HttpURLConnection)localObject1).getResponseMessage();
      int i1 = r;
      long l2 = -1L;
      long l3;
      if ((i1 >= 200) && (i1 <= 299))
      {
        localObject3 = ((URLConnection)localObject1).getContentType();
        localObject4 = l;
        if ((localObject4 != null) && (!((W2.n)localObject4).apply(localObject3)))
        {
          u();
          throw new s((String)localObject3, paramk);
        }
        l3 = l1;
        long l4;
        if (r == 200)
        {
          l4 = g;
          l3 = l1;
          if (l4 != 0L) {
            l3 = l4;
          }
        }
        boolean bool = w((HttpURLConnection)localObject1);
        if (!bool)
        {
          l1 = h;
          if (l1 != -1L)
          {
            s = l1;
          }
          else
          {
            l4 = v.b(((URLConnection)localObject1).getHeaderField("Content-Length"), ((URLConnection)localObject1).getHeaderField("Content-Range"));
            l1 = l2;
            if (l4 != -1L) {
              l1 = l4 - l3;
            }
            s = l1;
          }
        }
        else
        {
          s = h;
        }
        try
        {
          p = ((URLConnection)localObject1).getInputStream();
          if (bool)
          {
            localObject1 = new java/util/zip/GZIPInputStream;
            ((GZIPInputStream)localObject1).<init>(p);
            p = ((InputStream)localObject1);
          }
        }
        catch (IOException localIOException1)
        {
          break label349;
        }
        q = true;
        t(paramk);
        try
        {
          C(l3, paramk);
          return s;
        }
        catch (IOException localIOException2)
        {
          u();
          if ((localIOException2 instanceof r)) {
            throw ((r)localIOException2);
          }
          throw new r(localIOException2, paramk, 2000, 1);
        }
        label349:
        u();
        throw new r(localIOException2, paramk, 2000, 1);
      }
      Object localObject4 = localIOException2.getHeaderFields();
      if (r == 416)
      {
        l3 = v.c(localIOException2.getHeaderField("Content-Range"));
        if (g == l3)
        {
          q = true;
          t(paramk);
          l3 = h;
          if (l3 != -1L) {
            l1 = l3;
          }
          return l1;
        }
      }
      Object localObject2 = localIOException2.getErrorStream();
      if (localObject2 != null) {}
      try
      {
        localObject2 = Y2.a.b((InputStream)localObject2);
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          arrayOfByte = M.f;
        }
      }
      localObject2 = M.f;
      byte[] arrayOfByte;
      u();
      if (r == 416) {}
      for (Object localObject3 = new h(2008);; localObject3 = null) {
        break;
      }
      throw new t(r, str, (IOException)localObject3, (Map)localObject4, paramk, arrayOfByte);
    }
    catch (IOException localIOException4)
    {
      u();
      throw r.c(localIOException4, paramk, 1);
    }
  }
  
  public Map g()
  {
    HttpURLConnection localHttpURLConnection = o;
    if (localHttpURLConnection == null) {
      return w.j();
    }
    return new c(localHttpURLConnection.getHeaderFields());
  }
  
  public Uri k()
  {
    Object localObject = o;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Uri.parse(((URLConnection)localObject).getURL().toString());
    }
    return (Uri)localObject;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = B(paramArrayOfByte, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw r.c(paramArrayOfByte, (k)M.i(n), 2);
    }
  }
  
  public final void u()
  {
    HttpURLConnection localHttpURLConnection = o;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        g0.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
      }
      o = null;
    }
  }
  
  public final URL v(URL paramURL, String paramString, k paramk)
  {
    if (paramString != null) {
      try
      {
        URL localURL = new URL(paramURL, paramString);
        String str = localURL.getProtocol();
        if ((!"https".equals(str)) && (!"http".equals(str)))
        {
          paramURL = new StringBuilder();
          paramURL.append("Unsupported protocol redirect: ");
          paramURL.append(str);
          throw new r(paramURL.toString(), paramk, 2001, 1);
        }
        paramString = localURL;
        if (!e)
        {
          paramString = localURL;
          if (!str.equals(paramURL.getProtocol())) {
            if (f)
            {
              try
              {
                paramString = new URL(localURL.toString().replaceFirst(str, paramURL.getProtocol()));
              }
              catch (MalformedURLException paramURL)
              {
                throw new r(paramURL, paramk, 2001, 1);
              }
            }
            else
            {
              paramString = new StringBuilder();
              paramString.append("Disallowed cross-protocol redirect (");
              paramString.append(paramURL.getProtocol());
              paramString.append(" to ");
              paramString.append(str);
              paramString.append(")");
              throw new r(paramString.toString(), paramk, 2001, 1);
            }
          }
        }
        return paramString;
      }
      catch (MalformedURLException paramURL)
      {
        throw new r(paramURL, paramk, 2001, 1);
      }
    }
    throw new r("Null location redirect", paramk, 2001, 1);
  }
  
  public final HttpURLConnection x(k paramk)
  {
    URL localURL = new URL(a.toString());
    int i1 = c;
    Object localObject = d;
    long l1 = g;
    long l2 = h;
    boolean bool = paramk.d(1);
    if ((!e) && (!f) && (!m)) {
      return y(localURL, i1, (byte[])localObject, l1, l2, bool, true, e);
    }
    int i3;
    for (int i2 = 0;; i2 = i3)
    {
      i3 = i2 + 1;
      if (i2 > 20) {
        break;
      }
      HttpURLConnection localHttpURLConnection = y(localURL, i1, (byte[])localObject, l1, l2, bool, false, e);
      i2 = localHttpURLConnection.getResponseCode();
      String str = localHttpURLConnection.getHeaderField("Location");
      if (((i1 != 1) && (i1 != 3)) || ((i2 == 300) || (i2 == 301) || (i2 == 302) || (i2 == 303) || (i2 == 307) || (i2 != 308)))
      {
        if ((i1 == 2) && ((i2 == 300) || (i2 == 301) || (i2 == 302) || (i2 == 303)))
        {
          localHttpURLConnection.disconnect();
          if ((!m) || (i2 != 302)) {
            for (;;)
            {
              localObject = null;
              i1 = 1;
            }
          }
          localURL = v(localURL, str, paramk);
        }
        else
        {
          return localHttpURLConnection;
        }
      }
      else
      {
        localHttpURLConnection.disconnect();
        localURL = v(localURL, str, paramk);
      }
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Too many redirects: ");
    ((StringBuilder)localObject).append(i3);
    throw new r(new NoRouteToHostException(((StringBuilder)localObject).toString()), paramk, 2001, 1);
  }
  
  public final HttpURLConnection y(URL paramURL, int paramInt, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, Map paramMap)
  {
    HttpURLConnection localHttpURLConnection = A(paramURL);
    localHttpURLConnection.setConnectTimeout(g);
    localHttpURLConnection.setReadTimeout(h);
    HashMap localHashMap = new HashMap();
    paramURL = j;
    if (paramURL != null) {
      localHashMap.putAll(paramURL.b());
    }
    localHashMap.putAll(k.b());
    localHashMap.putAll(paramMap);
    paramURL = localHashMap.entrySet().iterator();
    while (paramURL.hasNext())
    {
      paramMap = (Map.Entry)paramURL.next();
      localHttpURLConnection.setRequestProperty((String)paramMap.getKey(), (String)paramMap.getValue());
    }
    paramURL = v.a(paramLong1, paramLong2);
    if (paramURL != null) {
      localHttpURLConnection.setRequestProperty("Range", paramURL);
    }
    paramURL = i;
    if (paramURL != null) {
      localHttpURLConnection.setRequestProperty("User-Agent", paramURL);
    }
    if (paramBoolean1) {
      paramURL = "gzip";
    } else {
      paramURL = "identity";
    }
    localHttpURLConnection.setRequestProperty("Accept-Encoding", paramURL);
    localHttpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfByte != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    localHttpURLConnection.setDoOutput(paramBoolean1);
    localHttpURLConnection.setRequestMethod(k.c(paramInt));
    if (paramArrayOfByte != null)
    {
      localHttpURLConnection.setFixedLengthStreamingMode(paramArrayOfByte.length);
      localHttpURLConnection.connect();
      paramURL = localHttpURLConnection.getOutputStream();
      paramURL.write(paramArrayOfByte);
      paramURL.close();
    }
    else
    {
      localHttpURLConnection.connect();
    }
    return localHttpURLConnection;
  }
  
  public static final class b
    implements g.a
  {
    public final u a = new u();
    public y b;
    public W2.n c;
    public String d;
    public int e = 8000;
    public int f = 8000;
    public boolean g;
    public boolean h;
    public boolean i;
    
    public m b()
    {
      m localm = new m(d, e, f, g, h, a, c, i, null);
      y localy = b;
      if (localy != null) {
        localm.c(localy);
      }
      return localm;
    }
    
    public b c(boolean paramBoolean)
    {
      g = paramBoolean;
      return this;
    }
    
    public b d(Map paramMap)
    {
      a.a(paramMap);
      return this;
    }
    
    public b e(String paramString)
    {
      d = paramString;
      return this;
    }
  }
  
  public static class c
    extends q
  {
    public final Map o;
    
    public c(Map paramMap)
    {
      o = paramMap;
    }
    
    public Map b()
    {
      return o;
    }
    
    public boolean containsKey(Object paramObject)
    {
      boolean bool;
      if ((paramObject != null) && (super.containsKey(paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean containsValue(Object paramObject)
    {
      return super.c(paramObject);
    }
    
    public Set entrySet()
    {
      return a0.b(super.entrySet(), new n());
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if ((paramObject != null) && (super.d(paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public List h(Object paramObject)
    {
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (List)super.get(paramObject);
      }
      return (List)paramObject;
    }
    
    public int hashCode()
    {
      return super.e();
    }
    
    public boolean isEmpty()
    {
      boolean bool1 = super.isEmpty();
      boolean bool2 = true;
      boolean bool3 = bool2;
      if (!bool1) {
        if ((super.size() == 1) && (super.containsKey(null))) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      return bool3;
    }
    
    public Set keySet()
    {
      return a0.b(super.keySet(), new o());
    }
    
    public int size()
    {
      return super.size() - super.containsKey(null);
    }
  }
}

/* Location:
 * Qualified Name:     i0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */