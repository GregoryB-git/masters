package com.facebook;

import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;

class FacebookException$1
  implements FeatureManager.Callback
{
  public FacebookException$1(FacebookException paramFacebookException, String paramString) {}
  
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      ErrorReportHandler.save(val$message);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookException.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */