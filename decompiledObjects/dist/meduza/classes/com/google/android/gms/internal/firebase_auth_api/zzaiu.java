package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzaiu
  extends zzaiq<Boolean>
  implements RandomAccess
{
  private static final boolean[] zza;
  private boolean[] zzb;
  private int zzc;
  
  static
  {
    boolean[] arrayOfBoolean = new boolean[0];
    zza = arrayOfBoolean;
    new zzaiu(arrayOfBoolean, 0, false);
  }
  
  public zzaiu()
  {
    this(zza, 0, true);
  }
  
  private zzaiu(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfBoolean;
    zzc = paramInt;
  }
  
  private static int zzc(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzd(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zze(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzd(paramInt));
  }
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection)
  {
    zza();
    zzaki.zza(paramCollection);
    if (!(paramCollection instanceof zzaiu)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzaiu)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      boolean[] arrayOfBoolean = zzb;
      if (i > arrayOfBoolean.length) {
        zzb = Arrays.copyOf(arrayOfBoolean, i);
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
    if (!(paramObject instanceof zzaiu)) {
      return super.equals(paramObject);
    }
    paramObject = (zzaiu)paramObject;
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
    if (!(paramObject instanceof Boolean)) {
      return -1;
    }
    int i = ((Boolean)paramObject).booleanValue();
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
  
  public final void zza(boolean paramBoolean)
  {
    zza();
    int i = zzc;
    boolean[] arrayOfBoolean = zzb;
    if (i == arrayOfBoolean.length)
    {
      arrayOfBoolean = new boolean[zzc(arrayOfBoolean.length)];
      System.arraycopy(zzb, 0, arrayOfBoolean, 0, zzc);
      zzb = arrayOfBoolean;
    }
    arrayOfBoolean = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfBoolean[i] = paramBoolean;
  }
  
  public final boolean zzb(int paramInt)
  {
    zze(paramInt);
    return zzb[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaiu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */