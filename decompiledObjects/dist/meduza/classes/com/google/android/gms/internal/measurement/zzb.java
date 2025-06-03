package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzb
{
  private final zzf zza;
  private zzh zzb;
  private zzac zzc;
  private final zzaa zzd;
  
  public zzb()
  {
    this(new zzf());
  }
  
  private zzb(zzf paramzzf)
  {
    zza = paramzzf;
    zzb = zza.zza();
    zzc = new zzac();
    zzd = new zzaa();
    paramzzf.zza("internal.registerCallback", new zza(this));
    paramzzf.zza("internal.eventLogger", new zzd(this));
  }
  
  public final zzac zza()
  {
    return zzc;
  }
  
  public final void zza(zzgr.zzc paramzzc)
  {
    try
    {
      zzb = zza.zza.zza();
      Object localObject1 = paramzzc.zzc();
      if (!(zza.zza(zzb, (zzgr.zzd[])((List)localObject1).toArray(new zzgr.zzd[0])) instanceof zzaj))
      {
        Object localObject2 = paramzzc.zza().zzd().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (zzgr.zzb)((Iterator)localObject2).next();
          paramzzc = ((zzgr.zzb)localObject1).zzc();
          localObject1 = ((zzgr.zzb)localObject1).zzb();
          Iterator localIterator = paramzzc.iterator();
          while (localIterator.hasNext())
          {
            paramzzc = (zzgr.zzd)localIterator.next();
            zzaq localzzaq = zza.zza(zzb, new zzgr.zzd[] { paramzzc });
            if (!(localzzaq instanceof zzap)) {
              break label266;
            }
            paramzzc = zzb;
            if (!paramzzc.zzb((String)localObject1))
            {
              paramzzc = null;
            }
            else
            {
              paramzzc = paramzzc.zza((String)localObject1);
              if (!(paramzzc instanceof zzal)) {
                break label236;
              }
              paramzzc = (zzal)paramzzc;
            }
            if (paramzzc == null) {
              break label206;
            }
            paramzzc.zza(zzb, Collections.singletonList(localzzaq));
          }
          continue;
          label206:
          localObject2 = new java/lang/IllegalStateException;
          paramzzc = new java/lang/StringBuilder;
          paramzzc.<init>("Rule function is undefined: ");
          paramzzc.append((String)localObject1);
          ((IllegalStateException)localObject2).<init>(paramzzc.toString());
          throw ((Throwable)localObject2);
          label236:
          localObject2 = new java/lang/IllegalStateException;
          paramzzc = new java/lang/StringBuilder;
          paramzzc.<init>("Invalid function name: ");
          paramzzc.append((String)localObject1);
          ((IllegalStateException)localObject2).<init>(paramzzc.toString());
          throw ((Throwable)localObject2);
          label266:
          paramzzc = new java/lang/IllegalArgumentException;
          paramzzc.<init>("Invalid rule definition");
          throw paramzzc;
        }
        return;
      }
      paramzzc = new java/lang/IllegalStateException;
      paramzzc.<init>("Program loading failed");
      throw paramzzc;
    }
    finally {}
  }
  
  public final void zza(String paramString, Callable<? extends zzal> paramCallable)
  {
    zza.zza(paramString, paramCallable);
  }
  
  public final boolean zza(zzad paramzzad)
  {
    try
    {
      zzc.zza(paramzzad);
      paramzzad = zza.zzb;
      zzai localzzai = new com/google/android/gms/internal/measurement/zzai;
      localzzai.<init>(Double.valueOf(0.0D));
      paramzzad.zzc("runtime.counter", localzzai);
      zzd.zza(zzb.zza(), zzc);
      if (!zzc())
      {
        boolean bool = zzb();
        if (!bool) {
          return false;
        }
      }
      return true;
    }
    finally {}
  }
  
  public final boolean zzb()
  {
    return !zzc.zzc().isEmpty();
  }
  
  public final boolean zzc()
  {
    return !zzc.zzb().equals(zzc.zza());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */