package com.google.android.gms.internal.common;

import java.util.Objects;
import org.jspecify.annotations.NullMarked;

@NullMarked
final class zzam
  extends zzak
{
  public static final zzak zza = new zzam(new Object[0], 0);
  public final transient Object[] zzb;
  private final transient int zzc;
  
  public zzam(Object[] paramArrayOfObject, int paramInt)
  {
    zzb = paramArrayOfObject;
    zzc = paramInt;
  }
  
  public final Object get(int paramInt)
  {
    zzv.zza(paramInt, zzc, "index");
    Object localObject = zzb[paramInt];
    Objects.requireNonNull(localObject);
    return localObject;
  }
  
  public final int size()
  {
    return zzc;
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(zzb, 0, paramArrayOfObject, 0, zzc);
    return zzc;
  }
  
  public final int zzb()
  {
    return zzc;
  }
  
  public final int zzc()
  {
    return 0;
  }
  
  public final boolean zzf()
  {
    return false;
  }
  
  public final Object[] zzg()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzam
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */