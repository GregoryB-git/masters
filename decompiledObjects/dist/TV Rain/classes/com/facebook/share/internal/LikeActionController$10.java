package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient.CompletedListener;

class LikeActionController$10
  implements PlatformServiceClient.CompletedListener
{
  public LikeActionController$10(LikeActionController paramLikeActionController) {}
  
  public void completed(Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")))
    {
      boolean bool = paramBundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
      String str1;
      if (paramBundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
        str1 = paramBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
      } else {
        str1 = LikeActionController.access$700(this$0);
      }
      String str2;
      if (paramBundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
        str2 = paramBundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
      } else {
        str2 = LikeActionController.access$800(this$0);
      }
      String str3;
      if (paramBundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
        str3 = paramBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
      } else {
        str3 = LikeActionController.access$900(this$0);
      }
      String str4;
      if (paramBundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
        str4 = paramBundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
      } else {
        str4 = LikeActionController.access$1000(this$0);
      }
      if (paramBundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
        paramBundle = paramBundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
      } else {
        paramBundle = LikeActionController.access$1100(this$0);
      }
      LikeActionController.access$1300(this$0, bool, str1, str2, str3, str4, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */