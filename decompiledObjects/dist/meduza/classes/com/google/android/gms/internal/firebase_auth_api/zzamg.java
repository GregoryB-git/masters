package com.google.android.gms.internal.firebase_auth_api;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzamg
  extends zzamh
{
  public zzamg()
  {
    super(null);
  }
  
  public final void zza()
  {
    if (!zze())
    {
      for (int i = 0; i < zzb(); i++)
      {
        localObject = zza(i);
        if (((zzaka)((Map.Entry)localObject).getKey()).zze()) {
          ((Map.Entry)localObject).setValue(Collections.unmodifiableList((List)((Map.Entry)localObject).getValue()));
        }
      }
      Object localObject = zzc().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((zzaka)localEntry.getKey()).zze()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.zza();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */