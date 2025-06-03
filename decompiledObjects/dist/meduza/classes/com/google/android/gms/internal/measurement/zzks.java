package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzks<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> zza;
  
  public zzks(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    zza = paramIterator;
  }
  
  public final boolean hasNext()
  {
    return zza.hasNext();
  }
  
  public final void remove()
  {
    zza.remove();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */