package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Palette
{
  public static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
  public static final Filter DEFAULT_FILTER = new Filter()
  {
    private static final float BLACK_MAX_LIGHTNESS = 0.05F;
    private static final float WHITE_MIN_LIGHTNESS = 0.95F;
    
    private boolean isBlack(float[] paramAnonymousArrayOfFloat)
    {
      boolean bool;
      if (paramAnonymousArrayOfFloat[2] <= 0.05F) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean isNearRedILine(float[] paramAnonymousArrayOfFloat)
    {
      boolean bool1 = false;
      float f = paramAnonymousArrayOfFloat[0];
      boolean bool2 = bool1;
      if (f >= 10.0F)
      {
        bool2 = bool1;
        if (f <= 37.0F)
        {
          bool2 = bool1;
          if (paramAnonymousArrayOfFloat[1] <= 0.82F) {
            bool2 = true;
          }
        }
      }
      return bool2;
    }
    
    private boolean isWhite(float[] paramAnonymousArrayOfFloat)
    {
      boolean bool;
      if (paramAnonymousArrayOfFloat[2] >= 0.95F) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isAllowed(int paramAnonymousInt, float[] paramAnonymousArrayOfFloat)
    {
      boolean bool;
      if ((!isWhite(paramAnonymousArrayOfFloat)) && (!isBlack(paramAnonymousArrayOfFloat)) && (!isNearRedILine(paramAnonymousArrayOfFloat))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  };
  public static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
  public static final String LOG_TAG = "Palette";
  public static final boolean LOG_TIMINGS = false;
  public static final float MIN_CONTRAST_BODY_TEXT = 4.5F;
  public static final float MIN_CONTRAST_TITLE_TEXT = 3.0F;
  @Nullable
  private final Swatch mDominantSwatch;
  private final Map<Target, Swatch> mSelectedSwatches;
  private final List<Swatch> mSwatches;
  private final List<Target> mTargets;
  private final SparseBooleanArray mUsedColors;
  
  public Palette(List<Swatch> paramList, List<Target> paramList1)
  {
    mSwatches = paramList;
    mTargets = paramList1;
    mUsedColors = new SparseBooleanArray();
    mSelectedSwatches = new ArrayMap();
    mDominantSwatch = findDominantSwatch();
  }
  
  @Nullable
  private Swatch findDominantSwatch()
  {
    int i = mSwatches.size();
    int j = Integer.MIN_VALUE;
    Object localObject = null;
    int k = 0;
    while (k < i)
    {
      Swatch localSwatch = (Swatch)mSwatches.get(k);
      int m = j;
      if (localSwatch.getPopulation() > j)
      {
        m = localSwatch.getPopulation();
        localObject = localSwatch;
      }
      k++;
      j = m;
    }
    return (Swatch)localObject;
  }
  
  @NonNull
  public static Builder from(@NonNull Bitmap paramBitmap)
  {
    return new Builder(paramBitmap);
  }
  
  @NonNull
  public static Palette from(@NonNull List<Swatch> paramList)
  {
    return new Builder(paramList).generate();
  }
  
  @Deprecated
  public static Palette generate(Bitmap paramBitmap)
  {
    return from(paramBitmap).generate();
  }
  
  @Deprecated
  public static Palette generate(Bitmap paramBitmap, int paramInt)
  {
    return from(paramBitmap).maximumColorCount(paramInt).generate();
  }
  
  @Deprecated
  public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap paramBitmap, int paramInt, PaletteAsyncListener paramPaletteAsyncListener)
  {
    return from(paramBitmap).maximumColorCount(paramInt).generate(paramPaletteAsyncListener);
  }
  
  @Deprecated
  public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap paramBitmap, PaletteAsyncListener paramPaletteAsyncListener)
  {
    return from(paramBitmap).generate(paramPaletteAsyncListener);
  }
  
  private float generateScore(Swatch paramSwatch, Target paramTarget)
  {
    float[] arrayOfFloat = paramSwatch.getHsl();
    Swatch localSwatch = mDominantSwatch;
    int i;
    if (localSwatch != null) {
      i = localSwatch.getPopulation();
    } else {
      i = 1;
    }
    float f1 = paramTarget.getSaturationWeight();
    float f2 = 0.0F;
    if (f1 > 0.0F)
    {
      f1 = paramTarget.getSaturationWeight();
      f1 = (1.0F - Math.abs(arrayOfFloat[1] - paramTarget.getTargetSaturation())) * f1;
    }
    else
    {
      f1 = 0.0F;
    }
    float f3;
    if (paramTarget.getLightnessWeight() > 0.0F)
    {
      f3 = paramTarget.getLightnessWeight();
      f3 = (1.0F - Math.abs(arrayOfFloat[2] - paramTarget.getTargetLightness())) * f3;
    }
    else
    {
      f3 = 0.0F;
    }
    if (paramTarget.getPopulationWeight() > 0.0F)
    {
      f2 = paramTarget.getPopulationWeight();
      f2 = paramSwatch.getPopulation() / i * f2;
    }
    return f1 + f3 + f2;
  }
  
  @Nullable
  private Swatch generateScoredTarget(Target paramTarget)
  {
    Swatch localSwatch = getMaxScoredSwatchForTarget(paramTarget);
    if ((localSwatch != null) && (paramTarget.isExclusive())) {
      mUsedColors.append(localSwatch.getRgb(), true);
    }
    return localSwatch;
  }
  
  @Nullable
  private Swatch getMaxScoredSwatchForTarget(Target paramTarget)
  {
    int i = mSwatches.size();
    float f1 = 0.0F;
    Object localObject1 = null;
    int j = 0;
    while (j < i)
    {
      Swatch localSwatch = (Swatch)mSwatches.get(j);
      float f2 = f1;
      Object localObject2 = localObject1;
      if (shouldBeScoredForTarget(localSwatch, paramTarget))
      {
        float f3 = generateScore(localSwatch, paramTarget);
        if (localObject1 != null)
        {
          f2 = f1;
          localObject2 = localObject1;
          if (f3 <= f1) {}
        }
        else
        {
          localObject2 = localSwatch;
          f2 = f3;
        }
      }
      j++;
      f1 = f2;
      localObject1 = localObject2;
    }
    return (Swatch)localObject1;
  }
  
  private boolean shouldBeScoredForTarget(Swatch paramSwatch, Target paramTarget)
  {
    float[] arrayOfFloat = paramSwatch.getHsl();
    boolean bool = true;
    if ((arrayOfFloat[1] < paramTarget.getMinimumSaturation()) || (arrayOfFloat[1] > paramTarget.getMaximumSaturation()) || (arrayOfFloat[2] < paramTarget.getMinimumLightness()) || (arrayOfFloat[2] > paramTarget.getMaximumLightness()) || (mUsedColors.get(paramSwatch.getRgb()))) {
      bool = false;
    }
    return bool;
  }
  
  public void generate()
  {
    int i = mTargets.size();
    for (int j = 0; j < i; j++)
    {
      Target localTarget = (Target)mTargets.get(j);
      localTarget.normalizeWeights();
      mSelectedSwatches.put(localTarget, generateScoredTarget(localTarget));
    }
    mUsedColors.clear();
  }
  
  @ColorInt
  public int getColorForTarget(@NonNull Target paramTarget, @ColorInt int paramInt)
  {
    paramTarget = getSwatchForTarget(paramTarget);
    if (paramTarget != null) {
      paramInt = paramTarget.getRgb();
    }
    return paramInt;
  }
  
  @ColorInt
  public int getDarkMutedColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.DARK_MUTED, paramInt);
  }
  
  @Nullable
  public Swatch getDarkMutedSwatch()
  {
    return getSwatchForTarget(Target.DARK_MUTED);
  }
  
  @ColorInt
  public int getDarkVibrantColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.DARK_VIBRANT, paramInt);
  }
  
  @Nullable
  public Swatch getDarkVibrantSwatch()
  {
    return getSwatchForTarget(Target.DARK_VIBRANT);
  }
  
  @ColorInt
  public int getDominantColor(@ColorInt int paramInt)
  {
    Swatch localSwatch = mDominantSwatch;
    if (localSwatch != null) {
      paramInt = localSwatch.getRgb();
    }
    return paramInt;
  }
  
  @Nullable
  public Swatch getDominantSwatch()
  {
    return mDominantSwatch;
  }
  
  @ColorInt
  public int getLightMutedColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.LIGHT_MUTED, paramInt);
  }
  
  @Nullable
  public Swatch getLightMutedSwatch()
  {
    return getSwatchForTarget(Target.LIGHT_MUTED);
  }
  
  @ColorInt
  public int getLightVibrantColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.LIGHT_VIBRANT, paramInt);
  }
  
  @Nullable
  public Swatch getLightVibrantSwatch()
  {
    return getSwatchForTarget(Target.LIGHT_VIBRANT);
  }
  
  @ColorInt
  public int getMutedColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.MUTED, paramInt);
  }
  
  @Nullable
  public Swatch getMutedSwatch()
  {
    return getSwatchForTarget(Target.MUTED);
  }
  
  @Nullable
  public Swatch getSwatchForTarget(@NonNull Target paramTarget)
  {
    return (Swatch)mSelectedSwatches.get(paramTarget);
  }
  
  @NonNull
  public List<Swatch> getSwatches()
  {
    return Collections.unmodifiableList(mSwatches);
  }
  
  @NonNull
  public List<Target> getTargets()
  {
    return Collections.unmodifiableList(mTargets);
  }
  
  @ColorInt
  public int getVibrantColor(@ColorInt int paramInt)
  {
    return getColorForTarget(Target.VIBRANT, paramInt);
  }
  
  @Nullable
  public Swatch getVibrantSwatch()
  {
    return getSwatchForTarget(Target.VIBRANT);
  }
  
  public static final class Builder
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
    
    public Builder(@NonNull Bitmap paramBitmap)
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
    
    public Builder(@NonNull List<Palette.Swatch> paramList)
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
  
  public static abstract interface Filter
  {
    public abstract boolean isAllowed(@ColorInt int paramInt, @NonNull float[] paramArrayOfFloat);
  }
  
  public static abstract interface PaletteAsyncListener
  {
    public abstract void onGenerated(@Nullable Palette paramPalette);
  }
  
  public static final class Swatch
  {
    private final int mBlue;
    private int mBodyTextColor;
    private boolean mGeneratedTextColors;
    private final int mGreen;
    @Nullable
    private float[] mHsl;
    private final int mPopulation;
    private final int mRed;
    private final int mRgb;
    private int mTitleTextColor;
    
    public Swatch(@ColorInt int paramInt1, int paramInt2)
    {
      mRed = Color.red(paramInt1);
      mGreen = Color.green(paramInt1);
      mBlue = Color.blue(paramInt1);
      mRgb = paramInt1;
      mPopulation = paramInt2;
    }
    
    public Swatch(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      mRed = paramInt1;
      mGreen = paramInt2;
      mBlue = paramInt3;
      mRgb = Color.rgb(paramInt1, paramInt2, paramInt3);
      mPopulation = paramInt4;
    }
    
    public Swatch(float[] paramArrayOfFloat, int paramInt)
    {
      this(ColorUtils.HSLToColor(paramArrayOfFloat), paramInt);
      mHsl = paramArrayOfFloat;
    }
    
    private void ensureTextColorsGenerated()
    {
      if (!mGeneratedTextColors)
      {
        int i = ColorUtils.calculateMinimumAlpha(-1, mRgb, 4.5F);
        int j = ColorUtils.calculateMinimumAlpha(-1, mRgb, 3.0F);
        if ((i != -1) && (j != -1))
        {
          mBodyTextColor = ColorUtils.setAlphaComponent(-1, i);
          mTitleTextColor = ColorUtils.setAlphaComponent(-1, j);
          mGeneratedTextColors = true;
          return;
        }
        int k = ColorUtils.calculateMinimumAlpha(-16777216, mRgb, 4.5F);
        int m = ColorUtils.calculateMinimumAlpha(-16777216, mRgb, 3.0F);
        if ((k != -1) && (m != -1))
        {
          mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, k);
          mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, m);
          mGeneratedTextColors = true;
          return;
        }
        if (i != -1) {
          k = ColorUtils.setAlphaComponent(-1, i);
        } else {
          k = ColorUtils.setAlphaComponent(-16777216, k);
        }
        mBodyTextColor = k;
        if (j != -1) {
          k = ColorUtils.setAlphaComponent(-1, j);
        } else {
          k = ColorUtils.setAlphaComponent(-16777216, m);
        }
        mTitleTextColor = k;
        mGeneratedTextColors = true;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (Swatch.class == paramObject.getClass()))
      {
        paramObject = (Swatch)paramObject;
        if ((mPopulation != mPopulation) || (mRgb != mRgb)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    @ColorInt
    public int getBodyTextColor()
    {
      ensureTextColorsGenerated();
      return mBodyTextColor;
    }
    
    @NonNull
    public float[] getHsl()
    {
      if (mHsl == null) {
        mHsl = new float[3];
      }
      ColorUtils.RGBToHSL(mRed, mGreen, mBlue, mHsl);
      return mHsl;
    }
    
    public int getPopulation()
    {
      return mPopulation;
    }
    
    @ColorInt
    public int getRgb()
    {
      return mRgb;
    }
    
    @ColorInt
    public int getTitleTextColor()
    {
      ensureTextColorsGenerated();
      return mTitleTextColor;
    }
    
    public int hashCode()
    {
      return mRgb * 31 + mPopulation;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(Swatch.class.getSimpleName());
      localStringBuilder.append(" [RGB: #");
      localStringBuilder.append(Integer.toHexString(getRgb()));
      localStringBuilder.append(']');
      localStringBuilder.append(" [HSL: ");
      localStringBuilder.append(Arrays.toString(getHsl()));
      localStringBuilder.append(']');
      localStringBuilder.append(" [Population: ");
      localStringBuilder.append(mPopulation);
      localStringBuilder.append(']');
      localStringBuilder.append(" [Title Text: #");
      localStringBuilder.append(Integer.toHexString(getTitleTextColor()));
      localStringBuilder.append(']');
      localStringBuilder.append(" [Body Text: #");
      localStringBuilder.append(Integer.toHexString(getBodyTextColor()));
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Palette
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */