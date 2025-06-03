package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextPaint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class TypefaceEmojiSpan
  extends EmojiSpan
{
  @Nullable
  private static Paint sDebugPaint;
  
  public TypefaceEmojiSpan(@NonNull EmojiMetadata paramEmojiMetadata)
  {
    super(paramEmojiMetadata);
  }
  
  @NonNull
  private static Paint getDebugPaint()
  {
    if (sDebugPaint == null)
    {
      TextPaint localTextPaint = new TextPaint();
      sDebugPaint = localTextPaint;
      localTextPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
      sDebugPaint.setStyle(Paint.Style.FILL);
    }
    return sDebugPaint;
  }
  
  public void draw(@NonNull Canvas paramCanvas, @SuppressLint({"UnknownNullness"}) CharSequence paramCharSequence, @IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, @NonNull Paint paramPaint)
  {
    if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
      paramCanvas.drawRect(paramFloat, paramInt3, paramFloat + getWidth(), paramInt5, getDebugPaint());
    }
    getMetadata().draw(paramCanvas, paramFloat, paramInt4, paramPaint);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.TypefaceEmojiSpan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */