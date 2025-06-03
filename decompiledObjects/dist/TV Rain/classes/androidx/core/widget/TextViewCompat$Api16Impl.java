package androidx.core.widget;

import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class TextViewCompat$Api16Impl
{
  @DoNotInline
  public static boolean getIncludeFontPadding(TextView paramTextView)
  {
    return paramTextView.getIncludeFontPadding();
  }
  
  @DoNotInline
  public static int getMaxLines(TextView paramTextView)
  {
    return paramTextView.getMaxLines();
  }
  
  @DoNotInline
  public static int getMinLines(TextView paramTextView)
  {
    return paramTextView.getMinLines();
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */