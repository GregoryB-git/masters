package com.google.android.gms.internal.auth;

import g;
import java.io.Serializable;
import java.util.Arrays;

final class zzdn
  implements Serializable, zzdj
{
  public final Object zza;
  
  public zzdn(Object paramObject)
  {
    zza = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzdn))
    {
      Object localObject = (zzdn)paramObject;
      paramObject = zza;
      localObject = zza;
      return (paramObject == localObject) || (paramObject.equals(localObject));
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { zza });
  }
  
  public final String toString()
  {
    return g.e("Suppliers.ofInstance(", zza.toString(), ")");
  }
  
  public final Object zza()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */