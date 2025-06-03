package com.google.android.recaptcha.internal;

final class zzmw
  implements zzog
{
  private static final zzmw zza = new zzmw();
  
  public static zzmw zza()
  {
    return zza;
  }
  
  public final zzof zzb(Class paramClass)
  {
    if (zznd.class.isAssignableFrom(paramClass)) {
      try
      {
        zzof localzzof = (zzof)zznd.zzu(paramClass.asSubclass(zznd.class)).zzh(3, null, null);
        return localzzof;
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
    return zznd.class.isAssignableFrom(paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */