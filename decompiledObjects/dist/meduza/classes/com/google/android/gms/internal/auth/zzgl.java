package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzgl
  extends zzgv
{
  public zzgl(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void zza()
  {
    if (!zzj())
    {
      for (int i = 0; i < zzb(); i++)
      {
        localObject = zzg(i);
        if (((zzep)((Map.Entry)localObject).getKey()).zzc()) {
          ((Map.Entry)localObject).setValue(Collections.unmodifiableList((List)((Map.Entry)localObject).getValue()));
        }
      }
      Object localObject = zzc().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((zzep)localEntry.getKey()).zzc()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.zza();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */