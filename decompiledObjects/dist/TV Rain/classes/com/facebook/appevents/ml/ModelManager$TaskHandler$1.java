package com.facebook.appevents.ml;

import com.facebook.appevents.internal.FileDownloadTask.Callback;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import z2;

final class ModelManager$TaskHandler$1
  implements FileDownloadTask.Callback
{
  public ModelManager$TaskHandler$1(List paramList) {}
  
  public void onComplete(File paramFile)
  {
    final Model localModel = Model.build(paramFile);
    if (localModel != null)
    {
      paramFile = val$slaves.iterator();
      while (paramFile.hasNext())
      {
        final ModelManager.TaskHandler localTaskHandler = (ModelManager.TaskHandler)paramFile.next();
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(useCase);
        ((StringBuilder)localObject).append("_");
        localObject = z2.q((StringBuilder)localObject, versionId, "_rule");
        ModelManager.TaskHandler.access$600(ruleUri, (String)localObject, new FileDownloadTask.Callback()
        {
          public void onComplete(File paramAnonymousFile)
          {
            ModelManager.TaskHandler localTaskHandler = localTaskHandler;
            model = localModel;
            ruleFile = paramAnonymousFile;
            if (ModelManager.TaskHandler.access$500(localTaskHandler) != null) {
              ModelManager.TaskHandler.access$500(localTaskHandler).run();
            }
          }
        });
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager.TaskHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */