package io.flutter.plugins.sharedpreferences;

import java.util.List;

public abstract interface SharedPreferencesListEncoder
{
  public abstract List<String> decode(String paramString);
  
  public abstract String encode(List<String> paramList);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */