package com.facebook.imagepipeline.core;

import bolts.Continuation;
import bolts.Task;
import com.facebook.datasource.SimpleDataSource;

class ImagePipeline$4
  implements Continuation<Boolean, Void>
{
  public ImagePipeline$4(ImagePipeline paramImagePipeline, SimpleDataSource paramSimpleDataSource) {}
  
  public Void then(Task<Boolean> paramTask)
    throws Exception
  {
    SimpleDataSource localSimpleDataSource = val$dataSource;
    boolean bool;
    if ((!paramTask.isCancelled()) && (!paramTask.isFaulted()) && (((Boolean)paramTask.getResult()).booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    localSimpleDataSource.setResult(Boolean.valueOf(bool));
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipeline.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */