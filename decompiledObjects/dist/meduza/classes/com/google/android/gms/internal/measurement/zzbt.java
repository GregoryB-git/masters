package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzbt
  extends zzay
{
  public zzbt()
  {
    zza.add(zzbv.zzd);
    zza.add(zzbv.zzo);
    zza.add(zzbv.zzq);
    zza.add(zzbv.zzr);
    zza.add(zzbv.zzw);
    zza.add(zzbv.zzaf);
    zza.add(zzbv.zzag);
    zza.add(zzbv.zzah);
    zza.add(zzbv.zzau);
    zza.add(zzbv.zzbc);
    zza.add(zzbv.zzbg);
    zza.add(zzbv.zzbh);
    zza.add(zzbv.zzbi);
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    int i = zzbs.zza[zzg.zza(paramString).ordinal()];
    int j = 0;
    int k = 0;
    int m = 0;
    label316:
    zzaq localzzaq1;
    switch (i)
    {
    default: 
      return super.zza(paramString);
    case 13: 
      zzg.zzb(zzbv.zzbi, 1, paramList);
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        paramList = paramzzh.zza((zzaq)paramString.next());
        if ((paramList instanceof zzas)) {
          paramzzh.zza(paramList.zzf(), zzaq.zzc);
        } else {
          throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[] { paramList.getClass().getCanonicalName() }));
        }
      }
      return zzaq.zzc;
    case 12: 
      zzg.zza(zzbv.zzbh, 0, paramList);
      return zzaq.zzc;
    case 11: 
      zzg.zza(zzbv.zzbg, 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzax))
      {
        paramString = "undefined";
      }
      else if ((paramString instanceof zzag))
      {
        paramString = "boolean";
      }
      else if ((paramString instanceof zzai))
      {
        paramString = "number";
      }
      else if ((paramString instanceof zzas))
      {
        paramString = "string";
      }
      else if ((paramString instanceof zzar))
      {
        paramString = "function";
      }
      else
      {
        if (((paramString instanceof zzat)) || ((paramString instanceof zzaj))) {
          break label316;
        }
        paramString = "object";
      }
      return new zzas(paramString);
      throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[] { paramString }));
    case 10: 
      zzg.zza(zzbv.zzbc, 3, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      localzzaq1 = paramzzh.zza((zzaq)paramList.get(1));
      paramzzh = paramzzh.zza((zzaq)paramList.get(2));
      if ((paramString != zzaq.zzc) && (paramString != zzaq.zzd))
      {
        if (((paramString instanceof zzaf)) && ((localzzaq1 instanceof zzai))) {
          ((zzaf)paramString).zzb(localzzaq1.zze().intValue(), paramzzh);
        } else if ((paramString instanceof zzak)) {
          ((zzak)paramString).zza(localzzaq1.zzf(), paramzzh);
        }
        return paramzzh;
      }
      throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[] { localzzaq1.zzf(), paramString.zzf() }));
    case 9: 
      zzg.zza(zzbv.zzau, 0, paramList);
      return zzaq.zzd;
    case 7: 
    case 8: 
      zzg.zza(zzbv.zzah, 2, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      paramzzh = paramzzh.zza((zzaq)paramList.get(1));
      if (((paramString instanceof zzaf)) && (zzg.zzb(paramzzh))) {
        return ((zzaf)paramString).zza(paramzzh.zze().intValue());
      }
      if ((paramString instanceof zzak)) {
        return ((zzak)paramString).zza(paramzzh.zzf());
      }
      if ((paramString instanceof zzas))
      {
        if ("length".equals(paramzzh.zzf())) {
          return new zzai(Double.valueOf(paramString.zzf().length()));
        }
        if ((zzg.zzb(paramzzh)) && (paramzzh.zze().doubleValue() < paramString.zzf().length())) {
          return new zzas(String.valueOf(paramString.zzf().charAt(paramzzh.zze().intValue())));
        }
      }
      return zzaq.zzc;
    case 6: 
      zzg.zza(zzbv.zzaf, 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzas)) {
        return paramzzh.zza(paramString.zzf());
      }
      throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[] { paramString.getClass().getCanonicalName() }));
    case 5: 
      zzg.zzb(zzbv.zzw, 1, paramList);
      paramString = zzaq.zzc;
      while (m < paramList.size())
      {
        paramString = paramzzh.zza((zzaq)paramList.get(m));
        if (!(paramString instanceof zzaj)) {
          m++;
        } else {
          throw new IllegalStateException("ControlValue cannot be in an expression list");
        }
      }
      return paramString;
    case 4: 
      if (paramList.isEmpty()) {
        return new zzap();
      }
      if (paramList.size() % 2 == 0)
      {
        paramString = new zzap();
        m = j;
        while (m < paramList.size() - 1)
        {
          zzaq localzzaq2 = paramzzh.zza((zzaq)paramList.get(m));
          localzzaq1 = paramzzh.zza((zzaq)paramList.get(m + 1));
          if ((!(localzzaq2 instanceof zzaj)) && (!(localzzaq1 instanceof zzaj)))
          {
            paramString.zza(localzzaq2.zzf(), localzzaq1);
            m += 2;
          }
          else
          {
            throw new IllegalStateException("Failed to evaluate map entry");
          }
        }
        return paramString;
      }
      throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[] { Integer.valueOf(paramList.size()) }));
    case 3: 
      if (paramList.isEmpty()) {
        return new zzaf();
      }
      paramString = new zzaf();
      paramList = paramList.iterator();
      m = k;
      while (paramList.hasNext())
      {
        localzzaq1 = paramzzh.zza((zzaq)paramList.next());
        if (!(localzzaq1 instanceof zzaj))
        {
          paramString.zzb(m, localzzaq1);
          m++;
        }
        else
        {
          throw new IllegalStateException("Failed to evaluate array element");
        }
      }
      return paramString;
    case 2: 
      zzg.zzb(zzbv.zzo, 2, paramList);
      if (paramList.size() % 2 == 0)
      {
        m = 0;
        while (m < paramList.size() - 1)
        {
          paramString = paramzzh.zza((zzaq)paramList.get(m));
          if ((paramString instanceof zzas))
          {
            paramzzh.zzb(paramString.zzf(), paramzzh.zza((zzaq)paramList.get(m + 1)));
            m += 2;
          }
          else
          {
            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[] { paramString.getClass().getCanonicalName() }));
          }
        }
        return zzaq.zzc;
      }
      throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[] { Integer.valueOf(paramList.size()) }));
    }
    zzg.zza(zzbv.zzd, 2, paramList);
    paramString = paramzzh.zza((zzaq)paramList.get(0));
    if ((paramString instanceof zzas))
    {
      if (paramzzh.zzb(paramString.zzf()))
      {
        paramList = paramzzh.zza((zzaq)paramList.get(1));
        paramzzh.zzc(paramString.zzf(), paramList);
        return paramList;
      }
      throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[] { paramString.zzf() }));
    }
    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[] { paramString.getClass().getCanonicalName() }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */