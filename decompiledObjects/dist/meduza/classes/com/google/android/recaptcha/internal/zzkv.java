package com.google.android.recaptcha.internal;

import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzkv
  extends zzkr
  implements RandomAccess, zzor
{
  private static final boolean[] zza;
  private boolean[] zzb;
  private int zzc;
  
  static
  {
    boolean[] arrayOfBoolean = new boolean[0];
    zza = arrayOfBoolean;
    new zzkv(arrayOfBoolean, 0, false);
  }
  
  public zzkv()
  {
    this(zza, 0, true);
  }
  
  private zzkv(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfBoolean;
    zzc = paramInt;
  }
  
  private static int zzg(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzh(int paramInt)
  {
    return f.i("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zzi(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzh(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zza();
    Object localObject = zznl.zza;
    paramCollection.getClass();
    if (!(paramCollection instanceof zzkv)) {
      return super.addAll(paramCollection);
    }
    localObject = (zzkv)paramCollection;
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
    if (!(paramObject instanceof zzkv)) {
      return super.equals(paramObject);
    }
    paramObject = (zzkv)paramObject;
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
      i = i * 31 + zznl.zza(zzb[j]);
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Boolean)) {
      return -1;
    }
    int i = ((Boolean)paramObject).booleanValue();
    int j = zzc;
    for (int k = 0; k < j; k++) {
      if (zzb[k] == i) {
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
      boolean[] arrayOfBoolean = zzb;
      System.arraycopy(arrayOfBoolean, paramInt2, arrayOfBoolean, paramInt1, zzc - paramInt2);
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
  
  public final void zze(boolean paramBoolean)
  {
    zza();
    int i = zzc;
    int j = zzb.length;
    if (i == j)
    {
      arrayOfBoolean = new boolean[zzg(j)];
      System.arraycopy(zzb, 0, arrayOfBoolean, 0, zzc);
      zzb = arrayOfBoolean;
    }
    boolean[] arrayOfBoolean = zzb;
    j = zzc;
    zzc = (j + 1);
    arrayOfBoolean[j] = paramBoolean;
  }
  
  public final boolean zzf(int paramInt)
  {
    zzi(paramInt);
    return zzb[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */