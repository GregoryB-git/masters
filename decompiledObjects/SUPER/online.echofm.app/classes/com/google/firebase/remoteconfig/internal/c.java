package com.google.firebase.remoteconfig.internal;

import P4.n;
import P4.o;
import P4.p;
import P4.r;
import Q4.f;
import Q4.g;
import Q4.h;
import V2.m;
import android.text.format.DateUtils;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import w3.a;

public class c
{
  public static final long j = TimeUnit.HOURS.toSeconds(12L);
  public static final int[] k = { 2, 4, 8, 16, 32, 64, 128, 256 };
  public final s4.i a;
  public final r4.b b;
  public final Executor c;
  public final E2.e d;
  public final Random e;
  public final Q4.e f;
  public final ConfigFetchHttpClient g;
  public final d h;
  public final Map i;
  
  public c(s4.i parami, r4.b paramb, Executor paramExecutor, E2.e parame, Random paramRandom, Q4.e parame1, ConfigFetchHttpClient paramConfigFetchHttpClient, d paramd, Map paramMap)
  {
    a = parami;
    b = paramb;
    c = paramExecutor;
    d = parame;
    e = paramRandom;
    f = parame1;
    g = paramConfigFetchHttpClient;
    h = paramd;
    i = paramMap;
  }
  
  public final d.a A(int paramInt, Date paramDate)
  {
    if (t(paramInt)) {
      B(paramDate);
    }
    return h.a();
  }
  
  public final void B(Date paramDate)
  {
    int m = h.a().b() + 1;
    long l = q(m);
    paramDate = new Date(paramDate.getTime() + l);
    h.k(m, paramDate);
  }
  
  public final void C(V2.j paramj, Date paramDate)
  {
    if (paramj.n())
    {
      h.q(paramDate);
      return;
    }
    paramj = paramj.i();
    if (paramj == null) {
      return;
    }
    if ((paramj instanceof p)) {
      h.r();
    } else {
      h.p();
    }
  }
  
  public final boolean f(long paramLong, Date paramDate)
  {
    Date localDate = h.e();
    if (localDate.equals(d.e)) {
      return false;
    }
    return paramDate.before(new Date(localDate.getTime() + TimeUnit.SECONDS.toMillis(paramLong)));
  }
  
  public final r g(r paramr)
  {
    int m = paramr.a();
    String str;
    if (m != 401)
    {
      if (m != 403)
      {
        if (m != 429)
        {
          if (m != 500) {
            switch (m)
            {
            default: 
              str = "The server returned an unexpected error.";
              break;
            case 502: 
            case 503: 
            case 504: 
              str = "The server is unavailable. Please try again later.";
              break;
            }
          } else {
            str = "There was an internal server error.";
          }
        }
        else {
          throw new n("The throttled response from the server was not handled correctly by the FRC SDK.");
        }
      }
      else {
        str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
      }
    }
    else {
      str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
    }
    m = paramr.a();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fetch failed: ");
    localStringBuilder.append(str);
    return new r(m, localStringBuilder.toString(), paramr);
  }
  
  public final String h(long paramLong)
  {
    return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[] { DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(paramLong)) });
  }
  
  public V2.j i()
  {
    return j(h.g());
  }
  
  public V2.j j(long paramLong)
  {
    HashMap localHashMap = new HashMap(i);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.p.c());
    localStringBuilder.append("/");
    localStringBuilder.append(1);
    localHashMap.put("X-Firebase-RC-Fetch-Type", localStringBuilder.toString());
    return f.e().h(c, new f(this, paramLong, localHashMap));
  }
  
  public final a k(String paramString1, String paramString2, Date paramDate, Map paramMap)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = g.d();
      paramString1 = g.fetch(localHttpURLConnection, paramString1, paramString2, s(), h.d(), paramMap, p(), paramDate);
      if (paramString1.d() != null) {
        h.n(paramString1.d().i());
      }
    }
    catch (r paramString1)
    {
      break label94;
    }
    if (paramString1.e() != null) {
      h.m(paramString1.e());
    }
    h.i();
    return paramString1;
    label94:
    paramString2 = A(paramString1.a(), paramDate);
    if (z(paramString2, paramString1.a())) {
      throw new p(paramString2.a().getTime());
    }
    throw g(paramString1);
  }
  
  public final V2.j l(String paramString1, String paramString2, Date paramDate, Map paramMap)
  {
    try
    {
      paramString2 = k(paramString1, paramString2, paramDate, paramMap);
      if (paramString2.f() != 0) {
        return m.e(paramString2);
      }
    }
    catch (o paramString1)
    {
      break label63;
      paramMap = f.k(paramString2.d());
      paramString1 = c;
      paramDate = new Q4/j;
      paramDate.<init>(paramString2);
      paramString1 = paramMap.p(paramString1, paramDate);
      return paramString1;
    }
    label63:
    return m.d(paramString1);
  }
  
  public final V2.j m(V2.j paramj, long paramLong, Map paramMap)
  {
    Date localDate = new Date(d.a());
    if ((paramj.n()) && (f(paramLong, localDate))) {
      return m.e(a.c(localDate));
    }
    paramj = o(localDate);
    if (paramj != null)
    {
      paramj = m.d(new p(h(paramj.getTime() - localDate.getTime()), paramj.getTime()));
    }
    else
    {
      V2.j localj = a.a();
      paramj = a.b(false);
      paramj = m.i(new V2.j[] { localj, paramj }).h(c, new h(this, localj, paramj, localDate, paramMap));
    }
    return paramj.h(c, new Q4.i(this, localDate));
  }
  
  public V2.j n(b paramb, int paramInt)
  {
    HashMap localHashMap = new HashMap(i);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramb.c());
    localStringBuilder.append("/");
    localStringBuilder.append(paramInt);
    localHashMap.put("X-Firebase-RC-Fetch-Type", localStringBuilder.toString());
    return f.e().h(c, new g(this, localHashMap));
  }
  
  public final Date o(Date paramDate)
  {
    Date localDate = h.a().a();
    if (paramDate.before(localDate)) {
      return localDate;
    }
    return null;
  }
  
  public final Long p()
  {
    a locala = (a)b.get();
    if (locala == null) {
      return null;
    }
    return (Long)locala.a(true).get("_fot");
  }
  
  public final long q(int paramInt)
  {
    TimeUnit localTimeUnit = TimeUnit.MINUTES;
    int[] arrayOfInt = k;
    long l = localTimeUnit.toMillis(arrayOfInt[(Math.min(paramInt, arrayOfInt.length) - 1)]);
    return l / 2L + e.nextInt((int)l);
  }
  
  public long r()
  {
    return h.f();
  }
  
  public final Map s()
  {
    HashMap localHashMap = new HashMap();
    Object localObject = (a)b.get();
    if (localObject == null) {
      return localHashMap;
    }
    Iterator localIterator = ((a)localObject).a(false).entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      localHashMap.put((String)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue().toString());
    }
    return localHashMap;
  }
  
  public final boolean t(int paramInt)
  {
    boolean bool;
    if ((paramInt != 429) && (paramInt != 502) && (paramInt != 503) && (paramInt != 504)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean z(d.a parama, int paramInt)
  {
    int m = parama.b();
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (m <= 1) {
      if (paramInt == 429) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public static class a
  {
    public final Date a;
    public final int b;
    public final b c;
    public final String d;
    
    public a(Date paramDate, int paramInt, b paramb, String paramString)
    {
      a = paramDate;
      b = paramInt;
      c = paramb;
      d = paramString;
    }
    
    public static a a(Date paramDate, b paramb)
    {
      return new a(paramDate, 1, paramb, null);
    }
    
    public static a b(b paramb, String paramString)
    {
      return new a(paramb.g(), 0, paramb, paramString);
    }
    
    public static a c(Date paramDate)
    {
      return new a(paramDate, 2, null, null);
    }
    
    public b d()
    {
      return c;
    }
    
    public String e()
    {
      return d;
    }
    
    public int f()
    {
      return b;
    }
  }
  
  public static enum b
  {
    public final String o;
    
    static
    {
      b localb1 = new b("BASE", 0, "BASE");
      p = localb1;
      b localb2 = new b("REALTIME", 1, "REALTIME");
      q = localb2;
      r = new b[] { localb1, localb2 };
    }
    
    public b(String paramString1)
    {
      o = paramString1;
    }
    
    public String c()
    {
      return o;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */