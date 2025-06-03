package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.preference.PreferenceManager;
import bolts.AppLinks;
import com.facebook.FacebookSdk;
import z2;

class SourceApplicationInfo
{
  private static final String CALL_APPLICATION_PACKAGE_KEY = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
  private static final String OPENED_BY_APP_LINK_KEY = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
  private static final String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
  private String callingApplicationPackage;
  private boolean openedByAppLink;
  
  private SourceApplicationInfo(String paramString, boolean paramBoolean)
  {
    callingApplicationPackage = paramString;
    openedByAppLink = paramBoolean;
  }
  
  public static void clearSavedSourceApplicationInfoFromDisk()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
    localEditor.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
    localEditor.apply();
  }
  
  public static SourceApplicationInfo getStoredSourceApplicatioInfo()
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
    if (!localSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
      return null;
    }
    return new SourceApplicationInfo(localSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), localSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
  }
  
  public String getCallingApplicationPackage()
  {
    return callingApplicationPackage;
  }
  
  public boolean isOpenedByAppLink()
  {
    return openedByAppLink;
  }
  
  public String toString()
  {
    String str1;
    if (openedByAppLink) {
      str1 = "Applink";
    } else {
      str1 = "Unclassified";
    }
    String str2 = str1;
    if (callingApplicationPackage != null) {
      str2 = z2.s(z2.u(str1, "("), callingApplicationPackage, ")");
    }
    return str2;
  }
  
  public void writeSourceApplicationInfoToDisk()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
    localEditor.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", callingApplicationPackage);
    localEditor.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", openedByAppLink);
    localEditor.apply();
  }
  
  public static class Factory
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
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.SourceApplicationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */