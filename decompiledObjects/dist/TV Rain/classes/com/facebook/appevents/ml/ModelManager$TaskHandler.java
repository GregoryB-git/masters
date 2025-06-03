package com.facebook.appevents.ml;

import android.os.AsyncTask;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.internal.FileDownloadTask.Callback;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z2;

class ModelManager$TaskHandler
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
  
  public ModelManager$TaskHandler(String paramString1, String paramString2, @Nullable String paramString3, int paramInt, @Nullable float[] paramArrayOfFloat)
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

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager.TaskHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */