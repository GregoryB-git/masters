package com.facebook.imagepipeline.producers;

import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

class LocalExifThumbnailProducer$1
  extends StatefulProducerRunnable<EncodedImage>
{
  public LocalExifThumbnailProducer$1(LocalExifThumbnailProducer paramLocalExifThumbnailProducer, Consumer paramConsumer, ProducerListener paramProducerListener, String paramString1, String paramString2, ImageRequest paramImageRequest)
  {
    super(paramConsumer, paramProducerListener, paramString1, paramString2);
  }
  
  public void disposeResult(EncodedImage paramEncodedImage)
  {
    EncodedImage.closeSafely(paramEncodedImage);
  }
  
  public Map<String, String> getExtraMapOnSuccess(EncodedImage paramEncodedImage)
  {
    boolean bool;
    if (paramEncodedImage != null) {
      bool = true;
    } else {
      bool = false;
    }
    return ImmutableMap.of("createdThumbnail", Boolean.toString(bool));
  }
  
  public EncodedImage getResult()
    throws Exception
  {
    Object localObject1 = val$imageRequest.getSourceUri();
    localObject1 = this$0.getExifInterface((Uri)localObject1);
    if ((localObject1 != null) && (((ExifInterface)localObject1).hasThumbnail()))
    {
      Object localObject2 = ((ExifInterface)localObject1).getThumbnail();
      localObject2 = LocalExifThumbnailProducer.access$000(this$0).newByteBuffer((byte[])localObject2);
      return LocalExifThumbnailProducer.access$100(this$0, (PooledByteBuffer)localObject2, (ExifInterface)localObject1);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */