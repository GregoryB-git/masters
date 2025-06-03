package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import o3;

@RequiresApi(29)
class PaintCompat$Api29Impl
{
  @DoNotInline
  public static void setBlendMode(Paint paramPaint, Object paramObject)
  {
    o3.v(paramPaint, (BlendMode)paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PaintCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */