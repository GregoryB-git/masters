package com.facebook.gamingservices;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback;

class FriendFinderDialog$1
  implements DaemonRequest.Callback
{
  public FriendFinderDialog$1(FriendFinderDialog paramFriendFinderDialog) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (FriendFinderDialog.access$000(this$0) != null) {
      if (paramGraphResponse.getError() != null) {
        FriendFinderDialog.access$000(this$0).onError(new FacebookException(paramGraphResponse.getError().getErrorMessage()));
      } else {
        FriendFinderDialog.access$000(this$0).onSuccess(new FriendFinderDialog.Result());
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.FriendFinderDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */