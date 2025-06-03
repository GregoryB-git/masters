package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

public abstract class zzbi
  extends zzbj
  implements NavigableSet, zzbz
{
  public final transient Comparator zza;
  public transient zzbi zzb;
  
  public zzbi(Comparator paramComparator)
  {
    zza = paramComparator;
  }
  
  public static zzbu zzq(Comparator paramComparator)
  {
    if (zzbp.zza.equals(paramComparator)) {
      return zzbu.zzc;
    }
    int i = zzaz.zzd;
    return new zzbu(zzbs.zza, paramComparator);
  }
  
  public Object ceiling(Object paramObject)
  {
    paramObject.getClass();
    return zzbk.zza(zzp(paramObject, true), null);
  }
  
  public final Comparator comparator()
  {
    return zza;
  }
  
  public Object first()
  {
    return zzd().next();
  }
  
  public Object floor(Object paramObject)
  {
    paramObject.getClass();
    return zzbm.zza(zzm(paramObject, true).zzr(), null);
  }
  
  public Object higher(Object paramObject)
  {
    paramObject.getClass();
    return zzbk.zza(zzp(paramObject, false), null);
  }
  
  public Object last()
  {
    return zzr().next();
  }
  
  public Object lower(Object paramObject)
  {
    paramObject.getClass();
    return zzbm.zza(zzm(paramObject, false).zzr(), null);
  }
  
  @Deprecated
  public final Object pollFirst()
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final Object pollLast()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract zzcb zzd();
  
  public abstract zzbi zzf();
  
  public final zzbi zzl()
  {
    zzbi localzzbi1 = zzb;
    zzbi localzzbi2 = localzzbi1;
    if (localzzbi1 == null)
    {
      localzzbi2 = zzf();
      zzb = localzzbi2;
      zzb = this;
    }
    return localzzbi2;
  }
  
  public abstract zzbi zzm(Object paramObject, boolean paramBoolean);
  
  public final zzbi zzn(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    paramObject1.getClass();
    paramObject2.getClass();
    boolean bool;
    if (zza.compare(paramObject1, paramObject2) <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    zzap.zzc(bool);
    return zzo(paramObject1, paramBoolean1, paramObject2, paramBoolean2);
  }
  
  public abstract zzbi zzo(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2);
  
  public abstract zzbi zzp(Object paramObject, boolean paramBoolean);
  
  public abstract zzcb zzr();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzbi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */