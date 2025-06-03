package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;

@AnyThread
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class DefaultGlyphChecker
  implements EmojiCompat.GlyphChecker
{
  private static final int PAINT_TEXT_SIZE = 10;
  private static final ThreadLocal<StringBuilder> sStringBuilder = new ThreadLocal();
  private final TextPaint mTextPaint;
  
  public DefaultGlyphChecker()
  {
    TextPaint localTextPaint = new TextPaint();
    mTextPaint = localTextPaint;
    localTextPaint.setTextSize(10.0F);
  }
  
  private static StringBuilder getStringBuilder()
  {
    ThreadLocal localThreadLocal = sStringBuilder;
    if (localThreadLocal.get() == null) {
      localThreadLocal.set(new StringBuilder());
    }
    return (StringBuilder)localThreadLocal.get();
  }
  
  public boolean hasGlyph(@NonNull CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    StringBuilder localStringBuilder = getStringBuilder();
    localStringBuilder.setLength(0);
    while (paramInt1 < paramInt2)
    {
      localStringBuilder.append(paramCharSequence.charAt(paramInt1));
      paramInt1++;
    }
    return PaintCompat.hasGlyph(mTextPaint, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.DefaultGlyphChecker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */