package androidx.core.graphics;

import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class PaintCompat$Api23Impl
{
  @DoNotInline
  public static boolean hasGlyph(Paint paramPaint, String paramString)
  {
    return paramPaint.hasGlyph(paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PaintCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */