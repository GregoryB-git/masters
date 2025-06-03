package com.google.android.recaptcha.internal;

import dc.a;
import ec.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import sb.y;

final class zzat
  extends j
  implements a
{
  public static final zzat zza = new zzat();
  
  public zzat()
  {
    super(0);
  }
  
  public static final Map zza()
  {
    Object localObject = zzav.zzc();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(y.H0(((Map)localObject).size()));
    Iterator localIterator = ((Map)localObject).entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      localLinkedHashMap.put(((Map.Entry)localObject).getKey(), ((zzaw)((Map.Entry)localObject).getValue()).zzb());
    }
    return localLinkedHashMap;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */