package androidx.palette.graphics;

import java.util.Arrays;

class ColorCutQuantizer$Vbox
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
  
  public ColorCutQuantizer$Vbox(ColorCutQuantizer paramColorCutQuantizer, int paramInt1, int paramInt2)
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
    Object localObject = this$0;
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
    Object localObject = this$0;
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
    Object localObject = this$0;
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
      Vbox localVbox = new Vbox(this$0, i + 1, mUpperIndex);
      mUpperIndex = i;
      fitBox();
      return localVbox;
    }
    throw new IllegalStateException("Can not split a box with only 1 color");
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.ColorCutQuantizer.Vbox
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */