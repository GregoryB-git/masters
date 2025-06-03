package com.facebook.appevents.suggestedevents;

import com.facebook.FacebookSdk;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.ml.ModelManager.Task;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.json.JSONObject;

class ViewOnClickListener$2
  implements Runnable
{
  public ViewOnClickListener$2(ViewOnClickListener paramViewOnClickListener, JSONObject paramJSONObject, String paramString1, String paramString2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      try
      {
        Object localObject = Utility.getAppName(FacebookSdk.getApplicationContext()).toLowerCase();
        float[] arrayOfFloat = FeatureExtractor.getDenseFeatures(val$viewData, (String)localObject);
        localObject = FeatureExtractor.getTextFeature(val$buttonText, ViewOnClickListener.access$100(this$0), (String)localObject);
        if (arrayOfFloat == null) {
          return;
        }
        localObject = ModelManager.predict(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][] { arrayOfFloat }, new String[] { localObject });
        if (localObject == null) {
          return;
        }
        localObject = localObject[0];
        PredictionHistoryManager.addPrediction(val$pathID, (String)localObject);
        if (!((String)localObject).equals("other")) {
          ViewOnClickListener.access$000((String)localObject, val$buttonText, arrayOfFloat);
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.ViewOnClickListener.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */