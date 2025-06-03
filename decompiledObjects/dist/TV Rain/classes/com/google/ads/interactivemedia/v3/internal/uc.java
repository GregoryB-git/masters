package com.google.ads.interactivemedia.v3.internal;

import a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public final class uc
  extends to
  implements uh
{
  private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private static final AtomicReference<byte[]> b = new AtomicReference();
  private final boolean c;
  private final int d;
  private final int e;
  private final String f;
  private final uk g;
  private final uk h;
  private tx i;
  private HttpURLConnection j;
  private InputStream k;
  private boolean l;
  private int m;
  private long n;
  private long o;
  private long p;
  private long q;
  
  public uc(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, uk paramuk)
  {
    super(true);
    f = rp.a(paramString);
    h = new uk();
    d = paramInt1;
    e = paramInt2;
    c = paramBoolean;
    g = paramuk;
  }
  
  private static long a(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    long l1;
    Object localObject;
    if (!TextUtils.isEmpty(str)) {
      try
      {
        l1 = Long.parseLong(str);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        localObject = new StringBuilder(a.b(str, 28));
        ((StringBuilder)localObject).append("Unexpected Content-Length [");
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append("]");
        Log.e("DefaultHttpDataSource", ((StringBuilder)localObject).toString());
      }
    } else {
      l1 = -1L;
    }
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Range");
    long l2 = l1;
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      localObject = a.matcher(paramHttpURLConnection);
      l2 = l1;
      if (((Matcher)localObject).find()) {
        try
        {
          long l3 = Long.parseLong(((Matcher)localObject).group(2)) - Long.parseLong(((Matcher)localObject).group(1)) + 1L;
          if (l1 < 0L)
          {
            l2 = l3;
          }
          else
          {
            l2 = l1;
            if (l1 != l3)
            {
              int i1 = String.valueOf(str).length();
              int i2 = String.valueOf(paramHttpURLConnection).length();
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>(i1 + 26 + i2);
              ((StringBuilder)localObject).append("Inconsistent headers [");
              ((StringBuilder)localObject).append(str);
              ((StringBuilder)localObject).append("] [");
              ((StringBuilder)localObject).append(paramHttpURLConnection);
              ((StringBuilder)localObject).append("]");
              Log.w("DefaultHttpDataSource", ((StringBuilder)localObject).toString());
              l2 = Math.max(l1, l3);
            }
          }
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          StringBuilder localStringBuilder = new StringBuilder(a.b(paramHttpURLConnection, 27));
          localStringBuilder.append("Unexpected Content-Range [");
          localStringBuilder.append(paramHttpURLConnection);
          localStringBuilder.append("]");
          Log.e("DefaultHttpDataSource", localStringBuilder.toString());
          l2 = l1;
        }
      }
    }
    return l2;
  }
  
  private final HttpURLConnection a(URL paramURL, int paramInt, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Map<String, String> paramMap)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setConnectTimeout(d);
    localHttpURLConnection.setReadTimeout(e);
    HashMap localHashMap = new HashMap();
    paramURL = g;
    if (paramURL != null) {
      localHashMap.putAll(paramURL.a());
    }
    localHashMap.putAll(h.a());
    localHashMap.putAll(paramMap);
    paramMap = localHashMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      paramURL = (Map.Entry)paramMap.next();
      localHttpURLConnection.setRequestProperty((String)paramURL.getKey(), (String)paramURL.getValue());
    }
    if ((paramLong1 != 0L) || (paramLong2 != -1L))
    {
      paramURL = new StringBuilder(27);
      paramURL.append("bytes=");
      paramURL.append(paramLong1);
      paramURL.append("-");
      paramMap = paramURL.toString();
      paramURL = paramMap;
      if (paramLong2 != -1L)
      {
        paramURL = String.valueOf(paramMap);
        paramMap = new StringBuilder(paramURL.length() + 20);
        paramMap.append(paramURL);
        paramMap.append(paramLong1 + paramLong2 - 1L);
        paramURL = paramMap.toString();
      }
      localHttpURLConnection.setRequestProperty("Range", paramURL);
    }
    localHttpURLConnection.setRequestProperty("User-Agent", f);
    if (paramBoolean1) {
      paramURL = "gzip";
    } else {
      paramURL = "identity";
    }
    localHttpURLConnection.setRequestProperty("Accept-Encoding", paramURL);
    if (paramBoolean2) {
      localHttpURLConnection.setRequestProperty("Icy-MetaData", "1");
    }
    localHttpURLConnection.setInstanceFollowRedirects(paramBoolean3);
    if (paramArrayOfByte != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    localHttpURLConnection.setDoOutput(paramBoolean1);
    localHttpURLConnection.setRequestMethod(tx.b(paramInt));
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
  
  private static URL a(URL paramURL, String paramString)
    throws IOException
  {
    if (paramString != null)
    {
      paramString = new URL(paramURL, paramString);
      paramURL = paramString.getProtocol();
      if ((!"https".equals(paramURL)) && (!"http".equals(paramURL)))
      {
        paramURL = String.valueOf(paramURL);
        if (paramURL.length() != 0) {
          paramURL = "Unsupported protocol redirect: ".concat(paramURL);
        } else {
          paramURL = new String("Unsupported protocol redirect: ");
        }
        throw new ProtocolException(paramURL);
      }
      return paramString;
    }
    throw new ProtocolException("Null location redirect");
  }
  
  private final void e()
  {
    HttpURLConnection localHttpURLConnection = j;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        vr.b("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
      }
      j = null;
    }
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws ui
  {
    try
    {
      if (p != n)
      {
        byte[] arrayOfByte1 = (byte[])b.getAndSet(null);
        byte[] arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1 == null) {
          arrayOfByte2 = new byte['က'];
        }
        for (;;)
        {
          long l1 = p;
          l2 = n;
          if (l1 == l2) {
            break label145;
          }
          i1 = (int)Math.min(l2 - l1, arrayOfByte2.length);
          i1 = k.read(arrayOfByte2, 0, i1);
          if (Thread.currentThread().isInterrupted()) {
            break label135;
          }
          if (i1 == -1) {
            break;
          }
          p += i1;
          a(i1);
        }
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
        label135:
        paramArrayOfByte = new java/io/InterruptedIOException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
        label145:
        b.set(arrayOfByte2);
      }
      if (paramInt2 == 0) {
        return 0;
      }
      long l2 = o;
      int i1 = paramInt2;
      if (l2 != -1L)
      {
        l2 -= q;
        if (l2 == 0L) {
          return -1;
        }
        i1 = (int)Math.min(paramInt2, l2);
      }
      paramInt1 = k.read(paramArrayOfByte, paramInt1, i1);
      if (paramInt1 == -1)
      {
        if (o == -1L) {
          return -1;
        }
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
      }
      q += paramInt1;
      a(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new ui(paramArrayOfByte, i, 2);
    }
  }
  
  public final long a(tx paramtx)
    throws ui
  {
    i = paramtx;
    q = 0L;
    p = 0L;
    b(paramtx);
    label753:
    Object localObject6;
    try
    {
      localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(a.toString());
      int i1 = b;
      byte[] arrayOfByte = c;
      long l1 = f;
      long l2 = g;
      boolean bool1 = paramtx.a(1);
      boolean bool2 = paramtx.a(2);
      boolean bool3 = c;
      Object localObject3;
      if (!bool3) {
        try
        {
          localObject3 = d;
          localObject4 = "Unable to connect to ";
          localObject5 = localObject4;
          try
          {
            localObject3 = a((URL)localObject1, i1, arrayOfByte, l1, l2, bool1, bool2, true, (Map)localObject3);
          }
          catch (IOException localIOException1) {}
        }
        catch (IOException localIOException2)
        {
          localObject5 = "Unable to connect to ";
        }
      }
      Object localObject5 = "Unable to connect to ";
      int i2 = 1;
      Object localObject4 = localIOException2;
      int i3 = 0;
      Object localObject2 = localObject5;
      for (;;)
      {
        int i4 = i3 + 1;
        HttpURLConnection localHttpURLConnection;
        String str2;
        String str1;
        if (i3 <= 20)
        {
          localObject5 = localObject2;
          localHttpURLConnection = a((URL)localObject1, i1, (byte[])localObject4, l1, l2, bool1, bool2, false, d);
          localObject5 = localObject2;
          i3 = localHttpURLConnection.getResponseCode();
          localObject5 = localObject2;
          str2 = localHttpURLConnection.getHeaderField("Location");
          if ((i1 != i2) && (i1 != 3)) {}
          for (;;)
          {
            break;
            if ((i3 == 300) || (i3 == 301) || (i3 == 302) || (i3 == 303) || (i3 == 307)) {
              break label753;
            }
            if (i3 == 308) {
              break label753;
            }
          }
          localObject3 = localHttpURLConnection;
          localObject4 = localObject2;
          if (i1 == 2) {
            if ((i3 != 300) && (i3 != 301) && (i3 != 302))
            {
              localObject3 = localHttpURLConnection;
              localObject4 = localObject2;
              if (i3 != 303) {}
            }
            else
            {
              localObject5 = localObject2;
              localHttpURLConnection.disconnect();
              localObject4 = null;
              localObject5 = localObject2;
              localObject1 = a((URL)localObject1, str2);
              i1 = i2;
              i3 = i4;
              continue;
            }
          }
          localObject5 = localObject4;
          j = ((HttpURLConnection)localObject3);
          try
          {
            m = ((HttpURLConnection)localObject3).getResponseCode();
            localObject2 = j.getResponseMessage();
            i3 = m;
            if ((i3 >= 200) && (i3 <= 299))
            {
              j.getContentType();
              if (m == 200)
              {
                l1 = f;
                if (l1 != 0L) {}
              }
              else
              {
                l1 = 0L;
              }
              n = l1;
              bool1 = "gzip".equalsIgnoreCase(j.getHeaderField("Content-Encoding"));
              if (!bool1)
              {
                l2 = g;
                l1 = -1L;
                if (l2 != -1L)
                {
                  o = l2;
                }
                else
                {
                  l2 = a(j);
                  if (l2 != -1L) {
                    l1 = l2 - n;
                  }
                  o = l1;
                }
              }
              else
              {
                o = g;
              }
              try
              {
                k = j.getInputStream();
                if (bool1)
                {
                  localObject2 = new java/util/zip/GZIPInputStream;
                  ((GZIPInputStream)localObject2).<init>(k);
                  k = ((InputStream)localObject2);
                }
                l = true;
                c(paramtx);
                return o;
              }
              catch (IOException localIOException3)
              {
                e();
                throw new ui(localIOException3, paramtx, 1);
              }
            }
            localObject5 = j.getHeaderFields();
            e();
            paramtx = new ul(m, localIOException3, (Map)localObject5, paramtx);
            if (m == 416) {
              paramtx.initCause(new tv(0));
            }
            throw paramtx;
          }
          catch (IOException localIOException6)
          {
            e();
            str1 = String.valueOf(a.toString());
            if (str1.length() != 0) {
              str1 = ((String)localObject4).concat(str1);
            } else {
              str1 = new String((String)localObject4);
            }
            throw new ui(str1, localIOException6, paramtx, 1);
          }
        }
        try
        {
          localHttpURLConnection.disconnect();
          localObject1 = a((URL)localObject1, str2);
          i3 = i4;
        }
        catch (IOException str1)
        {
          localObject6 = str1;
          localIOException4 = str1;
          break label830;
        }
      }
      localObject6 = new java/net/NoRouteToHostException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(31);
      ((StringBuilder)localObject1).append("Too many redirects: ");
      ((StringBuilder)localObject1).append(i4);
      ((NoRouteToHostException)localObject6).<init>(((StringBuilder)localObject1).toString());
      throw ((Throwable)localObject6);
    }
    catch (IOException localIOException5)
    {
      localObject6 = "Unable to connect to ";
    }
    label830:
    Object localObject1 = String.valueOf(a.toString());
    if (((String)localObject1).length() != 0) {
      localObject6 = ((String)localObject6).concat((String)localObject1);
    } else {
      localObject6 = new String((String)localObject6);
    }
    throw new ui((String)localObject6, localIOException5, paramtx, 1);
  }
  
  public final Uri a()
  {
    HttpURLConnection localHttpURLConnection = j;
    if (localHttpURLConnection == null) {
      return null;
    }
    return Uri.parse(localHttpURLConnection.getURL().toString());
  }
  
  public final Map<String, List<String>> b()
  {
    HttpURLConnection localHttpURLConnection = j;
    if (localHttpURLConnection == null) {
      return Collections.emptyMap();
    }
    return localHttpURLConnection.getHeaderFields();
  }
  
  public final void c()
    throws ui
  {
    for (;;)
    {
      try
      {
        if (k != null)
        {
          localObject1 = j;
          l1 = o;
          if (l1 != -1L) {
            l1 -= q;
          }
          int i1 = wl.a;
          if (i1 != 19) {
            if (i1 != 20) {
              continue;
            }
          }
        }
      }
      finally
      {
        Object localObject1;
        long l1;
        Object localObject3;
        k = null;
        e();
        if (l)
        {
          l = false;
          d();
        }
      }
      try
      {
        localObject1 = ((URLConnection)localObject1).getInputStream();
        if (l1 == -1L ? ((InputStream)localObject1).read() != -1 : l1 > 2048L)
        {
          localObject3 = localObject1.getClass().getName();
          if (("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(localObject3)) || ("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(localObject3)))
          {
            localObject3 = localObject1.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((AccessibleObject)localObject3).setAccessible(true);
            ((Method)localObject3).invoke(localObject1, new Object[0]);
          }
        }
      }
      catch (Exception localException)
      {
        continue;
      }
      try
      {
        k.close();
      }
      catch (IOException localIOException)
      {
        localObject3 = new com/google/ads/interactivemedia/v3/internal/ui;
        ((ui)localObject3).<init>(localIOException, i, 3);
        throw ((Throwable)localObject3);
      }
    }
    k = null;
    e();
    if (l)
    {
      l = false;
      d();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.uc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */