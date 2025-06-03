package e7;

import com.google.android.gms.internal.measurement.zzfw.zzd;
import com.google.android.gms.internal.measurement.zzfw.zzd.zza;
import com.google.android.gms.internal.measurement.zzfw.zzf;
import com.google.android.gms.internal.measurement.zzfw.zzf.zza;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import m6.j;

public abstract class b
{
  public String a;
  public int b;
  public Boolean c;
  public Boolean d;
  public Long e;
  public Long f;
  
  public b(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public static Boolean b(Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null) {
      return null;
    }
    if (paramBoolean.booleanValue() != paramBoolean1) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    return Boolean.valueOf(paramBoolean1);
  }
  
  public static Boolean c(String paramString, zzfw.zzf paramzzf, a1 parama1)
  {
    j.i(paramzzf);
    Object localObject1 = null;
    if (paramString == null) {
      return null;
    }
    Object localObject2 = localObject1;
    if (paramzzf.zzj()) {
      if (paramzzf.zzb() == zzfw.zzf.zza.zza)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = paramzzf.zzb();
        Object localObject3 = zzfw.zzf.zza.zzg;
        if (localObject2 == localObject3)
        {
          if (paramzzf.zza() == 0) {
            return null;
          }
        }
        else if (!paramzzf.zzi()) {
          return null;
        }
        zzfw.zzf.zza localzza1 = paramzzf.zzb();
        boolean bool = paramzzf.zzg();
        if ((!bool) && (localzza1 != zzfw.zzf.zza.zzb) && (localzza1 != localObject3)) {
          localObject3 = paramzzf.zze().toUpperCase(Locale.ENGLISH);
        } else {
          localObject3 = paramzzf.zze();
        }
        if (paramzzf.zza() == 0)
        {
          paramzzf = null;
        }
        else
        {
          paramzzf = paramzzf.zzf();
          if (!bool)
          {
            localObject2 = new ArrayList(paramzzf.size());
            paramzzf = paramzzf.iterator();
            while (paramzzf.hasNext()) {
              ((ArrayList)localObject2).add(((String)paramzzf.next()).toUpperCase(Locale.ENGLISH));
            }
            paramzzf = Collections.unmodifiableList((List)localObject2);
          }
        }
        zzfw.zzf.zza localzza2 = zzfw.zzf.zza.zzb;
        Object localObject4;
        if (localzza1 == localzza2) {
          localObject4 = localObject3;
        } else {
          localObject4 = null;
        }
        if (localzza1 == zzfw.zzf.zza.zzg)
        {
          localObject2 = localObject1;
          if (paramzzf == null) {
            break label511;
          }
          if (paramzzf.isEmpty())
          {
            localObject2 = localObject1;
            break label511;
          }
        }
        else if (localObject3 == null)
        {
          localObject2 = localObject1;
          break label511;
        }
        localObject2 = paramString;
        if (!bool) {
          if (localzza1 == localzza2) {
            localObject2 = paramString;
          } else {
            localObject2 = paramString.toUpperCase(Locale.ENGLISH);
          }
        }
        switch (x6.a[localzza1.ordinal()])
        {
        default: 
          localObject2 = localObject1;
          break;
        case 6: 
          if (paramzzf == null)
          {
            localObject2 = localObject1;
            break label511;
          }
          bool = paramzzf.contains(localObject2);
          break;
        case 5: 
          bool = ((String)localObject2).equals(localObject3);
          break;
        case 4: 
          bool = ((String)localObject2).contains((CharSequence)localObject3);
          break;
        case 3: 
          bool = ((String)localObject2).endsWith((String)localObject3);
          break;
        case 2: 
          bool = ((String)localObject2).startsWith((String)localObject3);
          localObject2 = Boolean.valueOf(bool);
          break;
        }
        if (localObject4 == null)
        {
          localObject2 = localObject1;
        }
        else
        {
          int i;
          if (bool) {
            i = 0;
          } else {
            i = 66;
          }
          try
          {
            localObject2 = Boolean.valueOf(Pattern.compile((String)localObject4, i).matcher((CharSequence)localObject2).matches());
          }
          catch (PatternSyntaxException paramString)
          {
            localObject2 = localObject1;
            if (parama1 != null)
            {
              r.c("Invalid regular expression in REGEXP audience filter. expression", localObject4);
              localObject2 = localObject1;
            }
          }
        }
      }
    }
    label511:
    return (Boolean)localObject2;
  }
  
  public static Boolean d(BigDecimal paramBigDecimal, zzfw.zzd paramzzd, double paramDouble)
  {
    j.i(paramzzd);
    Object localObject;
    zzfw.zzd.zza localzza1;
    zzfw.zzd.zza localzza2;
    if ((paramzzd.zzh()) && (paramzzd.zza() != zzfw.zzd.zza.zza))
    {
      localObject = paramzzd.zza();
      localzza1 = zzfw.zzd.zza.zze;
      if (localObject == localzza1)
      {
        if ((!paramzzd.zzl()) || (!paramzzd.zzk())) {
          return null;
        }
      }
      else if (!paramzzd.zzi()) {
        return null;
      }
      localzza2 = paramzzd.zza();
      if ((paramzzd.zza() == localzza1) && ((!o6.U(paramzzd.zzf())) || (!o6.U(paramzzd.zze())))) {}
    }
    try
    {
      localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramzzd.zzf());
      paramzzd = new BigDecimal(paramzzd.zze());
      localObject = null;
    }
    catch (NumberFormatException paramBigDecimal)
    {
      BigDecimal localBigDecimal;
      for (;;) {}
    }
    return null;
    if (!o6.U(paramzzd.zzd())) {
      return null;
    }
    try
    {
      localObject = new BigDecimal(paramzzd.zzd());
      localBigDecimal = null;
      paramzzd = localBigDecimal;
      if (localzza2 == localzza1)
      {
        if (localBigDecimal == null) {
          return null;
        }
      }
      else {
        if (localObject == null) {
          break label445;
        }
      }
      int i = x6.b[localzza2.ordinal()];
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              if (localBigDecimal == null) {
                return null;
              }
              bool2 = bool5;
              if (paramBigDecimal.compareTo(localBigDecimal) >= 0)
              {
                bool2 = bool5;
                if (paramBigDecimal.compareTo(paramzzd) <= 0) {
                  bool2 = true;
                }
              }
              return Boolean.valueOf(bool2);
            }
          }
          else if (localObject != null)
          {
            if (paramDouble != 0.0D)
            {
              bool2 = bool1;
              if (paramBigDecimal.compareTo(((BigDecimal)localObject).subtract(new BigDecimal(paramDouble).multiply(new BigDecimal(2)))) > 0)
              {
                bool2 = bool1;
                if (paramBigDecimal.compareTo(((BigDecimal)localObject).add(new BigDecimal(paramDouble).multiply(new BigDecimal(2)))) < 0) {
                  bool2 = true;
                }
              }
              return Boolean.valueOf(bool2);
            }
            if (paramBigDecimal.compareTo((BigDecimal)localObject) == 0) {
              bool2 = true;
            }
            return Boolean.valueOf(bool2);
          }
        }
        else if (localObject != null)
        {
          bool2 = bool3;
          if (paramBigDecimal.compareTo((BigDecimal)localObject) > 0) {
            bool2 = true;
          }
          return Boolean.valueOf(bool2);
        }
      }
      else if (localObject != null)
      {
        bool2 = bool4;
        if (paramBigDecimal.compareTo((BigDecimal)localObject) < 0) {
          bool2 = true;
        }
        return Boolean.valueOf(bool2);
      }
    }
    catch (NumberFormatException paramBigDecimal)
    {
      label445:
      for (;;) {}
    }
    return null;
  }
  
  public abstract int a();
  
  public abstract boolean e();
  
  public abstract boolean f();
}

/* Location:
 * Qualified Name:     e7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */