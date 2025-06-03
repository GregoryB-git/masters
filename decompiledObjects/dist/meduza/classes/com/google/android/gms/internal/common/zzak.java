package com.google.android.gms.internal.common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.jspecify.annotations.NullMarked;

@NullMarked
public abstract class zzak
  extends zzag
  implements List, RandomAccess
{
  private static final zzao zza = new zzai(zzam.zza, 0);
  
  public static zzak zzi(Object[] paramArrayOfObject, int paramInt)
  {
    if (paramInt == 0) {
      return zzam.zza;
    }
    return new zzam(paramArrayOfObject, paramInt);
  }
  
  public static zzak zzj(Iterable paramIterable)
  {
    paramIterable.getClass();
    if ((paramIterable instanceof Collection))
    {
      paramIterable = zzk((Collection)paramIterable);
    }
    else
    {
      Iterator localIterator = paramIterable.iterator();
      if (!localIterator.hasNext())
      {
        paramIterable = zzam.zza;
      }
      else
      {
        Object localObject = localIterator.next();
        if (!localIterator.hasNext())
        {
          paramIterable = zzm(localObject);
        }
        else
        {
          paramIterable = new zzah(4);
          paramIterable.zzb(localObject);
          paramIterable.zzc(localIterator);
          zzc = true;
          paramIterable = zzi(zza, zzb);
        }
      }
    }
    return paramIterable;
  }
  
  public static zzak zzk(Collection paramCollection)
  {
    if ((paramCollection instanceof zzag))
    {
      zzak localzzak = ((zzag)paramCollection).zzd();
      paramCollection = localzzak;
      if (localzzak.zzf())
      {
        paramCollection = localzzak.toArray();
        paramCollection = zzi(paramCollection, paramCollection.length);
      }
      return paramCollection;
    }
    paramCollection = paramCollection.toArray();
    int i = paramCollection.length;
    zzal.zza(paramCollection, i);
    return zzi(paramCollection, i);
  }
  
  public static zzak zzl()
  {
    return zzam.zza;
  }
  
  public static zzak zzm(Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject;
    zzal.zza(arrayOfObject, 1);
    return zzi(arrayOfObject, 1);
  }
  
  public static zzak zzn(Object paramObject1, Object paramObject2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    zzal.zza(arrayOfObject, 2);
    return zzi(arrayOfObject, 2);
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
  
  public final boolean contains(Object paramObject)
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
                if (!zzu.zza(get(j), ((List)localObject).get(j))) {
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
            } while (zzu.zza(((Iterator)paramObject).next(), ((Iterator)localObject).next()));
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
  
  public final int indexOf(Object paramObject)
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
  
  public final int lastIndexOf(Object paramObject)
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
  
  @Deprecated
  public final zzak zzd()
  {
    return this;
  }
  
  public final zzan zze()
  {
    return zzo(0);
  }
  
  public zzak zzh(int paramInt1, int paramInt2)
  {
    zzv.zzc(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    if (paramInt2 == size()) {
      return this;
    }
    if (paramInt2 == 0) {
      return zzam.zza;
    }
    return new zzaj(this, paramInt1, paramInt2);
  }
  
  public final zzao zzo(int paramInt)
  {
    zzv.zzb(paramInt, size(), "index");
    if (isEmpty()) {
      return zza;
    }
    return new zzai(this, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */