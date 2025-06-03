package io.flutter.plugins.sharedpreferences;

import java.util.List;
import java.util.Map;

public abstract interface Messages$SharedPreferencesApi
{
  public abstract Boolean clear(String paramString, List<String> paramList);
  
  public abstract Map<String, Object> getAll(String paramString, List<String> paramList);
  
  public abstract Boolean remove(String paramString);
  
  public abstract Boolean setBool(String paramString, Boolean paramBoolean);
  
  public abstract Boolean setDouble(String paramString, Double paramDouble);
  
  public abstract Boolean setInt(String paramString, Long paramLong);
  
  public abstract Boolean setString(String paramString1, String paramString2);
  
  public abstract Boolean setStringList(String paramString, List<String> paramList);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */