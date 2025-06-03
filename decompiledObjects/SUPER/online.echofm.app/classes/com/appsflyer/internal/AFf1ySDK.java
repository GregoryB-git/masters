package com.appsflyer.internal;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1ySDK
  implements AFf1vSDK
{
  private String AFInAppEventType;
  
  private static String AFKeystoreWrapper(Activity paramActivity)
  {
    paramActivity = AFb1nSDK.AFInAppEventType(paramActivity);
    if (paramActivity != null) {
      paramActivity = paramActivity.toString();
    } else {
      paramActivity = null;
    }
    Object localObject = paramActivity;
    if (paramActivity == null) {
      localObject = "";
    }
    if (valueOf((String)localObject)) {
      return null;
    }
    return (String)localObject;
  }
  
  private static boolean valueOf(String paramString)
  {
    return i.s(paramString, "android-app://", false, 2, null);
  }
  
  public final void AFInAppEventParameterName(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "");
    String str = AFInAppEventType;
    if ((str == null) || (str.length() == 0)) {
      AFInAppEventType = AFKeystoreWrapper(paramActivity);
    }
  }
  
  public final String valueOf(Activity paramActivity)
  {
    String str = AFInAppEventType;
    AFInAppEventType = null;
    if ((str != null) && (str.length() != 0)) {
      return str;
    }
    return AFKeystoreWrapper(paramActivity);
  }
  
  @NotNull
  public final String values(Activity paramActivity)
  {
    paramActivity = AFb1nSDK.AFInAppEventType(paramActivity);
    if (paramActivity != null) {
      paramActivity = paramActivity.toString();
    } else {
      paramActivity = null;
    }
    Object localObject = paramActivity;
    if (paramActivity == null) {
      localObject = "";
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1ySDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */