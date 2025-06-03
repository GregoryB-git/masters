package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface DeferredDeeplinkListener
{
  public abstract void onDeeplinkLoaded(@NonNull String paramString);
  
  public abstract void onError(@NonNull Error paramError, @Nullable String paramString);
  
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
 * Qualified Name:     com.yandex.metrica.DeferredDeeplinkListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */