package androidx.appcompat.widget;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
final class AppCompatTextViewAutoSizeHelper$Api23Impl
{
  @DoNotInline
  @NonNull
  public static StaticLayout createStaticLayoutForMeasuring(@NonNull CharSequence paramCharSequence, @NonNull Layout.Alignment paramAlignment, int paramInt1, int paramInt2, @NonNull TextView paramTextView, @NonNull TextPaint paramTextPaint, @NonNull AppCompatTextViewAutoSizeHelper.Impl paramImpl)
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
      paramImpl.computeAndSetTextDirection(paramCharSequence, paramTextView);
    }
    catch (ClassCastException paramAlignment)
    {
      Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
    }
    return paramCharSequence.build();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */