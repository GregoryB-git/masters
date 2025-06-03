package com.google.android.gms.internal.fido;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzaz
  extends zzav
  implements List, RandomAccess
{
  private static final zzcc zza = new zzaw(zzbs.zza, 0);
  
  public static zzaz zzh(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zzbs.zza;
    }
    return new zzbs(paramArrayOfObject, paramInt);
  }
  
  public static zzaz zzi(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0)
    {
      paramArrayOfObject = zzbs.zza;
    }
    else
    {
      paramArrayOfObject = (Object[])paramArrayOfObject.clone();
      int i = paramArrayOfObject.length;
      zzbq.zzb(paramArrayOfObject, i);
      paramArrayOfObject = zzh(paramArrayOfObject, i);
    }
    return paramArrayOfObject;
  }
  
  public static zzaz zzj(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    zzbq.zzb(arrayOfObject, 1);
    return zzh(arrayOfObject, 1);
  }
  
  @Deprecated
  public final void add(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramObject == this)
    {
      bool2 = bool1;
    }
    else
    {
      if (!(paramObject instanceof List)) {}
      Object localObject;
      label165:
      do
      {
        for (;;)
        {
          return false;
          localObject = (List)paramObject;
          int i = size();
          if (i == ((List)localObject).size())
          {
            if ((localObject instanceof RandomAccess)) {
              for (int j = 0;; j++)
              {
                bool2 = bool1;
                if (j >= i) {
                  return bool2;
                }
                if (!zzao.zza(get(j), ((List)localObject).get(j))) {
                  break;
                }
              }
            }
            paramObject = iterator();
            localObject = ((List)localObject).iterator();
            do
            {
              if (!((Iterator)paramObject).hasNext()) {
                break label165;
              }
              if (!((Iterator)localObject).hasNext()) {
                break;
              }
            } while (zzao.zza(((Iterator)paramObject).next(), ((Iterator)localObject).next()));
          }
        }
      } while (((Iterator)localObject).hasNext());
      bool2 = bool1;
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + get(k).hashCode();
    }
    return j;
  }
  
  public int indexOf(Object paramObject)
  {
    int i = -1;
    if (paramObject == null) {
      return -1;
    }
    int j = size();
    int m;
    for (int k = 0;; k++)
    {
      m = i;
      if (k >= j) {
        break;
      }
      if (paramObject.equals(get(k)))
      {
        m = k;
        break;
      }
    }
    return m;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    int i = -1;
    if (paramObject == null) {
      return -1;
    }
    int k;
    for (int j = size() - 1;; j--)
    {
      k = i;
      if (j < 0) {
        break;
      }
      if (paramObject.equals(get(j)))
      {
        k = j;
        break;
      }
    }
    return k;
  }
  
  @Deprecated
  public final Object remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final Object set(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public int zza(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramArrayOfObject[paramInt] = get(paramInt);
    }
    return i;
  }
  
  public final zzcb zzd()
  {
    return zzk(0);
  }
  
  public zzaz zzf()
  {
    if (size() <= 1) {
      return this;
    }
    return new zzax(this);
  }
  
  public zzaz zzg(int paramInt1, int paramInt2)
  {
    zzap.zze(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zzbs.zza;
    }
    return new zzay(this, paramInt1, paramInt2);
  }
  
  public final zzcc zzk(int paramInt)
  {
    zzap.zzb(paramInt, size(), "index");
    if (isEmpty()) {
      return zza;
    }
    return new zzaw(this, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzaz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */