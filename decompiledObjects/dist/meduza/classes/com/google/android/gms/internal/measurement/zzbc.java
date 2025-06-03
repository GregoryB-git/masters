package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzbc
  extends zzay
{
  public zzbc()
  {
    zza.add(zzbv.zzc);
    zza.add(zzbv.zzl);
    zza.add(zzbv.zzm);
    zza.add(zzbv.zzn);
    zza.add(zzbv.zzs);
    zza.add(zzbv.zzp);
    zza.add(zzbv.zzt);
    zza.add(zzbv.zzx);
    zza.add(zzbv.zzam);
    zza.add(zzbv.zzay);
    zza.add(zzbv.zzbb);
    zza.add(zzbv.zzbe);
    zza.add(zzbv.zzbf);
  }
  
  private static zzaq zza(zzh paramzzh, List<zzaq> paramList)
  {
    zzg.zzb(zzbv.zzx, 2, paramList);
    zzaq localzzaq = paramzzh.zza((zzaq)paramList.get(0));
    Object localObject = paramzzh.zza((zzaq)paramList.get(1));
    if ((localObject instanceof zzaf))
    {
      List localList = ((zzaf)localObject).zzi();
      localObject = new ArrayList();
      if (paramList.size() > 2) {
        localObject = paramList.subList(2, paramList.size());
      }
      return new zzar(localzzaq.zzf(), localList, (List)localObject, paramzzh);
    }
    throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[] { localObject.getClass().getCanonicalName() }));
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    int i = zzbf.zza[zzg.zza(paramString).ordinal()];
    int j = 0;
    zzaq localzzaq;
    switch (i)
    {
    default: 
      return super.zza(paramString);
    case 13: 
      zzg.zza(zzbv.zzbf, 3, paramList);
      if (paramzzh.zza((zzaq)paramList.get(0)).zzd().booleanValue()) {
        return paramzzh.zza((zzaq)paramList.get(1));
      }
      return paramzzh.zza((zzaq)paramList.get(2));
    case 12: 
      zzg.zza(zzbv.zzbe, 3, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      localzzaq = paramzzh.zza((zzaq)paramList.get(1));
      localObject = paramzzh.zza((zzaq)paramList.get(2));
      if ((localzzaq instanceof zzaf))
      {
        if ((localObject instanceof zzaf))
        {
          paramList = (zzaf)localzzaq;
          localObject = (zzaf)localObject;
          i = 0;
          while (j < paramList.zzb())
          {
            if ((i != 0) || (paramString.equals(paramzzh.zza(paramList.zza(j)))))
            {
              localzzaq = paramzzh.zza(((zzaf)localObject).zza(j));
              if ((localzzaq instanceof zzaj))
              {
                if (((zzaj)localzzaq).zzb().equals("break")) {
                  break label383;
                }
                return localzzaq;
              }
              i = 1;
            }
            j++;
          }
          if (paramList.zzb() + 1 == ((zzaf)localObject).zzb())
          {
            paramzzh = paramzzh.zza(((zzaf)localObject).zza(paramList.zzb()));
            if ((paramzzh instanceof zzaj))
            {
              paramString = ((zzaj)paramzzh).zzb();
              if ((paramString.equals("return")) || (paramString.equals("continue"))) {
                return paramzzh;
              }
            }
          }
          return zzaq.zzc;
        }
        throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
      }
      throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
    case 11: 
      if (paramList.isEmpty()) {
        return zzaq.zzg;
      }
      zzg.zza(zzbv.zzbb, 1, paramList);
      return new zzaj("return", paramzzh.zza((zzaq)paramList.get(0)));
    case 10: 
      return new zzaf(paramList);
    case 9: 
      zzg.zzb(zzbv.zzam, 2, paramList);
      localzzaq = paramzzh.zza((zzaq)paramList.get(0));
      localObject = paramzzh.zza((zzaq)paramList.get(1));
      paramString = null;
      if (paramList.size() > 2) {
        paramString = paramzzh.zza((zzaq)paramList.get(2));
      }
      paramList = zzaq.zzc;
      if (localzzaq.zzd().booleanValue()) {
        paramString = paramzzh.zza((zzaf)localObject);
      } else if (paramString != null) {
        paramString = paramzzh.zza((zzaf)paramString);
      } else {
        paramString = paramList;
      }
      if ((paramString instanceof zzaj)) {
        return paramString;
      }
      return paramList;
    case 8: 
      return zza(paramzzh, paramList);
    case 7: 
      zzg.zzb(zzbv.zzt, 2, paramList);
      paramList = (zzar)zza(paramzzh, paramList);
      if (paramList.zza() == null) {
        paramString = "";
      } else {
        paramString = paramList.zza();
      }
      paramzzh.zzc(paramString, paramList);
      return paramList;
    case 6: 
      zzg.zza(zzbv.zzm, 0, paramList);
      return zzaq.zze;
    case 4: 
    case 5: 
      if (!paramList.isEmpty())
      {
        paramString = paramzzh.zza((zzaq)paramList.get(0));
        if ((paramString instanceof zzaf)) {
          return paramzzh.zza((zzaf)paramString);
        }
      }
      return zzaq.zzc;
    case 3: 
      zzg.zza(zzbv.zzm, 0, paramList);
      return zzaq.zzf;
    case 2: 
      label383:
      return paramzzh.zza().zza(new zzaf(paramList));
    }
    zzg.zza(zzbv.zzc, 3, paramList);
    Object localObject = paramzzh.zza((zzaq)paramList.get(0));
    paramString = paramzzh.zza((zzaq)paramList.get(1)).zzf();
    paramList = paramzzh.zza((zzaq)paramList.get(2));
    if ((paramList instanceof zzaf))
    {
      if (!paramString.isEmpty()) {
        return ((zzaq)localObject).zza(paramString, paramzzh, ((zzaf)paramList).zzi());
      }
      throw new IllegalArgumentException("Function name for apply is undefined");
    }
    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[] { paramList.getClass().getCanonicalName() }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */