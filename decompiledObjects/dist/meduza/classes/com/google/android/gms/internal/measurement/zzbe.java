package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzbe
{
  private static zzaf zza(zzaf paramzzaf, zzh paramzzh, zzal paramzzal)
  {
    return zza(paramzzaf, paramzzh, paramzzal, null, null);
  }
  
  private static zzaf zza(zzaf paramzzaf, zzh paramzzh, zzal paramzzal, Boolean paramBoolean1, Boolean paramBoolean2)
  {
    zzaf localzzaf = new zzaf();
    Iterator localIterator = paramzzaf.zzg();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (paramzzaf.zzc(i))
      {
        zzaq localzzaq = paramzzal.zza(paramzzh, Arrays.asList(new zzaq[] { paramzzaf.zza(i), new zzai(Double.valueOf(i)), paramzzaf }));
        if (localzzaq.zzd().equals(paramBoolean1)) {
          return localzzaf;
        }
        if ((paramBoolean2 == null) || (localzzaq.zzd().equals(paramBoolean2))) {
          localzzaf.zzb(i, localzzaq);
        }
      }
    }
    return localzzaf;
  }
  
  private static zzaq zza(zzaf paramzzaf, zzh paramzzh, List<zzaq> paramList, boolean paramBoolean)
  {
    zzg.zzb("reduce", 1, paramList);
    zzg.zzc("reduce", 2, paramList);
    Object localObject = paramzzh.zza((zzaq)paramList.get(0));
    if ((localObject instanceof zzal))
    {
      if (paramList.size() == 2)
      {
        paramList = paramzzh.zza((zzaq)paramList.get(1));
        if ((paramList instanceof zzaj)) {
          throw new IllegalArgumentException("Failed to parse initial value");
        }
      }
      else
      {
        paramList = null;
        if (paramzzaf.zzb() == 0) {
          break label315;
        }
      }
      zzal localzzal = (zzal)localObject;
      int i = paramzzaf.zzb();
      int j;
      if (paramBoolean) {
        j = 0;
      } else {
        j = i - 1;
      }
      if (paramBoolean) {
        i--;
      } else {
        i = 0;
      }
      int k;
      if (paramBoolean) {
        k = 1;
      } else {
        k = -1;
      }
      int m = i;
      int n = j;
      localObject = paramList;
      int i1 = k;
      if (paramList == null) {
        paramList = paramzzaf.zza(j);
      }
      while ((m - n) * i1 >= 0)
      {
        i = m;
        j = n;
        paramList = (List<zzaq>)localObject;
        k = i1;
        if (paramzzaf.zzc(n))
        {
          paramList = localzzal.zza(paramzzh, Arrays.asList(new zzaq[] { localObject, paramzzaf.zza(n), new zzai(Double.valueOf(n)), paramzzaf }));
          if (!(paramList instanceof zzaj))
          {
            i = m;
            j = n;
            k = i1;
          }
          else
          {
            throw new IllegalStateException("Reduce operation failed");
          }
        }
        n = j + k;
        m = i;
        localObject = paramList;
        i1 = k;
      }
      return (zzaq)localObject;
      label315:
      throw new IllegalStateException("Empty array with no initial value error");
    }
    throw new IllegalArgumentException("Callback should be a method");
  }
  
  public static zzaq zza(String paramString, zzaf paramzzaf, zzh paramzzh, List<zzaq> paramList)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1943291465: 
      if (paramString.equals("indexOf")) {
        j = 19;
      }
      break;
    case 1099846370: 
      if (paramString.equals("reverse")) {
        j = 18;
      }
      break;
    case 965561430: 
      if (paramString.equals("reduceRight")) {
        j = 17;
      }
      break;
    case 109526418: 
      if (paramString.equals("slice")) {
        j = 16;
      }
      break;
    case 109407362: 
      if (paramString.equals("shift")) {
        j = 15;
      }
      break;
    case 96891675: 
      if (paramString.equals("every")) {
        j = 14;
      }
      break;
    case 3536286: 
      if (paramString.equals("sort")) {
        j = 13;
      }
      break;
    case 3536116: 
      if (paramString.equals("some")) {
        j = 12;
      }
      break;
    case 3452698: 
      if (paramString.equals("push")) {
        j = 11;
      }
      break;
    case 3267882: 
      if (paramString.equals("join")) {
        j = 10;
      }
      break;
    case 111185: 
      if (paramString.equals("pop")) {
        j = 9;
      }
      break;
    case 107868: 
      if (paramString.equals("map")) {
        j = 8;
      }
      break;
    case -277637751: 
      if (paramString.equals("unshift")) {
        j = 7;
      }
      break;
    case -467511597: 
      if (paramString.equals("lastIndexOf")) {
        j = 6;
      }
      break;
    case -678635926: 
      if (paramString.equals("forEach")) {
        j = 5;
      }
      break;
    case -895859076: 
      if (paramString.equals("splice")) {
        j = 4;
      }
      break;
    case -934873754: 
      if (paramString.equals("reduce")) {
        j = 3;
      }
      break;
    case -1274492040: 
      if (paramString.equals("filter")) {
        j = 2;
      }
      break;
    case -1354795244: 
      if (paramString.equals("concat")) {
        j = 1;
      }
      break;
    case -1776922004: 
      if (paramString.equals("toString")) {
        j = 0;
      }
      break;
    }
    double d1 = 0.0D;
    double d2;
    int k;
    Object localObject;
    switch (j)
    {
    default: 
      throw new IllegalArgumentException("Command not supported");
    case 19: 
      zzg.zzc("indexOf", 2, paramList);
      paramString = zzaq.zzc;
      if (!paramList.isEmpty()) {
        paramString = paramzzh.zza((zzaq)paramList.get(0));
      }
      if (paramList.size() > 1)
      {
        d1 = zzg.zza(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue());
        if (d1 >= paramzzaf.zzb()) {
          return new zzai(Double.valueOf(-1.0D));
        }
        if (d1 < 0.0D) {
          d1 = paramzzaf.zzb() + d1;
        }
      }
      paramzzh = paramzzaf.zzg();
      while (paramzzh.hasNext())
      {
        j = ((Integer)paramzzh.next()).intValue();
        d2 = j;
        if ((d2 >= d1) && (zzg.zza(paramzzaf.zza(j), paramString))) {
          return new zzai(Double.valueOf(d2));
        }
      }
      return new zzai(Double.valueOf(-1.0D));
    case 18: 
      zzg.zza("reverse", 0, paramList);
      i = paramzzaf.zzb();
      if (i != 0) {
        for (j = 0; j < i / 2; j++) {
          if (paramzzaf.zzc(j))
          {
            paramString = paramzzaf.zza(j);
            paramzzaf.zzb(j, null);
            k = i - 1 - j;
            if (paramzzaf.zzc(k)) {
              paramzzaf.zzb(j, paramzzaf.zza(k));
            }
            paramzzaf.zzb(k, paramString);
          }
        }
      }
      return paramzzaf;
    case 17: 
      return zza(paramzzaf, paramzzh, paramList, false);
    case 16: 
      zzg.zzc("slice", 2, paramList);
      if (paramList.isEmpty()) {
        return paramzzaf.zzc();
      }
      double d3 = paramzzaf.zzb();
      d1 = zzg.zza(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue());
      if (d1 < 0.0D) {
        d2 = Math.max(d1 + d3, 0.0D);
      } else {
        d2 = Math.min(d1, d3);
      }
      d1 = d3;
      if (paramList.size() == 2)
      {
        d1 = zzg.zza(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue());
        if (d1 < 0.0D) {
          d1 = Math.max(d3 + d1, 0.0D);
        } else {
          d1 = Math.min(d3, d1);
        }
      }
      paramString = new zzaf();
      for (j = (int)d2; j < d1; j++) {
        paramString.zza(paramzzaf.zza(j));
      }
      return paramString;
    case 15: 
      zzg.zza("shift", 0, paramList);
      if (paramzzaf.zzb() == 0) {
        return zzaq.zzc;
      }
      paramString = paramzzaf.zza(0);
      paramzzaf.zzb(0);
      return paramString;
    case 14: 
      zzg.zza("every", 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzar))
      {
        if ((paramzzaf.zzb() != 0) && (zza(paramzzaf, paramzzh, (zzar)paramString, Boolean.FALSE, Boolean.TRUE).zzb() != paramzzaf.zzb())) {
          return zzaq.zzi;
        }
        return zzaq.zzh;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 13: 
      zzg.zzc("sort", 1, paramList);
      if (paramzzaf.zzb() >= 2)
      {
        localObject = paramzzaf.zzi();
        if (!paramList.isEmpty())
        {
          paramString = paramzzh.zza((zzaq)paramList.get(0));
          if ((paramString instanceof zzal)) {
            paramString = (zzal)paramString;
          } else {
            throw new IllegalArgumentException("Comparator should be a method");
          }
        }
        else
        {
          paramString = null;
        }
        Collections.sort((List)localObject, new zzbh(paramString, paramzzh));
        paramzzaf.zzj();
        paramString = ((List)localObject).iterator();
        for (j = 0; paramString.hasNext(); j++) {
          paramzzaf.zzb(j, (zzaq)paramString.next());
        }
      }
      return paramzzaf;
    case 12: 
      zzg.zza("some", 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzal))
      {
        if (paramzzaf.zzb() != 0)
        {
          paramList = (zzal)paramString;
          paramString = paramzzaf.zzg();
          while (paramString.hasNext())
          {
            j = ((Integer)paramString.next()).intValue();
            if (paramzzaf.zzc(j)) {
              if (paramList.zza(paramzzh, Arrays.asList(new zzaq[] { paramzzaf.zza(j), new zzai(Double.valueOf(j)), paramzzaf })).zzd().booleanValue()) {
                return zzaq.zzh;
              }
            }
          }
        }
        return zzaq.zzi;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 11: 
      if (!paramList.isEmpty())
      {
        paramString = paramList.iterator();
        while (paramString.hasNext()) {
          paramzzaf.zza(paramzzh.zza((zzaq)paramString.next()));
        }
      }
      return new zzai(Double.valueOf(paramzzaf.zzb()));
    case 10: 
      zzg.zzc("join", 1, paramList);
      if (paramzzaf.zzb() == 0) {
        return zzaq.zzj;
      }
      if (!paramList.isEmpty())
      {
        paramString = paramzzh.zza((zzaq)paramList.get(0));
        if ((!(paramString instanceof zzao)) && (!(paramString instanceof zzax))) {
          paramString = paramString.zzf();
        } else {
          paramString = "";
        }
      }
      else
      {
        paramString = ",";
      }
      return new zzas(paramzzaf.zzb(paramString));
    case 9: 
      zzg.zza("pop", 0, paramList);
      j = paramzzaf.zzb();
      if (j == 0) {
        return zzaq.zzc;
      }
      j--;
      paramString = paramzzaf.zza(j);
      paramzzaf.zzb(j);
      return paramString;
    case 8: 
      zzg.zza("map", 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzar))
      {
        if (paramzzaf.zzb() == 0) {
          return new zzaf();
        }
        return zza(paramzzaf, paramzzh, (zzar)paramString);
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 7: 
      if (!paramList.isEmpty())
      {
        paramString = new zzaf();
        localObject = paramList.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramList = paramzzh.zza((zzaq)((Iterator)localObject).next());
          if (!(paramList instanceof zzaj)) {
            paramString.zza(paramList);
          } else {
            throw new IllegalStateException("Argument evaluation failed");
          }
        }
        j = paramString.zzb();
        paramzzh = paramzzaf.zzg();
        while (paramzzh.hasNext())
        {
          paramList = (Integer)paramzzh.next();
          paramString.zzb(paramList.intValue() + j, paramzzaf.zza(paramList.intValue()));
        }
        paramzzaf.zzj();
        paramList = paramString.zzg();
        while (paramList.hasNext())
        {
          paramzzh = (Integer)paramList.next();
          paramzzaf.zzb(paramzzh.intValue(), paramString.zza(paramzzh.intValue()));
        }
      }
      return new zzai(Double.valueOf(paramzzaf.zzb()));
    case 6: 
      zzg.zzc("lastIndexOf", 2, paramList);
      paramString = zzaq.zzc;
      if (!paramList.isEmpty()) {
        paramString = paramzzh.zza((zzaq)paramList.get(0));
      }
      d2 = paramzzaf.zzb() - 1;
      if (paramList.size() > 1)
      {
        paramzzh = paramzzh.zza((zzaq)paramList.get(1));
        if (Double.isNaN(paramzzh.zze().doubleValue())) {
          d1 = paramzzaf.zzb() - 1;
        } else {
          d1 = zzg.zza(paramzzh.zze().doubleValue());
        }
        d2 = d1;
        if (d1 < 0.0D) {
          d2 = d1 + paramzzaf.zzb();
        }
      }
      if (d2 < 0.0D) {
        return new zzai(Double.valueOf(-1.0D));
      }
      for (j = (int)Math.min(paramzzaf.zzb(), d2); j >= 0; j--) {
        if ((paramzzaf.zzc(j)) && (zzg.zza(paramzzaf.zza(j), paramString))) {
          return new zzai(Double.valueOf(j));
        }
      }
      return new zzai(Double.valueOf(-1.0D));
    case 5: 
      zzg.zza("forEach", 1, paramList);
      paramString = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramString instanceof zzar))
      {
        if (paramzzaf.zza() == 0) {
          return zzaq.zzc;
        }
        zza(paramzzaf, paramzzh, (zzar)paramString);
        return zzaq.zzc;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 4: 
      if (paramList.isEmpty()) {
        return new zzaf();
      }
      i = (int)zzg.zza(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue());
      if (i < 0)
      {
        j = Math.max(0, paramzzaf.zzb() + i);
      }
      else
      {
        j = i;
        if (i > paramzzaf.zzb()) {
          j = paramzzaf.zzb();
        }
      }
      k = paramzzaf.zzb();
      localObject = new zzaf();
      i = j;
      if (paramList.size() > 1)
      {
        int m = Math.max(0, (int)zzg.zza(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue()));
        if (m > 0) {
          for (i = j; i < Math.min(k, j + m); i++)
          {
            ((zzaf)localObject).zza(paramzzaf.zza(j));
            paramzzaf.zzb(j);
          }
        }
        if (paramList.size() > 2)
        {
          i = 2;
          while (i < paramList.size())
          {
            paramString = paramzzh.zza((zzaq)paramList.get(i));
            if (!(paramString instanceof zzaj))
            {
              paramzzaf.zza(j + i - 2, paramString);
              i++;
            }
            else
            {
              throw new IllegalArgumentException("Failed to parse elements to add");
            }
          }
        }
        return (zzaq)localObject;
      }
      while (i < k)
      {
        ((zzaf)localObject).zza(paramzzaf.zza(i));
        paramzzaf.zzb(i, null);
        i++;
      }
      return (zzaq)localObject;
    case 3: 
      return zza(paramzzaf, paramzzh, paramList, true);
    case 2: 
      zzg.zza("filter", 1, paramList);
      paramList = paramzzh.zza((zzaq)paramList.get(0));
      if ((paramList instanceof zzar))
      {
        if (paramzzaf.zza() == 0) {
          return new zzaf();
        }
        paramString = (zzaf)paramzzaf.zzc();
        paramzzh = zza(paramzzaf, paramzzh, (zzar)paramList, null, Boolean.TRUE);
        paramzzaf = new zzaf();
        paramzzh = paramzzh.zzg();
        while (paramzzh.hasNext()) {
          paramzzaf.zza(paramString.zza(((Integer)paramzzh.next()).intValue()));
        }
        return paramzzaf;
      }
      throw new IllegalArgumentException("Callback should be a method");
    case 1: 
      paramString = (zzaf)paramzzaf.zzc();
      if (!paramList.isEmpty())
      {
        paramzzaf = paramList.iterator();
        while (paramzzaf.hasNext())
        {
          paramList = paramzzh.zza((zzaq)paramzzaf.next());
          if (!(paramList instanceof zzaj))
          {
            j = paramString.zzb();
            if ((paramList instanceof zzaf))
            {
              zzaf localzzaf = (zzaf)paramList;
              paramList = localzzaf.zzg();
              while (paramList.hasNext())
              {
                localObject = (Integer)paramList.next();
                paramString.zzb(((Integer)localObject).intValue() + j, localzzaf.zza(((Integer)localObject).intValue()));
              }
            }
            paramString.zzb(j, paramList);
          }
          else
          {
            throw new IllegalStateException("Failed evaluation of arguments");
          }
        }
      }
      return paramString;
    }
    zzg.zza("toString", 0, paramList);
    return new zzas(paramzzaf.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */