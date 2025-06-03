package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbo;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzbu
{
  private final List<zzbt> zza = new ArrayList();
  private com.google.android.gms.internal.firebase-auth-api.zznr zzb = zznr.zza;
  private boolean zzc = false;
  
  private final void zzb()
  {
    Iterator localIterator = zza.iterator();
    while (localIterator.hasNext()) {
      zzbt.zza((zzbt)localIterator.next(), false);
    }
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzbs zza()
  {
    if (!zzc)
    {
      zzc = true;
      com.google.android.gms.internal.firebase-auth-api.zzwl.zzb localzzb = zzwl.zzc();
      ArrayList localArrayList = new ArrayList(zza.size());
      Object localObject1 = zza;
      for (int i = 0; i < ((List)localObject1).size() - 1; i++) {
        if ((zzbt.zzb((zzbt)((List)localObject1).get(i)) == zzbw.zza()) && (zzbt.zzb((zzbt)((List)localObject1).get(i + 1)) != zzbw.zza())) {
          throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
        }
      }
      HashSet localHashSet = new HashSet();
      Iterator localIterator = zza.iterator();
      localObject1 = null;
      while (localIterator.hasNext())
      {
        zzbt localzzbt = (zzbt)localIterator.next();
        if (zzbt.zza(localzzbt) != null)
        {
          if (zzbt.zzb(localzzbt) != null)
          {
            if (zzbt.zzb(localzzbt) == zzbw.zza()) {
              for (i = 0;; i = zzpy.zza()) {
                if (i != 0)
                {
                  j = i;
                  if (!localHashSet.contains(Integer.valueOf(i))) {
                    break;
                  }
                }
              }
            }
            int j = zzbw.zza(zzbt.zzb(localzzbt));
            if (!localHashSet.contains(Integer.valueOf(j)))
            {
              localHashSet.add(Integer.valueOf(j));
              if (zzbt.zzd(localzzbt).zza()) {
                localObject2 = Integer.valueOf(j);
              } else {
                localObject2 = null;
              }
              Object localObject2 = zzoc.zza().zza(zzbt.zzd(localzzbt), (Integer)localObject2);
              zzbv localzzbv = new zzbv((zzbo)localObject2, zzbt.zza(localzzbt), j, zzbt.zze(localzzbt), null);
              localzzb.zza(zzbs.zza((zzbo)localObject2, zzbt.zza(localzzbt), j));
              localObject2 = localObject1;
              if (zzbt.zze(localzzbt)) {
                if (localObject1 == null)
                {
                  localObject2 = Integer.valueOf(j);
                  if (zzbt.zza(localzzbt) != zzbq.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                  }
                }
                else
                {
                  throw new GeneralSecurityException("Two primaries were set");
                }
              }
              localArrayList.add(localzzbv);
              localObject1 = localObject2;
            }
            else
            {
              localObject1 = new StringBuilder("Id ");
              ((StringBuilder)localObject1).append(j);
              ((StringBuilder)localObject1).append(" is used twice in the keyset");
              throw new GeneralSecurityException(((StringBuilder)localObject1).toString());
            }
          }
          else
          {
            throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
          }
        }
        else {
          throw new GeneralSecurityException("Key Status not set.");
        }
      }
      if (localObject1 != null)
      {
        localzzb.zza(((Integer)localObject1).intValue());
        localObject1 = (zzwl)localzzb.zze();
        zzbs.zzb((com.google.android.gms.internal.firebase-auth-api.zzwl)localObject1);
        return new zzbs((com.google.android.gms.internal.firebase-auth-api.zzwl)localObject1, localArrayList, zzb, null);
      }
      throw new GeneralSecurityException("No primary was set");
    }
    throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzbu zza(com.google.android.gms.internal.firebase-auth-api.zzbt paramzzbt)
  {
    if (zzbt.zzc(paramzzbt) == null)
    {
      if (zzbt.zze(paramzzbt)) {
        zzb();
      }
      zzbt.zza(paramzzbt, this);
      zza.add(paramzzbt);
      return this;
    }
    throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */