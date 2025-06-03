package com.appsflyer.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appsflyer.AFLogger;

public final class AFb1cSDK
  implements AFb1dSDK
{
  private final SharedPreferences values;
  
  public AFb1cSDK(SharedPreferences paramSharedPreferences)
  {
    values = paramSharedPreferences;
  }
  
  public final void AFInAppEventParameterName(String paramString, long paramLong)
  {
    values.edit().putLong(paramString, paramLong).apply();
  }
  
  public final void AFInAppEventParameterName(String paramString1, String paramString2)
  {
    values.edit().putString(paramString1, paramString2).apply();
  }
  
  public final void AFInAppEventType(String paramString)
  {
    values.edit().remove(paramString).apply();
  }
  
  public final void AFInAppEventType(String paramString, int paramInt)
  {
    values.edit().putInt(paramString, paramInt).apply();
  }
  
  public final long valueOf(String paramString, long paramLong)
  {
    try
    {
      long l = values.getLong(paramString, paramLong);
      return l;
    }
    catch (ClassCastException localClassCastException)
    {
      AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(paramString)), localClassCastException);
    }
    return paramLong;
  }
  
  public final boolean valueOf(String paramString)
  {
    try
    {
      boolean bool = values.getBoolean(paramString, false);
      return bool;
    }
    catch (ClassCastException localClassCastException)
    {
      AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(paramString)), localClassCastException);
    }
    return false;
  }
  
  public final int values(String paramString, int paramInt)
  {
    try
    {
      int i = values.getInt(paramString, paramInt);
      return i;
    }
    catch (ClassCastException localClassCastException)
    {
      AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(paramString)), localClassCastException);
    }
    return paramInt;
  }
  
  public final String values(String paramString1, String paramString2)
  {
    try
    {
      String str = values.getString(paramString1, paramString2);
      return str;
    }
    catch (ClassCastException localClassCastException)
    {
      AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(paramString1)), localClassCastException);
    }
    return paramString2;
  }
  
  public final void values(String paramString, boolean paramBoolean)
  {
    values.edit().putBoolean(paramString, paramBoolean).apply();
  }
  
  public final boolean values(String paramString)
  {
    return values.contains(paramString);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1cSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */