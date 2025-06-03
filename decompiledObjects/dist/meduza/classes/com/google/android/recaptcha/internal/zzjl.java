package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

public abstract class zzjl
  extends zzjm
  implements Collection
{
  public boolean add(Object paramObject)
  {
    return zzc().add(paramObject);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    return zzc().addAll(paramCollection);
  }
  
  public final void clear()
  {
    zzc().clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return zzc().contains(paramObject);
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    return zzc().containsAll(paramCollection);
  }
  
  public final boolean isEmpty()
  {
    return zzc().isEmpty();
  }
  
  public final Iterator iterator()
  {
    return zzc().iterator();
  }
  
  public final boolean remove(Object paramObject)
  {
    return zzc().remove(paramObject);
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    return zzc().removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    return zzc().retainAll(paramCollection);
  }
  
  public final int size()
  {
    return zzc().size();
  }
  
  public final Object[] toArray()
  {
    return zzc().toArray();
  }
  
  public final Object[] toArray(Object[] paramArrayOfObject)
  {
    return zzc().toArray(paramArrayOfObject);
  }
  
  public abstract Collection zzc();
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */