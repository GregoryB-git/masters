package com.yandex.metrica;

public enum DeferredDeeplinkParametersListener$Error
{
  private final String mDescription;
  
  static
  {
    NO_REFERRER = new Error("NO_REFERRER", 2, "No referrer was found");
    UNKNOWN = new Error("UNKNOWN", 3, "Unknown error");
  }
  
  private DeferredDeeplinkParametersListener$Error(String paramString)
  {
    mDescription = paramString;
  }
  
  public String getDescription()
  {
    return mDescription;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.DeferredDeeplinkParametersListener.Error
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */