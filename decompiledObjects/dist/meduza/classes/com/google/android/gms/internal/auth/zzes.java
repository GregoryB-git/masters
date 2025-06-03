package com.google.android.gms.internal.auth;

final class zzes
  implements zzfv
{
  private static final zzes zza = new zzes();
  
  public static zzes zza()
  {
    return zza;
  }
  
  public final zzfu zzb(Class paramClass)
  {
    if (zzev.class.isAssignableFrom(paramClass)) {
      try
      {
        zzfu localzzfu = (zzfu)zzev.zzb(paramClass.asSubclass(zzev.class)).zzn(3, null, null);
        return localzzfu;
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Unable to get message info for ".concat(paramClass.getName()), localException);
      }
    }
    throw new IllegalArgumentException("Unsupported message type: ".concat(paramClass.getName()));
  }
  
  public final boolean zzc(Class paramClass)
  {
    return zzev.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */