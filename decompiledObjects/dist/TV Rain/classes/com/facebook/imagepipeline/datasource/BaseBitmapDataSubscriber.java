package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import javax.annotation.Nullable;

public abstract class BaseBitmapDataSubscriber
  extends BaseDataSubscriber<CloseableReference<CloseableImage>>
{
  public abstract void onNewResultImpl(@Nullable Bitmap paramBitmap);
  
  public void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> paramDataSource)
  {
    if (!paramDataSource.isFinished()) {
      return;
    }
    CloseableReference localCloseableReference = (CloseableReference)paramDataSource.getResult();
    Object localObject = null;
    paramDataSource = (DataSource<CloseableReference<CloseableImage>>)localObject;
    if (localCloseableReference != null)
    {
      paramDataSource = (DataSource<CloseableReference<CloseableImage>>)localObject;
      if ((localCloseableReference.get() instanceof CloseableBitmap)) {
        paramDataSource = ((CloseableBitmap)localCloseableReference.get()).getUnderlyingBitmap();
      }
    }
    try
    {
      onNewResultImpl(paramDataSource);
      return;
    }
    finally
    {
      CloseableReference.closeSafely(localCloseableReference);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */