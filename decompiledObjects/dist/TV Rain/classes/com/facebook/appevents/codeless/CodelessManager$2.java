package com.facebook.appevents.codeless;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;

final class CodelessManager$2
  implements ViewIndexingTrigger.OnShakeListener
{
  public CodelessManager$2(FetchedAppSettings paramFetchedAppSettings, String paramString) {}
  
  public void onShake()
  {
    FetchedAppSettings localFetchedAppSettings = val$appSettings;
    int i = 1;
    int j;
    if ((localFetchedAppSettings != null) && (localFetchedAppSettings.getCodelessEventsEnabled())) {
      j = 1;
    } else {
      j = 0;
    }
    if (!FacebookSdk.getCodelessSetupEnabled()) {
      i = 0;
    }
    if ((j != 0) && (i != 0)) {
      CodelessManager.access$000().checkCodelessSession(val$appId);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */