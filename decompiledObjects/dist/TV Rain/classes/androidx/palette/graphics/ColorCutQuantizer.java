package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

final class ColorCutQuantizer
{
  public static final int COMPONENT_BLUE = -1;
  public static final int COMPONENT_GREEN = -2;
  public static final int COMPONENT_RED = -3;
  private static final String LOG_TAG = "ColorCutQuantizer";
  private static final boolean LOG_TIMINGS = false;
  private static final int QUANTIZE_WORD_MASK = 31;
  private static final int QUANTIZE_WORD_WIDTH = 5;
  private static final Comparator<Vbox> VBOX_COMPARATOR_VOLUME = new Comparator()
  {
    public int compare(ColorCutQuantizer.Vbox paramAnonymousVbox1, ColorCutQuantizer.Vbox paramAnonymousVbox2)
    {
      return paramAnonymousVbox2.getVolume() - paramAnonymousVbox1.getVolume();
    }
  };
  public final int[] mColors;
  public final Palette.Filter[] mFilters;
  public final int[] mHistogram;
  public final List<Palette.Swatch> mQuantizedColors;
  private final float[] mTempHsl = new float[3];
  @Nullable
  public final TimingLogger mTimingLogger = null;
  
  public ColorCutQuantizer(int[] paramArrayOfInt, int paramInt, Palette.Filter[] paramArrayOfFilter)
  {
    mFilters = paramArrayOfFilter;
    paramArrayOfFilter = new int[32768];
    mHistogram = paramArrayOfFilter;
    int i = 0;
    for (int j = 0; j < paramArrayOfInt.length; j++)
    {
      k = quantizeFromRgb888(paramArrayOfInt[j]);
      paramArrayOfInt[j] = k;
      paramArrayOfFilter[k] += 1;
    }
    int k = 0;
    int m;
    for (j = k; k < 32768; j = m)
    {
      if ((paramArrayOfFilter[k] > 0) && (shouldIgnoreColor(k))) {
        paramArrayOfFilter[k] = 0;
      }
      m = j;
      if (paramArrayOfFilter[k] > 0) {
        m = j + 1;
      }
      k++;
    }
    paramArrayOfInt = new int[j];
    mColors = paramArrayOfInt;
    k = 0;
    for (int n = k; k < 32768; n = m)
    {
      m = n;
      if (paramArrayOfFilter[k] > 0)
      {
        paramArrayOfInt[n] = k;
        m = n + 1;
      }
      k++;
    }
    if (j <= paramInt)
    {
      mQuantizedColors = new ArrayList();
      for (paramInt = i; paramInt < j; paramInt++)
      {
        k = paramArrayOfInt[paramInt];
        mQuantizedColors.add(new Palette.Swatch(approximateToRgb888(k), paramArrayOfFilter[k]));
      }
    }
    mQuantizedColors = quantizePixels(paramInt);
  }
  
  private static int approximateToRgb888(int paramInt)
  {
    return approximateToRgb888(quantizedRed(paramInt), quantizedGreen(paramInt), quantizedBlue(paramInt));
  }
  
  public static int approximateToRgb888(int paramInt1, int paramInt2, int paramInt3)
  {
    return Color.rgb(modifyWordWidth(paramInt1, 5, 8), modifyWordWidth(paramInt2, 5, 8), modifyWordWidth(paramInt3, 5, 8));
  }
  
  private List<Palette.Swatch> generateAverageColors(Collection<Vbox> paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Palette.Swatch localSwatch = ((Vbox)paramCollection.next()).getAverageColor();
      if (!shouldIgnoreColor(localSwatch)) {
        localArrayList.add(localSwatch);
      }
    }
    return localArrayList;
  }
  
  public static void modifySignificantOctet(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j;
    if (paramInt1 != -2)
    {
      if (paramInt1 == -1) {
        while (paramInt2 <= paramInt3)
        {
          paramInt1 = paramArrayOfInt[paramInt2];
          j = quantizedBlue(paramInt1);
          i = quantizedGreen(paramInt1);
          paramArrayOfInt[paramInt2] = (quantizedRed(paramInt1) | j << 10 | i << 5);
          paramInt2++;
        }
      }
    }
    else {
      while (i <= paramInt3)
      {
        paramInt2 = paramArrayOfInt[i];
        paramInt1 = quantizedGreen(paramInt2);
        j = quantizedRed(paramInt2);
        paramArrayOfInt[i] = (quantizedBlue(paramInt2) | paramInt1 << 10 | j << 5);
        i++;
      }
    }
  }
  
  private static int modifyWordWidth(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > paramInt2) {
      paramInt1 <<= paramInt3 - paramInt2;
    } else {
      paramInt1 >>= paramInt2 - paramInt3;
    }
    return paramInt1 & (1 << paramInt3) - 1;
  }
  
  private static int quantizeFromRgb888(int paramInt)
  {
    int i = modifyWordWidth(Color.red(paramInt), 8, 5);
    int j = modifyWordWidth(Color.green(paramInt), 8, 5);
    return modifyWordWidth(Color.blue(paramInt), 8, 5) | i << 10 | j << 5;
  }
  
  private List<Palette.Swatch> quantizePixels(int paramInt)
  {
    PriorityQueue localPriorityQueue = new PriorityQueue(paramInt, VBOX_COMPARATOR_VOLUME);
    localPriorityQueue.offer(new Vbox(0, mColors.length - 1));
    splitBoxes(localPriorityQueue, paramInt);
    return generateAverageColors(localPriorityQueue);
  }
  
  public static int quantizedBlue(int paramInt)
  {
    return paramInt & 0x1F;
  }
  
  public static int quantizedGreen(int paramInt)
  {
    return paramInt >> 5 & 0x1F;
  }
  
  public static int quantizedRed(int paramInt)
  {
    return paramInt >> 10 & 0x1F;
  }
  
  private boolean shouldIgnoreColor(int paramInt)
  {
    paramInt = approximateToRgb888(paramInt);
    ColorUtils.colorToHSL(paramInt, mTempHsl);
    return shouldIgnoreColor(paramInt, mTempHsl);
  }
  
  private boolean shouldIgnoreColor(int paramInt, float[] paramArrayOfFloat)
  {
    Palette.Filter[] arrayOfFilter = mFilters;
    if ((arrayOfFilter != null) && (arrayOfFilter.length > 0))
    {
      int i = arrayOfFilter.length;
      for (int j = 0; j < i; j++) {
        if (!mFilters[j].isAllowed(paramInt, paramArrayOfFloat)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean shouldIgnoreColor(Palette.Swatch paramSwatch)
  {
    return shouldIgnoreColor(paramSwatch.getRgb(), paramSwatch.getHsl());
  }
  
  private void splitBoxes(PriorityQueue<Vbox> paramPriorityQueue, int paramInt)
  {
    while (paramPriorityQueue.size() < paramInt)
    {
      Vbox localVbox = (Vbox)paramPriorityQueue.poll();
      if ((localVbox == null) || (!localVbox.canSplit())) {
        break;
      }
      paramPriorityQueue.offer(localVbox.splitBox());
      paramPriorityQueue.offer(localVbox);
    }
  }
  
  public List<Palette.Swatch> getQuantizedColors()
  {
    return mQuantizedColors;
  }
  
  public class Vbox
  {
    private int mLowerIndex;
    private int mMaxBlue;
    private int mMaxGreen;
    private int mMaxRed;
    private int mMinBlue;
    private int mMinGreen;
    private int mMinRed;
    private int mPopulation;
    private int mUpperIndex;
    
    public Vbox(int paramInt1, int paramInt2)
    {
      mLowerIndex = paramInt1;
      mUpperIndex = paramInt2;
      fitBox();
    }
    
    public final boolean canSplit()
    {
      int i = getColorCount();
      boolean bool = true;
      if (i <= 1) {
        bool = false;
      }
      return bool;
    }
    
    public final int findSplitPoint()
    {
      int i = getLongestColorDimension();
      Object localObject = ColorCutQuantizer.this;
      int[] arrayOfInt = mColors;
      localObject = mHistogram;
      ColorCutQuantizer.modifySignificantOctet(arrayOfInt, i, mLowerIndex, mUpperIndex);
      Arrays.sort(arrayOfInt, mLowerIndex, mUpperIndex + 1);
      ColorCutQuantizer.modifySignificantOctet(arrayOfInt, i, mLowerIndex, mUpperIndex);
      int j = mPopulation / 2;
      i = mLowerIndex;
      int k = 0;
      for (;;)
      {
        int m = mUpperIndex;
        if (i > m) {
          break;
        }
        k += localObject[arrayOfInt[i]];
        if (k >= j) {
          return Math.min(m - 1, i);
        }
        i++;
      }
      return mLowerIndex;
    }
    
    public final void fitBox()
    {
      Object localObject = ColorCutQuantizer.this;
      int[] arrayOfInt = mColors;
      localObject = mHistogram;
      int i = mLowerIndex;
      int j = Integer.MAX_VALUE;
      int k = Integer.MIN_VALUE;
      int m = k;
      int n = m;
      int i1 = 0;
      int i2 = Integer.MAX_VALUE;
      int i3 = i2;
      int i4 = m;
      m = i3;
      i3 = i;
      while (i3 <= mUpperIndex)
      {
        i = arrayOfInt[i3];
        int i5 = i1 + localObject[i];
        int i6 = ColorCutQuantizer.quantizedRed(i);
        int i7 = ColorCutQuantizer.quantizedGreen(i);
        i = ColorCutQuantizer.quantizedBlue(i);
        i1 = k;
        if (i6 > k) {
          i1 = i6;
        }
        k = j;
        if (i6 < j) {
          k = i6;
        }
        i6 = i4;
        if (i7 > i4) {
          i6 = i7;
        }
        i4 = i2;
        if (i7 < i2) {
          i4 = i7;
        }
        i7 = n;
        if (i > n) {
          i7 = i;
        }
        n = m;
        if (i < m) {
          n = i;
        }
        i3++;
        j = k;
        i2 = i4;
        m = n;
        k = i1;
        i4 = i6;
        n = i7;
        i1 = i5;
      }
      mMinRed = j;
      mMaxRed = k;
      mMinGreen = i2;
      mMaxGreen = i4;
      mMinBlue = m;
      mMaxBlue = n;
      mPopulation = i1;
    }
    
    public final Palette.Swatch getAverageColor()
    {
      Object localObject = ColorCutQuantizer.this;
      int[] arrayOfInt = mColors;
      localObject = mHistogram;
      int i = mLowerIndex;
      int j = 0;
      int k = 0;
      int m = k;
      int n = m;
      while (i <= mUpperIndex)
      {
        int i1 = arrayOfInt[i];
        int i2 = localObject[i1];
        k += i2;
        j += ColorCutQuantizer.quantizedRed(i1) * i2;
        m += ColorCutQuantizer.quantizedGreen(i1) * i2;
        n += i2 * ColorCutQuantizer.quantizedBlue(i1);
        i++;
      }
      float f1 = j;
      float f2 = k;
      return new Palette.Swatch(ColorCutQuantizer.approximateToRgb888(Math.round(f1 / f2), Math.round(m / f2), Math.round(n / f2)), k);
    }
    
    public final int getColorCount()
    {
      return mUpperIndex + 1 - mLowerIndex;
    }
    
    public final int getLongestColorDimension()
    {
      int i = mMaxRed - mMinRed;
      int j = mMaxGreen - mMinGreen;
      int k = mMaxBlue - mMinBlue;
      if ((i >= j) && (i >= k)) {
        return -3;
      }
      if ((j >= i) && (j >= k)) {
        return -2;
      }
      return -1;
    }
    
    public final int getVolume()
    {
      int i = mMaxRed;
      int j = mMinRed;
      int k = mMaxGreen;
      int m = mMinGreen;
      return (mMaxBlue - mMinBlue + 1) * ((k - m + 1) * (i - j + 1));
    }
    
    public final Vbox splitBox()
    {
      if (canSplit())
      {
        int i = findSplitPoint();
        Vbox localVbox = new Vbox(ColorCutQuantizer.this, i + 1, mUpperIndex);
        mUpperIndex = i;
        fitBox();
        return localVbox;
      }
      throw new IllegalStateException("Can not split a box with only 1 color");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.ColorCutQuantizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */