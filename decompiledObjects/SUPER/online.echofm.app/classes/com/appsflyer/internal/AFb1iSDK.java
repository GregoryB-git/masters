package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface AFb1iSDK
{
  @NotNull
  public static final AFa1vSDK valueOf = AFa1vSDK.AFInAppEventType;
  
  public abstract void AFInAppEventType(@NotNull Context paramContext);
  
  public abstract boolean AFInAppEventType();
  
  public abstract void AFKeystoreWrapper(@NotNull Context paramContext, @NotNull AFa1wSDK paramAFa1wSDK);
  
  @Metadata
  public static final class AFa1vSDK
  {
    private static long values = 500L;
    
    public static long AFInAppEventType()
    {
      return values;
    }
  }
  
  @Metadata
  public static abstract interface AFa1wSDK
  {
    public abstract void AFInAppEventType(@NotNull Context paramContext);
    
    public abstract void values(@NotNull Activity paramActivity);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1iSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */