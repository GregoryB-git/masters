package e7;

import com.google.android.gms.internal.measurement.zzfw.zzb;
import com.google.android.gms.internal.measurement.zzfw.zzc;
import com.google.android.gms.internal.measurement.zzfw.zzd;
import com.google.android.gms.internal.measurement.zzgf.zzf;
import com.google.android.gms.internal.measurement.zzgf.zzh;
import com.google.android.gms.internal.measurement.zzoh;
import d2.q;
import f;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class c
  extends b
{
  public zzfw.zzb g;
  
  public c(y6 paramy6, String paramString, int paramInt, zzfw.zzb paramzzb)
  {
    super(paramString, paramInt);
    g = paramzzb;
  }
  
  public final int a()
  {
    return g.zzb();
  }
  
  public final boolean e()
  {
    return g.zzk();
  }
  
  public final boolean f()
  {
    return false;
  }
  
  public final boolean g(Long paramLong1, Long paramLong2, zzgf.zzf paramzzf, long paramLong, b0 paramb0, boolean paramBoolean)
  {
    int i;
    if ((zzoh.zza()) && (h.h().x(a, h0.A0))) {
      i = 1;
    } else {
      i = 0;
    }
    if (g.zzj()) {
      paramLong = e;
    }
    boolean bool1 = h.zzj().u(2);
    String str = "null";
    Object localObject1 = null;
    Object localObject2;
    int j;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (bool1)
    {
      localObject2 = h.zzj().w;
      j = b;
      if (g.zzl()) {
        paramb0 = Integer.valueOf(g.zzb());
      } else {
        paramb0 = null;
      }
      ((b1)localObject2).a(Integer.valueOf(j), paramb0, h.i().c(g.zzf()), "Evaluating filter. audience, filter, event");
      localObject2 = h.zzj().w;
      localObject3 = h.m();
      localObject4 = g;
      if (localObject4 == null)
      {
        paramb0 = "null";
      }
      else
      {
        paramb0 = f.l("\nevent_filter {\n");
        if (((zzfw.zzb)localObject4).zzl()) {
          o6.O(paramb0, 0, "filter_id", Integer.valueOf(((zzfw.zzb)localObject4).zzb()));
        }
        o6.O(paramb0, 0, "event_name", ((q)localObject3).i().c(((zzfw.zzb)localObject4).zzf()));
        localObject5 = o6.D(((zzfw.zzb)localObject4).zzh(), ((zzfw.zzb)localObject4).zzi(), ((zzfw.zzb)localObject4).zzj());
        if (!((String)localObject5).isEmpty()) {
          o6.O(paramb0, 0, "filter_type", localObject5);
        }
        if (((zzfw.zzb)localObject4).zzk()) {
          o6.N(paramb0, 1, "event_count_filter", ((zzfw.zzb)localObject4).zze());
        }
        if (((zzfw.zzb)localObject4).zza() > 0)
        {
          paramb0.append("  filters {\n");
          localObject4 = ((zzfw.zzb)localObject4).zzg().iterator();
          while (((Iterator)localObject4).hasNext()) {
            ((o6)localObject3).M(paramb0, 2, (zzfw.zzc)((Iterator)localObject4).next());
          }
        }
        o6.L(paramb0, 1);
        paramb0.append("}\n}\n");
        paramb0 = paramb0.toString();
      }
      ((b1)localObject2).c("Filter definition", paramb0);
    }
    if ((g.zzl()) && (g.zzb() <= 256))
    {
      bool1 = g.zzh();
      boolean bool2 = g.zzi();
      boolean bool3 = g.zzj();
      if ((!bool1) && (!bool2) && (!bool3)) {
        j = 0;
      } else {
        j = 1;
      }
      if ((paramBoolean) && (j == 0))
      {
        paramLong2 = h.zzj().w;
        i = b;
        paramLong1 = (Long)localObject1;
        if (g.zzl()) {
          paramLong1 = Integer.valueOf(g.zzb());
        }
        paramLong2.d("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i), paramLong1);
        return true;
      }
      localObject5 = g;
      localObject3 = paramzzf.zzg();
      if (((zzfw.zzb)localObject5).zzk())
      {
        localObject1 = ((zzfw.zzb)localObject5).zze();
        try
        {
          paramb0 = new java/math/BigDecimal;
          paramb0.<init>(paramLong);
          paramb0 = b.d(paramb0, (zzfw.zzd)localObject1, 0.0D);
        }
        catch (NumberFormatException paramb0)
        {
          paramb0 = null;
        }
        if (paramb0 == null) {
          break label1686;
        }
        if (!paramb0.booleanValue()) {}
      }
      else
      {
        HashSet localHashSet = new HashSet();
        localObject1 = ((zzfw.zzb)localObject5).zzg().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramb0 = (zzfw.zzc)((Iterator)localObject1).next();
          if (paramb0.zze().isEmpty())
          {
            localObject1 = h.zzj().r;
            paramb0 = h.i().c((String)localObject3);
            localObject2 = "null or empty param name in filter. event";
            break label1058;
          }
          localHashSet.add(paramb0.zze());
        }
        localObject4 = new r.b();
        Iterator localIterator = paramzzf.zzh().iterator();
        while (localIterator.hasNext())
        {
          zzgf.zzh localzzh = (zzgf.zzh)localIterator.next();
          if (localHashSet.contains(localzzh.zzg()))
          {
            if (localzzh.zzl())
            {
              localObject2 = localzzh.zzg();
              localObject1 = localObject2;
              if (localzzh.zzl())
              {
                paramb0 = Long.valueOf(localzzh.zzd());
                localObject1 = localObject2;
                break label889;
              }
            }
            else
            {
              if (!localzzh.zzj()) {
                break label867;
              }
              localObject2 = localzzh.zzg();
              localObject1 = localObject2;
              if (localzzh.zzj())
              {
                paramb0 = Double.valueOf(localzzh.zza());
                localObject1 = localObject2;
                break label889;
              }
            }
            paramb0 = null;
            label867:
            if (localzzh.zzn())
            {
              localObject1 = localzzh.zzg();
              paramb0 = localzzh.zzh();
              label889:
              ((r.h)localObject4).put(localObject1, paramb0);
            }
            else
            {
              paramb0 = h.zzj().r;
              localObject1 = h.i().c((String)localObject3);
              localObject2 = h.i().f(localzzh.zzg());
              localObject3 = "Unknown value for param. event, param";
              break label1675;
            }
          }
        }
        localObject1 = ((zzfw.zzb)localObject5).zzg().iterator();
        for (;;)
        {
          if (!((Iterator)localObject1).hasNext()) {
            break label1692;
          }
          localObject5 = (zzfw.zzc)((Iterator)localObject1).next();
          if ((((zzfw.zzc)localObject5).zzg()) && (((zzfw.zzc)localObject5).zzf())) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          }
          localObject2 = ((zzfw.zzc)localObject5).zze();
          if (((String)localObject2).isEmpty())
          {
            localObject1 = h.zzj().r;
            paramb0 = h.i().c((String)localObject3);
            localObject2 = "Event has empty param name. event";
            label1058:
            ((b1)localObject1).c((String)localObject2, paramb0);
            break label1686;
          }
          paramb0 = ((r.h)localObject4).getOrDefault(localObject2, null);
          if ((paramb0 instanceof Long))
          {
            if (!((zzfw.zzc)localObject5).zzh())
            {
              paramb0 = h.zzj().r;
              localObject1 = h.i().c((String)localObject3);
              localObject2 = h.i().f((String)localObject2);
              localObject3 = "No number filter for long param. event, param";
              break label1675;
            }
            paramLong = ((Long)paramb0).longValue();
            localObject2 = ((zzfw.zzc)localObject5).zzc();
            try
            {
              paramb0 = new java/math/BigDecimal;
              paramb0.<init>(paramLong);
              paramb0 = b.d(paramb0, (zzfw.zzd)localObject2, 0.0D);
            }
            catch (NumberFormatException paramb0)
            {
              paramb0 = null;
            }
            if (paramb0 == null) {
              break label1686;
            }
            if (paramb0.booleanValue() == paramBoolean) {
              break label1627;
            }
          }
          else if ((paramb0 instanceof Double))
          {
            if (!((zzfw.zzc)localObject5).zzh())
            {
              paramb0 = h.zzj().r;
              localObject1 = h.i().c((String)localObject3);
              localObject2 = h.i().f((String)localObject2);
              localObject3 = "No number filter for double param. event, param";
              break label1675;
            }
            double d = ((Double)paramb0).doubleValue();
            paramb0 = ((zzfw.zzc)localObject5).zzc();
            try
            {
              localObject2 = new java/math/BigDecimal;
              ((BigDecimal)localObject2).<init>(d);
              paramb0 = b.d((BigDecimal)localObject2, paramb0, Math.ulp(d));
            }
            catch (NumberFormatException paramb0)
            {
              paramb0 = null;
            }
            if (paramb0 == null) {
              break label1686;
            }
            if (paramb0.booleanValue() == paramBoolean) {
              break label1627;
            }
          }
          else
          {
            if (!(paramb0 instanceof String)) {
              break label1578;
            }
            if (((zzfw.zzc)localObject5).zzj())
            {
              paramb0 = b.c((String)paramb0, ((zzfw.zzc)localObject5).zzd(), h.zzj());
            }
            else
            {
              if (!((zzfw.zzc)localObject5).zzh()) {
                break label1530;
              }
              paramb0 = (String)paramb0;
              if (!o6.U(paramb0)) {
                break;
              }
              localObject2 = ((zzfw.zzc)localObject5).zzc();
              if (!o6.U(paramb0)) {}
            }
          }
          try
          {
            localObject5 = new java/math/BigDecimal;
            ((BigDecimal)localObject5).<init>(paramb0);
            paramb0 = b.d((BigDecimal)localObject5, (zzfw.zzd)localObject2, 0.0D);
          }
          catch (NumberFormatException paramb0)
          {
            for (;;) {}
          }
          paramb0 = null;
          if (paramb0 == null) {
            break label1686;
          }
          if (paramb0.booleanValue() == paramBoolean) {
            break label1627;
          }
        }
        paramb0 = h.zzj().r;
        localObject1 = h.i().c((String)localObject3);
        localObject2 = h.i().f((String)localObject2);
        localObject3 = "Invalid param value for number filter. event, param";
        break label1675;
        label1530:
        paramb0 = h.zzj().r;
        localObject1 = h.i().c((String)localObject3);
        localObject2 = h.i().f((String)localObject2);
        localObject3 = "No filter for String param. event, param";
        break label1675;
        label1578:
        localObject1 = h.zzj();
        if (paramb0 != null) {
          break label1635;
        }
        w.d("Missing param for filter. event, param", h.i().c((String)localObject3), h.i().f((String)localObject2));
      }
      label1627:
      paramb0 = Boolean.FALSE;
      break label1697;
      label1635:
      paramb0 = r;
      localObject1 = h.i().c((String)localObject3);
      localObject2 = h.i().f((String)localObject2);
      localObject3 = "Unknown param type. event, param";
      label1675:
      paramb0.d((String)localObject3, localObject1, localObject2);
      label1686:
      paramb0 = null;
      break label1697;
      label1692:
      paramb0 = Boolean.TRUE;
      label1697:
      localObject2 = h.zzj().w;
      if (paramb0 == null) {
        localObject1 = str;
      } else {
        localObject1 = paramb0;
      }
      ((b1)localObject2).c("Event filter result", localObject1);
      if (paramb0 == null) {
        return false;
      }
      localObject1 = Boolean.TRUE;
      c = ((Boolean)localObject1);
      if (!paramb0.booleanValue()) {
        return true;
      }
      this.d = ((Boolean)localObject1);
      if ((j != 0) && (paramzzf.zzk()))
      {
        paramzzf = Long.valueOf(paramzzf.zzd());
        if (g.zzi())
        {
          paramLong2 = paramzzf;
          if (i != 0)
          {
            paramLong2 = paramzzf;
            if (g.zzk()) {
              paramLong2 = paramLong1;
            }
          }
          f = paramLong2;
        }
        else
        {
          paramLong1 = paramzzf;
          if (i != 0)
          {
            paramLong1 = paramzzf;
            if (g.zzk()) {
              paramLong1 = paramLong2;
            }
          }
          e = paramLong1;
        }
      }
      return true;
    }
    paramLong2 = h.zzj().r;
    paramzzf = a1.p(a);
    if (g.zzl()) {
      paramLong1 = Integer.valueOf(g.zzb());
    } else {
      paramLong1 = null;
    }
    paramLong2.d("Invalid event filter ID. appId, id", paramzzf, String.valueOf(paramLong1));
    return false;
  }
}

/* Location:
 * Qualified Name:     e7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */