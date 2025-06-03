package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzfe
  extends zzdr
  implements RandomAccess, zzff
{
  @Deprecated
  public static final zzff zza;
  private static final zzfe zzb;
  private final List zzc;
  
  static
  {
    zzfe localzzfe = new zzfe(false);
    zzb = localzzfe;
    zza = localzzfe;
  }
  
  public zzfe()
  {
    this(10);
  }
  
  public zzfe(int paramInt)
  {
    super(true);
    zzc = localArrayList;
  }
  
  private zzfe(ArrayList paramArrayList)
  {
    super(true);
    zzc = paramArrayList;
  }
  
  private zzfe(boolean paramBoolean)
  {
    super(false);
    zzc = Collections.emptyList();
  }
  
  private static String zzh(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof zzef)) {
      return ((zzef)paramObject).zzl(zzfa.zzb);
    }
    return zzfa.zzd((byte[])paramObject);
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    zza();
    Object localObject = paramCollection;
    if ((paramCollection instanceof zzff)) {
      localObject = ((zzff)paramCollection).zzg();
    }
    boolean bool = zzc.addAll(paramInt, (Collection)localObject);
    modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final void clear()
  {
    zza();
    zzc.clear();
    modCount += 1;
  }
  
  public final int size()
  {
    return zzc.size();
  }
  
  public final zzff zze()
  {
    if (zzc()) {
      return new zzhe(this);
    }
    return this;
  }
  
  public final String zzf(int paramInt)
  {
    Object localObject = zzc.get(paramInt);
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    if ((localObject instanceof zzef))
    {
      localObject = (zzef)localObject;
      str = ((zzef)localObject).zzl(zzfa.zzb);
      if (((zzef)localObject).zzh()) {
        zzc.set(paramInt, str);
      }
      return str;
    }
    localObject = (byte[])localObject;
    String str = zzfa.zzd((byte[])localObject);
    if (zzhn.zzb((byte[])localObject)) {
      zzc.set(paramInt, str);
    }
    return str;
  }
  
  public final List zzg()
  {
    return Collections.unmodifiableList(zzc);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */