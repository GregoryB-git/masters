package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.ProgressiveJpegParser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.QualityInfo;

class DecodeProducer$NetworkImagesProgressiveDecoder
  extends DecodeProducer.ProgressiveDecoder
{
  private int mLastScheduledScanNumber;
  private final ProgressiveJpegConfig mProgressiveJpegConfig;
  private final ProgressiveJpegParser mProgressiveJpegParser;
  
  public DecodeProducer$NetworkImagesProgressiveDecoder(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext, ProgressiveJpegParser paramProgressiveJpegParser, ProgressiveJpegConfig paramProgressiveJpegConfig, boolean paramBoolean)
  {
    super(paramConsumer, paramProducerContext, paramProgressiveJpegParser, bool);
    mProgressiveJpegParser = ((ProgressiveJpegParser)Preconditions.checkNotNull(paramProgressiveJpegConfig));
    mProgressiveJpegConfig = ((ProgressiveJpegConfig)Preconditions.checkNotNull(paramBoolean));
    mLastScheduledScanNumber = 0;
  }
  
  public int getIntermediateImageEndOffset(EncodedImage paramEncodedImage)
  {
    return mProgressiveJpegParser.getBestScanEndOffset();
  }
  
  public QualityInfo getQualityInfo()
  {
    return mProgressiveJpegConfig.getQualityInfo(mProgressiveJpegParser.getBestScanNumber());
  }
  
  public boolean updateDecodeJob(EncodedImage paramEncodedImage, int paramInt)
  {
    try
    {
      boolean bool1 = super.updateDecodeJob(paramEncodedImage, paramInt);
      if (((BaseConsumer.isNotLast(paramInt)) || (BaseConsumer.statusHasFlag(paramInt, 8))) && (!BaseConsumer.statusHasFlag(paramInt, 4)) && (EncodedImage.isValid(paramEncodedImage)) && (paramEncodedImage.getImageFormat() == DefaultImageFormats.JPEG))
      {
        boolean bool2 = mProgressiveJpegParser.parseMoreData(paramEncodedImage);
        if (!bool2) {
          return false;
        }
        int i = mProgressiveJpegParser.getBestScanNumber();
        paramInt = mLastScheduledScanNumber;
        if (i <= paramInt) {
          return false;
        }
        if (i < mProgressiveJpegConfig.getNextScanNumberToDecode(paramInt))
        {
          bool2 = mProgressiveJpegParser.isEndMarkerRead();
          if (!bool2) {
            return false;
          }
        }
        mLastScheduledScanNumber = i;
      }
      return bool1;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DecodeProducer.NetworkImagesProgressiveDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */