package com.google.android.recaptcha.internal;

import android.content.Context;
import dc.p;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kc.c;
import n7.w;
import nc.d0;
import p2.m0;
import rb.h;
import sb.b0;
import sb.r;
import ub.e;
import x6.b;

public final class zzes
  implements zzeo
{
  private static Timer zza;
  private final Context zzb;
  private final zzet zzc;
  private final d0 zzd;
  private final zzei zze;
  
  public zzes(Context paramContext, zzet paramzzet, d0 paramd0)
  {
    zzb = paramContext;
    zzc = paramzzet;
    zzd = paramd0;
    paramd0 = null;
    try
    {
      zzei localzzei = zzei.zzc();
      paramzzet = localzzei;
      if (localzzei == null)
      {
        paramzzet = new com/google/android/recaptcha/internal/zzei;
        paramzzet.<init>(paramContext, null);
      }
      zzei.zze(paramzzet);
      paramContext = paramzzet;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = paramd0;
      }
    }
    zze = paramContext;
    zzh();
  }
  
  private final void zzg()
  {
    Object localObject1 = zze;
    if (localObject1 != null)
    {
      Object localObject2 = ((zzei)localObject1).zzd();
      i.e(localObject2, "<this>");
      int j;
      int k;
      if ((localObject2 instanceof RandomAccess))
      {
        int i = ((List)localObject2).size();
        j = i / 20;
        if (i % 20 == 0) {
          k = 0;
        } else {
          k = 1;
        }
        localObject3 = new ArrayList(j + k);
        for (k = 0;; k += 20)
        {
          if ((k >= 0) && (k < i)) {
            j = 1;
          } else {
            j = 0;
          }
          localObject1 = localObject3;
          if (j == 0) {
            break;
          }
          j = i - k;
          if (20 <= j) {
            j = 20;
          }
          localObject1 = new ArrayList(j);
          for (int m = 0; m < j; m++) {
            ((ArrayList)localObject1).add(((List)localObject2).get(m + k));
          }
          ((ArrayList)localObject3).add(localObject1);
        }
      }
      Object localObject4 = new ArrayList();
      localObject1 = ((Iterable)localObject2).iterator();
      i.e(localObject1, "iterator");
      if (!((Iterator)localObject1).hasNext())
      {
        localObject3 = r.a;
      }
      else
      {
        localObject1 = new b0(20, 20, (Iterator)localObject1, false, true, null);
        localObject3 = new c();
        c = m0.u(localObject3, (e)localObject3, (p)localObject1);
      }
      for (;;)
      {
        localObject1 = localObject4;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        ((ArrayList)localObject4).add((List)((Iterator)localObject3).next());
      }
      Object localObject3 = ((List)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (List)((Iterator)localObject3).next();
        localObject4 = zzrf.zzi();
        localObject1 = new ArrayList();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          zzej localzzej = (zzej)((Iterator)localObject2).next();
          zzei localzzei;
          try
          {
            Object localObject5 = localzzej.zzc();
            localObject5 = zztx.zzk(zzkh.zzg().zzj((CharSequence)localObject5));
            k = ((zztx)localObject5).zzN();
            j = k - 1;
            if (k != 0)
            {
              if (j != 0)
              {
                if (j != 1)
                {
                  if (j == 2) {
                    localObject5 = h.a;
                  } else {
                    throw new w();
                  }
                }
                else {
                  ((zzrd)localObject4).zzr(((zztx)localObject5).zzg());
                }
              }
              else {
                ((zzrd)localObject4).zzq(((zztx)localObject5).zzf());
              }
              ((ArrayList)localObject1).add(localzzej);
              continue;
            }
            throw null;
          }
          catch (Exception localException)
          {
            localzzei = zze;
          }
          if (localzzei != null) {
            localzzei.zzf(localzzej);
          }
        }
        k = ((zzrd)localObject4).zze();
        if (((zzrd)localObject4).zzf() + k != 0)
        {
          localObject4 = ((zzrf)((zzmx)localObject4).zzi()).zzd();
          if (zzc.zza((byte[])localObject4))
          {
            localObject4 = zze;
            if (localObject4 != null) {
              ((zzei)localObject4).zza((List)localObject1);
            }
          }
        }
      }
    }
  }
  
  private final void zzh()
  {
    if (zza == null)
    {
      Timer localTimer = new Timer();
      zza = localTimer;
      localTimer.schedule(new zzep(this), 120000L, 120000L);
    }
  }
  
  public final void zza(zztx paramzztx)
  {
    paramzztx = new zzer(this, paramzztx, null);
    b.g0(zzd, null, paramzztx, 3);
    zzh();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */