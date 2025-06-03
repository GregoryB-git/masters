package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import f;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class zzanp
{
  private static final ThreadLocal<SimpleDateFormat> zza;
  
  static
  {
    zzamt localzzamt = (zzamt)zzamt.zzc().zza(-62135596800L).zza(0).zze();
    localzzamt = (zzamt)zzamt.zzc().zza(253402300799L).zza(999999999).zze();
    localzzamt = (zzamt)zzamt.zzc().zza(0L).zza(0).zze();
    zza = new zzano();
    zzc("now");
    zzc("getEpochSecond");
    zzc("getNano");
  }
  
  public static long zza(com.google.android.gms.internal.firebase-auth-api.zzamt paramzzamt)
  {
    return zzb(paramzzamt).zzb();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzamt zza(String paramString)
  {
    int i = paramString.indexOf('T');
    if (i != -1)
    {
      int j = paramString.indexOf('Z', i);
      int k = j;
      if (j == -1) {
        k = paramString.indexOf('+', i);
      }
      int m = k;
      if (k == -1) {
        m = paramString.indexOf('-', i);
      }
      if (m != -1)
      {
        Object localObject = paramString.substring(0, m);
        k = ((String)localObject).indexOf('.');
        String str2;
        if (k != -1)
        {
          String str1 = ((String)localObject).substring(0, k);
          str2 = ((String)localObject).substring(k + 1);
          localObject = str1;
        }
        else
        {
          str2 = "";
        }
        long l1 = ((SimpleDateFormat)zza.get()).parse((String)localObject).getTime() / 1000L;
        if (str2.isEmpty())
        {
          k = 0;
        }
        else
        {
          i = 0;
          for (j = i;; j = k)
          {
            k = j;
            if (i >= 9) {
              break;
            }
            j *= 10;
            k = j;
            if (i < str2.length()) {
              if ((str2.charAt(i) >= '0') && (str2.charAt(i) <= '9')) {
                k = str2.charAt(i) - '0' + j;
              } else {
                throw new ParseException("Invalid nanoseconds.", 0);
              }
            }
            i++;
          }
        }
        long l2;
        if (paramString.charAt(m) == 'Z')
        {
          if (paramString.length() != m + 1) {
            throw new ParseException(j.j("Failed to parse timestamp: invalid trailing data \"", paramString.substring(m), "\""), 0);
          }
        }
        else
        {
          l2 = zzb(paramString.substring(m + 1));
          if (paramString.charAt(m) == '+') {
            l1 -= l2;
          } else {
            l1 += l2;
          }
        }
        try
        {
          if (zza(l1))
          {
            if (k > -1000000000)
            {
              j = k;
              l2 = l1;
              if (k < 1000000000) {}
            }
            else
            {
              l2 = zzbc.zza(l1, k / 1000000000);
              j = k % 1000000000;
            }
            k = j;
            l1 = l2;
            if (j < 0)
            {
              k = j + 1000000000;
              l1 = zzbc.zzb(l2, 1L);
            }
            return zzb((zzamt)zzamt.zzc().zza(l1).zza(k).zze());
          }
          localObject = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject).<init>(zzae.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[] { Long.valueOf(l1) }));
          throw ((Throwable)localObject);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          paramString = new ParseException(j.j("Failed to parse timestamp ", paramString, " Timestamp is out of range."), 0);
          paramString.initCause(localIllegalArgumentException);
          throw paramString;
        }
      }
      throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
    }
    throw new ParseException(j.j("Failed to parse timestamp: invalid timestamp \"", paramString, "\""), 0);
  }
  
  private static boolean zza(long paramLong)
  {
    return (paramLong >= -62135596800L) && (paramLong <= 253402300799L);
  }
  
  private static long zzb(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i != -1)
    {
      String str1 = paramString.substring(0, i);
      String str2 = paramString.substring(i + 1);
      try
      {
        long l1 = Long.parseLong(str1);
        long l2 = Long.parseLong(str2);
        return (l1 * 60L + l2) * 60L;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        paramString = new ParseException(f.j("Invalid offset value: ", paramString), 0);
        paramString.initCause(localNumberFormatException);
        throw paramString;
      }
    }
    throw new ParseException(f.j("Invalid offset value: ", paramString), 0);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzamt zzb(com.google.android.gms.internal.firebase-auth-api.zzamt paramzzamt)
  {
    long l = paramzzamt.zzb();
    int i = paramzzamt.zza();
    if (!zza(l)) {}
    while ((i < 0) || (i >= 1000000000))
    {
      j = 0;
      break;
    }
    int j = 1;
    if (j != 0) {
      return paramzzamt;
    }
    throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[] { Long.valueOf(l), Integer.valueOf(i) }));
  }
  
  private static Method zzc(String paramString)
  {
    try
    {
      paramString = Class.forName("java.time.Instant").getMethod(paramString, new Class[0]);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzanp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */