package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbq;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

public final class zznx
{
  private ArrayList<zznw> zza = new ArrayList();
  private com.google.android.gms.internal.firebase-auth-api.zznr zzb = zznr.zza;
  private Integer zzc = null;
  
  public final com.google.android.gms.internal.firebase-auth-api.zznu zza()
  {
    if (zza != null)
    {
      Object localObject1 = zzc;
      if (localObject1 != null)
      {
        int i = ((Integer)localObject1).intValue();
        localObject1 = zza;
        int j = ((ArrayList)localObject1).size();
        int k = 0;
        int m = 0;
        Object localObject2;
        do
        {
          n = k;
          if (m >= j) {
            break;
          }
          localObject2 = ((ArrayList)localObject1).get(m);
          m++;
        } while (((zznw)localObject2).zza() != i);
        int n = 1;
        if (n == 0) {
          throw new GeneralSecurityException("primary key ID is not present in entries");
        }
      }
      localObject1 = new zznu(zzb, Collections.unmodifiableList(zza), zzc, null);
      zza = null;
      return (com.google.android.gms.internal.firebase-auth-api.zznu)localObject1;
    }
    throw new IllegalStateException("cannot call build() twice");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zznx zza(int paramInt)
  {
    if (zza != null)
    {
      zzc = Integer.valueOf(paramInt);
      return this;
    }
    throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zznx zza(zzbq paramzzbq, int paramInt, String paramString1, String paramString2)
  {
    ArrayList localArrayList = zza;
    if (localArrayList != null)
    {
      localArrayList.add(new zznw(paramzzbq, paramInt, paramString1, paramString2, null));
      return this;
    }
    throw new IllegalStateException("addEntry cannot be called after build()");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zznx zza(com.google.android.gms.internal.firebase-auth-api.zznr paramzznr)
  {
    if (zza != null)
    {
      zzb = paramzznr;
      return this;
    }
    throw new IllegalStateException("setAnnotations cannot be called after build()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */