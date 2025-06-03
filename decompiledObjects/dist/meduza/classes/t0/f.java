package t0;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import u0.c;

public abstract class f
  extends ReplacementSpan
{
  public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
  public final e b;
  public float c = 1.0F;
  
  public f(e parame)
  {
    if (parame != null)
    {
      b = parame;
      return;
    }
    throw new NullPointerException("metadata cannot be null");
  }
  
  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    paramPaint.getFontMetricsInt(a);
    paramPaint = a;
    float f = Math.abs(descent - ascent);
    paramPaint = b.c();
    paramInt1 = paramPaint.a(14);
    paramInt2 = 0;
    if (paramInt1 != 0) {
      paramInt1 = b.getShort(paramInt1 + a);
    } else {
      paramInt1 = 0;
    }
    c = (f * 1.0F / paramInt1);
    paramPaint = b.c();
    paramInt1 = paramPaint.a(14);
    if (paramInt1 != 0) {
      b.getShort(paramInt1 + a);
    }
    paramPaint = b.c();
    int i = paramPaint.a(12);
    paramInt1 = paramInt2;
    if (i != 0) {
      paramInt1 = b.getShort(i + a);
    }
    paramInt1 = (short)(int)(paramInt1 * c);
    if (paramFontMetricsInt != null)
    {
      paramPaint = a;
      ascent = ascent;
      descent = descent;
      top = top;
      bottom = bottom;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     t0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */