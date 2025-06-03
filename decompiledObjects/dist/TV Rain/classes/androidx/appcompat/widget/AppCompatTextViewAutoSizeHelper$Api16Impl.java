package androidx.appcompat.widget;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
final class AppCompatTextViewAutoSizeHelper$Api16Impl
{
  @DoNotInline
  @NonNull
  public static StaticLayout createStaticLayoutForMeasuring(@NonNull CharSequence paramCharSequence, @NonNull Layout.Alignment paramAlignment, int paramInt, @NonNull TextView paramTextView, @NonNull TextPaint paramTextPaint)
  {
    return new StaticLayout(paramCharSequence, paramTextPaint, paramInt, paramAlignment, paramTextView.getLineSpacingMultiplier(), paramTextView.getLineSpacingExtra(), paramTextView.getIncludeFontPadding());
  }
  
  @DoNotInline
  public static int getMaxLines(@NonNull TextView paramTextView)
  {
    return paramTextView.getMaxLines();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */