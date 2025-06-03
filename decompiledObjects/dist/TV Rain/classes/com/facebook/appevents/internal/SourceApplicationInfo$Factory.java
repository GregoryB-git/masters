package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import bolts.AppLinks;

public class SourceApplicationInfo$Factory
{
  public static SourceApplicationInfo create(Activity paramActivity)
  {
    Object localObject1 = paramActivity.getCallingActivity();
    if (localObject1 != null)
    {
      localObject2 = ((ComponentName)localObject1).getPackageName();
      localObject1 = localObject2;
      if (((String)localObject2).equals(paramActivity.getPackageName())) {
        return null;
      }
    }
    else
    {
      localObject1 = "";
    }
    Object localObject2 = paramActivity.getIntent();
    boolean bool1 = false;
    paramActivity = (Activity)localObject1;
    boolean bool2 = bool1;
    if (localObject2 != null)
    {
      paramActivity = (Activity)localObject1;
      bool2 = bool1;
      if (!((Intent)localObject2).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
      {
        ((Intent)localObject2).putExtra("_fbSourceApplicationHasBeenSet", true);
        Bundle localBundle = AppLinks.getAppLinkData((Intent)localObject2);
        paramActivity = (Activity)localObject1;
        bool2 = bool1;
        if (localBundle != null)
        {
          paramActivity = localBundle.getBundle("referer_app_link");
          if (paramActivity != null) {
            localObject1 = paramActivity.getString("package");
          }
          bool2 = true;
          paramActivity = (Activity)localObject1;
        }
      }
    }
    if (localObject2 != null) {
      ((Intent)localObject2).putExtra("_fbSourceApplicationHasBeenSet", true);
    }
    return new SourceApplicationInfo(paramActivity, bool2, null);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.SourceApplicationInfo.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */