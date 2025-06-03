package com.google.android.gms.internal.firebase_auth_api;

import f;
import g;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzae
{
  private static String zza(Object paramObject)
  {
    if (paramObject == null) {
      return "null";
    }
    try
    {
      String str1 = paramObject.toString();
      return str1;
    }
    catch (Exception localException)
    {
      paramObject = g.e(paramObject.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(paramObject)));
      Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", f.j("Exception during lenientFormat for ", (String)paramObject), localException);
      String str2 = localException.getClass().getName();
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append((String)paramObject);
      localStringBuilder.append(" threw ");
      localStringBuilder.append(str2);
      localStringBuilder.append(">");
      return localStringBuilder.toString();
    }
  }
  
  public static String zza(String paramString)
  {
    return zzr.zzb(paramString);
  }
  
  public static String zza(String paramString, Object... paramVarArgs)
  {
    String str = String.valueOf(paramString);
    int i = 0;
    for (int j = 0; j < paramVarArgs.length; j++) {
      paramVarArgs[j] = zza(paramVarArgs[j]);
    }
    j = str.length();
    paramString = new StringBuilder(paramVarArgs.length * 16 + j);
    int k = 0;
    for (j = i; j < paramVarArgs.length; j++)
    {
      i = str.indexOf("%s", k);
      if (i == -1) {
        break;
      }
      paramString.append(str, k, i);
      paramString.append(paramVarArgs[j]);
      k = i + 2;
    }
    paramString.append(str, k, str.length());
    if (j < paramVarArgs.length)
    {
      paramString.append(" [");
      k = j + 1;
      paramString.append(paramVarArgs[j]);
      for (j = k; j < paramVarArgs.length; j++)
      {
        paramString.append(", ");
        paramString.append(paramVarArgs[j]);
      }
      paramString.append(']');
    }
    return paramString.toString();
  }
  
  public static String zzb(String paramString)
  {
    return zzr.zzc(paramString);
  }
  
  public static boolean zzc(String paramString)
  {
    return zzr.zzd(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */