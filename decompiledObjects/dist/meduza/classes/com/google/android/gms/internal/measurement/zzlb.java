package com.google.android.gms.internal.measurement;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzlb
  extends zzis<Long>
  implements zzkn, zzly, RandomAccess
{
  private static final long[] zza;
  private static final zzlb zzb;
  private long[] zzc;
  private int zzd;
  
  static
  {
    long[] arrayOfLong = new long[0];
    zza = arrayOfLong;
    zzb = new zzlb(arrayOfLong, 0, false);
  }
  
  public zzlb()
  {
    this(zza, 0, true);
  }
  
  private zzlb(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzc = paramArrayOfLong;
    zzd = paramInt;
  }
  
  public static zzlb zzd()
  {
    return zzb;
  }
  
  private static int zze(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzf(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzd);
  }
  
  private final void zzg(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzd)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzf(paramInt));
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection)
  {
    zza();
    zzkj.zza(paramCollection);
    if (!(paramCollection instanceof zzlb)) {
      return super.addAll(paramCollection);
    }
    zzlb localzzlb = (zzlb)paramCollection;
    int i = zzd;
    if (i == 0) {
      return false;
    }
    int j = zzd;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = zzc;
      if (i > paramCollection.length) {
        zzc = Arrays.copyOf(paramCollection, i);
      }
      System.arraycopy(zzc, 0, zzc, zzd, zzd);
      zzd = i;
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
    if (!(paramObject instanceof zzlb)) {
      return super.equals(paramObject);
    }
    paramObject = (zzlb)paramObject;
    if (zzd != zzd) {
      return false;
    }
    paramObject = zzc;
    for (int i = 0; i < zzd; i++) {
      if (zzc[i] != paramObject[i]) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < zzd; j++) {
      i = i * 31 + zzkj.zza(zzc[j]);
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
      if (zzc[j] == l) {
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
      long[] arrayOfLong = zzc;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, zzd - paramInt2);
      zzd -= paramInt2 - paramInt1;
      modCount += 1;
      return;
    }
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size()
  {
    return zzd;
  }
  
  public final void zza(long paramLong)
  {
    zza();
    int i = zzd;
    long[] arrayOfLong = zzc;
    if (i == arrayOfLong.length)
    {
      arrayOfLong = new long[zze(arrayOfLong.length)];
      System.arraycopy(zzc, 0, arrayOfLong, 0, zzd);
      zzc = arrayOfLong;
    }
    arrayOfLong = zzc;
    i = zzd;
    zzd = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public final long zzb(int paramInt)
  {
    zzg(paramInt);
    return zzc[paramInt];
  }
  
  public final zzkn zzc(int paramInt)
  {
    if (paramInt >= zzd)
    {
      long[] arrayOfLong;
      if (paramInt == 0) {
        arrayOfLong = zza;
      } else {
        arrayOfLong = Arrays.copyOf(zzc, paramInt);
      }
      return new zzlb(arrayOfLong, zzd, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final void zzd(int paramInt)
  {
    long[] arrayOfLong = zzc;
    if (paramInt <= arrayOfLong.length) {
      return;
    }
    if (arrayOfLong.length == 0)
    {
      zzc = new long[Math.max(paramInt, 10)];
      return;
    }
    for (int i = arrayOfLong.length; i < paramInt; i = zze(i)) {}
    zzc = Arrays.copyOf(zzc, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzlb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */