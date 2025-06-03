package androidx.core.widget;

import a3;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText.Params;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class TextViewCompat$Api28Impl
{
  @DoNotInline
  public static String[] getDigitStrings(DecimalFormatSymbols paramDecimalFormatSymbols)
  {
    return a3.C(paramDecimalFormatSymbols);
  }
  
  @DoNotInline
  public static PrecomputedText.Params getTextMetricsParams(TextView paramTextView)
  {
    return a3.j(paramTextView);
  }
  
  @DoNotInline
  public static void setFirstBaselineToTopHeight(TextView paramTextView, int paramInt)
  {
    a3.x(paramTextView, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */