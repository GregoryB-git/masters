package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface AppMetricaDeviceIDListener
{
  public abstract void onError(@NonNull Reason paramReason);
  
  public abstract void onLoaded(@Nullable String paramString);
  
  public static enum Reason
  {
    static
    {
      NETWORK = new Reason("NETWORK", 1);
      INVALID_RESPONSE = new Reason("INVALID_RESPONSE", 2);
    }
    
    private Reason() {}
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.AppMetricaDeviceIDListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */