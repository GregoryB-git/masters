package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imageutils.BitmapUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public class BitmapCounter
{
  @GuardedBy("this")
  private int mCount;
  private final int mMaxCount;
  private final int mMaxSize;
  @GuardedBy("this")
  private long mSize;
  private final ResourceReleaser<Bitmap> mUnpooledBitmapsReleaser;
  
  public BitmapCounter(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt2 > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    mMaxCount = paramInt1;
    mMaxSize = paramInt2;
    mUnpooledBitmapsReleaser = new ResourceReleaser()
    {
      public void release(Bitmap paramAnonymousBitmap)
      {
        try
        {
          decrease(paramAnonymousBitmap);
          return;
        }
        finally
        {
          paramAnonymousBitmap.recycle();
        }
      }
    };
  }
  
  public List<CloseableReference<Bitmap>> associateBitmapsWithBitmapCounter(List<Bitmap> paramList)
  {
    int i = 0;
    try
    {
      while (i < paramList.size()) {
        if (increase((Bitmap)paramList.get(i)))
        {
          i++;
        }
        else
        {
          localObject = new com/facebook/imagepipeline/common/TooManyBitmapsException;
          ((TooManyBitmapsException)localObject).<init>();
          throw ((Throwable)localObject);
        }
      }
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(paramList.size());
      localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        ((ArrayList)localObject).add(CloseableReference.of((Bitmap)localIterator.next(), mUnpooledBitmapsReleaser));
      }
      return (List<CloseableReference<Bitmap>>)localObject;
    }
    catch (Exception localException)
    {
      Iterator localIterator;
      if (paramList != null)
      {
        localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          paramList = (Bitmap)localIterator.next();
          if (i > 0) {
            decrease(paramList);
          }
          paramList.recycle();
          i--;
        }
      }
      throw Throwables.propagate(localException);
    }
  }
  
  public void decrease(Bitmap paramBitmap)
  {
    try
    {
      int i = BitmapUtil.getSizeInBytes(paramBitmap);
      boolean bool;
      if (mCount > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "No bitmaps registered.");
      long l = i;
      if (l <= mSize) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "Bitmap size bigger than the total registered size: %d, %d", new Object[] { Integer.valueOf(i), Long.valueOf(mSize) });
      mSize -= l;
      mCount -= 1;
      return;
    }
    finally {}
  }
  
  public int getCount()
  {
    try
    {
      int i = mCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getMaxCount()
  {
    try
    {
      int i = mMaxCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getMaxSize()
  {
    try
    {
      int i = mMaxSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public ResourceReleaser<Bitmap> getReleaser()
  {
    return mUnpooledBitmapsReleaser;
  }
  
  public long getSize()
  {
    try
    {
      long l = mSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean increase(Bitmap paramBitmap)
  {
    try
    {
      int i = BitmapUtil.getSizeInBytes(paramBitmap);
      int j = mCount;
      if (j < mMaxCount)
      {
        long l1 = mSize;
        long l2 = i;
        if (l1 + l2 <= mMaxSize)
        {
          mCount = (j + 1);
          mSize = (l1 + l2);
          return true;
        }
      }
      return false;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.BitmapCounter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */