package com.google.android.gms.internal.firebase_auth_api;

import f;

final class zzalc
  implements com.google.android.gms.internal.firebase-auth-api.zzalk
{
  private com.google.android.gms.internal.firebase-auth-api.zzalk[] zza;
  
  public zzalc(com.google.android.gms.internal.firebase-auth-api.zzalk... paramVarArgs)
  {
    zza = paramVarArgs;
  }
  
  public final zzall zza(Class<?> paramClass)
  {
    for (com.google.android.gms.internal.firebase-auth-api.zzalk localzzalk : zza) {
      if (localzzalk.zzb(paramClass)) {
        return localzzalk.zza(paramClass);
      }
    }
    throw new UnsupportedOperationException(f.j("No factory is available for message type: ", paramClass.getName()));
  }
  
  public final boolean zzb(Class<?> paramClass)
  {
    com.google.android.gms.internal.firebase-auth-api.zzalk[] arrayOfzzalk = zza;
    int i = arrayOfzzalk.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfzzalk[j].zzb(paramClass)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzalc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */