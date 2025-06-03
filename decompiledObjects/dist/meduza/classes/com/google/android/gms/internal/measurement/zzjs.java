package com.google.android.gms.internal.measurement;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzjs
  extends zzis<Double>
  implements zzly, RandomAccess
{
  private static final double[] zza;
  private double[] zzb;
  private int zzc;
  
  static
  {
    double[] arrayOfDouble = new double[0];
    zza = arrayOfDouble;
    new zzjs(arrayOfDouble, 0, false);
  }
  
  public zzjs()
  {
    this(zza, 0, true);
  }
  
  private zzjs(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfDouble;
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
  
  public final boolean addAll(Collection<? extends Double> paramCollection)
  {
    zza();
    zzkj.zza(paramCollection);
    if (!(paramCollection instanceof zzjs)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzjs)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      i = j + i;
      double[] arrayOfDouble = zzb;
      if (i > arrayOfDouble.length) {
        zzb = Arrays.copyOf(arrayOfDouble, i);
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
    if (!(paramObject instanceof zzjs)) {
      return super.equals(paramObject);
    }
    paramObject = (zzjs)paramObject;
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
    for (int j = 0; j < zzc; j++) {
      i = i * 31 + zzkj.zza(Double.doubleToLongBits(zzb[j]));
    }
    return i;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Double)) {
      return -1;
    }
    double d = ((Double)paramObject).doubleValue();
    int i = size();
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
  
  public final void zza(double paramDouble)
  {
    zza();
    int i = zzc;
    double[] arrayOfDouble = zzb;
    if (i == arrayOfDouble.length)
    {
      arrayOfDouble = new double[zzd(arrayOfDouble.length)];
      System.arraycopy(zzb, 0, arrayOfDouble, 0, zzc);
      zzb = arrayOfDouble;
    }
    arrayOfDouble = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfDouble[i] = paramDouble;
  }
  
  public final double zzb(int paramInt)
  {
    zzf(paramInt);
    return zzb[paramInt];
  }
  
  public final void zzc(int paramInt)
  {
    double[] arrayOfDouble = zzb;
    if (paramInt <= arrayOfDouble.length) {
      return;
    }
    if (arrayOfDouble.length == 0)
    {
      zzb = new double[Math.max(paramInt, 10)];
      return;
    }
    for (int i = arrayOfDouble.length; i < paramInt; i = zzd(i)) {}
    zzb = Arrays.copyOf(zzb, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */