package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.facebook.GraphRequestBatch.Callback;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

class LikeActionController$9
  implements LikeActionController.RequestCompletionCallback
{
  public LikeActionController$9(LikeActionController paramLikeActionController) {}
  
  public void onComplete()
  {
    final Object localObject1;
    if (LikeActionController.12.$SwitchMap$com$facebook$share$widget$LikeView$ObjectType[LikeActionController.access$1700(this$0).ordinal()] != 1)
    {
      localObject1 = this$0;
      localObject1 = new LikeActionController.GetOGObjectLikesRequestWrapper((LikeActionController)localObject1, LikeActionController.access$1600((LikeActionController)localObject1), LikeActionController.access$1700(this$0));
    }
    else
    {
      localObject1 = this$0;
      localObject1 = new LikeActionController.GetPageLikesRequestWrapper((LikeActionController)localObject1, LikeActionController.access$1600((LikeActionController)localObject1));
    }
    Object localObject2 = this$0;
    final LikeActionController.GetEngagementRequestWrapper localGetEngagementRequestWrapper = new LikeActionController.GetEngagementRequestWrapper((LikeActionController)localObject2, LikeActionController.access$1600((LikeActionController)localObject2), LikeActionController.access$1700(this$0));
    localObject2 = new GraphRequestBatch();
    ((LikeActionController.RequestWrapper)localObject1).addToBatch((GraphRequestBatch)localObject2);
    localGetEngagementRequestWrapper.addToBatch((GraphRequestBatch)localObject2);
    ((GraphRequestBatch)localObject2).addCallback(new GraphRequestBatch.Callback()
    {
      public void onBatchCompleted(GraphRequestBatch paramAnonymousGraphRequestBatch)
      {
        if ((localObject1.getError() == null) && (localGetEngagementRequestWrapper.getError() == null))
        {
          LikeActionController localLikeActionController = this$0;
          boolean bool = localObject1.isObjectLiked();
          paramAnonymousGraphRequestBatch = localGetEngagementRequestWrapper;
          LikeActionController.access$1300(localLikeActionController, bool, likeCountStringWithLike, likeCountStringWithoutLike, socialSentenceStringWithLike, socialSentenceStringWithoutLike, localObject1.getUnlikeToken());
          return;
        }
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Unable to refresh like state for id: '%s'", new Object[] { LikeActionController.access$2200(this$0) });
      }
    });
    ((GraphRequestBatch)localObject2).executeAsync();
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */