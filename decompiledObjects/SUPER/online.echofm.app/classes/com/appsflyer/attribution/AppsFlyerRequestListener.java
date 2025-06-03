package com.appsflyer.attribution;

import androidx.annotation.NonNull;

public abstract interface AppsFlyerRequestListener
{
  public abstract void onError(int paramInt, @NonNull String paramString);
  
  public abstract void onSuccess();
}

/* Location:
 * Qualified Name:     com.appsflyer.attribution.AppsFlyerRequestListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */