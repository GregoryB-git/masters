package com.facebook.gamingservices;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.FacebookRequestError;
import com.facebook.internal.CallbackManagerImpl.Callback;

class FriendFinderDialog$2
  implements CallbackManagerImpl.Callback
{
  public FriendFinderDialog$2(FriendFinderDialog paramFriendFinderDialog, FacebookCallback paramFacebookCallback) {}
  
  public boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.hasExtra("error")))
    {
      paramIntent = (FacebookRequestError)paramIntent.getParcelableExtra("error");
      val$callback.onError(paramIntent.getException());
      return true;
    }
    val$callback.onSuccess(new FriendFinderDialog.Result());
    return true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.FriendFinderDialog.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */