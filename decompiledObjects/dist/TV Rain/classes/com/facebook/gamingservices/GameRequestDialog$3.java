package com.facebook.gamingservices;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback;

class GameRequestDialog$3
  implements DaemonRequest.Callback
{
  public GameRequestDialog$3(GameRequestDialog paramGameRequestDialog) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (GameRequestDialog.access$300(this$0) != null) {
      if (paramGraphResponse.getError() != null) {
        GameRequestDialog.access$300(this$0).onError(new FacebookException(paramGraphResponse.getError().getErrorMessage()));
      } else {
        GameRequestDialog.access$300(this$0).onSuccess(new GameRequestDialog.Result(paramGraphResponse, null));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GameRequestDialog.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */