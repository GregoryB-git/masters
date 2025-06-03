package l;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

public final class e0$c
{
  public static StaticLayout a(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2, TextView paramTextView, TextPaint paramTextPaint, e0.f paramf)
  {
    paramCharSequence = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), paramTextPaint, paramInt1);
    paramAlignment = paramCharSequence.setAlignment(paramAlignment).setLineSpacing(paramTextView.getLineSpacingExtra(), paramTextView.getLineSpacingMultiplier()).setIncludePad(paramTextView.getIncludeFontPadding()).setBreakStrategy(paramTextView.getBreakStrategy()).setHyphenationFrequency(paramTextView.getHyphenationFrequency());
    paramInt1 = paramInt2;
    if (paramInt2 == -1) {
      paramInt1 = Integer.MAX_VALUE;
    }
    paramAlignment.setMaxLines(paramInt1);
    try
    {
      paramf.a(paramCharSequence, paramTextView);
    }
    catch (ClassCastException paramAlignment)
    {
      Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
    }
    return paramCharSequence.build();
  }
}

/* Location:
 * Qualified Name:     l.e0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */