package com.google.android.gms.internal.fido;

import java.util.Arrays;

public final class zzam
{
  private final String zza;
  private final zzak zzb;
  private zzak zzc;
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append(zza);
    localStringBuilder.append('{');
    zzak localzzak = zzb.zzc;
    for (String str = ""; localzzak != null; str = ", ")
    {
      Object localObject = zzb;
      localStringBuilder.append(str);
      str = zza;
      if (str != null)
      {
        localStringBuilder.append(str);
        localStringBuilder.append('=');
      }
      if ((localObject != null) && (localObject.getClass().isArray()))
      {
        str = Arrays.deepToString(new Object[] { localObject });
        localStringBuilder.append(str, 1, str.length() - 1);
      }
      else
      {
        localStringBuilder.append(localObject);
      }
      localzzak = zzc;
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public final zzam zza(String paramString, int paramInt)
  {
    paramString = new zzai(null);
    zzc.zzc = paramString;
    zzc = paramString;
    zzb = String.valueOf(paramInt);
    zza = "errorCode";
    return this;
  }
  
  public final zzam zzb(String paramString, Object paramObject)
  {
    zzak localzzak = new zzak(null);
    zzc.zzc = localzzak;
    zzc = localzzak;
    zzb = paramObject;
    zza = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzam
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */