package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public class zzex
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzew zza;
  private final zzzn zzb;
  private final Integer zzc;
  
  private zzex(com.google.android.gms.internal.firebase-auth-api.zzew paramzzew, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzew;
    zzb = paramzzzn;
    zzc = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzex zza(com.google.android.gms.internal.firebase-auth-api.zzew paramzzew, Integer paramInteger)
  {
    zzzn localzzzn;
    if (paramzzew.zzc() == zzew.zzc.zzb)
    {
      if (paramInteger == null) {
        localzzzn = zzor.zza;
      } else {
        throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
      }
    }
    else
    {
      if (paramzzew.zzc() != zzew.zzc.zza) {
        break label74;
      }
      if (paramInteger == null) {
        break label64;
      }
      localzzzn = zzor.zzb(paramInteger.intValue());
    }
    return new zzex(paramzzew, localzzzn, paramInteger);
    label64:
    throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
    label74:
    throw new GeneralSecurityException(f.j("Unknown Variant: ", String.valueOf(paramzzew.zzc())));
  }
  
  public final Integer zza()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzew zzb()
  {
    return zza;
  }
  
  public final zzzn zzc()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */