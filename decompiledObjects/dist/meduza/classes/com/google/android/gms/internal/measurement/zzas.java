package com.google.android.gms.internal.measurement;

import a0.j;
import g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzas
  implements zzaq, Iterable<zzaq>
{
  private final String zza;
  
  public zzas(String paramString)
  {
    if (paramString != null)
    {
      zza = paramString;
      return;
    }
    throw new IllegalArgumentException("StringValue cannot be null.");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzas)) {
      return false;
    }
    paramObject = (zzas)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final Iterator<zzaq> iterator()
  {
    return new zzau(this);
  }
  
  public final String toString()
  {
    return j.j("\"", zza, "\"");
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    int i;
    if ((!"charAt".equals(paramString)) && (!"concat".equals(paramString)) && (!"hasOwnProperty".equals(paramString)) && (!"indexOf".equals(paramString)) && (!"lastIndexOf".equals(paramString)) && (!"match".equals(paramString)) && (!"replace".equals(paramString)) && (!"search".equals(paramString)) && (!"slice".equals(paramString)) && (!"split".equals(paramString)) && (!"substring".equals(paramString)) && (!"toLowerCase".equals(paramString)) && (!"toLocaleLowerCase".equals(paramString)) && (!"toString".equals(paramString)) && (!"toUpperCase".equals(paramString)) && (!"toLocaleUpperCase".equals(paramString)) && (!"trim".equals(paramString))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      paramString.getClass();
      int j = paramString.hashCode();
      i = -1;
      switch (j)
      {
      default: 
      case 1943291465: 
      case 1094496948: 
      case 530542161: 
      case 109648666: 
      case 109526418: 
      case 103668165: 
      case 3568674: 
      case -399551817: 
      case -467511597: 
      case -726908483: 
      case -906336856: 
      case -1137582698: 
      case -1354795244: 
      case -1361633751: 
      case -1464939364: 
      case -1776922004: 
        for (;;)
        {
          break;
          if (paramString.equals("indexOf"))
          {
            i = 16;
            if (paramString.equals("replace"))
            {
              i = 15;
              if (paramString.equals("substring"))
              {
                i = 14;
                if (paramString.equals("split"))
                {
                  i = 13;
                  if (paramString.equals("slice"))
                  {
                    i = 12;
                    if (paramString.equals("match"))
                    {
                      i = 11;
                      if (paramString.equals("trim"))
                      {
                        i = 10;
                        if (paramString.equals("toUpperCase"))
                        {
                          i = 9;
                          if (paramString.equals("lastIndexOf"))
                          {
                            i = 8;
                            if (paramString.equals("toLocaleUpperCase"))
                            {
                              i = 7;
                              if (paramString.equals("search"))
                              {
                                i = 6;
                                if (paramString.equals("toLowerCase"))
                                {
                                  i = 5;
                                  if (paramString.equals("concat"))
                                  {
                                    i = 4;
                                    continue;
                                    if (paramString.equals("charAt"))
                                    {
                                      i = 3;
                                      break;
                                      if (!paramString.equals("toLocaleLowerCase")) {}
                                    }
                                    else
                                    {
                                      i = 2;
                                      break;
                                      if (!paramString.equals("toString")) {
                                        break;
                                      }
                                    }
                                    i = 1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        break;
      case -1789698943: 
        if (paramString.equals("hasOwnProperty")) {
          i = 0;
        }
        break;
      }
      double d = 0.0D;
      Object localObject;
      String str;
      switch (i)
      {
      default: 
        throw new IllegalArgumentException("Command not supported");
      case 16: 
        zzg.zzc("indexOf", 2, paramList);
        localObject = zza;
        if (paramList.size() <= 0) {
          paramString = zzaq.zzc.zzf();
        } else {
          paramString = paramzzh.zza((zzaq)paramList.get(0)).zzf();
        }
        if (paramList.size() >= 2) {
          d = paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue();
        }
        return new zzai(Double.valueOf(((String)localObject).indexOf(paramString, (int)zzg.zza(d))));
      case 15: 
        zzg.zzc("replace", 2, paramList);
        zzaq localzzaq = zzaq.zzc;
        localObject = localzzaq.zzf();
        paramString = localzzaq;
        if (!paramList.isEmpty())
        {
          str = paramzzh.zza((zzaq)paramList.get(0)).zzf();
          paramString = localzzaq;
          localObject = str;
          if (paramList.size() > 1)
          {
            paramString = paramzzh.zza((zzaq)paramList.get(1));
            localObject = str;
          }
        }
        str = zza;
        i = str.indexOf((String)localObject);
        if (i < 0) {
          return this;
        }
        paramList = paramString;
        if ((paramString instanceof zzal)) {
          paramList = ((zzal)paramString).zza(paramzzh, Arrays.asList(new zzaq[] { new zzas((String)localObject), new zzai(Double.valueOf(i)), this }));
        }
        return new zzas(g.e(str.substring(0, i), paramList.zzf(), str.substring(((String)localObject).length() + i)));
      case 14: 
        zzg.zzc("substring", 2, paramList);
        paramString = zza;
        if (!paramList.isEmpty()) {
          i = (int)zzg.zza(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue());
        } else {
          i = 0;
        }
        if (paramList.size() > 1) {
          j = (int)zzg.zza(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue());
        } else {
          j = paramString.length();
        }
        i = Math.min(Math.max(i, 0), paramString.length());
        j = Math.min(Math.max(j, 0), paramString.length());
        return new zzas(paramString.substring(Math.min(i, j), Math.max(i, j)));
      case 13: 
        zzg.zzc("split", 2, paramList);
        str = zza;
        if (str.length() == 0) {
          return new zzaf(new zzaq[] { this });
        }
        paramString = new ArrayList();
        if (paramList.isEmpty())
        {
          paramString.add(this);
        }
        else
        {
          localObject = paramzzh.zza((zzaq)paramList.get(0)).zzf();
          long l = 2147483647L;
          if (paramList.size() > 1) {
            l = zzg.zzc(paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue());
          }
          if (l == 0L) {
            return new zzaf();
          }
          paramzzh = str.split(Pattern.quote((String)localObject), (int)l + 1);
          j = paramzzh.length;
          if ((((String)localObject).isEmpty()) && (paramzzh.length > 0))
          {
            k = paramzzh[0].isEmpty();
            i = k;
            if (paramzzh[(paramzzh.length - 1)].isEmpty())
            {
              j = paramzzh.length - 1;
              i = k;
            }
          }
          else
          {
            i = 0;
          }
          int n = i;
          int k = j;
          int m;
          if (paramzzh.length > l) {
            m = j - 1;
          }
          for (n = i; n < m; n++) {
            paramString.add(new zzas(paramzzh[n]));
          }
        }
        return new zzaf(paramString);
      case 12: 
        zzg.zzc("slice", 2, paramList);
        paramString = zza;
        if (!paramList.isEmpty()) {
          d = paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue();
        } else {
          d = 0.0D;
        }
        d = zzg.zza(d);
        if (d < 0.0D) {
          d = Math.max(paramString.length() + d, 0.0D);
        } else {
          d = Math.min(d, paramString.length());
        }
        i = (int)d;
        if (paramList.size() > 1) {
          d = paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue();
        } else {
          d = paramString.length();
        }
        d = zzg.zza(d);
        if (d < 0.0D) {
          d = Math.max(paramString.length() + d, 0.0D);
        } else {
          d = Math.min(d, paramString.length());
        }
        return new zzas(paramString.substring(i, Math.max(0, (int)d - i) + i));
      case 11: 
        zzg.zzc("match", 1, paramList);
        localObject = zza;
        if (paramList.size() <= 0) {
          paramString = "";
        } else {
          paramString = paramzzh.zza((zzaq)paramList.get(0)).zzf();
        }
        paramString = Pattern.compile(paramString).matcher((CharSequence)localObject);
        if (paramString.find()) {
          return new zzaf(new zzaq[] { new zzas(paramString.group()) });
        }
        return zzaq.zzd;
      case 10: 
        zzg.zza("toUpperCase", 0, paramList);
        return new zzas(zza.trim());
      case 9: 
        zzg.zza("toUpperCase", 0, paramList);
        return new zzas(zza.toUpperCase(Locale.ENGLISH));
      case 8: 
        zzg.zzc("lastIndexOf", 2, paramList);
        localObject = zza;
        if (paramList.size() <= 0) {
          paramString = zzaq.zzc;
        } else {
          paramString = paramzzh.zza((zzaq)paramList.get(0));
        }
        paramString = paramString.zzf();
        if (paramList.size() < 2) {
          d = NaN.0D;
        } else {
          d = paramzzh.zza((zzaq)paramList.get(1)).zze().doubleValue();
        }
        if (Double.isNaN(d)) {
          d = Double.POSITIVE_INFINITY;
        } else {
          d = zzg.zza(d);
        }
        return new zzai(Double.valueOf(((String)localObject).lastIndexOf(paramString, (int)d)));
      case 7: 
        zzg.zza("toLocaleUpperCase", 0, paramList);
        return new zzas(zza.toUpperCase());
      case 6: 
        zzg.zzc("search", 1, paramList);
        if (!paramList.isEmpty()) {
          paramString = paramzzh.zza((zzaq)paramList.get(0));
        } else {
          paramString = zzaq.zzc;
        }
        paramzzh = paramString.zzf();
        paramString = zza;
        paramString = Pattern.compile(paramzzh).matcher(paramString);
        if (paramString.find()) {
          return new zzai(Double.valueOf(paramString.start()));
        }
        return new zzai(Double.valueOf(-1.0D));
      case 5: 
        zzg.zza("toLowerCase", 0, paramList);
        return new zzas(zza.toLowerCase(Locale.ENGLISH));
      case 4: 
        if (paramList.isEmpty()) {
          return this;
        }
        paramString = new StringBuilder(zza);
        for (i = 0; i < paramList.size(); i++) {
          paramString.append(paramzzh.zza((zzaq)paramList.get(i)).zzf());
        }
        return new zzas(paramString.toString());
      case 3: 
        zzg.zzc("charAt", 1, paramList);
        if (!paramList.isEmpty()) {
          i = (int)zzg.zza(paramzzh.zza((zzaq)paramList.get(0)).zze().doubleValue());
        } else {
          i = 0;
        }
        paramString = zza;
        if ((i >= 0) && (i < paramString.length())) {
          return new zzas(String.valueOf(paramString.charAt(i)));
        }
        return zzaq.zzj;
      case 2: 
        zzg.zza("toLocaleLowerCase", 0, paramList);
        return new zzas(zza.toLowerCase());
      case 1: 
        zzg.zza("toString", 0, paramList);
        return this;
      }
      zzg.zza("hasOwnProperty", 1, paramList);
      paramString = zza;
      paramzzh = paramzzh.zza((zzaq)paramList.get(0));
      if ("length".equals(paramzzh.zzf())) {
        return zzaq.zzh;
      }
      d = paramzzh.zze().doubleValue();
      if (d == Math.floor(d))
      {
        i = (int)d;
        if ((i >= 0) && (i < paramString.length())) {
          return zzaq.zzh;
        }
      }
      return zzaq.zzi;
    }
    throw new IllegalArgumentException(String.format("%s is not a String function", new Object[] { paramString }));
  }
  
  public final zzaq zzc()
  {
    return new zzas(zza);
  }
  
  public final Boolean zzd()
  {
    return Boolean.valueOf(zza.isEmpty() ^ true);
  }
  
  public final Double zze()
  {
    double d;
    if (zza.isEmpty()) {
      d = 0.0D;
    }
    for (;;)
    {
      return Double.valueOf(d);
      try
      {
        Double localDouble = Double.valueOf(zza);
        return localDouble;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        d = NaN.0D;
      }
    }
  }
  
  public final String zzf()
  {
    return zza;
  }
  
  public final Iterator<zzaq> zzh()
  {
    return new zzav(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */