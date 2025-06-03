package com.google.android.recaptcha.internal;

import f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zznx
  extends zzkr
  implements RandomAccess, zznj, zzor
{
  private static final long[] zza;
  private static final zznx zzb;
  private long[] zzc;
  private int zzd;
  
  static
  {
    long[] arrayOfLong = new long[0];
    zza = arrayOfLong;
    zzb = new zznx(arrayOfLong, 0, false);
  }
  
  public zznx()
  {
    this(zza, 0, true);
  }
  
  private zznx(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzc = paramArrayOfLong;
    zzd = paramInt;
  }
  
  public static zznx zzf()
  {
    return zzb;
  }
  
  private static int zzi(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzj(int paramInt)
  {
    return f.i("Index:", paramInt, ", Size:", zzd);
  }
  
  private final void zzk(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzd)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzj(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zza();
    Object localObject = zznl.zza;
    paramCollection.getClass();
    if (!(paramCollection instanceof zznx)) {
      return super.addAll(paramCollection);
    }
    localObject = (zznx)paramCollection;
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
    if (!(paramObject instanceof zznx)) {
      return super.equals(paramObject);
    }
    paramObject = (zznx)paramObject;
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
    for (int j = 0; j < zzd; j++)
    {
      long l = zzc[j];
      Charset localCharset = zznl.zza;
      i = i * 31 + (int)(l ^ l >>> 32);
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Long)) {
      return -1;
    }
    long l = ((Long)paramObject).longValue();
    int i = zzd;
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
  
  public final long zze(int paramInt)
  {
    zzk(paramInt);
    return zzc[paramInt];
  }
  
  public final void zzg(long paramLong)
  {
    zza();
    int i = zzd;
    int j = zzc.length;
    if (i == j)
    {
      arrayOfLong = new long[zzi(j)];
      System.arraycopy(zzc, 0, arrayOfLong, 0, zzd);
      zzc = arrayOfLong;
    }
    long[] arrayOfLong = zzc;
    i = zzd;
    zzd = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public final void zzh(int paramInt)
  {
    int i = zzc.length;
    if (paramInt <= i) {
      return;
    }
    if (i != 0)
    {
      while (i < paramInt) {
        i = zzi(i);
      }
      zzc = Arrays.copyOf(zzc, i);
      return;
    }
    zzc = new long[Math.max(paramInt, 10)];
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */