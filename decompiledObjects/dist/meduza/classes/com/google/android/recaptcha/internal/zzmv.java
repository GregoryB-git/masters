package com.google.android.recaptcha.internal;

import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzmv
  extends zzkr
  implements RandomAccess, zzor
{
  private static final float[] zza;
  private float[] zzb;
  private int zzc;
  
  static
  {
    float[] arrayOfFloat = new float[0];
    zza = arrayOfFloat;
    new zzmv(arrayOfFloat, 0, false);
  }
  
  public zzmv()
  {
    this(zza, 0, true);
  }
  
  private zzmv(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfFloat;
    zzc = paramInt;
  }
  
  private static int zzh(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzi(int paramInt)
  {
    return f.i("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zzj(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzi(paramInt));
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    zza();
    Object localObject = zznl.zza;
    paramCollection.getClass();
    if (!(paramCollection instanceof zzmv)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzmv)paramCollection;
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
        zzb = Arrays.copyOf((float[])localObject, i);
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
    if (!(paramObject instanceof zzmv)) {
      return super.equals(paramObject);
    }
    paramObject = (zzmv)paramObject;
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
  
  public final float zze(int paramInt)
  {
    zzj(paramInt);
    return zzb[paramInt];
  }
  
  public final void zzf(float paramFloat)
  {
    zza();
    int i = zzc;
    int j = zzb.length;
    if (i == j)
    {
      arrayOfFloat = new float[zzh(j)];
      System.arraycopy(zzb, 0, arrayOfFloat, 0, zzc);
      zzb = arrayOfFloat;
    }
    float[] arrayOfFloat = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfFloat[i] = paramFloat;
  }
  
  public final void zzg(int paramInt)
  {
    int i = zzb.length;
    if (paramInt <= i) {
      return;
    }
    if (i != 0)
    {
      while (i < paramInt) {
        i = zzh(i);
      }
      zzb = Arrays.copyOf(zzb, i);
      return;
    }
    zzb = new float[Math.max(paramInt, 10)];
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */