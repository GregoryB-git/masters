package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzek
  extends zzdr
  implements RandomAccess, zzge
{
  private static final zzek zza = new zzek(new double[0], 0, false);
  private double[] zzb;
  private int zzc;
  
  public zzek()
  {
    this(new double[10], 0, true);
  }
  
  private zzek(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfDouble;
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
    if (!(paramCollection instanceof zzek)) {
      return super.addAll(paramCollection);
    }
    paramCollection = (zzek)paramCollection;
    int i = zzc;
    if (i == 0) {
      return false;
    }
    int j = zzc;
    if (Integer.MAX_VALUE - j >= i)
    {
      j += i;
      localObject = zzb;
      if (j > localObject.length) {
        zzb = Arrays.copyOf((double[])localObject, j);
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
    if (!(paramObject instanceof zzek)) {
      return super.equals(paramObject);
    }
    paramObject = (zzek)paramObject;
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
      Charset localCharset = zzfa.zza;
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
  
  public final void zze(double paramDouble)
  {
    zza();
    int i = zzc;
    double[] arrayOfDouble1 = zzb;
    if (i == arrayOfDouble1.length)
    {
      arrayOfDouble2 = new double[j.d(i, 3, 2, 1)];
      System.arraycopy(arrayOfDouble1, 0, arrayOfDouble2, 0, i);
      zzb = arrayOfDouble2;
    }
    double[] arrayOfDouble2 = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfDouble2[i] = paramDouble;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzek
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */