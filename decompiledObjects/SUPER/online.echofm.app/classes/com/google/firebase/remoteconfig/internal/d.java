package com.google.firebase.remoteconfig.internal;

import P4.q;
import P4.s;
import P4.s.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Date;

public class d
{
  public static final Date e = new Date(-1L);
  public static final Date f = new Date(-1L);
  public final SharedPreferences a;
  public final Object b;
  public final Object c;
  public final Object d;
  
  public d(SharedPreferences paramSharedPreferences)
  {
    a = paramSharedPreferences;
    b = new Object();
    c = new Object();
    d = new Object();
  }
  
  public a a()
  {
    synchronized (c)
    {
      a locala = new com/google/firebase/remoteconfig/internal/d$a;
      int i = a.getInt("num_failed_fetches", 0);
      Date localDate = new java/util/Date;
      localDate.<init>(a.getLong("backoff_end_time_in_millis", -1L));
      locala.<init>(i, localDate);
      return locala;
    }
  }
  
  public long b()
  {
    return a.getLong("fetch_timeout_in_seconds", 60L);
  }
  
  public q c()
  {
    synchronized (b)
    {
      long l = a.getLong("last_fetch_time_in_millis", -1L);
      int i = a.getInt("last_fetch_status", 0);
      Object localObject2 = new P4/s$b;
      ((s.b)localObject2).<init>();
      localObject2 = ((s.b)localObject2).d(a.getLong("fetch_timeout_in_seconds", 60L)).e(a.getLong("minimum_fetch_interval_in_seconds", c.j)).c();
      localObject2 = f.d().c(i).d(l).b((s)localObject2).a();
      return (q)localObject2;
    }
  }
  
  public String d()
  {
    return a.getString("last_fetch_etag", null);
  }
  
  public Date e()
  {
    return new Date(a.getLong("last_fetch_time_in_millis", -1L));
  }
  
  public long f()
  {
    return a.getLong("last_template_version", 0L);
  }
  
  public long g()
  {
    return a.getLong("minimum_fetch_interval_in_seconds", c.j);
  }
  
  public b h()
  {
    synchronized (d)
    {
      b localb = new com/google/firebase/remoteconfig/internal/d$b;
      int i = a.getInt("num_failed_realtime_streams", 0);
      Date localDate = new java/util/Date;
      localDate.<init>(a.getLong("realtime_backoff_end_time_in_millis", -1L));
      localb.<init>(i, localDate);
      return localb;
    }
  }
  
  public void i()
  {
    k(0, f);
  }
  
  public void j()
  {
    o(0, f);
  }
  
  public void k(int paramInt, Date paramDate)
  {
    synchronized (c)
    {
      a.edit().putInt("num_failed_fetches", paramInt).putLong("backoff_end_time_in_millis", paramDate.getTime()).apply();
      return;
    }
  }
  
  public void l(s params)
  {
    synchronized (b)
    {
      a.edit().putLong("fetch_timeout_in_seconds", params.a()).putLong("minimum_fetch_interval_in_seconds", params.b()).commit();
      return;
    }
  }
  
  public void m(String paramString)
  {
    synchronized (b)
    {
      a.edit().putString("last_fetch_etag", paramString).apply();
      return;
    }
  }
  
  public void n(long paramLong)
  {
    synchronized (b)
    {
      a.edit().putLong("last_template_version", paramLong).apply();
      return;
    }
  }
  
  public void o(int paramInt, Date paramDate)
  {
    synchronized (d)
    {
      a.edit().putInt("num_failed_realtime_streams", paramInt).putLong("realtime_backoff_end_time_in_millis", paramDate.getTime()).apply();
      return;
    }
  }
  
  public void p()
  {
    synchronized (b)
    {
      a.edit().putInt("last_fetch_status", 1).apply();
      return;
    }
  }
  
  public void q(Date paramDate)
  {
    synchronized (b)
    {
      a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", paramDate.getTime()).apply();
      return;
    }
  }
  
  public void r()
  {
    synchronized (b)
    {
      a.edit().putInt("last_fetch_status", 2).apply();
      return;
    }
  }
  
  public static class a
  {
    public int a;
    public Date b;
    
    public a(int paramInt, Date paramDate)
    {
      a = paramInt;
      b = paramDate;
    }
    
    public Date a()
    {
      return b;
    }
    
    public int b()
    {
      return a;
    }
  }
  
  public static class b
  {
    public int a;
    public Date b;
    
    public b(int paramInt, Date paramDate)
    {
      a = paramInt;
      b = paramDate;
    }
    
    public Date a()
    {
      return b;
    }
    
    public int b()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */