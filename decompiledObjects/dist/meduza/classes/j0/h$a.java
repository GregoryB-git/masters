package j0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.TextView;

public final class h$a
{
  public static int a(TextView paramTextView)
  {
    return paramTextView.getBreakStrategy();
  }
  
  public static ColorStateList b(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawableTintList();
  }
  
  public static PorterDuff.Mode c(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawableTintMode();
  }
  
  public static int d(TextView paramTextView)
  {
    return paramTextView.getHyphenationFrequency();
  }
  
  public static void e(TextView paramTextView, int paramInt)
  {
    paramTextView.setBreakStrategy(paramInt);
  }
  
  public static void f(TextView paramTextView, ColorStateList paramColorStateList)
  {
    paramTextView.setCompoundDrawableTintList(paramColorStateList);
  }
  
  public static void g(TextView paramTextView, PorterDuff.Mode paramMode)
  {
    paramTextView.setCompoundDrawableTintMode(paramMode);
  }
  
  public static void h(TextView paramTextView, int paramInt)
  {
    paramTextView.setHyphenationFrequency(paramInt);
  }
}

/* Location:
 * Qualified Name:     j0.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */