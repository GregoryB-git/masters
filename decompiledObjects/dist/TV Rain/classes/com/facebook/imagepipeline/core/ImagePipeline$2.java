package com.facebook.imagepipeline.core;

import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.request.ImageRequest;

class ImagePipeline$2
  implements Supplier<DataSource<CloseableReference<PooledByteBuffer>>>
{
  public ImagePipeline$2(ImagePipeline paramImagePipeline, ImageRequest paramImageRequest, Object paramObject) {}
  
  public DataSource<CloseableReference<PooledByteBuffer>> get()
  {
    return this$0.fetchEncodedImage(val$imageRequest, val$callerContext);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("uri", val$imageRequest.getSourceUri()).toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipeline.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */