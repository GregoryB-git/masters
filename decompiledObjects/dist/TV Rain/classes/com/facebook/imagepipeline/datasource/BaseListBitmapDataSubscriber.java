package com.facebook.imagepipeline.datasource;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseListBitmapDataSubscriber
  extends BaseDataSubscriber<List<CloseableReference<CloseableImage>>>
{
  public void onNewResultImpl(DataSource<List<CloseableReference<CloseableImage>>> paramDataSource)
  {
    if (!paramDataSource.isFinished()) {
      return;
    }
    paramDataSource = (List)paramDataSource.getResult();
    if (paramDataSource == null)
    {
      onNewResultListImpl(null);
      return;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramDataSource.size());
      Iterator localIterator = paramDataSource.iterator();
      while (localIterator.hasNext())
      {
        CloseableReference localCloseableReference = (CloseableReference)localIterator.next();
        if ((localCloseableReference != null) && ((localCloseableReference.get() instanceof CloseableBitmap))) {
          localArrayList.add(((CloseableBitmap)localCloseableReference.get()).getUnderlyingBitmap());
        } else {
          localArrayList.add(null);
        }
      }
      onNewResultListImpl(localArrayList);
      return;
    }
    finally
    {
      paramDataSource = paramDataSource.iterator();
      while (paramDataSource.hasNext()) {
        CloseableReference.closeSafely((CloseableReference)paramDataSource.next());
      }
    }
  }
  
  public abstract void onNewResultListImpl(List<Bitmap> paramList);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.datasource.BaseListBitmapDataSubscriber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */