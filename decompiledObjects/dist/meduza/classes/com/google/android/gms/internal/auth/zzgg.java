package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzgg
  extends zzdr
  implements RandomAccess
{
  private static final zzgg zza = new zzgg(new Object[0], 0, false);
  private Object[] zzb;
  private int zzc;
  
  public zzgg()
  {
    this(new Object[10], 0, true);
  }
  
  private zzgg(Object[] paramArrayOfObject, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzb = paramArrayOfObject;
    zzc = paramInt;
  }
  
  public static zzgg zze()
  {
    return zza;
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
  
  public final void add(int paramInt, Object paramObject)
  {
    zza();
    if (paramInt >= 0)
    {
      int i = zzc;
      if (paramInt <= i)
      {
        Object[] arrayOfObject1 = zzb;
        if (i < arrayOfObject1.length)
        {
          System.arraycopy(arrayOfObject1, paramInt, arrayOfObject1, paramInt + 1, i - paramInt);
        }
        else
        {
          Object[] arrayOfObject2 = new Object[j.d(i, 3, 2, 1)];
          System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, paramInt);
          System.arraycopy(zzb, paramInt, arrayOfObject2, paramInt + 1, zzc - paramInt);
          zzb = arrayOfObject2;
        }
        zzb[paramInt] = paramObject;
        zzc += 1;
        modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(zzf(paramInt));
  }
  
  public final boolean add(Object paramObject)
  {
    zza();
    int i = zzc;
    Object[] arrayOfObject = zzb;
    if (i == arrayOfObject.length) {
      zzb = Arrays.copyOf(arrayOfObject, i * 3 / 2 + 1);
    }
    arrayOfObject = zzb;
    i = zzc;
    zzc = (i + 1);
    arrayOfObject[i] = paramObject;
    modCount += 1;
    return true;
  }
  
  public final Object get(int paramInt)
  {
    zzg(paramInt);
    return zzb[paramInt];
  }
  
  public final Object remove(int paramInt)
  {
    zza();
    zzg(paramInt);
    Object[] arrayOfObject = zzb;
    Object localObject = arrayOfObject[paramInt];
    int i = zzc;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    zzc -= 1;
    modCount += 1;
    return localObject;
  }
  
  public final Object set(int paramInt, Object paramObject)
  {
    zza();
    zzg(paramInt);
    Object[] arrayOfObject = zzb;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    modCount += 1;
    return localObject;
  }
  
  public final int size()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */