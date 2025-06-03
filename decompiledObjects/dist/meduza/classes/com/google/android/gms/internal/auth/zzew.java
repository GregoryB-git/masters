package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzew
  extends zzdr
  implements RandomAccess, zzge
{
  private static final zzew zza = new zzew(new int[0], 0, false);
  private int[] zzb;
  private int zzc;
  
  public zzew()
  {
    this(new int[10], 0, true);
  }
  
  private zzew(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfInt;
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
    if (!(paramCollection instanceof zzew)) {
      return super.addAll(paramCollection);
    }
    localObject = (zzew)paramCollection;
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
    if (!(paramObject instanceof zzew)) {
      return super.equals(paramObject);
    }
    paramObject = (zzew)paramObject;
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
  
  public final void zze(int paramInt)
  {
    zza();
    int i = zzc;
    int[] arrayOfInt1 = zzb;
    if (i == arrayOfInt1.length)
    {
      arrayOfInt2 = new int[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i);
      zzb = arrayOfInt2;
    }
    int[] arrayOfInt2 = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfInt2[i] = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */