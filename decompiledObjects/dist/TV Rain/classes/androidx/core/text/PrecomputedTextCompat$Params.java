package androidx.core.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.PrecomputedText.Params;
import android.text.PrecomputedText.Params.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import p3;
import z2;

public final class PrecomputedTextCompat$Params
{
  private final int mBreakStrategy;
  private final int mHyphenationFrequency;
  @NonNull
  private final TextPaint mPaint;
  @Nullable
  private final TextDirectionHeuristic mTextDir;
  public final PrecomputedText.Params mWrapped;
  
  @RequiresApi(28)
  public PrecomputedTextCompat$Params(@NonNull PrecomputedText.Params paramParams)
  {
    mPaint = paramParams.getTextPaint();
    mTextDir = paramParams.getTextDirection();
    mBreakStrategy = paramParams.getBreakStrategy();
    mHyphenationFrequency = paramParams.getHyphenationFrequency();
    if (Build.VERSION.SDK_INT < 29) {
      paramParams = null;
    }
    mWrapped = paramParams;
  }
  
  public PrecomputedTextCompat$Params(@NonNull TextPaint paramTextPaint, @NonNull TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      mWrapped = new PrecomputedText.Params.Builder(paramTextPaint).setBreakStrategy(paramInt1).setHyphenationFrequency(paramInt2).setTextDirection(paramTextDirectionHeuristic).build();
    } else {
      mWrapped = null;
    }
    mPaint = paramTextPaint;
    mTextDir = paramTextDirectionHeuristic;
    mBreakStrategy = paramInt1;
    mHyphenationFrequency = paramInt2;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Params)) {
      return false;
    }
    paramObject = (Params)paramObject;
    if (!equalsWithoutTextDirection((Params)paramObject)) {
      return false;
    }
    return mTextDir == ((Params)paramObject).getTextDirection();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean equalsWithoutTextDirection(@NonNull Params paramParams)
  {
    if (mBreakStrategy != paramParams.getBreakStrategy()) {
      return false;
    }
    if (mHyphenationFrequency != paramParams.getHyphenationFrequency()) {
      return false;
    }
    if (mPaint.getTextSize() != paramParams.getTextPaint().getTextSize()) {
      return false;
    }
    if (mPaint.getTextScaleX() != paramParams.getTextPaint().getTextScaleX()) {
      return false;
    }
    if (mPaint.getTextSkewX() != paramParams.getTextPaint().getTextSkewX()) {
      return false;
    }
    if (mPaint.getLetterSpacing() != paramParams.getTextPaint().getLetterSpacing()) {
      return false;
    }
    if (!TextUtils.equals(mPaint.getFontFeatureSettings(), paramParams.getTextPaint().getFontFeatureSettings())) {
      return false;
    }
    if (mPaint.getFlags() != paramParams.getTextPaint().getFlags()) {
      return false;
    }
    if (!mPaint.getTextLocales().equals(paramParams.getTextPaint().getTextLocales())) {
      return false;
    }
    if (mPaint.getTypeface() == null)
    {
      if (paramParams.getTextPaint().getTypeface() != null) {
        return false;
      }
    }
    else if (!mPaint.getTypeface().equals(paramParams.getTextPaint().getTypeface())) {
      return false;
    }
    return true;
  }
  
  @RequiresApi(23)
  public int getBreakStrategy()
  {
    return mBreakStrategy;
  }
  
  @RequiresApi(23)
  public int getHyphenationFrequency()
  {
    return mHyphenationFrequency;
  }
  
  @Nullable
  @RequiresApi(18)
  public TextDirectionHeuristic getTextDirection()
  {
    return mTextDir;
  }
  
  @NonNull
  public TextPaint getTextPaint()
  {
    return mPaint;
  }
  
  public int hashCode()
  {
    return ObjectsCompat.hash(new Object[] { Float.valueOf(mPaint.getTextSize()), Float.valueOf(mPaint.getTextScaleX()), Float.valueOf(mPaint.getTextSkewX()), Float.valueOf(mPaint.getLetterSpacing()), Integer.valueOf(mPaint.getFlags()), mPaint.getTextLocales(), mPaint.getTypeface(), Boolean.valueOf(mPaint.isElegantTextHeight()), mTextDir, Integer.valueOf(mBreakStrategy), Integer.valueOf(mHyphenationFrequency) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("{");
    StringBuilder localStringBuilder2 = z2.t("textSize=");
    localStringBuilder2.append(mPaint.getTextSize());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", textScaleX=");
    localStringBuilder2.append(mPaint.getTextScaleX());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", textSkewX=");
    localStringBuilder2.append(mPaint.getTextSkewX());
    localStringBuilder1.append(localStringBuilder2.toString());
    int i = Build.VERSION.SDK_INT;
    localStringBuilder2 = z2.t(", letterSpacing=");
    localStringBuilder2.append(mPaint.getLetterSpacing());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", elegantTextHeight=");
    localStringBuilder2.append(mPaint.isElegantTextHeight());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", textLocale=");
    localStringBuilder2.append(mPaint.getTextLocales());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", typeface=");
    localStringBuilder2.append(mPaint.getTypeface());
    localStringBuilder1.append(localStringBuilder2.toString());
    if (i >= 26)
    {
      localStringBuilder2 = z2.t(", variationSettings=");
      localStringBuilder2.append(p3.h(mPaint));
      localStringBuilder1.append(localStringBuilder2.toString());
    }
    localStringBuilder2 = z2.t(", textDir=");
    localStringBuilder2.append(mTextDir);
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", breakStrategy=");
    localStringBuilder2.append(mBreakStrategy);
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(", hyphenationFrequency=");
    localStringBuilder2.append(mHyphenationFrequency);
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder1.append("}");
    return localStringBuilder1.toString();
  }
  
  public static class Builder
  {
    private int mBreakStrategy;
    private int mHyphenationFrequency;
    @NonNull
    private final TextPaint mPaint;
    private TextDirectionHeuristic mTextDir;
    
    public Builder(@NonNull TextPaint paramTextPaint)
    {
      mPaint = paramTextPaint;
      mBreakStrategy = 1;
      mHyphenationFrequency = 1;
      mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
    
    @NonNull
    public PrecomputedTextCompat.Params build()
    {
      return new PrecomputedTextCompat.Params(mPaint, mTextDir, mBreakStrategy, mHyphenationFrequency);
    }
    
    @RequiresApi(23)
    public Builder setBreakStrategy(int paramInt)
    {
      mBreakStrategy = paramInt;
      return this;
    }
    
    @RequiresApi(23)
    public Builder setHyphenationFrequency(int paramInt)
    {
      mHyphenationFrequency = paramInt;
      return this;
    }
    
    @RequiresApi(18)
    public Builder setTextDirection(@NonNull TextDirectionHeuristic paramTextDirectionHeuristic)
    {
      mTextDir = paramTextDirectionHeuristic;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat.Params
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */