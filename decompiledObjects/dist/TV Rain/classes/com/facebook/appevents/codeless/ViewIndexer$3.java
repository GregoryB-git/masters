package com.facebook.appevents.codeless;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ViewIndexer$3
  implements Runnable
{
  public ViewIndexer$3(ViewIndexer paramViewIndexer, String paramString) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      String str = Utility.md5hash(val$tree);
      Object localObject = AccessToken.getCurrentAccessToken();
      if ((str != null) && (str.equals(ViewIndexer.access$500(this$0)))) {
        return;
      }
      localObject = ViewIndexer.buildAppIndexingRequest(val$tree, (AccessToken)localObject, FacebookSdk.getApplicationId(), "app_indexing");
      this$0.processRequest((GraphRequest)localObject, str);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */