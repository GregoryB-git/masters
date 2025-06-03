package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzdv
  extends zzdr
  implements RandomAccess, zzge
{
  private static final zzdv zza = new zzdv(new boolean[0], 0, false);
  private boolean[] zzb;
  private int zzc;
  
  public zzdv()
  {
    this(new boolean[10], 0, true);
  }
  
  private zzdv(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfBoolean;
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
    if (!(paramCollection instanceof zzdv)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzdv)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      localObject = zzb;
      if (i > localObject.length) {
        zzb = Arrays.copyOf((boolean[])localObject, i);
      }
      System.arraycopy(zzb, 0, zzb, zzc, zzc);
      zzc = i;
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
    if (!(paramObject instanceof zzdv)) {
      return super.equals(paramObject);
    }
    paramObject = (zzdv)paramObject;
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
      i = i * 31 + zzfa.zza(zzb[j]);
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
    boolean[] arrayOfBoolean1 = zzb;
    if (i == arrayOfBoolean1.length)
    {
      arrayOfBoolean2 = new boolean[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfBoolean1, 0, arrayOfBoolean2, 0, i);
      zzb = arrayOfBoolean2;
    }
    boolean[] arrayOfBoolean2 = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfBoolean2[i] = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */