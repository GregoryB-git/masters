package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzakj
  extends zzaiq<Integer>
  implements RandomAccess
{
  private static final int[] zza;
  private int[] zzb;
  private int zzc;
  
  static
  {
    int[] arrayOfInt = new int[0];
    zza = arrayOfInt;
    new zzakj(arrayOfInt, 0, false);
  }
  
  public zzakj()
  {
    this(zza, 0, true);
  }
  
  private zzakj(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfInt;
    zzc = paramInt;
  }
  
  private static int zze(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzf(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zzg(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzf(paramInt));
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection)
  {
    zza();
    zzaki.zza(paramCollection);
    if (!(paramCollection instanceof zzakj)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzakj)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      j += i;
      int[] arrayOfInt = zzb;
      if (j > arrayOfInt.length) {
        zzb = Arrays.copyOf(arrayOfInt, j);
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
    if (!(paramObject instanceof zzakj)) {
      return super.equals(paramObject);
    }
    paramObject = (zzakj)paramObject;
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
      i = i * 31 + zzb[j];
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
      int[] arrayOfInt = zzb;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, zzc - paramInt2);
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
  
  public final int zzb(int paramInt)
  {
    zzg(paramInt);
    return zzb[paramInt];
  }
  
  public final void zzc(int paramInt)
  {
    zza();
    int i = zzc;
    int[] arrayOfInt = zzb;
    if (i == arrayOfInt.length)
    {
      arrayOfInt = new int[zze(arrayOfInt.length)];
      System.arraycopy(zzb, 0, arrayOfInt, 0, zzc);
      zzb = arrayOfInt;
    }
    arrayOfInt = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfInt[i] = paramInt;
  }
  
  public final void zzd(int paramInt)
  {
    int[] arrayOfInt = zzb;
    if (paramInt <= arrayOfInt.length) {
      return;
    }
    if (arrayOfInt.length == 0)
    {
      zzb = new int[Math.max(paramInt, 10)];
      return;
    }
    for (int i = arrayOfInt.length; i < paramInt; i = zze(i)) {}
    zzb = Arrays.copyOf(zzb, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */