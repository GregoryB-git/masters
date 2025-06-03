package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

public final class AFf1cSDK
{
  public String AFInAppEventType;
  public final WeakReference<Context> AFKeystoreWrapper;
  
  public AFf1cSDK(@NonNull Context paramContext)
  {
    AFKeystoreWrapper = new WeakReference(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1cSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */