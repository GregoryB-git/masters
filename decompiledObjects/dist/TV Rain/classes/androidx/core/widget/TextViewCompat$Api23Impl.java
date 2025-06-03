package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class TextViewCompat$Api23Impl
{
  @DoNotInline
  public static int getBreakStrategy(TextView paramTextView)
  {
    return paramTextView.getBreakStrategy();
  }
  
  @DoNotInline
  public static ColorStateList getCompoundDrawableTintList(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawableTintList();
  }
  
  @DoNotInline
  public static PorterDuff.Mode getCompoundDrawableTintMode(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawableTintMode();
  }
  
  @DoNotInline
  public static int getHyphenationFrequency(TextView paramTextView)
  {
    return paramTextView.getHyphenationFrequency();
  }
  
  @DoNotInline
  public static void setBreakStrategy(TextView paramTextView, int paramInt)
  {
    paramTextView.setBreakStrategy(paramInt);
  }
  
  @DoNotInline
  public static void setCompoundDrawableTintList(TextView paramTextView, ColorStateList paramColorStateList)
  {
    paramTextView.setCompoundDrawableTintList(paramColorStateList);
  }
  
  @DoNotInline
  public static void setCompoundDrawableTintMode(TextView paramTextView, PorterDuff.Mode paramMode)
  {
    paramTextView.setCompoundDrawableTintMode(paramMode);
  }
  
  @DoNotInline
  public static void setHyphenationFrequency(TextView paramTextView, int paramInt)
  {
    paramTextView.setHyphenationFrequency(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */