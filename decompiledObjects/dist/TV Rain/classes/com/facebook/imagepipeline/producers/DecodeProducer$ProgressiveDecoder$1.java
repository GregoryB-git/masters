package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Supplier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

class DecodeProducer$ProgressiveDecoder$1
  implements JobScheduler.JobRunnable
{
  public DecodeProducer$ProgressiveDecoder$1(DecodeProducer.ProgressiveDecoder paramProgressiveDecoder, DecodeProducer paramDecodeProducer, ProducerContext paramProducerContext) {}
  
  public void run(EncodedImage paramEncodedImage, int paramInt)
  {
    if (paramEncodedImage != null)
    {
      if ((DecodeProducer.access$000(this$1.this$0)) || ((((Boolean)DecodeProducer.access$100(this$1.this$0).get()).booleanValue()) && (!BaseConsumer.statusHasFlag(paramInt, 16))))
      {
        ImageRequest localImageRequest = val$producerContext.getImageRequest();
        if ((DecodeProducer.access$200(this$1.this$0)) || (!UriUtil.isNetworkUri(localImageRequest.getSourceUri()))) {
          paramEncodedImage.setSampleSize(DownsampleUtil.determineSampleSize(localImageRequest, paramEncodedImage));
        }
      }
      DecodeProducer.ProgressiveDecoder.access$300(this$1, paramEncodedImage, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */