package io.flutter.plugins.sharedpreferences;

public final class SharedPreferencesError
  extends Throwable
{
  private final String code;
  private final Object details;
  private final String message;
  
  public SharedPreferencesError(String paramString1, String paramString2, Object paramObject)
  {
    code = paramString1;
    message = paramString2;
    details = paramObject;
  }
  
  public final String getCode()
  {
    return code;
  }
  
  public final Object getDetails()
  {
    return details;
  }
  
  public String getMessage()
  {
    return message;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesError
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */