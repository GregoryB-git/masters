package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class AFb1jSDK
  implements Application.ActivityLifecycleCallbacks
{
  @NotNull
  final AFb1iSDK.AFa1wSDK AFInAppEventParameterName;
  @NotNull
  private final AFf1vSDK AFInAppEventType;
  boolean AFKeystoreWrapper;
  private boolean afErrorLog;
  @NotNull
  private final AFb1sSDK valueOf;
  @NotNull
  private final Executor values;
  
  public AFb1jSDK(@NotNull Executor paramExecutor, @NotNull AFb1sSDK paramAFb1sSDK, @NotNull AFf1vSDK paramAFf1vSDK, @NotNull AFb1iSDK.AFa1wSDK paramAFa1wSDK)
  {
    values = paramExecutor;
    valueOf = paramAFb1sSDK;
    AFInAppEventType = paramAFf1vSDK;
    AFInAppEventParameterName = paramAFa1wSDK;
  }
  
  private static final void AFInAppEventParameterName(AFb1jSDK paramAFb1jSDK, Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramAFb1jSDK, "");
    Intrinsics.checkNotNullParameter(paramActivity, "");
    if (!AFKeystoreWrapper) {
      try
      {
        AFInAppEventParameterName.values(paramActivity);
      }
      catch (Exception paramActivity)
      {
        AFLogger.afErrorLog("Listener thrown an exception: ", paramActivity, true);
      }
    }
    afErrorLog = false;
    AFKeystoreWrapper = true;
  }
  
  private static final void valueOf(AFb1jSDK paramAFb1jSDK, Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramAFb1jSDK, "");
    Intrinsics.checkNotNullParameter(paramActivity, "");
    Object localObject = valueOf;
    Intent localIntent = paramActivity.getIntent();
    if ((localIntent != null) && ("android.intent.action.VIEW".equals(localIntent.getAction()))) {
      localObject = localIntent.getData();
    } else {
      localObject = null;
    }
    if ((localObject != null) && (localIntent != AFb1sSDK.valueOf)) {
      AFb1sSDK.valueOf = localIntent;
    }
    AFInAppEventType.AFInAppEventParameterName(paramActivity);
  }
  
  private static final void values(AFb1jSDK paramAFb1jSDK, Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramAFb1jSDK, "");
    Intrinsics.checkNotNullParameter(paramActivity, "");
    afErrorLog = true;
    Context localContext = paramActivity.getApplicationContext();
    try
    {
      paramActivity = new java/util/Timer;
      paramActivity.<init>();
      AFa1wSDK localAFa1wSDK = new com/appsflyer/internal/AFb1jSDK$AFa1wSDK;
      localAFa1wSDK.<init>(paramAFb1jSDK, localContext);
      paramAFb1jSDK = AFb1iSDK.valueOf;
      paramActivity.schedule(localAFa1wSDK, AFb1iSDK.AFa1vSDK.AFInAppEventType());
      return;
    }
    finally
    {
      AFLogger.afErrorLog("Background task failed with a throwable: ", paramAFb1jSDK);
    }
  }
  
  public final void onActivityCreated(@NotNull Activity paramActivity, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
    values.execute(new h(this, paramActivity));
  }
  
  public final void onActivityDestroyed(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
  }
  
  public final void onActivityPaused(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
    values.execute(new j(this, paramActivity));
  }
  
  public final void onActivityResumed(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
    values.execute(new i(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(@NotNull Activity paramActivity, @NotNull Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
    Intrinsics.checkNotNullParameter(paramBundle, "");
  }
  
  public final void onActivityStarted(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
  }
  
  public final void onActivityStopped(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
  }
  
  @Metadata
  public static final class AFa1wSDK
    extends TimerTask
  {
    public AFa1wSDK(AFb1jSDK paramAFb1jSDK, Context paramContext) {}
    
    public final void run()
    {
      if ((AFb1jSDK.values(AFInAppEventType)) && (AFb1jSDK.AFInAppEventParameterName(AFInAppEventType)))
      {
        Object localObject = AFInAppEventType;
        AFKeystoreWrapper = false;
        try
        {
          localObject = AFInAppEventParameterName;
          Context localContext = AFKeystoreWrapper;
          Intrinsics.checkNotNullExpressionValue(localContext, "");
          ((AFb1iSDK.AFa1wSDK)localObject).AFInAppEventType(localContext);
          return;
        }
        catch (Exception localException)
        {
          AFLogger.afErrorLog("Listener threw exception! ", localException);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1jSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */