package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class zzmp
  extends AbstractSet
{
  private zzmp(zzmj paramzzmj) {}
  
  public void clear()
  {
    zza.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    paramObject = zza.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    return (paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject)));
  }
  
  public Iterator iterator()
  {
    return new zzmm(zza, null);
  }
  
  public boolean remove(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    if (contains(paramObject))
    {
      zza.remove(((Map.Entry)paramObject).getKey());
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return zza.size();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */