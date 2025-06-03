package com.google.android.recaptcha.internal;

import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzot
  extends zzkr
  implements RandomAccess
{
  private static final Object[] zza;
  private static final zzot zzb;
  private Object[] zzc;
  private int zzd;
  
  static
  {
    Object[] arrayOfObject = new Object[0];
    zza = arrayOfObject;
    zzb = new zzot(arrayOfObject, 0, false);
  }
  
  public zzot()
  {
    this(zza, 0, true);
  }
  
  private zzot(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzc = paramArrayOfObject;
    zzd = paramInt;
  }
  
  public static zzot zze()
  {
    return zzb;
  }
  
  private static int zzg(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzh(int paramInt)
  {
    return f.i("Index:", paramInt, ", Size:", zzd);
  }
  
  private final void zzi(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzd)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzh(paramInt));
  }
  
  public final void add(int paramInt, Object paramObject)
  {
    zza();
    if (paramInt >= 0)
    {
      int i = zzd;
      if (paramInt <= i)
      {
        int j = paramInt + 1;
        Object[] arrayOfObject = zzc;
        int k = arrayOfObject.length;
        if (i < k)
        {
          System.arraycopy(arrayOfObject, paramInt, arrayOfObject, j, i - paramInt);
        }
        else
        {
          arrayOfObject = new Object[zzg(k)];
          System.arraycopy(zzc, 0, arrayOfObject, 0, paramInt);
          System.arraycopy(zzc, paramInt, arrayOfObject, j, zzd - paramInt);
          zzc = arrayOfObject;
        }
        zzc[paramInt] = paramObject;
        zzd += 1;
        modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(zzh(paramInt));
  }
  
  public final boolean add(Object paramObject)
  {
    zza();
    int i = zzd;
    int j = zzc.length;
    if (i == j)
    {
      j = zzg(j);
      zzc = Arrays.copyOf(zzc, j);
    }
    Object[] arrayOfObject = zzc;
    j = zzd;
    zzd = (j + 1);
    arrayOfObject[j] = paramObject;
    modCount += 1;
    return true;
  }
  
  public final Object get(int paramInt)
  {
    zzi(paramInt);
    return zzc[paramInt];
  }
  
  public final Object remove(int paramInt)
  {
    zza();
    zzi(paramInt);
    Object[] arrayOfObject = zzc;
    Object localObject = arrayOfObject[paramInt];
    int i = zzd;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    zzd -= 1;
    modCount += 1;
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    zza();
    zzi(paramInt);
    Object[] arrayOfObject = zzc;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    modCount += 1;
    return localObject;
  }
  
  public final int size()
  {
    return zzd;
  }
  
  public final void zzf(int paramInt)
  {
    int i = zzc.length;
    if (paramInt <= i) {
      return;
    }
    if (i != 0)
    {
      while (i < paramInt) {
        i = zzg(i);
      }
      zzc = Arrays.copyOf(zzc, i);
      return;
    }
    zzc = new Object[Math.max(paramInt, 10)];
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzot
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */