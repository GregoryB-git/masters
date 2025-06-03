package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.MediaVariations.Variant;
import java.util.Comparator;

@VisibleForTesting
class MediaVariationsFallbackProducer$VariantComparator
  implements Comparator<MediaVariations.Variant>
{
  private final ResizeOptions mResizeOptions;
  
  public MediaVariationsFallbackProducer$VariantComparator(ResizeOptions paramResizeOptions)
  {
    mResizeOptions = paramResizeOptions;
  }
  
  public int compare(MediaVariations.Variant paramVariant1, MediaVariations.Variant paramVariant2)
  {
    boolean bool1 = MediaVariationsFallbackProducer.access$300(paramVariant1, mResizeOptions);
    boolean bool2 = MediaVariationsFallbackProducer.access$300(paramVariant2, mResizeOptions);
    if ((bool1) && (bool2)) {
      return paramVariant1.getWidth() - paramVariant2.getWidth();
    }
    if (bool1) {
      return -1;
    }
    if (bool2) {
      return 1;
    }
    return paramVariant2.getWidth() - paramVariant1.getWidth();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer.VariantComparator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */