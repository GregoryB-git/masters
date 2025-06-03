package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import java.util.UUID;

class LikeActionController$6
  extends ResultProcessor
{
  public LikeActionController$6(LikeActionController paramLikeActionController, FacebookCallback paramFacebookCallback, Bundle paramBundle)
  {
    super(paramFacebookCallback);
  }
  
  public void onCancel(AppCall paramAppCall)
  {
    onError(paramAppCall, new FacebookOperationCanceledException());
  }
  
  public void onError(AppCall paramAppCall, FacebookException paramFacebookException)
  {
    Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Like Dialog failed with error : %s", new Object[] { paramFacebookException });
    Bundle localBundle1 = val$analyticsParameters;
    Bundle localBundle2 = localBundle1;
    if (localBundle1 == null) {
      localBundle2 = new Bundle();
    }
    localBundle2.putString("call_id", paramAppCall.getCallId().toString());
    LikeActionController.access$1400(this$0, "present_dialog", localBundle2);
    LikeActionController.access$1500(this$0, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.createBundleForException(paramFacebookException));
  }
  
  public void onSuccess(AppCall paramAppCall, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("object_is_liked")))
    {
      boolean bool = paramBundle.getBoolean("object_is_liked");
      String str1 = LikeActionController.access$700(this$0);
      String str2 = LikeActionController.access$800(this$0);
      if (paramBundle.containsKey("like_count_string"))
      {
        str1 = paramBundle.getString("like_count_string");
        str2 = str1;
      }
      String str3 = LikeActionController.access$900(this$0);
      String str4 = LikeActionController.access$1000(this$0);
      if (paramBundle.containsKey("social_sentence"))
      {
        str3 = paramBundle.getString("social_sentence");
        str4 = str3;
      }
      if (paramBundle.containsKey("object_is_liked")) {
        paramBundle = paramBundle.getString("unlike_token");
      } else {
        paramBundle = LikeActionController.access$1100(this$0);
      }
      Bundle localBundle1 = val$analyticsParameters;
      Bundle localBundle2 = localBundle1;
      if (localBundle1 == null) {
        localBundle2 = new Bundle();
      }
      localBundle2.putString("call_id", paramAppCall.getCallId().toString());
      LikeActionController.access$1200(this$0).logEventImplicitly("fb_like_control_dialog_did_succeed", localBundle2);
      LikeActionController.access$1300(this$0, bool, str1, str2, str3, str4, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */