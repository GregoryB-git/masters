package m2;

import android.app.job.JobInfo.Builder;
import c2.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p2.a;

public abstract class f
{
  public static a b()
  {
    return new a();
  }
  
  public static f d(a parama, Map paramMap)
  {
    return new b(parama, paramMap);
  }
  
  public static f f(a parama)
  {
    return b().a(d.o, b.a().b(30000L).d(86400000L).a()).a(d.q, b.a().b(1000L).d(86400000L).a()).a(d.p, b.a().b(86400000L).d(86400000L).c(i(new c[] { c.p })).a()).c(parama).b();
  }
  
  public static Set i(Object... paramVarArgs)
  {
    return Collections.unmodifiableSet(new HashSet(Arrays.asList(paramVarArgs)));
  }
  
  public final long a(int paramInt, long paramLong)
  {
    
    long l;
    if (paramLong > 1L) {
      l = paramLong;
    } else {
      l = 2L;
    }
    double d = Math.max(1.0D, Math.log(10000.0D) / Math.log(l * paramInt));
    return (Math.pow(3.0D, paramInt) * paramLong * d);
  }
  
  public JobInfo.Builder c(JobInfo.Builder paramBuilder, d paramd, long paramLong, int paramInt)
  {
    paramBuilder.setMinimumLatency(g(paramd, paramLong, paramInt));
    j(paramBuilder, ((b)h().get(paramd)).c());
    return paramBuilder;
  }
  
  public abstract a e();
  
  public long g(d paramd, long paramLong, int paramInt)
  {
    long l = e().a();
    paramd = (b)h().get(paramd);
    return Math.min(Math.max(a(paramInt, paramd.b()), paramLong - l), paramd.d());
  }
  
  public abstract Map h();
  
  public final void j(JobInfo.Builder paramBuilder, Set paramSet)
  {
    if (paramSet.contains(c.o)) {
      paramBuilder.setRequiredNetworkType(2);
    } else {
      paramBuilder.setRequiredNetworkType(1);
    }
    if (paramSet.contains(c.q)) {
      paramBuilder.setRequiresCharging(true);
    }
    if (paramSet.contains(c.p)) {
      paramBuilder.setRequiresDeviceIdle(true);
    }
  }
  
  public static class a
  {
    public a a;
    public Map b = new HashMap();
    
    public a a(d paramd, f.b paramb)
    {
      b.put(paramd, paramb);
      return this;
    }
    
    public f b()
    {
      if (a != null)
      {
        if (b.keySet().size() >= d.values().length)
        {
          Map localMap = b;
          b = new HashMap();
          return f.d(a, localMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
      }
      throw new NullPointerException("missing required property: clock");
    }
    
    public a c(a parama)
    {
      a = parama;
      return this;
    }
  }
  
  public static abstract class b
  {
    public static a a()
    {
      return new c.b().c(Collections.emptySet());
    }
    
    public abstract long b();
    
    public abstract Set c();
    
    public abstract long d();
    
    public static abstract class a
    {
      public abstract f.b a();
      
      public abstract a b(long paramLong);
      
      public abstract a c(Set paramSet);
      
      public abstract a d(long paramLong);
    }
  }
  
  public static enum c
  {
    static
    {
      c localc1 = new c("NETWORK_UNMETERED", 0);
      o = localc1;
      c localc2 = new c("DEVICE_IDLE", 1);
      p = localc2;
      c localc3 = new c("DEVICE_CHARGING", 2);
      q = localc3;
      r = new c[] { localc1, localc2, localc3 };
    }
  }
}

/* Location:
 * Qualified Name:     m2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */