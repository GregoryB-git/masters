package com.google.android.gms.internal.measurement;

import f;

final class zzke
  implements zzln
{
  private static final zzke zza = new zzke();
  
  public static zzke zza()
  {
    return zza;
  }
  
  public final zzlk zza(Class<?> paramClass)
  {
    if (zzkg.class.isAssignableFrom(paramClass)) {
      try
      {
        zzlk localzzlk = (zzlk)zzkg.zza(paramClass.asSubclass(zzkg.class)).zza(zzkg.zzf.zzc, null, null);
        return localzzlk;
      }
      catch (Exception localException)
      {
        throw new RuntimeException(f.j("Unable to get message info for ", paramClass.getName()), localException);
      }
    }
    throw new IllegalArgumentException(f.j("Unsupported message type: ", paramClass.getName()));
  }
  
  public final boolean zzb(Class<?> paramClass)
  {
    return zzkg.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzke
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */