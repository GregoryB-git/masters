package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.InternalSettings;
import java.lang.ref.Reference;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ViewIndexer$1
  extends TimerTask
{
  public ViewIndexer$1(ViewIndexer paramViewIndexer) {}
  
  public void run()
  {
    try
    {
      Object localObject1 = (Activity)ViewIndexer.access$000(this$0).get();
      View localView = AppEventUtility.getRootView((Activity)localObject1);
      if ((localObject1 != null) && (localView != null))
      {
        String str2 = localObject1.getClass().getSimpleName();
        if (!CodelessManager.getIsAppIndexingEnabled()) {
          return;
        }
        if (InternalSettings.isUnityApp())
        {
          UnityReflection.captureViewHierarchy();
          return;
        }
        Object localObject2 = new java/util/concurrent/FutureTask;
        localObject1 = new com/facebook/appevents/codeless/ViewIndexer$ScreenshotTaker;
        ((ViewIndexer.ScreenshotTaker)localObject1).<init>(localView);
        ((FutureTask)localObject2).<init>((Callable)localObject1);
        ViewIndexer.access$100(this$0).post((Runnable)localObject2);
        localObject1 = "";
        try
        {
          localObject2 = (String)((FutureTask)localObject2).get(1L, TimeUnit.SECONDS);
          localObject1 = localObject2;
        }
        catch (Exception localException2)
        {
          Log.e(ViewIndexer.access$200(), "Failed to take screenshot.", localException2);
        }
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        try
        {
          localJSONObject.put("screenname", str2);
          localJSONObject.put("screenshot", localObject1);
          localObject1 = new org/json/JSONArray;
          ((JSONArray)localObject1).<init>();
          ((JSONArray)localObject1).put(ViewHierarchy.getDictionaryOfView(localView));
          localJSONObject.put("view", localObject1);
        }
        catch (JSONException localJSONException)
        {
          Log.e(ViewIndexer.access$200(), "Failed to create JSONObject");
        }
        String str1 = localJSONObject.toString();
        ViewIndexer.access$300(this$0, str1);
      }
      else {}
    }
    catch (Exception localException1)
    {
      Log.e(ViewIndexer.access$200(), "UI Component tree indexing failure!", localException1);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */