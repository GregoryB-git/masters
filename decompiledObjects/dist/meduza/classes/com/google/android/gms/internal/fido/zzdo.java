package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class zzdo
  extends zzdr
{
  private final int zza;
  private final zzbg zzb;
  
  public zzdo(zzbg paramzzbg)
  {
    paramzzbg.getClass();
    zzb = paramzzbg;
    paramzzbg = paramzzbg.zzc().zzd();
    int i = 0;
    while (paramzzbg.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramzzbg.next();
      int j = ((zzdr)localEntry.getKey()).zzb();
      int k = i;
      if (i < j) {
        k = j;
      }
      j = ((zzdr)localEntry.getValue()).zzb();
      i = k;
      if (k < j) {
        i = j;
      }
    }
    i++;
    zza = i;
    if (i <= 4) {
      return;
    }
    throw new zzdh("Exceeded cutoff limit for max depth of cbor value");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (zzdo.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (zzdo)paramObject;
    return zzb.equals(zzb);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(zzdr.zzd(-96)), zzb });
  }
  
  public final String toString()
  {
    if (zzb.isEmpty()) {
      return "{}";
    }
    Object localObject1 = new LinkedHashMap();
    Object localObject2 = zzb.zzc().zzd();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Map)localObject1).put(((zzdr)((Map.Entry)localObject3).getKey()).toString().replace("\n", "\n  "), ((zzdr)((Map.Entry)localObject3).getValue()).toString().replace("\n", "\n  "));
    }
    Object localObject3 = zzag.zza(",\n  ");
    localObject2 = new StringBuilder("{\n  ");
    localObject1 = ((LinkedHashMap)localObject1).entrySet().iterator();
    try
    {
      zzaf.zza((Appendable)localObject2, (Iterator)localObject1, (zzag)localObject3, " : ");
      ((StringBuilder)localObject2).append("\n}");
      return ((StringBuilder)localObject2).toString();
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
  
  public final int zza()
  {
    return zzdr.zzd();
  }
  
  public final int zzb()
  {
    return zza;
  }
  
  public final zzbg zzc()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */