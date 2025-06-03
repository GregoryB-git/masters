package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

final class zzamb<E>
  extends zzaiq<E>
  implements RandomAccess
{
  private static final Object[] zza;
  private static final zzamb<Object> zzb;
  private E[] zzc;
  private int zzd;
  
  static
  {
    Object[] arrayOfObject = new Object[0];
    zza = arrayOfObject;
    zzb = new zzamb(arrayOfObject, 0, false);
  }
  
  public zzamb()
  {
    this(zza, 0, true);
  }
  
  private zzamb(E[] paramArrayOfE, int paramInt, boolean paramBoolean)
  {
    super(paramBoolean);
    zzc = paramArrayOfE;
    zzd = paramInt;
  }
  
  private static int zzb(int paramInt)
  {
    return Math.max(paramInt * 3 / 2 + 1, 10);
  }
  
  private final String zzc(int paramInt)
  {
    return g.c("Index:", paramInt, ", Size:", zzd);
  }
  
  public static <E> zzamb<E> zzd()
  {
    return zzb;
  }
  
  private final void zzd(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < zzd)) {
      return;
    }
    throw new IndexOutOfBoundsException(zzc(paramInt));
  }
  
  public final void add(int paramInt, E paramE)
  {
    zza();
    if (paramInt >= 0)
    {
      int i = zzd;
      if (paramInt <= i)
      {
        Object[] arrayOfObject = zzc;
        if (i < arrayOfObject.length)
        {
          System.arraycopy(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, i - paramInt);
        }
        else
        {
          arrayOfObject = new Object[zzb(arrayOfObject.length)];
          System.arraycopy(zzc, 0, arrayOfObject, 0, paramInt);
          System.arraycopy(zzc, paramInt, arrayOfObject, paramInt + 1, zzd - paramInt);
          zzc = arrayOfObject;
        }
        zzc[paramInt] = paramE;
        zzd += 1;
        modCount += 1;
        return;
      }
    }
    throw new IndexOutOfBoundsException(zzc(paramInt));
  }
  
  public final boolean add(E paramE)
  {
    zza();
    int i = zzd;
    Object[] arrayOfObject = zzc;
    if (i == arrayOfObject.length)
    {
      i = zzb(arrayOfObject.length);
      zzc = Arrays.copyOf(zzc, i);
    }
    arrayOfObject = zzc;
    i = zzd;
    zzd = (i + 1);
    arrayOfObject[i] = paramE;
    modCount += 1;
    return true;
  }
  
  public final E get(int paramInt)
  {
    zzd(paramInt);
    return (E)zzc[paramInt];
  }
  
  public final E remove(int paramInt)
  {
    zza();
    zzd(paramInt);
    Object[] arrayOfObject = zzc;
    Object localObject = arrayOfObject[paramInt];
    int i = zzd;
    if (paramInt < i - 1) {
      System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt - 1);
    }
    zzd -= 1;
    modCount += 1;
    return (E)localObject;
  }
  
  public final E set(int paramInt, E paramE)
  {
    zza();
    zzd(paramInt);
    Object[] arrayOfObject = zzc;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramE;
    modCount += 1;
    return (E)localObject;
  }
  
  public final int size()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */