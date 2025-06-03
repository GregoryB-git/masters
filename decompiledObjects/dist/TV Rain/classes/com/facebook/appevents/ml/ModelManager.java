package com.facebook.appevents.ml;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.internal.FileDownloadTask.Callback;
import com.facebook.appevents.suggestedevents.SuggestedEventsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class ModelManager
{
  private static final String ASSET_URI_KEY = "asset_uri";
  private static final String CACHE_KEY_MODELS = "models";
  private static final String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
  private static final String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
  private static final Integer MODEL_REQUEST_INTERVAL_MILLISECONDS;
  private static final List<String> MTML_INTEGRITY_DETECT_PREDICTION = Arrays.asList(new String[] { "none", "address", "health" });
  private static final List<String> MTML_SUGGESTED_EVENTS_PREDICTION;
  private static final String MTML_USE_CASE = "MTML";
  private static final String RULES_URI_KEY = "rules_uri";
  private static final String SDK_MODEL_ASSET = "%s/model_asset";
  private static final String THRESHOLD_KEY = "thresholds";
  private static final String USE_CASE_KEY = "use_case";
  private static final String VERSION_ID_KEY = "version_id";
  private static final Map<String, TaskHandler> mTaskHandlers = new ConcurrentHashMap();
  
  static
  {
    MODEL_REQUEST_INTERVAL_MILLISECONDS = Integer.valueOf(259200000);
    MTML_SUGGESTED_EVENTS_PREDICTION = Arrays.asList(new String[] { "other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout" });
  }
  
  private static void addModels(JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return;
    }
    try
    {
      localIterator = paramJSONObject.keys();
    }
    finally
    {
      try
      {
        Iterator localIterator;
        while (localIterator.hasNext())
        {
          TaskHandler localTaskHandler = TaskHandler.build(paramJSONObject.getJSONObject((String)localIterator.next()));
          if (localTaskHandler != null) {
            mTaskHandlers.put(useCase, localTaskHandler);
          }
        }
        return;
      }
      catch (JSONException paramJSONObject)
      {
        for (;;) {}
      }
      paramJSONObject = finally;
      CrashShieldHandler.handleThrowable(paramJSONObject, ModelManager.class);
      return;
    }
  }
  
  public static void enable()
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return;
    }
    try
    {
      Runnable local1 = new com/facebook/appevents/ml/ModelManager$1;
      local1.<init>();
      Utility.runOnNonUiThread(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ModelManager.class);
    }
  }
  
  private static void enableMTML()
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = mTaskHandlers.entrySet().iterator();
      Object localObject1 = null;
      int i = 0;
      Object localObject3;
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object localObject2 = (String)localEntry.getKey();
        int j = i;
        if (((String)localObject2).equals(Task.MTML_APP_EVENT_PREDICTION.toUseCase()))
        {
          TaskHandler localTaskHandler = (TaskHandler)localEntry.getValue();
          localObject3 = assetUri;
          i = Math.max(i, versionId);
          localObject1 = localObject3;
          j = i;
          if (FeatureManager.isEnabled(FeatureManager.Feature.SuggestedEvents))
          {
            localObject1 = localObject3;
            j = i;
            if (isLocaleEnglish())
            {
              localObject1 = new com/facebook/appevents/ml/ModelManager$2;
              ((2)localObject1).<init>();
              localArrayList.add(localTaskHandler.setOnPostExecute((Runnable)localObject1));
              j = i;
              localObject1 = localObject3;
            }
          }
        }
        i = j;
        if (((String)localObject2).equals(Task.MTML_INTEGRITY_DETECT.toUseCase()))
        {
          localObject3 = (TaskHandler)localEntry.getValue();
          localObject1 = assetUri;
          i = Math.max(j, versionId);
          if (FeatureManager.isEnabled(FeatureManager.Feature.IntelligentIntegrity))
          {
            localObject2 = new com/facebook/appevents/ml/ModelManager$3;
            ((3)localObject2).<init>();
            localArrayList.add(((TaskHandler)localObject3).setOnPostExecute((Runnable)localObject2));
          }
        }
      }
      if ((localObject1 != null) && (i > 0) && (!localArrayList.isEmpty()))
      {
        localObject3 = new com/facebook/appevents/ml/ModelManager$TaskHandler;
        ((TaskHandler)localObject3).<init>("MTML", (String)localObject1, null, i, null);
        TaskHandler.execute((TaskHandler)localObject3, localArrayList);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ModelManager.class);
    }
  }
  
  @Nullable
  private static JSONObject fetchModels()
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return null;
    }
    try
    {
      Object localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      ((BaseBundle)localObject).putString("fields", TextUtils.join(",", new String[] { "use_case", "version_id", "asset_uri", "rules_uri", "thresholds" }));
      GraphRequest localGraphRequest = GraphRequest.newGraphPathRequest(null, String.format("%s/model_asset", new Object[] { FacebookSdk.getApplicationId() }), null);
      localGraphRequest.setSkipClientToken(true);
      localGraphRequest.setParameters((Bundle)localObject);
      localObject = localGraphRequest.executeAndWait().getJSONObject();
      if (localObject == null) {
        return null;
      }
      localObject = parseRawJsonObject((JSONObject)localObject);
      return (JSONObject)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ModelManager.class);
    }
    return null;
  }
  
  @Nullable
  public static File getRuleFile(Task paramTask)
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return null;
    }
    try
    {
      paramTask = (TaskHandler)mTaskHandlers.get(paramTask.toUseCase());
      if (paramTask == null) {
        return null;
      }
      paramTask = ruleFile;
      return paramTask;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTask, ModelManager.class);
    }
    return null;
  }
  
  private static boolean isLocaleEnglish()
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(ModelManager.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      Locale localLocale = Utility.getResourceLocale();
      if (localLocale != null)
      {
        bool1 = localLocale.getLanguage().contains("en");
        if (!bool1) {}
      }
      else
      {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ModelManager.class);
    }
    return false;
  }
  
  private static boolean isValidTimestamp(long paramLong)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(ModelManager.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (paramLong == 0L) {
      return false;
    }
    try
    {
      long l = System.currentTimeMillis();
      int i = MODEL_REQUEST_INTERVAL_MILLISECONDS.intValue();
      if (l - paramLong < i) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, ModelManager.class);
    }
    return false;
  }
  
  /* Error */
  @Nullable
  private static float[] parseJsonArray(@Nullable JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 122	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: ifnonnull +5 -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_0
    //   17: invokevirtual 371	org/json/JSONArray:length	()I
    //   20: newarray <illegal type>
    //   22: astore_1
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: invokevirtual 371	org/json/JSONArray:length	()I
    //   29: istore_3
    //   30: iload_2
    //   31: iload_3
    //   32: if_icmpge +20 -> 52
    //   35: aload_1
    //   36: iload_2
    //   37: aload_0
    //   38: iload_2
    //   39: invokevirtual 375	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   42: invokestatic 381	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   45: fastore
    //   46: iinc 2 1
    //   49: goto -24 -> 25
    //   52: aload_1
    //   53: areturn
    //   54: astore_0
    //   55: aload_0
    //   56: ldc 2
    //   58: invokestatic 129	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   61: aconst_null
    //   62: areturn
    //   63: astore 4
    //   65: goto -19 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	paramJSONArray	JSONArray
    //   22	31	1	arrayOfFloat	float[]
    //   24	23	2	i	int
    //   29	4	3	j	int
    //   63	1	4	localJSONException	JSONException
    // Exception table:
    //   from	to	target	type
    //   16	23	54	finally
    //   25	30	54	finally
    //   35	46	54	finally
    //   35	46	63	org/json/JSONException
  }
  
  private static JSONObject parseRawJsonObject(JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>();
      try
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("data");
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
          paramJSONObject = new org/json/JSONObject;
          paramJSONObject.<init>();
          paramJSONObject.put("version_id", localJSONObject2.getString("version_id"));
          paramJSONObject.put("use_case", localJSONObject2.getString("use_case"));
          paramJSONObject.put("thresholds", localJSONObject2.getJSONArray("thresholds"));
          paramJSONObject.put("asset_uri", localJSONObject2.getString("asset_uri"));
          if (localJSONObject2.has("rules_uri")) {
            paramJSONObject.put("rules_uri", localJSONObject2.getString("rules_uri"));
          }
          localJSONObject1.put(localJSONObject2.getString("use_case"), paramJSONObject);
        }
        return localJSONObject1;
      }
      catch (JSONException paramJSONObject)
      {
        paramJSONObject = new JSONObject();
        return paramJSONObject;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramJSONObject, ModelManager.class);
    }
  }
  
  @Nullable
  public static String[] predict(Task paramTask, float[][] paramArrayOfFloat, String[] paramArrayOfString)
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return null;
    }
    try
    {
      TaskHandler localTaskHandler = (TaskHandler)mTaskHandlers.get(paramTask.toUseCase());
      if ((localTaskHandler != null) && (model != null))
      {
        int i = paramArrayOfString.length;
        int j = paramArrayOfFloat[0].length;
        MTensor localMTensor = new com/facebook/appevents/ml/MTensor;
        localMTensor.<init>(new int[] { i, j });
        for (int k = 0; k < i; k++) {
          System.arraycopy(paramArrayOfFloat[k], 0, localMTensor.getData(), k * j, j);
        }
        paramArrayOfFloat = model.predictOnMTML(localMTensor, paramArrayOfString, paramTask.toKey());
        paramArrayOfString = thresholds;
        if ((paramArrayOfFloat != null) && (paramArrayOfString != null) && (paramArrayOfFloat.getData().length != 0) && (paramArrayOfString.length != 0))
        {
          k = 4.$SwitchMap$com$facebook$appevents$ml$ModelManager$Task[paramTask.ordinal()];
          if (k != 1)
          {
            if (k != 2) {
              return null;
            }
            return processSuggestedEventResult(paramArrayOfFloat, paramArrayOfString);
          }
          paramTask = processIntegrityDetectionResult(paramArrayOfFloat, paramArrayOfString);
          return paramTask;
        }
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTask, ModelManager.class);
    }
    return null;
  }
  
  @Nullable
  private static String[] processIntegrityDetectionResult(MTensor paramMTensor, float[] paramArrayOfFloat)
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor.getShape(0);
      int j = paramMTensor.getShape(1);
      float[] arrayOfFloat = paramMTensor.getData();
      paramMTensor = new String[i];
      if (j != paramArrayOfFloat.length) {
        return null;
      }
      for (int k = 0; k < i; k++)
      {
        paramMTensor[k] = "none";
        for (int m = 0; m < paramArrayOfFloat.length; m++) {
          if (arrayOfFloat[(k * j + m)] >= paramArrayOfFloat[m]) {
            paramMTensor[k] = ((String)MTML_INTEGRITY_DETECT_PREDICTION.get(m));
          }
        }
      }
      return paramMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, ModelManager.class);
    }
    return null;
  }
  
  @Nullable
  private static String[] processSuggestedEventResult(MTensor paramMTensor, float[] paramArrayOfFloat)
  {
    if (CrashShieldHandler.isObjectCrashing(ModelManager.class)) {
      return null;
    }
    try
    {
      int i = paramMTensor.getShape(0);
      int j = paramMTensor.getShape(1);
      float[] arrayOfFloat = paramMTensor.getData();
      paramMTensor = new String[i];
      if (j != paramArrayOfFloat.length) {
        return null;
      }
      for (int k = 0; k < i; k++)
      {
        paramMTensor[k] = "other";
        for (int m = 0; m < paramArrayOfFloat.length; m++) {
          if (arrayOfFloat[(k * j + m)] >= paramArrayOfFloat[m]) {
            paramMTensor[k] = ((String)MTML_SUGGESTED_EVENTS_PREDICTION.get(m));
          }
        }
      }
      return paramMTensor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMTensor, ModelManager.class);
    }
    return null;
  }
  
  public static enum Task
  {
    static
    {
      Task localTask1 = new Task("MTML_INTEGRITY_DETECT", 0);
      MTML_INTEGRITY_DETECT = localTask1;
      Task localTask2 = new Task("MTML_APP_EVENT_PREDICTION", 1);
      MTML_APP_EVENT_PREDICTION = localTask2;
      $VALUES = new Task[] { localTask1, localTask2 };
    }
    
    private Task() {}
    
    public String toKey()
    {
      int i = ModelManager.4.$SwitchMap$com$facebook$appevents$ml$ModelManager$Task[ordinal()];
      if (i != 1)
      {
        if (i != 2) {
          return "Unknown";
        }
        return "app_event_pred";
      }
      return "integrity_detect";
    }
    
    @Nullable
    public String toUseCase()
    {
      int i = ModelManager.4.$SwitchMap$com$facebook$appevents$ml$ModelManager$Task[ordinal()];
      if (i != 1)
      {
        if (i != 2) {
          return null;
        }
        return "MTML_APP_EVENT_PRED";
      }
      return "MTML_INTEGRITY_DETECT";
    }
  }
  
  public static class TaskHandler
  {
    public String assetUri;
    @Nullable
    public Model model;
    private Runnable onPostExecute;
    public File ruleFile;
    @Nullable
    public String ruleUri;
    @Nullable
    public float[] thresholds;
    public String useCase;
    public int versionId;
    
    public TaskHandler(String paramString1, String paramString2, @Nullable String paramString3, int paramInt, @Nullable float[] paramArrayOfFloat)
    {
      useCase = paramString1;
      assetUri = paramString2;
      ruleUri = paramString3;
      versionId = paramInt;
      thresholds = paramArrayOfFloat;
    }
    
    @Nullable
    public static TaskHandler build(@Nullable JSONObject paramJSONObject)
    {
      if (paramJSONObject == null) {
        return null;
      }
      try
      {
        paramJSONObject = new TaskHandler(paramJSONObject.getString("use_case"), paramJSONObject.getString("asset_uri"), paramJSONObject.optString("rules_uri", null), paramJSONObject.getInt("version_id"), ModelManager.access$400(paramJSONObject.getJSONArray("thresholds")));
        return paramJSONObject;
      }
      catch (Exception paramJSONObject) {}
      return null;
    }
    
    private static void deleteOldFiles(String paramString, int paramInt)
    {
      Object localObject1 = Utils.getMlDir();
      if (localObject1 == null) {
        return;
      }
      localObject1 = ((File)localObject1).listFiles();
      if ((localObject1 != null) && (localObject1.length != 0))
      {
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append("_");
        ((StringBuilder)localObject2).append(paramInt);
        String str = ((StringBuilder)localObject2).toString();
        int i = localObject1.length;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          Object localObject3 = localObject1[paramInt];
          localObject2 = ((File)localObject3).getName();
          if ((((String)localObject2).startsWith(paramString)) && (!((String)localObject2).startsWith(str))) {
            ((File)localObject3).delete();
          }
        }
      }
    }
    
    private static void download(String paramString1, String paramString2, FileDownloadTask.Callback paramCallback)
    {
      paramString2 = new File(Utils.getMlDir(), paramString2);
      if ((paramString1 != null) && (!paramString2.exists()))
      {
        new FileDownloadTask(paramString1, paramString2, paramCallback).execute(new String[0]);
        return;
      }
      paramCallback.onComplete(paramString2);
    }
    
    public static void execute(TaskHandler paramTaskHandler)
    {
      execute(paramTaskHandler, Collections.singletonList(paramTaskHandler));
    }
    
    public static void execute(TaskHandler paramTaskHandler, List<TaskHandler> paramList)
    {
      deleteOldFiles(useCase, versionId);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(useCase);
      ((StringBuilder)localObject).append("_");
      ((StringBuilder)localObject).append(versionId);
      localObject = ((StringBuilder)localObject).toString();
      download(assetUri, (String)localObject, new FileDownloadTask.Callback()
      {
        public void onComplete(File paramAnonymousFile)
        {
          final Model localModel = Model.build(paramAnonymousFile);
          if (localModel != null)
          {
            paramAnonymousFile = val$slaves.iterator();
            while (paramAnonymousFile.hasNext())
            {
              final ModelManager.TaskHandler localTaskHandler = (ModelManager.TaskHandler)paramAnonymousFile.next();
              Object localObject = new StringBuilder();
              ((StringBuilder)localObject).append(useCase);
              ((StringBuilder)localObject).append("_");
              localObject = z2.q((StringBuilder)localObject, versionId, "_rule");
              ModelManager.TaskHandler.access$600(ruleUri, (String)localObject, new FileDownloadTask.Callback()
              {
                public void onComplete(File paramAnonymous2File)
                {
                  ModelManager.TaskHandler localTaskHandler = localTaskHandler;
                  model = localModel;
                  ruleFile = paramAnonymous2File;
                  if (ModelManager.TaskHandler.access$500(localTaskHandler) != null) {
                    ModelManager.TaskHandler.access$500(localTaskHandler).run();
                  }
                }
              });
            }
          }
        }
      });
    }
    
    public TaskHandler setOnPostExecute(Runnable paramRunnable)
    {
      onPostExecute = paramRunnable;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */