package com.facebook.gamingservices;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.FacebookRequestError;
import com.facebook.internal.CallbackManagerImpl.Callback;

class GamingGroupIntegration$1
  implements CallbackManagerImpl.Callback
{
  public GamingGroupIntegration$1(GamingGroupIntegration paramGamingGroupIntegration, FacebookCallback paramFacebookCallback) {}
  
  public boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.hasExtra("error")))
    {
      paramIntent = (FacebookRequestError)paramIntent.getParcelableExtra("error");
      val$callback.onError(paramIntent.getException());
      return true;
    }
    val$callback.onSuccess(new GamingGroupIntegration.Result());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GamingGroupIntegration.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */