package com.google.android.gms.internal.measurement;

final class zzla
  implements zzmh
{
  private static final zzln zza = new zzld();
  private final zzln zzb;
  
  public zzla()
  {
    this(new zzlf(new zzln[] { zzke.zza(), zza }));
  }
  
  private zzla(zzln paramzzln)
  {
    zzb = ((zzln)zzkj.zza(paramzzln, "messageInfoFactory"));
  }
  
  public final <T> zzme<T> zza(Class<T> paramClass)
  {
    zzmg.zza(paramClass);
    zzlk localzzlk = zzb.zza(paramClass);
    if (localzzlk.zzc()) {
      return zzls.zza(zzmg.zza(), zzjx.zza(), localzzlk.zza());
    }
    zzlu localzzlu = zzlw.zza();
    zzkw localzzkw = zzky.zza();
    zzmu localzzmu = zzmg.zza();
    int i = zzlc.zza[localzzlk.zzb().ordinal()];
    int j = 1;
    if (i == 1) {
      j = 0;
    }
    zzjv localzzjv;
    if (j != 0) {
      localzzjv = zzjx.zza();
    } else {
      localzzjv = null;
    }
    return zzlq.zza(paramClass, localzzlk, localzzlu, localzzkw, localzzmu, localzzjv, zzll.zza());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzla
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */