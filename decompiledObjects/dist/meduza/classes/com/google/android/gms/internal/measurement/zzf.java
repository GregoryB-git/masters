package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class zzf
{
  public final zzh zza;
  public final zzh zzb;
  private final zzbb zzc;
  private final zzl zzd;
  
  public zzf()
  {
    Object localObject = new zzbb();
    zzc = ((zzbb)localObject);
    zzh localzzh = new zzh(null, (zzbb)localObject);
    zzb = localzzh;
    zza = localzzh.zza();
    localObject = new zzl();
    zzd = ((zzl)localObject);
    localzzh.zzc("require", new zzz((zzl)localObject));
    ((zzl)localObject).zza("internal.platform", new zze());
    localzzh.zzc("runtime.counter", new zzai(Double.valueOf(0.0D)));
  }
  
  public final zzaq zza(zzh paramzzh, zzgr.zzd... paramVarArgs)
  {
    zzaq localzzaq = zzaq.zzc;
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      localzzaq = zzj.zza(paramVarArgs[j]);
      zzg.zza(zzb);
      if (((localzzaq instanceof zzat)) || ((localzzaq instanceof zzar))) {
        localzzaq = zzc.zza(paramzzh, localzzaq);
      }
    }
    return localzzaq;
  }
  
  public final void zza(String paramString, Callable<? extends zzal> paramCallable)
  {
    zzd.zza(paramString, paramCallable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */