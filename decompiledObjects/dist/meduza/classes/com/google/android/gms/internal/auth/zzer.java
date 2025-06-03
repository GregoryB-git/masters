package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzer
  extends zzdr
  implements RandomAccess, zzge
{
  private static final zzer zza = new zzer(new float[0], 0, false);
  private float[] zzb;
  private int zzc;
  
  public zzer()
  {
    this(new float[10], 0, true);
  }
  
  private zzer(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfFloat;
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
    if (!(paramCollection instanceof zzer)) {
      return super.addAll(paramCollection);
    }
    localObject = (zzer)paramCollection;
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
    if (!(paramObject instanceof zzer)) {
      return super.equals(paramObject);
    }
    paramObject = (zzer)paramObject;
    if (zzc != zzc) {
      return false;
    }
    paramObject = zzb;
    for (int i = 0; i < zzc; i++) {
      if (Float.floatToIntBits(zzb[i]) != Float.floatToIntBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < zzc; j++) {
      i = i * 31 + Float.floatToIntBits(zzb[j]);
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Float)) {
      return -1;
    }
    float f = ((Float)paramObject).floatValue();
    int i = zzc;
    for (int j = 0; j < i; j++) {
      if (zzb[j] == f) {
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
      float[] arrayOfFloat = zzb;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, zzc - paramInt2);
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
  
  public final void zze(float paramFloat)
  {
    zza();
    int i = zzc;
    float[] arrayOfFloat1 = zzb;
    if (i == arrayOfFloat1.length)
    {
      arrayOfFloat2 = new float[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfFloat1, 0, arrayOfFloat2, 0, i);
      zzb = arrayOfFloat2;
    }
    float[] arrayOfFloat2 = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfFloat2[i] = paramFloat;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */