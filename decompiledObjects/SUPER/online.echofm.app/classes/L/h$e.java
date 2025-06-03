package L;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText.Params;
import android.widget.TextView;

public abstract class h$e
{
  public static String[] a(DecimalFormatSymbols paramDecimalFormatSymbols)
  {
    return paramDecimalFormatSymbols.getDigitStrings();
  }
  
  public static PrecomputedText.Params b(TextView paramTextView)
  {
    return paramTextView.getTextMetricsParams();
  }
  
  public static void c(TextView paramTextView, int paramInt)
  {
    paramTextView.setFirstBaselineToTopHeight(paramInt);
  }
}

/* Location:
 * Qualified Name:     L.h.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */