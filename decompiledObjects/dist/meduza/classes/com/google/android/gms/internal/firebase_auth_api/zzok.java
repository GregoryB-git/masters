package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzok
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzok zza = new zzok();
  private final Map<String, zzcg> zzb = new HashMap();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzok zza()
  {
    return zza;
  }
  
  private final void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzcg paramzzcg)
  {
    try
    {
      if (zzb.containsKey(paramString))
      {
        boolean bool = ((zzcg)zzb.get(paramString)).equals(paramzzcg);
        if (bool) {
          return;
        }
        GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
        String str1 = String.valueOf(zzb.get(paramString));
        String str2 = String.valueOf(paramzzcg);
        paramzzcg = new java/lang/StringBuilder;
        paramzzcg.<init>("Parameters object with name ");
        paramzzcg.append(paramString);
        paramzzcg.append(" already exists (");
        paramzzcg.append(str1);
        paramzzcg.append("), cannot insert ");
        paramzzcg.append(str2);
        localGeneralSecurityException.<init>(paramzzcg.toString());
        throw localGeneralSecurityException;
      }
      zzb.put(paramString, paramzzcg);
      return;
    }
    finally {}
  }
  
  public final void zza(Map<String, zzcg> paramMap)
  {
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        zza((String)paramMap.getKey(), (zzcg)paramMap.getValue());
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzok
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */