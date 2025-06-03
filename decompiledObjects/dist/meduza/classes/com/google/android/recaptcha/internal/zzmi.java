package com.google.android.recaptcha.internal;

import f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzmi
  extends zzkr
  implements RandomAccess, zzor
{
  private static final double[] zza;
  private double[] zzb;
  private int zzc;
  
  static
  {
    double[] arrayOfDouble = new double[0];
    zza = arrayOfDouble;
    new zzmi(arrayOfDouble, 0, false);
  }
  
  public zzmi()
  {
    this(zza, 0, true);
  }
  
  private zzmi(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfDouble;
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
    if (!(paramCollection instanceof zzmi)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzmi)paramCollection;
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
        zzb = Arrays.copyOf((double[])localObject, i);
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
    if (!(paramObject instanceof zzmi)) {
      return super.equals(paramObject);
    }
    paramObject = (zzmi)paramObject;
    if (zzc != zzc) {
      return false;
    }
    paramObject = zzb;
    for (int i = 0; i < zzc; i++) {
      if (Double.doubleToLongBits(zzb[i]) != Double.doubleToLongBits(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i = 1;
    for (int j = 0; j < zzc; j++)
    {
      long l = Double.doubleToLongBits(zzb[j]);
      Charset localCharset = zznl.zza;
      i = i * 31 + (int)(l ^ l >>> 32);
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Double)) {
      return -1;
    }
    double d = ((Double)paramObject).doubleValue();
    int i = zzc;
    for (int j = 0; j < i; j++) {
      if (zzb[j] == d) {
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
      double[] arrayOfDouble = zzb;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, zzc - paramInt2);
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
  
  public final double zze(int paramInt)
  {
    zzj(paramInt);
    return zzb[paramInt];
  }
  
  public final void zzf(double paramDouble)
  {
    zza();
    int i = zzc;
    int j = zzb.length;
    if (i == j)
    {
      arrayOfDouble = new double[zzh(j)];
      System.arraycopy(zzb, 0, arrayOfDouble, 0, zzc);
      zzb = arrayOfDouble;
    }
    double[] arrayOfDouble = zzb;
    j = zzc;
    zzc = (j + 1);
    arrayOfDouble[j] = paramDouble;
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
    zzb = new double[Math.max(paramInt, 10)];
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */