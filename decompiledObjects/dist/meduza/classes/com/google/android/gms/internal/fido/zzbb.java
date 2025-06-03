package com.google.android.gms.internal.fido;

import java.util.Map;
import java.util.Map.Entry;

abstract class zzbb
  extends zzbc
{
  public final boolean contains(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      Map.Entry localEntry = (Map.Entry)paramObject;
      paramObject = zzf().get(localEntry.getKey());
      if ((paramObject != null) && (paramObject.equals(localEntry.getValue()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return zzbx.zza(zzf().zzc());
  }
  
  public final int size()
  {
    return zzf().size();
  }
  
  public abstract zzba zzf();
  
  public final boolean zzg()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */