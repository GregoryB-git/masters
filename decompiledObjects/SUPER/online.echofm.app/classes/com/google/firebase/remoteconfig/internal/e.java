package com.google.firebase.remoteconfig.internal;

import E2.h;
import P4.b;
import P4.o.a;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import s4.i;

public class e
{
  public static final int[] q = { 2, 4, 8, 16, 32, 64, 128, 256 };
  public static final Pattern r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
  public final Set a;
  public boolean b;
  public int c;
  public boolean d;
  public boolean e;
  public final int f = 8;
  public final ScheduledExecutorService g;
  public final c h;
  public final s3.e i;
  public final i j;
  public Q4.e k;
  public final Context l;
  public final String m;
  public final Random n;
  public final E2.e o;
  public final d p;
  
  public e(s3.e parame, i parami, c paramc, Q4.e parame1, Context paramContext, String paramString, Set paramSet, d paramd, ScheduledExecutorService paramScheduledExecutorService)
  {
    a = paramSet;
    b = false;
    g = paramScheduledExecutorService;
    n = new Random();
    c = Math.max(8 - paramd.h().b(), 1);
    o = h.d();
    i = parame;
    h = paramc;
    j = parami;
    k = parame1;
    l = paramContext;
    m = paramString;
    p = paramd;
    d = false;
    e = false;
  }
  
  public static String k(String paramString)
  {
    paramString = r.matcher(paramString);
    if (paramString.matches()) {
      paramString = paramString.group(1);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public void A(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2)
  {
    paramHttpURLConnection.setRequestMethod("POST");
    x(paramHttpURLConnection, paramString2);
    paramString1 = i(paramString1).toString().getBytes("utf-8");
    paramHttpURLConnection = new BufferedOutputStream(paramHttpURLConnection.getOutputStream());
    paramHttpURLConnection.write(paramString1);
    paramHttpURLConnection.flush();
    paramHttpURLConnection.close();
  }
  
  public a B(HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      b localb = new com/google/firebase/remoteconfig/internal/e$b;
      localb.<init>(this);
      paramHttpURLConnection = new a(paramHttpURLConnection, h, k, a, localb, g);
      return paramHttpURLConnection;
    }
    finally
    {
      paramHttpURLConnection = finally;
      throw paramHttpURLConnection;
    }
  }
  
  public void C()
  {
    s(0L);
  }
  
  public final void D(Date paramDate)
  {
    int i1 = p.h().b() + 1;
    long l1 = m(i1);
    paramDate = new Date(paramDate.getTime() + l1);
    p.o(i1, paramDate);
  }
  
  public void e()
  {
    if (!f()) {
      return;
    }
    Object localObject = p.h();
    if (new Date(o.a()).before(((d.b)localObject).a()))
    {
      w();
      return;
    }
    localObject = h();
    V2.m.i(new V2.j[] { localObject }).g(g, new Q4.n(this, (V2.j)localObject));
  }
  
  /* Error */
  public final boolean f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/google/firebase/remoteconfig/internal/e:a	Ljava/util/Set;
    //   6: invokeinterface 270 1 0
    //   11: ifne +35 -> 46
    //   14: aload_0
    //   15: getfield 66	com/google/firebase/remoteconfig/internal/e:b	Z
    //   18: ifne +28 -> 46
    //   21: aload_0
    //   22: getfield 114	com/google/firebase/remoteconfig/internal/e:d	Z
    //   25: ifne +21 -> 46
    //   28: aload_0
    //   29: getfield 116	com/google/firebase/remoteconfig/internal/e:e	Z
    //   32: istore_1
    //   33: iload_1
    //   34: ifne +12 -> 46
    //   37: iconst_1
    //   38: istore_1
    //   39: goto +9 -> 48
    //   42: astore_2
    //   43: goto +9 -> 52
    //   46: iconst_0
    //   47: istore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: iload_1
    //   51: ireturn
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_2
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	e
    //   32	19	1	bool	boolean
    //   42	13	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	33	42	finally
  }
  
  public void g(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
    try
    {
      paramHttpURLConnection.getInputStream().close();
      if (paramHttpURLConnection.getErrorStream() != null) {
        paramHttpURLConnection.getErrorStream().close();
      }
      return;
    }
    catch (IOException paramHttpURLConnection)
    {
      for (;;) {}
    }
  }
  
  public V2.j h()
  {
    V2.j localj1 = j.b(false);
    V2.j localj2 = j.a();
    return V2.m.i(new V2.j[] { localj1, localj2 }).h(g, new Q4.o(this, localj1, localj2));
  }
  
  public final JSONObject i(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("project", k(i.r().c()));
    localHashMap.put("namespace", m);
    localHashMap.put("lastKnownVersionNumber", Long.toString(h.r()));
    localHashMap.put("appId", i.r().c());
    localHashMap.put("sdkVersion", "21.5.0");
    localHashMap.put("appInstanceId", paramString);
    return new JSONObject(localHashMap);
  }
  
  public final void j()
  {
    try
    {
      d = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String l()
  {
    try
    {
      Object localObject = l;
      localObject = E2.a.a((Context)localObject, ((Context)localObject).getPackageName());
      if (localObject == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Could not get fingerprint hash for package: ");
        ((StringBuilder)localObject).append(l.getPackageName());
        Log.e("FirebaseRemoteConfig", ((StringBuilder)localObject).toString());
        return null;
      }
      localObject = E2.j.b((byte[])localObject, false);
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("No such package: ");
      localStringBuilder.append(l.getPackageName());
      Log.i("FirebaseRemoteConfig", localStringBuilder.toString());
    }
    return null;
  }
  
  public final long m(int paramInt)
  {
    int[] arrayOfInt = q;
    int i1 = arrayOfInt.length;
    if (paramInt >= i1) {
      paramInt = i1;
    }
    long l1 = TimeUnit.MINUTES.toMillis(arrayOfInt[(paramInt - 1)]);
    return l1 / 2L + n.nextInt((int)l1);
  }
  
  public final String n(String paramString)
  {
    return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[] { k(i.r().c()), paramString });
  }
  
  public final URL o()
  {
    URL localURL2;
    try
    {
      URL localURL1 = new java/net/URL;
      localURL1.<init>(n(m));
    }
    catch (MalformedURLException localMalformedURLException)
    {
      Log.e("FirebaseRemoteConfig", "URL is malformed");
      localURL2 = null;
    }
    return localURL2;
  }
  
  public final boolean p(int paramInt)
  {
    boolean bool;
    if ((paramInt != 408) && (paramInt != 429) && (paramInt != 502) && (paramInt != 503) && (paramInt != 504)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void s(long paramLong)
  {
    try
    {
      boolean bool = f();
      if (!bool) {
        return;
      }
      int i1 = c;
      if (i1 > 0)
      {
        c = (i1 - 1);
        ScheduledExecutorService localScheduledExecutorService = g;
        a locala = new com/google/firebase/remoteconfig/internal/e$a;
        locala.<init>(this);
        localScheduledExecutorService.schedule(locala, paramLong, TimeUnit.MILLISECONDS);
      }
    }
    finally
    {
      break label104;
    }
    P4.n localn;
    if (!e)
    {
      localn = new P4/n;
      localn.<init>("Unable to connect to the server. Check your connection and try again.", o.a.q);
      u(localn);
    }
    return;
    label104:
    throw localn;
  }
  
  public final String t(InputStream paramInputStream)
  {
    localStringBuilder = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localInputStreamReader.<init>(paramInputStream);
      localBufferedReader.<init>(localInputStreamReader);
      for (;;)
      {
        paramInputStream = localBufferedReader.readLine();
        if (paramInputStream == null) {
          break;
        }
        localStringBuilder.append(paramInputStream);
      }
      return localStringBuilder.toString();
    }
    catch (IOException paramInputStream)
    {
      if (localStringBuilder.length() == 0) {
        return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
      }
    }
  }
  
  /* Error */
  public final void u(P4.o paramo)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/google/firebase/remoteconfig/internal/e:a	Ljava/util/Set;
    //   6: invokeinterface 546 1 0
    //   11: astore_2
    //   12: aload_2
    //   13: invokeinterface 551 1 0
    //   18: ifeq +25 -> 43
    //   21: aload_2
    //   22: invokeinterface 554 1 0
    //   27: checkcast 556	P4/c
    //   30: aload_1
    //   31: invokeinterface 558 2 0
    //   36: goto -24 -> 12
    //   39: astore_1
    //   40: goto +6 -> 46
    //   43: aload_0
    //   44: monitorexit
    //   45: return
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	50	0	this	e
    //   0	50	1	paramo	P4.o
    //   11	11	2	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	12	39	finally
    //   12	36	39	finally
  }
  
  public final void v()
  {
    try
    {
      c = 8;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void w()
  {
    try
    {
      Date localDate = new java/util/Date;
      localDate.<init>(o.a());
      s(Math.max(0L, p.h().a().getTime() - localDate.getTime()));
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void x(HttpURLConnection paramHttpURLConnection, String paramString)
  {
    paramHttpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", paramString);
    paramHttpURLConnection.setRequestProperty("X-Goog-Api-Key", i.r().b());
    paramHttpURLConnection.setRequestProperty("X-Android-Package", l.getPackageName());
    paramHttpURLConnection.setRequestProperty("X-Android-Cert", l());
    paramHttpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
    paramHttpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
    paramHttpURLConnection.setRequestProperty("Content-Type", "application/json");
    paramHttpURLConnection.setRequestProperty("Accept", "application/json");
  }
  
  public final void y(boolean paramBoolean)
  {
    try
    {
      b = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void z(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      e();
    }
  }
  
  public class b
    implements P4.c
  {
    public b() {}
    
    public void a(P4.o paramo)
    {
      e.c(e.this);
      e.d(e.this, paramo);
    }
    
    public void b(b paramb) {}
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */