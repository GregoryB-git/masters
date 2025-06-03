package com.google.android.recaptcha.internal;

import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzne
  extends zzkr
  implements RandomAccess, zzni, zzor
{
  private static final int[] zza;
  private static final zzne zzb;
  private int[] zzc;
  private int zzd;
  
  static
  {
    int[] arrayOfInt = new int[0];
    zza = arrayOfInt;
    zzb = new zzne(arrayOfInt, 0, false);
  }
  
  public zzne()
  {
    this(zza, 0, true);
  }
  
  private zzne(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzc = paramArrayOfInt;
    zzd = paramInt;
  }
  
  public static zzne zzf()
  {
    return zzb;
  }
  
  private static int zzj(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzk(int paramInt)
  {
    return f.i("Index:", paramInt, ", Size:", zzd);
  }
  
  private final void zzl(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzd)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzk(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zza();
    Object localObject = zznl.zza;
    paramCollection.getClass();
    if (!(paramCollection instanceof zzne)) {
      return super.addAll(paramCollection);
    }
    localObject = (zzne)paramCollection;
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
    if (!(paramObject instanceof zzne)) {
      return super.equals(paramObject);
    }
    paramObject = (zzne)paramObject;
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
    int j = zzd;
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
  
  public final int zze(int paramInt)
  {
    zzl(paramInt);
    return zzc[paramInt];
  }
  
  public final zzni zzg(int paramInt)
  {
    if (paramInt >= zzd)
    {
      int[] arrayOfInt;
      if (paramInt == 0) {
        arrayOfInt = zza;
      } else {
        arrayOfInt = Arrays.copyOf(zzc, paramInt);
      }
      return new zzne(arrayOfInt, zzd, true);
    }
    throw new IllegalArgumentException();
  }
  
  public final void zzh(int paramInt)
  {
    zza();
    int i = zzd;
    int j = zzc.length;
    if (i == j)
    {
      arrayOfInt = new int[zzj(j)];
      System.arraycopy(zzc, 0, arrayOfInt, 0, zzd);
      zzc = arrayOfInt;
    }
    int[] arrayOfInt = zzc;
    i = zzd;
    zzd = (i + 1);
    arrayOfInt[i] = paramInt;
  }
  
  public final void zzi(int paramInt)
  {
    int i = zzc.length;
    if (paramInt <= i) {
      return;
    }
    if (i != 0)
    {
      while (i < paramInt) {
        i = zzj(i);
      }
      zzc = Arrays.copyOf(zzc, i);
      return;
    }
    zzc = new int[Math.max(paramInt, 10)];
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzne
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */