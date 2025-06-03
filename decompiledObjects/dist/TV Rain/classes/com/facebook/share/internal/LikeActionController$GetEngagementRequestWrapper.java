package com.facebook.share.internal;

import android.os.BaseBundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.share.widget.LikeView.ObjectType;
import java.util.Locale;
import org.json.JSONObject;
import z2;

class LikeActionController$GetEngagementRequestWrapper
  extends LikeActionController.AbstractRequestWrapper
{
  public String likeCountStringWithLike;
  public String likeCountStringWithoutLike;
  public String socialSentenceStringWithLike;
  public String socialSentenceStringWithoutLike;
  
  public LikeActionController$GetEngagementRequestWrapper(LikeActionController paramLikeActionController, String paramString, LikeView.ObjectType paramObjectType)
  {
    super(paramLikeActionController, paramString, paramObjectType);
    likeCountStringWithLike = LikeActionController.access$700(paramLikeActionController);
    likeCountStringWithoutLike = LikeActionController.access$800(paramLikeActionController);
    socialSentenceStringWithLike = LikeActionController.access$900(paramLikeActionController);
    socialSentenceStringWithoutLike = LikeActionController.access$1000(paramLikeActionController);
    paramLikeActionController = z2.d("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
    paramLikeActionController.putString("locale", Locale.getDefault().toString());
    setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), paramString, paramLikeActionController, HttpMethod.GET));
  }
  
  public void processError(FacebookRequestError paramFacebookRequestError)
  {
    Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
    LikeActionController.access$2400(this$0, "get_engagement", paramFacebookRequestError);
  }
  
  public void processSuccess(GraphResponse paramGraphResponse)
  {
    paramGraphResponse = Utility.tryGetJSONObjectFromResponse(paramGraphResponse.getJSONObject(), "engagement");
    if (paramGraphResponse != null)
    {
      likeCountStringWithLike = paramGraphResponse.optString("count_string_with_like", likeCountStringWithLike);
      likeCountStringWithoutLike = paramGraphResponse.optString("count_string_without_like", likeCountStringWithoutLike);
      socialSentenceStringWithLike = paramGraphResponse.optString("social_sentence_with_like", socialSentenceStringWithLike);
      socialSentenceStringWithoutLike = paramGraphResponse.optString("social_sentence_without_like", socialSentenceStringWithoutLike);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.GetEngagementRequestWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */