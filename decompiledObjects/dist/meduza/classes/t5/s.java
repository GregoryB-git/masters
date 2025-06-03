package t5;

import android.net.Uri;
import android.text.TextUtils;
import g;
import java.io.ByteArrayOutputStream;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import n7.j;
import o7.h;
import o7.m0;
import o7.p;
import o7.u0;
import s5.e;
import v5.m;

public final class s
  extends f
{
  public final boolean e;
  public final int f;
  public final int g;
  public final String h;
  public final a0 i;
  public final a0 j;
  public final boolean k;
  public j<String> l;
  public HttpURLConnection m;
  public InputStream n;
  public boolean o;
  public int p;
  public long q;
  public long r;
  
  public s(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, a0 parama0)
  {
    super(true);
    h = paramString;
    f = paramInt1;
    g = paramInt2;
    e = paramBoolean;
    i = parama0;
    l = null;
    j = new a0();
    k = false;
  }
  
  public static void w(HttpURLConnection paramHttpURLConnection, long paramLong)
  {
    if (paramHttpURLConnection != null)
    {
      int i1 = v5.e0.a;
      if ((i1 < 19) || (i1 > 20)) {}
    }
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
        localObject = paramHttpURLConnection.getClass().getSuperclass();
        localObject.getClass();
        localObject = ((Class)localObject).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
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
  
  public final long a(n paramn)
  {
    long l1 = 0L;
    r = 0L;
    q = 0L;
    q(paramn);
    try
    {
      Object localObject1 = v(paramn);
      m = ((HttpURLConnection)localObject1);
      p = ((HttpURLConnection)localObject1).getResponseCode();
      ((HttpURLConnection)localObject1).getResponseMessage();
      int i1 = p;
      Object localObject2;
      long l3;
      Object localObject5;
      if ((i1 >= 200) && (i1 <= 299))
      {
        localObject2 = ((URLConnection)localObject1).getContentType();
        Object localObject3 = l;
        if ((localObject3 != null) && (!((j)localObject3).apply(localObject2)))
        {
          s();
          throw new y((String)localObject2);
        }
        long l2 = l1;
        if (p == 200)
        {
          l3 = f;
          l2 = l1;
          if (l3 != 0L) {
            l2 = l3;
          }
        }
        boolean bool = "gzip".equalsIgnoreCase(((URLConnection)localObject1).getHeaderField("Content-Encoding"));
        if (!bool)
        {
          l1 = g;
          if (l1 != -1L)
          {
            q = l1;
          }
          else
          {
            localObject3 = ((URLConnection)localObject1).getHeaderField("Content-Length");
            localObject2 = ((URLConnection)localObject1).getHeaderField("Content-Range");
            Pattern localPattern = b0.a;
            if (!TextUtils.isEmpty((CharSequence)localObject3)) {
              try
              {
                l1 = Long.parseLong((String)localObject3);
              }
              catch (NumberFormatException localNumberFormatException2)
              {
                localObject5 = new StringBuilder();
                ((StringBuilder)localObject5).append("Unexpected Content-Length [");
                ((StringBuilder)localObject5).append((String)localObject3);
                ((StringBuilder)localObject5).append("]");
                m.c("HttpUtil", ((StringBuilder)localObject5).toString());
              }
            } else {
              l1 = -1L;
            }
            l3 = l1;
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localObject5 = b0.a.matcher((CharSequence)localObject2);
              l3 = l1;
              if (((Matcher)localObject5).matches()) {
                try
                {
                  String str = ((Matcher)localObject5).group(2);
                  str.getClass();
                  l3 = Long.parseLong(str);
                  localObject5 = ((Matcher)localObject5).group(1);
                  localObject5.getClass();
                  long l4 = l3 - Long.parseLong((String)localObject5) + 1L;
                  if (l1 < 0L)
                  {
                    l3 = l4;
                  }
                  else
                  {
                    l3 = l1;
                    if (l1 != l4)
                    {
                      localObject5 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject5).<init>();
                      ((StringBuilder)localObject5).append("Inconsistent headers [");
                      ((StringBuilder)localObject5).append((String)localObject3);
                      ((StringBuilder)localObject5).append("] [");
                      ((StringBuilder)localObject5).append((String)localObject2);
                      ((StringBuilder)localObject5).append("]");
                      m.f("HttpUtil", ((StringBuilder)localObject5).toString());
                      l3 = Math.max(l1, l4);
                    }
                  }
                }
                catch (NumberFormatException localNumberFormatException1)
                {
                  localObject4 = new StringBuilder();
                  ((StringBuilder)localObject4).append("Unexpected Content-Range [");
                  ((StringBuilder)localObject4).append((String)localObject2);
                  ((StringBuilder)localObject4).append("]");
                  m.c("HttpUtil", ((StringBuilder)localObject4).toString());
                  l3 = l1;
                }
              }
            }
            if (l3 != -1L) {
              l1 = l3 - l2;
            } else {
              l1 = -1L;
            }
            q = l1;
          }
        }
        else
        {
          q = g;
        }
        try
        {
          n = ((URLConnection)localObject1).getInputStream();
          if (bool)
          {
            localObject1 = new java/util/zip/GZIPInputStream;
            ((GZIPInputStream)localObject1).<init>(n);
            n = ((InputStream)localObject1);
          }
          o = true;
          r(paramn);
          try
          {
            x(l2);
            return q;
          }
          catch (IOException paramn)
          {
            s();
            if ((paramn instanceof x)) {
              throw ((x)paramn);
            }
            throw new x(paramn, 2000, 1);
          }
          localObject2 = ((URLConnection)localObject1).getHeaderFields();
        }
        catch (IOException paramn)
        {
          s();
          throw new x(paramn, 2000, 1);
        }
      }
      if (p == 416)
      {
        localObject4 = ((URLConnection)localObject1).getHeaderField("Content-Range");
        localObject5 = b0.a;
        if (!TextUtils.isEmpty((CharSequence)localObject4))
        {
          localObject4 = b0.b.matcher((CharSequence)localObject4);
          if (((Matcher)localObject4).matches())
          {
            localObject4 = ((Matcher)localObject4).group(1);
            localObject4.getClass();
            l3 = Long.parseLong((String)localObject4);
            break label731;
          }
        }
        l3 = -1L;
        label731:
        if (f == l3)
        {
          o = true;
          r(paramn);
          l3 = g;
          if (l3 != -1L) {
            l1 = l3;
          }
          return l1;
        }
      }
      Object localObject4 = ((HttpURLConnection)localObject1).getErrorStream();
      if (localObject4 != null) {}
      try
      {
        i1 = v5.e0.a;
        localObject1 = new byte['က'];
        paramn = new java/io/ByteArrayOutputStream;
        paramn.<init>();
        for (;;)
        {
          i1 = ((InputStream)localObject4).read((byte[])localObject1);
          if (i1 == -1) {
            break;
          }
          paramn.write((byte[])localObject1, 0, i1);
        }
        paramn.toByteArray();
      }
      catch (IOException paramn)
      {
        i1 = v5.e0.a;
      }
      i1 = v5.e0.a;
      s();
      if (p == 416) {
        paramn = new l(2008);
      } else {
        paramn = null;
      }
      throw new z(p, paramn, (Map)localObject2);
    }
    catch (IOException paramn)
    {
      s();
      throw x.a(paramn, 1);
    }
  }
  
  public final void close()
  {
    try
    {
      InputStream localInputStream = n;
      if (localInputStream != null)
      {
        long l1 = q;
        long l2 = -1L;
        if (l1 != -1L) {
          l2 = l1 - r;
        }
        w(m, l2);
        try
        {
          localInputStream.close();
        }
        catch (IOException localIOException)
        {
          x localx = new t5/x;
          int i1 = v5.e0.a;
          localx.<init>(localIOException, 2000, 3);
          throw localx;
        }
      }
      return;
    }
    finally
    {
      n = null;
      s();
      if (o)
      {
        o = false;
        p();
      }
    }
  }
  
  public final Map<String, List<String>> h()
  {
    HttpURLConnection localHttpURLConnection = m;
    if (localHttpURLConnection == null) {
      return m0.o;
    }
    return new b(localHttpURLConnection.getHeaderFields());
  }
  
  public final Uri l()
  {
    Object localObject = m;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Uri.parse(((URLConnection)localObject).getURL().toString());
    }
    return (Uri)localObject;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      paramInt1 = 0;
    }
    try
    {
      long l1 = q;
      int i1 = paramInt2;
      if (l1 != -1L)
      {
        l1 -= r;
        if (l1 != 0L) {
          i1 = (int)Math.min(paramInt2, l1);
        }
      }
      else
      {
        InputStream localInputStream = n;
        paramInt2 = v5.e0.a;
        paramInt1 = localInputStream.read(paramArrayOfByte, paramInt1, i1);
        if (paramInt1 != -1) {
          break label86;
        }
      }
      paramInt1 = -1;
      break label102;
      label86:
      r += paramInt1;
      o(paramInt1);
      label102:
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      paramInt1 = v5.e0.a;
      throw x.a(paramArrayOfByte, 2);
    }
  }
  
  public final void s()
  {
    HttpURLConnection localHttpURLConnection = m;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        m.d("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
      }
      m = null;
    }
  }
  
  public final URL t(URL paramURL, String paramString)
  {
    if (paramString != null) {
      try
      {
        Object localObject = new URL(paramURL, paramString);
        paramString = ((URL)localObject).getProtocol();
        if ((!"https".equals(paramString)) && (!"http".equals(paramString))) {
          throw new x(g.d("Unsupported protocol redirect: ", paramString), 2001);
        }
        if ((!e) && (!paramString.equals(paramURL.getProtocol())))
        {
          localObject = f.l("Disallowed cross-protocol redirect (");
          ((StringBuilder)localObject).append(paramURL.getProtocol());
          ((StringBuilder)localObject).append(" to ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(")");
          throw new x(((StringBuilder)localObject).toString(), 2001);
        }
        return (URL)localObject;
      }
      catch (MalformedURLException paramURL)
      {
        throw new x(paramURL, 2001, 1);
      }
    }
    throw new x("Null location redirect", 2001);
  }
  
  public final HttpURLConnection u(URL paramURL, int paramInt, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, Map<String, String> paramMap)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setConnectTimeout(f);
    localHttpURLConnection.setReadTimeout(g);
    paramURL = new HashMap();
    ??? = i;
    Object localObject;
    if (??? != null) {
      try
      {
        if (b == null)
        {
          localObject = new java/util/HashMap;
          ((HashMap)localObject).<init>(a);
          b = Collections.unmodifiableMap((Map)localObject);
        }
        localObject = b;
        paramURL.putAll((Map)localObject);
      }
      finally {}
    }
    synchronized (j)
    {
      if (b == null)
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>(a);
        b = Collections.unmodifiableMap((Map)localObject);
      }
      localObject = b;
      paramURL.putAll((Map)localObject);
      paramURL.putAll(paramMap);
      paramURL = paramURL.entrySet().iterator();
      while (paramURL.hasNext())
      {
        paramMap = (Map.Entry)paramURL.next();
        localHttpURLConnection.setRequestProperty((String)paramMap.getKey(), (String)paramMap.getValue());
      }
      paramURL = b0.a;
      if ((paramLong1 == 0L) && (paramLong2 == -1L))
      {
        paramURL = null;
      }
      else
      {
        paramURL = new StringBuilder();
        paramURL.append("bytes=");
        paramURL.append(paramLong1);
        paramURL.append("-");
        if (paramLong2 != -1L) {
          paramURL.append(paramLong1 + paramLong2 - 1L);
        }
        paramURL = paramURL.toString();
      }
      if (paramURL != null) {
        localHttpURLConnection.setRequestProperty("Range", paramURL);
      }
      paramURL = h;
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
      int i1 = n.k;
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt == 3) {
            paramURL = "HEAD";
          } else {
            throw new IllegalStateException();
          }
        }
        else {
          paramURL = "POST";
        }
      }
      else {
        paramURL = "GET";
      }
      localHttpURLConnection.setRequestMethod(paramURL);
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
  }
  
  public final HttpURLConnection v(n paramn)
  {
    Object localObject = paramn;
    URL localURL = new URL(a.toString());
    int i1 = c;
    byte[] arrayOfByte = d;
    long l1 = f;
    long l2 = g;
    boolean bool;
    if ((i & 0x1) == 1) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!e) && (!k)) {
      return u(localURL, i1, arrayOfByte, l1, l2, bool, true, e);
    }
    int i3;
    for (int i2 = 0;; i2 = i3)
    {
      i3 = i2 + 1;
      if (i2 > 20) {
        break;
      }
      HttpURLConnection localHttpURLConnection = u(localURL, i1, arrayOfByte, l1, l2, bool, false, e);
      i2 = localHttpURLConnection.getResponseCode();
      localObject = localHttpURLConnection.getHeaderField("Location");
      if (((i1 != 1) && (i1 != 3)) || ((i2 != 300) && (i2 != 301) && (i2 != 302) && (i2 != 303) && (i2 != 307) && (i2 != 308)))
      {
        if ((i1 == 2) && ((i2 == 300) || (i2 == 301) || (i2 == 302) || (i2 == 303)))
        {
          localHttpURLConnection.disconnect();
          if ((k) && (i2 == 302)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 == 0)
          {
            arrayOfByte = null;
            i1 = 1;
          }
          localURL = t(localURL, (String)localObject);
        }
        else
        {
          return localHttpURLConnection;
        }
      }
      else
      {
        localHttpURLConnection.disconnect();
        localURL = t(localURL, (String)localObject);
      }
    }
    throw new x(new NoRouteToHostException(f.h("Too many redirects: ", i3)), 2001, 1);
  }
  
  public final void x(long paramLong)
  {
    if (paramLong == 0L) {
      return;
    }
    byte[] arrayOfByte = new byte['က'];
    while (paramLong > 0L)
    {
      int i1 = (int)Math.min(paramLong, 'က');
      InputStream localInputStream = n;
      int i2 = v5.e0.a;
      i1 = localInputStream.read(arrayOfByte, 0, i1);
      if (!Thread.currentThread().isInterrupted())
      {
        if (i1 != -1)
        {
          paramLong -= i1;
          o(i1);
        }
        else
        {
          throw new x();
        }
      }
      else {
        throw new x(new InterruptedIOException(), 2000, 1);
      }
    }
  }
  
  public static final class a
    implements k.a
  {
    public final a0 a = new a0();
    public String b;
    public int c = 8000;
    public int d = 8000;
    public boolean e;
    
    public final k a()
    {
      return new s(b, c, d, e, a);
    }
  }
  
  public static final class b
    extends p<String, List<String>>
  {
    public final Map<String, List<String>> a;
    
    public b(Map<String, List<String>> paramMap)
    {
      a = paramMap;
    }
    
    public final Object b()
    {
      return a;
    }
    
    public final Map<String, List<String>> c()
    {
      return a;
    }
    
    public final boolean containsKey(Object paramObject)
    {
      boolean bool;
      if ((paramObject != null) && (super.containsKey(paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean containsValue(Object paramObject)
    {
      Iterator localIterator = ((h)entrySet()).iterator();
      localIterator.getClass();
      boolean bool = true;
      if (paramObject == null)
      {
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
        } while (((Map.Entry)localIterator.next()).getValue() != null);
      }
      else
      {
        while (localIterator.hasNext()) {
          if (paramObject.equals(((Map.Entry)localIterator.next()).getValue())) {
            return bool;
          }
        }
        bool = false;
      }
      return bool;
    }
    
    public final Set<Map.Entry<String, List<String>>> entrySet()
    {
      return u0.b(super.entrySet(), new t());
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool;
      if ((paramObject != null) && (o7.e0.a(this, paramObject))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Object get(Object paramObject)
    {
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (List)super.get(paramObject);
      }
      return paramObject;
    }
    
    public final int hashCode()
    {
      return u0.c(entrySet());
    }
    
    public final boolean isEmpty()
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
    
    public final Set<String> keySet()
    {
      return u0.b(super.keySet(), new e());
    }
    
    public final int size()
    {
      return super.size() - super.containsKey(null);
    }
  }
}

/* Location:
 * Qualified Name:     t5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */