package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class zzhe
  extends AbstractList
  implements RandomAccess, zzff
{
  private final zzff zza;
  
  public zzhe(zzff paramzzff)
  {
    zza = paramzzff;
  }
  
  public final Iterator iterator()
  {
    return new zzhd(this);
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    return new zzhc(this, paramInt);
  }
  
  public final int size()
  {
    return zza.size();
  }
  
  public final zzff zze()
  {
    return this;
  }
  
  public final List zzg()
  {
    return zza.zzg();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */