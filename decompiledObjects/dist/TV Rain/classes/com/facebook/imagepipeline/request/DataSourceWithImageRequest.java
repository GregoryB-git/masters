package com.facebook.imagepipeline.request;

import com.facebook.datasource.DataSource;

public abstract interface DataSourceWithImageRequest<T>
  extends DataSource<T>
{
  public abstract ImageRequest getImageRequest();
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.DataSourceWithImageRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */