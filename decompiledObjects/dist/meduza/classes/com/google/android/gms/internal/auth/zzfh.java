package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class zzfh
  extends zzfl
{
  private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();
  
  private zzfh()
  {
    super(null);
  }
  
  public final void zza(Object paramObject, long paramLong)
  {
    Object localObject = (List)zzhj.zzf(paramObject, paramLong);
    if ((localObject instanceof zzff))
    {
      localObject = ((zzff)localObject).zze();
    }
    else
    {
      if (zza.isAssignableFrom(localObject.getClass())) {
        return;
      }
      if (((localObject instanceof zzge)) && ((localObject instanceof zzez)))
      {
        paramObject = (zzez)localObject;
        if (((zzez)paramObject).zzc()) {
          ((zzez)paramObject).zzb();
        }
        return;
      }
      localObject = Collections.unmodifiableList((List)localObject);
    }
    zzhj.zzp(paramObject, paramLong, localObject);
  }
  
  public final void zzb(Object paramObject1, Object paramObject2, long paramLong)
  {
    List localList = (List)zzhj.zzf(paramObject2, paramLong);
    int i = localList.size();
    Object localObject = (List)zzhj.zzf(paramObject1, paramLong);
    if (((List)localObject).isEmpty()) {
      if ((localObject instanceof zzff)) {
        paramObject2 = new zzfe(i);
      } else if (((localObject instanceof zzge)) && ((localObject instanceof zzez))) {
        paramObject2 = ((zzez)localObject).zzd(i);
      }
    }
    zzez localzzez;
    for (paramObject2 = new ArrayList(i);; paramObject2 = localzzez.zzd(((List)localObject).size() + i))
    {
      zzhj.zzp(paramObject1, paramLong, paramObject2);
      break;
      if (zza.isAssignableFrom(localObject.getClass()))
      {
        paramObject2 = new ArrayList(((List)localObject).size() + i);
        ((ArrayList)paramObject2).addAll((Collection)localObject);
      }
      for (;;)
      {
        zzhj.zzp(paramObject1, paramLong, paramObject2);
        break label269;
        if (!(localObject instanceof zzhe)) {
          break;
        }
        paramObject2 = new zzfe(((List)localObject).size() + i);
        localObject = (zzhe)localObject;
        ((zzfe)paramObject2).addAll(((zzfe)paramObject2).size(), (Collection)localObject);
      }
      paramObject2 = localObject;
      if (!(localObject instanceof zzge)) {
        break;
      }
      paramObject2 = localObject;
      if (!(localObject instanceof zzez)) {
        break;
      }
      localzzez = (zzez)localObject;
      paramObject2 = localObject;
      if (localzzez.zzc()) {
        break;
      }
    }
    label269:
    int j = ((List)paramObject2).size();
    i = localList.size();
    if ((j > 0) && (i > 0)) {
      ((List)paramObject2).addAll(localList);
    }
    if (j <= 0) {
      paramObject2 = localList;
    }
    zzhj.zzp(paramObject1, paramLong, paramObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */