package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzbi
  extends zzay
{
  public zzbi()
  {
    zza.add(zzbv.zzy);
    zza.add(zzbv.zzz);
    zza.add(zzbv.zzaa);
    zza.add(zzbv.zzab);
    zza.add(zzbv.zzac);
    zza.add(zzbv.zzad);
    zza.add(zzbv.zzae);
    zza.add(zzbv.zzbj);
  }
  
  private static zzaq zza(zzbm paramzzbm, zzaq paramzzaq1, zzaq paramzzaq2)
  {
    return zza(paramzzbm, paramzzaq1.zzh(), paramzzaq2);
  }
  
  private static zzaq zza(zzbm paramzzbm, Iterator<zzaq> paramIterator, zzaq paramzzaq)
  {
    if (paramIterator != null) {
      while (paramIterator.hasNext())
      {
        Object localObject = paramzzbm.zza((zzaq)paramIterator.next()).zza((zzaf)paramzzaq);
        if ((localObject instanceof zzaj))
        {
          localObject = (zzaj)localObject;
          if ("break".equals(((zzaj)localObject).zzb())) {
            return zzaq.zzc;
          }
          if ("return".equals(((zzaj)localObject).zzb())) {
            return (zzaq)localObject;
          }
        }
      }
    }
    return zzaq.zzc;
  }
  
  private static zzaq zzb(zzbm paramzzbm, zzaq paramzzaq1, zzaq paramzzaq2)
  {
    if ((paramzzaq1 instanceof Iterable)) {
      return zza(paramzzbm, ((Iterable)paramzzaq1).iterator(), paramzzaq2);
    }
    throw new IllegalArgumentException("Non-iterable type in for...of loop.");
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    Object localObject1;
    Object localObject2;
    switch (zzbl.zza[zzg.zza(paramString).ordinal()])
    {
    default: 
      return super.zza(paramString);
    case 8: 
      zzg.zza(zzbv.zzbj, 4, paramList);
      paramString = (zzaq)paramList.get(0);
      localObject1 = (zzaq)paramList.get(1);
      localObject2 = (zzaq)paramList.get(2);
      paramList = paramzzh.zza((zzaq)paramList.get(3));
      if (paramzzh.zza((zzaq)localObject2).zzd().booleanValue())
      {
        localObject2 = paramzzh.zza((zzaf)paramList);
        if ((localObject2 instanceof zzaj))
        {
          localObject2 = (zzaj)localObject2;
          if ("break".equals(((zzaj)localObject2).zzb())) {
            break label271;
          }
          if ("return".equals(((zzaj)localObject2).zzb())) {
            return (zzaq)localObject2;
          }
        }
      }
      while (paramzzh.zza(paramString).zzd().booleanValue())
      {
        localObject2 = paramzzh.zza((zzaf)paramList);
        if ((localObject2 instanceof zzaj))
        {
          localObject2 = (zzaj)localObject2;
          if ("break".equals(((zzaj)localObject2).zzb())) {
            break;
          }
          if ("return".equals(((zzaj)localObject2).zzb())) {
            return (zzaq)localObject2;
          }
        }
        paramzzh.zza((zzaq)localObject1);
      }
      return zzaq.zzc;
    case 7: 
      zzg.zza(zzbv.zzae, 3, paramList);
      if ((paramList.get(0) instanceof zzas))
      {
        paramString = ((zzaq)paramList.get(0)).zzf();
        localObject1 = paramzzh.zza((zzaq)paramList.get(1));
        paramList = paramzzh.zza((zzaq)paramList.get(2));
        return zzb(new zzbn(paramzzh, paramString), (zzaq)localObject1, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
    case 6: 
      zzg.zza(zzbv.zzad, 3, paramList);
      if ((paramList.get(0) instanceof zzas))
      {
        paramString = ((zzaq)paramList.get(0)).zzf();
        localObject1 = paramzzh.zza((zzaq)paramList.get(1));
        paramList = paramzzh.zza((zzaq)paramList.get(2));
        return zzb(new zzbk(paramzzh, paramString), (zzaq)localObject1, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
    case 5: 
      zzg.zza(zzbv.zzac, 3, paramList);
      if ((paramList.get(0) instanceof zzas))
      {
        localObject1 = ((zzaq)paramList.get(0)).zzf();
        paramString = paramzzh.zza((zzaq)paramList.get(1));
        paramList = paramzzh.zza((zzaq)paramList.get(2));
        return zzb(new zzbp(paramzzh, (String)localObject1), paramString, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
    case 4: 
      zzg.zza(zzbv.zzab, 4, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzaf))
      {
        zzaf localzzaf = (zzaf)paramString;
        localObject2 = (zzaq)paramList.get(1);
        localObject1 = (zzaq)paramList.get(2);
        zzaq localzzaq = paramzzh.zza((zzaq)paramList.get(3));
        paramList = paramzzh.zza();
        for (int i = 0;; i++)
        {
          paramString = paramList;
          if (i >= localzzaf.zzb()) {
            break;
          }
          paramString = localzzaf.zza(i).zzf();
          paramList.zzc(paramString, paramzzh.zza(paramString));
        }
        while (paramzzh.zza((zzaq)localObject2).zzd().booleanValue())
        {
          paramList = paramzzh.zza((zzaf)localzzaq);
          if ((paramList instanceof zzaj))
          {
            paramList = (zzaj)paramList;
            if ("break".equals(paramList.zzb())) {
              break;
            }
            if ("return".equals(paramList.zzb())) {
              return paramList;
            }
          }
          paramList = paramzzh.zza();
          for (i = 0; i < localzzaf.zzb(); i++)
          {
            String str = localzzaf.zza(i).zzf();
            paramList.zzc(str, paramString.zza(str));
          }
          paramList.zza((zzaq)localObject1);
          paramString = paramList;
        }
        return zzaq.zzc;
      }
      throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
    case 3: 
      zzg.zza(zzbv.zzaa, 3, paramList);
      if ((paramList.get(0) instanceof zzas))
      {
        paramString = ((zzaq)paramList.get(0)).zzf();
        localObject1 = paramzzh.zza((zzaq)paramList.get(1));
        paramList = paramzzh.zza((zzaq)paramList.get(2));
        return zza(new zzbn(paramzzh, paramString), (zzaq)localObject1, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
    case 2: 
      label271:
      zzg.zza(zzbv.zzz, 3, paramList);
      if ((paramList.get(0) instanceof zzas))
      {
        paramString = ((zzaq)paramList.get(0)).zzf();
        localObject1 = paramzzh.zza((zzaq)paramList.get(1));
        paramList = paramzzh.zza((zzaq)paramList.get(2));
        return zza(new zzbk(paramzzh, paramString), (zzaq)localObject1, paramList);
      }
      throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
    }
    zzg.zza(zzbv.zzy, 3, paramList);
    if ((paramList.get(0) instanceof zzas))
    {
      paramString = ((zzaq)paramList.get(0)).zzf();
      localObject1 = paramzzh.zza((zzaq)paramList.get(1));
      paramList = paramzzh.zza((zzaq)paramList.get(2));
      return zza(new zzbp(paramzzh, paramString), (zzaq)localObject1, paramList);
    }
    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */