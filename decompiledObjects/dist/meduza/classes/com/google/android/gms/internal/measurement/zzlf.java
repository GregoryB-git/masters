package com.google.android.gms.internal.measurement;

import f;

final class zzlf
  implements zzln
{
  private zzln[] zza;
  
  public zzlf(zzln... paramVarArgs)
  {
    zza = paramVarArgs;
  }
  
  public final zzlk zza(Class<?> paramClass)
  {
    for (zzln localzzln : zza) {
      if (localzzln.zzb(paramClass)) {
        return localzzln.zza(paramClass);
      }
    }
    throw new UnsupportedOperationException(f.j("No factory is available for message type: ", paramClass.getName()));
  }
  
  public final boolean zzb(Class<?> paramClass)
  {
    zzln[] arrayOfzzln = zza;
    int i = arrayOfzzln.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfzzln[j].zzb(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzlf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */