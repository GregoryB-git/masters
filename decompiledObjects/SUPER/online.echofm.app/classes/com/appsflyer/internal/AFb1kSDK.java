package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFb1kSDK
  implements AFb1iSDK
{
  @NotNull
  private final Executor AFInAppEventParameterName;
  @NotNull
  private final AFf1vSDK AFInAppEventType;
  private AFb1jSDK AFKeystoreWrapper;
  @NotNull
  private final AFb1sSDK values;
  
  public AFb1kSDK(@NotNull Executor paramExecutor, @NotNull AFb1sSDK paramAFb1sSDK, @NotNull AFf1vSDK paramAFf1vSDK)
  {
    AFInAppEventParameterName = paramExecutor;
    values = paramAFb1sSDK;
    AFInAppEventType = paramAFf1vSDK;
  }
  
  public final void AFInAppEventType(@NotNull Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "");
    Object localObject = AFKeystoreWrapper;
    if (localObject != null)
    {
      localObject = AFInAppEventParameterName;
      if (localObject != null) {
        ((AFb1iSDK.AFa1wSDK)localObject).AFInAppEventType(paramContext);
      }
    }
  }
  
  public final boolean AFInAppEventType()
  {
    return AFKeystoreWrapper != null;
  }
  
  public final void AFKeystoreWrapper(@NotNull Context paramContext, @NotNull AFb1iSDK.AFa1wSDK paramAFa1wSDK)
  {
    Intrinsics.checkNotNullParameter(paramContext, "");
    Intrinsics.checkNotNullParameter(paramAFa1wSDK, "");
    Intrinsics.checkNotNullParameter(paramContext, "");
    if (AFKeystoreWrapper != null)
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null) {
        ((Application)localContext).unregisterActivityLifecycleCallbacks(AFKeystoreWrapper);
      } else {
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
      }
    }
    AFKeystoreWrapper = null;
    paramAFa1wSDK = new AFb1jSDK(AFInAppEventParameterName, values, AFInAppEventType, paramAFa1wSDK);
    AFKeystoreWrapper = paramAFa1wSDK;
    if ((paramContext instanceof Activity)) {
      paramAFa1wSDK.onActivityResumed((Activity)paramContext);
    }
    paramContext = paramContext.getApplicationContext();
    if (paramContext != null)
    {
      ((Application)paramContext).registerActivityLifecycleCallbacks(AFKeystoreWrapper);
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1kSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */