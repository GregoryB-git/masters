package com.google.android.gms.internal.auth;

import java.util.List;
import java.util.ListIterator;

final class zzhc
  implements ListIterator
{
  public final ListIterator zza;
  
  public zzhc(zzhe paramzzhe, int paramInt)
  {
    zza = zzhe.zza(paramzzhe).listIterator(paramInt);
  }
  
  public final boolean hasNext()
  {
    return zza.hasNext();
  }
  
  public final boolean hasPrevious()
  {
    return zza.hasPrevious();
  }
  
  public final int nextIndex()
  {
    return zza.nextIndex();
  }
  
  public final int previousIndex()
  {
    return zza.previousIndex();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */