package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzaky
  extends zzaiq<Long>
  implements RandomAccess
{
  private static final long[] zza;
  private long[] zzb;
  private int zzc;
  
  static
  {
    long[] arrayOfLong = new long[0];
    zza = arrayOfLong;
    new zzaky(arrayOfLong, 0, false);
  }
  
  public zzaky()
  {
    this(zza, 0, true);
  }
  
  private zzaky(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfLong;
    zzc = paramInt;
  }
  
  private static int zzd(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zze(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zzf(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zze(paramInt));
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection)
  {
    zza();
    zzaki.zza(paramCollection);
    if (!(paramCollection instanceof zzaky)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzaky)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      j += i;
      long[] arrayOfLong = zzb;
      if (j > arrayOfLong.length) {
        zzb = Arrays.copyOf(arrayOfLong, j);
      }
      System.arraycopy(zzb, 0, zzb, zzc, zzc);
      zzc = j;
      modCount += 1;
      return true;
    }
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject)
  {
    return indexOf(paramObject) != -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzaky)) {
      return super.equals(paramObject);
    }
    paramObject = (zzaky)paramObject;
    if (zzc != zzc) {
      return false;
    }
    paramObject = zzb;
    for (int i = 0; i < zzc; i++) {
      if (zzb[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < zzc; j++) {
      i = i * 31 + zzaki.zza(zzb[j]);
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Long)) {
      return -1;
    }
    long l = ((Long)paramObject).longValue();
    int i = size();
    for (int j = 0; j < i; j++) {
      if (zzb[j] == l) {
        return j;
      }
    }
    return -1;
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    zza();
    if (paramInt2 >= paramInt1)
    {
      long[] arrayOfLong = zzb;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, zzc - paramInt2);
      zzc -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return zzc;
  }
  
  public final void zza(long paramLong)
  {
    zza();
    int i = zzc;
    long[] arrayOfLong = zzb;
    if (i == arrayOfLong.length)
    {
      arrayOfLong = new long[zzd(arrayOfLong.length)];
      System.arraycopy(zzb, 0, arrayOfLong, 0, zzc);
      zzb = arrayOfLong;
    }
    arrayOfLong = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public final long zzb(int paramInt)
  {
    zzf(paramInt);
    return zzb[paramInt];
  }
  
  public final void zzc(int paramInt)
  {
    long[] arrayOfLong = zzb;
    if (paramInt <= arrayOfLong.length) {
      return;
    }
    if (arrayOfLong.length == 0)
    {
      zzb = new long[Math.max(paramInt, 10)];
      return;
    }
    for (int i = arrayOfLong.length; i < paramInt; i = zzd(i)) {}
    zzb = Arrays.copyOf(zzb, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaky
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */