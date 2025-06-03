package com.google.android.gms.internal.common;

import java.lang.reflect.Method;

public final class zzl
{
  public static Object zza(Class paramClass, String paramString, zzj... paramVarArgs)
  {
    return zzc(paramClass, "isIsolated", null, false, paramVarArgs);
  }
  
  public static Object zzb(String paramString1, String paramString2, ClassLoader paramClassLoader, zzj... paramVarArgs)
  {
    return zzc(paramClassLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, paramVarArgs);
  }
  
  private static Object zzc(Class paramClass, String paramString, Object paramObject, boolean paramBoolean, zzj... paramVarArgs)
  {
    int i = paramVarArgs.length;
    Class[] arrayOfClass = new Class[i];
    Object[] arrayOfObject = new Object[i];
    for (i = 0; i < paramVarArgs.length; i++)
    {
      paramObject = paramVarArgs[i];
      paramObject.getClass();
      arrayOfClass[i] = ((zzj)paramObject).zzc();
      arrayOfObject[i] = paramVarArgs[i].zzd();
    }
    return paramClass.getDeclaredMethod(paramString, arrayOfClass).invoke(null, arrayOfObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */