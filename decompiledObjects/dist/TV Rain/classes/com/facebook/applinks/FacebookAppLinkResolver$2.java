package com.facebook.applinks;

import android.net.Uri;
import bolts.AppLink;
import bolts.Task.TaskCompletionSource;
import bolts.TaskCompletionSource;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class FacebookAppLinkResolver$2
  implements GraphRequest.Callback
{
  public FacebookAppLinkResolver$2(FacebookAppLinkResolver paramFacebookAppLinkResolver, Task.TaskCompletionSource paramTaskCompletionSource, Map paramMap, HashSet paramHashSet) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject1 = paramGraphResponse.getError();
      if (localObject1 != null)
      {
        val$taskCompletionSource.setError(((FacebookRequestError)localObject1).getException());
        return;
      }
      localObject1 = paramGraphResponse.getJSONObject();
      if (localObject1 == null)
      {
        val$taskCompletionSource.setResult(val$appLinkResults);
        return;
      }
      paramGraphResponse = val$urisToRequest.iterator();
      Uri localUri;
      JSONObject localJSONObject;
      Object localObject3;
      int i;
      int j;
      Object localObject5;
      for (;;)
      {
        if (paramGraphResponse.hasNext())
        {
          localUri = (Uri)paramGraphResponse.next();
          boolean bool = ((JSONObject)localObject1).has(localUri.toString());
          if (!bool) {
            continue;
          }
        }
      }
    }
    finally
    {
      try
      {
        for (;;)
        {
          localJSONObject = ((JSONObject)localObject1).getJSONObject(localUri.toString()).getJSONObject("app_links");
          localObject3 = localJSONObject.getJSONArray("android");
          i = ((JSONArray)localObject3).length();
          ??? = new java/util/ArrayList;
          ((ArrayList)???).<init>(i);
          for (j = 0; j < i; j++)
          {
            localObject5 = FacebookAppLinkResolver.access$000(((JSONArray)localObject3).getJSONObject(j));
            if (localObject5 != null) {
              ((ArrayList)???).add(localObject5);
            }
          }
          localObject3 = FacebookAppLinkResolver.access$100(localUri, localJSONObject);
          localObject5 = new bolts/AppLink;
          ((AppLink)localObject5).<init>(localUri, (List)???, (Uri)localObject3);
          val$appLinkResults.put(localUri, localObject5);
          synchronized (FacebookAppLinkResolver.access$200(this$0))
          {
            FacebookAppLinkResolver.access$200(this$0).put(localUri, localObject5);
          }
        }
        val$taskCompletionSource.setResult(val$appLinkResults);
        return;
      }
      catch (JSONException localJSONException) {}
      paramGraphResponse = finally;
      CrashShieldHandler.handleThrowable(paramGraphResponse, this);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.applinks.FacebookAppLinkResolver.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */