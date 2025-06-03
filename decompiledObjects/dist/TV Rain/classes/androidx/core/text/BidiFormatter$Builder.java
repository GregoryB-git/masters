package androidx.core.text;

import java.util.Locale;

public final class BidiFormatter$Builder
{
  private int mFlags;
  private boolean mIsRtlContext;
  private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;
  
  public BidiFormatter$Builder()
  {
    initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
  }
  
  public BidiFormatter$Builder(Locale paramLocale)
  {
    initialize(BidiFormatter.isRtlLocale(paramLocale));
  }
  
  public BidiFormatter$Builder(boolean paramBoolean)
  {
    initialize(paramBoolean);
  }
  
  private static BidiFormatter getDefaultInstanceFromContext(boolean paramBoolean)
  {
    BidiFormatter localBidiFormatter;
    if (paramBoolean) {
      localBidiFormatter = BidiFormatter.DEFAULT_RTL_INSTANCE;
    } else {
      localBidiFormatter = BidiFormatter.DEFAULT_LTR_INSTANCE;
    }
    return localBidiFormatter;
  }
  
  private void initialize(boolean paramBoolean)
  {
    mIsRtlContext = paramBoolean;
    mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
    mFlags = 2;
  }
  
  public BidiFormatter build()
  {
    if ((mFlags == 2) && (mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC)) {
      return getDefaultInstanceFromContext(mIsRtlContext);
    }
    return new BidiFormatter(mIsRtlContext, mFlags, mTextDirectionHeuristicCompat);
  }
  
  public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat paramTextDirectionHeuristicCompat)
  {
    mTextDirectionHeuristicCompat = paramTextDirectionHeuristicCompat;
    return this;
  }
  
  public Builder stereoReset(boolean paramBoolean)
  {
    if (paramBoolean) {
      mFlags |= 0x2;
    } else {
      mFlags &= 0xFFFFFFFD;
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.BidiFormatter.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */