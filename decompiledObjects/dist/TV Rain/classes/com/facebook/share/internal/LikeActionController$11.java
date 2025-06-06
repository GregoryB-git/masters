package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.facebook.GraphRequestBatch.Callback;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;

class LikeActionController$11
  implements GraphRequestBatch.Callback
{
  public LikeActionController$11(LikeActionController paramLikeActionController, LikeActionController.GetOGObjectIdRequestWrapper paramGetOGObjectIdRequestWrapper, LikeActionController.GetPageIdRequestWrapper paramGetPageIdRequestWrapper, LikeActionController.RequestCompletionCallback paramRequestCompletionCallback) {}
  
  public void onBatchCompleted(GraphRequestBatch paramGraphRequestBatch)
  {
    LikeActionController.access$1602(this$0, val$objectIdRequest.verifiedObjectId);
    if (Utility.isNullOrEmpty(LikeActionController.access$1600(this$0)))
    {
      LikeActionController.access$1602(this$0, val$pageIdRequest.verifiedObjectId);
      LikeActionController.access$2302(this$0, val$pageIdRequest.objectIsPage);
    }
    if (Utility.isNullOrEmpty(LikeActionController.access$1600(this$0)))
    {
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.access$100(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] { LikeActionController.access$2200(this$0) });
      LikeActionController localLikeActionController = this$0;
      if (val$pageIdRequest.getError() != null) {
        paramGraphRequestBatch = val$pageIdRequest.getError();
      } else {
        paramGraphRequestBatch = val$objectIdRequest.getError();
      }
      LikeActionController.access$2400(localLikeActionController, "get_verified_id", paramGraphRequestBatch);
    }
    paramGraphRequestBatch = val$completionHandler;
    if (paramGraphRequestBatch != null) {
      paramGraphRequestBatch.onComplete();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */