package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;
import java.util.Objects;

public final class zznu
{
  private final com.google.android.gms.internal.firebase-auth-api.zznr zza;
  private final List<zznw> zzb;
  private final Integer zzc;
  
  private zznu(zznr paramzznr, List<zznw> paramList, Integer paramInteger)
  {
    zza = paramzznr;
    zzb = paramList;
    zzc = paramInteger;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zznu)) {
      return false;
    }
    paramObject = (zznu)paramObject;
    return (zza.equals(zza)) && (zzb.equals(zzb)) && (Objects.equals(zzc, zzc));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { zza, zzb });
  }
  
  public final String toString()
  {
    return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[] { zza, zzb, zzc });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */