package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzar
  extends zzal
{
  private final List<String> zzk;
  private final List<zzaq> zzl;
  private zzh zzm;
  
  private zzar(zzar paramzzar)
  {
    super(zza);
    ArrayList localArrayList = new ArrayList(zzk.size());
    zzk = localArrayList;
    localArrayList.addAll(zzk);
    localArrayList = new ArrayList(zzl.size());
    zzl = localArrayList;
    localArrayList.addAll(zzl);
    zzm = zzm;
  }
  
  public zzar(String paramString, List<zzaq> paramList1, List<zzaq> paramList2, zzh paramzzh)
  {
    super(paramString);
    zzk = new ArrayList();
    zzm = paramzzh;
    if (!paramList1.isEmpty())
    {
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        paramString = (zzaq)paramList1.next();
        zzk.add(paramString.zzf());
      }
    }
    zzl = new ArrayList(paramList2);
  }
  
  public final zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzh localzzh = zzm.zza();
    Object localObject1;
    for (int i = 0; i < zzk.size(); i++)
    {
      if (i < paramList.size())
      {
        localObject1 = (String)zzk.get(i);
        localObject2 = paramzzh.zza((zzaq)paramList.get(i));
      }
      else
      {
        localObject1 = (String)zzk.get(i);
        localObject2 = zzaq.zzc;
      }
      localzzh.zza((String)localObject1, (zzaq)localObject2);
    }
    Object localObject2 = zzl.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (zzaq)((Iterator)localObject2).next();
      paramList = localzzh.zza((zzaq)localObject1);
      paramzzh = paramList;
      if ((paramList instanceof zzat)) {
        paramzzh = localzzh.zza((zzaq)localObject1);
      }
      if ((paramzzh instanceof zzaj)) {
        return ((zzaj)paramzzh).zza();
      }
    }
    return zzaq.zzc;
  }
  
  public final zzaq zzc()
  {
    return new zzar(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */