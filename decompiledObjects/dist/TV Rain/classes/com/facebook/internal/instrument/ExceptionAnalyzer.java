package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class ExceptionAnalyzer
{
  private static boolean enabled = false;
  
  public static void enable()
  {
    enabled = true;
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      sendExceptionAnalysisReports();
    }
  }
  
  public static void execute(Throwable paramThrowable)
  {
    if (enabled)
    {
      HashSet localHashSet = new HashSet();
      paramThrowable = paramThrowable.getStackTrace();
      int i = paramThrowable.length;
      for (int j = 0; j < i; j++)
      {
        FeatureManager.Feature localFeature = FeatureManager.getFeature(paramThrowable[j].getClassName());
        if (localFeature != FeatureManager.Feature.Unknown)
        {
          FeatureManager.disableFeature(localFeature);
          localHashSet.add(localFeature.toString());
        }
      }
      if ((FacebookSdk.getAutoLogAppEventsEnabled()) && (!localHashSet.isEmpty())) {
        InstrumentData.Builder.build(new JSONArray(localHashSet)).save();
      }
    }
  }
  
  private static void sendExceptionAnalysisReports()
  {
    if (Utility.isDataProcessingRestricted()) {
      return;
    }
    File[] arrayOfFile = InstrumentUtility.listExceptionAnalysisReportFiles();
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfFile.length;
    int j = 0;
    for (;;)
    {
      InstrumentData localInstrumentData;
      JSONObject localJSONObject;
      if (j < i)
      {
        localInstrumentData = InstrumentData.Builder.load(arrayOfFile[j]);
        if (localInstrumentData.isValid()) {
          localJSONObject = new JSONObject();
        }
      }
      try
      {
        localJSONObject.put("crash_shield", localInstrumentData.toString());
        String str = String.format("%s/instruments", new Object[] { FacebookSdk.getApplicationId() });
        GraphRequest.Callback local1 = new com/facebook/internal/instrument/ExceptionAnalyzer$1;
        local1.<init>(localInstrumentData);
        localArrayList.add(GraphRequest.newPostRequest(null, str, localJSONObject, local1));
        j++;
        continue;
        if (localArrayList.isEmpty()) {
          return;
        }
        new GraphRequestBatch(localArrayList).executeAsync();
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.ExceptionAnalyzer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */