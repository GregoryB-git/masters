package com.google.android.gms.internal.measurement;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkh
  extends zzis<Integer>
  implements zzkk, zzly, RandomAccess
{
  private static final int[] zza;
  private static final zzkh zzb;
  private int[] zzc;
  private int zzd;
  
  static
  {
    int[] arrayOfInt = new int[0];
    zza = arrayOfInt;
    zzb = new zzkh(arrayOfInt, 0, false);
  }
  
  public zzkh()
  {
    this(zza, 0, true);
  }
  
  private zzkh(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzc = paramArrayOfInt;
    zzd = paramInt;
  }
  
  public static zzkh zzd()
  {
    return zzb;
  }
  
  private static int zzf(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzg(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzd);
  }
  
  private final void zzh(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzd)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzg(paramInt));
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection)
  {
    zza();
    zzkj.zza(paramCollection);
    if (!(paramCollection instanceof zzkh)) {
      return super.addAll(paramCollection);
    }
    zzkh localzzkh = (zzkh)paramCollection;
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
    if (!(paramObject instanceof zzkh)) {
      return super.equals(paramObject);
    }
    paramObject = (zzkh)paramObject;
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
      i = i * 31 + zzc[j];
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Integer)) {
      return -1;
    }
    int i = ((Integer)paramObject).intValue();
    int j = size();
    for (int k = 0; k < j; k++) {
      if (zzc[k] == i) {
        return k;
      }
    }
    return -1;
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    zza();
    if (paramInt2 >= paramInt1)
    {
      int[] arrayOfInt = zzc;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, zzd - paramInt2);
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
  
  public final int zzb(int paramInt)
  {
    zzh(paramInt);
    return zzc[paramInt];
  }
  
  public final zzkk zzc(int paramInt)
  {
    if (paramInt >= zzd)
    {
      int[] arrayOfInt;
      if (paramInt == 0) {
        arrayOfInt = zza;
      } else {
        arrayOfInt = Arrays.copyOf(zzc, paramInt);
      }
      return new zzkh(arrayOfInt, zzd, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final void zzd(int paramInt)
  {
    zza();
    int i = zzd;
    int[] arrayOfInt = zzc;
    if (i == arrayOfInt.length)
    {
      arrayOfInt = new int[zzf(arrayOfInt.length)];
      System.arraycopy(zzc, 0, arrayOfInt, 0, zzd);
      zzc = arrayOfInt;
    }
    arrayOfInt = zzc;
    i = zzd;
    zzd = (i + 1);
    arrayOfInt[i] = paramInt;
  }
  
  public final void zze(int paramInt)
  {
    int[] arrayOfInt = zzc;
    if (paramInt <= arrayOfInt.length) {
      return;
    }
    if (arrayOfInt.length == 0)
    {
      zzc = new int[Math.max(paramInt, 10)];
      return;
    }
    for (int i = arrayOfInt.length; i < paramInt; i = zzf(i)) {}
    zzc = Arrays.copyOf(zzc, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */