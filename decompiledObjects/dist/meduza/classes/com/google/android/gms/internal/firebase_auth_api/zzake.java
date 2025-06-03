package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzake
  extends zzaiq<Float>
  implements RandomAccess
{
  private static final float[] zza;
  private float[] zzb;
  private int zzc;
  
  static
  {
    float[] arrayOfFloat = new float[0];
    zza = arrayOfFloat;
    new zzake(arrayOfFloat, 0, false);
  }
  
  public zzake()
  {
    this(zza, 0, true);
  }
  
  private zzake(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfFloat;
    zzc = paramInt;
  }
  
  private static int zzd(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zze(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzc);
  }
  
  private final void zzf(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzc)) {
      return;
    }
    throw new IndexOutOfBoundsException(zze(paramInt));
  }
  
  public final boolean addAll(Collection<? extends Float> paramCollection)
  {
    zza();
    zzaki.zza(paramCollection);
    if (!(paramCollection instanceof zzake)) {
      return super.addAll(paramCollection);
    }
    zzake localzzake = (zzake)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      paramCollection = zzb;
      if (i > paramCollection.length) {
        zzb = Arrays.copyOf(paramCollection, i);
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
    if (!(paramObject instanceof zzake)) {
      return super.equals(paramObject);
    }
    paramObject = (zzake)paramObject;
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
    int i = size();
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
  
  public final void zza(float paramFloat)
  {
    zza();
    int i = zzc;
    float[] arrayOfFloat = zzb;
    if (i == arrayOfFloat.length)
    {
      arrayOfFloat = new float[zzd(arrayOfFloat.length)];
      System.arraycopy(zzb, 0, arrayOfFloat, 0, zzc);
      zzb = arrayOfFloat;
    }
    arrayOfFloat = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfFloat[i] = paramFloat;
  }
  
  public final float zzb(int paramInt)
  {
    zzf(paramInt);
    return zzb[paramInt];
  }
  
  public final void zzc(int paramInt)
  {
    float[] arrayOfFloat = zzb;
    if (paramInt <= arrayOfFloat.length) {
      return;
    }
    if (arrayOfFloat.length == 0)
    {
      zzb = new float[Math.max(paramInt, 10)];
      return;
    }
    for (int i = arrayOfFloat.length; i < paramInt; i = zzd(i)) {}
    zzb = Arrays.copyOf(zzb, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzake
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */