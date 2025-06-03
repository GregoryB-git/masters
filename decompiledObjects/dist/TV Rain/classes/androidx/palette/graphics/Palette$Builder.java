package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import java.util.ArrayList;
import java.util.List;

public final class Palette$Builder
{
  @Nullable
  private final Bitmap mBitmap;
  private final List<Palette.Filter> mFilters;
  private int mMaxColors;
  @Nullable
  private Rect mRegion;
  private int mResizeArea;
  private int mResizeMaxDimension;
  @Nullable
  private final List<Palette.Swatch> mSwatches;
  private final List<Target> mTargets;
  
  public Palette$Builder(@NonNull Bitmap paramBitmap)
  {
    ArrayList localArrayList1 = new ArrayList();
    mTargets = localArrayList1;
    mMaxColors = 16;
    mResizeArea = 12544;
    mResizeMaxDimension = -1;
    ArrayList localArrayList2 = new ArrayList();
    mFilters = localArrayList2;
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      localArrayList2.add(Palette.DEFAULT_FILTER);
      mBitmap = paramBitmap;
      mSwatches = null;
      localArrayList1.add(Target.LIGHT_VIBRANT);
      localArrayList1.add(Target.VIBRANT);
      localArrayList1.add(Target.DARK_VIBRANT);
      localArrayList1.add(Target.LIGHT_MUTED);
      localArrayList1.add(Target.MUTED);
      localArrayList1.add(Target.DARK_MUTED);
      return;
    }
    throw new IllegalArgumentException("Bitmap is not valid");
  }
  
  public Palette$Builder(@NonNull List<Palette.Swatch> paramList)
  {
    mTargets = new ArrayList();
    mMaxColors = 16;
    mResizeArea = 12544;
    mResizeMaxDimension = -1;
    ArrayList localArrayList = new ArrayList();
    mFilters = localArrayList;
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      localArrayList.add(Palette.DEFAULT_FILTER);
      mSwatches = paramList;
      mBitmap = null;
      return;
    }
    throw new IllegalArgumentException("List of Swatches is not valid");
  }
  
  private int[] getPixelsFromBitmap(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramBitmap.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
    paramBitmap = mRegion;
    if (paramBitmap == null) {
      return arrayOfInt;
    }
    int k = paramBitmap.width();
    int m = mRegion.height();
    paramBitmap = new int[k * m];
    for (j = 0; j < m; j++)
    {
      Rect localRect = mRegion;
      System.arraycopy(arrayOfInt, (top + j) * i + left, paramBitmap, j * k, k);
    }
    return paramBitmap;
  }
  
  private Bitmap scaleBitmapDown(Bitmap paramBitmap)
  {
    int i = mResizeArea;
    double d1 = -1.0D;
    int j;
    double d2;
    if (i > 0)
    {
      i = paramBitmap.getWidth();
      i = paramBitmap.getHeight() * i;
      j = mResizeArea;
      d2 = d1;
      if (i > j) {
        d2 = Math.sqrt(j / i);
      }
    }
    else
    {
      d2 = d1;
      if (mResizeMaxDimension > 0)
      {
        i = Math.max(paramBitmap.getWidth(), paramBitmap.getHeight());
        j = mResizeMaxDimension;
        d2 = d1;
        if (i > j) {
          d2 = j / i;
        }
      }
    }
    if (d2 <= 0.0D) {
      return paramBitmap;
    }
    return Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d2), (int)Math.ceil(paramBitmap.getHeight() * d2), false);
  }
  
  @NonNull
  public Builder addFilter(Palette.Filter paramFilter)
  {
    if (paramFilter != null) {
      mFilters.add(paramFilter);
    }
    return this;
  }
  
  @NonNull
  public Builder addTarget(@NonNull Target paramTarget)
  {
    if (!mTargets.contains(paramTarget)) {
      mTargets.add(paramTarget);
    }
    return this;
  }
  
  @NonNull
  public Builder clearFilters()
  {
    mFilters.clear();
    return this;
  }
  
  @NonNull
  public Builder clearRegion()
  {
    mRegion = null;
    return this;
  }
  
  @NonNull
  public Builder clearTargets()
  {
    List localList = mTargets;
    if (localList != null) {
      localList.clear();
    }
    return this;
  }
  
  @NonNull
  public AsyncTask<Bitmap, Void, Palette> generate(@NonNull final Palette.PaletteAsyncListener paramPaletteAsyncListener)
  {
    if (paramPaletteAsyncListener != null) {
      new AsyncTask()
      {
        @Nullable
        public Palette doInBackground(Bitmap... paramAnonymousVarArgs)
        {
          try
          {
            paramAnonymousVarArgs = generate();
            return paramAnonymousVarArgs;
          }
          catch (Exception paramAnonymousVarArgs)
          {
            Log.e("Palette", "Exception thrown during async generate", paramAnonymousVarArgs);
          }
          return null;
        }
        
        public void onPostExecute(@Nullable Palette paramAnonymousPalette)
        {
          paramPaletteAsyncListener.onGenerated(paramAnonymousPalette);
        }
      }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[] { mBitmap });
    }
    throw new IllegalArgumentException("listener can not be null");
  }
  
  @NonNull
  public Palette generate()
  {
    Object localObject = mBitmap;
    if (localObject != null)
    {
      Bitmap localBitmap = scaleBitmapDown((Bitmap)localObject);
      localObject = mRegion;
      if ((localBitmap != mBitmap) && (localObject != null))
      {
        double d = localBitmap.getWidth() / mBitmap.getWidth();
        left = ((int)Math.floor(left * d));
        top = ((int)Math.floor(top * d));
        right = Math.min((int)Math.ceil(right * d), localBitmap.getWidth());
        bottom = Math.min((int)Math.ceil(bottom * d), localBitmap.getHeight());
      }
      int[] arrayOfInt = getPixelsFromBitmap(localBitmap);
      int i = mMaxColors;
      if (mFilters.isEmpty())
      {
        localObject = null;
      }
      else
      {
        localObject = mFilters;
        localObject = (Palette.Filter[])((List)localObject).toArray(new Palette.Filter[((List)localObject).size()]);
      }
      localObject = new ColorCutQuantizer(arrayOfInt, i, (Palette.Filter[])localObject);
      if (localBitmap != mBitmap) {
        localBitmap.recycle();
      }
      localObject = ((ColorCutQuantizer)localObject).getQuantizedColors();
    }
    else
    {
      localObject = mSwatches;
      if (localObject == null) {
        break label236;
      }
    }
    localObject = new Palette((List)localObject, mTargets);
    ((Palette)localObject).generate();
    return (Palette)localObject;
    label236:
    throw new AssertionError();
  }
  
  @NonNull
  public Builder maximumColorCount(int paramInt)
  {
    mMaxColors = paramInt;
    return this;
  }
  
  @NonNull
  public Builder resizeBitmapArea(int paramInt)
  {
    mResizeArea = paramInt;
    mResizeMaxDimension = -1;
    return this;
  }
  
  @Deprecated
  @NonNull
  public Builder resizeBitmapSize(int paramInt)
  {
    mResizeMaxDimension = paramInt;
    mResizeArea = -1;
    return this;
  }
  
  @NonNull
  public Builder setRegion(@Px int paramInt1, @Px int paramInt2, @Px int paramInt3, @Px int paramInt4)
  {
    if (mBitmap != null)
    {
      if (mRegion == null) {
        mRegion = new Rect();
      }
      mRegion.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
      if (!mRegion.intersect(paramInt1, paramInt2, paramInt3, paramInt4)) {
        throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
      }
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Palette.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */