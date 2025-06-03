package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
class BitmapCompat$Api29Impl
{
  @DoNotInline
  public static void setPaintBlendMode(Paint paramPaint)
  {
    paramPaint.setBlendMode(BlendMode.SRC);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.BitmapCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */