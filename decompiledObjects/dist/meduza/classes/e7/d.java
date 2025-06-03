package e7;

import com.google.android.gms.internal.measurement.zzfw.zzc;
import com.google.android.gms.internal.measurement.zzfw.zzd;
import com.google.android.gms.internal.measurement.zzfw.zze;
import com.google.android.gms.internal.measurement.zzgf.zzp;
import com.google.android.gms.internal.measurement.zzoh;
import d2.q;
import java.math.BigDecimal;

public final class d
  extends b
{
  public zzfw.zze g;
  
  public d(y6 paramy6, String paramString, int paramInt, zzfw.zze paramzze)
  {
    super(paramString, paramInt);
    g = paramzze;
  }
  
  public final int a()
  {
    return g.zza();
  }
  
  public final boolean e()
  {
    return false;
  }
  
  public final boolean f()
  {
    return true;
  }
  
  public final boolean g(Long paramLong1, Long paramLong2, zzgf.zzp paramzzp, boolean paramBoolean)
  {
    int i;
    if ((zzoh.zza()) && (h.h().x(a, h0.y0))) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool1 = g.zzf();
    boolean bool2 = g.zzg();
    boolean bool3 = g.zzh();
    int j;
    if ((!bool1) && (!bool2) && (!bool3)) {
      j = 0;
    } else {
      j = 1;
    }
    Object localObject1 = null;
    zzfw.zzd localzzd = null;
    Object localObject2 = null;
    if ((paramBoolean) && (j == 0))
    {
      paramLong2 = h.zzj().w;
      i = b;
      paramLong1 = (Long)localObject2;
      if (g.zzi()) {
        paramLong1 = Integer.valueOf(g.zza());
      }
      paramLong2.d("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i), paramLong1);
      return true;
    }
    Object localObject3 = g.zzb();
    bool1 = ((zzfw.zzc)localObject3).zzf();
    long l1;
    if (paramzzp.zzk())
    {
      if (!((zzfw.zzc)localObject3).zzh())
      {
        localObject1 = h.zzj().r;
        localObject2 = h.i().g(paramzzp.zzg());
        localObject3 = "No number filter for long property. property";
        break label593;
      }
      l1 = paramzzp.zzc();
      localObject2 = ((zzfw.zzc)localObject3).zzc();
    }
    try
    {
      localObject3 = new java/math/BigDecimal;
      ((BigDecimal)localObject3).<init>(l1);
      localObject2 = b.d((BigDecimal)localObject3, (zzfw.zzd)localObject2, 0.0D);
      localObject1 = localObject2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      double d;
      long l2;
      for (;;) {}
    }
    if (paramzzp.zzi())
    {
      if (!((zzfw.zzc)localObject3).zzh())
      {
        localObject1 = h.zzj().r;
        localObject2 = h.i().g(paramzzp.zzg());
        localObject3 = "No number filter for double property. property";
        break label593;
      }
      d = paramzzp.zza();
      localObject3 = ((zzfw.zzc)localObject3).zzc();
      localObject2 = new java/math/BigDecimal;
      ((BigDecimal)localObject2).<init>(d);
      localObject2 = b.d((BigDecimal)localObject2, (zzfw.zzd)localObject3, Math.ulp(d));
      localObject1 = localObject2;
    }
    else
    {
      if (!paramzzp.zzm()) {
        break label561;
      }
      if (!((zzfw.zzc)localObject3).zzj())
      {
        if (!((zzfw.zzc)localObject3).zzh())
        {
          localObject1 = h.zzj().r;
          localObject2 = h.i().g(paramzzp.zzg());
          localObject3 = "No string or number filter defined. property";
          break label593;
        }
        if (o6.U(paramzzp.zzh()))
        {
          localObject2 = paramzzp.zzh();
          localzzd = ((zzfw.zzc)localObject3).zzc();
          if (o6.U((String)localObject2))
          {
            localObject3 = new java/math/BigDecimal;
            ((BigDecimal)localObject3).<init>((String)localObject2);
            localObject2 = b.d((BigDecimal)localObject3, localzzd, 0.0D);
            localObject1 = localObject2;
          }
        }
        else
        {
          h.zzj().r.d("Invalid user property value for Numeric number filter. property, value", h.i().g(paramzzp.zzg()), paramzzp.zzh());
          localObject1 = localzzd;
          break label606;
        }
      }
      else
      {
        localObject1 = b.c(paramzzp.zzh(), ((zzfw.zzc)localObject3).zzd(), h.zzj());
      }
    }
    localObject1 = b.b((Boolean)localObject1, bool1);
    break label606;
    label561:
    localObject1 = h.zzj().r;
    localObject2 = h.i().g(paramzzp.zzg());
    localObject3 = "User property has no value, property";
    label593:
    ((b1)localObject1).c((String)localObject3, localObject2);
    localObject1 = localzzd;
    label606:
    localObject3 = h.zzj().w;
    if (localObject1 == null) {
      localObject2 = "null";
    } else {
      localObject2 = localObject1;
    }
    ((b1)localObject3).c("Property filter result", localObject2);
    if (localObject1 == null) {
      return false;
    }
    c = Boolean.TRUE;
    if ((bool3) && (!((Boolean)localObject1).booleanValue())) {
      return true;
    }
    if ((!paramBoolean) || (g.zzf())) {
      this.d = ((Boolean)localObject1);
    }
    if ((((Boolean)localObject1).booleanValue()) && (j != 0) && (paramzzp.zzl()))
    {
      l1 = paramzzp.zzd();
      if (paramLong1 != null) {
        l1 = paramLong1.longValue();
      }
      l2 = l1;
      if (i != 0)
      {
        l2 = l1;
        if (g.zzf())
        {
          l2 = l1;
          if (!g.zzg())
          {
            l2 = l1;
            if (paramLong2 != null) {
              l2 = paramLong2.longValue();
            }
          }
        }
      }
      if (g.zzg()) {
        f = Long.valueOf(l2);
      } else {
        e = Long.valueOf(l2);
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     e7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */