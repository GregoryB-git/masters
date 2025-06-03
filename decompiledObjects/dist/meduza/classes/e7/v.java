package e7;

import android.content.Context;
import android.os.Handler;
import b.z;
import com.google.android.gms.internal.measurement.zzdj;
import i6.p;
import m6.j;

public abstract class v
{
  public static volatile zzdj d;
  public final c3 a;
  public final p b;
  public volatile long c;
  
  public v(c3 paramc3)
  {
    j.i(paramc3);
    a = paramc3;
    b = new p(this, paramc3, 3);
  }
  
  public final void a()
  {
    c = 0L;
    d().removeCallbacks(b);
  }
  
  public final void b(long paramLong)
  {
    a();
    if (paramLong >= 0L)
    {
      ((z)a.zzb()).getClass();
      c = System.currentTimeMillis();
      if (!d().postDelayed(b, paramLong)) {
        a.zzj().o.c("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public abstract void c();
  
  public final Handler d()
  {
    if (d != null) {
      return d;
    }
    try
    {
      if (d == null)
      {
        localzzdj = new com/google/android/gms/internal/measurement/zzdj;
        localzzdj.<init>(a.zza().getMainLooper());
        d = localzzdj;
      }
      zzdj localzzdj = d;
      return localzzdj;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     e7.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */