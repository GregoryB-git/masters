package com.facebook.appevents;

import com.facebook.internal.InstallReferrerUtil.Callback;

final class AppEventsLoggerImpl$2
  implements InstallReferrerUtil.Callback
{
  public void onReceiveReferrerUrl(String paramString)
  {
    AppEventsLoggerImpl.setInstallReferrer(paramString);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLoggerImpl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */