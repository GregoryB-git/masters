package com.google.android.recaptcha.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class zzpc
  extends AbstractSet
{
  public final void clear()
  {
    zza.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    paramObject = ((Map.Entry)localObject).getKey();
    paramObject = zza.get(paramObject);
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool = false;
    if (paramObject != localObject)
    {
      if (paramObject == null) {
        return bool;
      }
      if (!paramObject.equals(localObject)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public final Iterator iterator()
  {
    return new zzpb(zza, null);
  }
  
  public final boolean remove(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    if (contains(paramObject))
    {
      zza.remove(((Map.Entry)paramObject).getKey());
      return true;
    }
    return false;
  }
  
  public final int size()
  {
    return zza.size();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */