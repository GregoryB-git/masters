package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;

public abstract interface PurchaseHandler$PurchaseValidationCallback
{
  public abstract void onFailure(@NonNull Throwable paramThrowable);
  
  public abstract void onResponse(@NonNull ResponseNetwork<String> paramResponseNetwork);
}

/* Location:
 * Qualified Name:     com.appsflyer.PurchaseHandler.PurchaseValidationCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */