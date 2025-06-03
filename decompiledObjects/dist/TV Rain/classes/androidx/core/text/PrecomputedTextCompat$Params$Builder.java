package androidx.core.text;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public class PrecomputedTextCompat$Params$Builder
{
  private int mBreakStrategy;
  private int mHyphenationFrequency;
  @NonNull
  private final TextPaint mPaint;
  private TextDirectionHeuristic mTextDir;
  
  public PrecomputedTextCompat$Params$Builder(@NonNull TextPaint paramTextPaint)
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

/* Location:
 * Qualified Name:     androidx.core.text.PrecomputedTextCompat.Params.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */