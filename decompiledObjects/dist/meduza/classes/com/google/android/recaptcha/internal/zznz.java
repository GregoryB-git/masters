package com.google.android.recaptcha.internal;

final class zznz
  implements zzog
{
  private final zzog[] zza;
  
  public zznz(zzog... paramVarArgs)
  {
    zza = paramVarArgs;
  }
  
  public final zzof zzb(Class paramClass)
  {
    for (int i = 0; i < 2; i++)
    {
      zzog localzzog = zza[i];
      if (localzzog.zzc(paramClass)) {
        return localzzog.zzb(paramClass);
      }
    }
    throw new UnsupportedOperationException("No factory is available for message type: ".concat(paramClass.getName()));
  }
  
  public final boolean zzc(Class paramClass)
  {
    for (int i = 0; i < 2; i++) {
      if (zza[i].zzc(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */