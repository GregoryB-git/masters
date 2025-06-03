package com.google.android.gms.internal.fido;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

final class zzbu
  extends zzbi
{
  public static final zzbu zzc = new zzbu(zzbs.zza, zzbp.zza);
  public final transient zzaz zzd;
  
  static
  {
    int i = zzaz.zzd;
  }
  
  public zzbu(zzaz paramzzaz, Comparator paramComparator)
  {
    super(paramComparator);
    zzd = paramzzaz;
  }
  
  public final Object ceiling(Object paramObject)
  {
    int i = zzt(paramObject, true);
    if (i == zzd.size()) {
      return null;
    }
    return zzd.get(i);
  }
  
  public final boolean contains(Object paramObject)
  {
    if (paramObject != null) {}
    try
    {
      int i = Collections.binarySearch(zzd, paramObject, zza);
      if (i >= 0) {
        return true;
      }
    }
    catch (ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    Object localObject = paramCollection;
    if ((paramCollection instanceof zzbo)) {
      localObject = ((zzbo)paramCollection).zza();
    }
    zzcc localzzcc;
    Iterator localIterator;
    if ((zzca.zza(zza, (Iterable)localObject)) && (((Collection)localObject).size() > 1))
    {
      localzzcc = zzd.zzk(0);
      localIterator = ((Collection)localObject).iterator();
      if (!localzzcc.hasNext()) {
        return false;
      }
      localObject = localIterator.next();
      paramCollection = localzzcc.next();
    }
    try
    {
      for (;;)
      {
        int i = zza.compare(paramCollection, localObject);
        if (i < 0)
        {
          if (!localzzcc.hasNext()) {
            return false;
          }
          paramCollection = localzzcc.next();
        }
        else
        {
          if (i != 0) {
            break;
          }
          if (!localIterator.hasNext()) {
            return true;
          }
          localObject = localIterator.next();
        }
      }
    }
    catch (NullPointerException|ClassCastException paramCollection)
    {
      for (;;) {}
    }
    return false;
    return super.containsAll((Collection)localObject);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Set)) {
      return false;
    }
    paramObject = (Set)paramObject;
    if (zzd.size() != ((Set)paramObject).size()) {
      return false;
    }
    if (isEmpty()) {
      return true;
    }
    if (zzca.zza(zza, (Iterable)paramObject))
    {
      Iterator localIterator = ((Set)paramObject).iterator();
      try
      {
        zzcc localzzcc = zzd.zzk(0);
        while (localzzcc.hasNext())
        {
          Object localObject = localzzcc.next();
          paramObject = localIterator.next();
          if (paramObject != null)
          {
            int i = zza.compare(localObject, paramObject);
            if (i == 0) {
              break;
            }
          }
          else
          {
            return false;
          }
        }
        return true;
      }
      catch (ClassCastException|NoSuchElementException paramObject)
      {
        return false;
      }
    }
    return containsAll((Collection)paramObject);
  }
  
  public final Object first()
  {
    if (!isEmpty()) {
      return zzd.get(0);
    }
    throw new NoSuchElementException();
  }
  
  public final Object floor(Object paramObject)
  {
    int i = zzs(paramObject, true) - 1;
    if (i == -1) {
      return null;
    }
    return zzd.get(i);
  }
  
  public final Object higher(Object paramObject)
  {
    int i = zzt(paramObject, false);
    if (i == zzd.size()) {
      return null;
    }
    return zzd.get(i);
  }
  
  public final Object last()
  {
    if (!isEmpty())
    {
      zzaz localzzaz = zzd;
      return localzzaz.get(localzzaz.size() - 1);
    }
    throw new NoSuchElementException();
  }
  
  public final Object lower(Object paramObject)
  {
    int i = zzs(paramObject, false) - 1;
    if (i == -1) {
      return null;
    }
    return zzd.get(i);
  }
  
  public final int size()
  {
    return zzd.size();
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    return zzd.zza(paramArrayOfObject, 0);
  }
  
  public final int zzb()
  {
    return zzd.zzb();
  }
  
  public final int zzc()
  {
    return zzd.zzc();
  }
  
  public final zzcb zzd()
  {
    return zzd.zzk(0);
  }
  
  public final Object[] zze()
  {
    return zzd.zze();
  }
  
  public final zzbi zzf()
  {
    Object localObject = Collections.reverseOrder(zza);
    if (isEmpty()) {
      localObject = zzbi.zzq((Comparator)localObject);
    } else {
      localObject = new zzbu(zzd.zzf(), (Comparator)localObject);
    }
    return (zzbi)localObject;
  }
  
  public final zzaz zzi()
  {
    return zzd;
  }
  
  public final zzbi zzm(Object paramObject, boolean paramBoolean)
  {
    return zzu(0, zzs(paramObject, paramBoolean));
  }
  
  public final zzbi zzo(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    return zzp(paramObject1, paramBoolean1).zzm(paramObject2, paramBoolean2);
  }
  
  public final zzbi zzp(Object paramObject, boolean paramBoolean)
  {
    return zzu(zzt(paramObject, paramBoolean), zzd.size());
  }
  
  public final zzcb zzr()
  {
    return zzd.zzf().zzk(0);
  }
  
  public final int zzs(Object paramObject, boolean paramBoolean)
  {
    zzaz localzzaz = zzd;
    paramObject.getClass();
    int i = Collections.binarySearch(localzzaz, paramObject, zza);
    if (i >= 0)
    {
      int j = i;
      if (paramBoolean) {
        j = i + 1;
      }
      return j;
    }
    return i;
  }
  
  public final int zzt(Object paramObject, boolean paramBoolean)
  {
    zzaz localzzaz = zzd;
    paramObject.getClass();
    int i = Collections.binarySearch(localzzaz, paramObject, zza);
    if (i >= 0)
    {
      if (paramBoolean) {
        return i;
      }
      return i + 1;
    }
    return i;
  }
  
  public final zzbu zzu(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 == 0) {
      if (paramInt2 != zzd.size()) {
        i = 0;
      } else {
        return this;
      }
    }
    if (i < paramInt2) {
      return new zzbu(zzd.zzg(i, paramInt2), zza);
    }
    return zzbi.zzq(zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */