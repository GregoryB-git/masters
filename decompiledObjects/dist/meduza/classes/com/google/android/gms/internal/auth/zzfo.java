package com.google.android.gms.internal.auth;

final class zzfo
  implements zzfv
{
  private final zzfv[] zza;
  
  public zzfo(zzfv... paramVarArgs)
  {
    zza = paramVarArgs;
  }
  
  public final zzfu zzb(Class paramClass)
  {
    zzfv[] arrayOfzzfv = zza;
    for (int i = 0; i < 2; i++)
    {
      zzfv localzzfv = arrayOfzzfv[i];
      if (localzzfv.zzc(paramClass)) {
        return localzzfv.zzb(paramClass);
      }
    }
    throw new UnsupportedOperationException("No factory is available for message type: ".concat(paramClass.getName()));
  }
  
  public final boolean zzc(Class paramClass)
  {
    zzfv[] arrayOfzzfv = zza;
    for (int i = 0; i < 2; i++) {
      if (arrayOfzzfv[i].zzc(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */