package com.facebook.appevents.ml;

import com.facebook.appevents.internal.FileDownloadTask.Callback;
import java.io.File;

class ModelManager$TaskHandler$1$1
  implements FileDownloadTask.Callback
{
  public ModelManager$TaskHandler$1$1(ModelManager.TaskHandler.1 param1, ModelManager.TaskHandler paramTaskHandler, Model paramModel) {}
  
  public void onComplete(File paramFile)
  {
    ModelManager.TaskHandler localTaskHandler = val$slave;
    model = val$model;
    ruleFile = paramFile;
    if (ModelManager.TaskHandler.access$500(localTaskHandler) != null) {
      ModelManager.TaskHandler.access$500(val$slave).run();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager.TaskHandler.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */