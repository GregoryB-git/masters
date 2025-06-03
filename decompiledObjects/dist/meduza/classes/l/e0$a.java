package l;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

public final class e0$a
{
  public static StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt, TextView paramTextView, TextPaint paramTextPaint)
  {
    return new StaticLayout(paramCharSequence, paramTextPaint, paramInt, paramAlignment, paramTextView.getLineSpacingMultiplier(), paramTextView.getLineSpacingExtra(), paramTextView.getIncludeFontPadding());
  }
  
  public static int b(TextView paramTextView)
  {
    return paramTextView.getMaxLines();
  }
}

/* Location:
 * Qualified Name:     l.e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */