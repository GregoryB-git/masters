package t0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;

public final class i
  extends f
{
  public i(e parame)
  {
    super(parame);
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    d.a().getClass();
    e locale = b;
    float f = paramInt4;
    paramCharSequence = b.d;
    Typeface localTypeface = paramPaint.getTypeface();
    paramPaint.setTypeface(paramCharSequence);
    paramInt1 = a;
    paramCanvas.drawText(b.b, paramInt1 * 2, 2, paramFloat, f, paramPaint);
    paramPaint.setTypeface(localTypeface);
  }
}

/* Location:
 * Qualified Name:     t0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */