package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class zzdi
  extends zzdr
{
  private final zzaz zza;
  private final int zzb;
  
  public zzdi(zzaz paramzzaz)
  {
    paramzzaz.getClass();
    zza = paramzzaz;
    int i = 0;
    int m;
    for (int j = 0;; j = m)
    {
      paramzzaz = zza;
      if (i >= paramzzaz.size()) {
        break;
      }
      int k = ((zzdr)paramzzaz.get(i)).zzb();
      m = j;
      if (j < k) {
        m = k;
      }
      i++;
    }
    i = j + 1;
    zzb = i;
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
    if (zzdi.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (zzdi)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(zzdr.zzd(Byte.MIN_VALUE)), zza });
  }
  
  public final String toString()
  {
    if (zza.isEmpty()) {
      return "[]";
    }
    Object localObject1 = new ArrayList();
    Object localObject2 = zza;
    int i = ((List)localObject2).size();
    for (int j = 0; j < i; j++) {
      ((ArrayList)localObject1).add(((zzdr)((List)localObject2).get(j)).toString().replace("\n", "\n  "));
    }
    localObject2 = zzag.zza(",\n  ");
    StringBuilder localStringBuilder = new StringBuilder("[\n  ");
    localObject1 = ((ArrayList)localObject1).iterator();
    try
    {
      ((zzag)localObject2).zzb(localStringBuilder, (Iterator)localObject1);
      localStringBuilder.append("\n]");
      return localStringBuilder.toString();
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
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */