package com.facebook.drawee.backends.pipeline;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.OrientedDrawable;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

class PipelineDraweeController$1
  implements DrawableFactory
{
  public PipelineDraweeController$1(PipelineDraweeController paramPipelineDraweeController) {}
  
  public Drawable createDrawable(CloseableImage paramCloseableImage)
  {
    if ((paramCloseableImage instanceof CloseableStaticBitmap))
    {
      paramCloseableImage = (CloseableStaticBitmap)paramCloseableImage;
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(PipelineDraweeController.access$000(this$0), paramCloseableImage.getUnderlyingBitmap());
      if ((!PipelineDraweeController.access$100(paramCloseableImage)) && (!PipelineDraweeController.access$200(paramCloseableImage))) {
        return localBitmapDrawable;
      }
      return new OrientedDrawable(localBitmapDrawable, paramCloseableImage.getRotationAngle(), paramCloseableImage.getExifOrientation());
    }
    if ((PipelineDraweeController.access$300(this$0) != null) && (PipelineDraweeController.access$300(this$0).supportsImageType(paramCloseableImage))) {
      return PipelineDraweeController.access$300(this$0).createDrawable(paramCloseableImage);
    }
    return null;
  }
  
  public boolean supportsImageType(CloseableImage paramCloseableImage)
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.PipelineDraweeController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */