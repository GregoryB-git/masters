package com.yandex.metrica;

import androidx.annotation.NonNull;
import java.util.Map;

public abstract interface DeferredDeeplinkParametersListener
{
  public abstract void onError(@NonNull Error paramError, @NonNull String paramString);
  
  public abstract void onParametersLoaded(@NonNull Map<String, String> paramMap);
  
  public static enum Error
  {
    private final String mDescription;
    
    static
    {
      NO_REFERRER = new Error("NO_REFERRER", 2, "No referrer was found");
      UNKNOWN = new Error("UNKNOWN", 3, "Unknown error");
    }
    
    private Error(String paramString)
    {
      mDescription = paramString;
    }
    
    public String getDescription()
    {
      return mDescription;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.DeferredDeeplinkParametersListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */