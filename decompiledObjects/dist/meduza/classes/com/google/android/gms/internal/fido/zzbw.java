package com.google.android.gms.internal.fido;

import java.io.Serializable;

final class zzbw
  extends zzbr
  implements Serializable
{
  public final zzbr zza;
  
  public zzbw(zzbr paramzzbr)
  {
    zza = paramzzbr;
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    return zza.compare(paramObject2, paramObject1);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzbw))
    {
      paramObject = (zzbw)paramObject;
      return zza.equals(zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return -zza.hashCode();
  }
  
  public final String toString()
  {
    return zza.toString().concat(".reverse()");
  }
  
  public final zzbr zza()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */