package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.annotations.NullMarked;

@NullMarked
abstract class zzad
  extends zzao
{
  private final int zza;
  private int zzb;
  
  public zzad(int paramInt1, int paramInt2)
  {
    zzv.zzb(paramInt2, paramInt1, "index");
    zza = paramInt1;
    zzb = paramInt2;
  }
  
  public final boolean hasNext()
  {
    return zzb < zza;
  }
  
  public final boolean hasPrevious()
  {
    return zzb > 0;
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      int i = zzb;
      zzb = (i + 1);
      return zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return zzb;
  }
  
  public final Object previous()
  {
    if (hasPrevious())
    {
      int i = zzb - 1;
      zzb = i;
      return zza(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return zzb - 1;
  }
  
  public abstract Object zza(int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */