package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphRequestBatch.Callback;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Utility;
import z2;

class LikeActionController$7
  implements LikeActionController.RequestCompletionCallback
{
  public LikeActionController$7(LikeActionController paramLikeActionController, Bundle paramBundle) {}
  
  public void onComplete()
  {
    if (Utility.isNullOrEmpty(LikeActionController.access$1600(this$0)))
    {
      localObject1 = z2.d("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
      LikeActionController.access$1500(this$0, "com.facebook.sdk.LikeActionController.DID_ERROR", (Bundle)localObject1);
      return;
    }
    Object localObject1 = new GraphRequestBatch();
    final Object localObject2 = this$0;
    localObject2 = new LikeActionController.PublishLikeRequestWrapper((LikeActionController)localObject2, LikeActionController.access$1600((LikeActionController)localObject2), LikeActionController.access$1700(this$0));
    ((LikeActionController.AbstractRequestWrapper)localObject2).addToBatch((GraphRequestBatch)localObject1);
    ((GraphRequestBatch)localObject1).addCallback(new GraphRequestBatch.Callback()
    {
      public void onBatchCompleted(GraphRequestBatch paramAnonymousGraphRequestBatch)
      {
        LikeActionController.access$1802(this$0, false);
        if (localObject2.getError() != null)
        {
          LikeActionController.access$1900(this$0, false);
        }
        else
        {
          LikeActionController.access$1102(this$0, Utility.coerceValueIfNullOrEmpty(localObject2unlikeToken, null));
          LikeActionController.access$2002(this$0, true);
          LikeActionController.access$1200(this$0).logEventImplicitly("fb_like_control_did_like", null, val$analyticsParameters);
          paramAnonymousGraphRequestBatch = LikeActionController.7.this;
          LikeActionController.access$2100(this$0, val$analyticsParameters);
        }
      }
    });
    ((GraphRequestBatch)localObject1).executeAsync();
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */