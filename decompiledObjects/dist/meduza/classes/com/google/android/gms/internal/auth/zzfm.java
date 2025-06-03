package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzfm
  extends zzdr
  implements RandomAccess, zzge
{
  private static final zzfm zza = new zzfm(new long[0], 0, false);
  private long[] zzb;
  private int zzc;
  
  public zzfm()
  {
    this(new long[10], 0, true);
  }
  
  private zzfm(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfLong;
    zzc = paramInt;
  }
  
  private final String zzf(int paramInt)
  {
    return f.i("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zzg(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzf(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zza();
    Object localObject = zzfa.zza;
    paramCollection.getClass();
    if (!(paramCollection instanceof zzfm)) {
      return super.addAll(paramCollection);
    }
    localObject = (zzfm)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      j += i;
      paramCollection = zzb;
      if (j > paramCollection.length) {
        zzb = Arrays.copyOf(paramCollection, j);
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
    if (!(paramObject instanceof zzfm)) {
      return super.equals(paramObject);
    }
    paramObject = (zzfm)paramObject;
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
    for (int j = 0; j < zzc; j++)
    {
      long l = zzb[j];
      Charset localCharset = zzfa.zza;
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
    int i = zzc;
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
  
  public final void zze(long paramLong)
  {
    zza();
    int i = zzc;
    long[] arrayOfLong1 = zzb;
    if (i == arrayOfLong1.length)
    {
      long[] arrayOfLong2 = new long[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfLong1, 0, arrayOfLong2, 0, i);
      zzb = arrayOfLong2;
    }
    arrayOfLong1 = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfLong1[i] = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */