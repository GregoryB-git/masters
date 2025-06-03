package com.facebook.imagepipeline.core;

import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;

class ImagePipeline$1
  implements Supplier<DataSource<CloseableReference<CloseableImage>>>
{
  public ImagePipeline$1(ImagePipeline paramImagePipeline, ImageRequest paramImageRequest, Object paramObject, ImageRequest.RequestLevel paramRequestLevel) {}
  
  public DataSource<CloseableReference<CloseableImage>> get()
  {
    return this$0.fetchDecodedImage(val$imageRequest, val$callerContext, val$requestLevel);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("uri", val$imageRequest.getSourceUri()).toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipeline.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */